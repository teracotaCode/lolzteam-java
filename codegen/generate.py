#!/usr/bin/env python3
"""Code generator for Lolzteam Java API wrapper.

Reads OpenAPI 3.1 JSON schema and generates:
- Response model records (Java 17 records, all nullable fields)
- Enum classes for all enum-typed parameters and properties
- Client class with grouped API methods

Usage:
    python3 codegen/generate.py --schema schemas/forum.json --output-dir src/main/java/com/lolzteam/generated/forum --package com.lolzteam.generated.forum
"""

import argparse
import json
import os
import re
import textwrap
from collections import defaultdict
from pathlib import Path


def to_pascal_case(s: str) -> str:
    """Convert string to PascalCase."""
    if not s:
        return s
    # Handle dot-separated like "OAuth.Token"
    parts = re.split(r'[._\-\s/]+', s)
    result = ''.join(p.capitalize() for p in parts if p)
    return result


def to_camel_case(s: str) -> str:
    """Convert string to camelCase."""
    pascal = to_pascal_case(s)
    if not pascal:
        return pascal
    return pascal[0].lower() + pascal[1:]


def sanitize_java_name(name: str) -> str:
    """Make a string a valid Java identifier."""
    # Replace invalid chars
    name = re.sub(r'[^a-zA-Z0-9_]', '_', name)
    # Ensure doesn't start with digit
    if name and name[0].isdigit():
        name = '_' + name
    return name


JAVA_RESERVED = {
    'abstract', 'assert', 'boolean', 'break', 'byte', 'case', 'catch', 'char',
    'class', 'const', 'continue', 'default', 'do', 'double', 'else', 'enum',
    'extends', 'final', 'finally', 'float', 'for', 'goto', 'if', 'implements',
    'import', 'instanceof', 'int', 'interface', 'long', 'native', 'new',
    'package', 'private', 'protected', 'public', 'return', 'short', 'static',
    'strictfp', 'super', 'switch', 'synchronized', 'this', 'throw', 'throws',
    'transient', 'try', 'void', 'volatile', 'while', 'var', 'yield', 'record',
    'sealed', 'permits', 'non-sealed'
}


def safe_java_param(name: str) -> str:
    """Ensure name is a valid Java identifier and not a reserved word."""
    sanitized = sanitize_java_name(name)
    camel = to_camel_case(sanitized)
    # Ensure doesn't start with digit after camelCase conversion
    if camel and camel[0].isdigit():
        camel = '_' + camel
    if camel in JAVA_RESERVED:
        return camel + '_'
    if not camel:
        return '_param'
    return camel


def enum_constant_name(value) -> str:
    """Convert an enum value to a valid Java enum constant name."""
    s = str(value)
    if not s:
        return 'EMPTY'
    # Replace non-alphanumeric with underscore
    s = re.sub(r'[^a-zA-Z0-9]', '_', s)
    # Collapse multiple underscores
    s = re.sub(r'_+', '_', s).strip('_')
    # Prefix if starts with digit
    if s and s[0].isdigit():
        s = 'V_' + s
    if not s:
        s = 'UNKNOWN'
    return s.upper()


def make_enum_class_name(param_name: str, values: tuple) -> str:
    """Create a unique enum class name from parameter name and values."""
    # Clean up param name (strip [] suffix)
    clean = re.sub(r'\[\]$', '', param_name)
    return to_pascal_case(clean) + 'Enum'


# ============= Enum Collection =============

def collect_enums_from_spec(spec: dict) -> dict:
    """Collect all unique enums from the spec.
    Returns dict of enum_key -> {class_name, values, param_name, all_strings}
    enum_key is (param_name, tuple_of_sorted_str_values)
    """
    enums = {}  # key -> info

    def register_enum(param_name: str, values: list):
        key = (param_name, tuple(sorted(str(v) for v in values)))
        if key not in enums:
            cls_name = make_enum_class_name(param_name, key[1])
            # Deduplicate class names
            all_strings = all(isinstance(v, str) for v in values)
            enums[key] = {
                'class_name': cls_name,
                'values': values,
                'param_name': param_name,
                'all_strings': all_strings,
            }

    # From path parameters and request bodies
    for path, methods in spec.get('paths', {}).items():
        for method, details in methods.items():
            if method not in ('get', 'post', 'put', 'delete', 'patch'):
                continue
            for p in details.get('parameters', []):
                if '$ref' in p:
                    ref_name = p['$ref'].split('/')[-1]
                    p = spec.get('components', {}).get('parameters', {}).get(ref_name, {})
                schema = p.get('schema', {})
                if 'enum' in schema:
                    register_enum(p.get('name', ''), schema['enum'])

            rb = details.get('requestBody', {})
            for ct, cv in rb.get('content', {}).items():
                schema = cv.get('schema', {})
                if '$ref' in schema:
                    schema = resolve_ref(schema, spec)
                # Flatten oneOf/anyOf variants to find all enum properties
                all_body_props = collect_body_props(schema, spec)
                for pn, pv in all_body_props.items():
                    if 'enum' in pv:
                        register_enum(pn, pv['enum'])

    # From component schemas
    for comp_name, comp_schema in spec.get('components', {}).get('schemas', {}).items():
        for pn, pv in comp_schema.get('properties', {}).items():
            if 'enum' in pv:
                register_enum(pn, pv['enum'])

    # From component parameters
    for pn, pv in spec.get('components', {}).get('parameters', {}).items():
        schema = pv.get('schema', {})
        if 'enum' in schema:
            register_enum(pv.get('name', pn), schema['enum'])

    # Deduplicate class names — if two different enums get same class name, suffix them
    name_counts = defaultdict(list)
    for key, info in enums.items():
        name_counts[info['class_name']].append(key)
    for cls_name, keys in name_counts.items():
        if len(keys) > 1:
            for i, key in enumerate(keys):
                enums[key]['class_name'] = cls_name[:-4] + str(i + 1) + 'Enum'

    return enums


def generate_enum_class(enum_info: dict, package: str) -> str:
    """Generate a Java enum class."""
    cls_name = enum_info['class_name']
    values = enum_info['values']
    param_name = enum_info['param_name']

    lines = []
    lines.append(f'package {package}.enums;')
    lines.append('')
    lines.append('import com.fasterxml.jackson.annotation.JsonCreator;')
    lines.append('import com.fasterxml.jackson.annotation.JsonFormat;')
    lines.append('import com.fasterxml.jackson.annotation.JsonProperty;')
    lines.append('import com.fasterxml.jackson.annotation.JsonValue;')
    lines.append('')
    lines.append('/**')
    lines.append(f' * Enum for the <code>{param_name}</code> parameter.')
    lines.append(f' *')
    lines.append(f' * <p>Auto-generated from OpenAPI schema.</p>')
    lines.append(' */')
    lines.append('@JsonFormat(shape = JsonFormat.Shape.STRING)')
    lines.append(f'public enum {cls_name} {{')

    # Enum constants
    seen_constants = set()
    constant_lines = []
    for v in values:
        str_val = str(v)
        const_name = enum_constant_name(v)
        # Ensure uniqueness
        original = const_name
        suffix = 2
        while const_name in seen_constants:
            const_name = original + '_' + str(suffix)
            suffix += 1
        seen_constants.add(const_name)
        constant_lines.append(f'    @JsonProperty("{str_val}") {const_name}("{str_val}")')

    lines.append(',\n'.join(constant_lines) + ';')
    lines.append('')
    lines.append('    private final String value;')
    lines.append('')
    lines.append(f'    {cls_name}(String value) {{')
    lines.append('        this.value = value;')
    lines.append('    }')
    lines.append('')
    lines.append('    /**')
    lines.append('     * Return the JSON string value of this enum constant.')
    lines.append('     *')
    lines.append('     * @return the string value')
    lines.append('     */')
    lines.append('    @JsonValue')
    lines.append('    public String getValue() { return value; }')
    lines.append('')
    lines.append('    /**')
    lines.append(f'     * Deserialize a string into a {{@link {cls_name}}} constant.')
    lines.append('     *')
    lines.append('     * @param value the JSON string value')
    lines.append(f'     * @return the matching {{@link {cls_name}}}, or {{@code null}} if unknown')
    lines.append('     */')
    lines.append('    @JsonCreator')
    lines.append(f'    public static {cls_name} fromValue(String value) {{')
    lines.append(f'        for ({cls_name} e : values()) {{')
    lines.append('            if (e.value.equals(value)) return e;')
    lines.append('        }')
    lines.append('        return null;')
    lines.append('    }')
    lines.append('')
    lines.append('    @Override')
    lines.append('    public String toString() { return value; }')
    lines.append('}')
    lines.append('')
    return '\n'.join(lines)


def find_enum_for_param(param_name: str, schema: dict, enums: dict):
    """Look up the enum info for a given parameter name + schema.
    Returns enum_info dict or None.
    """
    if 'enum' not in schema:
        return None
    key = (param_name, tuple(sorted(str(v) for v in schema['enum'])))
    return enums.get(key)


# ============= Type Mapping =============

def openapi_type_to_java(prop: dict, name_hint: str = '') -> str:
    """Map OpenAPI type to nullable Java type."""
    if '$ref' in prop:
        ref = prop['$ref']
        # e.g. #/components/schemas/ItemModel
        type_name = ref.split('/')[-1]
        return to_pascal_case(type_name)

    t = prop.get('type', '')
    if isinstance(t, list):
        # Union type like ['string', 'integer'] or ['integer', 'null']
        # Filter out null, take first
        types = [x for x in t if x != 'null']
        if types:
            t = types[0]
        else:
            return 'Object'

    if t is None:
        return 'Object'

    match t:
        case 'integer':
            # Always use Long for response models to avoid overflow on large IDs
            return 'Long'
        case 'number':
            fmt = prop.get('format', '')
            if fmt == 'float':
                return 'Float'
            return 'Double'
        case 'string':
            return 'String'
        case 'boolean':
            return 'Boolean'
        case 'array':
            items = prop.get('items', {})
            # If array items are a dynamic-dict schema, use Object
            # (PHP serializes numeric-keyed arrays unpredictably as [] or {})
            if is_dynamic_dict_schema(items):
                return 'Object'
            item_type = openapi_type_to_java(items, name_hint)
            return f'java.util.List<{item_type}>'
        case 'object':
            # Dynamic dict detection: all-numeric keys means example data, not real schema
            # Use Object (not Map) because APIs may return [] or {} for these
            if is_dynamic_dict_schema(prop):
                return 'Object'
            if prop.get('properties'):
                return 'java.util.Map<String, Object>'
            additional = prop.get('additionalProperties', {})
            if additional and isinstance(additional, dict):
                val_type = openapi_type_to_java(additional)
                return f'java.util.Map<String, {val_type}>'
            return 'java.util.Map<String, Object>'
        case _:
            return 'Object'


def openapi_type_to_java_param(schema: dict, param_name: str = '', enums: dict = None) -> str:
    """Map OpenAPI parameter schema to Java type for method params.
    If enums dict is provided and this schema has an enum, returns the enum class name.
    """
    if enums and 'enum' in schema:
        enum_info = find_enum_for_param(param_name, schema, enums)
        if enum_info:
            return enum_info['class_name']

    t = schema.get('type', '')
    if isinstance(t, list):
        types = [x for x in t if x != 'null']
        t = types[0] if types else 'string'

    if t is None:
        t = 'string'

    match t:
        case 'integer':
            fmt = schema.get('format', '')
            return 'Long' if fmt == 'int64' else 'Integer'
        case 'number':
            return 'Double'
        case 'string':
            return 'String'
        case 'boolean':
            return 'Boolean'
        case 'array':
            items = schema.get('items', {})
            item_type = openapi_type_to_java_param(items, param_name, enums)
            return f'java.util.List<{item_type}>'
        case 'object':
            return 'java.util.Map<String, String>'
        case _:
            return 'String'


def resolve_ref(schema: dict, root: dict) -> dict:
    """Resolve a $ref to the actual schema."""
    if '$ref' not in schema:
        return schema
    ref = schema['$ref']
    parts = ref.lstrip('#/').split('/')
    current = root
    for part in parts:
        current = current.get(part, {})
    return current


def collect_body_props(schema: dict, root: dict) -> dict:
    """Collect all properties from a body schema, flattening oneOf/anyOf variants."""
    props = dict(schema.get('properties', {}))
    for variant in schema.get('oneOf', []) + schema.get('anyOf', []):
        resolved = resolve_ref(variant, root) if '$ref' in variant else variant
        props.update(resolved.get('properties', {}))
    return props


def is_dynamic_dict_schema(schema: dict) -> bool:
    """Detect if an object schema has ALL numeric property keys.
    This indicates the schema was generated from example data with dynamic
    ID-keyed dictionaries, not a real typed schema.
    """
    if not isinstance(schema, dict):
        return False
    props = schema.get('properties', {})
    if not props:
        return False
    return all(re.match(r'^\d+$', k) for k in props.keys())


# Fields whose spec type doesn't match real API responses.
# Maps field name -> Java type to use.
FIELD_TYPE_OVERRIDES = {
    # float/double mismatches
    'priceWithSellerFee': 'Double',
    'roblox_credit_balance': 'Double',
    # dict/object vs other type mismatches -> Object
    'steam_bans': 'Object',
    'guarantee': 'Object',
    'cs2PremierElo': 'Object',
    'discord_nitro_type': 'Object',
    'instagram_id': 'Object',
    'socialclub_games': 'Object',
    'base_params': 'Object',
    # dict or list (PHP serialization ambiguity) -> Object
    'thread_tags': 'Object',
    'Skin': 'Object',
    'WeaponSkins': 'Object',
    'supercellBrawlers': 'Object',
    'r6Skins': 'Object',
    'tags': 'Object',
    'values': 'Object',
    # existing overrides
    'feedback_data': 'Object',
    'imap_data': 'Object',
    'restore_data': 'Object',
    'telegram_client': 'Object',
    'backgrounds': 'Object',
    'steam_full_games': 'Object',
    # Fields that can be integer/boolean/null (polymorphic)
    'autoBuyPrice': 'Object',
    # Fields that can be {} or [] (PHP empty array ambiguity)
    'calculator': 'Object',
}

def collect_response_models(spec: dict) -> dict:
    """Collect all unique response shapes and create model definitions.
    Returns dict of model_name -> {fields: [(json_name, java_type, java_name)], ...}
    """
    models = {}

    # First, collect from components/schemas
    for name, schema in spec.get('components', {}).get('schemas', {}).items():
        props = schema.get('properties', {})
        if not props:
            continue
        fields = []
        for pname, pval in props.items():
            if pname in FIELD_TYPE_OVERRIDES:
                java_type = FIELD_TYPE_OVERRIDES[pname]
            else:
                java_type = openapi_type_to_java(pval, pname)
            java_name = safe_java_param(pname)
            fields.append((pname, java_type, java_name))
        model_name = to_pascal_case(name)
        models[model_name] = {'fields': fields, 'source': 'component'}

    # Then, collect from response schemas (inline)
    for path, methods in spec.get('paths', {}).items():
        for method, details in methods.items():
            if method not in ('get', 'post', 'put', 'delete', 'patch'):
                continue
            op_id = details.get('operationId', '')
            if not op_id:
                continue

            responses = details.get('responses', {})
            for code, resp in responses.items():
                if not code.startswith('2'):
                    continue
                content = resp.get('content', {})
                for ct, cv in content.items():
                    schema = cv.get('schema', {})
                    if '$ref' in schema:
                        # Already handled
                        continue
                    props = schema.get('properties', {})
                    if not props:
                        continue

                    # Generate model name from operationId
                    model_name = to_pascal_case(op_id) + 'Response'

                    fields = []
                    for pname, pval in props.items():
                        if pname in FIELD_TYPE_OVERRIDES:
                            java_type = FIELD_TYPE_OVERRIDES[pname]
                        else:
                            java_type = openapi_type_to_java(pval, pname)
                        java_name = safe_java_param(pname)
                        fields.append((pname, java_type, java_name))

                    models[model_name] = {
                        'fields': fields,
                        'source': 'inline',
                        'operation_id': op_id
                    }

    return models


def generate_record(model_name: str, model_info: dict, package: str) -> str:
    """Generate a Java record class with Javadoc."""
    fields = model_info['fields']

    lines = []
    lines.append(f'package {package}.models;')
    lines.append('')
    lines.append('import com.fasterxml.jackson.annotation.JsonIgnoreProperties;')
    lines.append('import com.fasterxml.jackson.annotation.JsonProperty;')
    lines.append('')
    lines.append('/**')
    lines.append(f' * Response model <code>{model_name}</code>.')
    lines.append(' *')
    lines.append(' * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>')
    lines.append(' */')
    lines.append('@JsonIgnoreProperties(ignoreUnknown = true)')

    # Build record components
    components = []
    for json_name, java_type, java_name in fields:
        components.append(f'    @JsonProperty("{json_name}") {java_type} {java_name}')

    lines.append(f'public record {model_name}(')
    lines.append(',\n'.join(components))
    lines.append(') {}')
    lines.append('')

    return '\n'.join(lines)


def collect_operations(spec: dict) -> list:
    """Collect all operations grouped by tag."""
    operations = []
    component_params = spec.get('components', {}).get('parameters', {})

    for path, methods in spec.get('paths', {}).items():
        for method, details in methods.items():
            if method not in ('get', 'post', 'put', 'delete', 'patch'):
                continue

            op_id = details.get('operationId', '')
            if not op_id:
                continue

            tags = details.get('tags', ['Default'])
            tag = tags[0] if tags else 'Default'

            # Resolve parameters
            params = []
            for p in details.get('parameters', []):
                if '$ref' in p:
                    ref_name = p['$ref'].split('/')[-1]
                    resolved = component_params.get(ref_name, {})
                    params.append(resolved)
                else:
                    params.append(p)

            # Detect multipart/form-data with binary fields
            is_multipart = False
            binary_fields = set()
            rb = details.get('requestBody', {})
            rb_content = rb.get('content', {})
            if 'multipart/form-data' in rb_content:
                is_multipart = True
                mp_schema = rb_content['multipart/form-data'].get('schema', {})
                if '$ref' in mp_schema:
                    mp_schema = resolve_ref(mp_schema, spec)
                # Check both direct properties and oneOf/anyOf variants for binary fields
                all_mp_props = collect_body_props(mp_schema, spec)
                for pname, pval in all_mp_props.items():
                    if pval.get('format') == 'binary':
                        binary_fields.add(pname)

            # Request body params
            body_params = []
            is_array_body = False
            for ct, cv in rb_content.items():
                schema = cv.get('schema', {})
                if '$ref' in schema:
                    schema = resolve_ref(schema, spec)
                # Check if body schema is an array (e.g. batch endpoints)
                if schema.get('type') == 'array':
                    is_array_body = True
                    break
                # Flatten oneOf/anyOf variants to collect all properties
                all_props = collect_body_props(schema, spec)
                # Collect required fields from all variants
                all_required = set(schema.get('required', []))
                for variant in schema.get('oneOf', []) + schema.get('anyOf', []):
                    resolved_v = resolve_ref(variant, spec) if '$ref' in variant else variant
                    all_required.update(resolved_v.get('required', []))
                for pname, pval in all_props.items():
                    body_params.append({
                        'name': pname,
                        'schema': pval,
                        'in': 'body',
                        'required': False  # oneOf variants make individual fields optional
                    })

            # Determine response model
            response_model = None
            response_is_text = False
            responses = details.get('responses', {})
            resp_200 = responses.get('200', {})
            resp_200_content = resp_200.get('content', {})
            if 'text/html' in resp_200_content and 'application/json' not in resp_200_content:
                response_is_text = True
            else:
                for code, resp in responses.items():
                    if not code.startswith('2'):
                        continue
                    content = resp.get('content', {})
                    for ct, cv in content.items():
                        schema = cv.get('schema', {})
                        if '$ref' in schema:
                            ref_name = schema['$ref'].split('/')[-1]
                            response_model = to_pascal_case(ref_name)
                        elif schema.get('properties'):
                            response_model = to_pascal_case(op_id) + 'Response'
                        break
                    break

            operations.append({
                'path': path,
                'method': method,
                'operation_id': op_id,
                'tag': tag,
                'params': params,
                'body_params': body_params,
                'response_model': response_model,
                'summary': details.get('summary', ''),
                'description': details.get('description', ''),
                'is_multipart': is_multipart,
                'binary_fields': binary_fields,
                'is_array_body': is_array_body,
                'response_is_text': response_is_text,
            })

    return operations


def generate_method(op: dict, package: str, enums: dict) -> str:
    """Generate a Java method for an operation."""
    op_id = op['operation_id']
    method_name = to_camel_case(op_id)
    http_method = op['method'].upper()
    path_template = op['path']
    response_model = op['response_model']
    is_multipart = op.get('is_multipart', False)
    binary_fields = op.get('binary_fields', set())
    is_array_body = op.get('is_array_body', False)
    response_is_text = op.get('response_is_text', False)

    # Separate path params, query params, and body params
    path_params = []
    query_params = []
    for p in op['params']:
        name = p.get('name', '')
        if not name:
            continue
        schema = p.get('schema', {})
        location = p.get('in', 'query')
        required = p.get('required', False)
        java_type = openapi_type_to_java_param(schema, name, enums)
        java_name = safe_java_param(name)
        is_enum = enums and 'enum' in schema and find_enum_for_param(name, schema, enums) is not None

        param_info = {
            'name': name,
            'java_name': java_name,
            'java_type': java_type,
            'required': required,
            'location': location,
            'is_enum': is_enum,
        }

        if location == 'path':
            path_params.append(param_info)
        else:
            query_params.append(param_info)

    body_params = []
    for p in op['body_params']:
        name = p['name']
        schema = p.get('schema', {})
        # For multipart binary fields, use byte[] instead of the schema type
        if is_multipart and name in binary_fields:
            java_type = 'byte[]'
        else:
            java_type = openapi_type_to_java_param(schema, name, enums)
        java_name = safe_java_param(name)
        is_enum = enums and 'enum' in schema and find_enum_for_param(name, schema, enums) is not None
        body_params.append({
            'name': name,
            'java_name': java_name,
            'java_type': java_type,
            'required': p.get('required', False),
            'is_enum': is_enum,
            'is_binary': is_multipart and name in binary_fields,
        })

    # Build method signature
    # Required params first, then optional
    all_method_params = []
    for p in path_params:
        all_method_params.append((p['java_type'], p['java_name'], True, p.get('is_enum', False)))
    for p in sorted(query_params, key=lambda x: (not x['required'], x['java_name'])):
        all_method_params.append((p['java_type'], p['java_name'], p['required'], p.get('is_enum', False)))
    for p in sorted(body_params, key=lambda x: (not x['required'], x['java_name'])):
        all_method_params.append((p['java_type'], p['java_name'], p['required'], p.get('is_enum', False)))

    # For array body schemas, add a jobs parameter
    if is_array_body:
        all_method_params.insert(0, ('java.util.List<java.util.Map<String, Object>>', 'jobs', True, False))

    # Return type
    if response_is_text:
        return_type = 'String'
    elif response_model:
        return_type = f'{package}.models.{response_model}'
    else:
        return_type = f'{package}.models.SaveChangesResponse'

    # Javadoc
    lines = []
    desc = op.get('description') or op.get('summary') or f'{http_method} {path_template}'
    # Escape problematic javadoc chars
    desc_safe = desc.replace('&', '&amp;').replace('<', '&lt;').replace('>', '&gt;')
    lines.append(f'    /**')
    lines.append(f'     * {desc_safe}')
    lines.append(f'     *')
    lines.append(f'     * <p>{http_method} {path_template}</p>')
    for java_type, java_name, required, is_enum in all_method_params:
        req_str = ' (required)' if required else ' (optional, nullable)'
        lines.append(f'     * @param {java_name} {java_name}{req_str}')
    lines.append(f'     * @return {return_type.split(".")[-1]}')
    lines.append(f'     * @throws Exception on API or network error')
    lines.append(f'     */')

    # Method signature
    param_list = ', '.join(f'{t} {n}' for t, n, _, _ in all_method_params)
    lines.append(f'    public {return_type.split(".")[-1]} {method_name}({param_list}) throws Exception {{')

    # Build URL with path params
    lines.append(f'        String path = "{path_template}";')
    for p in path_params:
        lines.append(f'        path = path.replace("{{{p["name"]}}}", String.valueOf({p["java_name"]}));')
    lines.append(f'        String url = baseUrl + path;')

    # Build query params map
    lines.append(f'        java.util.Map<String, String> queryParams = new java.util.HashMap<>();')
    for p in query_params:
        jn = p['java_name']
        pn = p['name']
        jt = p['java_type']
        is_enum = p.get('is_enum', False)
        if jt.startswith('java.util.List'):
            lines.append(f'        if ({jn} != null) {{')
            lines.append(f'            for (int i = 0; i < {jn}.size(); i++) {{')
            lines.append(f'                queryParams.put("{pn}[" + i + "]", String.valueOf({jn}.get(i)));')
            lines.append(f'            }}')
            lines.append(f'        }}')
        elif is_enum:
            lines.append(f'        if ({jn} != null) queryParams.put("{pn}", {jn}.getValue());')
        elif jt == 'Boolean':
            lines.append(f'        if ({jn} != null) queryParams.put("{pn}", {jn} ? "1" : "0");')
        else:
            lines.append(f'        if ({jn} != null) queryParams.put("{pn}", String.valueOf({jn}));')

    has_body = http_method in ('POST', 'PUT', 'PATCH', 'DELETE')

    # Multipart handling: separate text parts from binary parts
    if is_multipart and has_body:
        text_body_params = [p for p in body_params if not p.get('is_binary', False)]
        binary_body_params = [p for p in body_params if p.get('is_binary', False)]

        lines.append(f'        java.util.Map<String, String> textParts = new java.util.HashMap<>();')
        for p in text_body_params:
            jn = p['java_name']
            pn = p['name']
            jt = p['java_type']
            is_enum = p.get('is_enum', False)
            if jt.startswith('java.util.List'):
                lines.append(f'        if ({jn} != null) {{')
                lines.append(f'            for (int i = 0; i < {jn}.size(); i++) {{')
                lines.append(f'                textParts.put("{pn}[" + i + "]", String.valueOf({jn}.get(i)));')
                lines.append(f'            }}')
                lines.append(f'        }}')
            elif is_enum:
                lines.append(f'        if ({jn} != null) textParts.put("{pn}", {jn}.getValue());')
            else:
                lines.append(f'        if ({jn} != null) textParts.put("{pn}", String.valueOf({jn}));')

        lines.append(f'        java.util.Map<String, byte[]> fileParts = new java.util.HashMap<>();')
        for p in binary_body_params:
            jn = p['java_name']
            pn = p['name']
            lines.append(f'        if ({jn} != null) fileParts.put("{pn}", {jn});')

        lines.append(f'        String response = client.postMultipart(url, null, queryParams, textParts, fileParts);')
    elif is_array_body and has_body:
        # Array body (e.g. batch endpoints)
        lines.append(f'        String response = client.postJsonRaw(url, null, queryParams, jobs);')
    elif has_body and body_params:
        lines.append(f'        java.util.Map<String, Object> body = new java.util.HashMap<>();')
        for p in body_params:
            jn = p['java_name']
            pn = p['name']
            jt = p['java_type']
            is_enum = p.get('is_enum', False)
            if jt.startswith('java.util.List'):
                lines.append(f'        if ({jn} != null) {{')
                lines.append(f'            for (int i = 0; i < {jn}.size(); i++) {{')
                lines.append(f'                body.put("{pn}[" + i + "]", String.valueOf({jn}.get(i)));')
                lines.append(f'            }}')
                lines.append(f'        }}')
            elif is_enum:
                lines.append(f'        if ({jn} != null) body.put("{pn}", {jn}.getValue());')
            else:
                # Use native types (Integer, Boolean, etc.) instead of String.valueOf()
                lines.append(f'        if ({jn} != null) body.put("{pn}", {jn});')
        # Execute request
        method_lower = http_method.lower()
        lines.append(f'        String response = client.{method_lower}(url, null, queryParams, body);')
    elif has_body and http_method != 'DELETE':
        lines.append(f'        java.util.Map<String, Object> body = java.util.Collections.emptyMap();')
        method_lower = http_method.lower()
        lines.append(f'        String response = client.{method_lower}(url, null, queryParams, body);')
    else:
        # GET or DELETE without body
        method_lower = http_method.lower()
        lines.append(f'        String response = client.{method_lower}(url, null, queryParams);')

    # Parse response
    if response_is_text:
        lines.append(f'        return response;')
    elif response_model:
        lines.append(f'        return objectMapper.readValue(response, {response_model}.class);')
    else:
        lines.append(f'        return objectMapper.readValue(response, SaveChangesResponse.class);')

    lines.append(f'    }}')
    return '\n'.join(lines)


def generate_client(operations: list, models: dict, package: str, client_name: str, base_url: str, enums: dict) -> str:
    """Generate the main client class."""
    # Group by tag
    by_tag = defaultdict(list)
    for op in operations:
        by_tag[op['tag']].append(op)

    # Collect needed model imports
    model_classes = set()
    has_untyped = False
    for op in operations:
        if op['response_model']:
            model_classes.add(op['response_model'])
        elif not op.get('response_is_text', False):
            has_untyped = True
    if has_untyped:
        model_classes.add('SaveChangesResponse')

    # Collect needed enum imports
    enum_classes = set()
    for op in operations:
        for p in op['params']:
            schema = p.get('schema', {})
            if 'enum' in schema:
                ei = find_enum_for_param(p.get('name', ''), schema, enums)
                if ei:
                    enum_classes.add(ei['class_name'])
        for p in op['body_params']:
            schema = p.get('schema', {})
            if 'enum' in schema:
                ei = find_enum_for_param(p.get('name', ''), schema, enums)
                if ei:
                    enum_classes.add(ei['class_name'])

    lines = []
    lines.append(f'package {package};')
    lines.append('')
    lines.append(f'import com.lolzteam.runtime.HttpClientInterface;')
    lines.append(f'import com.fasterxml.jackson.databind.ObjectMapper;')
    lines.append(f'import com.fasterxml.jackson.databind.DeserializationFeature;')
    # Import all model classes
    for mc in sorted(model_classes):
        lines.append(f'import {package}.models.{mc};')
    # Import all enum classes
    for ec in sorted(enum_classes):
        lines.append(f'import {package}.enums.{ec};')
    lines.append('')
    lines.append(f'/**')
    lines.append(f' * Auto-generated {client_name} API client.')
    lines.append(f' *')
    lines.append(f' * <p>Generated from OpenAPI schema. All API methods throw checked exceptions')
    lines.append(f' * on network or API errors.</p>')
    lines.append(f' */')
    lines.append(f'public class {client_name} {{')
    lines.append(f'')
    lines.append(f'    private final HttpClientInterface client;')
    lines.append(f'    private final String baseUrl;')
    lines.append(f'    private final ObjectMapper objectMapper;')
    lines.append(f'')
    lines.append(f'    /**')
    lines.append(f'     * Create a new {client_name} with the default base URL.')
    lines.append(f'     *')
    lines.append(f'     * @param client the HTTP client to use for requests')
    lines.append(f'     */')
    lines.append(f'    public {client_name}(HttpClientInterface client) {{')
    lines.append(f'        this(client, "{base_url}");')
    lines.append(f'    }}')
    lines.append(f'')
    lines.append(f'    /**')
    lines.append(f'     * Create a new {client_name} with a custom base URL.')
    lines.append(f'     *')
    lines.append(f'     * @param client  the HTTP client to use for requests')
    lines.append(f'     * @param baseUrl the base URL for all API requests')
    lines.append(f'     */')
    lines.append(f'    public {client_name}(HttpClientInterface client, String baseUrl) {{')
    lines.append(f'        this.client = client;')
    lines.append(f'        this.baseUrl = baseUrl;')
    lines.append(f'        this.objectMapper = new ObjectMapper();')
    lines.append(f'        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);')
    lines.append(f'    }}')
    lines.append(f'')

    # Generate methods grouped by tag with comments
    for tag in sorted(by_tag.keys()):
        ops = by_tag[tag]
        lines.append(f'    // ==================== {tag} ====================')
        lines.append(f'')
        for op in ops:
            method_code = generate_method(op, package, enums)
            lines.append(method_code)
            lines.append('')

    lines.append(f'}}')
    lines.append('')

    return '\n'.join(lines)


def main():
    parser = argparse.ArgumentParser(description='Generate Java API wrapper from OpenAPI schema')
    parser.add_argument('--schema', required=True, help='Path to OpenAPI JSON schema')
    parser.add_argument('--output-dir', required=True, help='Output directory for generated code')
    parser.add_argument('--package', required=True, help='Java package name')
    args = parser.parse_args()

    with open(args.schema) as f:
        spec = json.load(f)

    output_dir = Path(args.output_dir)
    models_dir = output_dir / 'models'
    enums_dir = output_dir / 'enums'
    models_dir.mkdir(parents=True, exist_ok=True)
    enums_dir.mkdir(parents=True, exist_ok=True)

    package = args.package

    # Determine client name and base URL from schema
    title = spec.get('info', {}).get('title', '')
    servers = spec.get('servers', [])
    base_url = servers[0].get('url', 'https://prod-api.lzt.market') if servers else 'https://prod-api.lzt.market'

    if 'forum' in title.lower() or 'forum' in args.schema.lower():
        client_name = 'ForumClient'
        if not servers:
            base_url = 'https://prod-api.lolz.live'
    elif 'market' in title.lower() or 'market' in args.schema.lower():
        client_name = 'MarketClient'
        if not servers:
            base_url = 'https://prod-api.lzt.market'
    else:
        client_name = 'ApiClient'

    print(f'Generating {client_name} from {args.schema}')
    print(f'  Base URL: {base_url}')
    print(f'  Package: {package}')
    print(f'  Output: {output_dir}')

    # Collect enums
    enums = collect_enums_from_spec(spec)
    print(f'  Found {len(enums)} enum types')

    # Generate enum classes
    for key, enum_info in enums.items():
        enum_code = generate_enum_class(enum_info, package)
        enum_file = enums_dir / f'{enum_info["class_name"]}.java'
        with open(enum_file, 'w') as f:
            f.write(enum_code)

    # Collect models
    models = collect_response_models(spec)

    # Add SaveChangesResponse for endpoints without a response schema
    # Find the RespSysteminfo model name (may vary between forum/market)
    system_info_model = None
    for mname in models:
        if mname.lower() == 'respsysteminfo':
            system_info_model = mname
            break
    save_changes_fields = [
        ('status', 'String', 'status'),
        ('message', 'String', 'message'),
    ]
    if system_info_model:
        save_changes_fields.append(('system_info', system_info_model, 'systemInfo'))
    models['SaveChangesResponse'] = {
        'fields': save_changes_fields,
        'source': 'synthetic',
    }

    print(f'  Found {len(models)} response models')

    # Generate model records
    for model_name, model_info in models.items():
        record_code = generate_record(model_name, model_info, package)
        model_file = models_dir / f'{model_name}.java'
        with open(model_file, 'w') as f:
            f.write(record_code)

    # Collect and generate operations
    operations = collect_operations(spec)
    print(f'  Found {len(operations)} operations')

    client_code = generate_client(operations, models, package, client_name, base_url, enums)
    client_file = output_dir / f'{client_name}.java'
    with open(client_file, 'w') as f:
        f.write(client_code)

    print(f'  Generated {len(enums)} enum files, {len(models)} model files and {client_name}.java')
    print('Done!')


if __name__ == '__main__':
    main()

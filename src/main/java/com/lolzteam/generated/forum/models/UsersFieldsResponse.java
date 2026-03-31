package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersFieldsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersFieldsResponse(
    @JsonProperty("fields") java.util.List<java.util.Map<String, Object>> fields,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

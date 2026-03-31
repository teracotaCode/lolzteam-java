package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>TagsGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record TagsGetResponse(
    @JsonProperty("tag") java.util.Map<String, Object> tag,
    @JsonProperty("tagged") java.util.List<java.util.Map<String, Object>> tagged,
    @JsonProperty("tagged_total") Long taggedTotal,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

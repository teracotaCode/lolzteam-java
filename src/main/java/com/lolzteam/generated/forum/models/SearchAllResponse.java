package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>SearchAllResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SearchAllResponse(
    @JsonProperty("data") java.util.List<java.util.Map<String, Object>> data,
    @JsonProperty("data_total") Long dataTotal,
    @JsonProperty("users") java.util.List<RespUsermodel> users,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

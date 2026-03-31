package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ForumsGroupedResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumsGroupedResponse(
    @JsonProperty("data") Object data,
    @JsonProperty("tabs") java.util.List<java.util.Map<String, Object>> tabs,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

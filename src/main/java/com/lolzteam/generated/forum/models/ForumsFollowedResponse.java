package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ForumsFollowedResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumsFollowedResponse(
    @JsonProperty("forums") java.util.List<java.util.Map<String, Object>> forums,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

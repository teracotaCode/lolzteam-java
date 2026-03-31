package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ForumsFollowersResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumsFollowersResponse(
    @JsonProperty("users") java.util.List<java.util.Map<String, Object>> users,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

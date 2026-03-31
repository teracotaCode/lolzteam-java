package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersFollowersResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersFollowersResponse(
    @JsonProperty("users") java.util.List<java.util.Map<String, Object>> users,
    @JsonProperty("users_total") Long usersTotal,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

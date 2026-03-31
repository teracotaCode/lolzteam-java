package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersFollowingsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersFollowingsResponse(
    @JsonProperty("users") java.util.List<java.util.Map<String, Object>> users,
    @JsonProperty("users_total") Long usersTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

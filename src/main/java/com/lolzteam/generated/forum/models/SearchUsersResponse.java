package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>SearchUsersResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SearchUsersResponse(
    @JsonProperty("users") java.util.List<RespUsermodel> users,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

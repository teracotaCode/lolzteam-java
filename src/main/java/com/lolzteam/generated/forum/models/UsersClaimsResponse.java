package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersClaimsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersClaimsResponse(
    @JsonProperty("claims") java.util.List<java.util.Map<String, Object>> claims,
    @JsonProperty("stats") java.util.Map<String, Object> stats,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

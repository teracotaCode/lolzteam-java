package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProfileClaimsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProfileClaimsResponse(
    @JsonProperty("claims") java.util.List<java.util.Map<String, Object>> claims,
    @JsonProperty("stats") java.util.Map<String, Object> stats,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

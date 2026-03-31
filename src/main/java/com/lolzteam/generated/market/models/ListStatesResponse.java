package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ListStatesResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ListStatesResponse(
    @JsonProperty("userItemStates") java.util.Map<String, Object> useritemstates,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

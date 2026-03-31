package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingSteamvalueResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingSteamvalueResponse(
    @JsonProperty("query") String query,
    @JsonProperty("data") java.util.Map<String, Object> data,
    @JsonProperty("appId") Long appid,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

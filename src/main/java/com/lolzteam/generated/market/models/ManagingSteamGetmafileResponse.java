package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingSteamGetmafileResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingSteamGetmafileResponse(
    @JsonProperty("maFile") java.util.Map<String, Object> mafile,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

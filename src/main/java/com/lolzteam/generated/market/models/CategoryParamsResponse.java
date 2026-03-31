package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CategoryParamsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CategoryParamsResponse(
    @JsonProperty("category") java.util.Map<String, Object> category,
    @JsonProperty("params") java.util.List<java.util.Map<String, Object>> params,
    @JsonProperty("base_params") Object baseParams,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

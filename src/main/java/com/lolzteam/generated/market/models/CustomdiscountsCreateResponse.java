package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CustomdiscountsCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CustomdiscountsCreateResponse(
    @JsonProperty("discount") Discountmodel discount,
    @JsonProperty("total") Long total,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

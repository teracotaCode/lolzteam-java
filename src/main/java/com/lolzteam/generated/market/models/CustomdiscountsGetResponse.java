package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CustomdiscountsGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CustomdiscountsGetResponse(
    @JsonProperty("discounts") java.util.List<Discountmodel> discounts,
    @JsonProperty("total") Long total,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Balancemodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Balancemodel(
    @JsonProperty("balance") String balance,
    @JsonProperty("balance_id") Long balanceId,
    @JsonProperty("custom_title") Object customTitle,
    @JsonProperty("fullTitle") String fulltitle,
    @JsonProperty("merchant_id") Long merchantId,
    @JsonProperty("title") String title,
    @JsonProperty("type") String type,
    @JsonProperty("user_id") Long userId
) {}

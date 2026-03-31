package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Discountmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Discountmodel(
    @JsonProperty("category_id") Long categoryId,
    @JsonProperty("discount_id") Long discountId,
    @JsonProperty("discount_percent") Long discountPercent,
    @JsonProperty("discount_user_id") Long discountUserId,
    @JsonProperty("max_price") Long maxPrice,
    @JsonProperty("min_price") Long minPrice,
    @JsonProperty("user_id") Long userId
) {}

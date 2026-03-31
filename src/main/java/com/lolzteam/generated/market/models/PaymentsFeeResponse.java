package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PaymentsFeeResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaymentsFeeResponse(
    @JsonProperty("commission_percentage") Long commissionPercentage,
    @JsonProperty("spentCurrentMonth") Long spentcurrentmonth,
    @JsonProperty("calculator") Object calculator,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

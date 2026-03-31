package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>AutopaymentsCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record AutopaymentsCreateResponse(
    @JsonProperty("status") String status,
    @JsonProperty("message") String message,
    @JsonProperty("auto_payment_id") Long autoPaymentId,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Invoicemodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Invoicemodel(
    @JsonProperty("additional_data") String additionalData,
    @JsonProperty("amount") Long amount,
    @JsonProperty("comment") String comment,
    @JsonProperty("expires_at") Long expiresAt,
    @JsonProperty("invoice_date") Long invoiceDate,
    @JsonProperty("invoice_id") Long invoiceId,
    @JsonProperty("is_test") Boolean isTest,
    @JsonProperty("merchant_id") Long merchantId,
    @JsonProperty("paid_date") Long paidDate,
    @JsonProperty("payer_user_id") Long payerUserId,
    @JsonProperty("payment_id") String paymentId,
    @JsonProperty("resend_attempts") Long resendAttempts,
    @JsonProperty("status") String status,
    @JsonProperty("url") String url,
    @JsonProperty("url_callback") String urlCallback,
    @JsonProperty("url_success") String urlSuccess,
    @JsonProperty("user_id") Long userId
) {}

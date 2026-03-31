package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PaymentsInvoiceGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaymentsInvoiceGetResponse(
    @JsonProperty("invoice") Invoicemodel invoice,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

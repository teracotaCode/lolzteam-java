package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PaymentsInvoiceListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaymentsInvoiceListResponse(
    @JsonProperty("invoices") java.util.List<Invoicemodel> invoices,
    @JsonProperty("count") Long count,
    @JsonProperty("page") Long page,
    @JsonProperty("perPage") Long perpage,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

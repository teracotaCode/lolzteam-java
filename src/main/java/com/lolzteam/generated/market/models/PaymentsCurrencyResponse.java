package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PaymentsCurrencyResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaymentsCurrencyResponse(
    @JsonProperty("currencyList") java.util.Map<String, Object> currencylist,
    @JsonProperty("lastUpdate") Long lastupdate,
    @JsonProperty("visitorCurrency") String visitorcurrency,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

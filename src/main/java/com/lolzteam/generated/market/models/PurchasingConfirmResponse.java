package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PurchasingConfirmResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PurchasingConfirmResponse(
    @JsonProperty("status") String status,
    @JsonProperty("item") java.util.Map<String, Object> item,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

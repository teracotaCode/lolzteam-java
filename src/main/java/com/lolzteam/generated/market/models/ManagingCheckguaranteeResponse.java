package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingCheckguaranteeResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingCheckguaranteeResponse(
    @JsonProperty("message") String message,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

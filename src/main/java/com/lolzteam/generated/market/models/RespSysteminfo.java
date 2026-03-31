package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespSysteminfo</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespSysteminfo(
    @JsonProperty("visitor_id") Long visitorId,
    @JsonProperty("time") Long time,
    @JsonProperty("log_id") Long logId
) {}

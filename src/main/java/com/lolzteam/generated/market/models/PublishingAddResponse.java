package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PublishingAddResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PublishingAddResponse(
    @JsonProperty("status") String status,
    @JsonProperty("item") Itemmodel item,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

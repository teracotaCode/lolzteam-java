package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PublishingFastsellResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PublishingFastsellResponse(
    @JsonProperty("item") Itemmodel item,
    @JsonProperty("itemLink") String itemlink,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

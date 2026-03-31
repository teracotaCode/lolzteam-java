package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingTelegramcodeResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingTelegramcodeResponse(
    @JsonProperty("item") Itemmodel item,
    @JsonProperty("codes") java.util.Map<String, Object> codes
) {}

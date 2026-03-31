package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Confirmationcodemodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Confirmationcodemodel(
    @JsonProperty("item") Itemmodel item,
    @JsonProperty("codeData") java.util.Map<String, Object> codedata
) {}

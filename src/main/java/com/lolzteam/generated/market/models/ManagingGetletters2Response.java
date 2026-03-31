package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingGetletters2Response</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingGetletters2Response(
    @JsonProperty("email") String email,
    @JsonProperty("letters") java.util.List<java.util.Map<String, Object>> letters,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingCreateclaimResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingCreateclaimResponse(
    @JsonProperty("thread") java.util.Map<String, Object> thread,
    @JsonProperty("system_info") java.util.Map<String, Object> systemInfo
) {}

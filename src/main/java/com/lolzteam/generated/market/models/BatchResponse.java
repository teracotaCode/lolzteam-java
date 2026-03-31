package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>BatchResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record BatchResponse(
    @JsonProperty("jobs") java.util.Map<String, Object> jobs,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

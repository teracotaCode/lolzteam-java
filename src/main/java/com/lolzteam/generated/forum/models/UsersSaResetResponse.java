package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersSaResetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersSaResetResponse(
    @JsonProperty("success") Boolean success,
    @JsonProperty("waiting_time") String waitingTime,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

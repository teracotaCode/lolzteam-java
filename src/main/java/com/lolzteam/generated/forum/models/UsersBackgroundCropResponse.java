package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersBackgroundCropResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersBackgroundCropResponse(
    @JsonProperty("status") String status,
    @JsonProperty("message") String message,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

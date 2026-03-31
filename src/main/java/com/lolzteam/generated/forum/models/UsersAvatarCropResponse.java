package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersAvatarCropResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersAvatarCropResponse(
    @JsonProperty("status") String status,
    @JsonProperty("message") String message,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

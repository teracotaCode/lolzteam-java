package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ChatboxEditmessageResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatboxEditmessageResponse(
    @JsonProperty("message") RespChatboxmessagemodel message,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

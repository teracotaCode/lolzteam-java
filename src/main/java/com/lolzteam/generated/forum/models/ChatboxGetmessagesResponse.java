package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ChatboxGetmessagesResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatboxGetmessagesResponse(
    @JsonProperty("messages") java.util.List<RespChatboxmessagemodel> messages,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

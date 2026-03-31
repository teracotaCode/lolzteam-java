package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ConversationsMessagesCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversationsMessagesCreateResponse(
    @JsonProperty("message") RespConversationmessagemodel message,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

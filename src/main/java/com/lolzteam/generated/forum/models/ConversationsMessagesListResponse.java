package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ConversationsMessagesListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversationsMessagesListResponse(
    @JsonProperty("messages") java.util.List<RespConversationmessagemodel> messages,
    @JsonProperty("messages_total") Long messagesTotal,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

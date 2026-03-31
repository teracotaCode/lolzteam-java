package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ConversationsCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversationsCreateResponse(
    @JsonProperty("conversation") RespConversationmodel conversation,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

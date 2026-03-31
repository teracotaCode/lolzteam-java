package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ConversationsSearchResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversationsSearchResponse(
    @JsonProperty("conversations") java.util.List<RespConversationmodel> conversations,
    @JsonProperty("recipients") Boolean recipients,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

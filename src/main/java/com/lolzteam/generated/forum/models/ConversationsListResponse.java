package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ConversationsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ConversationsListResponse(
    @JsonProperty("conversations") java.util.List<RespConversationmodel> conversations,
    @JsonProperty("can_start") Boolean canStart,
    @JsonProperty("folders") java.util.List<java.util.Map<String, Object>> folders,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

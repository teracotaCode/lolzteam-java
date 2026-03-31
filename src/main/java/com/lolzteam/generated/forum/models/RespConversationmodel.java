package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespConversationmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespConversationmodel(
    @JsonProperty("conversation_id") Long conversationId,
    @JsonProperty("conversation_title") String conversationTitle,
    @JsonProperty("creator_user_id") Long creatorUserId,
    @JsonProperty("creator_username") String creatorUsername,
    @JsonProperty("creator_username_html") String creatorUsernameHtml,
    @JsonProperty("conversation_create_date") Long conversationCreateDate,
    @JsonProperty("conversation_update_date") Long conversationUpdateDate,
    @JsonProperty("conversation_last_read_date") Long conversationLastReadDate,
    @JsonProperty("conversation_online_count") Long conversationOnlineCount,
    @JsonProperty("is_starred") Long isStarred,
    @JsonProperty("is_group") Long isGroup,
    @JsonProperty("is_unread") Long isUnread,
    @JsonProperty("alerts") Long alerts,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("conversation_message_count") Long conversationMessageCount,
    @JsonProperty("conversation_is_new") Boolean conversationIsNew,
    @JsonProperty("creator_is_ignored") Boolean creatorIsIgnored,
    @JsonProperty("conversation_is_open") Boolean conversationIsOpen,
    @JsonProperty("conversation_is_deleted") Boolean conversationIsDeleted,
    @JsonProperty("recipient") java.util.Map<String, Object> recipient,
    @JsonProperty("recipients") java.util.List<java.util.Map<String, Object>> recipients,
    @JsonProperty("links") java.util.Map<String, Object> links
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespConversationmessagemodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespConversationmessagemodel(
    @JsonProperty("message_id") Long messageId,
    @JsonProperty("conversation_id") Long conversationId,
    @JsonProperty("creator_user_id") Long creatorUserId,
    @JsonProperty("creator_username") String creatorUsername,
    @JsonProperty("creator_username_html") String creatorUsernameHtml,
    @JsonProperty("message_create_date") Long messageCreateDate,
    @JsonProperty("message_is_unread") Long messageIsUnread,
    @JsonProperty("message_need_translate") Boolean messageNeedTranslate,
    @JsonProperty("message_is_system") Boolean messageIsSystem,
    @JsonProperty("message_edit_date") Long messageEditDate,
    @JsonProperty("message_body") String messageBody,
    @JsonProperty("message_body_html") String messageBodyHtml,
    @JsonProperty("message_body_plain_text") String messageBodyPlainText,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions
) {}

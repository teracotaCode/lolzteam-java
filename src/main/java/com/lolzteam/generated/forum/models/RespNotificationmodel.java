package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespNotificationmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespNotificationmodel(
    @JsonProperty("notification_id") Long notificationId,
    @JsonProperty("notification_create_date") Long notificationCreateDate,
    @JsonProperty("content_type") String contentType,
    @JsonProperty("content_id") Long contentId,
    @JsonProperty("content_action") String contentAction,
    @JsonProperty("notification_is_unread") Boolean notificationIsUnread,
    @JsonProperty("creator_user_id") Long creatorUserId,
    @JsonProperty("creator_username") String creatorUsername,
    @JsonProperty("creator_username_html") String creatorUsernameHtml,
    @JsonProperty("notification_type") String notificationType,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("notification_html") String notificationHtml
) {}

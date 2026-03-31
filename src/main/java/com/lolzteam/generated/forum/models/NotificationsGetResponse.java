package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>NotificationsGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record NotificationsGetResponse(
    @JsonProperty("notification_id") Long notificationId,
    @JsonProperty("notification") RespNotificationmodel notification,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

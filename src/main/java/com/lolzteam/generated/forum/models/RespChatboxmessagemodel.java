package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespChatboxmessagemodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespChatboxmessagemodel(
    @JsonProperty("can_report") Boolean canReport,
    @JsonProperty("date") Long date,
    @JsonProperty("is_deleted") Boolean isDeleted,
    @JsonProperty("message") String message,
    @JsonProperty("message_id") Long messageId,
    @JsonProperty("messageJson") String messagejson,
    @JsonProperty("messageRaw") String messageraw,
    @JsonProperty("room") java.util.Map<String, Object> room,
    @JsonProperty("user") java.util.Map<String, Object> user
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespProfilepostcommentmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespProfilepostcommentmodel(
    @JsonProperty("comment_id") Long commentId,
    @JsonProperty("profile_post_id") Long profilePostId,
    @JsonProperty("comment_user_id") Long commentUserId,
    @JsonProperty("comment_username") String commentUsername,
    @JsonProperty("comment_username_html") String commentUsernameHtml,
    @JsonProperty("comment_create_date") Long commentCreateDate,
    @JsonProperty("comment_body") String commentBody,
    @JsonProperty("comment_body_html") String commentBodyHtml,
    @JsonProperty("comment_body_plain_text") String commentBodyPlainText,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("timeline_user_id") Long timelineUserId,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions
) {}

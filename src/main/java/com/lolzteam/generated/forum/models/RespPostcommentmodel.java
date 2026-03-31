package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespPostcommentmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespPostcommentmodel(
    @JsonProperty("post_comment_id") Long postCommentId,
    @JsonProperty("post_id") Long postId,
    @JsonProperty("thread_id") Long threadId,
    @JsonProperty("poster_user_id") Long posterUserId,
    @JsonProperty("poster_username") String posterUsername,
    @JsonProperty("poster_username_html") String posterUsernameHtml,
    @JsonProperty("post_comment_create_date") Long postCommentCreateDate,
    @JsonProperty("post_comment_body") String postCommentBody,
    @JsonProperty("post_comment_body_html") String postCommentBodyHtml,
    @JsonProperty("post_comment_body_plain_text") String postCommentBodyPlainText,
    @JsonProperty("post_comment_like_count") Long postCommentLikeCount,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("post_comment_is_published") Boolean postCommentIsPublished,
    @JsonProperty("post_comment_is_deleted") Boolean postCommentIsDeleted,
    @JsonProperty("post_comment_update_date") Long postCommentUpdateDate,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespProfilepostmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespProfilepostmodel(
    @JsonProperty("profile_post_id") Long profilePostId,
    @JsonProperty("timeline_user_id") Long timelineUserId,
    @JsonProperty("poster_user_id") Long posterUserId,
    @JsonProperty("poster_username") String posterUsername,
    @JsonProperty("poster_username_html") String posterUsernameHtml,
    @JsonProperty("post_create_date") Long postCreateDate,
    @JsonProperty("post_body") String postBody,
    @JsonProperty("post_body_html") String postBodyHtml,
    @JsonProperty("post_body_plain_text") String postBodyPlainText,
    @JsonProperty("post_like_count") Long postLikeCount,
    @JsonProperty("post_comment_count") Long postCommentCount,
    @JsonProperty("post_comments_is_disabled") Long postCommentsIsDisabled,
    @JsonProperty("timeline_username") String timelineUsername,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("post_is_published") Boolean postIsPublished,
    @JsonProperty("post_is_deleted") Boolean postIsDeleted,
    @JsonProperty("post_is_liked") Boolean postIsLiked,
    @JsonProperty("post_is_sticked") Boolean postIsSticked,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("timeline_user") RespUsermodel timelineUser
) {}

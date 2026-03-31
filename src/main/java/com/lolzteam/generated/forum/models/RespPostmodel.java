package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespPostmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespPostmodel(
    @JsonProperty("post_id") Long postId,
    @JsonProperty("thread_id") Long threadId,
    @JsonProperty("poster_user_id") Long posterUserId,
    @JsonProperty("poster_username") String posterUsername,
    @JsonProperty("poster_username_html") String posterUsernameHtml,
    @JsonProperty("post_create_date") Long postCreateDate,
    @JsonProperty("post_body") String postBody,
    @JsonProperty("post_body_html") String postBodyHtml,
    @JsonProperty("post_body_plain_text") String postBodyPlainText,
    @JsonProperty("signature") String signature,
    @JsonProperty("signature_html") String signatureHtml,
    @JsonProperty("signature_plain_text") String signaturePlainText,
    @JsonProperty("post_like_count") Long postLikeCount,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("post_is_published") Boolean postIsPublished,
    @JsonProperty("post_is_deleted") Boolean postIsDeleted,
    @JsonProperty("post_update_date") Long postUpdateDate,
    @JsonProperty("post_is_first_post") Boolean postIsFirstPost,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("thread_is_deleted") Boolean threadIsDeleted
) {}

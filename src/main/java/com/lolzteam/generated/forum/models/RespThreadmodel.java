package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespThreadmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespThreadmodel(
    @JsonProperty("thread_id") Long threadId,
    @JsonProperty("forum_id") Long forumId,
    @JsonProperty("thread_title") String threadTitle,
    @JsonProperty("thread_view_count") Long threadViewCount,
    @JsonProperty("creator_user_id") Long creatorUserId,
    @JsonProperty("creator_username") String creatorUsername,
    @JsonProperty("creator_username_html") String creatorUsernameHtml,
    @JsonProperty("thread_create_date") Long threadCreateDate,
    @JsonProperty("thread_update_date") Long threadUpdateDate,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("thread_post_count") Long threadPostCount,
    @JsonProperty("thread_is_published") Boolean threadIsPublished,
    @JsonProperty("thread_is_deleted") Boolean threadIsDeleted,
    @JsonProperty("thread_is_sticky") Boolean threadIsSticky,
    @JsonProperty("thread_is_closed") Boolean threadIsClosed,
    @JsonProperty("thread_is_followed") Boolean threadIsFollowed,
    @JsonProperty("thread_is_starred") Boolean threadIsStarred,
    @JsonProperty("first_post") java.util.Map<String, Object> firstPost,
    @JsonProperty("thread_prefixes") java.util.List<Object> threadPrefixes,
    @JsonProperty("thread_tags") Object threadTags,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("node_title") String nodeTitle,
    @JsonProperty("restrictions") java.util.Map<String, Object> restrictions,
    @JsonProperty("last_post") java.util.Map<String, Object> lastPost,
    @JsonProperty("contest") java.util.Map<String, Object> contest
) {}

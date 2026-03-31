package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProfilepostsCommentsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProfilepostsCommentsListResponse(
    @JsonProperty("comments") java.util.List<RespProfilepostcommentmodel> comments,
    @JsonProperty("comments_total") Long commentsTotal,
    @JsonProperty("profile_post") java.util.Map<String, Object> profilePost,
    @JsonProperty("timeline_user") RespUsermodel timelineUser,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

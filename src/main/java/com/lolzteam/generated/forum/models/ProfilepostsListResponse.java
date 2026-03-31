package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProfilepostsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProfilepostsListResponse(
    @JsonProperty("profile_posts") java.util.List<RespProfilepostmodel> profilePosts,
    @JsonProperty("totalProfilePosts") Long totalprofileposts,
    @JsonProperty("canPostOnProfile") Boolean canpostonprofile,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

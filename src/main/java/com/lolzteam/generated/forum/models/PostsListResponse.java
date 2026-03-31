package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PostsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PostsListResponse(
    @JsonProperty("posts") java.util.List<RespThreadmodel> posts,
    @JsonProperty("thread") RespThreadmodel thread,
    @JsonProperty("posts_total") Long postsTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PostsCommentsGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PostsCommentsGetResponse(
    @JsonProperty("comments") java.util.List<RespPostcommentmodel> comments,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

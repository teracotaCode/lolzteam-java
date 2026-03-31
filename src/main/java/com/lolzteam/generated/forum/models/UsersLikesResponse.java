package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>UsersLikesResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record UsersLikesResponse(
    @JsonProperty("page") Long page,
    @JsonProperty("perPage") Long perpage,
    @JsonProperty("contentType") String contenttype,
    @JsonProperty("totalLikes") Long totallikes,
    @JsonProperty("likes") Object likes,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

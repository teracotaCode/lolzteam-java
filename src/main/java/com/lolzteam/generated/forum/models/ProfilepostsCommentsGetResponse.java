package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProfilepostsCommentsGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProfilepostsCommentsGetResponse(
    @JsonProperty("comment") RespProfilepostcommentmodel comment,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

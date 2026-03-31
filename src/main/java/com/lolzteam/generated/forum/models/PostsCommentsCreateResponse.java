package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PostsCommentsCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PostsCommentsCreateResponse(
    @JsonProperty("comment") java.util.Map<String, Object> comment,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

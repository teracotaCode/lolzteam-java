package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>FormsCreateResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FormsCreateResponse(
    @JsonProperty("message") String message,
    @JsonProperty("content") java.util.Map<String, Object> content,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

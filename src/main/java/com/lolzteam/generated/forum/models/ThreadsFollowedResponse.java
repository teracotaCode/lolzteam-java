package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ThreadsFollowedResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ThreadsFollowedResponse(
    @JsonProperty("threads") java.util.List<java.util.Map<String, Object>> threads,
    @JsonProperty("threads_total") Long threadsTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

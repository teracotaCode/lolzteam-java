package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ThreadsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ThreadsListResponse(
    @JsonProperty("threads") java.util.List<RespThreadmodel> threads,
    @JsonProperty("forum") java.util.Map<String, Object> forum,
    @JsonProperty("threads_total") Long threadsTotal,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

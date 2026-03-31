package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ForumsGetfeedoptionsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumsGetfeedoptionsResponse(
    @JsonProperty("forums") java.util.List<java.util.Map<String, Object>> forums,
    @JsonProperty("excluded_forums_ids") java.util.List<Long> excludedForumsIds,
    @JsonProperty("default_excluded_forums_ids") java.util.List<Long> defaultExcludedForumsIds,
    @JsonProperty("keywords") String keywords,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ForumsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ForumsListResponse(
    @JsonProperty("forums") java.util.List<java.util.Map<String, Object>> forums,
    @JsonProperty("forums_total") Long forumsTotal,
    @JsonProperty("tabs") java.util.List<java.util.Map<String, Object>> tabs,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

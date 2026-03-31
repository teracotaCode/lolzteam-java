package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ThreadsUnreadResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ThreadsUnreadResponse(
    @JsonProperty("threads") java.util.List<RespThreadmodel> threads,
    @JsonProperty("data") java.util.List<java.util.Map<String, Object>> data,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

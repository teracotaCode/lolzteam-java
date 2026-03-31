package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ChatboxGetignoreResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatboxGetignoreResponse(
    @JsonProperty("ignored") java.util.List<java.util.Map<String, Object>> ignored,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

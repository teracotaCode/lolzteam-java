package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>TagsFindResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record TagsFindResponse(
    @JsonProperty("tags") Object tags,
    @JsonProperty("ids") java.util.List<Long> ids,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

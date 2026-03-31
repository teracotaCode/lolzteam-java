package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PostsReportreasonsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PostsReportreasonsResponse(
    @JsonProperty("reasons") java.util.List<String> reasons,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProfilepostsReportreasonsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProfilepostsReportreasonsResponse(
    @JsonProperty("reasons") java.util.List<String> reasons,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

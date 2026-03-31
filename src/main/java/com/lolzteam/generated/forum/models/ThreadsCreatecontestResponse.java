package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ThreadsCreatecontestResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ThreadsCreatecontestResponse(
    @JsonProperty("thread") RespThreadmodel thread,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CategoriesGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CategoriesGetResponse(
    @JsonProperty("category") java.util.Map<String, Object> category,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

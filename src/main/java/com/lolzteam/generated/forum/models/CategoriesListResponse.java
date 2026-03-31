package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CategoriesListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CategoriesListResponse(
    @JsonProperty("categories") java.util.List<java.util.Map<String, Object>> categories,
    @JsonProperty("categories_total") Long categoriesTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>SearchResultsResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record SearchResultsResponse(
    @JsonProperty("data") java.util.List<java.util.Map<String, Object>> data,
    @JsonProperty("data_total") Long dataTotal,
    @JsonProperty("search_tags") Object searchTags,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

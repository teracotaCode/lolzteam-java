package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PagesListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PagesListResponse(
    @JsonProperty("pages") java.util.List<java.util.Map<String, Object>> pages,
    @JsonProperty("pages_total") Long pagesTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

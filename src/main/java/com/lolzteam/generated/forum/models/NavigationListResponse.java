package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>NavigationListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record NavigationListResponse(
    @JsonProperty("elements") java.util.List<java.util.Map<String, Object>> elements,
    @JsonProperty("elements_count") Long elementsCount,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

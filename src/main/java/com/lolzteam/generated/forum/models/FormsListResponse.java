package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>FormsListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record FormsListResponse(
    @JsonProperty("forms") java.util.List<java.util.Map<String, Object>> forms,
    @JsonProperty("formsPerPage") Long formsperpage,
    @JsonProperty("page") Long page,
    @JsonProperty("totalForms") Long totalforms,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

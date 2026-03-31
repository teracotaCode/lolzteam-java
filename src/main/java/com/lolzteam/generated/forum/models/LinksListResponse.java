package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>LinksListResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record LinksListResponse(
    @JsonProperty("link-forums") java.util.List<RespLinkmodel> linkForums,
    @JsonProperty("link-forums_total") Long linkForumsTotal,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

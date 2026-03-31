package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespLinkmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespLinkmodel(
    @JsonProperty("link_id") Long linkId,
    @JsonProperty("link_title") String linkTitle,
    @JsonProperty("link_description") String linkDescription,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>CategoryFortniteResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record CategoryFortniteResponse(
    @JsonProperty("items") java.util.List<java.util.Map<String, Object>> items,
    @JsonProperty("totalItems") Long totalitems,
    @JsonProperty("totalItemsPrice") Object totalitemsprice,
    @JsonProperty("hasNextPage") Boolean hasnextpage,
    @JsonProperty("perPage") Long perpage,
    @JsonProperty("page") Long page,
    @JsonProperty("wasCached") Boolean wascached,
    @JsonProperty("cacheTTL") Long cachettl,
    @JsonProperty("lastModified") Long lastmodified,
    @JsonProperty("serverTime") Long servertime,
    @JsonProperty("searchUrl") String searchurl,
    @JsonProperty("stickyItems") java.util.List<Object> stickyitems,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

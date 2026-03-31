package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Itemlistmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Itemlistmodel(
    @JsonProperty("items") java.util.List<Itemfromlistmodel> items,
    @JsonProperty("totalItems") Long totalitems,
    @JsonProperty("totalItemsPrice") Object totalitemsprice,
    @JsonProperty("hasNextPage") Boolean hasnextpage,
    @JsonProperty("perPage") Long perpage,
    @JsonProperty("page") Long page,
    @JsonProperty("searchUrl") String searchurl,
    @JsonProperty("stickyItems") java.util.List<Itemfromlistmodel> stickyitems,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

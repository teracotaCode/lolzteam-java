package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingBulkgetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingBulkgetResponse(
    @JsonProperty("items") Object items,
    @JsonProperty("left_item_id") java.util.List<Long> leftItemId,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ProxyGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ProxyGetResponse(
    @JsonProperty("proxies") java.util.List<java.util.Map<String, Object>> proxies,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

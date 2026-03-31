package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ChatboxIndexResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatboxIndexResponse(
    @JsonProperty("rooms") java.util.List<java.util.Map<String, Object>> rooms,
    @JsonProperty("ban") Object ban,
    @JsonProperty("ignore") java.util.List<java.util.Map<String, Object>> ignore,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("commands") java.util.List<String> commands,
    @JsonProperty("roomsOnline") java.util.Map<String, Object> roomsonline,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

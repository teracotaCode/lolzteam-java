package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ChatboxGetleaderboardResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ChatboxGetleaderboardResponse(
    @JsonProperty("leaderboard") java.util.List<java.util.Map<String, Object>> leaderboard,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

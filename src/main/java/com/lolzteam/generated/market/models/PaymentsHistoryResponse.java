package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>PaymentsHistoryResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PaymentsHistoryResponse(
    @JsonProperty("payments") Object payments,
    @JsonProperty("perPage") String perpage,
    @JsonProperty("page") Long page,
    @JsonProperty("pageNavLink") String pagenavlink,
    @JsonProperty("pageNavParams") java.util.Map<String, Object> pagenavparams,
    @JsonProperty("periodLabel") String periodlabel,
    @JsonProperty("periodLabelPhrase") String periodlabelphrase,
    @JsonProperty("filterDatesDefault") Boolean filterdatesdefault,
    @JsonProperty("input") java.util.Map<String, Object> input,
    @JsonProperty("paymentStats") Object paymentstats,
    @JsonProperty("hasNextPage") Boolean hasnextpage,
    @JsonProperty("lastOperationId") Long lastoperationid,
    @JsonProperty("nextPageHref") String nextpagehref,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>ManagingGetResponse</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record ManagingGetResponse(
    @JsonProperty("item") Itemmodel item,
    @JsonProperty("canStickItem") Boolean canstickitem,
    @JsonProperty("canUnstickItem") Boolean canunstickitem,
    @JsonProperty("canBuyItem") Boolean canbuyitem,
    @JsonProperty("cannotBuyItemError") String cannotbuyitemerror,
    @JsonProperty("canCloseItem") Boolean cancloseitem,
    @JsonProperty("canOpenItem") Boolean canopenitem,
    @JsonProperty("canReportItem") Boolean canreportitem,
    @JsonProperty("canEditItem") Boolean canedititem,
    @JsonProperty("canDeleteItem") Boolean candeleteitem,
    @JsonProperty("canCancelConfirmedBuy") Boolean cancancelconfirmedbuy,
    @JsonProperty("canViewItemHistory") Boolean canviewitemhistory,
    @JsonProperty("faveCount") Boolean favecount,
    @JsonProperty("isVisibleItem") Boolean isvisibleitem,
    @JsonProperty("canViewLoginData") Boolean canviewlogindata,
    @JsonProperty("showToFavouritesButton") Boolean showtofavouritesbutton,
    @JsonProperty("itemLink") String itemlink,
    @JsonProperty("canChangeOwner") Boolean canchangeowner,
    @JsonProperty("sameItemsIds") java.util.List<Long> sameitemsids,
    @JsonProperty("sameItemsCount") Long sameitemscount,
    @JsonProperty("system_info") RespSysteminfo systemInfo
) {}

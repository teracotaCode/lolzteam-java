package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Itemfromlistmodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Itemfromlistmodel(
    @JsonProperty("item_id") Long itemId,
    @JsonProperty("item_state") String itemState,
    @JsonProperty("category_id") Long categoryId,
    @JsonProperty("published_date") Long publishedDate,
    @JsonProperty("title") String title,
    @JsonProperty("description") String description,
    @JsonProperty("price") Long price,
    @JsonProperty("update_stat_date") Long updateStatDate,
    @JsonProperty("refreshed_date") Long refreshedDate,
    @JsonProperty("view_count") Long viewCount,
    @JsonProperty("is_sticky") Long isSticky,
    @JsonProperty("item_origin") String itemOrigin,
    @JsonProperty("extended_guarantee") Long extendedGuarantee,
    @JsonProperty("nsb") Long nsb,
    @JsonProperty("allow_ask_discount") Long allowAskDiscount,
    @JsonProperty("title_en") String titleEn,
    @JsonProperty("description_en") String descriptionEn,
    @JsonProperty("item_domain") String itemDomain,
    @JsonProperty("resale_item_origin") String resaleItemOrigin,
    @JsonProperty("isIgnored") Long isignored,
    @JsonProperty("guarantee") Object guarantee,
    @JsonProperty("canViewLoginData") Boolean canviewlogindata,
    @JsonProperty("canUpdateItemStats") Boolean canupdateitemstats,
    @JsonProperty("canViewEmailLoginData") Boolean canviewemaillogindata,
    @JsonProperty("showGetEmailCodeButton") Boolean showgetemailcodebutton,
    @JsonProperty("canOpenItem") Boolean canopenitem,
    @JsonProperty("canCloseItem") Boolean cancloseitem,
    @JsonProperty("canEditItem") Boolean canedititem,
    @JsonProperty("canDeleteItem") Boolean candeleteitem,
    @JsonProperty("canStickItem") Boolean canstickitem,
    @JsonProperty("canUnstickItem") Boolean canunstickitem,
    @JsonProperty("bumpSettings") java.util.Map<String, Object> bumpsettings,
    @JsonProperty("canBumpItem") Boolean canbumpitem,
    @JsonProperty("canBuyItem") Boolean canbuyitem,
    @JsonProperty("rub_price") Long rubPrice,
    @JsonProperty("price_currency") String priceCurrency,
    @JsonProperty("canValidateAccount") Boolean canvalidateaccount,
    @JsonProperty("canResellItemAfterPurchase") Boolean canresellitemafterpurchase,
    @JsonProperty("canViewAccountLink") Boolean canviewaccountlink,
    @JsonProperty("itemOriginPhrase") String itemoriginphrase,
    @JsonProperty("tags") Object tags,
    @JsonProperty("note_text") String noteText,
    @JsonProperty("description_html") String descriptionHtml,
    @JsonProperty("description_html_en") String descriptionHtmlEn,
    @JsonProperty("seller") java.util.Map<String, Object> seller
) {}

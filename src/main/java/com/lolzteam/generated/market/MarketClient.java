package com.lolzteam.generated.market;

import com.lolzteam.runtime.HttpClientInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.lolzteam.generated.market.models.AutopaymentsCreateResponse;
import com.lolzteam.generated.market.models.AutopaymentsListResponse;
import com.lolzteam.generated.market.models.BatchResponse;
import com.lolzteam.generated.market.models.CartAddResponse;
import com.lolzteam.generated.market.models.CartDeleteResponse;
import com.lolzteam.generated.market.models.CategoryBattlenetResponse;
import com.lolzteam.generated.market.models.CategoryChatgptResponse;
import com.lolzteam.generated.market.models.CategoryDiscordResponse;
import com.lolzteam.generated.market.models.CategoryEaResponse;
import com.lolzteam.generated.market.models.CategoryEpicgamesResponse;
import com.lolzteam.generated.market.models.CategoryEscapefromtarkovResponse;
import com.lolzteam.generated.market.models.CategoryFortniteResponse;
import com.lolzteam.generated.market.models.CategoryGamesResponse;
import com.lolzteam.generated.market.models.CategoryGiftsResponse;
import com.lolzteam.generated.market.models.CategoryHytaleResponse;
import com.lolzteam.generated.market.models.CategoryInstagramResponse;
import com.lolzteam.generated.market.models.CategoryListResponse;
import com.lolzteam.generated.market.models.CategoryMihoyoResponse;
import com.lolzteam.generated.market.models.CategoryMinecraftResponse;
import com.lolzteam.generated.market.models.CategoryParamsResponse;
import com.lolzteam.generated.market.models.CategoryRiotResponse;
import com.lolzteam.generated.market.models.CategoryRobloxResponse;
import com.lolzteam.generated.market.models.CategorySocialclubResponse;
import com.lolzteam.generated.market.models.CategorySteamResponse;
import com.lolzteam.generated.market.models.CategorySupercellResponse;
import com.lolzteam.generated.market.models.CategoryTelegramResponse;
import com.lolzteam.generated.market.models.CategoryTiktokResponse;
import com.lolzteam.generated.market.models.CategoryUplayResponse;
import com.lolzteam.generated.market.models.CategoryVpnResponse;
import com.lolzteam.generated.market.models.CategoryWarfaceResponse;
import com.lolzteam.generated.market.models.CategoryWotResponse;
import com.lolzteam.generated.market.models.CategoryWotblitzResponse;
import com.lolzteam.generated.market.models.Confirmationcodemodel;
import com.lolzteam.generated.market.models.CustomdiscountsCreateResponse;
import com.lolzteam.generated.market.models.CustomdiscountsEditResponse;
import com.lolzteam.generated.market.models.CustomdiscountsGetResponse;
import com.lolzteam.generated.market.models.Itemlistmodel;
import com.lolzteam.generated.market.models.ListStatesResponse;
import com.lolzteam.generated.market.models.ManagingAipriceResponse;
import com.lolzteam.generated.market.models.ManagingAutobuypriceResponse;
import com.lolzteam.generated.market.models.ManagingBulkgetResponse;
import com.lolzteam.generated.market.models.ManagingChangepasswordResponse;
import com.lolzteam.generated.market.models.ManagingCheckguaranteeResponse;
import com.lolzteam.generated.market.models.ManagingCreateclaimResponse;
import com.lolzteam.generated.market.models.ManagingGetResponse;
import com.lolzteam.generated.market.models.ManagingGetletters2Response;
import com.lolzteam.generated.market.models.ManagingImageResponse;
import com.lolzteam.generated.market.models.ManagingSteamGetmafileResponse;
import com.lolzteam.generated.market.models.ManagingSteaminventoryvalueResponse;
import com.lolzteam.generated.market.models.ManagingSteamupdatevalueResponse;
import com.lolzteam.generated.market.models.ManagingSteamvalueResponse;
import com.lolzteam.generated.market.models.ManagingTelegramcodeResponse;
import com.lolzteam.generated.market.models.ManagingTempemailpasswordResponse;
import com.lolzteam.generated.market.models.PaymentsCurrencyResponse;
import com.lolzteam.generated.market.models.PaymentsFeeResponse;
import com.lolzteam.generated.market.models.PaymentsHistoryResponse;
import com.lolzteam.generated.market.models.PaymentsInvoiceCreateResponse;
import com.lolzteam.generated.market.models.PaymentsInvoiceGetResponse;
import com.lolzteam.generated.market.models.PaymentsInvoiceListResponse;
import com.lolzteam.generated.market.models.PaymentsPayoutservicesResponse;
import com.lolzteam.generated.market.models.ProfileClaimsResponse;
import com.lolzteam.generated.market.models.ProfileGetResponse;
import com.lolzteam.generated.market.models.ProxyGetResponse;
import com.lolzteam.generated.market.models.PublishingAddResponse;
import com.lolzteam.generated.market.models.PublishingFastsellResponse;
import com.lolzteam.generated.market.models.PurchasingConfirmResponse;
import com.lolzteam.generated.market.models.SaveChangesResponse;
import com.lolzteam.generated.market.enums.AppIdEnum;
import com.lolzteam.generated.market.enums.AutorenewalEnum;
import com.lolzteam.generated.market.enums.BirthdayAfterPeriodEnum;
import com.lolzteam.generated.market.enums.BirthdayPeriodEnum;
import com.lolzteam.generated.market.enums.CancelEnum;
import com.lolzteam.generated.market.enums.CategoryIdEnum;
import com.lolzteam.generated.market.enums.CategorynameEnum;
import com.lolzteam.generated.market.enums.ChangeEmailEnum;
import com.lolzteam.generated.market.enums.ClaimStateEnum;
import com.lolzteam.generated.market.enums.ClanEnum;
import com.lolzteam.generated.market.enums.CookiesEnum;
import com.lolzteam.generated.market.enums.Cs2MapRankEnum;
import com.lolzteam.generated.market.enums.CurrencyEnum;
import com.lolzteam.generated.market.enums.D2LastMatchDatePeriodEnum;
import com.lolzteam.generated.market.enums.DayEnum;
import com.lolzteam.generated.market.enums.Eg1Enum;
import com.lolzteam.generated.market.enums.Eg2Enum;
import com.lolzteam.generated.market.enums.Eg3Enum;
import com.lolzteam.generated.market.enums.EmailEnum;
import com.lolzteam.generated.market.enums.EmailTypeEnum;
import com.lolzteam.generated.market.enums.ExtendedGuaranteeEnum;
import com.lolzteam.generated.market.enums.FormatEnum;
import com.lolzteam.generated.market.enums.HoldLengthOptionEnum;
import com.lolzteam.generated.market.enums.ItemOrigin1Enum;
import com.lolzteam.generated.market.enums.ItemOrigin2Enum;
import com.lolzteam.generated.market.enums.LastLoginHypixelPeriodEnum;
import com.lolzteam.generated.market.enums.LastTransDatePeriodEnum;
import com.lolzteam.generated.market.enums.NitroPeriodEnum;
import com.lolzteam.generated.market.enums.NotEmailProviderEnum;
import com.lolzteam.generated.market.enums.OrderByEnum;
import com.lolzteam.generated.market.enums.PremiumEnum;
import com.lolzteam.generated.market.enums.PremiumExpirationPeriodEnum;
import com.lolzteam.generated.market.enums.RegPeriodEnum;
import com.lolzteam.generated.market.enums.RegionEnum;
import com.lolzteam.generated.market.enums.RtEnum;
import com.lolzteam.generated.market.enums.ShowEnum;
import com.lolzteam.generated.market.enums.SideEnum;
import com.lolzteam.generated.market.enums.StatusEnum;
import com.lolzteam.generated.market.enums.Subscription1Enum;
import com.lolzteam.generated.market.enums.Subscription2Enum;
import com.lolzteam.generated.market.enums.Subscription3Enum;
import com.lolzteam.generated.market.enums.Subscription4Enum;
import com.lolzteam.generated.market.enums.Subscription5Enum;
import com.lolzteam.generated.market.enums.SubscriptionPeriodEnum;
import com.lolzteam.generated.market.enums.TelEnum;
import com.lolzteam.generated.market.enums.TempEmailEnum;
import com.lolzteam.generated.market.enums.Type1Enum;
import com.lolzteam.generated.market.enums.Type2Enum;
import com.lolzteam.generated.market.enums.Type3Enum;
import com.lolzteam.generated.market.enums.Type4Enum;
import com.lolzteam.generated.market.enums.Type5Enum;
import com.lolzteam.generated.market.enums.Type6Enum;
import com.lolzteam.generated.market.enums.VerifiedEnum;

/**
 * Auto-generated MarketClient API client.
 *
 * <p>Generated from OpenAPI schema. All API methods throw checked exceptions
 * on network or API errors.</p>
 */
public class MarketClient {

    private final HttpClientInterface client;
    private final String baseUrl;
    private final ObjectMapper objectMapper;

    /**
     * Create a new MarketClient with the default base URL.
     *
     * @param client the HTTP client to use for requests
     */
    public MarketClient(HttpClientInterface client) {
        this(client, "https://prod-api.lzt.market");
    }

    /**
     * Create a new MarketClient with a custom base URL.
     *
     * @param client  the HTTP client to use for requests
     * @param baseUrl the base URL for all API requests
     */
    public MarketClient(HttpClientInterface client, String baseUrl) {
        this.client = client;
        this.baseUrl = baseUrl;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== Account publishing ====================

    /**
     * Adds and checks the account for validity.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * <p>POST /item/fast-sell</p>
     * @param allowAskDiscount allowAskDiscount (optional, nullable)
     * @param categoryId categoryId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param description description (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param extendedGuarantee extendedGuarantee (optional, nullable)
     * @param extra extra (optional, nullable)
     * @param hasEmailLoginData hasEmailLoginData (optional, nullable)
     * @param information information (optional, nullable)
     * @param itemOrigin itemOrigin (optional, nullable)
     * @param login login (optional, nullable)
     * @param loginPassword loginPassword (optional, nullable)
     * @param password password (optional, nullable)
     * @param price price (optional, nullable)
     * @param proxyId proxyId (optional, nullable)
     * @param randomProxy randomProxy (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @return PublishingFastsellResponse
     * @throws Exception on API or network error
     */
    public PublishingFastsellResponse publishingFastsell(Boolean allowAskDiscount, CategoryIdEnum categoryId, String currency, String description, String emailLoginData, EmailTypeEnum emailType, ExtendedGuaranteeEnum extendedGuarantee, String extra, Boolean hasEmailLoginData, String information, ItemOrigin2Enum itemOrigin, String login, String loginPassword, String password, Double price, Integer proxyId, String randomProxy, String title, String titleEn) throws Exception {
        String path = "/item/fast-sell";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (price != null) body.put("price", price);
        if (categoryId != null) body.put("category_id", categoryId.getValue());
        if (currency != null) body.put("currency", currency);
        if (itemOrigin != null) body.put("item_origin", itemOrigin.getValue());
        if (extendedGuarantee != null) body.put("extended_guarantee", extendedGuarantee.getValue());
        if (allowAskDiscount != null) body.put("allow_ask_discount", allowAskDiscount);
        if (proxyId != null) body.put("proxy_id", proxyId);
        if (randomProxy != null) body.put("random_proxy", randomProxy);
        if (description != null) body.put("description", description);
        if (information != null) body.put("information", information);
        if (login != null) body.put("login", login);
        if (password != null) body.put("password", password);
        if (loginPassword != null) body.put("login_password", loginPassword);
        if (hasEmailLoginData != null) body.put("has_email_login_data", hasEmailLoginData);
        if (emailLoginData != null) body.put("email_login_data", emailLoginData);
        if (emailType != null) body.put("email_type", emailType.getValue());
        if (extra != null) body.put("extra", extra);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PublishingFastsellResponse.class);
    }

    /**
     * Adds account on the market.

Required email login data categories:
+ 9 - Fortnite
+ 12 - Epic games
+ 18 - Escape from Tarkov
     *
     * <p>POST /item/add</p>
     * @param allowAskDiscount allowAskDiscount (optional, nullable)
     * @param categoryId categoryId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param description description (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param extendedGuarantee extendedGuarantee (optional, nullable)
     * @param forcetempemail forcetempemail (optional, nullable)
     * @param hasEmailLoginData hasEmailLoginData (optional, nullable)
     * @param information information (optional, nullable)
     * @param itemOrigin itemOrigin (optional, nullable)
     * @param price price (optional, nullable)
     * @param proxyId proxyId (optional, nullable)
     * @param randomProxy randomProxy (optional, nullable)
     * @param resellItemId resellItemId (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @return PublishingAddResponse
     * @throws Exception on API or network error
     */
    public PublishingAddResponse publishingAdd(Boolean allowAskDiscount, CategoryIdEnum categoryId, String currency, String description, String emailLoginData, EmailTypeEnum emailType, ExtendedGuaranteeEnum extendedGuarantee, Boolean forcetempemail, Boolean hasEmailLoginData, String information, ItemOrigin2Enum itemOrigin, Double price, Integer proxyId, String randomProxy, Integer resellItemId, String title, String titleEn) throws Exception {
        String path = "/item/add";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (price != null) body.put("price", price);
        if (categoryId != null) body.put("category_id", categoryId.getValue());
        if (currency != null) body.put("currency", currency);
        if (itemOrigin != null) body.put("item_origin", itemOrigin.getValue());
        if (extendedGuarantee != null) body.put("extended_guarantee", extendedGuarantee.getValue());
        if (description != null) body.put("description", description);
        if (information != null) body.put("information", information);
        if (forcetempemail != null) body.put("forceTempEmail", forcetempemail);
        if (resellItemId != null) body.put("resell_item_id", resellItemId);
        if (hasEmailLoginData != null) body.put("has_email_login_data", hasEmailLoginData);
        if (emailLoginData != null) body.put("email_login_data", emailLoginData);
        if (emailType != null) body.put("email_type", emailType.getValue());
        if (allowAskDiscount != null) body.put("allow_ask_discount", allowAskDiscount);
        if (proxyId != null) body.put("proxy_id", proxyId);
        if (randomProxy != null) body.put("random_proxy", randomProxy);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PublishingAddResponse.class);
    }

    /**
     * Check and put up to sale not published account OR update account information existing account.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * <p>POST /{item_id}/goods/check</p>
     * @param itemId itemId (required)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param extra extra (optional, nullable)
     * @param hasEmailLoginData hasEmailLoginData (optional, nullable)
     * @param login login (optional, nullable)
     * @param loginPassword loginPassword (optional, nullable)
     * @param password password (optional, nullable)
     * @param randomProxy randomProxy (optional, nullable)
     * @param resellItemId resellItemId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse publishingCheck(Integer itemId, String emailLoginData, EmailTypeEnum emailType, String extra, Boolean hasEmailLoginData, String login, String loginPassword, String password, Boolean randomProxy, Integer resellItemId) throws Exception {
        String path = "/{item_id}/goods/check";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (resellItemId != null) body.put("resell_item_id", resellItemId);
        if (randomProxy != null) body.put("random_proxy", randomProxy);
        if (login != null) body.put("login", login);
        if (password != null) body.put("password", password);
        if (loginPassword != null) body.put("login_password", loginPassword);
        if (hasEmailLoginData != null) body.put("has_email_login_data", hasEmailLoginData);
        if (emailLoginData != null) body.put("email_login_data", emailLoginData);
        if (emailType != null) body.put("email_type", emailType.getValue());
        if (extra != null) body.put("extra", extra);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Check and add an external account to your item.

&gt; ❗️ Please note that if you're linking a Social Club account to Steam, it will update the last activity on your account (This is a limitation of Steam). If Social Club Games does not have a linked account, do not enter any data.
     *
     * <p>POST /{item_id}/external-account</p>
     * @param itemId itemId (required)
     * @param cookies cookies (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param login login (optional, nullable)
     * @param type type (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse publishingExternal(Integer itemId, String cookies, String emailLoginData, String login, Type5Enum type) throws Exception {
        String path = "/{item_id}/external-account";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (type != null) body.put("type", type.getValue());
        if (login != null) body.put("login", login);
        if (emailLoginData != null) body.put("email_login_data", emailLoginData);
        if (cookies != null) body.put("cookies", cookies);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Account purchasing ====================

    /**
     * Check and buy account.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * <p>POST /{item_id}/fast-buy</p>
     * @param itemId itemId (required)
     * @param balanceId balanceId (optional, nullable)
     * @param price price (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse purchasingFastbuy(Integer itemId, Integer balanceId, Double price) throws Exception {
        String path = "/{item_id}/fast-buy";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (price != null) body.put("price", price);
        if (balanceId != null) body.put("balance_id", balanceId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Checking account for validity.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times).
     *
     * <p>POST /{item_id}/check-account</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse purchasingCheck(Integer itemId) throws Exception {
        String path = "/{item_id}/check-account";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Confirm buy.

&gt; ❗️ This method doesn't check account for validity. If you want to confirm validity before buying, you should use [FastBuy](https://lzt-market.readme.io/reference/purchasingfastbuy) method
     *
     * <p>POST /{item_id}/confirm-buy</p>
     * @param itemId itemId (required)
     * @param balanceId balanceId (optional, nullable)
     * @param price price (optional, nullable)
     * @return PurchasingConfirmResponse
     * @throws Exception on API or network error
     */
    public PurchasingConfirmResponse purchasingConfirm(Integer itemId, Integer balanceId, Integer price) throws Exception {
        String path = "/{item_id}/confirm-buy";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (price != null) body.put("price", price);
        if (balanceId != null) body.put("balance_id", balanceId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PurchasingConfirmResponse.class);
    }

    /**
     * Request a discount for the specified item.
     *
     * <p>POST /{item_id}/discount</p>
     * @param itemId itemId (required)
     * @param discountPrice discountPrice (optional, nullable)
     * @param message message (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse purchasingDiscountrequest(Integer itemId, Double discountPrice, String message) throws Exception {
        String path = "/{item_id}/discount";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (discountPrice != null) body.put("discount_price", discountPrice);
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Cancel a requested discount for the specified item.
     *
     * <p>DELETE /{item_id}/discount</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse purchasingDiscountcancel(Integer itemId) throws Exception {
        String path = "/{item_id}/discount";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Accounts list ====================

    /**
     * Displays a list of user accounts.
     *
     * <p>GET /user/items</p>
     * @param categoryId categoryId (optional, nullable)
     * @param deleteEnddate deleteEnddate (optional, nullable)
     * @param deleteReason deleteReason (optional, nullable)
     * @param deleteStartdate deleteStartdate (optional, nullable)
     * @param filterByBuyerOperationDate filterByBuyerOperationDate (optional, nullable)
     * @param filterByDeleteDate filterByDeleteDate (optional, nullable)
     * @param filterByPublishedDate filterByPublishedDate (optional, nullable)
     * @param login login (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param paidEnddate paidEnddate (optional, nullable)
     * @param paidStartdate paidStartdate (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publishedEnddate publishedEnddate (optional, nullable)
     * @param publishedStartdate publishedStartdate (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param show show (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param username username (optional, nullable)
     * @return Itemlistmodel
     * @throws Exception on API or network error
     */
    public Itemlistmodel listUser(String categoryId, String deleteEnddate, String deleteReason, String deleteStartdate, Boolean filterByBuyerOperationDate, Boolean filterByDeleteDate, Boolean filterByPublishedDate, String login, java.util.List<String> notOrigin, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, String paidEnddate, String paidStartdate, Integer pmax, Integer pmin, String publishedEnddate, String publishedStartdate, Boolean sb, Boolean sbByMe, ShowEnum show, String title, Integer userId, String username) throws Exception {
        String path = "/user/items";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (categoryId != null) queryParams.put("category_id", String.valueOf(categoryId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (show != null) queryParams.put("show", show.getValue());
        if (deleteReason != null) queryParams.put("delete_reason", String.valueOf(deleteReason));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (login != null) queryParams.put("login", String.valueOf(login));
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (username != null) queryParams.put("username", String.valueOf(username));
        if (publishedStartdate != null) queryParams.put("published_startDate", String.valueOf(publishedStartdate));
        if (publishedEnddate != null) queryParams.put("published_endDate", String.valueOf(publishedEnddate));
        if (filterByPublishedDate != null) queryParams.put("filter_by_published_date", filterByPublishedDate ? "1" : "0");
        if (paidStartdate != null) queryParams.put("paid_startDate", String.valueOf(paidStartdate));
        if (paidEnddate != null) queryParams.put("paid_endDate", String.valueOf(paidEnddate));
        if (filterByBuyerOperationDate != null) queryParams.put("filter_by_buyer_operation_date", filterByBuyerOperationDate ? "1" : "0");
        if (deleteStartdate != null) queryParams.put("delete_startDate", String.valueOf(deleteStartdate));
        if (deleteEnddate != null) queryParams.put("delete_endDate", String.valueOf(deleteEnddate));
        if (filterByDeleteDate != null) queryParams.put("filter_by_delete_date", filterByDeleteDate ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Itemlistmodel.class);
    }

    /**
     * Displays a list of purchased accounts.
     *
     * <p>GET /user/orders</p>
     * @param categoryId categoryId (optional, nullable)
     * @param login login (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param show show (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return Itemlistmodel
     * @throws Exception on API or network error
     */
    public Itemlistmodel listOrders(String categoryId, String login, java.util.List<String> notOrigin, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Integer pmax, Integer pmin, Boolean sb, Boolean sbByMe, ShowEnum show, String title, Integer userId) throws Exception {
        String path = "/user/orders";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (categoryId != null) queryParams.put("category_id", String.valueOf(categoryId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (show != null) queryParams.put("show", show.getValue());
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (login != null) queryParams.put("login", String.valueOf(login));
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Itemlistmodel.class);
    }

    /**
     * Returns the states of user items.
     *
     * <p>GET /user/item-states</p>
     * @param userId userId (optional, nullable)
     * @return ListStatesResponse
     * @throws Exception on API or network error
     */
    public ListStatesResponse listStates(Integer userId) throws Exception {
        String path = "/user/item-states";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ListStatesResponse.class);
    }

    /**
     * Download accounts data in the specified format.
     *
     * <p>GET /user/{type}/download</p>
     * @param type type (required)
     * @param categoryId categoryId (optional, nullable)
     * @param customFormat customFormat (optional, nullable)
     * @param deleteEnddate deleteEnddate (optional, nullable)
     * @param deleteReason deleteReason (optional, nullable)
     * @param deleteStartdate deleteStartdate (optional, nullable)
     * @param filterByBuyerOperationDate filterByBuyerOperationDate (optional, nullable)
     * @param filterByDeleteDate filterByDeleteDate (optional, nullable)
     * @param filterByPublishedDate filterByPublishedDate (optional, nullable)
     * @param format format (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param paidEnddate paidEnddate (optional, nullable)
     * @param paidStartdate paidStartdate (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publishedEnddate publishedEnddate (optional, nullable)
     * @param publishedStartdate publishedStartdate (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param show show (optional, nullable)
     * @param title title (optional, nullable)
     * @param username username (optional, nullable)
     * @return String
     * @throws Exception on API or network error
     */
    public String listDownload(Type1Enum type, String categoryId, String customFormat, String deleteEnddate, String deleteReason, String deleteStartdate, Boolean filterByBuyerOperationDate, Boolean filterByDeleteDate, Boolean filterByPublishedDate, FormatEnum format, java.util.List<String> notOrigin, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, String paidEnddate, String paidStartdate, Integer pmax, Integer pmin, String publishedEnddate, String publishedStartdate, Boolean sb, Boolean sbByMe, ShowEnum show, String title, String username) throws Exception {
        String path = "/user/{type}/download";
        path = path.replace("{type}", String.valueOf(type));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (format != null) queryParams.put("format", format.getValue());
        if (customFormat != null) queryParams.put("custom_format", String.valueOf(customFormat));
        if (categoryId != null) queryParams.put("category_id", String.valueOf(categoryId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (show != null) queryParams.put("show", show.getValue());
        if (deleteReason != null) queryParams.put("delete_reason", String.valueOf(deleteReason));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (username != null) queryParams.put("username", String.valueOf(username));
        if (publishedStartdate != null) queryParams.put("published_startDate", String.valueOf(publishedStartdate));
        if (publishedEnddate != null) queryParams.put("published_endDate", String.valueOf(publishedEnddate));
        if (filterByPublishedDate != null) queryParams.put("filter_by_published_date", filterByPublishedDate ? "1" : "0");
        if (paidStartdate != null) queryParams.put("paid_startDate", String.valueOf(paidStartdate));
        if (paidEnddate != null) queryParams.put("paid_endDate", String.valueOf(paidEnddate));
        if (filterByBuyerOperationDate != null) queryParams.put("filter_by_buyer_operation_date", filterByBuyerOperationDate ? "1" : "0");
        if (deleteStartdate != null) queryParams.put("delete_startDate", String.valueOf(deleteStartdate));
        if (deleteEnddate != null) queryParams.put("delete_endDate", String.valueOf(deleteEnddate));
        if (filterByDeleteDate != null) queryParams.put("filter_by_delete_date", filterByDeleteDate ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return response;
    }

    /**
     * Displays a list of favourites accounts.
     *
     * <p>GET /fave</p>
     * @param notOrigin notOrigin (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param show show (optional, nullable)
     * @param title title (optional, nullable)
     * @return Itemlistmodel
     * @throws Exception on API or network error
     */
    public Itemlistmodel listFavorites(java.util.List<String> notOrigin, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Integer pmax, Integer pmin, Boolean sb, Boolean sbByMe, ShowEnum show, String title) throws Exception {
        String path = "/fave";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (show != null) queryParams.put("show", show.getValue());
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Itemlistmodel.class);
    }

    /**
     * Displays a list of viewed accounts.
     *
     * <p>GET /viewed</p>
     * @param notOrigin notOrigin (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param show show (optional, nullable)
     * @param title title (optional, nullable)
     * @return Itemlistmodel
     * @throws Exception on API or network error
     */
    public Itemlistmodel listViewed(java.util.List<String> notOrigin, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Integer pmax, Integer pmin, Boolean sb, Boolean sbByMe, ShowEnum show, String title) throws Exception {
        String path = "/viewed";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (show != null) queryParams.put("show", show.getValue());
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Itemlistmodel.class);
    }

    // ==================== Accounts managing ====================

    /**
     * Displays account information.
     *
     * <p>GET /{item_id}</p>
     * @param itemId itemId (required)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @return ManagingGetResponse
     * @throws Exception on API or network error
     */
    public ManagingGetResponse managingGet(Integer itemId, Boolean parseSameItemIds) throws Exception {
        String path = "/{item_id}";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingGetResponse.class);
    }

    /**
     * Deletes your account from public search. Deletion type is soft. You can restore account after deletion if you want.
     *
     * <p>DELETE /{item_id}</p>
     * @param itemId itemId (required)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse mangingDelete(Integer itemId, String reason) throws Exception {
        String path = "/{item_id}";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (reason != null) body.put("reason", reason);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Returns a list of claims filed against you.
     *
     * <p>GET /claims</p>
     * @param claimState claimState (optional, nullable)
     * @param type type (optional, nullable)
     * @return ProfileClaimsResponse
     * @throws Exception on API or network error
     */
    public ProfileClaimsResponse profileClaims(ClaimStateEnum claimState, Type2Enum type) throws Exception {
        String path = "/claims";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        if (claimState != null) queryParams.put("claim_state", claimState.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfileClaimsResponse.class);
    }

    /**
     * Create a claim.
     *
     * <p>POST /claims</p>
     * @param itemId itemId (optional, nullable)
     * @param postBody postBody (optional, nullable)
     * @return ManagingCreateclaimResponse
     * @throws Exception on API or network error
     */
    public ManagingCreateclaimResponse managingCreateclaim(String itemId, String postBody) throws Exception {
        String path = "/claims";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (itemId != null) body.put("item_id", itemId);
        if (postBody != null) body.put("post_body", postBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ManagingCreateclaimResponse.class);
    }

    /**
     * Bulk get up to 250 accounts.
     *
     * <p>POST /bulk/items</p>
     * @param itemId itemId (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @return ManagingBulkgetResponse
     * @throws Exception on API or network error
     */
    public ManagingBulkgetResponse managingBulkget(java.util.List<String> itemId, Boolean parseSameItemIds) throws Exception {
        String path = "/bulk/items";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (itemId != null) {
            for (int i = 0; i < itemId.size(); i++) {
                body.put("item_id[" + i + "]", String.valueOf(itemId.get(i)));
            }
        }
        if (parseSameItemIds != null) body.put("parse_same_item_ids", parseSameItemIds);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ManagingBulkgetResponse.class);
    }

    /**
     * Gets Account steam inventory value.
     *
     * <p>GET /{item_id}/inventory-value</p>
     * @param itemId itemId (required)
     * @param appId appId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param ignoreCache ignoreCache (optional, nullable)
     * @return ManagingSteaminventoryvalueResponse
     * @throws Exception on API or network error
     */
    public ManagingSteaminventoryvalueResponse managingSteaminventoryvalue(Integer itemId, AppIdEnum appId, String currency, Boolean ignoreCache) throws Exception {
        String path = "/{item_id}/inventory-value";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (appId != null) queryParams.put("app_id", appId.getValue());
        if (currency != null) queryParams.put("currency", String.valueOf(currency));
        if (ignoreCache != null) queryParams.put("ignore_cache", ignoreCache ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingSteaminventoryvalueResponse.class);
    }

    /**
     * Gets steam inventory value.
&gt; 📘 This method is rate limited. You can send 20 requests per minute (3s delay between requests)
     *
     * <p>GET /steam-value</p>
     * @param link link (required)
     * @param appId appId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param ignoreCache ignoreCache (optional, nullable)
     * @return ManagingSteamvalueResponse
     * @throws Exception on API or network error
     */
    public ManagingSteamvalueResponse managingSteamvalue(String link, AppIdEnum appId, String currency, Boolean ignoreCache) throws Exception {
        String path = "/steam-value";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (link != null) queryParams.put("link", String.valueOf(link));
        if (appId != null) queryParams.put("app_id", appId.getValue());
        if (currency != null) queryParams.put("currency", String.valueOf(currency));
        if (ignoreCache != null) queryParams.put("ignore_cache", ignoreCache ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingSteamvalueResponse.class);
    }

    /**
     * Returns Steam account profile/games preview.
     *
     * <p>GET /{item_id}/steam-preview</p>
     * @param itemId itemId (required)
     * @param type type (optional, nullable)
     * @return String
     * @throws Exception on API or network error
     */
    public String managingSteampreview(Integer itemId, Type3Enum type) throws Exception {
        String path = "/{item_id}/steam-preview";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        String response = client.get(url, null, queryParams);
        return response;
    }

    /**
     * Edits any details of account.
     *
     * <p>PUT /{item_id}/edit</p>
     * @param itemId itemId (required)
     * @param allowAskDiscount allowAskDiscount (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param description description (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param information information (optional, nullable)
     * @param itemOrigin itemOrigin (optional, nullable)
     * @param price price (optional, nullable)
     * @param proxyId proxyId (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingEdit(Integer itemId, Boolean allowAskDiscount, String currency, String description, String emailLoginData, EmailTypeEnum emailType, String information, ItemOrigin1Enum itemOrigin, Integer price, Integer proxyId, String title, String titleEn) throws Exception {
        String path = "/{item_id}/edit";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (price != null) body.put("price", price);
        if (currency != null) body.put("currency", currency);
        if (itemOrigin != null) body.put("item_origin", itemOrigin.getValue());
        if (emailLoginData != null) body.put("email_login_data", emailLoginData);
        if (emailType != null) body.put("email_type", emailType.getValue());
        if (allowAskDiscount != null) body.put("allow_ask_discount", allowAskDiscount);
        if (proxyId != null) body.put("proxy_id", proxyId);
        if (description != null) body.put("description", description);
        if (information != null) body.put("information", information);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get AI-suggested price for the account.
     *
     * <p>GET /{item_id}/ai-price</p>
     * @param itemId itemId (required)
     * @return ManagingAipriceResponse
     * @throws Exception on API or network error
     */
    public ManagingAipriceResponse managingAiprice(Integer itemId) throws Exception {
        String path = "/{item_id}/ai-price";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingAipriceResponse.class);
    }

    /**
     * Get auto buy price for the account.
     *
     * <p>GET /{item_id}/auto-buy-price</p>
     * @param itemId itemId (required)
     * @return ManagingAutobuypriceResponse
     * @throws Exception on API or network error
     */
    public ManagingAutobuypriceResponse managingAutobuyprice(Integer itemId) throws Exception {
        String path = "/{item_id}/auto-buy-price";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingAutobuypriceResponse.class);
    }

    /**
     * Edits a note for the account.
     *
     * <p>POST /{item_id}/note-save</p>
     * @param itemId itemId (required)
     * @param text text (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingNote(Integer itemId, String text) throws Exception {
        String path = "/{item_id}/note-save";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (text != null) body.put("text", text);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Update inventory value.
     *
     * <p>POST /{item_id}/update-inventory</p>
     * @param itemId itemId (required)
     * @param all all (optional, nullable)
     * @param appId appId (optional, nullable)
     * @param authorize authorize (optional, nullable)
     * @return ManagingSteamupdatevalueResponse
     * @throws Exception on API or network error
     */
    public ManagingSteamupdatevalueResponse managingSteamupdatevalue(Integer itemId, Boolean all, AppIdEnum appId, Boolean authorize) throws Exception {
        String path = "/{item_id}/update-inventory";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (all != null) body.put("all", all);
        if (appId != null) body.put("app_id", appId.getValue());
        if (authorize != null) body.put("authorize", authorize);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ManagingSteamupdatevalueResponse.class);
    }

    /**
     * Bumps account in the search.
     *
     * <p>POST /{item_id}/bump</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingBump(Integer itemId) throws Exception {
        String path = "/{item_id}/bump";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Enables/edits automatic bumping for the specified account.
     *
     * <p>POST /{item_id}/auto-bump</p>
     * @param itemId itemId (required)
     * @param hour hour (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingAutobump(Integer itemId, Integer hour) throws Exception {
        String path = "/{item_id}/auto-bump";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (hour != null) body.put("hour", hour);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Disables automatic bumping for the specified account.
     *
     * <p>DELETE /{item_id}/auto-bump</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingAutobumpdisable(Integer itemId) throws Exception {
        String path = "/{item_id}/auto-bump";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Opens account.
     *
     * <p>POST /{item_id}/open</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingOpen(Integer itemId) throws Exception {
        String path = "/{item_id}/open";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Closes account.
     *
     * <p>POST /{item_id}/close</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingClose(Integer itemId) throws Exception {
        String path = "/{item_id}/close";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get account image.
     *
     * <p>GET /{item_id}/image</p>
     * @param itemId itemId (required)
     * @param type type (required)
     * @return ManagingImageResponse
     * @throws Exception on API or network error
     */
    public ManagingImageResponse managingImage(Integer itemId, Type4Enum type) throws Exception {
        String path = "/{item_id}/image";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingImageResponse.class);
    }

    /**
     * Gets confirmation code or link.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)
     *
     * <p>GET /{item_id}/email-code</p>
     * @param itemId itemId (required)
     * @return Confirmationcodemodel
     * @throws Exception on API or network error
     */
    public Confirmationcodemodel managingEmailcode(Integer itemId) throws Exception {
        String path = "/{item_id}/email-code";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Confirmationcodemodel.class);
    }

    /**
     * Returns account letters.

&gt; ❗️ If you receive a "retry_request" error, you should repeat the same request (up to a maximum of 100 times)
     *
     * <p>GET /letters2</p>
     * @param email email (optional, nullable)
     * @param emailPassword emailPassword (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param password password (optional, nullable)
     * @return ManagingGetletters2Response
     * @throws Exception on API or network error
     */
    public ManagingGetletters2Response managingGetletters2(String email, String emailPassword, Integer limit, String password) throws Exception {
        String path = "/letters2";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (emailPassword != null) queryParams.put("email_password", String.valueOf(emailPassword));
        if (email != null) queryParams.put("email", String.valueOf(email));
        if (password != null) queryParams.put("password", String.valueOf(password));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingGetletters2Response.class);
    }

    /**
     * Returns steam mafile.
&gt; ❗️ This action is cancelling active account guarantee
     *
     * <p>GET /{item_id}/mafile</p>
     * @param itemId itemId (required)
     * @return ManagingSteamGetmafileResponse
     * @throws Exception on API or network error
     */
    public ManagingSteamGetmafileResponse managingSteamGetmafile(Integer itemId) throws Exception {
        String path = "/{item_id}/mafile";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingSteamGetmafileResponse.class);
    }

    /**
     * Add a new Steam mafile to the account.
     *
     * <p>POST /{item_id}/mafile</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingSteamAddmafile(Integer itemId) throws Exception {
        String path = "/{item_id}/mafile";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Remove steam mafile.
&gt; ❗️ This will unlink the authenticator from the account and remove mafile from the item
     *
     * <p>DELETE /{item_id}/mafile</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingSteamRemovemafile(Integer itemId) throws Exception {
        String path = "/{item_id}/mafile";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Gets confirmation code from MaFile (Only for Steam accounts).
     *
     * <p>GET /{item_id}/guard-code</p>
     * @param itemId itemId (required)
     * @return Confirmationcodemodel
     * @throws Exception on API or network error
     */
    public Confirmationcodemodel managingSteammafilecode(Integer itemId) throws Exception {
        String path = "/{item_id}/guard-code";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, Confirmationcodemodel.class);
    }

    /**
     * Confirm steam action. 

 Don't set **id** and **nonce** parameters to get list of available confirmation requests. 

&gt; ❗️ This action is cancelling active account guarantee
     *
     * <p>POST /{item_id}/confirm-sda</p>
     * @param itemId itemId (required)
     * @param id id (optional, nullable)
     * @param nonce nonce (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingSteamsda(Integer itemId, Integer id, Integer nonce) throws Exception {
        String path = "/{item_id}/confirm-sda";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (id != null) body.put("id", id);
        if (nonce != null) body.put("nonce", nonce);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Gets confirmation code from Telegram.
     *
     * <p>GET /{item_id}/telegram-login-code</p>
     * @param itemId itemId (required)
     * @return ManagingTelegramcodeResponse
     * @throws Exception on API or network error
     */
    public ManagingTelegramcodeResponse managingTelegramcode(Integer itemId) throws Exception {
        String path = "/{item_id}/telegram-login-code";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingTelegramcodeResponse.class);
    }

    /**
     * Resets Telegram authorizations.
     *
     * <p>POST /{item_id}/telegram-reset-authorizations</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingTelegramresetauth(Integer itemId) throws Exception {
        String path = "/{item_id}/telegram-reset-authorizations";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Cancel guarantee of account. It can be useful for account reselling.
     *
     * <p>POST /{item_id}/refuse-guarantee</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingRefuseguarantee(Integer itemId) throws Exception {
        String path = "/{item_id}/refuse-guarantee";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Waiver of the requirement to record a video and any claims regarding this account.
     *
     * <p>POST /{item_id}/decline-video-recording</p>
     * @param itemId itemId (required)
     * @param iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingDeclinevideorecording(Integer itemId, Boolean iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem) throws Exception {
        String path = "/{item_id}/decline-video-recording";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem != null) body.put("i_voluntarily_and_with_full_awareness_of_my_actions_waive_any_claims_regarding_this_item", iVoluntarilyAndWithFullAwarenessOfMyActionsWaiveAnyClaimsRegardingThisItem);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Checks the guarantee and cancels it if there are reasons to cancel it.
     *
     * <p>POST /{item_id}/check-guarantee</p>
     * @param itemId itemId (required)
     * @return ManagingCheckguaranteeResponse
     * @throws Exception on API or network error
     */
    public ManagingCheckguaranteeResponse managingCheckguarantee(Integer itemId) throws Exception {
        String path = "/{item_id}/check-guarantee";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ManagingCheckguaranteeResponse.class);
    }

    /**
     * Changes password of account.
     *
     * <p>POST /{item_id}/change-password</p>
     * @param itemId itemId (required)
     * @param cancel cancel (optional, nullable)
     * @return ManagingChangepasswordResponse
     * @throws Exception on API or network error
     */
    public ManagingChangepasswordResponse managingChangepassword(Integer itemId, CancelEnum cancel) throws Exception {
        String path = "/{item_id}/change-password";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (cancel != null) body.put("_cancel", cancel.getValue());
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ManagingChangepasswordResponse.class);
    }

    /**
     * Gets password from temp email of account. After calling of this method, the guarantee will be cancelled and you cannot automatically resell account.
&gt; ❗️ This action is cancelling active account guarantee
     *
     * <p>GET /{item_id}/temp-email-password</p>
     * @param itemId itemId (required)
     * @return ManagingTempemailpasswordResponse
     * @throws Exception on API or network error
     */
    public ManagingTempemailpasswordResponse managingTempemailpassword(Integer itemId) throws Exception {
        String path = "/{item_id}/temp-email-password";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ManagingTempemailpasswordResponse.class);
    }

    /**
     * Adds a tag to the specified account.
     *
     * <p>POST /{item_id}/tag</p>
     * @param itemId itemId (required)
     * @param tagId tagId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingTag(Integer itemId, Integer tagId) throws Exception {
        String path = "/{item_id}/tag";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (tagId != null) body.put("tag_id", tagId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Removes a tag from from the specified account.
     *
     * <p>DELETE /{item_id}/tag</p>
     * @param itemId itemId (required)
     * @param tagId tagId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingUntag(Integer itemId, Integer tagId) throws Exception {
        String path = "/{item_id}/tag";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (tagId != null) body.put("tag_id", tagId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Adds a public tag to the specified account.
     *
     * <p>POST /{item_id}/public-tag</p>
     * @param itemId itemId (required)
     * @param tagId tagId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingPublictag(Integer itemId, Integer tagId) throws Exception {
        String path = "/{item_id}/public-tag";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (tagId != null) body.put("tag_id", tagId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Removes a public tag from the specified account.
     *
     * <p>DELETE /{item_id}/public-tag</p>
     * @param itemId itemId (required)
     * @param tagId tagId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingPublicuntag(Integer itemId, Integer tagId) throws Exception {
        String path = "/{item_id}/public-tag";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (tagId != null) body.put("tag_id", tagId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Adds account to favorites.
     *
     * <p>POST /{item_id}/star</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingFavorite(Integer itemId) throws Exception {
        String path = "/{item_id}/star";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Delete account from favorites.
     *
     * <p>DELETE /{item_id}/star</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingUnfavorite(Integer itemId) throws Exception {
        String path = "/{item_id}/star";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Stick account in the top of search.
     *
     * <p>POST /{item_id}/stick</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingStick(Integer itemId) throws Exception {
        String path = "/{item_id}/stick";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unstick account from the top of search.
     *
     * <p>DELETE /{item_id}/stick</p>
     * @param itemId itemId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingUnstick(Integer itemId) throws Exception {
        String path = "/{item_id}/stick";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Transfer account to another user.
     *
     * <p>POST /{item_id}/change-owner</p>
     * @param itemId itemId (required)
     * @param secretAnswer secretAnswer (optional, nullable)
     * @param username username (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse managingTransfer(Integer itemId, String secretAnswer, String username) throws Exception {
        String path = "/{item_id}/change-owner";
        path = path.replace("{item_id}", String.valueOf(itemId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (username != null) body.put("username", username);
        if (secretAnswer != null) body.put("secret_answer", secretAnswer);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Batch requests ====================

    /**
     * Execute multiple API requests at once (separated by comma). Maximum batch jobs is 10.
Following methods are unavailable in Batch:
- GET /{item_id}/image
- /item/fast-sell
     *
     * <p>POST /batch</p>
     * @param jobs jobs (required)
     * @return BatchResponse
     * @throws Exception on API or network error
     */
    public BatchResponse batch(java.util.List<java.util.Map<String, Object>> jobs) throws Exception {
        String path = "/batch";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.postJsonRaw(url, null, queryParams, jobs);
        return objectMapper.readValue(response, BatchResponse.class);
    }

    // ==================== Cart ====================

    /**
     * Returns the list of items currently in your cart.
     *
     * <p>GET /cart</p>
     * @param categoryId categoryId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse cartGet(String categoryId, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/cart";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (categoryId != null) queryParams.put("category_id", String.valueOf(categoryId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Adds item to your cart.
     *
     * <p>POST /cart</p>
     * @param itemId itemId (optional, nullable)
     * @return CartAddResponse
     * @throws Exception on API or network error
     */
    public CartAddResponse cartAdd(String itemId) throws Exception {
        String path = "/cart";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (itemId != null) body.put("item_id", itemId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, CartAddResponse.class);
    }

    /**
     * Deletes an item from the cart.
     *
     * <p>DELETE /cart</p>
     * @param itemId itemId (optional, nullable)
     * @return CartDeleteResponse
     * @throws Exception on API or network error
     */
    public CartDeleteResponse cartDelete(String itemId) throws Exception {
        String path = "/cart";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (itemId != null) body.put("item_id", itemId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, CartDeleteResponse.class);
    }

    // ==================== Categories ====================

    /**
     * Display category list.
     *
     * <p>GET /category</p>
     * @param topQueries topQueries (optional, nullable)
     * @return CategoryListResponse
     * @throws Exception on API or network error
     */
    public CategoryListResponse categoryList(Boolean topQueries) throws Exception {
        String path = "/category";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (topQueries != null) queryParams.put("top_queries", topQueries ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryListResponse.class);
    }

    /**
     * Displays search parameters for a category.
     *
     * <p>GET /{categoryName}/params</p>
     * @param categoryname categoryname (required)
     * @return CategoryParamsResponse
     * @throws Exception on API or network error
     */
    public CategoryParamsResponse categoryParams(CategorynameEnum categoryname) throws Exception {
        String path = "/{categoryName}/params";
        path = path.replace("{categoryName}", String.valueOf(categoryname));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryParamsResponse.class);
    }

    /**
     * Displays a list of games in the category.
     *
     * <p>GET /{categoryName}/games</p>
     * @param categoryname categoryname (required)
     * @return CategoryGamesResponse
     * @throws Exception on API or network error
     */
    public CategoryGamesResponse categoryGames(CategorynameEnum categoryname) throws Exception {
        String path = "/{categoryName}/games";
        path = path.replace("{categoryName}", String.valueOf(categoryname));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryGamesResponse.class);
    }

    // ==================== Category Search ====================

    /**
     * Displays a list of latest accounts.
     *
     * <p>GET /</p>
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse categoryAll(CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /steam</p>
     * @param balanceMax balanceMax (optional, nullable)
     * @param balanceMin balanceMin (optional, nullable)
     * @param cardsGamesMax cardsGamesMax (optional, nullable)
     * @param cardsGamesMin cardsGamesMin (optional, nullable)
     * @param cardsMax cardsMax (optional, nullable)
     * @param cardsMin cardsMin (optional, nullable)
     * @param country country (optional, nullable)
     * @param cs2MapRank cs2MapRank (optional, nullable)
     * @param cs2MapRmax cs2MapRmax (optional, nullable)
     * @param cs2MapRmin cs2MapRmin (optional, nullable)
     * @param cs2ProfileRankMax cs2ProfileRankMax (optional, nullable)
     * @param cs2ProfileRankMin cs2ProfileRankMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param d2BehaviorMax d2BehaviorMax (optional, nullable)
     * @param d2BehaviorMin d2BehaviorMin (optional, nullable)
     * @param d2GameCountMax d2GameCountMax (optional, nullable)
     * @param d2GameCountMin d2GameCountMin (optional, nullable)
     * @param d2LastMatchDate d2LastMatchDate (optional, nullable)
     * @param d2LastMatchDatePeriod d2LastMatchDatePeriod (optional, nullable)
     * @param d2WinCountMax d2WinCountMax (optional, nullable)
     * @param d2WinCountMin d2WinCountMin (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param eg eg (optional, nullable)
     * @param eloMax eloMax (optional, nullable)
     * @param eloMin eloMin (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param faceitCsgoLvlMax faceitCsgoLvlMax (optional, nullable)
     * @param faceitCsgoLvlMin faceitCsgoLvlMin (optional, nullable)
     * @param faceitLvlMax faceitLvlMax (optional, nullable)
     * @param faceitLvlMin faceitLvlMin (optional, nullable)
     * @param friendsMax friendsMax (optional, nullable)
     * @param friendsMin friendsMin (optional, nullable)
     * @param game game (optional, nullable)
     * @param gamesPurchaseMax gamesPurchaseMax (optional, nullable)
     * @param gamesPurchaseMin gamesPurchaseMin (optional, nullable)
     * @param gift gift (optional, nullable)
     * @param giftMax giftMax (optional, nullable)
     * @param giftMin giftMin (optional, nullable)
     * @param giftsPurchaseMax giftsPurchaseMax (optional, nullable)
     * @param giftsPurchaseMin giftsPurchaseMin (optional, nullable)
     * @param gmax gmax (optional, nullable)
     * @param gmin gmin (optional, nullable)
     * @param hasActivatedKeys hasActivatedKeys (optional, nullable)
     * @param hasFaceit hasFaceit (optional, nullable)
     * @param hoursPlayed hoursPlayed (optional, nullable)
     * @param hoursPlayedMax hoursPlayedMax (optional, nullable)
     * @param ingamePurchaseMax ingamePurchaseMax (optional, nullable)
     * @param ingamePurchaseMin ingamePurchaseMin (optional, nullable)
     * @param invGame invGame (optional, nullable)
     * @param invMax invMax (optional, nullable)
     * @param invMin invMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param lastTransDate lastTransDate (optional, nullable)
     * @param lastTransDateLater lastTransDateLater (optional, nullable)
     * @param lastTransDatePeriod lastTransDatePeriod (optional, nullable)
     * @param lastTransDatePeriodLater lastTransDatePeriodLater (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param lmax lmax (optional, nullable)
     * @param lmin lmin (optional, nullable)
     * @param mafile mafile (optional, nullable)
     * @param medalId medalId (optional, nullable)
     * @param medalMax medalMax (optional, nullable)
     * @param medalMin medalMin (optional, nullable)
     * @param medalOperatorOr medalOperatorOr (optional, nullable)
     * @param mmBan mmBan (optional, nullable)
     * @param noTrans noTrans (optional, nullable)
     * @param noVac noVac (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param pointsMax pointsMax (optional, nullable)
     * @param pointsMin pointsMin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param purchaseMax purchaseMax (optional, nullable)
     * @param purchaseMin purchaseMin (optional, nullable)
     * @param recentlyHoursMax recentlyHoursMax (optional, nullable)
     * @param recentlyHoursMin recentlyHoursMin (optional, nullable)
     * @param refundsPurchaseMax refundsPurchaseMax (optional, nullable)
     * @param refundsPurchaseMin refundsPurchaseMin (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param relevantGmax relevantGmax (optional, nullable)
     * @param relevantGmin relevantGmin (optional, nullable)
     * @param rmax rmax (optional, nullable)
     * @param rmin rmin (optional, nullable)
     * @param rt rt (optional, nullable)
     * @param rustDeathsMax rustDeathsMax (optional, nullable)
     * @param rustDeathsMin rustDeathsMin (optional, nullable)
     * @param rustKillsMax rustKillsMax (optional, nullable)
     * @param rustKillsMin rustKillsMin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param skipVacInv skipVacInv (optional, nullable)
     * @param solommrMax solommrMax (optional, nullable)
     * @param solommrMin solommrMin (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param tradeBan tradeBan (optional, nullable)
     * @param tradeLimit tradeLimit (optional, nullable)
     * @param trans trans (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param vac vac (optional, nullable)
     * @param vacSkipGameCheck vacSkipGameCheck (optional, nullable)
     * @param winCountMax winCountMax (optional, nullable)
     * @param winCountMin winCountMin (optional, nullable)
     * @param wingmanRmax wingmanRmax (optional, nullable)
     * @param wingmanRmin wingmanRmin (optional, nullable)
     * @return CategorySteamResponse
     * @throws Exception on API or network error
     */
    public CategorySteamResponse categorySteam(Integer balanceMax, Integer balanceMin, Integer cardsGamesMax, Integer cardsGamesMin, Integer cardsMax, Integer cardsMin, java.util.List<String> country, Cs2MapRankEnum cs2MapRank, Integer cs2MapRmax, Integer cs2MapRmin, Integer cs2ProfileRankMax, Integer cs2ProfileRankMin, CurrencyEnum currency, Integer d2BehaviorMax, Integer d2BehaviorMin, Integer d2GameCountMax, Integer d2GameCountMin, Integer d2LastMatchDate, D2LastMatchDatePeriodEnum d2LastMatchDatePeriod, Integer d2WinCountMax, Integer d2WinCountMin, Integer daybreak, Eg1Enum eg, Integer eloMax, Integer eloMin, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer faceitCsgoLvlMax, Integer faceitCsgoLvlMin, Integer faceitLvlMax, Integer faceitLvlMin, Integer friendsMax, Integer friendsMin, java.util.List<Integer> game, Double gamesPurchaseMax, Double gamesPurchaseMin, java.util.List<String> gift, Integer giftMax, Integer giftMin, Double giftsPurchaseMax, Double giftsPurchaseMin, Integer gmax, Integer gmin, String hasActivatedKeys, String hasFaceit, java.util.Map<String, String> hoursPlayed, java.util.Map<String, String> hoursPlayedMax, Double ingamePurchaseMax, Double ingamePurchaseMin, Integer invGame, Double invMax, Double invMin, String itemDomain, Integer lastTransDate, Integer lastTransDateLater, LastTransDatePeriodEnum lastTransDatePeriod, String lastTransDatePeriodLater, String limit, Integer lmax, Integer lmin, String mafile, java.util.List<Integer> medalId, Integer medalMax, Integer medalMin, Boolean medalOperatorOr, String mmBan, Boolean noTrans, Boolean noVac, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer pointsMax, Integer pointsMin, java.util.List<Integer> publicTagId, Double purchaseMax, Double purchaseMin, Integer recentlyHoursMax, Integer recentlyHoursMin, Double refundsPurchaseMax, Double refundsPurchaseMin, Integer reg, RegPeriodEnum regPeriod, Integer relevantGmax, Integer relevantGmin, Integer rmax, Integer rmin, RtEnum rt, Integer rustDeathsMax, Integer rustDeathsMin, Integer rustKillsMax, Integer rustKillsMin, Boolean sb, Boolean sbByMe, Boolean skipVacInv, Integer solommrMax, Integer solommrMin, java.util.List<Integer> tagId, String title, String tradeBan, String tradeLimit, Boolean trans, Integer userId, java.util.List<Integer> vac, Boolean vacSkipGameCheck, Integer winCountMax, Integer winCountMin, Integer wingmanRmax, Integer wingmanRmin) throws Exception {
        String path = "/steam";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        if (hoursPlayed != null) queryParams.put("hours_played", String.valueOf(hoursPlayed));
        if (hoursPlayedMax != null) queryParams.put("hours_played_max", String.valueOf(hoursPlayedMax));
        if (eg != null) queryParams.put("eg", eg.getValue());
        if (vac != null) {
            for (int i = 0; i < vac.size(); i++) {
                queryParams.put("vac[][" + i + "]", String.valueOf(vac.get(i)));
            }
        }
        if (vacSkipGameCheck != null) queryParams.put("vac_skip_game_check", vacSkipGameCheck ? "1" : "0");
        if (rt != null) queryParams.put("rt", rt.getValue());
        if (tradeBan != null) queryParams.put("trade_ban", String.valueOf(tradeBan));
        if (tradeLimit != null) queryParams.put("trade_limit", String.valueOf(tradeLimit));
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (mafile != null) queryParams.put("mafile", String.valueOf(mafile));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (lmin != null) queryParams.put("lmin", String.valueOf(lmin));
        if (lmax != null) queryParams.put("lmax", String.valueOf(lmax));
        if (rmin != null) queryParams.put("rmin", String.valueOf(rmin));
        if (rmax != null) queryParams.put("rmax", String.valueOf(rmax));
        if (wingmanRmin != null) queryParams.put("wingman_rmin", String.valueOf(wingmanRmin));
        if (wingmanRmax != null) queryParams.put("wingman_rmax", String.valueOf(wingmanRmax));
        if (noVac != null) queryParams.put("no_vac", noVac ? "1" : "0");
        if (mmBan != null) queryParams.put("mm_ban", String.valueOf(mmBan));
        if (balanceMin != null) queryParams.put("balance_min", String.valueOf(balanceMin));
        if (balanceMax != null) queryParams.put("balance_max", String.valueOf(balanceMax));
        if (invGame != null) queryParams.put("inv_game", String.valueOf(invGame));
        if (invMin != null) queryParams.put("inv_min", String.valueOf(invMin));
        if (invMax != null) queryParams.put("inv_max", String.valueOf(invMax));
        if (friendsMin != null) queryParams.put("friends_min", String.valueOf(friendsMin));
        if (friendsMax != null) queryParams.put("friends_max", String.valueOf(friendsMax));
        if (gmin != null) queryParams.put("gmin", String.valueOf(gmin));
        if (gmax != null) queryParams.put("gmax", String.valueOf(gmax));
        if (winCountMin != null) queryParams.put("win_count_min", String.valueOf(winCountMin));
        if (winCountMax != null) queryParams.put("win_count_max", String.valueOf(winCountMax));
        if (medalId != null) {
            for (int i = 0; i < medalId.size(); i++) {
                queryParams.put("medal_id[][" + i + "]", String.valueOf(medalId.get(i)));
            }
        }
        if (medalOperatorOr != null) queryParams.put("medal_operator_or", medalOperatorOr ? "1" : "0");
        if (medalMin != null) queryParams.put("medal_min", String.valueOf(medalMin));
        if (medalMax != null) queryParams.put("medal_max", String.valueOf(medalMax));
        if (gift != null) {
            for (int i = 0; i < gift.size(); i++) {
                queryParams.put("gift[][" + i + "]", String.valueOf(gift.get(i)));
            }
        }
        if (giftMin != null) queryParams.put("gift_min", String.valueOf(giftMin));
        if (giftMax != null) queryParams.put("gift_max", String.valueOf(giftMax));
        if (recentlyHoursMin != null) queryParams.put("recently_hours_min", String.valueOf(recentlyHoursMin));
        if (recentlyHoursMax != null) queryParams.put("recently_hours_max", String.valueOf(recentlyHoursMax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (cs2ProfileRankMin != null) queryParams.put("cs2_profile_rank_min", String.valueOf(cs2ProfileRankMin));
        if (cs2ProfileRankMax != null) queryParams.put("cs2_profile_rank_max", String.valueOf(cs2ProfileRankMax));
        if (solommrMin != null) queryParams.put("solommr_min", String.valueOf(solommrMin));
        if (solommrMax != null) queryParams.put("solommr_max", String.valueOf(solommrMax));
        if (d2GameCountMin != null) queryParams.put("d2_game_count_min", String.valueOf(d2GameCountMin));
        if (d2GameCountMax != null) queryParams.put("d2_game_count_max", String.valueOf(d2GameCountMax));
        if (d2WinCountMin != null) queryParams.put("d2_win_count_min", String.valueOf(d2WinCountMin));
        if (d2WinCountMax != null) queryParams.put("d2_win_count_max", String.valueOf(d2WinCountMax));
        if (d2BehaviorMin != null) queryParams.put("d2_behavior_min", String.valueOf(d2BehaviorMin));
        if (d2BehaviorMax != null) queryParams.put("d2_behavior_max", String.valueOf(d2BehaviorMax));
        if (faceitLvlMin != null) queryParams.put("faceit_lvl_min", String.valueOf(faceitLvlMin));
        if (faceitLvlMax != null) queryParams.put("faceit_lvl_max", String.valueOf(faceitLvlMax));
        if (pointsMin != null) queryParams.put("points_min", String.valueOf(pointsMin));
        if (pointsMax != null) queryParams.put("points_max", String.valueOf(pointsMax));
        if (relevantGmin != null) queryParams.put("relevant_gmin", String.valueOf(relevantGmin));
        if (relevantGmax != null) queryParams.put("relevant_gmax", String.valueOf(relevantGmax));
        if (lastTransDate != null) queryParams.put("last_trans_date", String.valueOf(lastTransDate));
        if (lastTransDatePeriod != null) queryParams.put("last_trans_date_period", lastTransDatePeriod.getValue());
        if (lastTransDateLater != null) queryParams.put("last_trans_date_later", String.valueOf(lastTransDateLater));
        if (lastTransDatePeriodLater != null) queryParams.put("last_trans_date_period_later", String.valueOf(lastTransDatePeriodLater));
        if (noTrans != null) queryParams.put("no_trans", noTrans ? "1" : "0");
        if (trans != null) queryParams.put("trans", trans ? "1" : "0");
        if (giftsPurchaseMin != null) queryParams.put("gifts_purchase_min", String.valueOf(giftsPurchaseMin));
        if (giftsPurchaseMax != null) queryParams.put("gifts_purchase_max", String.valueOf(giftsPurchaseMax));
        if (refundsPurchaseMin != null) queryParams.put("refunds_purchase_min", String.valueOf(refundsPurchaseMin));
        if (refundsPurchaseMax != null) queryParams.put("refunds_purchase_max", String.valueOf(refundsPurchaseMax));
        if (ingamePurchaseMin != null) queryParams.put("ingame_purchase_min", String.valueOf(ingamePurchaseMin));
        if (ingamePurchaseMax != null) queryParams.put("ingame_purchase_max", String.valueOf(ingamePurchaseMax));
        if (gamesPurchaseMin != null) queryParams.put("games_purchase_min", String.valueOf(gamesPurchaseMin));
        if (gamesPurchaseMax != null) queryParams.put("games_purchase_max", String.valueOf(gamesPurchaseMax));
        if (purchaseMin != null) queryParams.put("purchase_min", String.valueOf(purchaseMin));
        if (purchaseMax != null) queryParams.put("purchase_max", String.valueOf(purchaseMax));
        if (hasActivatedKeys != null) queryParams.put("has_activated_keys", String.valueOf(hasActivatedKeys));
        if (eloMin != null) queryParams.put("elo_min", String.valueOf(eloMin));
        if (eloMax != null) queryParams.put("elo_max", String.valueOf(eloMax));
        if (cs2MapRank != null) queryParams.put("cs2_map_rank", cs2MapRank.getValue());
        if (cs2MapRmin != null) queryParams.put("cs2_map_rmin", String.valueOf(cs2MapRmin));
        if (cs2MapRmax != null) queryParams.put("cs2_map_rmax", String.valueOf(cs2MapRmax));
        if (hasFaceit != null) queryParams.put("has_faceit", String.valueOf(hasFaceit));
        if (faceitCsgoLvlMin != null) queryParams.put("faceit_csgo_lvl_min", String.valueOf(faceitCsgoLvlMin));
        if (faceitCsgoLvlMax != null) queryParams.put("faceit_csgo_lvl_max", String.valueOf(faceitCsgoLvlMax));
        if (rustDeathsMin != null) queryParams.put("rust_deaths_min", String.valueOf(rustDeathsMin));
        if (rustDeathsMax != null) queryParams.put("rust_deaths_max", String.valueOf(rustDeathsMax));
        if (rustKillsMin != null) queryParams.put("rust_kills_min", String.valueOf(rustKillsMin));
        if (rustKillsMax != null) queryParams.put("rust_kills_max", String.valueOf(rustKillsMax));
        if (d2LastMatchDate != null) queryParams.put("d2_last_match_date", String.valueOf(d2LastMatchDate));
        if (d2LastMatchDatePeriod != null) queryParams.put("d2_last_match_date_period", d2LastMatchDatePeriod.getValue());
        if (cardsMin != null) queryParams.put("cards_min", String.valueOf(cardsMin));
        if (cardsMax != null) queryParams.put("cards_max", String.valueOf(cardsMax));
        if (cardsGamesMin != null) queryParams.put("cards_games_min", String.valueOf(cardsGamesMin));
        if (cardsGamesMax != null) queryParams.put("cards_games_max", String.valueOf(cardsGamesMax));
        if (skipVacInv != null) queryParams.put("skip_vac_inv", skipVacInv ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategorySteamResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /fortnite</p>
     * @param bp bp (optional, nullable)
     * @param bpLmax bpLmax (optional, nullable)
     * @param bpLmin bpLmin (optional, nullable)
     * @param changeEmail changeEmail (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param dance dance (optional, nullable)
     * @param dancesShopMax dancesShopMax (optional, nullable)
     * @param dancesShopMin dancesShopMin (optional, nullable)
     * @param dancesShopVbmax dancesShopVbmax (optional, nullable)
     * @param dancesShopVbmin dancesShopVbmin (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param dmax dmax (optional, nullable)
     * @param dmin dmin (optional, nullable)
     * @param eg eg (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param glider glider (optional, nullable)
     * @param glidersShopMax glidersShopMax (optional, nullable)
     * @param glidersShopMin glidersShopMin (optional, nullable)
     * @param glidersShopVbmax glidersShopVbmax (optional, nullable)
     * @param glidersShopVbmin glidersShopVbmin (optional, nullable)
     * @param gmax gmax (optional, nullable)
     * @param gmin gmin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param lastTransDate lastTransDate (optional, nullable)
     * @param lastTransDatePeriod lastTransDatePeriod (optional, nullable)
     * @param lmax lmax (optional, nullable)
     * @param lmin lmin (optional, nullable)
     * @param noTrans noTrans (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pickaxe pickaxe (optional, nullable)
     * @param pickaxeMax pickaxeMax (optional, nullable)
     * @param pickaxeMin pickaxeMin (optional, nullable)
     * @param pickaxesShopMax pickaxesShopMax (optional, nullable)
     * @param pickaxesShopMin pickaxesShopMin (optional, nullable)
     * @param pickaxesShopVbmax pickaxesShopVbmax (optional, nullable)
     * @param pickaxesShopVbmin pickaxesShopVbmin (optional, nullable)
     * @param platform platform (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param psnLinkable psnLinkable (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param refundCreditsMax refundCreditsMax (optional, nullable)
     * @param refundCreditsMin refundCreditsMin (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param rlPurchases rlPurchases (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param skin skin (optional, nullable)
     * @param skinsShopMax skinsShopMax (optional, nullable)
     * @param skinsShopMin skinsShopMin (optional, nullable)
     * @param skinsShopVbmax skinsShopVbmax (optional, nullable)
     * @param skinsShopVbmin skinsShopVbmin (optional, nullable)
     * @param smax smax (optional, nullable)
     * @param smin smin (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tempEmail tempEmail (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param vbmax vbmax (optional, nullable)
     * @param vbmin vbmin (optional, nullable)
     * @param xboxLinkable xboxLinkable (optional, nullable)
     * @return CategoryFortniteResponse
     * @throws Exception on API or network error
     */
    public CategoryFortniteResponse categoryFortnite(String bp, Integer bpLmax, Integer bpLmin, ChangeEmailEnum changeEmail, java.util.List<String> country, CurrencyEnum currency, java.util.List<String> dance, Integer dancesShopMax, Integer dancesShopMin, Integer dancesShopVbmax, Integer dancesShopVbmin, Integer daybreak, Integer dmax, Integer dmin, Eg2Enum eg, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, java.util.List<String> glider, Integer glidersShopMax, Integer glidersShopMin, Integer glidersShopVbmax, Integer glidersShopVbmin, Integer gmax, Integer gmin, String itemDomain, Integer lastTransDate, LastTransDatePeriodEnum lastTransDatePeriod, Integer lmax, Integer lmin, Boolean noTrans, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, java.util.List<String> pickaxe, Integer pickaxeMax, Integer pickaxeMin, Integer pickaxesShopMax, Integer pickaxesShopMin, Integer pickaxesShopVbmax, Integer pickaxesShopVbmin, java.util.List<String> platform, Integer pmax, Integer pmin, String psnLinkable, java.util.List<Integer> publicTagId, Integer refundCreditsMax, Integer refundCreditsMin, Integer reg, RegPeriodEnum regPeriod, Boolean rlPurchases, Boolean sb, Boolean sbByMe, java.util.List<String> skin, Integer skinsShopMax, Integer skinsShopMin, Integer skinsShopVbmax, Integer skinsShopVbmin, Integer smax, Integer smin, java.util.List<Integer> tagId, TempEmailEnum tempEmail, String title, Integer userId, Integer vbmax, Integer vbmin, String xboxLinkable) throws Exception {
        String path = "/fortnite";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (tempEmail != null) queryParams.put("temp_email", tempEmail.getValue());
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (eg != null) queryParams.put("eg", eg.getValue());
        if (smin != null) queryParams.put("smin", String.valueOf(smin));
        if (smax != null) queryParams.put("smax", String.valueOf(smax));
        if (vbmin != null) queryParams.put("vbmin", String.valueOf(vbmin));
        if (vbmax != null) queryParams.put("vbmax", String.valueOf(vbmax));
        if (skin != null) {
            for (int i = 0; i < skin.size(); i++) {
                queryParams.put("skin[][" + i + "]", String.valueOf(skin.get(i)));
            }
        }
        if (pickaxe != null) {
            for (int i = 0; i < pickaxe.size(); i++) {
                queryParams.put("pickaxe[][" + i + "]", String.valueOf(pickaxe.get(i)));
            }
        }
        if (glider != null) {
            for (int i = 0; i < glider.size(); i++) {
                queryParams.put("glider[][" + i + "]", String.valueOf(glider.get(i)));
            }
        }
        if (dance != null) {
            for (int i = 0; i < dance.size(); i++) {
                queryParams.put("dance[][" + i + "]", String.valueOf(dance.get(i)));
            }
        }
        if (changeEmail != null) queryParams.put("change_email", changeEmail.getValue());
        if (platform != null) {
            for (int i = 0; i < platform.size(); i++) {
                queryParams.put("platform[][" + i + "]", String.valueOf(platform.get(i)));
            }
        }
        if (skinsShopMin != null) queryParams.put("skins_shop_min", String.valueOf(skinsShopMin));
        if (skinsShopMax != null) queryParams.put("skins_shop_max", String.valueOf(skinsShopMax));
        if (pickaxesShopMin != null) queryParams.put("pickaxes_shop_min", String.valueOf(pickaxesShopMin));
        if (pickaxesShopMax != null) queryParams.put("pickaxes_shop_max", String.valueOf(pickaxesShopMax));
        if (dancesShopMin != null) queryParams.put("dances_shop_min", String.valueOf(dancesShopMin));
        if (dancesShopMax != null) queryParams.put("dances_shop_max", String.valueOf(dancesShopMax));
        if (glidersShopMin != null) queryParams.put("gliders_shop_min", String.valueOf(glidersShopMin));
        if (glidersShopMax != null) queryParams.put("gliders_shop_max", String.valueOf(glidersShopMax));
        if (skinsShopVbmin != null) queryParams.put("skins_shop_vbmin", String.valueOf(skinsShopVbmin));
        if (skinsShopVbmax != null) queryParams.put("skins_shop_vbmax", String.valueOf(skinsShopVbmax));
        if (pickaxesShopVbmin != null) queryParams.put("pickaxes_shop_vbmin", String.valueOf(pickaxesShopVbmin));
        if (pickaxesShopVbmax != null) queryParams.put("pickaxes_shop_vbmax", String.valueOf(pickaxesShopVbmax));
        if (dancesShopVbmin != null) queryParams.put("dances_shop_vbmin", String.valueOf(dancesShopVbmin));
        if (dancesShopVbmax != null) queryParams.put("dances_shop_vbmax", String.valueOf(dancesShopVbmax));
        if (glidersShopVbmin != null) queryParams.put("gliders_shop_vbmin", String.valueOf(glidersShopVbmin));
        if (glidersShopVbmax != null) queryParams.put("gliders_shop_vbmax", String.valueOf(glidersShopVbmax));
        if (bp != null) queryParams.put("bp", String.valueOf(bp));
        if (lmin != null) queryParams.put("lmin", String.valueOf(lmin));
        if (lmax != null) queryParams.put("lmax", String.valueOf(lmax));
        if (bpLmin != null) queryParams.put("bp_lmin", String.valueOf(bpLmin));
        if (bpLmax != null) queryParams.put("bp_lmax", String.valueOf(bpLmax));
        if (lastTransDate != null) queryParams.put("last_trans_date", String.valueOf(lastTransDate));
        if (lastTransDatePeriod != null) queryParams.put("last_trans_date_period", lastTransDatePeriod.getValue());
        if (noTrans != null) queryParams.put("no_trans", noTrans ? "1" : "0");
        if (xboxLinkable != null) queryParams.put("xbox_linkable", String.valueOf(xboxLinkable));
        if (psnLinkable != null) queryParams.put("psn_linkable", String.valueOf(psnLinkable));
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (rlPurchases != null) queryParams.put("rl_purchases", rlPurchases ? "1" : "0");
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (refundCreditsMin != null) queryParams.put("refund_credits_min", String.valueOf(refundCreditsMin));
        if (refundCreditsMax != null) queryParams.put("refund_credits_max", String.valueOf(refundCreditsMax));
        if (pickaxeMin != null) queryParams.put("pickaxe_min", String.valueOf(pickaxeMin));
        if (pickaxeMax != null) queryParams.put("pickaxe_max", String.valueOf(pickaxeMax));
        if (dmin != null) queryParams.put("dmin", String.valueOf(dmin));
        if (dmax != null) queryParams.put("dmax", String.valueOf(dmax));
        if (gmin != null) queryParams.put("gmin", String.valueOf(gmin));
        if (gmax != null) queryParams.put("gmax", String.valueOf(gmax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryFortniteResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /mihoyo</p>
     * @param cinemasMax cinemasMax (optional, nullable)
     * @param cinemasMin cinemasMin (optional, nullable)
     * @param constellationsMax constellationsMax (optional, nullable)
     * @param constellationsMin constellationsMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param ea ea (optional, nullable)
     * @param eidolonsMax eidolonsMax (optional, nullable)
     * @param eidolonsMin eidolonsMin (optional, nullable)
     * @param email email (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param genshinAchievementMax genshinAchievementMax (optional, nullable)
     * @param genshinAchievementMin genshinAchievementMin (optional, nullable)
     * @param genshinCharMax genshinCharMax (optional, nullable)
     * @param genshinCharMin genshinCharMin (optional, nullable)
     * @param genshinCharacter genshinCharacter (optional, nullable)
     * @param genshinCharacterConstellations genshinCharacterConstellations (optional, nullable)
     * @param genshinCharacterConstellationsMax genshinCharacterConstellationsMax (optional, nullable)
     * @param genshinCurrencyMax genshinCurrencyMax (optional, nullable)
     * @param genshinCurrencyMin genshinCurrencyMin (optional, nullable)
     * @param genshinLegendaryMax genshinLegendaryMax (optional, nullable)
     * @param genshinLegendaryMin genshinLegendaryMin (optional, nullable)
     * @param genshinLegendaryWeaponMax genshinLegendaryWeaponMax (optional, nullable)
     * @param genshinLegendaryWeaponMin genshinLegendaryWeaponMin (optional, nullable)
     * @param genshinLevelMax genshinLevelMax (optional, nullable)
     * @param genshinLevelMin genshinLevelMin (optional, nullable)
     * @param genshinWeapon genshinWeapon (optional, nullable)
     * @param honkaiAchievementMax honkaiAchievementMax (optional, nullable)
     * @param honkaiAchievementMin honkaiAchievementMin (optional, nullable)
     * @param honkaiCharMax honkaiCharMax (optional, nullable)
     * @param honkaiCharMin honkaiCharMin (optional, nullable)
     * @param honkaiCharacter honkaiCharacter (optional, nullable)
     * @param honkaiCharacterEidolons honkaiCharacterEidolons (optional, nullable)
     * @param honkaiCharacterEidolonsMax honkaiCharacterEidolonsMax (optional, nullable)
     * @param honkaiCurrencyMax honkaiCurrencyMax (optional, nullable)
     * @param honkaiCurrencyMin honkaiCurrencyMin (optional, nullable)
     * @param honkaiLegendaryMax honkaiLegendaryMax (optional, nullable)
     * @param honkaiLegendaryMin honkaiLegendaryMin (optional, nullable)
     * @param honkaiLegendaryWeaponMax honkaiLegendaryWeaponMax (optional, nullable)
     * @param honkaiLegendaryWeaponMin honkaiLegendaryWeaponMin (optional, nullable)
     * @param honkaiLevelMax honkaiLevelMax (optional, nullable)
     * @param honkaiLevelMin honkaiLevelMin (optional, nullable)
     * @param honkaiWeapon honkaiWeapon (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notRegion notRegion (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param region region (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param zenlessAchievementMax zenlessAchievementMax (optional, nullable)
     * @param zenlessAchievementMin zenlessAchievementMin (optional, nullable)
     * @param zenlessCharMax zenlessCharMax (optional, nullable)
     * @param zenlessCharMin zenlessCharMin (optional, nullable)
     * @param zenlessCharacter zenlessCharacter (optional, nullable)
     * @param zenlessCharacterCinemas zenlessCharacterCinemas (optional, nullable)
     * @param zenlessCharacterCinemasMax zenlessCharacterCinemasMax (optional, nullable)
     * @param zenlessCurrencyMax zenlessCurrencyMax (optional, nullable)
     * @param zenlessCurrencyMin zenlessCurrencyMin (optional, nullable)
     * @param zenlessLegendaryMax zenlessLegendaryMax (optional, nullable)
     * @param zenlessLegendaryMin zenlessLegendaryMin (optional, nullable)
     * @param zenlessLegendaryWeaponMax zenlessLegendaryWeaponMax (optional, nullable)
     * @param zenlessLegendaryWeaponMin zenlessLegendaryWeaponMin (optional, nullable)
     * @param zenlessLevelMax zenlessLevelMax (optional, nullable)
     * @param zenlessLevelMin zenlessLevelMin (optional, nullable)
     * @param zenlessWeapon zenlessWeapon (optional, nullable)
     * @return CategoryMihoyoResponse
     * @throws Exception on API or network error
     */
    public CategoryMihoyoResponse categoryMihoyo(Integer cinemasMax, Integer cinemasMin, Integer constellationsMax, Integer constellationsMin, CurrencyEnum currency, Integer daybreak, String ea, Integer eidolonsMax, Integer eidolonsMin, EmailEnum email, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer genshinAchievementMax, Integer genshinAchievementMin, Integer genshinCharMax, Integer genshinCharMin, java.util.List<Integer> genshinCharacter, java.util.Map<String, String> genshinCharacterConstellations, java.util.Map<String, String> genshinCharacterConstellationsMax, Integer genshinCurrencyMax, Integer genshinCurrencyMin, Integer genshinLegendaryMax, Integer genshinLegendaryMin, Integer genshinLegendaryWeaponMax, Integer genshinLegendaryWeaponMin, Integer genshinLevelMax, Integer genshinLevelMin, java.util.List<Integer> genshinWeapon, Integer honkaiAchievementMax, Integer honkaiAchievementMin, Integer honkaiCharMax, Integer honkaiCharMin, java.util.List<Integer> honkaiCharacter, java.util.Map<String, String> honkaiCharacterEidolons, java.util.Map<String, String> honkaiCharacterEidolonsMax, Integer honkaiCurrencyMax, Integer honkaiCurrencyMin, Integer honkaiLegendaryMax, Integer honkaiLegendaryMin, Integer honkaiLegendaryWeaponMax, Integer honkaiLegendaryWeaponMin, Integer honkaiLevelMax, Integer honkaiLevelMin, java.util.List<Integer> honkaiWeapon, String itemDomain, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<String> notRegion, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, java.util.List<String> region, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId, Integer zenlessAchievementMax, Integer zenlessAchievementMin, Integer zenlessCharMax, Integer zenlessCharMin, java.util.List<Integer> zenlessCharacter, java.util.Map<String, String> zenlessCharacterCinemas, java.util.Map<String, String> zenlessCharacterCinemasMax, Integer zenlessCurrencyMax, Integer zenlessCurrencyMin, Integer zenlessLegendaryMax, Integer zenlessLegendaryMin, Integer zenlessLegendaryWeaponMax, Integer zenlessLegendaryWeaponMin, Integer zenlessLevelMax, Integer zenlessLevelMin, java.util.List<Integer> zenlessWeapon) throws Exception {
        String path = "/mihoyo";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (email != null) queryParams.put("email", email.getValue());
        if (ea != null) queryParams.put("ea", String.valueOf(ea));
        if (region != null) {
            for (int i = 0; i < region.size(); i++) {
                queryParams.put("region[" + i + "]", String.valueOf(region.get(i)));
            }
        }
        if (notRegion != null) {
            for (int i = 0; i < notRegion.size(); i++) {
                queryParams.put("not_region[" + i + "]", String.valueOf(notRegion.get(i)));
            }
        }
        if (genshinCharacter != null) {
            for (int i = 0; i < genshinCharacter.size(); i++) {
                queryParams.put("genshin_character[][" + i + "]", String.valueOf(genshinCharacter.get(i)));
            }
        }
        if (genshinCharacterConstellations != null) queryParams.put("genshin_character_constellations", String.valueOf(genshinCharacterConstellations));
        if (genshinCharacterConstellationsMax != null) queryParams.put("genshin_character_constellations_max", String.valueOf(genshinCharacterConstellationsMax));
        if (genshinWeapon != null) {
            for (int i = 0; i < genshinWeapon.size(); i++) {
                queryParams.put("genshin_weapon[][" + i + "]", String.valueOf(genshinWeapon.get(i)));
            }
        }
        if (genshinCharMin != null) queryParams.put("genshin_char_min", String.valueOf(genshinCharMin));
        if (genshinCharMax != null) queryParams.put("genshin_char_max", String.valueOf(genshinCharMax));
        if (genshinLegendaryMin != null) queryParams.put("genshin_legendary_min", String.valueOf(genshinLegendaryMin));
        if (genshinLegendaryMax != null) queryParams.put("genshin_legendary_max", String.valueOf(genshinLegendaryMax));
        if (genshinLevelMin != null) queryParams.put("genshin_level_min", String.valueOf(genshinLevelMin));
        if (genshinLevelMax != null) queryParams.put("genshin_level_max", String.valueOf(genshinLevelMax));
        if (genshinLegendaryWeaponMin != null) queryParams.put("genshin_legendary_weapon_min", String.valueOf(genshinLegendaryWeaponMin));
        if (genshinLegendaryWeaponMax != null) queryParams.put("genshin_legendary_weapon_max", String.valueOf(genshinLegendaryWeaponMax));
        if (constellationsMin != null) queryParams.put("constellations_min", String.valueOf(constellationsMin));
        if (constellationsMax != null) queryParams.put("constellations_max", String.valueOf(constellationsMax));
        if (genshinAchievementMin != null) queryParams.put("genshin_achievement_min", String.valueOf(genshinAchievementMin));
        if (genshinAchievementMax != null) queryParams.put("genshin_achievement_max", String.valueOf(genshinAchievementMax));
        if (genshinCurrencyMin != null) queryParams.put("genshin_currency_min", String.valueOf(genshinCurrencyMin));
        if (genshinCurrencyMax != null) queryParams.put("genshin_currency_max", String.valueOf(genshinCurrencyMax));
        if (honkaiCharacter != null) {
            for (int i = 0; i < honkaiCharacter.size(); i++) {
                queryParams.put("honkai_character[][" + i + "]", String.valueOf(honkaiCharacter.get(i)));
            }
        }
        if (honkaiCharacterEidolons != null) queryParams.put("honkai_character_eidolons", String.valueOf(honkaiCharacterEidolons));
        if (honkaiCharacterEidolonsMax != null) queryParams.put("honkai_character_eidolons_max", String.valueOf(honkaiCharacterEidolonsMax));
        if (honkaiWeapon != null) {
            for (int i = 0; i < honkaiWeapon.size(); i++) {
                queryParams.put("honkai_weapon[][" + i + "]", String.valueOf(honkaiWeapon.get(i)));
            }
        }
        if (honkaiCharMin != null) queryParams.put("honkai_char_min", String.valueOf(honkaiCharMin));
        if (honkaiCharMax != null) queryParams.put("honkai_char_max", String.valueOf(honkaiCharMax));
        if (honkaiLegendaryMin != null) queryParams.put("honkai_legendary_min", String.valueOf(honkaiLegendaryMin));
        if (honkaiLegendaryMax != null) queryParams.put("honkai_legendary_max", String.valueOf(honkaiLegendaryMax));
        if (honkaiLevelMin != null) queryParams.put("honkai_level_min", String.valueOf(honkaiLevelMin));
        if (honkaiLevelMax != null) queryParams.put("honkai_level_max", String.valueOf(honkaiLevelMax));
        if (honkaiLegendaryWeaponMin != null) queryParams.put("honkai_legendary_weapon_min", String.valueOf(honkaiLegendaryWeaponMin));
        if (honkaiLegendaryWeaponMax != null) queryParams.put("honkai_legendary_weapon_max", String.valueOf(honkaiLegendaryWeaponMax));
        if (eidolonsMin != null) queryParams.put("eidolons_min", String.valueOf(eidolonsMin));
        if (eidolonsMax != null) queryParams.put("eidolons_max", String.valueOf(eidolonsMax));
        if (honkaiAchievementMin != null) queryParams.put("honkai_achievement_min", String.valueOf(honkaiAchievementMin));
        if (honkaiAchievementMax != null) queryParams.put("honkai_achievement_max", String.valueOf(honkaiAchievementMax));
        if (honkaiCurrencyMin != null) queryParams.put("honkai_currency_min", String.valueOf(honkaiCurrencyMin));
        if (honkaiCurrencyMax != null) queryParams.put("honkai_currency_max", String.valueOf(honkaiCurrencyMax));
        if (zenlessCharacter != null) {
            for (int i = 0; i < zenlessCharacter.size(); i++) {
                queryParams.put("zenless_character[][" + i + "]", String.valueOf(zenlessCharacter.get(i)));
            }
        }
        if (zenlessCharacterCinemas != null) queryParams.put("zenless_character_cinemas", String.valueOf(zenlessCharacterCinemas));
        if (zenlessCharacterCinemasMax != null) queryParams.put("zenless_character_cinemas_max", String.valueOf(zenlessCharacterCinemasMax));
        if (zenlessWeapon != null) {
            for (int i = 0; i < zenlessWeapon.size(); i++) {
                queryParams.put("zenless_weapon[][" + i + "]", String.valueOf(zenlessWeapon.get(i)));
            }
        }
        if (zenlessLegendaryMin != null) queryParams.put("zenless_legendary_min", String.valueOf(zenlessLegendaryMin));
        if (zenlessLegendaryMax != null) queryParams.put("zenless_legendary_max", String.valueOf(zenlessLegendaryMax));
        if (cinemasMin != null) queryParams.put("cinemas_min", String.valueOf(cinemasMin));
        if (cinemasMax != null) queryParams.put("cinemas_max", String.valueOf(cinemasMax));
        if (zenlessLegendaryWeaponMin != null) queryParams.put("zenless_legendary_weapon_min", String.valueOf(zenlessLegendaryWeaponMin));
        if (zenlessLegendaryWeaponMax != null) queryParams.put("zenless_legendary_weapon_max", String.valueOf(zenlessLegendaryWeaponMax));
        if (zenlessCharMin != null) queryParams.put("zenless_char_min", String.valueOf(zenlessCharMin));
        if (zenlessCharMax != null) queryParams.put("zenless_char_max", String.valueOf(zenlessCharMax));
        if (zenlessLevelMin != null) queryParams.put("zenless_level_min", String.valueOf(zenlessLevelMin));
        if (zenlessLevelMax != null) queryParams.put("zenless_level_max", String.valueOf(zenlessLevelMax));
        if (zenlessAchievementMin != null) queryParams.put("zenless_achievement_min", String.valueOf(zenlessAchievementMin));
        if (zenlessAchievementMax != null) queryParams.put("zenless_achievement_max", String.valueOf(zenlessAchievementMax));
        if (zenlessCurrencyMin != null) queryParams.put("zenless_currency_min", String.valueOf(zenlessCurrencyMin));
        if (zenlessCurrencyMax != null) queryParams.put("zenless_currency_max", String.valueOf(zenlessCurrencyMax));
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryMihoyoResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /riot</p>
     * @param agent agent (optional, nullable)
     * @param amax amax (optional, nullable)
     * @param amin amin (optional, nullable)
     * @param blueMax blueMax (optional, nullable)
     * @param blueMin blueMin (optional, nullable)
     * @param buddy buddy (optional, nullable)
     * @param champion champion (optional, nullable)
     * @param championMax championMax (optional, nullable)
     * @param championMin championMin (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param email email (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param faMax faMax (optional, nullable)
     * @param faMin faMin (optional, nullable)
     * @param invMax invMax (optional, nullable)
     * @param invMin invMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param knife knife (optional, nullable)
     * @param lastRmax lastRmax (optional, nullable)
     * @param lastRmin lastRmin (optional, nullable)
     * @param lolLevelMax lolLevelMax (optional, nullable)
     * @param lolLevelMin lolLevelMin (optional, nullable)
     * @param lolNotRegion lolNotRegion (optional, nullable)
     * @param lolRank lolRank (optional, nullable)
     * @param lolRegion lolRegion (optional, nullable)
     * @param lolSmax lolSmax (optional, nullable)
     * @param lolSmin lolSmin (optional, nullable)
     * @param mythicMax mythicMax (optional, nullable)
     * @param mythicMin mythicMin (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orangeMax orangeMax (optional, nullable)
     * @param orangeMin orangeMin (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param previousRmax previousRmax (optional, nullable)
     * @param previousRmin previousRmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param riotMax riotMax (optional, nullable)
     * @param riotMin riotMin (optional, nullable)
     * @param rmax rmax (optional, nullable)
     * @param rmin rmin (optional, nullable)
     * @param rpMax rpMax (optional, nullable)
     * @param rpMin rpMin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param skin skin (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param valorantKnifeMax valorantKnifeMax (optional, nullable)
     * @param valorantKnifeMin valorantKnifeMin (optional, nullable)
     * @param valorantLevelMax valorantLevelMax (optional, nullable)
     * @param valorantLevelMin valorantLevelMin (optional, nullable)
     * @param valorantNotRegion valorantNotRegion (optional, nullable)
     * @param valorantRankType valorantRankType (optional, nullable)
     * @param valorantRegion valorantRegion (optional, nullable)
     * @param valorantSmax valorantSmax (optional, nullable)
     * @param valorantSmin valorantSmin (optional, nullable)
     * @param vpMax vpMax (optional, nullable)
     * @param vpMin vpMin (optional, nullable)
     * @param weaponskin weaponskin (optional, nullable)
     * @param winRateMax winRateMax (optional, nullable)
     * @param winRateMin winRateMin (optional, nullable)
     * @return CategoryRiotResponse
     * @throws Exception on API or network error
     */
    public CategoryRiotResponse categoryRiot(java.util.List<String> agent, Integer amax, Integer amin, Integer blueMax, Integer blueMin, java.util.List<String> buddy, java.util.List<String> champion, Integer championMax, Integer championMin, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, EmailEnum email, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer faMax, Integer faMin, Integer invMax, Integer invMin, String itemDomain, Boolean knife, Integer lastRmax, Integer lastRmin, Integer lolLevelMax, Integer lolLevelMin, java.util.List<String> lolNotRegion, java.util.List<String> lolRank, java.util.List<String> lolRegion, Integer lolSmax, Integer lolSmin, Integer mythicMax, Integer mythicMin, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, Integer orangeMax, Integer orangeMin, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer previousRmax, Integer previousRmin, java.util.List<Integer> publicTagId, Integer riotMax, Integer riotMin, Integer rmax, Integer rmin, Integer rpMax, Integer rpMin, Boolean sb, Boolean sbByMe, java.util.List<String> skin, java.util.List<Integer> tagId, TelEnum tel, String title, Integer userId, Integer valorantKnifeMax, Integer valorantKnifeMin, Integer valorantLevelMax, Integer valorantLevelMin, java.util.List<String> valorantNotRegion, java.util.List<String> valorantRankType, java.util.List<String> valorantRegion, Integer valorantSmax, Integer valorantSmin, Integer vpMax, Integer vpMin, java.util.List<String> weaponskin, Integer winRateMax, Integer winRateMin) throws Exception {
        String path = "/riot";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (rmin != null) queryParams.put("rmin", String.valueOf(rmin));
        if (rmax != null) queryParams.put("rmax", String.valueOf(rmax));
        if (lastRmin != null) queryParams.put("last_rmin", String.valueOf(lastRmin));
        if (lastRmax != null) queryParams.put("last_rmax", String.valueOf(lastRmax));
        if (previousRmin != null) queryParams.put("previous_rmin", String.valueOf(previousRmin));
        if (previousRmax != null) queryParams.put("previous_rmax", String.valueOf(previousRmax));
        if (weaponskin != null) {
            for (int i = 0; i < weaponskin.size(); i++) {
                queryParams.put("weaponSkin[][" + i + "]", String.valueOf(weaponskin.get(i)));
            }
        }
        if (buddy != null) {
            for (int i = 0; i < buddy.size(); i++) {
                queryParams.put("buddy[][" + i + "]", String.valueOf(buddy.get(i)));
            }
        }
        if (agent != null) {
            for (int i = 0; i < agent.size(); i++) {
                queryParams.put("agent[][" + i + "]", String.valueOf(agent.get(i)));
            }
        }
        if (champion != null) {
            for (int i = 0; i < champion.size(); i++) {
                queryParams.put("champion[][" + i + "]", String.valueOf(champion.get(i)));
            }
        }
        if (skin != null) {
            for (int i = 0; i < skin.size(); i++) {
                queryParams.put("skin[][" + i + "]", String.valueOf(skin.get(i)));
            }
        }
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (valorantLevelMin != null) queryParams.put("valorant_level_min", String.valueOf(valorantLevelMin));
        if (valorantLevelMax != null) queryParams.put("valorant_level_max", String.valueOf(valorantLevelMax));
        if (lolLevelMin != null) queryParams.put("lol_level_min", String.valueOf(lolLevelMin));
        if (lolLevelMax != null) queryParams.put("lol_level_max", String.valueOf(lolLevelMax));
        if (invMin != null) queryParams.put("inv_min", String.valueOf(invMin));
        if (invMax != null) queryParams.put("inv_max", String.valueOf(invMax));
        if (vpMin != null) queryParams.put("vp_min", String.valueOf(vpMin));
        if (vpMax != null) queryParams.put("vp_max", String.valueOf(vpMax));
        if (valorantSmin != null) queryParams.put("valorant_smin", String.valueOf(valorantSmin));
        if (valorantSmax != null) queryParams.put("valorant_smax", String.valueOf(valorantSmax));
        if (valorantRankType != null) {
            for (int i = 0; i < valorantRankType.size(); i++) {
                queryParams.put("valorant_rank_type[][" + i + "]", String.valueOf(valorantRankType.get(i)));
            }
        }
        if (amin != null) queryParams.put("amin", String.valueOf(amin));
        if (amax != null) queryParams.put("amax", String.valueOf(amax));
        if (valorantRegion != null) {
            for (int i = 0; i < valorantRegion.size(); i++) {
                queryParams.put("valorant_region[][" + i + "]", String.valueOf(valorantRegion.get(i)));
            }
        }
        if (valorantNotRegion != null) {
            for (int i = 0; i < valorantNotRegion.size(); i++) {
                queryParams.put("valorant_not_region[][" + i + "]", String.valueOf(valorantNotRegion.get(i)));
            }
        }
        if (lolRegion != null) {
            for (int i = 0; i < lolRegion.size(); i++) {
                queryParams.put("lol_region[][" + i + "]", String.valueOf(lolRegion.get(i)));
            }
        }
        if (lolNotRegion != null) {
            for (int i = 0; i < lolNotRegion.size(); i++) {
                queryParams.put("lol_not_region[][" + i + "]", String.valueOf(lolNotRegion.get(i)));
            }
        }
        if (knife != null) queryParams.put("knife", knife ? "1" : "0");
        if (lolSmin != null) queryParams.put("lol_smin", String.valueOf(lolSmin));
        if (lolSmax != null) queryParams.put("lol_smax", String.valueOf(lolSmax));
        if (championMin != null) queryParams.put("champion_min", String.valueOf(championMin));
        if (championMax != null) queryParams.put("champion_max", String.valueOf(championMax));
        if (winRateMin != null) queryParams.put("win_rate_min", String.valueOf(winRateMin));
        if (winRateMax != null) queryParams.put("win_rate_max", String.valueOf(winRateMax));
        if (blueMin != null) queryParams.put("blue_min", String.valueOf(blueMin));
        if (blueMax != null) queryParams.put("blue_max", String.valueOf(blueMax));
        if (orangeMin != null) queryParams.put("orange_min", String.valueOf(orangeMin));
        if (orangeMax != null) queryParams.put("orange_max", String.valueOf(orangeMax));
        if (mythicMin != null) queryParams.put("mythic_min", String.valueOf(mythicMin));
        if (mythicMax != null) queryParams.put("mythic_max", String.valueOf(mythicMax));
        if (riotMin != null) queryParams.put("riot_min", String.valueOf(riotMin));
        if (riotMax != null) queryParams.put("riot_max", String.valueOf(riotMax));
        if (email != null) queryParams.put("email", email.getValue());
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (valorantKnifeMin != null) queryParams.put("valorant_knife_min", String.valueOf(valorantKnifeMin));
        if (valorantKnifeMax != null) queryParams.put("valorant_knife_max", String.valueOf(valorantKnifeMax));
        if (rpMin != null) queryParams.put("rp_min", String.valueOf(rpMin));
        if (rpMax != null) queryParams.put("rp_max", String.valueOf(rpMax));
        if (faMin != null) queryParams.put("fa_min", String.valueOf(faMin));
        if (faMax != null) queryParams.put("fa_max", String.valueOf(faMax));
        if (lolRank != null) {
            for (int i = 0; i < lolRank.size(); i++) {
                queryParams.put("lol_rank[][" + i + "]", String.valueOf(lolRank.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryRiotResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /telegram</p>
     * @param allowGeoSpamblock allowGeoSpamblock (optional, nullable)
     * @param birthday birthday (optional, nullable)
     * @param birthdayAfter birthdayAfter (optional, nullable)
     * @param birthdayAfterPeriod birthdayAfterPeriod (optional, nullable)
     * @param birthdayPeriod birthdayPeriod (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param dcId dcId (optional, nullable)
     * @param digMax digMax (optional, nullable)
     * @param digMin digMin (optional, nullable)
     * @param email email (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param maxAdmin maxAdmin (optional, nullable)
     * @param maxAdminSub maxAdminSub (optional, nullable)
     * @param maxBotActiveUsers maxBotActiveUsers (optional, nullable)
     * @param maxBots maxBots (optional, nullable)
     * @param maxChannels maxChannels (optional, nullable)
     * @param maxChats maxChats (optional, nullable)
     * @param maxContacts maxContacts (optional, nullable)
     * @param maxConversations maxConversations (optional, nullable)
     * @param maxGifts maxGifts (optional, nullable)
     * @param maxGiftsConvertStars maxGiftsConvertStars (optional, nullable)
     * @param maxGiftsStars maxGiftsStars (optional, nullable)
     * @param maxId maxId (optional, nullable)
     * @param maxNftGifts maxNftGifts (optional, nullable)
     * @param maxStars maxStars (optional, nullable)
     * @param minAdmin minAdmin (optional, nullable)
     * @param minAdminSub minAdminSub (optional, nullable)
     * @param minBotActiveUsers minBotActiveUsers (optional, nullable)
     * @param minBots minBots (optional, nullable)
     * @param minChannels minChannels (optional, nullable)
     * @param minChats minChats (optional, nullable)
     * @param minContacts minContacts (optional, nullable)
     * @param minConversations minConversations (optional, nullable)
     * @param minGifts minGifts (optional, nullable)
     * @param minGiftsConvertStars minGiftsConvertStars (optional, nullable)
     * @param minGiftsStars minGiftsStars (optional, nullable)
     * @param minId minId (optional, nullable)
     * @param minNftGifts minNftGifts (optional, nullable)
     * @param minStars minStars (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notDcId notDcId (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param password password (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param premium premium (optional, nullable)
     * @param premiumExpiration premiumExpiration (optional, nullable)
     * @param premiumExpirationPeriod premiumExpirationPeriod (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param spam spam (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryTelegramResponse
     * @throws Exception on API or network error
     */
    public CategoryTelegramResponse categoryTelegram(Boolean allowGeoSpamblock, Integer birthday, Integer birthdayAfter, BirthdayAfterPeriodEnum birthdayAfterPeriod, BirthdayPeriodEnum birthdayPeriod, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, java.util.List<Integer> dcId, Integer digMax, Integer digMin, EmailEnum email, Boolean emailLoginData, java.util.List<String> emailProvider, Integer maxAdmin, Integer maxAdminSub, Integer maxBotActiveUsers, Integer maxBots, Integer maxChannels, Integer maxChats, Integer maxContacts, Integer maxConversations, Integer maxGifts, Integer maxGiftsConvertStars, Integer maxGiftsStars, Integer maxId, Integer maxNftGifts, Integer maxStars, Integer minAdmin, Integer minAdminSub, Integer minBotActiveUsers, Integer minBots, Integer minChannels, Integer minChats, Integer minContacts, Integer minConversations, Integer minGifts, Integer minGiftsConvertStars, Integer minGiftsStars, Integer minId, Integer minNftGifts, Integer minStars, java.util.List<String> notCountry, java.util.List<Integer> notDcId, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, String password, Integer pmax, Integer pmin, PremiumEnum premium, Integer premiumExpiration, PremiumExpirationPeriodEnum premiumExpirationPeriod, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, String spam, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/telegram";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (spam != null) queryParams.put("spam", String.valueOf(spam));
        if (password != null) queryParams.put("password", String.valueOf(password));
        if (premium != null) queryParams.put("premium", premium.getValue());
        if (premiumExpiration != null) queryParams.put("premium_expiration", String.valueOf(premiumExpiration));
        if (premiumExpirationPeriod != null) queryParams.put("premium_expiration_period", premiumExpirationPeriod.getValue());
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (minChannels != null) queryParams.put("min_channels", String.valueOf(minChannels));
        if (maxChannels != null) queryParams.put("max_channels", String.valueOf(maxChannels));
        if (minChats != null) queryParams.put("min_chats", String.valueOf(minChats));
        if (maxChats != null) queryParams.put("max_chats", String.valueOf(maxChats));
        if (minConversations != null) queryParams.put("min_conversations", String.valueOf(minConversations));
        if (maxConversations != null) queryParams.put("max_conversations", String.valueOf(maxConversations));
        if (minAdmin != null) queryParams.put("min_admin", String.valueOf(minAdmin));
        if (maxAdmin != null) queryParams.put("max_admin", String.valueOf(maxAdmin));
        if (minAdminSub != null) queryParams.put("min_admin_sub", String.valueOf(minAdminSub));
        if (maxAdminSub != null) queryParams.put("max_admin_sub", String.valueOf(maxAdminSub));
        if (digMin != null) queryParams.put("dig_min", String.valueOf(digMin));
        if (digMax != null) queryParams.put("dig_max", String.valueOf(digMax));
        if (minContacts != null) queryParams.put("min_contacts", String.valueOf(minContacts));
        if (maxContacts != null) queryParams.put("max_contacts", String.valueOf(maxContacts));
        if (minStars != null) queryParams.put("min_stars", String.valueOf(minStars));
        if (maxStars != null) queryParams.put("max_stars", String.valueOf(maxStars));
        if (birthday != null) queryParams.put("birthday", String.valueOf(birthday));
        if (birthdayPeriod != null) queryParams.put("birthday_period", birthdayPeriod.getValue());
        if (birthdayAfter != null) queryParams.put("birthday_after", String.valueOf(birthdayAfter));
        if (birthdayAfterPeriod != null) queryParams.put("birthday_after_period", birthdayAfterPeriod.getValue());
        if (minId != null) queryParams.put("min_id", String.valueOf(minId));
        if (maxId != null) queryParams.put("max_id", String.valueOf(maxId));
        if (allowGeoSpamblock != null) queryParams.put("allow_geo_spamblock", allowGeoSpamblock ? "1" : "0");
        if (minGifts != null) queryParams.put("min_gifts", String.valueOf(minGifts));
        if (maxGifts != null) queryParams.put("max_gifts", String.valueOf(maxGifts));
        if (minNftGifts != null) queryParams.put("min_nft_gifts", String.valueOf(minNftGifts));
        if (maxNftGifts != null) queryParams.put("max_nft_gifts", String.valueOf(maxNftGifts));
        if (minGiftsStars != null) queryParams.put("min_gifts_stars", String.valueOf(minGiftsStars));
        if (maxGiftsStars != null) queryParams.put("max_gifts_stars", String.valueOf(maxGiftsStars));
        if (minGiftsConvertStars != null) queryParams.put("min_gifts_convert_stars", String.valueOf(minGiftsConvertStars));
        if (maxGiftsConvertStars != null) queryParams.put("max_gifts_convert_stars", String.valueOf(maxGiftsConvertStars));
        if (dcId != null) {
            for (int i = 0; i < dcId.size(); i++) {
                queryParams.put("dc_id[][" + i + "]", String.valueOf(dcId.get(i)));
            }
        }
        if (notDcId != null) {
            for (int i = 0; i < notDcId.size(); i++) {
                queryParams.put("not_dc_id[][" + i + "]", String.valueOf(notDcId.get(i)));
            }
        }
        if (email != null) queryParams.put("email", email.getValue());
        if (minBots != null) queryParams.put("min_bots", String.valueOf(minBots));
        if (maxBots != null) queryParams.put("max_bots", String.valueOf(maxBots));
        if (minBotActiveUsers != null) queryParams.put("min_bot_active_users", String.valueOf(minBotActiveUsers));
        if (maxBotActiveUsers != null) queryParams.put("max_bot_active_users", String.valueOf(maxBotActiveUsers));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryTelegramResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /supercell</p>
     * @param brawlCupMax brawlCupMax (optional, nullable)
     * @param brawlCupMin brawlCupMin (optional, nullable)
     * @param brawlLevelMax brawlLevelMax (optional, nullable)
     * @param brawlLevelMin brawlLevelMin (optional, nullable)
     * @param brawlPass brawlPass (optional, nullable)
     * @param brawlWinsMax brawlWinsMax (optional, nullable)
     * @param brawlWinsMin brawlWinsMin (optional, nullable)
     * @param brawler brawler (optional, nullable)
     * @param brawlersMax brawlersMax (optional, nullable)
     * @param brawlersMin brawlersMin (optional, nullable)
     * @param builderHallCupMax builderHallCupMax (optional, nullable)
     * @param builderHallCupMin builderHallCupMin (optional, nullable)
     * @param builderHallLevelMax builderHallLevelMax (optional, nullable)
     * @param builderHallLevelMin builderHallLevelMin (optional, nullable)
     * @param clashCupMax clashCupMax (optional, nullable)
     * @param clashCupMin clashCupMin (optional, nullable)
     * @param clashLevelMax clashLevelMax (optional, nullable)
     * @param clashLevelMin clashLevelMin (optional, nullable)
     * @param clashPass clashPass (optional, nullable)
     * @param clashWinsMax clashWinsMax (optional, nullable)
     * @param clashWinsMin clashWinsMin (optional, nullable)
     * @param creationYearMax creationYearMax (optional, nullable)
     * @param creationYearMin creationYearMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param eg eg (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param kingLevelMax kingLevelMax (optional, nullable)
     * @param kingLevelMin kingLevelMin (optional, nullable)
     * @param legendaryBrawlersMax legendaryBrawlersMax (optional, nullable)
     * @param legendaryBrawlersMin legendaryBrawlersMin (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param royaleCupMax royaleCupMax (optional, nullable)
     * @param royaleCupMin royaleCupMin (optional, nullable)
     * @param royaleLevelMax royaleLevelMax (optional, nullable)
     * @param royaleLevelMin royaleLevelMin (optional, nullable)
     * @param royalePass royalePass (optional, nullable)
     * @param royaleWinsMax royaleWinsMax (optional, nullable)
     * @param royaleWinsMin royaleWinsMin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param totalBuilderHeroesLevelMax totalBuilderHeroesLevelMax (optional, nullable)
     * @param totalBuilderHeroesLevelMin totalBuilderHeroesLevelMin (optional, nullable)
     * @param totalBuilderTroopsLevelMax totalBuilderTroopsLevelMax (optional, nullable)
     * @param totalBuilderTroopsLevelMin totalBuilderTroopsLevelMin (optional, nullable)
     * @param totalHeroesLevelMax totalHeroesLevelMax (optional, nullable)
     * @param totalHeroesLevelMin totalHeroesLevelMin (optional, nullable)
     * @param totalSpellsLevelMax totalSpellsLevelMax (optional, nullable)
     * @param totalSpellsLevelMin totalSpellsLevelMin (optional, nullable)
     * @param totalTroopsLevelMax totalTroopsLevelMax (optional, nullable)
     * @param totalTroopsLevelMin totalTroopsLevelMin (optional, nullable)
     * @param townHallLevelMax townHallLevelMax (optional, nullable)
     * @param townHallLevelMin townHallLevelMin (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategorySupercellResponse
     * @throws Exception on API or network error
     */
    public CategorySupercellResponse categorySupercell(Integer brawlCupMax, Integer brawlCupMin, Integer brawlLevelMax, Integer brawlLevelMin, String brawlPass, Integer brawlWinsMax, Integer brawlWinsMin, java.util.List<String> brawler, Integer brawlersMax, Integer brawlersMin, Integer builderHallCupMax, Integer builderHallCupMin, Integer builderHallLevelMax, Integer builderHallLevelMin, Integer clashCupMax, Integer clashCupMin, Integer clashLevelMax, Integer clashLevelMin, String clashPass, Integer clashWinsMax, Integer clashWinsMin, Integer creationYearMax, Integer creationYearMin, CurrencyEnum currency, Integer daybreak, Eg2Enum eg, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, String itemDomain, Integer kingLevelMax, Integer kingLevelMin, Integer legendaryBrawlersMax, Integer legendaryBrawlersMin, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Integer royaleCupMax, Integer royaleCupMin, Integer royaleLevelMax, Integer royaleLevelMin, String royalePass, Integer royaleWinsMax, Integer royaleWinsMin, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String tel, String title, Integer totalBuilderHeroesLevelMax, Integer totalBuilderHeroesLevelMin, Integer totalBuilderTroopsLevelMax, Integer totalBuilderTroopsLevelMin, Integer totalHeroesLevelMax, Integer totalHeroesLevelMin, Integer totalSpellsLevelMax, Integer totalSpellsLevelMin, Integer totalTroopsLevelMax, Integer totalTroopsLevelMin, Integer townHallLevelMax, Integer townHallLevelMin, Integer userId) throws Exception {
        String path = "/supercell";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (eg != null) queryParams.put("eg", eg.getValue());
        if (tel != null) queryParams.put("tel", String.valueOf(tel));
        if (brawlLevelMin != null) queryParams.put("brawl_level_min", String.valueOf(brawlLevelMin));
        if (brawlLevelMax != null) queryParams.put("brawl_level_max", String.valueOf(brawlLevelMax));
        if (brawlCupMin != null) queryParams.put("brawl_cup_min", String.valueOf(brawlCupMin));
        if (brawlCupMax != null) queryParams.put("brawl_cup_max", String.valueOf(brawlCupMax));
        if (brawlWinsMin != null) queryParams.put("brawl_wins_min", String.valueOf(brawlWinsMin));
        if (brawlWinsMax != null) queryParams.put("brawl_wins_max", String.valueOf(brawlWinsMax));
        if (brawlPass != null) queryParams.put("brawl_pass", String.valueOf(brawlPass));
        if (brawler != null) {
            for (int i = 0; i < brawler.size(); i++) {
                queryParams.put("brawler[][" + i + "]", String.valueOf(brawler.get(i)));
            }
        }
        if (brawlersMin != null) queryParams.put("brawlers_min", String.valueOf(brawlersMin));
        if (brawlersMax != null) queryParams.put("brawlers_max", String.valueOf(brawlersMax));
        if (legendaryBrawlersMin != null) queryParams.put("legendary_brawlers_min", String.valueOf(legendaryBrawlersMin));
        if (legendaryBrawlersMax != null) queryParams.put("legendary_brawlers_max", String.valueOf(legendaryBrawlersMax));
        if (royaleLevelMin != null) queryParams.put("royale_level_min", String.valueOf(royaleLevelMin));
        if (royaleLevelMax != null) queryParams.put("royale_level_max", String.valueOf(royaleLevelMax));
        if (royaleCupMin != null) queryParams.put("royale_cup_min", String.valueOf(royaleCupMin));
        if (royaleCupMax != null) queryParams.put("royale_cup_max", String.valueOf(royaleCupMax));
        if (royaleWinsMin != null) queryParams.put("royale_wins_min", String.valueOf(royaleWinsMin));
        if (royaleWinsMax != null) queryParams.put("royale_wins_max", String.valueOf(royaleWinsMax));
        if (kingLevelMin != null) queryParams.put("king_level_min", String.valueOf(kingLevelMin));
        if (kingLevelMax != null) queryParams.put("king_level_max", String.valueOf(kingLevelMax));
        if (royalePass != null) queryParams.put("royale_pass", String.valueOf(royalePass));
        if (clashLevelMin != null) queryParams.put("clash_level_min", String.valueOf(clashLevelMin));
        if (clashLevelMax != null) queryParams.put("clash_level_max", String.valueOf(clashLevelMax));
        if (clashCupMin != null) queryParams.put("clash_cup_min", String.valueOf(clashCupMin));
        if (clashCupMax != null) queryParams.put("clash_cup_max", String.valueOf(clashCupMax));
        if (clashWinsMin != null) queryParams.put("clash_wins_min", String.valueOf(clashWinsMin));
        if (clashWinsMax != null) queryParams.put("clash_wins_max", String.valueOf(clashWinsMax));
        if (clashPass != null) queryParams.put("clash_pass", String.valueOf(clashPass));
        if (totalHeroesLevelMin != null) queryParams.put("total_heroes_level_min", String.valueOf(totalHeroesLevelMin));
        if (totalHeroesLevelMax != null) queryParams.put("total_heroes_level_max", String.valueOf(totalHeroesLevelMax));
        if (totalTroopsLevelMin != null) queryParams.put("total_troops_level_min", String.valueOf(totalTroopsLevelMin));
        if (totalTroopsLevelMax != null) queryParams.put("total_troops_level_max", String.valueOf(totalTroopsLevelMax));
        if (totalSpellsLevelMin != null) queryParams.put("total_spells_level_min", String.valueOf(totalSpellsLevelMin));
        if (totalSpellsLevelMax != null) queryParams.put("total_spells_level_max", String.valueOf(totalSpellsLevelMax));
        if (totalBuilderHeroesLevelMin != null) queryParams.put("total_builder_heroes_level_min", String.valueOf(totalBuilderHeroesLevelMin));
        if (totalBuilderHeroesLevelMax != null) queryParams.put("total_builder_heroes_level_max", String.valueOf(totalBuilderHeroesLevelMax));
        if (totalBuilderTroopsLevelMin != null) queryParams.put("total_builder_troops_level_min", String.valueOf(totalBuilderTroopsLevelMin));
        if (totalBuilderTroopsLevelMax != null) queryParams.put("total_builder_troops_level_max", String.valueOf(totalBuilderTroopsLevelMax));
        if (townHallLevelMin != null) queryParams.put("town_hall_level_min", String.valueOf(townHallLevelMin));
        if (townHallLevelMax != null) queryParams.put("town_hall_level_max", String.valueOf(townHallLevelMax));
        if (builderHallLevelMin != null) queryParams.put("builder_hall_level_min", String.valueOf(builderHallLevelMin));
        if (builderHallLevelMax != null) queryParams.put("builder_hall_level_max", String.valueOf(builderHallLevelMax));
        if (builderHallCupMin != null) queryParams.put("builder_hall_cup_min", String.valueOf(builderHallCupMin));
        if (builderHallCupMax != null) queryParams.put("builder_hall_cup_max", String.valueOf(builderHallCupMax));
        if (creationYearMin != null) queryParams.put("creation_year_min", String.valueOf(creationYearMin));
        if (creationYearMax != null) queryParams.put("creation_year_max", String.valueOf(creationYearMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategorySupercellResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /ea</p>
     * @param alLevelMax alLevelMax (optional, nullable)
     * @param alLevelMin alLevelMin (optional, nullable)
     * @param alRankMax alRankMax (optional, nullable)
     * @param alRankMin alRankMin (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param game game (optional, nullable)
     * @param gmax gmax (optional, nullable)
     * @param gmin gmin (optional, nullable)
     * @param hasBan hasBan (optional, nullable)
     * @param hoursPlayed hoursPlayed (optional, nullable)
     * @param hoursPlayedMax hoursPlayedMax (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param psnConnected psnConnected (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param steamConnected steamConnected (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param transactions transactions (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param xboxConnected xboxConnected (optional, nullable)
     * @return CategoryEaResponse
     * @throws Exception on API or network error
     */
    public CategoryEaResponse categoryEa(Integer alLevelMax, Integer alLevelMin, Integer alRankMax, Integer alRankMin, java.util.List<String> country, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, java.util.List<String> game, Integer gmax, Integer gmin, String hasBan, java.util.Map<String, String> hoursPlayed, java.util.Map<String, String> hoursPlayedMax, String itemDomain, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, String psnConnected, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, String steamConnected, Subscription1Enum subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, String transactions, Integer userId, String xboxConnected) throws Exception {
        String path = "/ea";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (gmin != null) queryParams.put("gmin", String.valueOf(gmin));
        if (gmax != null) queryParams.put("gmax", String.valueOf(gmax));
        if (alRankMin != null) queryParams.put("al_rank_min", String.valueOf(alRankMin));
        if (alRankMax != null) queryParams.put("al_rank_max", String.valueOf(alRankMax));
        if (alLevelMin != null) queryParams.put("al_level_min", String.valueOf(alLevelMin));
        if (alLevelMax != null) queryParams.put("al_level_max", String.valueOf(alLevelMax));
        if (hasBan != null) queryParams.put("has_ban", String.valueOf(hasBan));
        if (xboxConnected != null) queryParams.put("xbox_connected", String.valueOf(xboxConnected));
        if (steamConnected != null) queryParams.put("steam_connected", String.valueOf(steamConnected));
        if (psnConnected != null) queryParams.put("psn_connected", String.valueOf(psnConnected));
        if (subscription != null) queryParams.put("subscription", subscription.getValue());
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (hoursPlayed != null) queryParams.put("hours_played", String.valueOf(hoursPlayed));
        if (hoursPlayedMax != null) queryParams.put("hours_played_max", String.valueOf(hoursPlayedMax));
        if (transactions != null) queryParams.put("transactions", String.valueOf(transactions));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryEaResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /world-of-tanks</p>
     * @param battlesMax battlesMax (optional, nullable)
     * @param battlesMin battlesMin (optional, nullable)
     * @param clan clan (optional, nullable)
     * @param clanCreditsMax clanCreditsMax (optional, nullable)
     * @param clanCreditsMin clanCreditsMin (optional, nullable)
     * @param clanCrystalMax clanCrystalMax (optional, nullable)
     * @param clanCrystalMin clanCrystalMin (optional, nullable)
     * @param clanGoldMax clanGoldMax (optional, nullable)
     * @param clanGoldMin clanGoldMin (optional, nullable)
     * @param clanRole clanRole (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param goldMax goldMax (optional, nullable)
     * @param goldMin goldMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notClanRole notClanRole (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notRegion notRegion (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param premMax premMax (optional, nullable)
     * @param premMin premMin (optional, nullable)
     * @param premium premium (optional, nullable)
     * @param premiumExpiration premiumExpiration (optional, nullable)
     * @param premiumExpirationPeriod premiumExpirationPeriod (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param region region (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param silverMax silverMax (optional, nullable)
     * @param silverMin silverMin (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tank tank (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param topMax topMax (optional, nullable)
     * @param topMin topMin (optional, nullable)
     * @param topPremMax topPremMax (optional, nullable)
     * @param topPremMin topPremMin (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param winPmax winPmax (optional, nullable)
     * @param winPmin winPmin (optional, nullable)
     * @return CategoryWotResponse
     * @throws Exception on API or network error
     */
    public CategoryWotResponse categoryWot(Integer battlesMax, Integer battlesMin, ClanEnum clan, Integer clanCreditsMax, Integer clanCreditsMin, Integer clanCrystalMax, Integer clanCrystalMin, Integer clanGoldMax, Integer clanGoldMin, java.util.List<String> clanRole, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer goldMax, Integer goldMin, String itemDomain, java.util.List<String> notClanRole, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<String> notRegion, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer premMax, Integer premMin, PremiumEnum premium, Integer premiumExpiration, PremiumExpirationPeriodEnum premiumExpirationPeriod, java.util.List<Integer> publicTagId, java.util.List<String> region, Boolean sb, Boolean sbByMe, Integer silverMax, Integer silverMin, java.util.List<Integer> tagId, java.util.List<Integer> tank, TelEnum tel, String title, Integer topMax, Integer topMin, Integer topPremMax, Integer topPremMin, Integer userId, Integer winPmax, Integer winPmin) throws Exception {
        String path = "/world-of-tanks";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (battlesMin != null) queryParams.put("battles_min", String.valueOf(battlesMin));
        if (battlesMax != null) queryParams.put("battles_max", String.valueOf(battlesMax));
        if (goldMin != null) queryParams.put("gold_min", String.valueOf(goldMin));
        if (goldMax != null) queryParams.put("gold_max", String.valueOf(goldMax));
        if (silverMin != null) queryParams.put("silver_min", String.valueOf(silverMin));
        if (silverMax != null) queryParams.put("silver_max", String.valueOf(silverMax));
        if (topMin != null) queryParams.put("top_min", String.valueOf(topMin));
        if (topMax != null) queryParams.put("top_max", String.valueOf(topMax));
        if (premMin != null) queryParams.put("prem_min", String.valueOf(premMin));
        if (premMax != null) queryParams.put("prem_max", String.valueOf(premMax));
        if (topPremMin != null) queryParams.put("top_prem_min", String.valueOf(topPremMin));
        if (topPremMax != null) queryParams.put("top_prem_max", String.valueOf(topPremMax));
        if (winPmin != null) queryParams.put("win_pmin", String.valueOf(winPmin));
        if (winPmax != null) queryParams.put("win_pmax", String.valueOf(winPmax));
        if (tank != null) {
            for (int i = 0; i < tank.size(); i++) {
                queryParams.put("tank[][" + i + "]", String.valueOf(tank.get(i)));
            }
        }
        if (region != null) {
            for (int i = 0; i < region.size(); i++) {
                queryParams.put("region[][" + i + "]", String.valueOf(region.get(i)));
            }
        }
        if (notRegion != null) {
            for (int i = 0; i < notRegion.size(); i++) {
                queryParams.put("not_region[][" + i + "]", String.valueOf(notRegion.get(i)));
            }
        }
        if (premium != null) queryParams.put("premium", premium.getValue());
        if (premiumExpiration != null) queryParams.put("premium_expiration", String.valueOf(premiumExpiration));
        if (premiumExpirationPeriod != null) queryParams.put("premium_expiration_period", premiumExpirationPeriod.getValue());
        if (clan != null) queryParams.put("clan", clan.getValue());
        if (clanRole != null) {
            for (int i = 0; i < clanRole.size(); i++) {
                queryParams.put("clan_role[][" + i + "]", String.valueOf(clanRole.get(i)));
            }
        }
        if (notClanRole != null) {
            for (int i = 0; i < notClanRole.size(); i++) {
                queryParams.put("not_clan_role[][" + i + "]", String.valueOf(notClanRole.get(i)));
            }
        }
        if (clanGoldMin != null) queryParams.put("clan_gold_min", String.valueOf(clanGoldMin));
        if (clanGoldMax != null) queryParams.put("clan_gold_max", String.valueOf(clanGoldMax));
        if (clanCreditsMin != null) queryParams.put("clan_credits_min", String.valueOf(clanCreditsMin));
        if (clanCreditsMax != null) queryParams.put("clan_credits_max", String.valueOf(clanCreditsMax));
        if (clanCrystalMin != null) queryParams.put("clan_crystal_min", String.valueOf(clanCrystalMin));
        if (clanCrystalMax != null) queryParams.put("clan_crystal_max", String.valueOf(clanCrystalMax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryWotResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /wot-blitz</p>
     * @param battlesMax battlesMax (optional, nullable)
     * @param battlesMin battlesMin (optional, nullable)
     * @param clan clan (optional, nullable)
     * @param clanCreditsMax clanCreditsMax (optional, nullable)
     * @param clanCreditsMin clanCreditsMin (optional, nullable)
     * @param clanCrystalMax clanCrystalMax (optional, nullable)
     * @param clanCrystalMin clanCrystalMin (optional, nullable)
     * @param clanGoldMax clanGoldMax (optional, nullable)
     * @param clanGoldMin clanGoldMin (optional, nullable)
     * @param clanRole clanRole (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param goldMax goldMax (optional, nullable)
     * @param goldMin goldMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notClanRole notClanRole (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notRegion notRegion (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param premMax premMax (optional, nullable)
     * @param premMin premMin (optional, nullable)
     * @param premium premium (optional, nullable)
     * @param premiumExpiration premiumExpiration (optional, nullable)
     * @param premiumExpirationPeriod premiumExpirationPeriod (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param region region (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param silverMax silverMax (optional, nullable)
     * @param silverMin silverMin (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tank tank (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param topMax topMax (optional, nullable)
     * @param topMin topMin (optional, nullable)
     * @param topPremMax topPremMax (optional, nullable)
     * @param topPremMin topPremMin (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param winPmax winPmax (optional, nullable)
     * @param winPmin winPmin (optional, nullable)
     * @return CategoryWotblitzResponse
     * @throws Exception on API or network error
     */
    public CategoryWotblitzResponse categoryWotblitz(Integer battlesMax, Integer battlesMin, ClanEnum clan, Integer clanCreditsMax, Integer clanCreditsMin, Integer clanCrystalMax, Integer clanCrystalMin, Integer clanGoldMax, Integer clanGoldMin, java.util.List<String> clanRole, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer goldMax, Integer goldMin, String itemDomain, java.util.List<String> notClanRole, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<String> notRegion, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer premMax, Integer premMin, PremiumEnum premium, Integer premiumExpiration, PremiumExpirationPeriodEnum premiumExpirationPeriod, java.util.List<Integer> publicTagId, java.util.List<String> region, Boolean sb, Boolean sbByMe, Integer silverMax, Integer silverMin, java.util.List<Integer> tagId, java.util.List<Integer> tank, TelEnum tel, String title, Integer topMax, Integer topMin, Integer topPremMax, Integer topPremMin, Integer userId, Integer winPmax, Integer winPmin) throws Exception {
        String path = "/wot-blitz";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (battlesMin != null) queryParams.put("battles_min", String.valueOf(battlesMin));
        if (battlesMax != null) queryParams.put("battles_max", String.valueOf(battlesMax));
        if (goldMin != null) queryParams.put("gold_min", String.valueOf(goldMin));
        if (goldMax != null) queryParams.put("gold_max", String.valueOf(goldMax));
        if (silverMin != null) queryParams.put("silver_min", String.valueOf(silverMin));
        if (silverMax != null) queryParams.put("silver_max", String.valueOf(silverMax));
        if (topMin != null) queryParams.put("top_min", String.valueOf(topMin));
        if (topMax != null) queryParams.put("top_max", String.valueOf(topMax));
        if (premMin != null) queryParams.put("prem_min", String.valueOf(premMin));
        if (premMax != null) queryParams.put("prem_max", String.valueOf(premMax));
        if (topPremMin != null) queryParams.put("top_prem_min", String.valueOf(topPremMin));
        if (topPremMax != null) queryParams.put("top_prem_max", String.valueOf(topPremMax));
        if (winPmin != null) queryParams.put("win_pmin", String.valueOf(winPmin));
        if (winPmax != null) queryParams.put("win_pmax", String.valueOf(winPmax));
        if (tank != null) {
            for (int i = 0; i < tank.size(); i++) {
                queryParams.put("tank[][" + i + "]", String.valueOf(tank.get(i)));
            }
        }
        if (region != null) {
            for (int i = 0; i < region.size(); i++) {
                queryParams.put("region[][" + i + "]", String.valueOf(region.get(i)));
            }
        }
        if (notRegion != null) {
            for (int i = 0; i < notRegion.size(); i++) {
                queryParams.put("not_region[][" + i + "]", String.valueOf(notRegion.get(i)));
            }
        }
        if (premium != null) queryParams.put("premium", premium.getValue());
        if (premiumExpiration != null) queryParams.put("premium_expiration", String.valueOf(premiumExpiration));
        if (premiumExpirationPeriod != null) queryParams.put("premium_expiration_period", premiumExpirationPeriod.getValue());
        if (clan != null) queryParams.put("clan", clan.getValue());
        if (clanRole != null) {
            for (int i = 0; i < clanRole.size(); i++) {
                queryParams.put("clan_role[][" + i + "]", String.valueOf(clanRole.get(i)));
            }
        }
        if (notClanRole != null) {
            for (int i = 0; i < notClanRole.size(); i++) {
                queryParams.put("not_clan_role[][" + i + "]", String.valueOf(notClanRole.get(i)));
            }
        }
        if (clanGoldMin != null) queryParams.put("clan_gold_min", String.valueOf(clanGoldMin));
        if (clanGoldMax != null) queryParams.put("clan_gold_max", String.valueOf(clanGoldMax));
        if (clanCreditsMin != null) queryParams.put("clan_credits_min", String.valueOf(clanCreditsMin));
        if (clanCreditsMax != null) queryParams.put("clan_credits_max", String.valueOf(clanCreditsMax));
        if (clanCrystalMin != null) queryParams.put("clan_crystal_min", String.valueOf(clanCrystalMin));
        if (clanCrystalMax != null) queryParams.put("clan_crystal_max", String.valueOf(clanCrystalMax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryWotblitzResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /gifts</p>
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryGiftsResponse
     * @throws Exception on API or network error
     */
    public CategoryGiftsResponse categoryGifts(CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, Subscription2Enum subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/gifts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (subscription != null) queryParams.put("subscription", subscription.getValue());
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryGiftsResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /epicgames</p>
     * @param balanceMax balanceMax (optional, nullable)
     * @param balanceMin balanceMin (optional, nullable)
     * @param changeEmail changeEmail (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param eg eg (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param game game (optional, nullable)
     * @param gmax gmax (optional, nullable)
     * @param gmin gmin (optional, nullable)
     * @param hoursPlayed hoursPlayed (optional, nullable)
     * @param hoursPlayedMax hoursPlayedMax (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param rewardsBalanceMax rewardsBalanceMax (optional, nullable)
     * @param rewardsBalanceMin rewardsBalanceMin (optional, nullable)
     * @param rlPurchases rlPurchases (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryEpicgamesResponse
     * @throws Exception on API or network error
     */
    public CategoryEpicgamesResponse categoryEpicgames(Double balanceMax, Double balanceMin, ChangeEmailEnum changeEmail, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, Eg2Enum eg, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, java.util.List<String> game, Integer gmax, Integer gmin, java.util.Map<String, String> hoursPlayed, java.util.Map<String, String> hoursPlayedMax, String itemDomain, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Double rewardsBalanceMax, Double rewardsBalanceMin, Boolean rlPurchases, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/epicgames";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (eg != null) queryParams.put("eg", eg.getValue());
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        if (changeEmail != null) queryParams.put("change_email", changeEmail.getValue());
        if (rlPurchases != null) queryParams.put("rl_purchases", rlPurchases ? "1" : "0");
        if (balanceMin != null) queryParams.put("balance_min", String.valueOf(balanceMin));
        if (balanceMax != null) queryParams.put("balance_max", String.valueOf(balanceMax));
        if (rewardsBalanceMin != null) queryParams.put("rewards_balance_min", String.valueOf(rewardsBalanceMin));
        if (rewardsBalanceMax != null) queryParams.put("rewards_balance_max", String.valueOf(rewardsBalanceMax));
        if (gmin != null) queryParams.put("gmin", String.valueOf(gmin));
        if (gmax != null) queryParams.put("gmax", String.valueOf(gmax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (hoursPlayed != null) queryParams.put("hours_played", String.valueOf(hoursPlayed));
        if (hoursPlayedMax != null) queryParams.put("hours_played_max", String.valueOf(hoursPlayedMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryEpicgamesResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /escape-from-tarkov</p>
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param levelMax levelMax (optional, nullable)
     * @param levelMin levelMin (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param pve pve (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param region region (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param side side (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param version version (optional, nullable)
     * @return CategoryEscapefromtarkovResponse
     * @throws Exception on API or network error
     */
    public CategoryEscapefromtarkovResponse categoryEscapefromtarkov(CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, String itemDomain, Integer levelMax, Integer levelMin, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, String pve, Integer reg, RegPeriodEnum regPeriod, RegionEnum region, Boolean sb, Boolean sbByMe, SideEnum side, java.util.List<Integer> tagId, String title, Integer userId, java.util.List<String> version) throws Exception {
        String path = "/escape-from-tarkov";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (region != null) queryParams.put("region", region.getValue());
        if (version != null) {
            for (int i = 0; i < version.size(); i++) {
                queryParams.put("version[][" + i + "]", String.valueOf(version.get(i)));
            }
        }
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (levelMin != null) queryParams.put("level_min", String.valueOf(levelMin));
        if (levelMax != null) queryParams.put("level_max", String.valueOf(levelMax));
        if (pve != null) queryParams.put("pve", String.valueOf(pve));
        if (side != null) queryParams.put("side", side.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryEscapefromtarkovResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /socialclub</p>
     * @param bankCashMax bankCashMax (optional, nullable)
     * @param bankCashMin bankCashMin (optional, nullable)
     * @param cashMax cashMax (optional, nullable)
     * @param cashMin cashMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param game game (optional, nullable)
     * @param levelMax levelMax (optional, nullable)
     * @param levelMin levelMin (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategorySocialclubResponse
     * @throws Exception on API or network error
     */
    public CategorySocialclubResponse categorySocialclub(Integer bankCashMax, Integer bankCashMin, Integer cashMax, Integer cashMin, CurrencyEnum currency, Integer daybreak, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> game, Integer levelMax, Integer levelMin, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/socialclub";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (levelMin != null) queryParams.put("level_min", String.valueOf(levelMin));
        if (levelMax != null) queryParams.put("level_max", String.valueOf(levelMax));
        if (cashMin != null) queryParams.put("cash_min", String.valueOf(cashMin));
        if (cashMax != null) queryParams.put("cash_max", String.valueOf(cashMax));
        if (bankCashMin != null) queryParams.put("bank_cash_min", String.valueOf(bankCashMin));
        if (bankCashMax != null) queryParams.put("bank_cash_max", String.valueOf(bankCashMax));
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategorySocialclubResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /uplay</p>
     * @param balanceMax balanceMax (optional, nullable)
     * @param balanceMin balanceMin (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param game game (optional, nullable)
     * @param gmax gmax (optional, nullable)
     * @param gmin gmin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param psnConnected psnConnected (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param r6Ban r6Ban (optional, nullable)
     * @param r6LevelMax r6LevelMax (optional, nullable)
     * @param r6LevelMin r6LevelMin (optional, nullable)
     * @param r6Operator r6Operator (optional, nullable)
     * @param r6OperatorsMax r6OperatorsMax (optional, nullable)
     * @param r6OperatorsMin r6OperatorsMin (optional, nullable)
     * @param r6RankMax r6RankMax (optional, nullable)
     * @param r6RankMin r6RankMin (optional, nullable)
     * @param r6Skin r6Skin (optional, nullable)
     * @param r6Smax r6Smax (optional, nullable)
     * @param r6Smin r6Smin (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param steamConnected steamConnected (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param transactions transactions (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param xboxConnected xboxConnected (optional, nullable)
     * @return CategoryUplayResponse
     * @throws Exception on API or network error
     */
    public CategoryUplayResponse categoryUplay(Double balanceMax, Double balanceMin, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, java.util.List<String> game, Integer gmax, Integer gmin, String itemDomain, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, String psnConnected, java.util.List<Integer> publicTagId, String r6Ban, Integer r6LevelMax, Integer r6LevelMin, java.util.List<String> r6Operator, Integer r6OperatorsMax, Integer r6OperatorsMin, Integer r6RankMax, Integer r6RankMin, java.util.List<String> r6Skin, Integer r6Smax, Integer r6Smin, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, String steamConnected, Subscription3Enum subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, String transactions, Integer userId, String xboxConnected) throws Exception {
        String path = "/uplay";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (gmin != null) queryParams.put("gmin", String.valueOf(gmin));
        if (gmax != null) queryParams.put("gmax", String.valueOf(gmax));
        if (subscription != null) queryParams.put("subscription", subscription.getValue());
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (r6LevelMin != null) queryParams.put("r6_level_min", String.valueOf(r6LevelMin));
        if (r6LevelMax != null) queryParams.put("r6_level_max", String.valueOf(r6LevelMax));
        if (r6RankMin != null) queryParams.put("r6_rank_min", String.valueOf(r6RankMin));
        if (r6RankMax != null) queryParams.put("r6_rank_max", String.valueOf(r6RankMax));
        if (r6OperatorsMin != null) queryParams.put("r6_operators_min", String.valueOf(r6OperatorsMin));
        if (r6OperatorsMax != null) queryParams.put("r6_operators_max", String.valueOf(r6OperatorsMax));
        if (r6Ban != null) queryParams.put("r6_ban", String.valueOf(r6Ban));
        if (r6Smin != null) queryParams.put("r6_smin", String.valueOf(r6Smin));
        if (r6Smax != null) queryParams.put("r6_smax", String.valueOf(r6Smax));
        if (r6Skin != null) {
            for (int i = 0; i < r6Skin.size(); i++) {
                queryParams.put("r6_skin[][" + i + "]", String.valueOf(r6Skin.get(i)));
            }
        }
        if (r6Operator != null) {
            for (int i = 0; i < r6Operator.size(); i++) {
                queryParams.put("r6_operator[][" + i + "]", String.valueOf(r6Operator.get(i)));
            }
        }
        if (xboxConnected != null) queryParams.put("xbox_connected", String.valueOf(xboxConnected));
        if (psnConnected != null) queryParams.put("psn_connected", String.valueOf(psnConnected));
        if (steamConnected != null) queryParams.put("steam_connected", String.valueOf(steamConnected));
        if (balanceMin != null) queryParams.put("balance_min", String.valueOf(balanceMin));
        if (balanceMax != null) queryParams.put("balance_max", String.valueOf(balanceMax));
        if (transactions != null) queryParams.put("transactions", String.valueOf(transactions));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryUplayResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /discord</p>
     * @param _2fa _2fa (optional, nullable)
     * @param badge badge (optional, nullable)
     * @param billing billing (optional, nullable)
     * @param boostsMax boostsMax (optional, nullable)
     * @param boostsMin boostsMin (optional, nullable)
     * @param chatMax chatMax (optional, nullable)
     * @param chatMin chatMin (optional, nullable)
     * @param clans clans (optional, nullable)
     * @param condition condition (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param gifts gifts (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param language language (optional, nullable)
     * @param maxAdmin maxAdmin (optional, nullable)
     * @param maxAdminClans maxAdminClans (optional, nullable)
     * @param maxAdminMembers maxAdminMembers (optional, nullable)
     * @param maxBasicCredits maxBasicCredits (optional, nullable)
     * @param maxFullCredits maxFullCredits (optional, nullable)
     * @param maxOrbs maxOrbs (optional, nullable)
     * @param maxOwnerClans maxOwnerClans (optional, nullable)
     * @param maxServers maxServers (optional, nullable)
     * @param minAdmin minAdmin (optional, nullable)
     * @param minAdminClans minAdminClans (optional, nullable)
     * @param minAdminMembers minAdminMembers (optional, nullable)
     * @param minBasicCredits minBasicCredits (optional, nullable)
     * @param minFullCredits minFullCredits (optional, nullable)
     * @param minOrbs minOrbs (optional, nullable)
     * @param minOwnerClans minOwnerClans (optional, nullable)
     * @param minServers minServers (optional, nullable)
     * @param nitro nitro (optional, nullable)
     * @param nitroLength nitroLength (optional, nullable)
     * @param nitroPeriod nitroPeriod (optional, nullable)
     * @param nitroType nitroType (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notLanguage notLanguage (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param transactions transactions (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryDiscordResponse
     * @throws Exception on API or network error
     */
    public CategoryDiscordResponse categoryDiscord(String _2fa, java.util.List<String> badge, String billing, Integer boostsMax, Integer boostsMin, Integer chatMax, Integer chatMin, String clans, java.util.List<String> condition, java.util.List<String> country, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, String gifts, String itemDomain, java.util.List<String> language, Integer maxAdmin, Integer maxAdminClans, Integer maxAdminMembers, Integer maxBasicCredits, Integer maxFullCredits, Integer maxOrbs, Integer maxOwnerClans, Integer maxServers, Integer minAdmin, Integer minAdminClans, Integer minAdminMembers, Integer minBasicCredits, Integer minFullCredits, Integer minOrbs, Integer minOwnerClans, Integer minServers, String nitro, Integer nitroLength, NitroPeriodEnum nitroPeriod, java.util.List<String> nitroType, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notLanguage, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, TelEnum tel, String title, String transactions, Integer userId) throws Exception {
        String path = "/discord";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (nitro != null) queryParams.put("nitro", String.valueOf(nitro));
        if (nitroType != null) {
            for (int i = 0; i < nitroType.size(); i++) {
                queryParams.put("nitro_type[][" + i + "]", String.valueOf(nitroType.get(i)));
            }
        }
        if (nitroLength != null) queryParams.put("nitro_length", String.valueOf(nitroLength));
        if (nitroPeriod != null) queryParams.put("nitro_period", nitroPeriod.getValue());
        if (boostsMin != null) queryParams.put("boosts_min", String.valueOf(boostsMin));
        if (boostsMax != null) queryParams.put("boosts_max", String.valueOf(boostsMax));
        if (billing != null) queryParams.put("billing", String.valueOf(billing));
        if (gifts != null) queryParams.put("gifts", String.valueOf(gifts));
        if (transactions != null) queryParams.put("transactions", String.valueOf(transactions));
        if (badge != null) {
            for (int i = 0; i < badge.size(); i++) {
                queryParams.put("badge[][" + i + "]", String.valueOf(badge.get(i)));
            }
        }
        if (condition != null) {
            for (int i = 0; i < condition.size(); i++) {
                queryParams.put("condition[][" + i + "]", String.valueOf(condition.get(i)));
            }
        }
        if (chatMin != null) queryParams.put("chat_min", String.valueOf(chatMin));
        if (chatMax != null) queryParams.put("chat_max", String.valueOf(chatMax));
        if (minAdminMembers != null) queryParams.put("min_admin_members", String.valueOf(minAdminMembers));
        if (maxAdminMembers != null) queryParams.put("max_admin_members", String.valueOf(maxAdminMembers));
        if (minAdmin != null) queryParams.put("min_admin", String.valueOf(minAdmin));
        if (maxAdmin != null) queryParams.put("max_admin", String.valueOf(maxAdmin));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (language != null) {
            for (int i = 0; i < language.size(); i++) {
                queryParams.put("language[][" + i + "]", String.valueOf(language.get(i)));
            }
        }
        if (notLanguage != null) {
            for (int i = 0; i < notLanguage.size(); i++) {
                queryParams.put("not_language[][" + i + "]", String.valueOf(notLanguage.get(i)));
            }
        }
        if (clans != null) queryParams.put("clans", String.valueOf(clans));
        if (minAdminClans != null) queryParams.put("min_admin_clans", String.valueOf(minAdminClans));
        if (maxAdminClans != null) queryParams.put("max_admin_clans", String.valueOf(maxAdminClans));
        if (minOwnerClans != null) queryParams.put("min_owner_clans", String.valueOf(minOwnerClans));
        if (maxOwnerClans != null) queryParams.put("max_owner_clans", String.valueOf(maxOwnerClans));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (minServers != null) queryParams.put("min_servers", String.valueOf(minServers));
        if (maxServers != null) queryParams.put("max_servers", String.valueOf(maxServers));
        if (_2fa != null) queryParams.put("2fa", String.valueOf(_2fa));
        if (minFullCredits != null) queryParams.put("min_full_credits", String.valueOf(minFullCredits));
        if (maxFullCredits != null) queryParams.put("max_full_credits", String.valueOf(maxFullCredits));
        if (minBasicCredits != null) queryParams.put("min_basic_credits", String.valueOf(minBasicCredits));
        if (maxBasicCredits != null) queryParams.put("max_basic_credits", String.valueOf(maxBasicCredits));
        if (minOrbs != null) queryParams.put("min_orbs", String.valueOf(minOrbs));
        if (maxOrbs != null) queryParams.put("max_orbs", String.valueOf(maxOrbs));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryDiscordResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /tiktok</p>
     * @param coinsMax coinsMax (optional, nullable)
     * @param coinsMin coinsMin (optional, nullable)
     * @param cookieLogin cookieLogin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param email email (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param followersMax followersMax (optional, nullable)
     * @param followersMin followersMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param likeMax likeMax (optional, nullable)
     * @param likeMin likeMin (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param postMax postMax (optional, nullable)
     * @param postMin postMin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param verified verified (optional, nullable)
     * @return CategoryTiktokResponse
     * @throws Exception on API or network error
     */
    public CategoryTiktokResponse categoryTiktok(Integer coinsMax, Integer coinsMin, String cookieLogin, CurrencyEnum currency, EmailEnum email, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer followersMax, Integer followersMin, String itemDomain, Integer likeMax, Integer likeMin, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer postMax, Integer postMin, java.util.List<Integer> publicTagId, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, TelEnum tel, String title, Integer userId, VerifiedEnum verified) throws Exception {
        String path = "/tiktok";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (followersMin != null) queryParams.put("followers_min", String.valueOf(followersMin));
        if (followersMax != null) queryParams.put("followers_max", String.valueOf(followersMax));
        if (postMin != null) queryParams.put("post_min", String.valueOf(postMin));
        if (postMax != null) queryParams.put("post_max", String.valueOf(postMax));
        if (likeMin != null) queryParams.put("like_min", String.valueOf(likeMin));
        if (likeMax != null) queryParams.put("like_max", String.valueOf(likeMax));
        if (coinsMin != null) queryParams.put("coins_min", String.valueOf(coinsMin));
        if (coinsMax != null) queryParams.put("coins_max", String.valueOf(coinsMax));
        if (cookieLogin != null) queryParams.put("cookie_login", String.valueOf(cookieLogin));
        if (verified != null) queryParams.put("verified", verified.getValue());
        if (email != null) queryParams.put("email", email.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryTiktokResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /instagram</p>
     * @param cookies cookies (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param followersMax followersMax (optional, nullable)
     * @param followersMin followersMin (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param loginWithoutCookies loginWithoutCookies (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param postMax postMax (optional, nullable)
     * @param postMin postMin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryInstagramResponse
     * @throws Exception on API or network error
     */
    public CategoryInstagramResponse categoryInstagram(CookiesEnum cookies, java.util.List<String> country, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, Integer followersMax, Integer followersMin, String itemDomain, String loginWithoutCookies, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer postMax, Integer postMin, java.util.List<Integer> publicTagId, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, TelEnum tel, String title, Integer userId) throws Exception {
        String path = "/instagram";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (cookies != null) queryParams.put("cookies", cookies.getValue());
        if (loginWithoutCookies != null) queryParams.put("login_without_cookies", String.valueOf(loginWithoutCookies));
        if (followersMin != null) queryParams.put("followers_min", String.valueOf(followersMin));
        if (followersMax != null) queryParams.put("followers_max", String.valueOf(followersMax));
        if (postMin != null) queryParams.put("post_min", String.valueOf(postMin));
        if (postMax != null) queryParams.put("post_max", String.valueOf(postMax));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryInstagramResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /battlenet</p>
     * @param balanceMax balanceMax (optional, nullable)
     * @param balanceMin balanceMin (optional, nullable)
     * @param changeableFn changeableFn (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param editBtag editBtag (optional, nullable)
     * @param eg eg (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param game game (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param noBans noBans (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parentControl parentControl (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param realId realId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryBattlenetResponse
     * @throws Exception on API or network error
     */
    public CategoryBattlenetResponse categoryBattlenet(Integer balanceMax, Integer balanceMin, String changeableFn, java.util.List<String> country, CurrencyEnum currency, Integer daybreak, String editBtag, Eg3Enum eg, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, java.util.List<Integer> game, String itemDomain, String noBans, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, String parentControl, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, String realId, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, TelEnum tel, String title, Integer userId) throws Exception {
        String path = "/battlenet";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (eg != null) queryParams.put("eg", eg.getValue());
        if (game != null) {
            for (int i = 0; i < game.size(); i++) {
                queryParams.put("game[][" + i + "]", String.valueOf(game.get(i)));
            }
        }
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (editBtag != null) queryParams.put("edit_btag", String.valueOf(editBtag));
        if (changeableFn != null) queryParams.put("changeable_fn", String.valueOf(changeableFn));
        if (realId != null) queryParams.put("real_id", String.valueOf(realId));
        if (parentControl != null) queryParams.put("parent_control", String.valueOf(parentControl));
        if (noBans != null) queryParams.put("no_bans", String.valueOf(noBans));
        if (balanceMin != null) queryParams.put("balance_min", String.valueOf(balanceMin));
        if (balanceMax != null) queryParams.put("balance_max", String.valueOf(balanceMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryBattlenetResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /chatgpt</p>
     * @param autorenewal autorenewal (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param emailType emailType (optional, nullable)
     * @param itemDomain itemDomain (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param openaiBalanceMax openaiBalanceMax (optional, nullable)
     * @param openaiBalanceMin openaiBalanceMin (optional, nullable)
     * @param openaiTier openaiTier (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param transactions transactions (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryChatgptResponse
     * @throws Exception on API or network error
     */
    public CategoryChatgptResponse categoryChatgpt(AutorenewalEnum autorenewal, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, java.util.List<String> emailType, String itemDomain, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, Integer openaiBalanceMax, Integer openaiBalanceMin, java.util.List<String> openaiTier, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, java.util.List<String> subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, TelEnum tel, String title, String transactions, Integer userId) throws Exception {
        String path = "/chatgpt";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (emailType != null) {
            for (int i = 0; i < emailType.size(); i++) {
                queryParams.put("email_type[][" + i + "]", String.valueOf(emailType.get(i)));
            }
        }
        if (itemDomain != null) queryParams.put("item_domain", String.valueOf(itemDomain));
        if (subscription != null) {
            for (int i = 0; i < subscription.size(); i++) {
                queryParams.put("subscription[][" + i + "]", String.valueOf(subscription.get(i)));
            }
        }
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (autorenewal != null) queryParams.put("autorenewal", autorenewal.getValue());
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (transactions != null) queryParams.put("transactions", String.valueOf(transactions));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (openaiTier != null) {
            for (int i = 0; i < openaiTier.size(); i++) {
                queryParams.put("openai_tier[][" + i + "]", String.valueOf(openaiTier.get(i)));
            }
        }
        if (openaiBalanceMin != null) queryParams.put("openai_balance_min", String.valueOf(openaiBalanceMin));
        if (openaiBalanceMax != null) queryParams.put("openai_balance_max", String.valueOf(openaiBalanceMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryChatgptResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /vpn</p>
     * @param autorenewal autorenewal (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param service service (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryVpnResponse
     * @throws Exception on API or network error
     */
    public CategoryVpnResponse categoryVpn(AutorenewalEnum autorenewal, CurrencyEnum currency, Boolean emailLoginData, java.util.List<String> emailProvider, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, java.util.List<String> service, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/vpn";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (service != null) {
            for (int i = 0; i < service.size(); i++) {
                queryParams.put("service[][" + i + "]", String.valueOf(service.get(i)));
            }
        }
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (autorenewal != null) queryParams.put("autorenewal", autorenewal.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryVpnResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /roblox</p>
     * @param ageGroup ageGroup (optional, nullable)
     * @param ageVerified ageVerified (optional, nullable)
     * @param autorenewal autorenewal (optional, nullable)
     * @param country country (optional, nullable)
     * @param creditBalanceMax creditBalanceMax (optional, nullable)
     * @param creditBalanceMin creditBalanceMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param email email (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param followersMax followersMax (optional, nullable)
     * @param followersMin followersMin (optional, nullable)
     * @param friendsMax friendsMax (optional, nullable)
     * @param friendsMin friendsMin (optional, nullable)
     * @param gameDonations gameDonations (optional, nullable)
     * @param gamepassMax gamepassMax (optional, nullable)
     * @param gamepassMin gamepassMin (optional, nullable)
     * @param incomingRobuxTotalMax incomingRobuxTotalMax (optional, nullable)
     * @param incomingRobuxTotalMin incomingRobuxTotalMin (optional, nullable)
     * @param invMax invMax (optional, nullable)
     * @param invMin invMin (optional, nullable)
     * @param limitedPriceMax limitedPriceMax (optional, nullable)
     * @param limitedPriceMin limitedPriceMin (optional, nullable)
     * @param notAgeGroup notAgeGroup (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param offsaleMax offsaleMax (optional, nullable)
     * @param offsaleMin offsaleMin (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param psnConnected psnConnected (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param robuxMax robuxMax (optional, nullable)
     * @param robuxMin robuxMin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param ugcLimitedPriceMax ugcLimitedPriceMax (optional, nullable)
     * @param ugcLimitedPriceMin ugcLimitedPriceMin (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param verified verified (optional, nullable)
     * @param voice voice (optional, nullable)
     * @param xboxConnected xboxConnected (optional, nullable)
     * @return CategoryRobloxResponse
     * @throws Exception on API or network error
     */
    public CategoryRobloxResponse categoryRoblox(java.util.List<String> ageGroup, String ageVerified, AutorenewalEnum autorenewal, java.util.List<String> country, Integer creditBalanceMax, Integer creditBalanceMin, CurrencyEnum currency, String email, Boolean emailLoginData, java.util.List<String> emailProvider, Integer followersMax, Integer followersMin, Integer friendsMax, Integer friendsMin, String gameDonations, Integer gamepassMax, Integer gamepassMin, Integer incomingRobuxTotalMax, Integer incomingRobuxTotalMin, Integer invMax, Integer invMin, Integer limitedPriceMax, Integer limitedPriceMin, java.util.List<String> notAgeGroup, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, Integer offsaleMax, Integer offsaleMin, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, String psnConnected, java.util.List<Integer> publicTagId, Integer reg, RegPeriodEnum regPeriod, Integer robuxMax, Integer robuxMin, Boolean sb, Boolean sbByMe, Subscription4Enum subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, Integer ugcLimitedPriceMax, Integer ugcLimitedPriceMin, Integer userId, VerifiedEnum verified, String voice, String xboxConnected) throws Exception {
        String path = "/roblox";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (email != null) queryParams.put("email", String.valueOf(email));
        if (robuxMin != null) queryParams.put("robux_min", String.valueOf(robuxMin));
        if (robuxMax != null) queryParams.put("robux_max", String.valueOf(robuxMax));
        if (friendsMin != null) queryParams.put("friends_min", String.valueOf(friendsMin));
        if (friendsMax != null) queryParams.put("friends_max", String.valueOf(friendsMax));
        if (followersMin != null) queryParams.put("followers_min", String.valueOf(followersMin));
        if (followersMax != null) queryParams.put("followers_max", String.valueOf(followersMax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (subscription != null) queryParams.put("subscription", subscription.getValue());
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (autorenewal != null) queryParams.put("autorenewal", autorenewal.getValue());
        if (xboxConnected != null) queryParams.put("xbox_connected", String.valueOf(xboxConnected));
        if (psnConnected != null) queryParams.put("psn_connected", String.valueOf(psnConnected));
        if (verified != null) queryParams.put("verified", verified.getValue());
        if (ageVerified != null) queryParams.put("age_verified", String.valueOf(ageVerified));
        if (incomingRobuxTotalMin != null) queryParams.put("incoming_robux_total_min", String.valueOf(incomingRobuxTotalMin));
        if (incomingRobuxTotalMax != null) queryParams.put("incoming_robux_total_max", String.valueOf(incomingRobuxTotalMax));
        if (limitedPriceMin != null) queryParams.put("limited_price_min", String.valueOf(limitedPriceMin));
        if (limitedPriceMax != null) queryParams.put("limited_price_max", String.valueOf(limitedPriceMax));
        if (gamepassMin != null) queryParams.put("gamepass_min", String.valueOf(gamepassMin));
        if (gamepassMax != null) queryParams.put("gamepass_max", String.valueOf(gamepassMax));
        if (gameDonations != null) queryParams.put("game_donations", String.valueOf(gameDonations));
        if (invMin != null) queryParams.put("inv_min", String.valueOf(invMin));
        if (invMax != null) queryParams.put("inv_max", String.valueOf(invMax));
        if (ugcLimitedPriceMin != null) queryParams.put("ugc_limited_price_min", String.valueOf(ugcLimitedPriceMin));
        if (ugcLimitedPriceMax != null) queryParams.put("ugc_limited_price_max", String.valueOf(ugcLimitedPriceMax));
        if (creditBalanceMin != null) queryParams.put("credit_balance_min", String.valueOf(creditBalanceMin));
        if (creditBalanceMax != null) queryParams.put("credit_balance_max", String.valueOf(creditBalanceMax));
        if (offsaleMin != null) queryParams.put("offsale_min", String.valueOf(offsaleMin));
        if (offsaleMax != null) queryParams.put("offsale_max", String.valueOf(offsaleMax));
        if (voice != null) queryParams.put("voice", String.valueOf(voice));
        if (ageGroup != null) {
            for (int i = 0; i < ageGroup.size(); i++) {
                queryParams.put("age_group[][" + i + "]", String.valueOf(ageGroup.get(i)));
            }
        }
        if (notAgeGroup != null) {
            for (int i = 0; i < notAgeGroup.size(); i++) {
                queryParams.put("not_age_group[][" + i + "]", String.valueOf(notAgeGroup.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryRobloxResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /warface</p>
     * @param bonusRankMax bonusRankMax (optional, nullable)
     * @param bonusRankMin bonusRankMin (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param daybreak daybreak (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param kreditsMax kreditsMax (optional, nullable)
     * @param kreditsMin kreditsMin (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param rankMax rankMax (optional, nullable)
     * @param rankMin rankMin (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param tel tel (optional, nullable)
     * @param title title (optional, nullable)
     * @param totalKreditsMax totalKreditsMax (optional, nullable)
     * @param totalKreditsMin totalKreditsMin (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryWarfaceResponse
     * @throws Exception on API or network error
     */
    public CategoryWarfaceResponse categoryWarface(Integer bonusRankMax, Integer bonusRankMin, CurrencyEnum currency, Integer daybreak, Boolean emailLoginData, java.util.List<String> emailProvider, Integer kreditsMax, Integer kreditsMin, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, Integer rankMax, Integer rankMin, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, TelEnum tel, String title, Integer totalKreditsMax, Integer totalKreditsMin, Integer userId) throws Exception {
        String path = "/warface";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (rankMin != null) queryParams.put("rank_min", String.valueOf(rankMin));
        if (rankMax != null) queryParams.put("rank_max", String.valueOf(rankMax));
        if (bonusRankMin != null) queryParams.put("bonus_rank_min", String.valueOf(bonusRankMin));
        if (bonusRankMax != null) queryParams.put("bonus_rank_max", String.valueOf(bonusRankMax));
        if (tel != null) queryParams.put("tel", tel.getValue());
        if (daybreak != null) queryParams.put("daybreak", String.valueOf(daybreak));
        if (kreditsMin != null) queryParams.put("kredits_min", String.valueOf(kreditsMin));
        if (kreditsMax != null) queryParams.put("kredits_max", String.valueOf(kreditsMax));
        if (totalKreditsMin != null) queryParams.put("total_kredits_min", String.valueOf(totalKreditsMin));
        if (totalKreditsMax != null) queryParams.put("total_kredits_max", String.valueOf(totalKreditsMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryWarfaceResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /minecraft</p>
     * @param achievementHypixelMax achievementHypixelMax (optional, nullable)
     * @param achievementHypixelMin achievementHypixelMin (optional, nullable)
     * @param autorenewal autorenewal (optional, nullable)
     * @param bedrock bedrock (optional, nullable)
     * @param canChangeDetails canChangeDetails (optional, nullable)
     * @param capes capes (optional, nullable)
     * @param capesMax capesMax (optional, nullable)
     * @param capesMin capesMin (optional, nullable)
     * @param changeNickname changeNickname (optional, nullable)
     * @param country country (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param dungeons dungeons (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param hypixelBan hypixelBan (optional, nullable)
     * @param hypixelBanParsed hypixelBanParsed (optional, nullable)
     * @param hypixelSkyblockApiEnabled hypixelSkyblockApiEnabled (optional, nullable)
     * @param java java (optional, nullable)
     * @param lastLoginHypixel lastLoginHypixel (optional, nullable)
     * @param lastLoginHypixelPeriod lastLoginHypixelPeriod (optional, nullable)
     * @param legends legends (optional, nullable)
     * @param levelHypixelMax levelHypixelMax (optional, nullable)
     * @param levelHypixelMin levelHypixelMin (optional, nullable)
     * @param levelHypixelSkyblockMax levelHypixelSkyblockMax (optional, nullable)
     * @param levelHypixelSkyblockMin levelHypixelSkyblockMin (optional, nullable)
     * @param minecoinsMax minecoinsMax (optional, nullable)
     * @param minecoinsMin minecoinsMin (optional, nullable)
     * @param netWorthHypixelSkyblockMax netWorthHypixelSkyblockMax (optional, nullable)
     * @param netWorthHypixelSkyblockMin netWorthHypixelSkyblockMin (optional, nullable)
     * @param nicknameLengthMax nicknameLengthMax (optional, nullable)
     * @param nicknameLengthMin nicknameLengthMin (optional, nullable)
     * @param notCountry notCountry (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param rankHypixel rankHypixel (optional, nullable)
     * @param reg reg (optional, nullable)
     * @param regPeriod regPeriod (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param subscription subscription (optional, nullable)
     * @param subscriptionLength subscriptionLength (optional, nullable)
     * @param subscriptionPeriod subscriptionPeriod (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryMinecraftResponse
     * @throws Exception on API or network error
     */
    public CategoryMinecraftResponse categoryMinecraft(Integer achievementHypixelMax, Integer achievementHypixelMin, AutorenewalEnum autorenewal, String bedrock, String canChangeDetails, java.util.List<String> capes, Integer capesMax, Integer capesMin, String changeNickname, java.util.List<String> country, CurrencyEnum currency, String dungeons, Boolean emailLoginData, java.util.List<String> emailProvider, String hypixelBan, String hypixelBanParsed, String hypixelSkyblockApiEnabled, String java, Integer lastLoginHypixel, LastLoginHypixelPeriodEnum lastLoginHypixelPeriod, String legends, Integer levelHypixelMax, Integer levelHypixelMin, Integer levelHypixelSkyblockMax, Integer levelHypixelSkyblockMin, Integer minecoinsMax, Integer minecoinsMin, Integer netWorthHypixelSkyblockMax, Integer netWorthHypixelSkyblockMin, Integer nicknameLengthMax, Integer nicknameLengthMin, java.util.List<String> notCountry, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, java.util.List<Integer> publicTagId, java.util.List<String> rankHypixel, Integer reg, RegPeriodEnum regPeriod, Boolean sb, Boolean sbByMe, Subscription5Enum subscription, Integer subscriptionLength, SubscriptionPeriodEnum subscriptionPeriod, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/minecraft";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (subscription != null) queryParams.put("subscription", subscription.getValue());
        if (subscriptionLength != null) queryParams.put("subscription_length", String.valueOf(subscriptionLength));
        if (subscriptionPeriod != null) queryParams.put("subscription_period", subscriptionPeriod.getValue());
        if (autorenewal != null) queryParams.put("autorenewal", autorenewal.getValue());
        if (java != null) queryParams.put("java", String.valueOf(java));
        if (bedrock != null) queryParams.put("bedrock", String.valueOf(bedrock));
        if (dungeons != null) queryParams.put("dungeons", String.valueOf(dungeons));
        if (legends != null) queryParams.put("legends", String.valueOf(legends));
        if (changeNickname != null) queryParams.put("change_nickname", String.valueOf(changeNickname));
        if (capes != null) {
            for (int i = 0; i < capes.size(); i++) {
                queryParams.put("capes[][" + i + "]", String.valueOf(capes.get(i)));
            }
        }
        if (capesMin != null) queryParams.put("capes_min", String.valueOf(capesMin));
        if (capesMax != null) queryParams.put("capes_max", String.valueOf(capesMax));
        if (country != null) {
            for (int i = 0; i < country.size(); i++) {
                queryParams.put("country[][" + i + "]", String.valueOf(country.get(i)));
            }
        }
        if (notCountry != null) {
            for (int i = 0; i < notCountry.size(); i++) {
                queryParams.put("not_country[][" + i + "]", String.valueOf(notCountry.get(i)));
            }
        }
        if (hypixelBan != null) queryParams.put("hypixel_ban", String.valueOf(hypixelBan));
        if (hypixelSkyblockApiEnabled != null) queryParams.put("hypixel_skyblock_api_enabled", String.valueOf(hypixelSkyblockApiEnabled));
        if (rankHypixel != null) {
            for (int i = 0; i < rankHypixel.size(); i++) {
                queryParams.put("rank_hypixel[][" + i + "]", String.valueOf(rankHypixel.get(i)));
            }
        }
        if (levelHypixelMin != null) queryParams.put("level_hypixel_min", String.valueOf(levelHypixelMin));
        if (levelHypixelMax != null) queryParams.put("level_hypixel_max", String.valueOf(levelHypixelMax));
        if (achievementHypixelMin != null) queryParams.put("achievement_hypixel_min", String.valueOf(achievementHypixelMin));
        if (achievementHypixelMax != null) queryParams.put("achievement_hypixel_max", String.valueOf(achievementHypixelMax));
        if (levelHypixelSkyblockMin != null) queryParams.put("level_hypixel_skyblock_min", String.valueOf(levelHypixelSkyblockMin));
        if (levelHypixelSkyblockMax != null) queryParams.put("level_hypixel_skyblock_max", String.valueOf(levelHypixelSkyblockMax));
        if (netWorthHypixelSkyblockMin != null) queryParams.put("net_worth_hypixel_skyblock_min", String.valueOf(netWorthHypixelSkyblockMin));
        if (netWorthHypixelSkyblockMax != null) queryParams.put("net_worth_hypixel_skyblock_max", String.valueOf(netWorthHypixelSkyblockMax));
        if (reg != null) queryParams.put("reg", String.valueOf(reg));
        if (regPeriod != null) queryParams.put("reg_period", regPeriod.getValue());
        if (lastLoginHypixel != null) queryParams.put("last_login_hypixel", String.valueOf(lastLoginHypixel));
        if (lastLoginHypixelPeriod != null) queryParams.put("last_login_hypixel_period", lastLoginHypixelPeriod.getValue());
        if (canChangeDetails != null) queryParams.put("can_change_details", String.valueOf(canChangeDetails));
        if (nicknameLengthMin != null) queryParams.put("nickname_length_min", String.valueOf(nicknameLengthMin));
        if (nicknameLengthMax != null) queryParams.put("nickname_length_max", String.valueOf(nicknameLengthMax));
        if (hypixelBanParsed != null) queryParams.put("hypixel_ban_parsed", String.valueOf(hypixelBanParsed));
        if (minecoinsMin != null) queryParams.put("minecoins_min", String.valueOf(minecoinsMin));
        if (minecoinsMax != null) queryParams.put("minecoins_max", String.valueOf(minecoinsMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryMinecraftResponse.class);
    }

    /**
     * Displays a list of accounts in a specific category according to your parameters.
     *
     * <p>GET /hytale</p>
     * @param currency currency (optional, nullable)
     * @param edition edition (optional, nullable)
     * @param emailLoginData emailLoginData (optional, nullable)
     * @param emailProvider emailProvider (optional, nullable)
     * @param notEmailProvider notEmailProvider (optional, nullable)
     * @param notOrigin notOrigin (optional, nullable)
     * @param notPublicTagId notPublicTagId (optional, nullable)
     * @param notTagId notTagId (optional, nullable)
     * @param nsb nsb (optional, nullable)
     * @param nsbByMe nsbByMe (optional, nullable)
     * @param orderBy orderBy (optional, nullable)
     * @param origin origin (optional, nullable)
     * @param page page (optional, nullable)
     * @param parseSameItemIds parseSameItemIds (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param profilesMax profilesMax (optional, nullable)
     * @param profilesMin profilesMin (optional, nullable)
     * @param publicTagId publicTagId (optional, nullable)
     * @param sb sb (optional, nullable)
     * @param sbByMe sbByMe (optional, nullable)
     * @param tagId tagId (optional, nullable)
     * @param title title (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CategoryHytaleResponse
     * @throws Exception on API or network error
     */
    public CategoryHytaleResponse categoryHytale(CurrencyEnum currency, java.util.List<String> edition, Boolean emailLoginData, java.util.List<String> emailProvider, NotEmailProviderEnum notEmailProvider, java.util.List<String> notOrigin, java.util.List<Integer> notPublicTagId, java.util.List<Integer> notTagId, Boolean nsb, Boolean nsbByMe, OrderByEnum orderBy, java.util.List<String> origin, Integer page, Boolean parseSameItemIds, Integer pmax, Integer pmin, Integer profilesMax, Integer profilesMin, java.util.List<Integer> publicTagId, Boolean sb, Boolean sbByMe, java.util.List<Integer> tagId, String title, Integer userId) throws Exception {
        String path = "/hytale";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (orderBy != null) queryParams.put("order_by", orderBy.getValue());
        if (tagId != null) {
            for (int i = 0; i < tagId.size(); i++) {
                queryParams.put("tag_id[][" + i + "]", String.valueOf(tagId.get(i)));
            }
        }
        if (notTagId != null) {
            for (int i = 0; i < notTagId.size(); i++) {
                queryParams.put("not_tag_id[][" + i + "]", String.valueOf(notTagId.get(i)));
            }
        }
        if (publicTagId != null) {
            for (int i = 0; i < publicTagId.size(); i++) {
                queryParams.put("public_tag_id[][" + i + "]", String.valueOf(publicTagId.get(i)));
            }
        }
        if (notPublicTagId != null) {
            for (int i = 0; i < notPublicTagId.size(); i++) {
                queryParams.put("not_public_tag_id[][" + i + "]", String.valueOf(notPublicTagId.get(i)));
            }
        }
        if (origin != null) {
            for (int i = 0; i < origin.size(); i++) {
                queryParams.put("origin[][" + i + "]", String.valueOf(origin.get(i)));
            }
        }
        if (notOrigin != null) {
            for (int i = 0; i < notOrigin.size(); i++) {
                queryParams.put("not_origin[][" + i + "]", String.valueOf(notOrigin.get(i)));
            }
        }
        if (userId != null) queryParams.put("user_id", String.valueOf(userId));
        if (nsb != null) queryParams.put("nsb", nsb ? "1" : "0");
        if (sb != null) queryParams.put("sb", sb ? "1" : "0");
        if (nsbByMe != null) queryParams.put("nsb_by_me", nsbByMe ? "1" : "0");
        if (sbByMe != null) queryParams.put("sb_by_me", sbByMe ? "1" : "0");
        if (currency != null) queryParams.put("currency", currency.getValue());
        if (emailLoginData != null) queryParams.put("email_login_data", emailLoginData ? "1" : "0");
        if (emailProvider != null) {
            for (int i = 0; i < emailProvider.size(); i++) {
                queryParams.put("email_provider[][" + i + "]", String.valueOf(emailProvider.get(i)));
            }
        }
        if (notEmailProvider != null) queryParams.put("not_email_provider[]", notEmailProvider.getValue());
        if (parseSameItemIds != null) queryParams.put("parse_same_item_ids", parseSameItemIds ? "1" : "0");
        if (edition != null) {
            for (int i = 0; i < edition.size(); i++) {
                queryParams.put("edition[][" + i + "]", String.valueOf(edition.get(i)));
            }
        }
        if (profilesMin != null) queryParams.put("profiles_min", String.valueOf(profilesMin));
        if (profilesMax != null) queryParams.put("profiles_max", String.valueOf(profilesMax));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoryHytaleResponse.class);
    }

    // ==================== Custom Discounts ====================

    /**
     * Get a list of custom discounts.
     *
     * <p>GET /custom-discounts</p>
     * @return CustomdiscountsGetResponse
     * @throws Exception on API or network error
     */
    public CustomdiscountsGetResponse customdiscountsGet() throws Exception {
        String path = "/custom-discounts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CustomdiscountsGetResponse.class);
    }

    /**
     * Creates a new custom discount.
     *
     * <p>POST /custom-discounts</p>
     * @param categoryId categoryId (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param discountPercent discountPercent (optional, nullable)
     * @param maxPrice maxPrice (optional, nullable)
     * @param minPrice minPrice (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return CustomdiscountsCreateResponse
     * @throws Exception on API or network error
     */
    public CustomdiscountsCreateResponse customdiscountsCreate(String categoryId, String currency, Double discountPercent, Double maxPrice, Double minPrice, Integer userId) throws Exception {
        String path = "/custom-discounts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        if (categoryId != null) body.put("category_id", categoryId);
        if (discountPercent != null) body.put("discount_percent", discountPercent);
        if (minPrice != null) body.put("min_price", minPrice);
        if (maxPrice != null) body.put("max_price", maxPrice);
        if (currency != null) body.put("currency", currency);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, CustomdiscountsCreateResponse.class);
    }

    /**
     * Edit an existing custom discount.
     *
     * <p>PUT /custom-discounts</p>
     * @param discountId discountId (optional, nullable)
     * @param discountPercent discountPercent (optional, nullable)
     * @param maxPrice maxPrice (optional, nullable)
     * @param minPrice minPrice (optional, nullable)
     * @return CustomdiscountsEditResponse
     * @throws Exception on API or network error
     */
    public CustomdiscountsEditResponse customdiscountsEdit(Integer discountId, Double discountPercent, Double maxPrice, Double minPrice) throws Exception {
        String path = "/custom-discounts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (discountId != null) body.put("discount_id", discountId);
        if (discountPercent != null) body.put("discount_percent", discountPercent);
        if (minPrice != null) body.put("min_price", minPrice);
        if (maxPrice != null) body.put("max_price", maxPrice);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, CustomdiscountsEditResponse.class);
    }

    /**
     * Delete an existing custom discount.
     *
     * <p>DELETE /custom-discounts</p>
     * @param discountId discountId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse customdiscountsDelete(Integer discountId) throws Exception {
        String path = "/custom-discounts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (discountId != null) body.put("discount_id", discountId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== IMAP ====================

    /**
     * Create an IMAP configuration for a domain.
     *
     * <p>POST /imap</p>
     * @param domain domain (optional, nullable)
     * @param imapServer imapServer (optional, nullable)
     * @param port port (optional, nullable)
     * @param secure secure (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse imapCreate(String domain, String imapServer, Integer port, Boolean secure) throws Exception {
        String path = "/imap";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (domain != null) body.put("domain", domain);
        if (imapServer != null) body.put("imap_server", imapServer);
        if (port != null) body.put("port", port);
        if (secure != null) body.put("secure", secure);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Delete an IMAP configuration for a domain.
     *
     * <p>DELETE /imap</p>
     * @param domain domain (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse imapDelete(String domain) throws Exception {
        String path = "/imap";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (domain != null) body.put("domain", domain);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Invoices ====================

    /**
     * Get invoice.

Required scopes:
+ **invoice**
     *
     * <p>GET /invoice</p>
     * @param invoiceId invoiceId (optional, nullable)
     * @param paymentId paymentId (optional, nullable)
     * @return PaymentsInvoiceGetResponse
     * @throws Exception on API or network error
     */
    public PaymentsInvoiceGetResponse paymentsInvoiceGet(Integer invoiceId, String paymentId) throws Exception {
        String path = "/invoice";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (invoiceId != null) queryParams.put("invoice_id", String.valueOf(invoiceId));
        if (paymentId != null) queryParams.put("payment_id", String.valueOf(paymentId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsInvoiceGetResponse.class);
    }

    /**
     * Create invoice.

Required scopes:
+ **invoice**
     *
     * <p>POST /invoice</p>
     * @param additionalData additionalData (optional, nullable)
     * @param amount amount (optional, nullable)
     * @param comment comment (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param isTest isTest (optional, nullable)
     * @param lifetime lifetime (optional, nullable)
     * @param merchantId merchantId (optional, nullable)
     * @param paymentId paymentId (optional, nullable)
     * @param requiredTelegramId requiredTelegramId (optional, nullable)
     * @param requiredTelegramUsername requiredTelegramUsername (optional, nullable)
     * @param urlCallback urlCallback (optional, nullable)
     * @param urlSuccess urlSuccess (optional, nullable)
     * @return PaymentsInvoiceCreateResponse
     * @throws Exception on API or network error
     */
    public PaymentsInvoiceCreateResponse paymentsInvoiceCreate(String additionalData, Double amount, String comment, String currency, Boolean isTest, Double lifetime, Integer merchantId, String paymentId, Integer requiredTelegramId, String requiredTelegramUsername, String urlCallback, String urlSuccess) throws Exception {
        String path = "/invoice";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (currency != null) body.put("currency", currency);
        if (amount != null) body.put("amount", amount);
        if (paymentId != null) body.put("payment_id", paymentId);
        if (comment != null) body.put("comment", comment);
        if (urlSuccess != null) body.put("url_success", urlSuccess);
        if (urlCallback != null) body.put("url_callback", urlCallback);
        if (merchantId != null) body.put("merchant_id", merchantId);
        if (requiredTelegramId != null) body.put("required_telegram_id", requiredTelegramId);
        if (requiredTelegramUsername != null) body.put("required_telegram_username", requiredTelegramUsername);
        if (lifetime != null) body.put("lifetime", lifetime);
        if (additionalData != null) body.put("additional_data", additionalData);
        if (isTest != null) body.put("is_test", isTest);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PaymentsInvoiceCreateResponse.class);
    }

    /**
     * Get invoice list.

Required scopes:
+ **invoice**
     *
     * <p>GET /invoice/list</p>
     * @param amount amount (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param merchantId merchantId (optional, nullable)
     * @param page page (optional, nullable)
     * @param status status (optional, nullable)
     * @return PaymentsInvoiceListResponse
     * @throws Exception on API or network error
     */
    public PaymentsInvoiceListResponse paymentsInvoiceList(Double amount, String currency, Integer merchantId, Integer page, StatusEnum status) throws Exception {
        String path = "/invoice/list";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (currency != null) queryParams.put("currency", String.valueOf(currency));
        if (status != null) queryParams.put("status", status.getValue());
        if (amount != null) queryParams.put("amount", String.valueOf(amount));
        if (merchantId != null) queryParams.put("merchant_id", String.valueOf(merchantId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsInvoiceListResponse.class);
    }

    // ==================== Payments ====================

    /**
     * Get currency list.
     *
     * <p>GET /currency</p>
     * @return PaymentsCurrencyResponse
     * @throws Exception on API or network error
     */
    public PaymentsCurrencyResponse paymentsCurrency() throws Exception {
        String path = "/currency";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsCurrencyResponse.class);
    }

    /**
     * Returns list of balances.
     *
     * <p>GET /balance/exchange</p>
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse paymentsBalanceList() throws Exception {
        String path = "/balance/exchange";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Transfer funds from one balance to another.
     *
     * <p>POST /balance/exchange</p>
     * @param amount amount (optional, nullable)
     * @param fromBalance fromBalance (optional, nullable)
     * @param toBalance toBalance (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse paymentsBalanceexchange(Integer amount, String fromBalance, String toBalance) throws Exception {
        String path = "/balance/exchange";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (fromBalance != null) body.put("from_balance", fromBalance);
        if (toBalance != null) body.put("to_balance", toBalance);
        if (amount != null) body.put("amount", amount);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Transfer money to any user.

Required scopes:
+ **payment**
     *
     * <p>POST /balance/transfer</p>
     * @param amount amount (optional, nullable)
     * @param comment comment (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param holdLengthOption holdLengthOption (optional, nullable)
     * @param holdLengthValue holdLengthValue (optional, nullable)
     * @param telegramDeal telegramDeal (optional, nullable)
     * @param telegramUsername telegramUsername (optional, nullable)
     * @param transferHold transferHold (optional, nullable)
     * @param userId userId (optional, nullable)
     * @param username username (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse paymentsTransfer(Integer amount, String comment, String currency, HoldLengthOptionEnum holdLengthOption, Integer holdLengthValue, Boolean telegramDeal, String telegramUsername, Boolean transferHold, Integer userId, String username) throws Exception {
        String path = "/balance/transfer";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        if (username != null) body.put("username", username);
        if (amount != null) body.put("amount", amount);
        if (currency != null) body.put("currency", currency);
        if (comment != null) body.put("comment", comment);
        if (telegramDeal != null) body.put("telegram_deal", telegramDeal);
        if (telegramUsername != null) body.put("telegram_username", telegramUsername);
        if (transferHold != null) body.put("transfer_hold", transferHold);
        if (holdLengthValue != null) body.put("hold_length_value", holdLengthValue);
        if (holdLengthOption != null) body.put("hold_length_option", holdLengthOption.getValue());
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get transfer limits and get fee amount for transfer.

Required scopes:
+ **payment**
     *
     * <p>GET /balance/transfer/fee</p>
     * @param amount amount (optional, nullable)
     * @return PaymentsFeeResponse
     * @throws Exception on API or network error
     */
    public PaymentsFeeResponse paymentsFee(Double amount) throws Exception {
        String path = "/balance/transfer/fee";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (amount != null) queryParams.put("amount", String.valueOf(amount));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsFeeResponse.class);
    }

    /**
     * Cancels a transfer with a hold that was sent to your account.

Required scopes:
+ **payment**
     *
     * <p>POST /balance/transfer/cancel</p>
     * @param paymentId paymentId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse paymentsCancel(Integer paymentId) throws Exception {
        String path = "/balance/transfer/cancel";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (paymentId != null) body.put("payment_id", paymentId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Displays list of your payments.

Required scopes:
+ **payment**
     *
     * <p>GET /user/payments</p>
     * @param comment comment (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param enddate enddate (optional, nullable)
     * @param isApi isApi (optional, nullable)
     * @param isHold isHold (optional, nullable)
     * @param operationIdLt operationIdLt (optional, nullable)
     * @param page page (optional, nullable)
     * @param pmax pmax (optional, nullable)
     * @param pmin pmin (optional, nullable)
     * @param receiver receiver (optional, nullable)
     * @param sender sender (optional, nullable)
     * @param showPaymentStats showPaymentStats (optional, nullable)
     * @param startdate startdate (optional, nullable)
     * @param type type (optional, nullable)
     * @param wallet wallet (optional, nullable)
     * @return PaymentsHistoryResponse
     * @throws Exception on API or network error
     */
    public PaymentsHistoryResponse paymentsHistory(String comment, String currency, String enddate, Boolean isApi, Boolean isHold, Integer operationIdLt, Integer page, Integer pmax, Integer pmin, String receiver, String sender, Boolean showPaymentStats, String startdate, Type6Enum type, String wallet) throws Exception {
        String path = "/user/payments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        if (pmin != null) queryParams.put("pmin", String.valueOf(pmin));
        if (pmax != null) queryParams.put("pmax", String.valueOf(pmax));
        if (currency != null) queryParams.put("currency", String.valueOf(currency));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (operationIdLt != null) queryParams.put("operation_id_lt", String.valueOf(operationIdLt));
        if (receiver != null) queryParams.put("receiver", String.valueOf(receiver));
        if (sender != null) queryParams.put("sender", String.valueOf(sender));
        if (isApi != null) queryParams.put("is_api", isApi ? "1" : "0");
        if (startdate != null) queryParams.put("startDate", String.valueOf(startdate));
        if (enddate != null) queryParams.put("endDate", String.valueOf(enddate));
        if (wallet != null) queryParams.put("wallet", String.valueOf(wallet));
        if (comment != null) queryParams.put("comment", String.valueOf(comment));
        if (isHold != null) queryParams.put("is_hold", isHold ? "1" : "0");
        if (showPaymentStats != null) queryParams.put("show_payment_stats", showPaymentStats ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsHistoryResponse.class);
    }

    /**
     * Get auto payments list.

Required scopes:
+ **payment**
     *
     * <p>GET /auto-payments</p>
     * @return AutopaymentsListResponse
     * @throws Exception on API or network error
     */
    public AutopaymentsListResponse autopaymentsList() throws Exception {
        String path = "/auto-payments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, AutopaymentsListResponse.class);
    }

    /**
     * Creates auto payment.

Required scopes:
+ **payment**
     *
     * <p>POST /auto-payment</p>
     * @param amount amount (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param day day (optional, nullable)
     * @param description description (optional, nullable)
     * @param secretAnswer secretAnswer (optional, nullable)
     * @param usernameReceiver usernameReceiver (optional, nullable)
     * @return AutopaymentsCreateResponse
     * @throws Exception on API or network error
     */
    public AutopaymentsCreateResponse autopaymentsCreate(Double amount, String currency, DayEnum day, String description, String secretAnswer, String usernameReceiver) throws Exception {
        String path = "/auto-payment";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (secretAnswer != null) body.put("secret_answer", secretAnswer);
        if (usernameReceiver != null) body.put("username_receiver", usernameReceiver);
        if (day != null) body.put("day", day.getValue());
        if (amount != null) body.put("amount", amount);
        if (currency != null) body.put("currency", currency);
        if (description != null) body.put("description", description);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, AutopaymentsCreateResponse.class);
    }

    /**
     * Deletes an auto payment.

Required scopes:
+ **payment**
     *
     * <p>DELETE /auto-payment</p>
     * @param autoPaymentId autoPaymentId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse autopaymentsDelete(Integer autoPaymentId) throws Exception {
        String path = "/auto-payment";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (autoPaymentId != null) body.put("auto_payment_id", autoPaymentId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get a list of available payout services.
     *
     * <p>GET /balance/payout/services</p>
     * @return PaymentsPayoutservicesResponse
     * @throws Exception on API or network error
     */
    public PaymentsPayoutservicesResponse paymentsPayoutservices() throws Exception {
        String path = "/balance/payout/services";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PaymentsPayoutservicesResponse.class);
    }

    /**
     * Creates a payout request.
     *
     * <p>POST /balance/payout</p>
     * @param amount amount (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param extra extra (optional, nullable)
     * @param includeFee includeFee (optional, nullable)
     * @param paymentSystem paymentSystem (optional, nullable)
     * @param wallet wallet (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse paymentsPayout(Double amount, String currency, java.util.Map<String, String> extra, Boolean includeFee, String paymentSystem, String wallet) throws Exception {
        String path = "/balance/payout";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (paymentSystem != null) body.put("payment_system", paymentSystem);
        if (wallet != null) body.put("wallet", wallet);
        if (amount != null) body.put("amount", amount);
        if (currency != null) body.put("currency", currency);
        if (includeFee != null) body.put("include_fee", includeFee);
        if (extra != null) body.put("extra", extra);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Profile ====================

    /**
     * Displays info about your profile.
     *
     * <p>GET /me</p>
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @return ProfileGetResponse
     * @throws Exception on API or network error
     */
    public ProfileGetResponse profileGet(java.util.List<String> fieldsInclude) throws Exception {
        String path = "/me";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfileGetResponse.class);
    }

    /**
     * Change settings about your profile on the market.
     *
     * <p>PUT /me</p>
     * @param allowAcceptAccounts allowAcceptAccounts (optional, nullable)
     * @param clearTelegramClient clearTelegramClient (optional, nullable)
     * @param option option (optional, nullable)
     * @param telegramApiHash telegramApiHash (optional, nullable)
     * @param telegramApiId telegramApiId (optional, nullable)
     * @param telegramAppVersion telegramAppVersion (optional, nullable)
     * @param telegramDeviceModel telegramDeviceModel (optional, nullable)
     * @param telegramLangCode telegramLangCode (optional, nullable)
     * @param telegramLangPack telegramLangPack (optional, nullable)
     * @param telegramSystemLangCode telegramSystemLangCode (optional, nullable)
     * @param telegramSystemVersion telegramSystemVersion (optional, nullable)
     * @param user user (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profileEdit(java.util.List<String> allowAcceptAccounts, Boolean clearTelegramClient, java.util.Map<String, String> option, String telegramApiHash, String telegramApiId, String telegramAppVersion, String telegramDeviceModel, String telegramLangCode, String telegramLangPack, String telegramSystemLangCode, String telegramSystemVersion, java.util.Map<String, String> user) throws Exception {
        String path = "/me";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (user != null) body.put("user", user);
        if (option != null) body.put("option", option);
        if (allowAcceptAccounts != null) {
            for (int i = 0; i < allowAcceptAccounts.size(); i++) {
                body.put("allow_accept_accounts[" + i + "]", String.valueOf(allowAcceptAccounts.get(i)));
            }
        }
        if (telegramApiId != null) body.put("telegram_api_id", telegramApiId);
        if (telegramApiHash != null) body.put("telegram_api_hash", telegramApiHash);
        if (telegramDeviceModel != null) body.put("telegram_device_model", telegramDeviceModel);
        if (telegramSystemVersion != null) body.put("telegram_system_version", telegramSystemVersion);
        if (telegramAppVersion != null) body.put("telegram_app_version", telegramAppVersion);
        if (telegramLangPack != null) body.put("telegram_lang_pack", telegramLangPack);
        if (telegramLangCode != null) body.put("telegram_lang_code", telegramLangCode);
        if (telegramSystemLangCode != null) body.put("telegram_system_lang_code", telegramSystemLangCode);
        if (clearTelegramClient != null) body.put("clear_telegram_client", clearTelegramClient);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Proxy ====================

    /**
     * Gets your proxy list.
     *
     * <p>GET /proxy</p>
     * @return ProxyGetResponse
     * @throws Exception on API or network error
     */
    public ProxyGetResponse proxyGet() throws Exception {
        String path = "/proxy";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProxyGetResponse.class);
    }

    /**
     * Add single proxy or proxy list.


To add single proxy use this parameters:


+ **proxy_ip** (required) - proxy ip or host
+ **proxy_port** (required) - proxy port
+ **proxy_user** (optional) - proxy username
+ **proxy_pass** (optional) - proxy password

To add proxy list use this parameters:


+ **proxy_row** (required) - proxy list in String format ip:port:user:pass. Each proxy must be start with new line (use \n separator)
     *
     * <p>POST /proxy</p>
     * @param proxyIp proxyIp (optional, nullable)
     * @param proxyPass proxyPass (optional, nullable)
     * @param proxyPort proxyPort (optional, nullable)
     * @param proxyRow proxyRow (optional, nullable)
     * @param proxyUser proxyUser (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse proxyAdd(String proxyIp, String proxyPass, Integer proxyPort, String proxyRow, String proxyUser) throws Exception {
        String path = "/proxy";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (proxyIp != null) body.put("proxy_ip", proxyIp);
        if (proxyPort != null) body.put("proxy_port", proxyPort);
        if (proxyUser != null) body.put("proxy_user", proxyUser);
        if (proxyPass != null) body.put("proxy_pass", proxyPass);
        if (proxyRow != null) body.put("proxy_row", proxyRow);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Delete single or all proxies.
     *
     * <p>DELETE /proxy</p>
     * @param deleteAll deleteAll (optional, nullable)
     * @param proxyId proxyId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse proxyDelete(Boolean deleteAll, Integer proxyId) throws Exception {
        String path = "/proxy";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (proxyId != null) body.put("proxy_id", proxyId);
        if (deleteAll != null) body.put("delete_all", deleteAll);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

}

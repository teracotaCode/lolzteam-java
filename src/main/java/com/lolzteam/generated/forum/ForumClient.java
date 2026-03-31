package com.lolzteam.generated.forum;

import com.lolzteam.runtime.HttpClientInterface;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.lolzteam.generated.forum.models.AssetsCssResponse;
import com.lolzteam.generated.forum.models.BatchExecuteResponse;
import com.lolzteam.generated.forum.models.CategoriesGetResponse;
import com.lolzteam.generated.forum.models.CategoriesListResponse;
import com.lolzteam.generated.forum.models.ChatboxEditmessageResponse;
import com.lolzteam.generated.forum.models.ChatboxGetignoreResponse;
import com.lolzteam.generated.forum.models.ChatboxGetleaderboardResponse;
import com.lolzteam.generated.forum.models.ChatboxGetmessagesResponse;
import com.lolzteam.generated.forum.models.ChatboxIndexResponse;
import com.lolzteam.generated.forum.models.ChatboxOnlineResponse;
import com.lolzteam.generated.forum.models.ChatboxPostmessageResponse;
import com.lolzteam.generated.forum.models.ChatboxReportreasonsResponse;
import com.lolzteam.generated.forum.models.ConversationsAlertsDisableResponse;
import com.lolzteam.generated.forum.models.ConversationsAlertsEnableResponse;
import com.lolzteam.generated.forum.models.ConversationsCreateResponse;
import com.lolzteam.generated.forum.models.ConversationsGetResponse;
import com.lolzteam.generated.forum.models.ConversationsListResponse;
import com.lolzteam.generated.forum.models.ConversationsMessagesCreateResponse;
import com.lolzteam.generated.forum.models.ConversationsMessagesEditResponse;
import com.lolzteam.generated.forum.models.ConversationsMessagesGetResponse;
import com.lolzteam.generated.forum.models.ConversationsMessagesListResponse;
import com.lolzteam.generated.forum.models.ConversationsReadallResponse;
import com.lolzteam.generated.forum.models.ConversationsSearchResponse;
import com.lolzteam.generated.forum.models.ConversationsStarResponse;
import com.lolzteam.generated.forum.models.ConversationsStartResponse;
import com.lolzteam.generated.forum.models.ConversationsUnstarResponse;
import com.lolzteam.generated.forum.models.ConversationsUpdateResponse;
import com.lolzteam.generated.forum.models.FormsCreateResponse;
import com.lolzteam.generated.forum.models.FormsListResponse;
import com.lolzteam.generated.forum.models.ForumsFollowedResponse;
import com.lolzteam.generated.forum.models.ForumsFollowersResponse;
import com.lolzteam.generated.forum.models.ForumsGetResponse;
import com.lolzteam.generated.forum.models.ForumsGetfeedoptionsResponse;
import com.lolzteam.generated.forum.models.ForumsGroupedResponse;
import com.lolzteam.generated.forum.models.ForumsListResponse;
import com.lolzteam.generated.forum.models.LinksGetResponse;
import com.lolzteam.generated.forum.models.LinksListResponse;
import com.lolzteam.generated.forum.models.NavigationListResponse;
import com.lolzteam.generated.forum.models.NotificationsGetResponse;
import com.lolzteam.generated.forum.models.NotificationsListResponse;
import com.lolzteam.generated.forum.models.OauthTokenResponse;
import com.lolzteam.generated.forum.models.PagesGetResponse;
import com.lolzteam.generated.forum.models.PagesListResponse;
import com.lolzteam.generated.forum.models.PostsCommentsCreateResponse;
import com.lolzteam.generated.forum.models.PostsCommentsEditResponse;
import com.lolzteam.generated.forum.models.PostsCommentsGetResponse;
import com.lolzteam.generated.forum.models.PostsCreateResponse;
import com.lolzteam.generated.forum.models.PostsEditResponse;
import com.lolzteam.generated.forum.models.PostsGetResponse;
import com.lolzteam.generated.forum.models.PostsLikesResponse;
import com.lolzteam.generated.forum.models.PostsListResponse;
import com.lolzteam.generated.forum.models.PostsReportreasonsResponse;
import com.lolzteam.generated.forum.models.ProfilepostsCommentsCreateResponse;
import com.lolzteam.generated.forum.models.ProfilepostsCommentsEditResponse;
import com.lolzteam.generated.forum.models.ProfilepostsCommentsGetResponse;
import com.lolzteam.generated.forum.models.ProfilepostsCommentsListResponse;
import com.lolzteam.generated.forum.models.ProfilepostsCreateResponse;
import com.lolzteam.generated.forum.models.ProfilepostsEditResponse;
import com.lolzteam.generated.forum.models.ProfilepostsGetResponse;
import com.lolzteam.generated.forum.models.ProfilepostsLikesResponse;
import com.lolzteam.generated.forum.models.ProfilepostsListResponse;
import com.lolzteam.generated.forum.models.ProfilepostsReportreasonsResponse;
import com.lolzteam.generated.forum.models.SaveChangesResponse;
import com.lolzteam.generated.forum.models.SearchAllResponse;
import com.lolzteam.generated.forum.models.SearchPostsResponse;
import com.lolzteam.generated.forum.models.SearchProfilepostsResponse;
import com.lolzteam.generated.forum.models.SearchResultsResponse;
import com.lolzteam.generated.forum.models.SearchTaggedResponse;
import com.lolzteam.generated.forum.models.SearchThreadsResponse;
import com.lolzteam.generated.forum.models.SearchUsersResponse;
import com.lolzteam.generated.forum.models.TagsFindResponse;
import com.lolzteam.generated.forum.models.TagsGetResponse;
import com.lolzteam.generated.forum.models.TagsListResponse;
import com.lolzteam.generated.forum.models.TagsPopularResponse;
import com.lolzteam.generated.forum.models.ThreadsBumpResponse;
import com.lolzteam.generated.forum.models.ThreadsClaimResponse;
import com.lolzteam.generated.forum.models.ThreadsCreateResponse;
import com.lolzteam.generated.forum.models.ThreadsCreatecontestResponse;
import com.lolzteam.generated.forum.models.ThreadsEditResponse;
import com.lolzteam.generated.forum.models.ThreadsFollowedResponse;
import com.lolzteam.generated.forum.models.ThreadsFollowersResponse;
import com.lolzteam.generated.forum.models.ThreadsGetResponse;
import com.lolzteam.generated.forum.models.ThreadsHideResponse;
import com.lolzteam.generated.forum.models.ThreadsListResponse;
import com.lolzteam.generated.forum.models.ThreadsNavigationResponse;
import com.lolzteam.generated.forum.models.ThreadsPollGetResponse;
import com.lolzteam.generated.forum.models.ThreadsRecentResponse;
import com.lolzteam.generated.forum.models.ThreadsUnreadResponse;
import com.lolzteam.generated.forum.models.UsersAvatarCropResponse;
import com.lolzteam.generated.forum.models.UsersAvatarUploadResponse;
import com.lolzteam.generated.forum.models.UsersBackgroundCropResponse;
import com.lolzteam.generated.forum.models.UsersBackgroundUploadResponse;
import com.lolzteam.generated.forum.models.UsersClaimsResponse;
import com.lolzteam.generated.forum.models.UsersContentsResponse;
import com.lolzteam.generated.forum.models.UsersFieldsResponse;
import com.lolzteam.generated.forum.models.UsersFindResponse;
import com.lolzteam.generated.forum.models.UsersFollowersResponse;
import com.lolzteam.generated.forum.models.UsersFollowingsResponse;
import com.lolzteam.generated.forum.models.UsersGetResponse;
import com.lolzteam.generated.forum.models.UsersIgnoredResponse;
import com.lolzteam.generated.forum.models.UsersLikesResponse;
import com.lolzteam.generated.forum.models.UsersListResponse;
import com.lolzteam.generated.forum.models.UsersSaResetResponse;
import com.lolzteam.generated.forum.models.UsersSecretanswertypesResponse;
import com.lolzteam.generated.forum.models.UsersTrophiesResponse;
import com.lolzteam.generated.forum.enums.AllowInviteGroupEnum;
import com.lolzteam.generated.forum.enums.AllowPostProfileEnum;
import com.lolzteam.generated.forum.enums.AllowReceiveNewsFeedEnum;
import com.lolzteam.generated.forum.enums.AllowSendPersonalConversationEnum;
import com.lolzteam.generated.forum.enums.AllowViewProfileEnum;
import com.lolzteam.generated.forum.enums.ClaimStateEnum;
import com.lolzteam.generated.forum.enums.ContentTypeEnum;
import com.lolzteam.generated.forum.enums.ContestTypeEnum;
import com.lolzteam.generated.forum.enums.CurrencyEnum;
import com.lolzteam.generated.forum.enums.DeleteTypeEnum;
import com.lolzteam.generated.forum.enums.DirectionEnum;
import com.lolzteam.generated.forum.enums.DurationEnum;
import com.lolzteam.generated.forum.enums.FolderEnum;
import com.lolzteam.generated.forum.enums.FormIdEnum;
import com.lolzteam.generated.forum.enums.GenderEnum;
import com.lolzteam.generated.forum.enums.GrantTypeEnum;
import com.lolzteam.generated.forum.enums.LanguageIdEnum;
import com.lolzteam.generated.forum.enums.LengthOptionEnum;
import com.lolzteam.generated.forum.enums.LikeTypeEnum;
import com.lolzteam.generated.forum.enums.Order1Enum;
import com.lolzteam.generated.forum.enums.Order2Enum;
import com.lolzteam.generated.forum.enums.Order3Enum;
import com.lolzteam.generated.forum.enums.Order4Enum;
import com.lolzteam.generated.forum.enums.Order5Enum;
import com.lolzteam.generated.forum.enums.PayClaimEnum;
import com.lolzteam.generated.forum.enums.PeriodEnum;
import com.lolzteam.generated.forum.enums.PrizeDataUpgradeEnum;
import com.lolzteam.generated.forum.enums.PrizeTypeEnum;
import com.lolzteam.generated.forum.enums.ReplyGroupEnum;
import com.lolzteam.generated.forum.enums.StateEnum;
import com.lolzteam.generated.forum.enums.TimezoneEnum;
import com.lolzteam.generated.forum.enums.TransferTypeEnum;
import com.lolzteam.generated.forum.enums.Type1Enum;
import com.lolzteam.generated.forum.enums.Type2Enum;

/**
 * Auto-generated ForumClient API client.
 *
 * <p>Generated from OpenAPI schema. All API methods throw checked exceptions
 * on network or API errors.</p>
 */
public class ForumClient {

    private final HttpClientInterface client;
    private final String baseUrl;
    private final ObjectMapper objectMapper;

    /**
     * Create a new ForumClient with the default base URL.
     *
     * @param client the HTTP client to use for requests
     */
    public ForumClient(HttpClientInterface client) {
        this(client, "https://prod-api.lolz.live");
    }

    /**
     * Create a new ForumClient with a custom base URL.
     *
     * @param client  the HTTP client to use for requests
     * @param baseUrl the base URL for all API requests
     */
    public ForumClient(HttpClientInterface client, String baseUrl) {
        this.client = client;
        this.baseUrl = baseUrl;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    // ==================== Assets ====================

    /**
     * Gets css rulesets for requested selectors.
     *
     * <p>GET /css</p>
     * @param css css (optional, nullable)
     * @return AssetsCssResponse
     * @throws Exception on API or network error
     */
    public AssetsCssResponse assetsCss(java.util.List<String> css) throws Exception {
        String path = "/css";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (css != null) {
            for (int i = 0; i < css.size(); i++) {
                queryParams.put("css[" + i + "]", String.valueOf(css.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, AssetsCssResponse.class);
    }

    // ==================== Authentication ====================

    /**
     * Obtain an access token using various grant types.

Supports the following grant types:
- Client Credentials
- Authorization Code
- Refresh Token
- Password
     *
     * <p>POST /oauth/token</p>
     * @param clientId clientId (optional, nullable)
     * @param clientSecret clientSecret (optional, nullable)
     * @param code code (optional, nullable)
     * @param grantType grantType (optional, nullable)
     * @param password password (optional, nullable)
     * @param redirectUri redirectUri (optional, nullable)
     * @param refreshToken refreshToken (optional, nullable)
     * @param scope scope (optional, nullable)
     * @param username username (optional, nullable)
     * @return OauthTokenResponse
     * @throws Exception on API or network error
     */
    public OauthTokenResponse oauthToken(String clientId, String clientSecret, String code, GrantTypeEnum grantType, String password, String redirectUri, String refreshToken, java.util.List<String> scope, String username) throws Exception {
        String path = "/oauth/token";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, String> textParts = new java.util.HashMap<>();
        if (grantType != null) textParts.put("grant_type", grantType.getValue());
        if (clientId != null) textParts.put("client_id", String.valueOf(clientId));
        if (clientSecret != null) textParts.put("client_secret", String.valueOf(clientSecret));
        if (scope != null) {
            for (int i = 0; i < scope.size(); i++) {
                textParts.put("scope[" + i + "]", String.valueOf(scope.get(i)));
            }
        }
        if (code != null) textParts.put("code", String.valueOf(code));
        if (redirectUri != null) textParts.put("redirect_uri", String.valueOf(redirectUri));
        if (refreshToken != null) textParts.put("refresh_token", String.valueOf(refreshToken));
        if (username != null) textParts.put("username", String.valueOf(username));
        if (password != null) textParts.put("password", String.valueOf(password));
        java.util.Map<String, byte[]> fileParts = new java.util.HashMap<>();
        String response = client.postMultipart(url, null, queryParams, textParts, fileParts);
        return objectMapper.readValue(response, OauthTokenResponse.class);
    }

    // ==================== Batch requests ====================

    /**
     * Execute multiple API requests at once (Separated by comma). Maximum batch jobs is 10.

Required scopes:
+ Same as called API requests.
     *
     * <p>POST /batch</p>
     * @param jobs jobs (required)
     * @return BatchExecuteResponse
     * @throws Exception on API or network error
     */
    public BatchExecuteResponse batchExecute(java.util.List<java.util.Map<String, Object>> jobs) throws Exception {
        String path = "/batch";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.postJsonRaw(url, null, queryParams, jobs);
        return objectMapper.readValue(response, BatchExecuteResponse.class);
    }

    // ==================== Categories ====================

    /**
     * List of all categories in the system.

Required scopes:
+ **read**
     *
     * <p>GET /categories</p>
     * @param order order (optional, nullable)
     * @param parentCategoryId parentCategoryId (optional, nullable)
     * @param parentForumId parentForumId (optional, nullable)
     * @return CategoriesListResponse
     * @throws Exception on API or network error
     */
    public CategoriesListResponse categoriesList(Order1Enum order, Integer parentCategoryId, Integer parentForumId) throws Exception {
        String path = "/categories";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (parentCategoryId != null) queryParams.put("parent_category_id", String.valueOf(parentCategoryId));
        if (parentForumId != null) queryParams.put("parent_forum_id", String.valueOf(parentForumId));
        if (order != null) queryParams.put("order", order.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoriesListResponse.class);
    }

    /**
     * Detail information of a category.

Required scopes:
+ **read**
     *
     * <p>GET /categories/{category_id}</p>
     * @param categoryId categoryId (required)
     * @return CategoriesGetResponse
     * @throws Exception on API or network error
     */
    public CategoriesGetResponse categoriesGet(Integer categoryId) throws Exception {
        String path = "/categories/{category_id}";
        path = path.replace("{category_id}", String.valueOf(categoryId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, CategoriesGetResponse.class);
    }

    // ==================== Chatbox ====================

    /**
     * Get chat rooms.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox</p>
     * @param roomId roomId (optional, nullable)
     * @return ChatboxIndexResponse
     * @throws Exception on API or network error
     */
    public ChatboxIndexResponse chatboxIndex(String roomId) throws Exception {
        String path = "/chatbox";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (roomId != null) queryParams.put("room_id", String.valueOf(roomId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxIndexResponse.class);
    }

    /**
     * Get chat messages.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox/messages</p>
     * @param roomId roomId (required)
     * @param beforeMessageId beforeMessageId (optional, nullable)
     * @return ChatboxGetmessagesResponse
     * @throws Exception on API or network error
     */
    public ChatboxGetmessagesResponse chatboxGetmessages(String roomId, Integer beforeMessageId) throws Exception {
        String path = "/chatbox/messages";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (roomId != null) queryParams.put("room_id", String.valueOf(roomId));
        if (beforeMessageId != null) queryParams.put("before_message_id", String.valueOf(beforeMessageId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxGetmessagesResponse.class);
    }

    /**
     * Create chat message.

Required scopes:
+ **chatbox**
     *
     * <p>POST /chatbox/messages</p>
     * @param message message (optional, nullable)
     * @param replyMessageId replyMessageId (optional, nullable)
     * @param roomId roomId (optional, nullable)
     * @return ChatboxPostmessageResponse
     * @throws Exception on API or network error
     */
    public ChatboxPostmessageResponse chatboxPostmessage(String message, Integer replyMessageId, String roomId) throws Exception {
        String path = "/chatbox/messages";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (roomId != null) body.put("room_id", roomId);
        if (replyMessageId != null) body.put("reply_message_id", replyMessageId);
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ChatboxPostmessageResponse.class);
    }

    /**
     * Edit chat message.

Required scopes:
+ **chatbox**
     *
     * <p>PUT /chatbox/messages</p>
     * @param message message (optional, nullable)
     * @param messageId messageId (optional, nullable)
     * @return ChatboxEditmessageResponse
     * @throws Exception on API or network error
     */
    public ChatboxEditmessageResponse chatboxEditmessage(String message, Integer messageId) throws Exception {
        String path = "/chatbox/messages";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (messageId != null) body.put("message_id", messageId);
        if (message != null) body.put("message", message);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ChatboxEditmessageResponse.class);
    }

    /**
     * Delete chat message.

Required scopes:
+ **chatbox**
     *
     * <p>DELETE /chatbox/messages</p>
     * @param messageId messageId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse chatboxDeletemessage(Integer messageId) throws Exception {
        String path = "/chatbox/messages";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (messageId != null) body.put("message_id", messageId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get chat Online Users.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox/messages/online</p>
     * @param roomId roomId (required)
     * @return ChatboxOnlineResponse
     * @throws Exception on API or network error
     */
    public ChatboxOnlineResponse chatboxOnline(String roomId) throws Exception {
        String path = "/chatbox/messages/online";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (roomId != null) queryParams.put("room_id", String.valueOf(roomId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxOnlineResponse.class);
    }

    /**
     * Report chat message.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox/messages/report</p>
     * @param messageId messageId (required)
     * @return ChatboxReportreasonsResponse
     * @throws Exception on API or network error
     */
    public ChatboxReportreasonsResponse chatboxReportreasons(Integer messageId) throws Exception {
        String path = "/chatbox/messages/report";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (messageId != null) queryParams.put("message_id", String.valueOf(messageId));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxReportreasonsResponse.class);
    }

    /**
     * Report chat message.

Required scopes:
+ **chatbox**
     *
     * <p>POST /chatbox/messages/report</p>
     * @param messageId messageId (optional, nullable)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse chatboxReport(Integer messageId, String reason) throws Exception {
        String path = "/chatbox/messages/report";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (messageId != null) body.put("message_id", messageId);
        if (reason != null) body.put("reason", reason);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get chat leaderboard.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox/messages/leaderboard</p>
     * @param duration duration (optional, nullable)
     * @return ChatboxGetleaderboardResponse
     * @throws Exception on API or network error
     */
    public ChatboxGetleaderboardResponse chatboxGetleaderboard(DurationEnum duration) throws Exception {
        String path = "/chatbox/messages/leaderboard";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (duration != null) queryParams.put("duration", duration.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxGetleaderboardResponse.class);
    }

    /**
     * Get list of ignored chat users.

Required scopes:
+ **chatbox**
     *
     * <p>GET /chatbox/ignore</p>
     * @return ChatboxGetignoreResponse
     * @throws Exception on API or network error
     */
    public ChatboxGetignoreResponse chatboxGetignore() throws Exception {
        String path = "/chatbox/ignore";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ChatboxGetignoreResponse.class);
    }

    /**
     * Ignore chat user.

Required scopes:
+ **chatbox**
     *
     * <p>POST /chatbox/ignore</p>
     * @param userId userId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse chatboxPostignore(String userId) throws Exception {
        String path = "/chatbox/ignore";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unignore chat user.

Required scopes:
+ **chatbox**
     *
     * <p>DELETE /chatbox/ignore</p>
     * @param userId userId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse chatboxDeleteignore(String userId) throws Exception {
        String path = "/chatbox/ignore";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Content Tagging ====================

    /**
     * List of popular tags (no pagination).

Required scopes:
+ **read**
     *
     * <p>GET /tags</p>
     * @return TagsPopularResponse
     * @throws Exception on API or network error
     */
    public TagsPopularResponse tagsPopular() throws Exception {
        String path = "/tags";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, TagsPopularResponse.class);
    }

    /**
     * List of tags.

Required scopes:
+ **read**
     *
     * <p>GET /tags/list</p>
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return TagsListResponse
     * @throws Exception on API or network error
     */
    public TagsListResponse tagsList(Integer limit, Integer page) throws Exception {
        String path = "/tags/list";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, TagsListResponse.class);
    }

    /**
     * List of tagged contents.

Required scopes:
+ **read**
     *
     * <p>GET /tags/{tag_id}</p>
     * @param tagId tagId (required)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return TagsGetResponse
     * @throws Exception on API or network error
     */
    public TagsGetResponse tagsGet(Integer tagId, Integer limit, Integer page) throws Exception {
        String path = "/tags/{tag_id}";
        path = path.replace("{tag_id}", String.valueOf(tagId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, TagsGetResponse.class);
    }

    /**
     * Filtered list of tags.

Required scopes:
+ **read**
     *
     * <p>GET /tags/find</p>
     * @param tag tag (required)
     * @return TagsFindResponse
     * @throws Exception on API or network error
     */
    public TagsFindResponse tagsFind(String tag) throws Exception {
        String path = "/tags/find";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (tag != null) queryParams.put("tag", String.valueOf(tag));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, TagsFindResponse.class);
    }

    // ==================== Conversations ====================

    /**
     * List of conversations (with pagination).

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>GET /conversations</p>
     * @param folder folder (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return ConversationsListResponse
     * @throws Exception on API or network error
     */
    public ConversationsListResponse conversationsList(FolderEnum folder, Integer limit, Integer page) throws Exception {
        String path = "/conversations";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (folder != null) queryParams.put("folder", folder.getValue());
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsListResponse.class);
    }

    /**
     * Create a new conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>POST /conversations</p>
     * @param allowDeleteOwnMessages allowDeleteOwnMessages (optional, nullable)
     * @param allowEditMessages allowEditMessages (optional, nullable)
     * @param allowStickyMessages allowStickyMessages (optional, nullable)
     * @param isGroup isGroup (optional, nullable)
     * @param messageBody messageBody (optional, nullable)
     * @param openInvite openInvite (optional, nullable)
     * @param recipientId recipientId (optional, nullable)
     * @param recipients recipients (optional, nullable)
     * @param title title (optional, nullable)
     * @return ConversationsCreateResponse
     * @throws Exception on API or network error
     */
    public ConversationsCreateResponse conversationsCreate(Boolean allowDeleteOwnMessages, Boolean allowEditMessages, Boolean allowStickyMessages, Boolean isGroup, String messageBody, Boolean openInvite, Integer recipientId, java.util.List<String> recipients, String title) throws Exception {
        String path = "/conversations";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (recipientId != null) body.put("recipient_id", recipientId);
        if (recipients != null) {
            for (int i = 0; i < recipients.size(); i++) {
                body.put("recipients[" + i + "]", String.valueOf(recipients.get(i)));
            }
        }
        if (isGroup != null) body.put("is_group", isGroup);
        if (title != null) body.put("title", title);
        if (openInvite != null) body.put("open_invite", openInvite);
        if (allowEditMessages != null) body.put("allow_edit_messages", allowEditMessages);
        if (allowStickyMessages != null) body.put("allow_sticky_messages", allowStickyMessages);
        if (allowDeleteOwnMessages != null) body.put("allow_delete_own_messages", allowDeleteOwnMessages);
        if (messageBody != null) body.put("message_body", messageBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsCreateResponse.class);
    }

    /**
     * Edit conversation.

Required scopes:
+ **conversate**
     *
     * <p>PUT /conversations</p>
     * @param allowDeleteOwnMessages allowDeleteOwnMessages (optional, nullable)
     * @param allowEditMessages allowEditMessages (optional, nullable)
     * @param allowStickyMessages allowStickyMessages (optional, nullable)
     * @param conversationId conversationId (optional, nullable)
     * @param historyOpen historyOpen (optional, nullable)
     * @param openInvite openInvite (optional, nullable)
     * @param title title (optional, nullable)
     * @return ConversationsUpdateResponse
     * @throws Exception on API or network error
     */
    public ConversationsUpdateResponse conversationsUpdate(Boolean allowDeleteOwnMessages, Boolean allowEditMessages, Boolean allowStickyMessages, Integer conversationId, Boolean historyOpen, Boolean openInvite, String title) throws Exception {
        String path = "/conversations";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (conversationId != null) body.put("conversation_id", conversationId);
        if (title != null) body.put("title", title);
        if (openInvite != null) body.put("open_invite", openInvite);
        if (historyOpen != null) body.put("history_open", historyOpen);
        if (allowEditMessages != null) body.put("allow_edit_messages", allowEditMessages);
        if (allowStickyMessages != null) body.put("allow_sticky_messages", allowStickyMessages);
        if (allowDeleteOwnMessages != null) body.put("allow_delete_own_messages", allowDeleteOwnMessages);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsUpdateResponse.class);
    }

    /**
     * Leave the conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>DELETE /conversations</p>
     * @param conversationId conversationId (optional, nullable)
     * @param deleteType deleteType (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsDelete(Integer conversationId, DeleteTypeEnum deleteType) throws Exception {
        String path = "/conversations";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (conversationId != null) body.put("conversation_id", conversationId);
        if (deleteType != null) body.put("delete_type", deleteType.getValue());
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Start a new conversation with a user.

Required scopes:
+ **conversate**
     *
     * <p>POST /conversations/start</p>
     * @param userId userId (optional, nullable)
     * @return ConversationsStartResponse
     * @throws Exception on API or network error
     */
    public ConversationsStartResponse conversationsStart(String userId) throws Exception {
        String path = "/conversations/start";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsStartResponse.class);
    }

    /**
     * Send content to Saved Messages.

Required scopes:
+ **conversate**
     *
     * <p>POST /conversations/save</p>
     * @param link link (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsSave(String link) throws Exception {
        String path = "/conversations/save";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (link != null) body.put("link", link);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Detail information of a conversation.

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>GET /conversations/{conversation_id}</p>
     * @param conversationId conversationId (required)
     * @return ConversationsGetResponse
     * @throws Exception on API or network error
     */
    public ConversationsGetResponse conversationsGet(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsGetResponse.class);
    }

    /**
     * List of messages in a conversation (with pagination).

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>GET /conversations/{conversation_id}/messages</p>
     * @param conversationId conversationId (required)
     * @param after after (optional, nullable)
     * @param before before (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param order order (optional, nullable)
     * @param page page (optional, nullable)
     * @return ConversationsMessagesListResponse
     * @throws Exception on API or network error
     */
    public ConversationsMessagesListResponse conversationsMessagesList(Integer conversationId, Integer after, Integer before, Integer limit, Order5Enum order, Integer page) throws Exception {
        String path = "/conversations/{conversation_id}/messages";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (order != null) queryParams.put("order", order.getValue());
        if (before != null) queryParams.put("before", String.valueOf(before));
        if (after != null) queryParams.put("after", String.valueOf(after));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsMessagesListResponse.class);
    }

    /**
     * Create a new conversation message.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/messages</p>
     * @param conversationId conversationId (required)
     * @param messageBody messageBody (optional, nullable)
     * @param replyMessageId replyMessageId (optional, nullable)
     * @return ConversationsMessagesCreateResponse
     * @throws Exception on API or network error
     */
    public ConversationsMessagesCreateResponse conversationsMessagesCreate(Integer conversationId, String messageBody, Integer replyMessageId) throws Exception {
        String path = "/conversations/{conversation_id}/messages";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (replyMessageId != null) body.put("reply_message_id", replyMessageId);
        if (messageBody != null) body.put("message_body", messageBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsMessagesCreateResponse.class);
    }

    /**
     * Search for conversations messages or recipients.

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>POST /conversations/search</p>
     * @param conversationId conversationId (optional, nullable)
     * @param q q (optional, nullable)
     * @param searchRecipients searchRecipients (optional, nullable)
     * @return ConversationsSearchResponse
     * @throws Exception on API or network error
     */
    public ConversationsSearchResponse conversationsSearch(Integer conversationId, String q, Boolean searchRecipients) throws Exception {
        String path = "/conversations/search";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        if (conversationId != null) body.put("conversation_id", conversationId);
        if (searchRecipients != null) body.put("search_recipients", searchRecipients);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsSearchResponse.class);
    }

    /**
     * Detail information of a message.

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>GET /conversations/messages/{message_id}</p>
     * @param messageId messageId (required)
     * @return ConversationsMessagesGetResponse
     * @throws Exception on API or network error
     */
    public ConversationsMessagesGetResponse conversationsMessagesGet(Integer messageId) throws Exception {
        String path = "/conversations/messages/{message_id}";
        path = path.replace("{message_id}", String.valueOf(messageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsMessagesGetResponse.class);
    }

    /**
     * Edit a message.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>PUT /conversations/{conversation_id}/messages/{message_id}</p>
     * @param conversationId conversationId (required)
     * @param messageId messageId (required)
     * @param messageBody messageBody (optional, nullable)
     * @return ConversationsMessagesEditResponse
     * @throws Exception on API or network error
     */
    public ConversationsMessagesEditResponse conversationsMessagesEdit(Integer conversationId, Integer messageId, String messageBody) throws Exception {
        String path = "/conversations/{conversation_id}/messages/{message_id}";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        path = path.replace("{message_id}", String.valueOf(messageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (messageBody != null) body.put("message_body", messageBody);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsMessagesEditResponse.class);
    }

    /**
     * Deletes a message from a conversation.

Required scopes:
+ **conversate**
     *
     * <p>DELETE /conversations/{conversation_id}/messages/{message_id}</p>
     * @param conversationId conversationId (required)
     * @param messageId messageId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsMessagesDelete(Integer conversationId, Integer messageId) throws Exception {
        String path = "/conversations/{conversation_id}/messages/{message_id}";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        path = path.replace("{message_id}", String.valueOf(messageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Invite one or more users to an existing conversation.

Required scopes:
+ **conversate**
+ **post**
     *
     * <p>POST /conversations/{conversation_id}/invite</p>
     * @param conversationId conversationId (required)
     * @param recipients recipients (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsInvite(Integer conversationId, java.util.List<String> recipients) throws Exception {
        String path = "/conversations/{conversation_id}/invite";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (recipients != null) {
            for (int i = 0; i < recipients.size(); i++) {
                body.put("recipients[" + i + "]", String.valueOf(recipients.get(i)));
            }
        }
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Kicks a user from a conversation.

Required scopes:
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/kick</p>
     * @param conversationId conversationId (required)
     * @param userId userId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsKick(Integer conversationId, Integer userId) throws Exception {
        String path = "/conversations/{conversation_id}/kick";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Read a specific conversation.

Required scopes:
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/read</p>
     * @param conversationId conversationId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsRead(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}/read";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Mark all conversations as read.

Required scopes:
+ **read**
+ **conversate**
     *
     * <p>POST /conversations/read-all</p>
     * @return ConversationsReadallResponse
     * @throws Exception on API or network error
     */
    public ConversationsReadallResponse conversationsReadall() throws Exception {
        String path = "/conversations/read-all";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsReadallResponse.class);
    }

    /**
     * Stick a message in a conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/messages/{message_id}/stick</p>
     * @param conversationId conversationId (required)
     * @param messageId messageId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsMessagesStick(Integer conversationId, Integer messageId) throws Exception {
        String path = "/conversations/{conversation_id}/messages/{message_id}/stick";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        path = path.replace("{message_id}", String.valueOf(messageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unstick a message in a conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>DELETE /conversations/{conversation_id}/messages/{message_id}/stick</p>
     * @param conversationId conversationId (required)
     * @param messageId messageId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse conversationsMessagesUnstick(Integer conversationId, Integer messageId) throws Exception {
        String path = "/conversations/{conversation_id}/messages/{message_id}/stick";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        path = path.replace("{message_id}", String.valueOf(messageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Star conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/star</p>
     * @param conversationId conversationId (required)
     * @return ConversationsStarResponse
     * @throws Exception on API or network error
     */
    public ConversationsStarResponse conversationsStar(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}/star";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsStarResponse.class);
    }

    /**
     * Unstar conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>DELETE /conversations/{conversation_id}/star</p>
     * @param conversationId conversationId (required)
     * @return ConversationsUnstarResponse
     * @throws Exception on API or network error
     */
    public ConversationsUnstarResponse conversationsUnstar(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}/star";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsUnstarResponse.class);
    }

    /**
     * Enable alerts for conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>POST /conversations/{conversation_id}/alerts</p>
     * @param conversationId conversationId (required)
     * @return ConversationsAlertsEnableResponse
     * @throws Exception on API or network error
     */
    public ConversationsAlertsEnableResponse conversationsAlertsEnable(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}/alerts";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ConversationsAlertsEnableResponse.class);
    }

    /**
     * Disable alerts for conversation.

Required scopes:
+ **post**
+ **conversate**
     *
     * <p>DELETE /conversations/{conversation_id}/alerts</p>
     * @param conversationId conversationId (required)
     * @return ConversationsAlertsDisableResponse
     * @throws Exception on API or network error
     */
    public ConversationsAlertsDisableResponse conversationsAlertsDisable(Integer conversationId) throws Exception {
        String path = "/conversations/{conversation_id}/alerts";
        path = path.replace("{conversation_id}", String.valueOf(conversationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, ConversationsAlertsDisableResponse.class);
    }

    // ==================== Forms ====================

    /**
     * Get Forms List
     *
     * <p>GET /forms</p>
     * @param page page (optional, nullable)
     * @return FormsListResponse
     * @throws Exception on API or network error
     */
    public FormsListResponse formsList(Integer page) throws Exception {
        String path = "/forms";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, FormsListResponse.class);
    }

    /**
     * Create Form.
     *
     * <p>POST /forms/save</p>
     * @param fields fields (optional, nullable)
     * @param formId formId (optional, nullable)
     * @return FormsCreateResponse
     * @throws Exception on API or network error
     */
    public FormsCreateResponse formsCreate(java.util.Map<String, String> fields, FormIdEnum formId) throws Exception {
        String path = "/forms/save";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (formId != null) body.put("form_id", formId.getValue());
        if (fields != null) body.put("fields", fields);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, FormsCreateResponse.class);
    }

    // ==================== Forums ====================

    /**
     * List of all forums in the system.

Required scopes:
+ **read**
     *
     * <p>GET /forums</p>
     * @param order order (optional, nullable)
     * @param parentCategoryId parentCategoryId (optional, nullable)
     * @param parentForumId parentForumId (optional, nullable)
     * @return ForumsListResponse
     * @throws Exception on API or network error
     */
    public ForumsListResponse forumsList(Order1Enum order, Integer parentCategoryId, Integer parentForumId) throws Exception {
        String path = "/forums";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (parentCategoryId != null) queryParams.put("parent_category_id", String.valueOf(parentCategoryId));
        if (parentForumId != null) queryParams.put("parent_forum_id", String.valueOf(parentForumId));
        if (order != null) queryParams.put("order", order.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsListResponse.class);
    }

    /**
     * Returns grouped forums.

Required scopes:
+ **read**
     *
     * <p>GET /forums/grouped</p>
     * @return ForumsGroupedResponse
     * @throws Exception on API or network error
     */
    public ForumsGroupedResponse forumsGrouped() throws Exception {
        String path = "/forums/grouped";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsGroupedResponse.class);
    }

    /**
     * Detail information of a forum.

Required scopes:
+ **read**
     *
     * <p>GET /forums/{forum_id}</p>
     * @param forumId forumId (required)
     * @return ForumsGetResponse
     * @throws Exception on API or network error
     */
    public ForumsGetResponse forumsGet(Integer forumId) throws Exception {
        String path = "/forums/{forum_id}";
        path = path.replace("{forum_id}", String.valueOf(forumId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsGetResponse.class);
    }

    /**
     * List of a forum's followers. For privacy reason, only the current user will be included in the list (if the user follows the specified forum).

Required scopes:
+ **read**
     *
     * <p>GET /forums/{forum_id}/followers</p>
     * @param forumId forumId (required)
     * @return ForumsFollowersResponse
     * @throws Exception on API or network error
     */
    public ForumsFollowersResponse forumsFollowers(Integer forumId) throws Exception {
        String path = "/forums/{forum_id}/followers";
        path = path.replace("{forum_id}", String.valueOf(forumId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsFollowersResponse.class);
    }

    /**
     * Follow a forum.

Required scopes:
+ **post**
     *
     * <p>POST /forums/{forum_id}/followers</p>
     * @param forumId forumId (required)
     * @param alert alert (optional, nullable)
     * @param email email (optional, nullable)
     * @param minimalContestAmount minimalContestAmount (optional, nullable)
     * @param post post (optional, nullable)
     * @param prefixIds prefixIds (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse forumsFollow(Integer forumId, Boolean alert, Boolean email, Integer minimalContestAmount, Boolean post, java.util.List<Integer> prefixIds) throws Exception {
        String path = "/forums/{forum_id}/followers";
        path = path.replace("{forum_id}", String.valueOf(forumId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (post != null) body.put("post", post);
        if (alert != null) body.put("alert", alert);
        if (email != null) body.put("email", email);
        if (prefixIds != null) {
            for (int i = 0; i < prefixIds.size(); i++) {
                body.put("prefix_ids[" + i + "]", String.valueOf(prefixIds.get(i)));
            }
        }
        if (minimalContestAmount != null) body.put("minimal_contest_amount", minimalContestAmount);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unfollow a forum.

Required scopes:
+ **post**
     *
     * <p>DELETE /forums/{forum_id}/followers</p>
     * @param forumId forumId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse forumsUnfollow(Integer forumId) throws Exception {
        String path = "/forums/{forum_id}/followers";
        path = path.replace("{forum_id}", String.valueOf(forumId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of followed forums by current user.

Required scopes:
+ **read**
     *
     * <p>GET /forums/followed</p>
     * @param total total (optional, nullable)
     * @return ForumsFollowedResponse
     * @throws Exception on API or network error
     */
    public ForumsFollowedResponse forumsFollowed(Boolean total) throws Exception {
        String path = "/forums/followed";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (total != null) queryParams.put("total", total ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsFollowedResponse.class);
    }

    /**
     * Returns available options for the forums feed.

Required scopes:
+ **read**
     *
     * <p>GET /forums/feed/options</p>
     * @return ForumsGetfeedoptionsResponse
     * @throws Exception on API or network error
     */
    public ForumsGetfeedoptionsResponse forumsGetfeedoptions() throws Exception {
        String path = "/forums/feed/options";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ForumsGetfeedoptionsResponse.class);
    }

    /**
     * Edit feed options.

Required scopes:
+ **post**
     *
     * <p>PUT /forums/feed/options</p>
     * @param keywords keywords (optional, nullable)
     * @param nodeIds nodeIds (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse forumsEditfeedoptions(java.util.List<String> keywords, java.util.List<Integer> nodeIds) throws Exception {
        String path = "/forums/feed/options";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (nodeIds != null) {
            for (int i = 0; i < nodeIds.size(); i++) {
                body.put("node_ids[" + i + "]", String.valueOf(nodeIds.get(i)));
            }
        }
        if (keywords != null) {
            for (int i = 0; i < keywords.size(); i++) {
                body.put("keywords[" + i + "]", String.valueOf(keywords.get(i)));
            }
        }
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Link Forums ====================

    /**
     * List of all link forums.

Required scopes:
+ **read**
     *
     * <p>GET /link-forums</p>
     * @return LinksListResponse
     * @throws Exception on API or network error
     */
    public LinksListResponse linksList() throws Exception {
        String path = "/link-forums";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, LinksListResponse.class);
    }

    /**
     * Detail information of a link forum.

Required scopes:
+ **read**
     *
     * <p>GET /link-forums/{link_id}</p>
     * @param linkId linkId (required)
     * @return LinksGetResponse
     * @throws Exception on API or network error
     */
    public LinksGetResponse linksGet(Integer linkId) throws Exception {
        String path = "/link-forums/{link_id}";
        path = path.replace("{link_id}", String.valueOf(linkId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, LinksGetResponse.class);
    }

    // ==================== Navigation ====================

    /**
     * List of navigation elements within the system.

Required scopes:
+ **read**
     *
     * <p>GET /navigation</p>
     * @param parent parent (optional, nullable)
     * @return NavigationListResponse
     * @throws Exception on API or network error
     */
    public NavigationListResponse navigationList(Integer parent) throws Exception {
        String path = "/navigation";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (parent != null) queryParams.put("parent", String.valueOf(parent));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, NavigationListResponse.class);
    }

    // ==================== Notifications ====================

    /**
     * List of notifications (both read and unread).

Required scopes:
+ **read**
     *
     * <p>GET /notifications</p>
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param type type (optional, nullable)
     * @return NotificationsListResponse
     * @throws Exception on API or network error
     */
    public NotificationsListResponse notificationsList(Integer limit, Integer page, Type1Enum type) throws Exception {
        String path = "/notifications";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, NotificationsListResponse.class);
    }

    /**
     * Get associated content of notification. The response depends on the content type.

Required scopes:
+ **read**
     *
     * <p>GET /notifications/{notification_id}/content</p>
     * @param notificationId notificationId (required)
     * @return NotificationsGetResponse
     * @throws Exception on API or network error
     */
    public NotificationsGetResponse notificationsGet(Integer notificationId) throws Exception {
        String path = "/notifications/{notification_id}/content";
        path = path.replace("{notification_id}", String.valueOf(notificationId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, NotificationsGetResponse.class);
    }

    /**
     * Mark single notification or all existing notifications read.

Required scopes:
+ **post**
     *
     * <p>POST /notifications/read</p>
     * @param notificationId notificationId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse notificationsRead(Integer notificationId) throws Exception {
        String path = "/notifications/read";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (notificationId != null) body.put("notification_id", notificationId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Pages ====================

    /**
     * List of all pages in the system.

Required scopes:
+ **read**
     *
     * <p>GET /pages</p>
     * @param order order (optional, nullable)
     * @param parentPageId parentPageId (optional, nullable)
     * @return PagesListResponse
     * @throws Exception on API or network error
     */
    public PagesListResponse pagesList(Order1Enum order, Integer parentPageId) throws Exception {
        String path = "/pages";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (parentPageId != null) queryParams.put("parent_page_id", String.valueOf(parentPageId));
        if (order != null) queryParams.put("order", order.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PagesListResponse.class);
    }

    /**
     * Detail information of a page.

Required scopes:
+ **read**
     *
     * <p>GET /pages/{page_id}</p>
     * @param pageId pageId (required)
     * @return PagesGetResponse
     * @throws Exception on API or network error
     */
    public PagesGetResponse pagesGet(Integer pageId) throws Exception {
        String path = "/pages/{page_id}";
        path = path.replace("{page_id}", String.valueOf(pageId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PagesGetResponse.class);
    }

    // ==================== Post comments ====================

    /**
     * List of post comments in a thread.

Required scopes:
+ **read**
     *
     * <p>GET /posts/comments</p>
     * @param postId postId (required)
     * @param before before (optional, nullable)
     * @param beforeComment beforeComment (optional, nullable)
     * @return PostsCommentsGetResponse
     * @throws Exception on API or network error
     */
    public PostsCommentsGetResponse postsCommentsGet(Integer postId, Integer before, Integer beforeComment) throws Exception {
        String path = "/posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (postId != null) queryParams.put("post_id", String.valueOf(postId));
        if (before != null) queryParams.put("before", String.valueOf(before));
        if (beforeComment != null) queryParams.put("before_comment", String.valueOf(beforeComment));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PostsCommentsGetResponse.class);
    }

    /**
     * Create a post comment.

Required scopes:
+ **post**
     *
     * <p>POST /posts/comments</p>
     * @param commentBody commentBody (optional, nullable)
     * @param postId postId (optional, nullable)
     * @return PostsCommentsCreateResponse
     * @throws Exception on API or network error
     */
    public PostsCommentsCreateResponse postsCommentsCreate(String commentBody, Integer postId) throws Exception {
        String path = "/posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postId != null) body.put("post_id", postId);
        if (commentBody != null) body.put("comment_body", commentBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PostsCommentsCreateResponse.class);
    }

    /**
     * Edit a post comment.

Required scopes:
+ **post**
     *
     * <p>PUT /posts/comments</p>
     * @param commentBody commentBody (optional, nullable)
     * @param postCommentId postCommentId (optional, nullable)
     * @return PostsCommentsEditResponse
     * @throws Exception on API or network error
     */
    public PostsCommentsEditResponse postsCommentsEdit(String commentBody, Integer postCommentId) throws Exception {
        String path = "/posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postCommentId != null) body.put("post_comment_id", postCommentId);
        if (commentBody != null) body.put("comment_body", commentBody);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, PostsCommentsEditResponse.class);
    }

    /**
     * Delete a post comment.

Required scopes:
+ **post**
     *
     * <p>DELETE /posts/comments</p>
     * @param postCommentId postCommentId (optional, nullable)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsCommentsDelete(Integer postCommentId, String reason) throws Exception {
        String path = "/posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postCommentId != null) body.put("post_comment_id", postCommentId);
        if (reason != null) body.put("reason", reason);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Posts ====================

    /**
     * List of posts in a thread (with pagination).

Required scopes:
+ **read**
     *
     * <p>GET /posts</p>
     * @param limit limit (optional, nullable)
     * @param order order (optional, nullable)
     * @param page page (optional, nullable)
     * @param pageOfPostId pageOfPostId (optional, nullable)
     * @param threadId threadId (optional, nullable)
     * @return PostsListResponse
     * @throws Exception on API or network error
     */
    public PostsListResponse postsList(Integer limit, Order3Enum order, Integer page, Integer pageOfPostId, Integer threadId) throws Exception {
        String path = "/posts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (threadId != null) queryParams.put("thread_id", String.valueOf(threadId));
        if (pageOfPostId != null) queryParams.put("page_of_post_id", String.valueOf(pageOfPostId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (order != null) queryParams.put("order", order.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PostsListResponse.class);
    }

    /**
     * Create a new post.

Required scopes:
+ **post**
     *
     * <p>POST /posts</p>
     * @param postBody postBody (optional, nullable)
     * @param quotePostId quotePostId (optional, nullable)
     * @param threadId threadId (optional, nullable)
     * @return PostsCreateResponse
     * @throws Exception on API or network error
     */
    public PostsCreateResponse postsCreate(String postBody, Integer quotePostId, Integer threadId) throws Exception {
        String path = "/posts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postBody != null) body.put("post_body", postBody);
        if (threadId != null) body.put("thread_id", threadId);
        if (quotePostId != null) body.put("quote_post_id", quotePostId);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, PostsCreateResponse.class);
    }

    /**
     * Detail information of a post.

Required scopes:
+ **read**
     *
     * <p>GET /posts/{post_id}</p>
     * @param postId postId (required)
     * @return PostsGetResponse
     * @throws Exception on API or network error
     */
    public PostsGetResponse postsGet(Integer postId) throws Exception {
        String path = "/posts/{post_id}";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PostsGetResponse.class);
    }

    /**
     * Edit a post.

Required scopes:
+ **post**
     *
     * <p>PUT /posts/{post_id}</p>
     * @param postId postId (required)
     * @param postBody postBody (optional, nullable)
     * @return PostsEditResponse
     * @throws Exception on API or network error
     */
    public PostsEditResponse postsEdit(Integer postId, String postBody) throws Exception {
        String path = "/posts/{post_id}";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postBody != null) body.put("post_body", postBody);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, PostsEditResponse.class);
    }

    /**
     * Delete a post.

Required scopes:
+ **post**
     *
     * <p>DELETE /posts/{post_id}</p>
     * @param postId postId (required)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsDelete(Integer postId, String reason) throws Exception {
        String path = "/posts/{post_id}";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (reason != null) body.put("reason", reason);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of users who liked a post.

Required scopes:
+ **read**
     *
     * <p>GET /posts/{post_id}/likes</p>
     * @param postId postId (required)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return PostsLikesResponse
     * @throws Exception on API or network error
     */
    public PostsLikesResponse postsLikes(Integer postId, Integer limit, Integer page) throws Exception {
        String path = "/posts/{post_id}/likes";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PostsLikesResponse.class);
    }

    /**
     * Like a post.

Required scopes:
+ **post**
     *
     * <p>POST /posts/{post_id}/likes</p>
     * @param postId postId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsLike(Integer postId) throws Exception {
        String path = "/posts/{post_id}/likes";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unlike a post.

Required scopes:
+ **post**
     *
     * <p>DELETE /posts/{post_id}/likes</p>
     * @param postId postId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsUnlike(Integer postId) throws Exception {
        String path = "/posts/{post_id}/likes";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get post report reasons.

Required scopes:
+ **read**
     *
     * <p>GET /posts/{post_id}/report</p>
     * @param postId postId (required)
     * @return PostsReportreasonsResponse
     * @throws Exception on API or network error
     */
    public PostsReportreasonsResponse postsReportreasons(Integer postId) throws Exception {
        String path = "/posts/{post_id}/report";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, PostsReportreasonsResponse.class);
    }

    /**
     * Report a post.

Required scopes:
+ **post**
     *
     * <p>POST /posts/{post_id}/report</p>
     * @param postId postId (required)
     * @param message message (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsReport(Integer postId, String message) throws Exception {
        String path = "/posts/{post_id}/report";
        path = path.replace("{post_id}", String.valueOf(postId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Report a post comment.

Required scopes:
+ **post**
     *
     * <p>POST /posts/comments/report</p>
     * @param message message (optional, nullable)
     * @param postCommentId postCommentId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse postsCommentsReport(String message, Integer postCommentId) throws Exception {
        String path = "/posts/comments/report";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postCommentId != null) body.put("post_comment_id", postCommentId);
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Profile Post Comments ====================

    /**
     * List of comments of a profile post.

Required scopes:
+ **read**
     *
     * <p>GET /profile-posts/comments</p>
     * @param profilePostId profilePostId (required)
     * @param before before (optional, nullable)
     * @param limit limit (optional, nullable)
     * @return ProfilepostsCommentsListResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsCommentsListResponse profilepostsCommentsList(Integer profilePostId, Integer before, Integer limit) throws Exception {
        String path = "/profile-posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (profilePostId != null) queryParams.put("profile_post_id", String.valueOf(profilePostId));
        if (before != null) queryParams.put("before", String.valueOf(before));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsCommentsListResponse.class);
    }

    /**
     * Create a new profile post comment.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts/comments</p>
     * @param commentBody commentBody (optional, nullable)
     * @param profilePostId profilePostId (optional, nullable)
     * @return ProfilepostsCommentsCreateResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsCommentsCreateResponse profilepostsCommentsCreate(String commentBody, Integer profilePostId) throws Exception {
        String path = "/profile-posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (profilePostId != null) body.put("profile_post_id", profilePostId);
        if (commentBody != null) body.put("comment_body", commentBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ProfilepostsCommentsCreateResponse.class);
    }

    /**
     * Edit a profile post comment.

Required scopes:
+ **post**
     *
     * <p>PUT /profile-posts/comments</p>
     * @param commentBody commentBody (optional, nullable)
     * @param commentId commentId (optional, nullable)
     * @return ProfilepostsCommentsEditResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsCommentsEditResponse profilepostsCommentsEdit(String commentBody, Integer commentId) throws Exception {
        String path = "/profile-posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (commentId != null) body.put("comment_id", commentId);
        if (commentBody != null) body.put("comment_body", commentBody);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ProfilepostsCommentsEditResponse.class);
    }

    /**
     * Delete a profile post comment.

Required scopes:
+ **post**
     *
     * <p>DELETE /profile-posts/comments</p>
     * @param commentId commentId (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsCommentsDelete(Integer commentId) throws Exception {
        String path = "/profile-posts/comments";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (commentId != null) body.put("comment_id", commentId);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Detail information of a profile post comment.

Required scopes:
+ **read**
     *
     * <p>GET /profile-posts/{profile_post_id}/comments/{comment_id}</p>
     * @param profilePostId profilePostId (required)
     * @param commentId commentId (required)
     * @return ProfilepostsCommentsGetResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsCommentsGetResponse profilepostsCommentsGet(Integer profilePostId, Integer commentId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/comments/{comment_id}";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        path = path.replace("{comment_id}", String.valueOf(commentId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsCommentsGetResponse.class);
    }

    /**
     * Report a profile post comment.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts/comments/{comment_id}/report</p>
     * @param commentId commentId (required)
     * @param message message (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsCommentsReport(Integer commentId, String message) throws Exception {
        String path = "/profile-posts/comments/{comment_id}/report";
        path = path.replace("{comment_id}", String.valueOf(commentId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Profile Posts ====================

    /**
     * List of profile posts (with pagination).

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/profile-posts</p>
     * @param userId userId (required)
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param postsUserId postsUserId (optional, nullable)
     * @return ProfilepostsListResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsListResponse profilepostsList(String userId, java.util.List<String> fieldsInclude, Integer limit, Integer page, Integer postsUserId) throws Exception {
        String path = "/users/{user_id}/profile-posts";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (postsUserId != null) queryParams.put("posts_user_id", String.valueOf(postsUserId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsListResponse.class);
    }

    /**
     * Detail information of a profile post.

Required scopes:
+ **read**
     *
     * <p>GET /profile-posts/{profile_post_id}</p>
     * @param profilePostId profilePostId (required)
     * @return ProfilepostsGetResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsGetResponse profilepostsGet(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsGetResponse.class);
    }

    /**
     * Edit a profile post.

Required scopes:
+ **post**
     *
     * <p>PUT /profile-posts/{profile_post_id}</p>
     * @param profilePostId profilePostId (required)
     * @param disableComments disableComments (optional, nullable)
     * @param postBody postBody (optional, nullable)
     * @return ProfilepostsEditResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsEditResponse profilepostsEdit(Integer profilePostId, Boolean disableComments, String postBody) throws Exception {
        String path = "/profile-posts/{profile_post_id}";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postBody != null) body.put("post_body", postBody);
        if (disableComments != null) body.put("disable_comments", disableComments);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ProfilepostsEditResponse.class);
    }

    /**
     * Delete a profile post.

Required scopes:
+ **post**
     *
     * <p>DELETE /profile-posts/{profile_post_id}</p>
     * @param profilePostId profilePostId (required)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsDelete(Integer profilePostId, String reason) throws Exception {
        String path = "/profile-posts/{profile_post_id}";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (reason != null) queryParams.put("reason", String.valueOf(reason));
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get Profile Post Report Reasons.

Required scopes:
+ **read**
     *
     * <p>GET /profile-posts/{profile_post_id}/report</p>
     * @param profilePostId profilePostId (required)
     * @return ProfilepostsReportreasonsResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsReportreasonsResponse profilepostsReportreasons(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/report";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsReportreasonsResponse.class);
    }

    /**
     * Report a profile post.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts/{profile_post_id}/report</p>
     * @param profilePostId profilePostId (required)
     * @param message message (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsReport(Integer profilePostId, String message) throws Exception {
        String path = "/profile-posts/{profile_post_id}/report";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (message != null) body.put("message", message);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Create a profile post on a user profile.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts</p>
     * @param postBody postBody (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return ProfilepostsCreateResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsCreateResponse profilepostsCreate(String postBody, String userId) throws Exception {
        String path = "/profile-posts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (userId != null) body.put("user_id", userId);
        if (postBody != null) body.put("post_body", postBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ProfilepostsCreateResponse.class);
    }

    /**
     * Stick a profile post.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts/{profile_post_id}/stick</p>
     * @param profilePostId profilePostId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsStick(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/stick";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unstick a profile post.

Required scopes:
+ **post**
     *
     * <p>DELETE /profile-posts/{profile_post_id}/stick</p>
     * @param profilePostId profilePostId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsUnstick(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/stick";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of users who liked a profile post.

Required scopes:
+ **read**
     *
     * <p>GET /profile-posts/{profile_post_id}/likes</p>
     * @param profilePostId profilePostId (required)
     * @return ProfilepostsLikesResponse
     * @throws Exception on API or network error
     */
    public ProfilepostsLikesResponse profilepostsLikes(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/likes";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ProfilepostsLikesResponse.class);
    }

    /**
     * Like a profile post.

Required scopes:
+ **post**
     *
     * <p>POST /profile-posts/{profile_post_id}/likes</p>
     * @param profilePostId profilePostId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsLike(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/likes";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unlike a profile post.

Required scopes:
+ **post**
     *
     * <p>DELETE /profile-posts/{profile_post_id}/likes</p>
     * @param profilePostId profilePostId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse profilepostsUnlike(Integer profilePostId) throws Exception {
        String path = "/profile-posts/{profile_post_id}/likes";
        path = path.replace("{profile_post_id}", String.valueOf(profilePostId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Searching ====================

    /**
     * Search for all supported contents.

Required scopes:
+ **post**
     *
     * <p>POST /search</p>
     * @param before before (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param q q (optional, nullable)
     * @param tag tag (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SearchAllResponse
     * @throws Exception on API or network error
     */
    public SearchAllResponse searchAll(Integer before, Integer forumId, Integer limit, Integer page, String q, String tag, String userId) throws Exception {
        String path = "/search";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        if (tag != null) body.put("tag", tag);
        if (forumId != null) body.put("forum_id", forumId);
        if (userId != null) body.put("user_id", userId);
        if (page != null) body.put("page", page);
        if (limit != null) body.put("limit", limit);
        if (before != null) body.put("before", before);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchAllResponse.class);
    }

    /**
     * Search for threads.

Required scopes:
+ **post**
     *
     * <p>POST /search/threads</p>
     * @param before before (optional, nullable)
     * @param dataLimit dataLimit (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param q q (optional, nullable)
     * @param tag tag (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SearchThreadsResponse
     * @throws Exception on API or network error
     */
    public SearchThreadsResponse searchThreads(Integer before, Integer dataLimit, Integer forumId, Integer limit, Integer page, String q, String tag, String userId) throws Exception {
        String path = "/search/threads";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        if (tag != null) body.put("tag", tag);
        if (forumId != null) body.put("forum_id", forumId);
        if (userId != null) body.put("user_id", userId);
        if (page != null) body.put("page", page);
        if (limit != null) body.put("limit", limit);
        if (dataLimit != null) body.put("data_limit", dataLimit);
        if (before != null) body.put("before", before);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchThreadsResponse.class);
    }

    /**
     * Search for posts.

Required scopes:
+ **post**
     *
     * <p>POST /search/posts</p>
     * @param before before (optional, nullable)
     * @param dataLimit dataLimit (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param q q (optional, nullable)
     * @param tag tag (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SearchPostsResponse
     * @throws Exception on API or network error
     */
    public SearchPostsResponse searchPosts(Integer before, Integer dataLimit, Integer forumId, Integer limit, Integer page, String q, String tag, String userId) throws Exception {
        String path = "/search/posts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        if (tag != null) body.put("tag", tag);
        if (forumId != null) body.put("forum_id", forumId);
        if (userId != null) body.put("user_id", userId);
        if (page != null) body.put("page", page);
        if (limit != null) body.put("limit", limit);
        if (dataLimit != null) body.put("data_limit", dataLimit);
        if (before != null) body.put("before", before);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchPostsResponse.class);
    }

    /**
     * Search for users.

Required scopes:
+ **post**
     *
     * <p>POST /search/users</p>
     * @param q q (optional, nullable)
     * @return SearchUsersResponse
     * @throws Exception on API or network error
     */
    public SearchUsersResponse searchUsers(String q) throws Exception {
        String path = "/search/users";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchUsersResponse.class);
    }

    /**
     * Search for profile posts.

Required scopes:
+ **post**
     *
     * <p>POST /search/profile-posts</p>
     * @param before before (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param q q (optional, nullable)
     * @param userId userId (optional, nullable)
     * @return SearchProfilepostsResponse
     * @throws Exception on API or network error
     */
    public SearchProfilepostsResponse searchProfileposts(Integer before, Integer limit, Integer page, String q, Integer userId) throws Exception {
        String path = "/search/profile-posts";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (q != null) body.put("q", q);
        if (userId != null) body.put("user_id", userId);
        if (page != null) body.put("page", page);
        if (limit != null) body.put("limit", limit);
        if (before != null) body.put("before", before);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchProfilepostsResponse.class);
    }

    /**
     * Search for tagged contents.

Required scopes:
+ **post**
     *
     * <p>POST /search/tagged</p>
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @param tag tag (optional, nullable)
     * @param tags tags (optional, nullable)
     * @return SearchTaggedResponse
     * @throws Exception on API or network error
     */
    public SearchTaggedResponse searchTagged(Integer limit, Integer page, String tag, java.util.List<String> tags) throws Exception {
        String path = "/search/tagged";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (tag != null) body.put("tag", tag);
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                body.put("tags[" + i + "]", String.valueOf(tags.get(i)));
            }
        }
        if (page != null) body.put("page", page);
        if (limit != null) body.put("limit", limit);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SearchTaggedResponse.class);
    }

    /**
     * List of search results (with pagination).

Required scopes:
+ **get**
     *
     * <p>GET /search/{search_id}/results</p>
     * @param searchId searchId (required)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return SearchResultsResponse
     * @throws Exception on API or network error
     */
    public SearchResultsResponse searchResults(String searchId, Integer limit, Integer page) throws Exception {
        String path = "/search/{search_id}/results";
        path = path.replace("{search_id}", String.valueOf(searchId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, SearchResultsResponse.class);
    }

    // ==================== Threads ====================

    /**
     * List of threads in a forum (with pagination).

Required scopes:
+ **read**
     *
     * <p>GET /threads</p>
     * @param creatorUserId creatorUserId (optional, nullable)
     * @param direction direction (optional, nullable)
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param order order (optional, nullable)
     * @param page page (optional, nullable)
     * @param period period (optional, nullable)
     * @param prefixIds prefixIds (optional, nullable)
     * @param prefixIdsNot prefixIdsNot (optional, nullable)
     * @param state state (optional, nullable)
     * @param sticky sticky (optional, nullable)
     * @param tab tab (optional, nullable)
     * @param threadCreateDate threadCreateDate (optional, nullable)
     * @param threadTagId threadTagId (optional, nullable)
     * @param threadUpdateDate threadUpdateDate (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleOnly titleOnly (optional, nullable)
     * @return ThreadsListResponse
     * @throws Exception on API or network error
     */
    public ThreadsListResponse threadsList(Integer creatorUserId, DirectionEnum direction, java.util.List<String> fieldsInclude, Integer forumId, Integer limit, Order2Enum order, Integer page, PeriodEnum period, java.util.List<Integer> prefixIds, java.util.List<Integer> prefixIdsNot, StateEnum state, Boolean sticky, String tab, Integer threadCreateDate, Integer threadTagId, Integer threadUpdateDate, String title, Boolean titleOnly) throws Exception {
        String path = "/threads";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (forumId != null) queryParams.put("forum_id", String.valueOf(forumId));
        if (tab != null) queryParams.put("tab", String.valueOf(tab));
        if (state != null) queryParams.put("state", state.getValue());
        if (period != null) queryParams.put("period", period.getValue());
        if (title != null) queryParams.put("title", String.valueOf(title));
        if (titleOnly != null) queryParams.put("title_only", titleOnly ? "1" : "0");
        if (creatorUserId != null) queryParams.put("creator_user_id", String.valueOf(creatorUserId));
        if (sticky != null) queryParams.put("sticky", sticky ? "1" : "0");
        if (prefixIds != null) {
            for (int i = 0; i < prefixIds.size(); i++) {
                queryParams.put("prefix_ids[][" + i + "]", String.valueOf(prefixIds.get(i)));
            }
        }
        if (prefixIdsNot != null) {
            for (int i = 0; i < prefixIdsNot.size(); i++) {
                queryParams.put("prefix_ids_not[][" + i + "]", String.valueOf(prefixIdsNot.get(i)));
            }
        }
        if (threadTagId != null) queryParams.put("thread_tag_id", String.valueOf(threadTagId));
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (order != null) queryParams.put("order", order.getValue());
        if (direction != null) queryParams.put("direction", direction.getValue());
        if (threadCreateDate != null) queryParams.put("thread_create_date", String.valueOf(threadCreateDate));
        if (threadUpdateDate != null) queryParams.put("thread_update_date", String.valueOf(threadUpdateDate));
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsListResponse.class);
    }

    /**
     * Create a new thread.

Required scopes:
+ **post**
     *
     * <p>POST /threads</p>
     * @param allowAskHiddenContent allowAskHiddenContent (optional, nullable)
     * @param commentIgnoreGroup commentIgnoreGroup (optional, nullable)
     * @param dontAlertFollowers dontAlertFollowers (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param hideContacts hideContacts (optional, nullable)
     * @param postBody postBody (optional, nullable)
     * @param prefixId prefixId (optional, nullable)
     * @param replyGroup replyGroup (optional, nullable)
     * @param scheduleDate scheduleDate (optional, nullable)
     * @param scheduleTime scheduleTime (optional, nullable)
     * @param tags tags (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @param watchThread watchThread (optional, nullable)
     * @param watchThreadEmail watchThreadEmail (optional, nullable)
     * @param watchThreadState watchThreadState (optional, nullable)
     * @return ThreadsCreateResponse
     * @throws Exception on API or network error
     */
    public ThreadsCreateResponse threadsCreate(Boolean allowAskHiddenContent, Boolean commentIgnoreGroup, Boolean dontAlertFollowers, Integer forumId, Boolean hideContacts, String postBody, java.util.List<Integer> prefixId, ReplyGroupEnum replyGroup, String scheduleDate, String scheduleTime, java.util.List<String> tags, String title, String titleEn, Boolean watchThread, Boolean watchThreadEmail, Boolean watchThreadState) throws Exception {
        String path = "/threads";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postBody != null) body.put("post_body", postBody);
        if (forumId != null) body.put("forum_id", forumId);
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (prefixId != null) {
            for (int i = 0; i < prefixId.size(); i++) {
                body.put("prefix_id[" + i + "]", String.valueOf(prefixId.get(i)));
            }
        }
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                body.put("tags[" + i + "]", String.valueOf(tags.get(i)));
            }
        }
        if (hideContacts != null) body.put("hide_contacts", hideContacts);
        if (allowAskHiddenContent != null) body.put("allow_ask_hidden_content", allowAskHiddenContent);
        if (replyGroup != null) body.put("reply_group", replyGroup.getValue());
        if (commentIgnoreGroup != null) body.put("comment_ignore_group", commentIgnoreGroup);
        if (dontAlertFollowers != null) body.put("dont_alert_followers", dontAlertFollowers);
        if (scheduleDate != null) body.put("schedule_date", scheduleDate);
        if (scheduleTime != null) body.put("schedule_time", scheduleTime);
        if (watchThreadState != null) body.put("watch_thread_state", watchThreadState);
        if (watchThread != null) body.put("watch_thread", watchThread);
        if (watchThreadEmail != null) body.put("watch_thread_email", watchThreadEmail);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsCreateResponse.class);
    }

    /**
     * Create a new contest.

Required scopes:
+ **post**
     *
     * <p>POST /contests</p>
     * @param allowAskHiddenContent allowAskHiddenContent (optional, nullable)
     * @param commentIgnoreGroup commentIgnoreGroup (optional, nullable)
     * @param contestType contestType (optional, nullable)
     * @param countWinners countWinners (optional, nullable)
     * @param dontAlertFollowers dontAlertFollowers (optional, nullable)
     * @param hideContacts hideContacts (optional, nullable)
     * @param isMoneyPlaces isMoneyPlaces (optional, nullable)
     * @param lengthOption lengthOption (optional, nullable)
     * @param lengthValue lengthValue (optional, nullable)
     * @param postBody postBody (optional, nullable)
     * @param prizeDataMoney prizeDataMoney (optional, nullable)
     * @param prizeDataPlaces prizeDataPlaces (optional, nullable)
     * @param prizeDataUpgrade prizeDataUpgrade (optional, nullable)
     * @param prizeType prizeType (optional, nullable)
     * @param replyGroup replyGroup (optional, nullable)
     * @param requireLikeCount requireLikeCount (optional, nullable)
     * @param requireTotalLikeCount requireTotalLikeCount (optional, nullable)
     * @param scheduleDate scheduleDate (optional, nullable)
     * @param scheduleTime scheduleTime (optional, nullable)
     * @param secretAnswer secretAnswer (optional, nullable)
     * @param tags tags (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @param watchThread watchThread (optional, nullable)
     * @param watchThreadEmail watchThreadEmail (optional, nullable)
     * @param watchThreadState watchThreadState (optional, nullable)
     * @return ThreadsCreatecontestResponse
     * @throws Exception on API or network error
     */
    public ThreadsCreatecontestResponse threadsCreatecontest(Boolean allowAskHiddenContent, Boolean commentIgnoreGroup, ContestTypeEnum contestType, Integer countWinners, Boolean dontAlertFollowers, Boolean hideContacts, Boolean isMoneyPlaces, LengthOptionEnum lengthOption, Integer lengthValue, String postBody, Double prizeDataMoney, java.util.List<Double> prizeDataPlaces, PrizeDataUpgradeEnum prizeDataUpgrade, PrizeTypeEnum prizeType, ReplyGroupEnum replyGroup, Integer requireLikeCount, Integer requireTotalLikeCount, String scheduleDate, String scheduleTime, String secretAnswer, java.util.List<String> tags, String title, String titleEn, Boolean watchThread, Boolean watchThreadEmail, Boolean watchThreadState) throws Exception {
        String path = "/contests";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (postBody != null) body.put("post_body", postBody);
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (contestType != null) body.put("contest_type", contestType.getValue());
        if (lengthValue != null) body.put("length_value", lengthValue);
        if (lengthOption != null) body.put("length_option", lengthOption.getValue());
        if (prizeType != null) body.put("prize_type", prizeType.getValue());
        if (countWinners != null) body.put("count_winners", countWinners);
        if (prizeDataMoney != null) body.put("prize_data_money", prizeDataMoney);
        if (isMoneyPlaces != null) body.put("is_money_places", isMoneyPlaces);
        if (prizeDataPlaces != null) {
            for (int i = 0; i < prizeDataPlaces.size(); i++) {
                body.put("prize_data_places[" + i + "]", String.valueOf(prizeDataPlaces.get(i)));
            }
        }
        if (prizeDataUpgrade != null) body.put("prize_data_upgrade", prizeDataUpgrade.getValue());
        if (requireLikeCount != null) body.put("require_like_count", requireLikeCount);
        if (requireTotalLikeCount != null) body.put("require_total_like_count", requireTotalLikeCount);
        if (secretAnswer != null) body.put("secret_answer", secretAnswer);
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                body.put("tags[" + i + "]", String.valueOf(tags.get(i)));
            }
        }
        if (replyGroup != null) body.put("reply_group", replyGroup.getValue());
        if (commentIgnoreGroup != null) body.put("comment_ignore_group", commentIgnoreGroup);
        if (dontAlertFollowers != null) body.put("dont_alert_followers", dontAlertFollowers);
        if (hideContacts != null) body.put("hide_contacts", hideContacts);
        if (allowAskHiddenContent != null) body.put("allow_ask_hidden_content", allowAskHiddenContent);
        if (scheduleDate != null) body.put("schedule_date", scheduleDate);
        if (scheduleTime != null) body.put("schedule_time", scheduleTime);
        if (watchThreadState != null) body.put("watch_thread_state", watchThreadState);
        if (watchThread != null) body.put("watch_thread", watchThread);
        if (watchThreadEmail != null) body.put("watch_thread_email", watchThreadEmail);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsCreatecontestResponse.class);
    }

    /**
     * Create a Claim.

Required scopes:
+ **post**
     *
     * <p>POST /claims</p>
     * @param allowAskHiddenContent allowAskHiddenContent (optional, nullable)
     * @param asAmount asAmount (optional, nullable)
     * @param asData asData (optional, nullable)
     * @param asFundsReceipt asFundsReceipt (optional, nullable)
     * @param asIsMarketDeal asIsMarketDeal (optional, nullable)
     * @param asMarketItemId asMarketItemId (optional, nullable)
     * @param asResponder asResponder (optional, nullable)
     * @param asTgLoginScreenshot asTgLoginScreenshot (optional, nullable)
     * @param commentIgnoreGroup commentIgnoreGroup (optional, nullable)
     * @param currency currency (optional, nullable)
     * @param dontAlertFollowers dontAlertFollowers (optional, nullable)
     * @param hideContacts hideContacts (optional, nullable)
     * @param payClaim payClaim (optional, nullable)
     * @param postBody postBody (optional, nullable)
     * @param replyGroup replyGroup (optional, nullable)
     * @param scheduleDate scheduleDate (optional, nullable)
     * @param scheduleTime scheduleTime (optional, nullable)
     * @param tags tags (optional, nullable)
     * @param transferType transferType (optional, nullable)
     * @param watchThread watchThread (optional, nullable)
     * @param watchThreadEmail watchThreadEmail (optional, nullable)
     * @param watchThreadState watchThreadState (optional, nullable)
     * @return ThreadsClaimResponse
     * @throws Exception on API or network error
     */
    public ThreadsClaimResponse threadsClaim(Boolean allowAskHiddenContent, Double asAmount, String asData, String asFundsReceipt, Boolean asIsMarketDeal, Integer asMarketItemId, String asResponder, String asTgLoginScreenshot, Boolean commentIgnoreGroup, CurrencyEnum currency, Boolean dontAlertFollowers, Boolean hideContacts, PayClaimEnum payClaim, String postBody, ReplyGroupEnum replyGroup, String scheduleDate, String scheduleTime, java.util.List<String> tags, TransferTypeEnum transferType, Boolean watchThread, Boolean watchThreadEmail, Boolean watchThreadState) throws Exception {
        String path = "/claims";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (asResponder != null) body.put("as_responder", asResponder);
        if (asIsMarketDeal != null) body.put("as_is_market_deal", asIsMarketDeal);
        if (asMarketItemId != null) body.put("as_market_item_id", asMarketItemId);
        if (asData != null) body.put("as_data", asData);
        if (asAmount != null) body.put("as_amount", asAmount);
        if (currency != null) body.put("currency", currency.getValue());
        if (transferType != null) body.put("transfer_type", transferType.getValue());
        if (payClaim != null) body.put("pay_claim", payClaim.getValue());
        if (asFundsReceipt != null) body.put("as_funds_receipt", asFundsReceipt);
        if (asTgLoginScreenshot != null) body.put("as_tg_login_screenshot", asTgLoginScreenshot);
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                body.put("tags[" + i + "]", String.valueOf(tags.get(i)));
            }
        }
        if (hideContacts != null) body.put("hide_contacts", hideContacts);
        if (allowAskHiddenContent != null) body.put("allow_ask_hidden_content", allowAskHiddenContent);
        if (replyGroup != null) body.put("reply_group", replyGroup.getValue());
        if (commentIgnoreGroup != null) body.put("comment_ignore_group", commentIgnoreGroup);
        if (dontAlertFollowers != null) body.put("dont_alert_followers", dontAlertFollowers);
        if (scheduleDate != null) body.put("schedule_date", scheduleDate);
        if (scheduleTime != null) body.put("schedule_time", scheduleTime);
        if (watchThreadState != null) body.put("watch_thread_state", watchThreadState);
        if (watchThread != null) body.put("watch_thread", watchThread);
        if (watchThreadEmail != null) body.put("watch_thread_email", watchThreadEmail);
        if (postBody != null) body.put("post_body", postBody);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsClaimResponse.class);
    }

    /**
     * Detail information of a thread.

Required scopes:
+ **read**
     *
     * <p>GET /threads/{thread_id}</p>
     * @param threadId threadId (required)
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @return ThreadsGetResponse
     * @throws Exception on API or network error
     */
    public ThreadsGetResponse threadsGet(Integer threadId, java.util.List<String> fieldsInclude) throws Exception {
        String path = "/threads/{thread_id}";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsGetResponse.class);
    }

    /**
     * Edit a thread.

Required scopes:
+ **post**
     *
     * <p>PUT /threads/{thread_id}</p>
     * @param threadId threadId (required)
     * @param allowAskHiddenContent allowAskHiddenContent (optional, nullable)
     * @param commentIgnoreGroup commentIgnoreGroup (optional, nullable)
     * @param discussionOpen discussionOpen (optional, nullable)
     * @param hideContacts hideContacts (optional, nullable)
     * @param prefixId prefixId (optional, nullable)
     * @param replyGroup replyGroup (optional, nullable)
     * @param tags tags (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @return ThreadsEditResponse
     * @throws Exception on API or network error
     */
    public ThreadsEditResponse threadsEdit(Integer threadId, Boolean allowAskHiddenContent, Boolean commentIgnoreGroup, Boolean discussionOpen, Boolean hideContacts, java.util.List<Integer> prefixId, ReplyGroupEnum replyGroup, java.util.List<String> tags, String title, String titleEn) throws Exception {
        String path = "/threads/{thread_id}";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (prefixId != null) {
            for (int i = 0; i < prefixId.size(); i++) {
                body.put("prefix_id[" + i + "]", String.valueOf(prefixId.get(i)));
            }
        }
        if (tags != null) {
            for (int i = 0; i < tags.size(); i++) {
                body.put("tags[" + i + "]", String.valueOf(tags.get(i)));
            }
        }
        if (discussionOpen != null) body.put("discussion_open", discussionOpen);
        if (hideContacts != null) body.put("hide_contacts", hideContacts);
        if (allowAskHiddenContent != null) body.put("allow_ask_hidden_content", allowAskHiddenContent);
        if (replyGroup != null) body.put("reply_group", replyGroup.getValue());
        if (commentIgnoreGroup != null) body.put("comment_ignore_group", commentIgnoreGroup);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsEditResponse.class);
    }

    /**
     * Delete a thread.

Required scopes:
+ **post**
     *
     * <p>DELETE /threads/{thread_id}</p>
     * @param threadId threadId (required)
     * @param reason reason (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsDelete(Integer threadId, String reason) throws Exception {
        String path = "/threads/{thread_id}";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (reason != null) body.put("reason", reason);
        String response = client.delete(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Move a thread to another forum.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/move</p>
     * @param threadId threadId (required)
     * @param applyThreadPrefix applyThreadPrefix (optional, nullable)
     * @param nodeId nodeId (optional, nullable)
     * @param prefixId prefixId (optional, nullable)
     * @param sendAlert sendAlert (optional, nullable)
     * @param title title (optional, nullable)
     * @param titleEn titleEn (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsMove(Integer threadId, Boolean applyThreadPrefix, String nodeId, java.util.List<Integer> prefixId, Boolean sendAlert, String title, String titleEn) throws Exception {
        String path = "/threads/{thread_id}/move";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (nodeId != null) body.put("node_id", nodeId);
        if (title != null) body.put("title", title);
        if (titleEn != null) body.put("title_en", titleEn);
        if (prefixId != null) {
            for (int i = 0; i < prefixId.size(); i++) {
                body.put("prefix_id[" + i + "]", String.valueOf(prefixId.get(i)));
            }
        }
        if (applyThreadPrefix != null) body.put("apply_thread_prefix", applyThreadPrefix);
        if (sendAlert != null) body.put("send_alert", sendAlert);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Bump a thread.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/bump</p>
     * @param threadId threadId (required)
     * @return ThreadsBumpResponse
     * @throws Exception on API or network error
     */
    public ThreadsBumpResponse threadsBump(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/bump";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsBumpResponse.class);
    }

    /**
     * Hide a thread from your feed.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/hide</p>
     * @param threadId threadId (required)
     * @return ThreadsHideResponse
     * @throws Exception on API or network error
     */
    public ThreadsHideResponse threadsHide(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/hide";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, ThreadsHideResponse.class);
    }

    /**
     * Bookmark a thread.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/star</p>
     * @param threadId threadId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsStar(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/star";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unbookmark a thread.

Required scopes:
+ **post**
     *
     * <p>DELETE /threads/{thread_id}/star</p>
     * @param threadId threadId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsUnstar(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/star";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of a thread's followers. For privacy reason, only the current user will be included in the list.

Required scopes:
+ **read**
     *
     * <p>GET /threads/{thread_id}/followers</p>
     * @param threadId threadId (required)
     * @return ThreadsFollowersResponse
     * @throws Exception on API or network error
     */
    public ThreadsFollowersResponse threadsFollowers(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/followers";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsFollowersResponse.class);
    }

    /**
     * Follow a thread.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/followers</p>
     * @param threadId threadId (required)
     * @param email email (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsFollow(Integer threadId, Boolean email) throws Exception {
        String path = "/threads/{thread_id}/followers";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (email != null) body.put("email", email);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unfollow a thread.

Required scopes:
+ **post**
     *
     * <p>DELETE /threads/{thread_id}/followers</p>
     * @param threadId threadId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsUnfollow(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/followers";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of followed threads by current user.

Required scopes:
+ **read**
     *
     * <p>GET /threads/followed</p>
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @param total total (optional, nullable)
     * @return ThreadsFollowedResponse
     * @throws Exception on API or network error
     */
    public ThreadsFollowedResponse threadsFollowed(java.util.List<String> fieldsInclude, Boolean total) throws Exception {
        String path = "/threads/followed";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (total != null) queryParams.put("total", total ? "1" : "0");
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsFollowedResponse.class);
    }

    /**
     * List of navigation elements to reach the specified thread.

Required scopes:
+ **read**
     *
     * <p>GET /threads/{thread_id}/navigation</p>
     * @param threadId threadId (required)
     * @return ThreadsNavigationResponse
     * @throws Exception on API or network error
     */
    public ThreadsNavigationResponse threadsNavigation(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/navigation";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsNavigationResponse.class);
    }

    /**
     * Detail information of a poll.

Required scopes:
+ **read**
     *
     * <p>GET /threads/{thread_id}/poll</p>
     * @param threadId threadId (required)
     * @return ThreadsPollGetResponse
     * @throws Exception on API or network error
     */
    public ThreadsPollGetResponse threadsPollGet(Integer threadId) throws Exception {
        String path = "/threads/{thread_id}/poll";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsPollGetResponse.class);
    }

    /**
     * Vote on a thread poll.

Required scopes:
+ **post**
     *
     * <p>POST /threads/{thread_id}/poll/votes</p>
     * @param threadId threadId (required)
     * @param responseId responseId (optional, nullable)
     * @param responseIds responseIds (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsPollVote(Integer threadId, Integer responseId, java.util.List<Integer> responseIds) throws Exception {
        String path = "/threads/{thread_id}/poll/votes";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (responseId != null) body.put("response_id", responseId);
        if (responseIds != null) {
            for (int i = 0; i < responseIds.size(); i++) {
                body.put("response_ids[" + i + "]", String.valueOf(responseIds.get(i)));
            }
        }
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of unread threads (must be logged in).

Required scopes:
+ **read**
     *
     * <p>GET /threads/new</p>
     * @param dataLimit dataLimit (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @return ThreadsUnreadResponse
     * @throws Exception on API or network error
     */
    public ThreadsUnreadResponse threadsUnread(Integer dataLimit, Integer forumId, Integer limit) throws Exception {
        String path = "/threads/new";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (forumId != null) queryParams.put("forum_id", String.valueOf(forumId));
        if (dataLimit != null) queryParams.put("data_limit", String.valueOf(dataLimit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsUnreadResponse.class);
    }

    /**
     * List of recent threads.

Required scopes:
+ **read**
     *
     * <p>GET /threads/recent</p>
     * @param dataLimit dataLimit (optional, nullable)
     * @param days days (optional, nullable)
     * @param forumId forumId (optional, nullable)
     * @param limit limit (optional, nullable)
     * @return ThreadsRecentResponse
     * @throws Exception on API or network error
     */
    public ThreadsRecentResponse threadsRecent(Integer dataLimit, Integer days, Integer forumId, Integer limit) throws Exception {
        String path = "/threads/recent";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (days != null) queryParams.put("days", String.valueOf(days));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (forumId != null) queryParams.put("forum_id", String.valueOf(forumId));
        if (dataLimit != null) queryParams.put("data_limit", String.valueOf(dataLimit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, ThreadsRecentResponse.class);
    }

    /**
     * Finishes a contest.

Required scopes:
+ **post**
     *
     * <p>POST /contests/{thread_id}/finish</p>
     * @param threadId threadId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse threadsFinish(Integer threadId) throws Exception {
        String path = "/contests/{thread_id}/finish";
        path = path.replace("{thread_id}", String.valueOf(threadId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    // ==================== Users ====================

    /**
     * List of users (with pagination).

Required scopes:
+ **read**
     *
     * <p>GET /users</p>
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return UsersListResponse
     * @throws Exception on API or network error
     */
    public UsersListResponse usersList(java.util.List<String> fieldsInclude, Integer limit, Integer page) throws Exception {
        String path = "/users";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersListResponse.class);
    }

    /**
     * List of user fields.

Required scopes:
+ **read**
     *
     * <p>GET /users/fields</p>
     * @return UsersFieldsResponse
     * @throws Exception on API or network error
     */
    public UsersFieldsResponse usersFields() throws Exception {
        String path = "/users/fields";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersFieldsResponse.class);
    }

    /**
     * List of users filtered by username, email or custom fields.

Required scopes:
+ **read**
     *
     * <p>GET /users/find</p>
     * @param customFields customFields (optional, nullable)
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @param username username (optional, nullable)
     * @return UsersFindResponse
     * @throws Exception on API or network error
     */
    public UsersFindResponse usersFind(java.util.Map<String, String> customFields, java.util.List<String> fieldsInclude, String username) throws Exception {
        String path = "/users/find";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (username != null) queryParams.put("username", String.valueOf(username));
        if (customFields != null) queryParams.put("custom_fields", String.valueOf(customFields));
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersFindResponse.class);
    }

    /**
     * Detail information of a user.

Required scopes:
+ **read**
+ **basic**
     *
     * <p>GET /users/{user_id}</p>
     * @param userId userId (required)
     * @param fieldsInclude fieldsInclude (optional, nullable)
     * @return UsersGetResponse
     * @throws Exception on API or network error
     */
    public UsersGetResponse usersGet(String userId, java.util.List<String> fieldsInclude) throws Exception {
        String path = "/users/{user_id}";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (fieldsInclude != null) {
            for (int i = 0; i < fieldsInclude.size(); i++) {
                queryParams.put("fields_include[" + i + "]", String.valueOf(fieldsInclude.get(i)));
            }
        }
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersGetResponse.class);
    }

    /**
     * Edit a user.

Required scopes:
+ **post**
     *
     * <p>PUT /users/{user_id}</p>
     * @param userId userId (required)
     * @param activityVisible activityVisible (optional, nullable)
     * @param alert alert (optional, nullable)
     * @param allowInviteGroup allowInviteGroup (optional, nullable)
     * @param allowPostProfile allowPostProfile (optional, nullable)
     * @param allowReceiveNewsFeed allowReceiveNewsFeed (optional, nullable)
     * @param allowSendPersonalConversation allowSendPersonalConversation (optional, nullable)
     * @param allowViewProfile allowViewProfile (optional, nullable)
     * @param convWelcomeMessage convWelcomeMessage (optional, nullable)
     * @param displayBannerId displayBannerId (optional, nullable)
     * @param displayGroupId displayGroupId (optional, nullable)
     * @param displayIconGroupId displayIconGroupId (optional, nullable)
     * @param fields fields (optional, nullable)
     * @param gender gender (optional, nullable)
     * @param hideUsernameChangeLogs hideUsernameChangeLogs (optional, nullable)
     * @param languageId languageId (optional, nullable)
     * @param receiveAdminEmail receiveAdminEmail (optional, nullable)
     * @param secretAnswer secretAnswer (optional, nullable)
     * @param secretAnswerType secretAnswerType (optional, nullable)
     * @param shortLink shortLink (optional, nullable)
     * @param showDobDate showDobDate (optional, nullable)
     * @param showDobYear showDobYear (optional, nullable)
     * @param timezone timezone (optional, nullable)
     * @param userDobDay userDobDay (optional, nullable)
     * @param userDobMonth userDobMonth (optional, nullable)
     * @param userDobYear userDobYear (optional, nullable)
     * @param userTitle userTitle (optional, nullable)
     * @param username username (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersEdit(String userId, Boolean activityVisible, java.util.Map<String, String> alert, AllowInviteGroupEnum allowInviteGroup, AllowPostProfileEnum allowPostProfile, AllowReceiveNewsFeedEnum allowReceiveNewsFeed, AllowSendPersonalConversationEnum allowSendPersonalConversation, AllowViewProfileEnum allowViewProfile, String convWelcomeMessage, Integer displayBannerId, Integer displayGroupId, Integer displayIconGroupId, java.util.Map<String, String> fields, GenderEnum gender, Boolean hideUsernameChangeLogs, LanguageIdEnum languageId, Boolean receiveAdminEmail, String secretAnswer, Integer secretAnswerType, String shortLink, Boolean showDobDate, Boolean showDobYear, TimezoneEnum timezone, Integer userDobDay, Integer userDobMonth, Integer userDobYear, String userTitle, String username) throws Exception {
        String path = "/users/{user_id}";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (username != null) body.put("username", username);
        if (userTitle != null) body.put("user_title", userTitle);
        if (displayGroupId != null) body.put("display_group_id", displayGroupId);
        if (displayIconGroupId != null) body.put("display_icon_group_id", displayIconGroupId);
        if (displayBannerId != null) body.put("display_banner_id", displayBannerId);
        if (convWelcomeMessage != null) body.put("conv_welcome_message", convWelcomeMessage);
        if (userDobDay != null) body.put("user_dob_day", userDobDay);
        if (userDobMonth != null) body.put("user_dob_month", userDobMonth);
        if (userDobYear != null) body.put("user_dob_year", userDobYear);
        if (secretAnswer != null) body.put("secret_answer", secretAnswer);
        if (secretAnswerType != null) body.put("secret_answer_type", secretAnswerType);
        if (shortLink != null) body.put("short_link", shortLink);
        if (languageId != null) body.put("language_id", languageId.getValue());
        if (gender != null) body.put("gender", gender.getValue());
        if (timezone != null) body.put("timezone", timezone.getValue());
        if (receiveAdminEmail != null) body.put("receive_admin_email", receiveAdminEmail);
        if (activityVisible != null) body.put("activity_visible", activityVisible);
        if (showDobDate != null) body.put("show_dob_date", showDobDate);
        if (showDobYear != null) body.put("show_dob_year", showDobYear);
        if (hideUsernameChangeLogs != null) body.put("hide_username_change_logs", hideUsernameChangeLogs);
        if (allowViewProfile != null) body.put("allow_view_profile", allowViewProfile.getValue());
        if (allowPostProfile != null) body.put("allow_post_profile", allowPostProfile.getValue());
        if (allowSendPersonalConversation != null) body.put("allow_send_personal_conversation", allowSendPersonalConversation.getValue());
        if (allowInviteGroup != null) body.put("allow_invite_group", allowInviteGroup.getValue());
        if (allowReceiveNewsFeed != null) body.put("allow_receive_news_feed", allowReceiveNewsFeed.getValue());
        if (alert != null) body.put("alert", alert);
        if (fields != null) body.put("fields", fields);
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Get user claims.

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/claims</p>
     * @param userId userId (required)
     * @param claimState claimState (optional, nullable)
     * @param type type (optional, nullable)
     * @return UsersClaimsResponse
     * @throws Exception on API or network error
     */
    public UsersClaimsResponse usersClaims(String userId, ClaimStateEnum claimState, Type1Enum type) throws Exception {
        String path = "/users/{user_id}/claims";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (type != null) queryParams.put("type", type.getValue());
        if (claimState != null) queryParams.put("claim_state", claimState.getValue());
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersClaimsResponse.class);
    }

    /**
     * Upload avatar for a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/avatar</p>
     * @param userId userId (required)
     * @param avatar avatar (optional, nullable)
     * @param crop crop (optional, nullable)
     * @param x x (optional, nullable)
     * @param y y (optional, nullable)
     * @return UsersAvatarUploadResponse
     * @throws Exception on API or network error
     */
    public UsersAvatarUploadResponse usersAvatarUpload(String userId, byte[] avatar, Integer crop, Integer x, Integer y) throws Exception {
        String path = "/users/{user_id}/avatar";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, String> textParts = new java.util.HashMap<>();
        if (x != null) textParts.put("x", String.valueOf(x));
        if (y != null) textParts.put("y", String.valueOf(y));
        if (crop != null) textParts.put("crop", String.valueOf(crop));
        java.util.Map<String, byte[]> fileParts = new java.util.HashMap<>();
        if (avatar != null) fileParts.put("avatar", avatar);
        String response = client.postMultipart(url, null, queryParams, textParts, fileParts);
        return objectMapper.readValue(response, UsersAvatarUploadResponse.class);
    }

    /**
     * Delete avatar for a user.

Required scopes:
+ **post**
     *
     * <p>DELETE /users/{user_id}/avatar</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersAvatarDelete(String userId) throws Exception {
        String path = "/users/{user_id}/avatar";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Crop avatar for a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/avatar/crop</p>
     * @param userId userId (required)
     * @param crop crop (optional, nullable)
     * @param x x (optional, nullable)
     * @param y y (optional, nullable)
     * @return UsersAvatarCropResponse
     * @throws Exception on API or network error
     */
    public UsersAvatarCropResponse usersAvatarCrop(String userId, Integer crop, Integer x, Integer y) throws Exception {
        String path = "/users/{user_id}/avatar/crop";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (x != null) body.put("x", x);
        if (y != null) body.put("y", y);
        if (crop != null) body.put("crop", crop);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, UsersAvatarCropResponse.class);
    }

    /**
     * Upload background for a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/background</p>
     * @param userId userId (required)
     * @param background background (optional, nullable)
     * @param crop crop (optional, nullable)
     * @param x x (optional, nullable)
     * @param y y (optional, nullable)
     * @return UsersBackgroundUploadResponse
     * @throws Exception on API or network error
     */
    public UsersBackgroundUploadResponse usersBackgroundUpload(String userId, byte[] background, Integer crop, Integer x, Integer y) throws Exception {
        String path = "/users/{user_id}/background";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, String> textParts = new java.util.HashMap<>();
        if (x != null) textParts.put("x", String.valueOf(x));
        if (y != null) textParts.put("y", String.valueOf(y));
        if (crop != null) textParts.put("crop", String.valueOf(crop));
        java.util.Map<String, byte[]> fileParts = new java.util.HashMap<>();
        if (background != null) fileParts.put("background", background);
        String response = client.postMultipart(url, null, queryParams, textParts, fileParts);
        return objectMapper.readValue(response, UsersBackgroundUploadResponse.class);
    }

    /**
     * Delete background for a user.

Required scopes:
+ **post**
     *
     * <p>DELETE /users/{user_id}/background</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersBackgroundDelete(String userId) throws Exception {
        String path = "/users/{user_id}/background";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Crop background for a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/background/crop</p>
     * @param userId userId (required)
     * @param crop crop (optional, nullable)
     * @param x x (optional, nullable)
     * @param y y (optional, nullable)
     * @return UsersBackgroundCropResponse
     * @throws Exception on API or network error
     */
    public UsersBackgroundCropResponse usersBackgroundCrop(String userId, Integer crop, Integer x, Integer y) throws Exception {
        String path = "/users/{user_id}/background/crop";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (x != null) body.put("x", x);
        if (y != null) body.put("y", y);
        if (crop != null) body.put("crop", crop);
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, UsersBackgroundCropResponse.class);
    }

    /**
     * List of a user's followers.

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/followers</p>
     * @param userId userId (required)
     * @param limit limit (optional, nullable)
     * @param order order (optional, nullable)
     * @param page page (optional, nullable)
     * @return UsersFollowersResponse
     * @throws Exception on API or network error
     */
    public UsersFollowersResponse usersFollowers(String userId, Integer limit, Order4Enum order, Integer page) throws Exception {
        String path = "/users/{user_id}/followers";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (order != null) queryParams.put("order", order.getValue());
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersFollowersResponse.class);
    }

    /**
     * Follow a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/followers</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersFollow(String userId) throws Exception {
        String path = "/users/{user_id}/followers";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Unfollow a user.

Required scopes:
+ **post**
     *
     * <p>DELETE /users/{user_id}/followers</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersUnfollow(String userId) throws Exception {
        String path = "/users/{user_id}/followers";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of users whom are followed by a user.

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/followings</p>
     * @param userId userId (required)
     * @param limit limit (optional, nullable)
     * @param order order (optional, nullable)
     * @param page page (optional, nullable)
     * @return UsersFollowingsResponse
     * @throws Exception on API or network error
     */
    public UsersFollowingsResponse usersFollowings(String userId, Integer limit, Order4Enum order, Integer page) throws Exception {
        String path = "/users/{user_id}/followings";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (order != null) queryParams.put("order", order.getValue());
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersFollowingsResponse.class);
    }

    /**
     * Get information about user likes.

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/likes</p>
     * @param userId userId (required)
     * @param contentType contentType (optional, nullable)
     * @param likeType likeType (optional, nullable)
     * @param nodeId nodeId (optional, nullable)
     * @param page page (optional, nullable)
     * @param searchUserId searchUserId (optional, nullable)
     * @param stats stats (optional, nullable)
     * @param type type (optional, nullable)
     * @return UsersLikesResponse
     * @throws Exception on API or network error
     */
    public UsersLikesResponse usersLikes(String userId, ContentTypeEnum contentType, LikeTypeEnum likeType, Integer nodeId, Integer page, Integer searchUserId, Boolean stats, Type2Enum type) throws Exception {
        String path = "/users/{user_id}/likes";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (nodeId != null) queryParams.put("node_id", String.valueOf(nodeId));
        if (likeType != null) queryParams.put("like_type", likeType.getValue());
        if (type != null) queryParams.put("type", type.getValue());
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (contentType != null) queryParams.put("content_type", contentType.getValue());
        if (searchUserId != null) queryParams.put("search_user_id", String.valueOf(searchUserId));
        if (stats != null) queryParams.put("stats", stats ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersLikesResponse.class);
    }

    /**
     * List of ignored users of current user.

Required scopes:
+ **read**
     *
     * <p>GET /users/ignored</p>
     * @param total total (optional, nullable)
     * @return UsersIgnoredResponse
     * @throws Exception on API or network error
     */
    public UsersIgnoredResponse usersIgnored(Boolean total) throws Exception {
        String path = "/users/ignored";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (total != null) queryParams.put("total", total ? "1" : "0");
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersIgnoredResponse.class);
    }

    /**
     * Ignore a user.

Required scopes:
+ **post**
     *
     * <p>POST /users/{user_id}/ignore</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersIgnore(String userId) throws Exception {
        String path = "/users/{user_id}/ignore";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Edit ignoring options.

Required scopes:
+ **post**
     *
     * <p>PUT /users/{user_id}/ignore</p>
     * @param userId userId (required)
     * @param ignoreContent ignoreContent (optional, nullable)
     * @param ignoreConversations ignoreConversations (optional, nullable)
     * @param restrictViewProfile restrictViewProfile (optional, nullable)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersIgnoreedit(String userId, Boolean ignoreContent, Boolean ignoreConversations, Boolean restrictViewProfile) throws Exception {
        String path = "/users/{user_id}/ignore";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (ignoreConversations != null) queryParams.put("ignore_conversations", ignoreConversations ? "1" : "0");
        if (ignoreContent != null) queryParams.put("ignore_content", ignoreContent ? "1" : "0");
        if (restrictViewProfile != null) queryParams.put("restrict_view_profile", restrictViewProfile ? "1" : "0");
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.put(url, null, queryParams, body);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * Stop ignoring a user.

Required scopes:
+ **post**
     *
     * <p>DELETE /users/{user_id}/ignore</p>
     * @param userId userId (required)
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersUnignore(String userId) throws Exception {
        String path = "/users/{user_id}/ignore";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

    /**
     * List of contents created by user (with pagination).

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/timeline</p>
     * @param userId userId (required)
     * @param limit limit (optional, nullable)
     * @param page page (optional, nullable)
     * @return UsersContentsResponse
     * @throws Exception on API or network error
     */
    public UsersContentsResponse usersContents(String userId, Integer limit, Integer page) throws Exception {
        String path = "/users/{user_id}/timeline";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        if (page != null) queryParams.put("page", String.valueOf(page));
        if (limit != null) queryParams.put("limit", String.valueOf(limit));
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersContentsResponse.class);
    }

    /**
     * List of user trophies.

Required scopes:
+ **read**
     *
     * <p>GET /users/{user_id}/trophies</p>
     * @param userId userId (required)
     * @return UsersTrophiesResponse
     * @throws Exception on API or network error
     */
    public UsersTrophiesResponse usersTrophies(String userId) throws Exception {
        String path = "/users/{user_id}/trophies";
        path = path.replace("{user_id}", String.valueOf(userId));
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersTrophiesResponse.class);
    }

    /**
     * Get available secret answer types for user account security.

Required scopes:
+ **read**
     *
     * <p>GET /users/secret-answer/types</p>
     * @return UsersSecretanswertypesResponse
     * @throws Exception on API or network error
     */
    public UsersSecretanswertypesResponse usersSecretanswertypes() throws Exception {
        String path = "/users/secret-answer/types";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.get(url, null, queryParams);
        return objectMapper.readValue(response, UsersSecretanswertypesResponse.class);
    }

    /**
     * Request a reset of the secret answer for the account.

Required scopes:
+ **post**
     *
     * <p>POST /account/secret-answer/reset</p>
     * @return UsersSaResetResponse
     * @throws Exception on API or network error
     */
    public UsersSaResetResponse usersSaReset() throws Exception {
        String path = "/account/secret-answer/reset";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        java.util.Map<String, Object> body = java.util.Collections.emptyMap();
        String response = client.post(url, null, queryParams, body);
        return objectMapper.readValue(response, UsersSaResetResponse.class);
    }

    /**
     * Cancel a pending secret answer reset request for the account.

Required scopes:
+ **post**
     *
     * <p>DELETE /account/secret-answer/reset</p>
     * @return SaveChangesResponse
     * @throws Exception on API or network error
     */
    public SaveChangesResponse usersSaCancelreset() throws Exception {
        String path = "/account/secret-answer/reset";
        String url = baseUrl + path;
        java.util.Map<String, String> queryParams = new java.util.HashMap<>();
        String response = client.delete(url, null, queryParams);
        return objectMapper.readValue(response, SaveChangesResponse.class);
    }

}

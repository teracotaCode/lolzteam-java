package com.lolzteam.generated.forum.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>RespUsermodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record RespUsermodel(
    @JsonProperty("user_id") Long userId,
    @JsonProperty("username") String username,
    @JsonProperty("username_html") String usernameHtml,
    @JsonProperty("user_message_count") Long userMessageCount,
    @JsonProperty("user_register_date") Long userRegisterDate,
    @JsonProperty("user_like_count") Long userLikeCount,
    @JsonProperty("user_like2_count") Long userLike2Count,
    @JsonProperty("contest_count") Long contestCount,
    @JsonProperty("trophy_count") Long trophyCount,
    @JsonProperty("short_link") String shortLink,
    @JsonProperty("custom_title") String customTitle,
    @JsonProperty("is_banned") Long isBanned,
    @JsonProperty("display_banner_id") Long displayBannerId,
    @JsonProperty("display_icon_group_id") Long displayIconGroupId,
    @JsonProperty("balance") String balance,
    @JsonProperty("hold") String hold,
    @JsonProperty("currency") String currency,
    @JsonProperty("user_email") String userEmail,
    @JsonProperty("user_unread_notification_count") Long userUnreadNotificationCount,
    @JsonProperty("user_unread_conversation_count") Long userUnreadConversationCount,
    @JsonProperty("conv_welcome_message") String convWelcomeMessage,
    @JsonProperty("user_title") String userTitle,
    @JsonProperty("user_deposit") Long userDeposit,
    @JsonProperty("user_is_valid") Boolean userIsValid,
    @JsonProperty("user_is_verified") Boolean userIsVerified,
    @JsonProperty("user_is_followed") Boolean userIsFollowed,
    @JsonProperty("user_last_seen_date") Long userLastSeenDate,
    @JsonProperty("links") java.util.Map<String, Object> links,
    @JsonProperty("permissions") java.util.Map<String, Object> permissions,
    @JsonProperty("user_is_ignored") Boolean userIsIgnored,
    @JsonProperty("user_is_visitor") Boolean userIsVisitor,
    @JsonProperty("user_group_id") Long userGroupId,
    @JsonProperty("curator_titles") java.util.List<String> curatorTitles,
    @JsonProperty("user_groups") java.util.List<java.util.Map<String, Object>> userGroups,
    @JsonProperty("fields") java.util.List<java.util.Map<String, Object>> fields,
    @JsonProperty("user_timezone_offset") Long userTimezoneOffset,
    @JsonProperty("user_external_authentications") java.util.List<java.util.Map<String, Object>> userExternalAuthentications,
    @JsonProperty("self_permissions") java.util.Map<String, Object> selfPermissions,
    @JsonProperty("edit_permissions") java.util.Map<String, Object> editPermissions,
    @JsonProperty("birthday") java.util.Map<String, Object> birthday,
    @JsonProperty("secret_answer_rendered") String secretAnswerRendered,
    @JsonProperty("secret_answer_first_letter") String secretAnswerFirstLetter,
    @JsonProperty("user_following") java.util.Map<String, Object> userFollowing,
    @JsonProperty("user_followers") java.util.Map<String, Object> userFollowers,
    @JsonProperty("banner") String banner
) {}

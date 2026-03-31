package com.lolzteam.generated.market.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response model <code>Extramodel</code>.
 *
 * <p>Auto-generated from OpenAPI schema. All fields are nullable.</p>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record Extramodel(
    @JsonProperty("proxy") String proxy,
    @JsonProperty("close_item") Boolean closeItem,
    @JsonProperty("region") String region,
    @JsonProperty("service") String service,
    @JsonProperty("system") String system,
    @JsonProperty("confirmationCode") String confirmationcode,
    @JsonProperty("cookies") String cookies,
    @JsonProperty("login_without_cookies") Boolean loginWithoutCookies,
    @JsonProperty("cookie_login") Boolean cookieLogin,
    @JsonProperty("mfa_file") String mfaFile,
    @JsonProperty("dota2_mmr") Long dota2Mmr,
    @JsonProperty("ea_games") Boolean eaGames,
    @JsonProperty("uplay_games") Boolean uplayGames,
    @JsonProperty("the_quarry") Boolean theQuarry,
    @JsonProperty("warframe") Boolean warframe,
    @JsonProperty("ark") Boolean ark,
    @JsonProperty("ark_ascended") Boolean arkAscended,
    @JsonProperty("genshin_currency") Long genshinCurrency,
    @JsonProperty("honkai_currency") Long honkaiCurrency,
    @JsonProperty("zenless_currency") Long zenlessCurrency,
    @JsonProperty("password") String password,
    @JsonProperty("telegramClient") String telegramclient,
    @JsonProperty("telegramJson") String telegramjson,
    @JsonProperty("checkChannels") Boolean checkchannels,
    @JsonProperty("checkSpam") Boolean checkspam,
    @JsonProperty("checkHypixelBan") Boolean checkhypixelban
) {}

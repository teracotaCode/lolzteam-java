package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>categoryName</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum CategorynameEnum {
    @JsonProperty("steam") STEAM("steam"),
    @JsonProperty("fortnite") FORTNITE("fortnite"),
    @JsonProperty("mihoyo") MIHOYO("mihoyo"),
    @JsonProperty("riot") RIOT("riot"),
    @JsonProperty("telegram") TELEGRAM("telegram"),
    @JsonProperty("supercell") SUPERCELL("supercell"),
    @JsonProperty("ea") EA("ea"),
    @JsonProperty("world-of-tanks") WORLD_OF_TANKS("world-of-tanks"),
    @JsonProperty("wot-blitz") WOT_BLITZ("wot-blitz"),
    @JsonProperty("epicgames") EPICGAMES("epicgames"),
    @JsonProperty("gifts") GIFTS("gifts"),
    @JsonProperty("minecraft") MINECRAFT("minecraft"),
    @JsonProperty("escape-from-tarkov") ESCAPE_FROM_TARKOV("escape-from-tarkov"),
    @JsonProperty("socialclub") SOCIALCLUB("socialclub"),
    @JsonProperty("uplay") UPLAY("uplay"),
    @JsonProperty("discord") DISCORD("discord"),
    @JsonProperty("tiktok") TIKTOK("tiktok"),
    @JsonProperty("instagram") INSTAGRAM("instagram"),
    @JsonProperty("chatgpt") CHATGPT("chatgpt"),
    @JsonProperty("battlenet") BATTLENET("battlenet"),
    @JsonProperty("vpn") VPN("vpn"),
    @JsonProperty("roblox") ROBLOX("roblox"),
    @JsonProperty("warface") WARFACE("warface"),
    @JsonProperty("hytale") HYTALE("hytale");

    private final String value;

    CategorynameEnum(String value) {
        this.value = value;
    }

    /**
     * Return the JSON string value of this enum constant.
     *
     * @return the string value
     */
    @JsonValue
    public String getValue() { return value; }

    /**
     * Deserialize a string into a {@link CategorynameEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link CategorynameEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static CategorynameEnum fromValue(String value) {
        for (CategorynameEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

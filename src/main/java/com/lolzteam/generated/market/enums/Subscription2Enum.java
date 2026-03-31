package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>subscription</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Subscription2Enum {
    @JsonProperty("discord_nitro") DISCORD_NITRO("discord_nitro"),
    @JsonProperty("discord_nitro_basic") DISCORD_NITRO_BASIC("discord_nitro_basic"),
    @JsonProperty("discord_nitro_trial") DISCORD_NITRO_TRIAL("discord_nitro_trial"),
    @JsonProperty("telegram_premium") TELEGRAM_PREMIUM("telegram_premium");

    private final String value;

    Subscription2Enum(String value) {
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
     * Deserialize a string into a {@link Subscription2Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Subscription2Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Subscription2Enum fromValue(String value) {
        for (Subscription2Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

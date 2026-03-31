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
public enum Subscription5Enum {
    @JsonProperty("PC Game Pass") PC_GAME_PASS("PC Game Pass"),
    @JsonProperty("Xbox Game Pass Ultimate") XBOX_GAME_PASS_ULTIMATE("Xbox Game Pass Ultimate");

    private final String value;

    Subscription5Enum(String value) {
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
     * Deserialize a string into a {@link Subscription5Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Subscription5Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Subscription5Enum fromValue(String value) {
        for (Subscription5Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

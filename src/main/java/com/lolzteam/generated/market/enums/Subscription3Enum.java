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
public enum Subscription3Enum {
    @JsonProperty("basic") BASIC("basic"),
    @JsonProperty("premium") PREMIUM("premium"),
    @JsonProperty("premiumAnywhere") PREMIUMANYWHERE("premiumAnywhere");

    private final String value;

    Subscription3Enum(String value) {
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
     * Deserialize a string into a {@link Subscription3Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Subscription3Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Subscription3Enum fromValue(String value) {
        for (Subscription3Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

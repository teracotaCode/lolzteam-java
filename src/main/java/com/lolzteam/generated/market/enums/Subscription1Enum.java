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
public enum Subscription1Enum {
    @JsonProperty("EA Play") EA_PLAY("EA Play"),
    @JsonProperty("EA Play Pro") EA_PLAY_PRO("EA Play Pro");

    private final String value;

    Subscription1Enum(String value) {
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
     * Deserialize a string into a {@link Subscription1Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Subscription1Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Subscription1Enum fromValue(String value) {
        for (Subscription1Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Type2Enum {
    @JsonProperty("market") MARKET("market"),
    @JsonProperty("nomarket") NOMARKET("nomarket");

    private final String value;

    Type2Enum(String value) {
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
     * Deserialize a string into a {@link Type2Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Type2Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Type2Enum fromValue(String value) {
        for (Type2Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

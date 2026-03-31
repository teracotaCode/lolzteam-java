package com.lolzteam.generated.forum.enums;

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
public enum Type1Enum {
    @JsonProperty("market") MARKET("market"),
    @JsonProperty("nomarket") NOMARKET("nomarket");

    private final String value;

    Type1Enum(String value) {
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
     * Deserialize a string into a {@link Type1Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Type1Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Type1Enum fromValue(String value) {
        for (Type1Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>order</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Order5Enum {
    @JsonProperty("natural") NATURAL("natural"),
    @JsonProperty("natural_reverse") NATURAL_REVERSE("natural_reverse");

    private final String value;

    Order5Enum(String value) {
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
     * Deserialize a string into a {@link Order5Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Order5Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Order5Enum fromValue(String value) {
        for (Order5Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

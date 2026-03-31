package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>length_option</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum LengthOptionEnum {
    @JsonProperty("minutes") MINUTES("minutes"),
    @JsonProperty("hours") HOURS("hours"),
    @JsonProperty("days") DAYS("days");

    private final String value;

    LengthOptionEnum(String value) {
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
     * Deserialize a string into a {@link LengthOptionEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link LengthOptionEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static LengthOptionEnum fromValue(String value) {
        for (LengthOptionEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

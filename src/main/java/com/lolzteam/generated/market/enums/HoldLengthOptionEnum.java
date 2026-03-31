package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>hold_length_option</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum HoldLengthOptionEnum {
    @JsonProperty("hour") HOUR("hour"),
    @JsonProperty("day") DAY("day"),
    @JsonProperty("week") WEEK("week"),
    @JsonProperty("month") MONTH("month"),
    @JsonProperty("year") YEAR("year");

    private final String value;

    HoldLengthOptionEnum(String value) {
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
     * Deserialize a string into a {@link HoldLengthOptionEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link HoldLengthOptionEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static HoldLengthOptionEnum fromValue(String value) {
        for (HoldLengthOptionEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

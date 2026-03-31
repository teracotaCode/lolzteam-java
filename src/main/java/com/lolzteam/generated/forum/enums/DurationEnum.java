package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>duration</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum DurationEnum {
    @JsonProperty("day") DAY("day"),
    @JsonProperty("week") WEEK("week"),
    @JsonProperty("month") MONTH("month");

    private final String value;

    DurationEnum(String value) {
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
     * Deserialize a string into a {@link DurationEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link DurationEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static DurationEnum fromValue(String value) {
        for (DurationEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

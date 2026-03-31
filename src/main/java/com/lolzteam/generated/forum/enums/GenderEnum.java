package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>gender</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum GenderEnum {
    @JsonProperty("") EMPTY(""),
    @JsonProperty("male") MALE("male"),
    @JsonProperty("female") FEMALE("female");

    private final String value;

    GenderEnum(String value) {
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
     * Deserialize a string into a {@link GenderEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link GenderEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static GenderEnum fromValue(String value) {
        for (GenderEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>system</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum SystemEnum {
    @JsonProperty("laser") LASER("laser"),
    @JsonProperty("scroll") SCROLL("scroll"),
    @JsonProperty("magic") MAGIC("magic");

    private final String value;

    SystemEnum(String value) {
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
     * Deserialize a string into a {@link SystemEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link SystemEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static SystemEnum fromValue(String value) {
        for (SystemEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

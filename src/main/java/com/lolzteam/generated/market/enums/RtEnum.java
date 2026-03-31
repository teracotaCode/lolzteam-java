package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>rt</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum RtEnum {
    @JsonProperty("yes") YES("yes"),
    @JsonProperty("no") NO("no"),
    @JsonProperty("nomatter") NOMATTER("nomatter");

    private final String value;

    RtEnum(String value) {
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
     * Deserialize a string into a {@link RtEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link RtEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static RtEnum fromValue(String value) {
        for (RtEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

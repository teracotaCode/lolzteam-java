package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>temp_email</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum TempEmailEnum {
    @JsonProperty("yes") YES("yes"),
    @JsonProperty("no") NO("no"),
    @JsonProperty("nomatter") NOMATTER("nomatter");

    private final String value;

    TempEmailEnum(String value) {
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
     * Deserialize a string into a {@link TempEmailEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link TempEmailEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static TempEmailEnum fromValue(String value) {
        for (TempEmailEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>email_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum EmailTypeEnum {
    @JsonProperty("native") NATIVE("native"),
    @JsonProperty("autoreg") AUTOREG("autoreg");

    private final String value;

    EmailTypeEnum(String value) {
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
     * Deserialize a string into a {@link EmailTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link EmailTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static EmailTypeEnum fromValue(String value) {
        for (EmailTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

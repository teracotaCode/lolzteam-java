package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>status</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum StatusEnum {
    @JsonProperty("paid") PAID("paid"),
    @JsonProperty("not_paid") NOT_PAID("not_paid");

    private final String value;

    StatusEnum(String value) {
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
     * Deserialize a string into a {@link StatusEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link StatusEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

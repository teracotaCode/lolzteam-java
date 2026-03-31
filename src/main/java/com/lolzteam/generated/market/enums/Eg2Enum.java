package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>eg</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Eg2Enum {
    @JsonProperty("-1") V_1("-1"),
    @JsonProperty("0") V_0("0"),
    @JsonProperty("1") V_1_2("1"),
    @JsonProperty("2") V_2("2");

    private final String value;

    Eg2Enum(String value) {
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
     * Deserialize a string into a {@link Eg2Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Eg2Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Eg2Enum fromValue(String value) {
        for (Eg2Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

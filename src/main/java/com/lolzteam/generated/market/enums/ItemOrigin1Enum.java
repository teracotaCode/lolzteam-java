package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>item_origin</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ItemOrigin1Enum {
    @JsonProperty("brute") BRUTE("brute"),
    @JsonProperty("phishing") PHISHING("phishing"),
    @JsonProperty("stealer") STEALER("stealer"),
    @JsonProperty("personal") PERSONAL("personal"),
    @JsonProperty("resale") RESALE("resale"),
    @JsonProperty("autoreg") AUTOREG("autoreg"),
    @JsonProperty("dummy") DUMMY("dummy");

    private final String value;

    ItemOrigin1Enum(String value) {
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
     * Deserialize a string into a {@link ItemOrigin1Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ItemOrigin1Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ItemOrigin1Enum fromValue(String value) {
        for (ItemOrigin1Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

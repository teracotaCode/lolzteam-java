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
public enum ItemOrigin2Enum {
    @JsonProperty("brute") BRUTE("brute"),
    @JsonProperty("phishing") PHISHING("phishing"),
    @JsonProperty("stealer") STEALER("stealer"),
    @JsonProperty("personal") PERSONAL("personal"),
    @JsonProperty("resale") RESALE("resale"),
    @JsonProperty("autoreg") AUTOREG("autoreg"),
    @JsonProperty("dummy") DUMMY("dummy"),
    @JsonProperty("self_registration") SELF_REGISTRATION("self_registration");

    private final String value;

    ItemOrigin2Enum(String value) {
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
     * Deserialize a string into a {@link ItemOrigin2Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ItemOrigin2Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ItemOrigin2Enum fromValue(String value) {
        for (ItemOrigin2Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

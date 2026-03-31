package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>claim_state</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ClaimStateEnum {
    @JsonProperty("active") ACTIVE("active"),
    @JsonProperty("solved") SOLVED("solved"),
    @JsonProperty("rejected") REJECTED("rejected"),
    @JsonProperty("settled") SETTLED("settled");

    private final String value;

    ClaimStateEnum(String value) {
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
     * Deserialize a string into a {@link ClaimStateEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ClaimStateEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ClaimStateEnum fromValue(String value) {
        for (ClaimStateEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

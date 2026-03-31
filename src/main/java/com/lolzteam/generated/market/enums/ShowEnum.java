package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>show</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ShowEnum {
    @JsonProperty("active") ACTIVE("active"),
    @JsonProperty("paid") PAID("paid"),
    @JsonProperty("deleted") DELETED("deleted"),
    @JsonProperty("awaiting") AWAITING("awaiting"),
    @JsonProperty("closed") CLOSED("closed"),
    @JsonProperty("discount_request") DISCOUNT_REQUEST("discount_request"),
    @JsonProperty("stickied") STICKIED("stickied"),
    @JsonProperty("pre_active") PRE_ACTIVE("pre_active");

    private final String value;

    ShowEnum(String value) {
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
     * Deserialize a string into a {@link ShowEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ShowEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ShowEnum fromValue(String value) {
        for (ShowEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

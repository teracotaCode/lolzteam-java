package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>order_by</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum OrderByEnum {
    @JsonProperty("price_to_up") PRICE_TO_UP("price_to_up"),
    @JsonProperty("price_to_down") PRICE_TO_DOWN("price_to_down"),
    @JsonProperty("pdate_to_down") PDATE_TO_DOWN("pdate_to_down"),
    @JsonProperty("pdate_to_up") PDATE_TO_UP("pdate_to_up"),
    @JsonProperty("pdate_to_down_upload") PDATE_TO_DOWN_UPLOAD("pdate_to_down_upload"),
    @JsonProperty("pdate_to_up_upload") PDATE_TO_UP_UPLOAD("pdate_to_up_upload"),
    @JsonProperty("edate_to_up") EDATE_TO_UP("edate_to_up"),
    @JsonProperty("edate_to_down") EDATE_TO_DOWN("edate_to_down"),
    @JsonProperty("ddate_to_up") DDATE_TO_UP("ddate_to_up"),
    @JsonProperty("ddate_to_down") DDATE_TO_DOWN("ddate_to_down");

    private final String value;

    OrderByEnum(String value) {
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
     * Deserialize a string into a {@link OrderByEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link OrderByEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static OrderByEnum fromValue(String value) {
        for (OrderByEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

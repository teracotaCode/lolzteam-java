package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>nitro_period</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum NitroPeriodEnum {
    @JsonProperty("day") DAY("day"),
    @JsonProperty("month") MONTH("month"),
    @JsonProperty("year") YEAR("year");

    private final String value;

    NitroPeriodEnum(String value) {
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
     * Deserialize a string into a {@link NitroPeriodEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link NitroPeriodEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static NitroPeriodEnum fromValue(String value) {
        for (NitroPeriodEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

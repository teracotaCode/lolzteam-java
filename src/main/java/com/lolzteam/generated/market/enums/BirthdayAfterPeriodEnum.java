package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>birthday_after_period</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum BirthdayAfterPeriodEnum {
    @JsonProperty("day") DAY("day"),
    @JsonProperty("month") MONTH("month"),
    @JsonProperty("year") YEAR("year");

    private final String value;

    BirthdayAfterPeriodEnum(String value) {
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
     * Deserialize a string into a {@link BirthdayAfterPeriodEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link BirthdayAfterPeriodEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static BirthdayAfterPeriodEnum fromValue(String value) {
        for (BirthdayAfterPeriodEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

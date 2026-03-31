package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>prize_data_upgrade</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum PrizeDataUpgradeEnum {
    @JsonProperty("1") V_1("1"),
    @JsonProperty("6") V_6("6"),
    @JsonProperty("12") V_12("12"),
    @JsonProperty("14") V_14("14"),
    @JsonProperty("17") V_17("17"),
    @JsonProperty("19") V_19("19"),
    @JsonProperty("20") V_20("20"),
    @JsonProperty("21") V_21("21"),
    @JsonProperty("22") V_22("22");

    private final String value;

    PrizeDataUpgradeEnum(String value) {
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
     * Deserialize a string into a {@link PrizeDataUpgradeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link PrizeDataUpgradeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static PrizeDataUpgradeEnum fromValue(String value) {
        for (PrizeDataUpgradeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>prize_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum PrizeTypeEnum {
    @JsonProperty("money") MONEY("money"),
    @JsonProperty("upgrades") UPGRADES("upgrades");

    private final String value;

    PrizeTypeEnum(String value) {
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
     * Deserialize a string into a {@link PrizeTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link PrizeTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static PrizeTypeEnum fromValue(String value) {
        for (PrizeTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

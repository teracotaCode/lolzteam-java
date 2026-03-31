package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>cs2_map_rank</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Cs2MapRankEnum {
    @JsonProperty("1") V_1("1"),
    @JsonProperty("2") V_2("2"),
    @JsonProperty("3") V_3("3"),
    @JsonProperty("4") V_4("4"),
    @JsonProperty("5") V_5("5"),
    @JsonProperty("6") V_6("6"),
    @JsonProperty("7") V_7("7"),
    @JsonProperty("8") V_8("8"),
    @JsonProperty("9") V_9("9"),
    @JsonProperty("10") V_10("10"),
    @JsonProperty("11") V_11("11"),
    @JsonProperty("12") V_12("12"),
    @JsonProperty("13") V_13("13");

    private final String value;

    Cs2MapRankEnum(String value) {
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
     * Deserialize a string into a {@link Cs2MapRankEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Cs2MapRankEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Cs2MapRankEnum fromValue(String value) {
        for (Cs2MapRankEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

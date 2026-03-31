package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>category_id</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum CategoryIdEnum {
    @JsonProperty("1") V_1("1"),
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
    @JsonProperty("13") V_13("13"),
    @JsonProperty("14") V_14("14"),
    @JsonProperty("15") V_15("15"),
    @JsonProperty("16") V_16("16"),
    @JsonProperty("17") V_17("17"),
    @JsonProperty("18") V_18("18"),
    @JsonProperty("19") V_19("19"),
    @JsonProperty("20") V_20("20"),
    @JsonProperty("22") V_22("22"),
    @JsonProperty("24") V_24("24"),
    @JsonProperty("28") V_28("28"),
    @JsonProperty("30") V_30("30"),
    @JsonProperty("31") V_31("31");

    private final String value;

    CategoryIdEnum(String value) {
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
     * Deserialize a string into a {@link CategoryIdEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link CategoryIdEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static CategoryIdEnum fromValue(String value) {
        for (CategoryIdEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

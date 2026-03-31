package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>app_id</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AppIdEnum {
    @JsonProperty("730") V_730("730"),
    @JsonProperty("578080") V_578080("578080"),
    @JsonProperty("753") V_753("753"),
    @JsonProperty("570") V_570("570"),
    @JsonProperty("440") V_440("440"),
    @JsonProperty("252490") V_252490("252490"),
    @JsonProperty("304930") V_304930("304930"),
    @JsonProperty("232090") V_232090("232090"),
    @JsonProperty("322330") V_322330("322330");

    private final String value;

    AppIdEnum(String value) {
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
     * Deserialize a string into a {@link AppIdEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link AppIdEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static AppIdEnum fromValue(String value) {
        for (AppIdEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

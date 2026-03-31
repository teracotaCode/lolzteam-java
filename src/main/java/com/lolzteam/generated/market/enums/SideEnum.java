package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>side</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum SideEnum {
    @JsonProperty("Bear") BEAR("Bear"),
    @JsonProperty("Savage") SAVAGE("Savage");

    private final String value;

    SideEnum(String value) {
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
     * Deserialize a string into a {@link SideEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link SideEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static SideEnum fromValue(String value) {
        for (SideEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

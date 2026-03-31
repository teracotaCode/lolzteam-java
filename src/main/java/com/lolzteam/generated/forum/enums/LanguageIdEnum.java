package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>language_id</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum LanguageIdEnum {
    @JsonProperty("1") V_1("1"),
    @JsonProperty("2") V_2("2");

    private final String value;

    LanguageIdEnum(String value) {
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
     * Deserialize a string into a {@link LanguageIdEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link LanguageIdEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static LanguageIdEnum fromValue(String value) {
        for (LanguageIdEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

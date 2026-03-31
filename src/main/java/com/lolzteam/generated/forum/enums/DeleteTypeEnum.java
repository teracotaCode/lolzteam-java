package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>delete_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum DeleteTypeEnum {
    @JsonProperty("delete") DELETE("delete"),
    @JsonProperty("delete_ignore") DELETE_IGNORE("delete_ignore");

    private final String value;

    DeleteTypeEnum(String value) {
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
     * Deserialize a string into a {@link DeleteTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link DeleteTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static DeleteTypeEnum fromValue(String value) {
        for (DeleteTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

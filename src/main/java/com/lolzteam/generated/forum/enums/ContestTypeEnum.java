package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>contest_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ContestTypeEnum {
    @JsonProperty("by_finish_date") BY_FINISH_DATE("by_finish_date");

    private final String value;

    ContestTypeEnum(String value) {
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
     * Deserialize a string into a {@link ContestTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ContestTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ContestTypeEnum fromValue(String value) {
        for (ContestTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

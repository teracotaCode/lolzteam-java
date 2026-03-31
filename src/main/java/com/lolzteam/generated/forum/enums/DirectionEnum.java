package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>direction</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum DirectionEnum {
    @JsonProperty("asc") ASC("asc"),
    @JsonProperty("desc") DESC("desc");

    private final String value;

    DirectionEnum(String value) {
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
     * Deserialize a string into a {@link DirectionEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link DirectionEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static DirectionEnum fromValue(String value) {
        for (DirectionEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

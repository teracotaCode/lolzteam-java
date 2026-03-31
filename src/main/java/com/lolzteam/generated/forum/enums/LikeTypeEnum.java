package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>like_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum LikeTypeEnum {
    @JsonProperty("like") LIKE("like"),
    @JsonProperty("like2") LIKE2("like2");

    private final String value;

    LikeTypeEnum(String value) {
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
     * Deserialize a string into a {@link LikeTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link LikeTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static LikeTypeEnum fromValue(String value) {
        for (LikeTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

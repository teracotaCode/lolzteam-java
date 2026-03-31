package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>allow_post_profile</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AllowPostProfileEnum {
    @JsonProperty("none") NONE("none"),
    @JsonProperty("members") MEMBERS("members"),
    @JsonProperty("followed") FOLLOWED("followed");

    private final String value;

    AllowPostProfileEnum(String value) {
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
     * Deserialize a string into a {@link AllowPostProfileEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link AllowPostProfileEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static AllowPostProfileEnum fromValue(String value) {
        for (AllowPostProfileEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

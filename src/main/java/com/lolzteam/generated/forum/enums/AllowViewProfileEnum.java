package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>allow_view_profile</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AllowViewProfileEnum {
    @JsonProperty("none") NONE("none"),
    @JsonProperty("members") MEMBERS("members"),
    @JsonProperty("followed") FOLLOWED("followed");

    private final String value;

    AllowViewProfileEnum(String value) {
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
     * Deserialize a string into a {@link AllowViewProfileEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link AllowViewProfileEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static AllowViewProfileEnum fromValue(String value) {
        for (AllowViewProfileEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

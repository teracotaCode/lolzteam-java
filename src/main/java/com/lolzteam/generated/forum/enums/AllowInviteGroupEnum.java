package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>allow_invite_group</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum AllowInviteGroupEnum {
    @JsonProperty("none") NONE("none"),
    @JsonProperty("members") MEMBERS("members"),
    @JsonProperty("followed") FOLLOWED("followed");

    private final String value;

    AllowInviteGroupEnum(String value) {
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
     * Deserialize a string into a {@link AllowInviteGroupEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link AllowInviteGroupEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static AllowInviteGroupEnum fromValue(String value) {
        for (AllowInviteGroupEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

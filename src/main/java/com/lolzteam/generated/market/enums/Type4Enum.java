package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Type4Enum {
    @JsonProperty("skins") SKINS("skins"),
    @JsonProperty("pickaxes") PICKAXES("pickaxes"),
    @JsonProperty("dances") DANCES("dances"),
    @JsonProperty("gliders") GLIDERS("gliders"),
    @JsonProperty("weapons") WEAPONS("weapons"),
    @JsonProperty("agents") AGENTS("agents"),
    @JsonProperty("buddies") BUDDIES("buddies");

    private final String value;

    Type4Enum(String value) {
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
     * Deserialize a string into a {@link Type4Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Type4Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Type4Enum fromValue(String value) {
        for (Type4Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

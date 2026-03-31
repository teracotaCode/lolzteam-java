package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>region</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum RegionEnum {
    @JsonProperty("af") AF("af"),
    @JsonProperty("as") AS("as"),
    @JsonProperty("cis") CIS("cis"),
    @JsonProperty("eu") EU("eu"),
    @JsonProperty("me") ME("me"),
    @JsonProperty("oc") OC("oc"),
    @JsonProperty("us") US("us");

    private final String value;

    RegionEnum(String value) {
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
     * Deserialize a string into a {@link RegionEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link RegionEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static RegionEnum fromValue(String value) {
        for (RegionEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

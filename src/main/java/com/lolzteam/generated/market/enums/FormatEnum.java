package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>format</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum FormatEnum {
    @JsonProperty("short") SHORT("short"),
    @JsonProperty("custom") CUSTOM("custom"),
    @JsonProperty("mfa_file_steam_id") MFA_FILE_STEAM_ID("mfa_file_steam_id"),
    @JsonProperty("mfa_file_login") MFA_FILE_LOGIN("mfa_file_login");

    private final String value;

    FormatEnum(String value) {
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
     * Deserialize a string into a {@link FormatEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link FormatEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static FormatEnum fromValue(String value) {
        for (FormatEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

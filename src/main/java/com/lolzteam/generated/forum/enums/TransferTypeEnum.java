package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>transfer_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum TransferTypeEnum {
    @JsonProperty("guarantor") GUARANTOR("guarantor"),
    @JsonProperty("safe") SAFE("safe"),
    @JsonProperty("notsafe") NOTSAFE("notsafe");

    private final String value;

    TransferTypeEnum(String value) {
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
     * Deserialize a string into a {@link TransferTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link TransferTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static TransferTypeEnum fromValue(String value) {
        for (TransferTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

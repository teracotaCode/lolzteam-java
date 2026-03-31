package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>reply_group</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ReplyGroupEnum {
    @JsonProperty("0") V_0("0"),
    @JsonProperty("2") V_2("2"),
    @JsonProperty("21") V_21("21"),
    @JsonProperty("22") V_22("22"),
    @JsonProperty("23") V_23("23"),
    @JsonProperty("60") V_60("60"),
    @JsonProperty("351") V_351("351");

    private final String value;

    ReplyGroupEnum(String value) {
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
     * Deserialize a string into a {@link ReplyGroupEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ReplyGroupEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ReplyGroupEnum fromValue(String value) {
        for (ReplyGroupEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

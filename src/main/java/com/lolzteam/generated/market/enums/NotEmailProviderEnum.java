package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>not_email_provider[]</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum NotEmailProviderEnum {
    @JsonProperty("other") OTHER("other"),
    @JsonProperty("rambler") RAMBLER("rambler"),
    @JsonProperty("outlook") OUTLOOK("outlook"),
    @JsonProperty("firstmail") FIRSTMAIL("firstmail"),
    @JsonProperty("notletters") NOTLETTERS("notletters"),
    @JsonProperty("mail_ru") MAIL_RU("mail_ru");

    private final String value;

    NotEmailProviderEnum(String value) {
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
     * Deserialize a string into a {@link NotEmailProviderEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link NotEmailProviderEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static NotEmailProviderEnum fromValue(String value) {
        for (NotEmailProviderEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

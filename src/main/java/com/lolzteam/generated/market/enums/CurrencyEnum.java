package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>currency</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum CurrencyEnum {
    @JsonProperty("rub") RUB("rub"),
    @JsonProperty("uah") UAH("uah"),
    @JsonProperty("kzt") KZT("kzt"),
    @JsonProperty("byn") BYN("byn"),
    @JsonProperty("usd") USD("usd"),
    @JsonProperty("eur") EUR("eur"),
    @JsonProperty("gbp") GBP("gbp"),
    @JsonProperty("cny") CNY("cny"),
    @JsonProperty("try") TRY("try"),
    @JsonProperty("jpy") JPY("jpy"),
    @JsonProperty("brl") BRL("brl");

    private final String value;

    CurrencyEnum(String value) {
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
     * Deserialize a string into a {@link CurrencyEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link CurrencyEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static CurrencyEnum fromValue(String value) {
        for (CurrencyEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

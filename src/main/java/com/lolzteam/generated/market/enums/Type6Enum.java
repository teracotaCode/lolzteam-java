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
public enum Type6Enum {
    @JsonProperty("paid_item") PAID_ITEM("paid_item"),
    @JsonProperty("sold_item") SOLD_ITEM("sold_item"),
    @JsonProperty("withdrawal_balance") WITHDRAWAL_BALANCE("withdrawal_balance"),
    @JsonProperty("refilled_balance") REFILLED_BALANCE("refilled_balance"),
    @JsonProperty("internal_purchase") INTERNAL_PURCHASE("internal_purchase"),
    @JsonProperty("money_transfer") MONEY_TRANSFER("money_transfer"),
    @JsonProperty("receiving_money") RECEIVING_MONEY("receiving_money"),
    @JsonProperty("claim_hold") CLAIM_HOLD("claim_hold"),
    @JsonProperty("insurance_deposit") INSURANCE_DEPOSIT("insurance_deposit"),
    @JsonProperty("paid_mail") PAID_MAIL("paid_mail"),
    @JsonProperty("contest") CONTEST("contest"),
    @JsonProperty("invoice") INVOICE("invoice"),
    @JsonProperty("balance_exchange") BALANCE_EXCHANGE("balance_exchange");

    private final String value;

    Type6Enum(String value) {
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
     * Deserialize a string into a {@link Type6Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Type6Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Type6Enum fromValue(String value) {
        for (Type6Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

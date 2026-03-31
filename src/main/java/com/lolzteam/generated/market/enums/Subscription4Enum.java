package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>subscription</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Subscription4Enum {
    @JsonProperty("RobloxPremium1000") ROBLOXPREMIUM1000("RobloxPremium1000"),
    @JsonProperty("RobloxPremium100012Months") ROBLOXPREMIUM100012MONTHS("RobloxPremium100012Months"),
    @JsonProperty("RobloxPremium1000OneMonth") ROBLOXPREMIUM1000ONEMONTH("RobloxPremium1000OneMonth"),
    @JsonProperty("RobloxPremium2200") ROBLOXPREMIUM2200("RobloxPremium2200"),
    @JsonProperty("RobloxPremium2200OneMonth") ROBLOXPREMIUM2200ONEMONTH("RobloxPremium2200OneMonth"),
    @JsonProperty("RobloxPremium450") ROBLOXPREMIUM450("RobloxPremium450"),
    @JsonProperty("RobloxPremium450OneMonth") ROBLOXPREMIUM450ONEMONTH("RobloxPremium450OneMonth");

    private final String value;

    Subscription4Enum(String value) {
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
     * Deserialize a string into a {@link Subscription4Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Subscription4Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Subscription4Enum fromValue(String value) {
        for (Subscription4Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

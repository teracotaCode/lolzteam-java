package com.lolzteam.generated.market.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>service</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ServiceEnum {
    @JsonProperty("AdguardVPN") ADGUARDVPN("AdguardVPN"),
    @JsonProperty("PIAVPN") PIAVPN("PIAVPN"),
    @JsonProperty("cyberghostVPN") CYBERGHOSTVPN("cyberghostVPN"),
    @JsonProperty("hotspotShieldVPN") HOTSPOTSHIELDVPN("hotspotShieldVPN"),
    @JsonProperty("mullvadVPN") MULLVADVPN("mullvadVPN"),
    @JsonProperty("pureVPN") PUREVPN("pureVPN"),
    @JsonProperty("tunnelbearVPN") TUNNELBEARVPN("tunnelbearVPN"),
    @JsonProperty("ultraVPN") ULTRAVPN("ultraVPN"),
    @JsonProperty("vanishVPN") VANISHVPN("vanishVPN"),
    @JsonProperty("vyprVPN") VYPRVPN("vyprVPN"),
    @JsonProperty("windscribeVPN") WINDSCRIBEVPN("windscribeVPN"),
    @JsonProperty("planetVPN") PLANETVPN("planetVPN"),
    @JsonProperty("start") START("start"),
    @JsonProperty("ivi") IVI("ivi"),
    @JsonProperty("telegram") TELEGRAM("telegram"),
    @JsonProperty("discord") DISCORD("discord"),
    @JsonProperty("discord_trial") DISCORD_TRIAL("discord_trial");

    private final String value;

    ServiceEnum(String value) {
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
     * Deserialize a string into a {@link ServiceEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ServiceEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ServiceEnum fromValue(String value) {
        for (ServiceEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

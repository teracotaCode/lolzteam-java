package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>timezone</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum TimezoneEnum {
    @JsonProperty("Pacific/Midway") PACIFIC_MIDWAY("Pacific/Midway"),
    @JsonProperty("Pacific/Honolulu") PACIFIC_HONOLULU("Pacific/Honolulu"),
    @JsonProperty("Pacific/Marquesas") PACIFIC_MARQUESAS("Pacific/Marquesas"),
    @JsonProperty("America/Anchorage") AMERICA_ANCHORAGE("America/Anchorage"),
    @JsonProperty("America/Los_Angeles") AMERICA_LOS_ANGELES("America/Los_Angeles"),
    @JsonProperty("America/Santa_Isabel") AMERICA_SANTA_ISABEL("America/Santa_Isabel"),
    @JsonProperty("America/Tijuana") AMERICA_TIJUANA("America/Tijuana"),
    @JsonProperty("America/Denver") AMERICA_DENVER("America/Denver"),
    @JsonProperty("America/Chihuahua") AMERICA_CHIHUAHUA("America/Chihuahua"),
    @JsonProperty("America/Phoenix") AMERICA_PHOENIX("America/Phoenix"),
    @JsonProperty("America/Chicago") AMERICA_CHICAGO("America/Chicago"),
    @JsonProperty("America/Belize") AMERICA_BELIZE("America/Belize"),
    @JsonProperty("America/Mexico_City") AMERICA_MEXICO_CITY("America/Mexico_City"),
    @JsonProperty("Pacific/Easter") PACIFIC_EASTER("Pacific/Easter"),
    @JsonProperty("America/New_York") AMERICA_NEW_YORK("America/New_York"),
    @JsonProperty("America/Havana") AMERICA_HAVANA("America/Havana"),
    @JsonProperty("America/Bogota") AMERICA_BOGOTA("America/Bogota"),
    @JsonProperty("America/Caracas") AMERICA_CARACAS("America/Caracas"),
    @JsonProperty("America/Halifax") AMERICA_HALIFAX("America/Halifax"),
    @JsonProperty("America/Goose_Bay") AMERICA_GOOSE_BAY("America/Goose_Bay"),
    @JsonProperty("America/Asuncion") AMERICA_ASUNCION("America/Asuncion"),
    @JsonProperty("America/Santiago") AMERICA_SANTIAGO("America/Santiago"),
    @JsonProperty("America/Cuiaba") AMERICA_CUIABA("America/Cuiaba"),
    @JsonProperty("America/La_Paz") AMERICA_LA_PAZ("America/La_Paz"),
    @JsonProperty("America/St_Johns") AMERICA_ST_JOHNS("America/St_Johns"),
    @JsonProperty("America/Argentina/Buenos_Aires") AMERICA_ARGENTINA_BUENOS_AIRES("America/Argentina/Buenos_Aires"),
    @JsonProperty("America/Argentina/San_Luis") AMERICA_ARGENTINA_SAN_LUIS("America/Argentina/San_Luis"),
    @JsonProperty("America/Argentina/Mendoza") AMERICA_ARGENTINA_MENDOZA("America/Argentina/Mendoza"),
    @JsonProperty("Atlantic/Stanley") ATLANTIC_STANLEY("Atlantic/Stanley"),
    @JsonProperty("America/Godthab") AMERICA_GODTHAB("America/Godthab"),
    @JsonProperty("America/Montevideo") AMERICA_MONTEVIDEO("America/Montevideo"),
    @JsonProperty("America/Sao_Paulo") AMERICA_SAO_PAULO("America/Sao_Paulo"),
    @JsonProperty("America/Miquelon") AMERICA_MIQUELON("America/Miquelon"),
    @JsonProperty("America/Noronha") AMERICA_NORONHA("America/Noronha"),
    @JsonProperty("Atlantic/Cape_Verde") ATLANTIC_CAPE_VERDE("Atlantic/Cape_Verde"),
    @JsonProperty("Atlantic/Azores") ATLANTIC_AZORES("Atlantic/Azores"),
    @JsonProperty("Europe/London") EUROPE_LONDON("Europe/London"),
    @JsonProperty("Africa/Casablanca") AFRICA_CASABLANCA("Africa/Casablanca"),
    @JsonProperty("Atlantic/Reykjavik") ATLANTIC_REYKJAVIK("Atlantic/Reykjavik"),
    @JsonProperty("Europe/Amsterdam") EUROPE_AMSTERDAM("Europe/Amsterdam"),
    @JsonProperty("Africa/Algiers") AFRICA_ALGIERS("Africa/Algiers"),
    @JsonProperty("Africa/Windhoek") AFRICA_WINDHOEK("Africa/Windhoek"),
    @JsonProperty("Africa/Tunis") AFRICA_TUNIS("Africa/Tunis"),
    @JsonProperty("Europe/Athens") EUROPE_ATHENS("Europe/Athens"),
    @JsonProperty("Africa/Johannesburg") AFRICA_JOHANNESBURG("Africa/Johannesburg"),
    @JsonProperty("Europe/Kaliningrad") EUROPE_KALININGRAD("Europe/Kaliningrad"),
    @JsonProperty("Asia/Amman") ASIA_AMMAN("Asia/Amman"),
    @JsonProperty("Asia/Beirut") ASIA_BEIRUT("Asia/Beirut"),
    @JsonProperty("Africa/Cairo") AFRICA_CAIRO("Africa/Cairo"),
    @JsonProperty("Asia/Jerusalem") ASIA_JERUSALEM("Asia/Jerusalem"),
    @JsonProperty("Asia/Gaza") ASIA_GAZA("Asia/Gaza"),
    @JsonProperty("Asia/Damascus") ASIA_DAMASCUS("Asia/Damascus"),
    @JsonProperty("Europe/Moscow") EUROPE_MOSCOW("Europe/Moscow"),
    @JsonProperty("Europe/Minsk") EUROPE_MINSK("Europe/Minsk"),
    @JsonProperty("Africa/Nairobi") AFRICA_NAIROBI("Africa/Nairobi"),
    @JsonProperty("Asia/Tehran") ASIA_TEHRAN("Asia/Tehran"),
    @JsonProperty("Asia/Dubai") ASIA_DUBAI("Asia/Dubai"),
    @JsonProperty("Asia/Yerevan") ASIA_YEREVAN("Asia/Yerevan"),
    @JsonProperty("Asia/Baku") ASIA_BAKU("Asia/Baku"),
    @JsonProperty("Indian/Mauritius") INDIAN_MAURITIUS("Indian/Mauritius"),
    @JsonProperty("Asia/Kabul") ASIA_KABUL("Asia/Kabul"),
    @JsonProperty("Asia/Yekaterinburg") ASIA_YEKATERINBURG("Asia/Yekaterinburg"),
    @JsonProperty("Asia/Tashkent") ASIA_TASHKENT("Asia/Tashkent"),
    @JsonProperty("Asia/Kolkata") ASIA_KOLKATA("Asia/Kolkata"),
    @JsonProperty("Asia/Kathmandu") ASIA_KATHMANDU("Asia/Kathmandu"),
    @JsonProperty("Asia/Novosibirsk") ASIA_NOVOSIBIRSK("Asia/Novosibirsk"),
    @JsonProperty("Asia/Dhaka") ASIA_DHAKA("Asia/Dhaka"),
    @JsonProperty("Asia/Almaty") ASIA_ALMATY("Asia/Almaty"),
    @JsonProperty("Asia/Rangoon") ASIA_RANGOON("Asia/Rangoon"),
    @JsonProperty("Asia/Krasnoyarsk") ASIA_KRASNOYARSK("Asia/Krasnoyarsk"),
    @JsonProperty("Asia/Bangkok") ASIA_BANGKOK("Asia/Bangkok"),
    @JsonProperty("Asia/Irkutsk") ASIA_IRKUTSK("Asia/Irkutsk"),
    @JsonProperty("Asia/Hong_Kong") ASIA_HONG_KONG("Asia/Hong_Kong"),
    @JsonProperty("Asia/Singapore") ASIA_SINGAPORE("Asia/Singapore"),
    @JsonProperty("Australia/Perth") AUSTRALIA_PERTH("Australia/Perth"),
    @JsonProperty("Asia/Yakutsk") ASIA_YAKUTSK("Asia/Yakutsk"),
    @JsonProperty("Asia/Tokyo") ASIA_TOKYO("Asia/Tokyo"),
    @JsonProperty("Asia/Seoul") ASIA_SEOUL("Asia/Seoul"),
    @JsonProperty("Australia/Adelaide") AUSTRALIA_ADELAIDE("Australia/Adelaide"),
    @JsonProperty("Australia/Darwin") AUSTRALIA_DARWIN("Australia/Darwin"),
    @JsonProperty("Asia/Vladivostok") ASIA_VLADIVOSTOK("Asia/Vladivostok"),
    @JsonProperty("Asia/Magadan") ASIA_MAGADAN("Asia/Magadan"),
    @JsonProperty("Australia/Brisbane") AUSTRALIA_BRISBANE("Australia/Brisbane"),
    @JsonProperty("Australia/Sydney") AUSTRALIA_SYDNEY("Australia/Sydney"),
    @JsonProperty("Pacific/Noumea") PACIFIC_NOUMEA("Pacific/Noumea"),
    @JsonProperty("Pacific/Norfolk") PACIFIC_NORFOLK("Pacific/Norfolk"),
    @JsonProperty("Asia/Anadyr") ASIA_ANADYR("Asia/Anadyr"),
    @JsonProperty("Pacific/Auckland") PACIFIC_AUCKLAND("Pacific/Auckland"),
    @JsonProperty("Pacific/Fiji") PACIFIC_FIJI("Pacific/Fiji"),
    @JsonProperty("Pacific/Chatham") PACIFIC_CHATHAM("Pacific/Chatham"),
    @JsonProperty("Pacific/Tongatapu") PACIFIC_TONGATAPU("Pacific/Tongatapu"),
    @JsonProperty("Pacific/Apia") PACIFIC_APIA("Pacific/Apia"),
    @JsonProperty("Pacific/Kiritimati") PACIFIC_KIRITIMATI("Pacific/Kiritimati");

    private final String value;

    TimezoneEnum(String value) {
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
     * Deserialize a string into a {@link TimezoneEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link TimezoneEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static TimezoneEnum fromValue(String value) {
        for (TimezoneEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

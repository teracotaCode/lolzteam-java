package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>folder</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum FolderEnum {
    @JsonProperty("all") ALL("all"),
    @JsonProperty("unread") UNREAD("unread"),
    @JsonProperty("groups") GROUPS("groups"),
    @JsonProperty("market") MARKET("market"),
    @JsonProperty("market_replacements") MARKET_REPLACEMENTS("market_replacements"),
    @JsonProperty("staff") STAFF("staff"),
    @JsonProperty("giveaways") GIVEAWAYS("giveaways"),
    @JsonProperty("p2p") P2P("p2p");

    private final String value;

    FolderEnum(String value) {
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
     * Deserialize a string into a {@link FolderEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link FolderEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static FolderEnum fromValue(String value) {
        for (FolderEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

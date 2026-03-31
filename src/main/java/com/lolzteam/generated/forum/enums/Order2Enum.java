package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>order</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Order2Enum {
    @JsonProperty("post_date") POST_DATE("post_date"),
    @JsonProperty("last_post_date") LAST_POST_DATE("last_post_date"),
    @JsonProperty("reply_count") REPLY_COUNT("reply_count"),
    @JsonProperty("reply_count_asc") REPLY_COUNT_ASC("reply_count_asc"),
    @JsonProperty("first_post_likes") FIRST_POST_LIKES("first_post_likes"),
    @JsonProperty("vote_count") VOTE_COUNT("vote_count");

    private final String value;

    Order2Enum(String value) {
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
     * Deserialize a string into a {@link Order2Enum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link Order2Enum}, or {@code null} if unknown
     */
    @JsonCreator
    public static Order2Enum fromValue(String value) {
        for (Order2Enum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

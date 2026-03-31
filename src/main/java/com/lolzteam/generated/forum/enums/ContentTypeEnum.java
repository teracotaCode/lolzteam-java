package com.lolzteam.generated.forum.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for the <code>content_type</code> parameter.
 *
 * <p>Auto-generated from OpenAPI schema.</p>
 */
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum ContentTypeEnum {
    @JsonProperty("post") POST("post"),
    @JsonProperty("post_comment") POST_COMMENT("post_comment"),
    @JsonProperty("profile_post") PROFILE_POST("profile_post"),
    @JsonProperty("profile_post_comment") PROFILE_POST_COMMENT("profile_post_comment");

    private final String value;

    ContentTypeEnum(String value) {
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
     * Deserialize a string into a {@link ContentTypeEnum} constant.
     *
     * @param value the JSON string value
     * @return the matching {@link ContentTypeEnum}, or {@code null} if unknown
     */
    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
        for (ContentTypeEnum e : values()) {
            if (e.value.equals(value)) return e;
        }
        return null;
    }

    @Override
    public String toString() { return value; }
}

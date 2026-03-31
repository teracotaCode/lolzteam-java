package com.lolzteam.runtime.errors;

/**
 * Exception for authentication errors (401, 403).
 */
public class LolzteamAuthException extends LolzteamApiException {

    public LolzteamAuthException(String message, int statusCode, String responseBody) {
        super(message, statusCode, responseBody);
    }
}

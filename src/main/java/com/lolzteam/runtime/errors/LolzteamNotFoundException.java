package com.lolzteam.runtime.errors;

/**
 * Exception for not found (404) responses.
 */
public class LolzteamNotFoundException extends LolzteamApiException {

    public LolzteamNotFoundException(String message, String responseBody) {
        super(message, 404, responseBody);
    }
}

package com.lolzteam.runtime.errors;

/**
 * Exception for validation/bad request (400, 422) responses.
 */
public class LolzteamValidationException extends LolzteamApiException {

    public LolzteamValidationException(String message, int statusCode, String responseBody) {
        super(message, statusCode, responseBody);
    }
}

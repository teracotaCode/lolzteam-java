package com.lolzteam.runtime.errors;

/**
 * Base exception for all Lolzteam API errors.
 */
public class LolzteamException extends Exception {

    public LolzteamException(String message) {
        super(message);
    }

    public LolzteamException(String message, Throwable cause) {
        super(message, cause);
    }
}

package com.lolzteam.runtime.errors;

/**
 * Exception for network-level errors (connection failures, timeouts).
 */
public class LolzteamNetworkException extends LolzteamException {

    public LolzteamNetworkException(String message) {
        super(message);
    }

    public LolzteamNetworkException(String message, Throwable cause) {
        super(message, cause);
    }
}

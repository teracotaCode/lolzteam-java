package com.lolzteam.runtime.errors;

/**
 * Exception for HTTP API errors (non-2xx responses).
 */
public class LolzteamApiException extends LolzteamException {

    private final int statusCode;
    private final String responseBody;

    public LolzteamApiException(String message, int statusCode, String responseBody) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    public LolzteamApiException(String message, int statusCode, String responseBody, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
    }

    public int getStatusCode() { return statusCode; }
    public String getResponseBody() { return responseBody; }

    @Override
    public String toString() {
        return "LolzteamApiException{statusCode=" + statusCode +
                ", message='" + getMessage() + "'" +
                ", responseBody='" + (responseBody != null && responseBody.length() > 200
                    ? responseBody.substring(0, 200) + "..." : responseBody) + "'}";
    }
}

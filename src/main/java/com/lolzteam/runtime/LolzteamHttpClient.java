package com.lolzteam.runtime;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lolzteam.runtime.errors.*;
import okhttp3.*;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * OkHttp-based HTTP client with authentication, retry, rate limiting, and proxy support.
 */
public class LolzteamHttpClient implements HttpClientInterface {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final OkHttpClient httpClient;
    private final String accessToken;
    private final RetryHandler retryHandler;
    private final RateLimiter rateLimiter;

    private LolzteamHttpClient(Builder builder) {
        this.accessToken = builder.accessToken;
        this.retryHandler = new RetryHandler(builder.retryConfig);
        this.rateLimiter = new RateLimiter(builder.rateLimitConfig);

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder()
                .connectTimeout(builder.connectTimeout.toMillis(), TimeUnit.MILLISECONDS)
                .readTimeout(builder.readTimeout.toMillis(), TimeUnit.MILLISECONDS)
                .writeTimeout(builder.writeTimeout.toMillis(), TimeUnit.MILLISECONDS);

        if (builder.proxyConfig != null) {
            clientBuilder.proxy(builder.proxyConfig.toJavaProxy());

            if (builder.proxyConfig.hasAuth()) {
                final String proxyUser = builder.proxyConfig.getUsername();
                final String proxyPass = builder.proxyConfig.getPassword();

                clientBuilder.proxyAuthenticator((route, response) -> {
                    String credential = Credentials.basic(proxyUser, proxyPass != null ? proxyPass : "");
                    return response.request().newBuilder()
                            .header("Proxy-Authorization", credential)
                            .build();
                });

                // For SOCKS proxies, set Java system authenticator
                if (builder.proxyConfig.getType() == ProxyConfig.ProxyType.SOCKS4 ||
                        builder.proxyConfig.getType() == ProxyConfig.ProxyType.SOCKS5) {
                    Authenticator.setDefault(new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(proxyUser,
                                    (proxyPass != null ? proxyPass : "").toCharArray());
                        }
                    });
                }
            }
        }

        this.httpClient = clientBuilder.build();
    }

    @Override
    public String get(String url, Map<String, String> headers, Map<String, String> queryParams) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .get()
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String post(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .post(buildJsonBody(body))
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String put(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .put(buildJsonBody(body))
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String delete(String url, Map<String, String> headers, Map<String, String> queryParams) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .delete()
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String delete(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .delete(buildJsonBody(body))
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String patch(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .patch(buildJsonBody(body))
                    .build();
            return executeRequest(request);
        });
    }

    @Override
    public String postMultipart(String url, Map<String, String> headers, Map<String, String> queryParams,
                                Map<String, String> textParts, Map<String, byte[]> fileParts) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            MultipartBody.Builder multipartBuilder = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM);
            if (textParts != null) {
                for (Map.Entry<String, String> entry : textParts.entrySet()) {
                    if (entry.getValue() != null) {
                        multipartBuilder.addFormDataPart(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (fileParts != null) {
                for (Map.Entry<String, byte[]> entry : fileParts.entrySet()) {
                    if (entry.getValue() != null) {
                        multipartBuilder.addFormDataPart(
                                entry.getKey(),
                                entry.getKey(),
                                RequestBody.create(entry.getValue(), MediaType.parse("application/octet-stream"))
                        );
                    }
                }
            }
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .post(multipartBuilder.build())
                    .build();
            return executeRequest(request);
        });
    }

    private String executeWithRetry(java.util.concurrent.Callable<String> callable) throws Exception {
        return retryHandler.execute(callable);
    }

    private String executeRequest(Request request) throws Exception {
        try (Response response = httpClient.newCall(request).execute()) {
            String body = response.body() != null ? response.body().string() : "";
            int code = response.code();

            if (code >= 200 && code < 300) {
                return body;
            }

            // Map status codes to specific exceptions
            switch (code) {
                case 429 -> {
                    Duration retryAfter = parseRetryAfter(response.header("Retry-After"));
                    throw new LolzteamRateLimitException(
                            "Rate limit exceeded", body, retryAfter);
                }
                case 401, 403 -> throw new LolzteamAuthException(
                        "Authentication failed: " + code, code, body);
                case 404 -> throw new LolzteamNotFoundException(
                        "Resource not found", body);
                case 400, 422 -> throw new LolzteamValidationException(
                        "Validation error: " + code, code, body);
                default -> throw new LolzteamApiException(
                        "API error: " + code, code, body);
            }
        } catch (IOException e) {
            if (e instanceof java.net.SocketTimeoutException ||
                    e instanceof java.net.ConnectException ||
                    e instanceof java.net.UnknownHostException) {
                throw new LolzteamNetworkException("Network error: " + e.getMessage(), e);
            }
            throw new LolzteamNetworkException("IO error: " + e.getMessage(), e);
        }
    }

    private HttpUrl buildUrl(String url, Map<String, String> queryParams) {
        HttpUrl.Builder builder = HttpUrl.parse(url).newBuilder();
        if (queryParams != null) {
            for (Map.Entry<String, String> entry : queryParams.entrySet()) {
                if (entry.getValue() != null) {
                    builder.addQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        return builder.build();
    }

    private Headers buildHeaders(Map<String, String> headers) {
        Headers.Builder builder = new Headers.Builder();
        builder.add("Authorization", "Bearer " + accessToken);
        builder.add("Accept", "application/json");
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.add(entry.getKey(), entry.getValue());
            }
        }
        return builder.build();
    }

    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json; charset=utf-8");

    private RequestBody buildJsonBody(Map<String, Object> body) {
        if (body == null || body.isEmpty()) {
            return RequestBody.create("{}", JSON_MEDIA_TYPE);
        }
        // Strip null values
        body.values().removeIf(java.util.Objects::isNull);
        try {
            String json = OBJECT_MAPPER.writeValueAsString(body);
            return RequestBody.create(json, JSON_MEDIA_TYPE);
        } catch (Exception e) {
            return RequestBody.create("{}", JSON_MEDIA_TYPE);
        }
    }

    private RequestBody buildJsonBodyRaw(Object body) {
        if (body == null) {
            return RequestBody.create("null", JSON_MEDIA_TYPE);
        }
        try {
            String json = OBJECT_MAPPER.writeValueAsString(body);
            return RequestBody.create(json, JSON_MEDIA_TYPE);
        } catch (Exception e) {
            return RequestBody.create("null", JSON_MEDIA_TYPE);
        }
    }

    @Override
    public String postJsonRaw(String url, Map<String, String> headers, Map<String, String> queryParams, Object jsonBody) throws Exception {
        return executeWithRetry(() -> {
            rateLimiter.acquire();
            HttpUrl httpUrl = buildUrl(url, queryParams);
            Request request = new Request.Builder()
                    .url(httpUrl)
                    .headers(buildHeaders(headers))
                    .post(buildJsonBodyRaw(jsonBody))
                    .build();
            return executeRequest(request);
        });
    }

    private Duration parseRetryAfter(String header) {
        if (header == null || header.isEmpty()) {
            return Duration.ofSeconds(3);
        }
        // Try parsing as integer (seconds)
        try {
            return Duration.ofSeconds(Long.parseLong(header));
        } catch (NumberFormatException e) {
            // Try parsing as RFC 1123 date
            try {
                ZonedDateTime retryDate = ZonedDateTime.parse(header, DateTimeFormatter.RFC_1123_DATE_TIME);
                long delaySeconds = java.time.Instant.now().until(retryDate.toInstant(), ChronoUnit.SECONDS);
                return Duration.ofSeconds(Math.max(1, delaySeconds));
            } catch (Exception e2) {
                return Duration.ofSeconds(3);
            }
        }
    }

    /**
     * Get the underlying OkHttpClient instance.
     */
    public OkHttpClient getOkHttpClient() {
        return httpClient;
    }

    /**
     * Builder for LolzteamHttpClient.
     */
    public static class Builder {
        private String accessToken;
        private RetryConfig retryConfig = RetryConfig.DEFAULT;
        private RateLimitConfig rateLimitConfig = RateLimitConfig.DEFAULT;
        private ProxyConfig proxyConfig;
        private Duration connectTimeout = Duration.ofSeconds(30);
        private Duration readTimeout = Duration.ofSeconds(30);
        private Duration writeTimeout = Duration.ofSeconds(30);

        public Builder(String accessToken) {
            if (accessToken == null || accessToken.isEmpty()) {
                throw new IllegalArgumentException("accessToken cannot be null or empty");
            }
            this.accessToken = accessToken;
        }

        public Builder retryConfig(RetryConfig retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder rateLimitConfig(RateLimitConfig rateLimitConfig) {
            this.rateLimitConfig = rateLimitConfig;
            return this;
        }

        public Builder proxy(ProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public Builder connectTimeout(Duration timeout) {
            this.connectTimeout = timeout;
            return this;
        }

        public Builder readTimeout(Duration timeout) {
            this.readTimeout = timeout;
            return this;
        }

        public Builder writeTimeout(Duration timeout) {
            this.writeTimeout = timeout;
            return this;
        }

        public LolzteamHttpClient build() {
            return new LolzteamHttpClient(this);
        }
    }
}

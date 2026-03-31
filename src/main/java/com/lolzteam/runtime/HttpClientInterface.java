package com.lolzteam.runtime;

import java.util.List;
import java.util.Map;

/**
 * HTTP client interface for making API requests.
 * Implement this to use a custom HTTP client.
 */
public interface HttpClientInterface {

    /**
     * Perform an HTTP GET request.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String get(String url, Map<String, String> headers, Map<String, String> queryParams) throws Exception;

    /**
     * Perform an HTTP POST request.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param body        form body parameters (values can be String, Integer, Boolean, etc.)
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String post(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception;

    /**
     * Perform an HTTP POST request with a raw JSON body (e.g. JSON array).
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param jsonBody    raw object to serialize as JSON body (can be a List, Map, etc.)
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String postJsonRaw(String url, Map<String, String> headers, Map<String, String> queryParams, Object jsonBody) throws Exception;

    /**
     * Perform an HTTP PUT request.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param body        form body parameters
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String put(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception;

    /**
     * Perform an HTTP DELETE request.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String delete(String url, Map<String, String> headers, Map<String, String> queryParams) throws Exception;

    /**
     * Perform an HTTP DELETE request with a body.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param body        form body parameters
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String delete(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception;

    /**
     * Perform an HTTP PATCH request.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param body        form body parameters
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String patch(String url, Map<String, String> headers, Map<String, String> queryParams, Map<String, Object> body) throws Exception;

    /**
     * Perform an HTTP POST request with multipart/form-data encoding.
     *
     * @param url         the full URL
     * @param headers     additional headers
     * @param queryParams query parameters
     * @param textParts   text form fields
     * @param fileParts   binary form fields (field name to file bytes)
     * @return response body as string
     * @throws Exception on network or API errors
     */
    String postMultipart(String url, Map<String, String> headers, Map<String, String> queryParams,
                         Map<String, String> textParts, Map<String, byte[]> fileParts) throws Exception;
}

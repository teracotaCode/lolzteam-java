package com.lolzteam.runtime;

import java.net.InetSocketAddress;
import java.net.Proxy;

/**
 * Proxy configuration for the HTTP client.
 */
public class ProxyConfig {

    public enum ProxyType {
        HTTP,
        SOCKS4,
        SOCKS5
    }

    private final ProxyType type;
    private final String host;
    private final int port;
    private final String username;
    private final String password;

    private ProxyConfig(Builder builder) {
        this.type = builder.type;
        this.host = builder.host;
        this.port = builder.port;
        this.username = builder.username;
        this.password = builder.password;
    }

    public ProxyType getType() { return type; }
    public String getHost() { return host; }
    public int getPort() { return port; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean hasAuth() { return username != null && !username.isEmpty(); }

    /**
     * Convert to a java.net.Proxy instance.
     */
    public Proxy toJavaProxy() {
        Proxy.Type javaType = switch (type) {
            case HTTP -> Proxy.Type.HTTP;
            case SOCKS4, SOCKS5 -> Proxy.Type.SOCKS;
        };
        return new Proxy(javaType, new InetSocketAddress(host, port));
    }

    /**
     * Parse a proxy URL string like "http://user:pass@host:port" or "socks5://host:port".
     */
    public static ProxyConfig fromUrl(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("Proxy URL cannot be null or empty");
        }

        ProxyType proxyType;
        String remaining;
        if (url.startsWith("socks5://")) {
            proxyType = ProxyType.SOCKS5;
            remaining = url.substring("socks5://".length());
        } else if (url.startsWith("socks4://")) {
            proxyType = ProxyType.SOCKS4;
            remaining = url.substring("socks4://".length());
        } else if (url.startsWith("http://")) {
            proxyType = ProxyType.HTTP;
            remaining = url.substring("http://".length());
        } else if (url.startsWith("https://")) {
            proxyType = ProxyType.HTTP;
            remaining = url.substring("https://".length());
        } else {
            proxyType = ProxyType.HTTP;
            remaining = url;
        }

        String username = null;
        String password = null;
        String hostPort;

        int atIdx = remaining.lastIndexOf('@');
        if (atIdx >= 0) {
            String auth = remaining.substring(0, atIdx);
            hostPort = remaining.substring(atIdx + 1);
            int colonIdx = auth.indexOf(':');
            if (colonIdx >= 0) {
                username = auth.substring(0, colonIdx);
                password = auth.substring(colonIdx + 1);
            } else {
                username = auth;
            }
        } else {
            hostPort = remaining;
        }

        int colonIdx = hostPort.lastIndexOf(':');
        if (colonIdx < 0) {
            throw new IllegalArgumentException("Proxy URL must include port: " + url);
        }
        String host = hostPort.substring(0, colonIdx);
        int port = Integer.parseInt(hostPort.substring(colonIdx + 1));

        Builder builder = new Builder(proxyType, host, port);
        if (username != null) {
            builder.credentials(username, password);
        }
        return builder.build();
    }

    public static class Builder {
        private final ProxyType type;
        private final String host;
        private final int port;
        private String username;
        private String password;

        public Builder(ProxyType type, String host, int port) {
            this.type = type;
            this.host = host;
            this.port = port;
        }

        public Builder credentials(String username, String password) {
            this.username = username;
            this.password = password;
            return this;
        }

        public ProxyConfig build() {
            return new ProxyConfig(this);
        }
    }

    @Override
    public String toString() {
        String auth = hasAuth() ? username + ":****@" : "";
        return type.name().toLowerCase() + "://" + auth + host + ":" + port;
    }
}

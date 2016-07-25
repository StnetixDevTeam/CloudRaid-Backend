package com.stnetix.cloudraid.transport;

import com.stnetix.cloudraid.util.Crypto;

import java.net.URL;

/**
 * Settings by external clouds
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class ExternalCloudSettings {
    private URL cloudUrl;
    private SupportedClouds cloudType;
    private ExternalCloudAccessToken token;
    private ConnectionState state;
    private String login;
    private String password;

    public ExternalCloudSettings(URL cloudUrl, SupportedClouds cloudType, String login, String password) {
        this.cloudUrl = cloudUrl;
        this.cloudType = cloudType;
        this.login = login;
        this.password = Crypto.getSha256(password);
    }

    public URL getCloudUrl() {
        return cloudUrl;
    }

    public void setCloudUrl(URL cloudUrl) {
        this.cloudUrl = cloudUrl;
    }

    public SupportedClouds getCloudType() {
        return cloudType;
    }

    public void setCloudType(SupportedClouds cloudType) {
        this.cloudType = cloudType;
    }

    public ExternalCloudAccessToken getToken() {
        return token;
    }

    public void setToken(ExternalCloudAccessToken token) {
        this.token = token;
    }

    public ConnectionState getState() {
        return state;
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = Crypto.getSha256(password);
    }
}

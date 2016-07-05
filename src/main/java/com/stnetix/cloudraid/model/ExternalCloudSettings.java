package com.stnetix.cloudraid.model;

import java.net.URL;

/**
 * Settings by external clouds
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class ExternalCloudSettings {
    private URL cloudUrl;
    private SupportedClouds cloudType;
    private AccessToken token;
    private ConnectionState state;

    public ExternalCloudSettings(URL cloudUrl, SupportedClouds cloudType, AccessToken token) {
        this.cloudUrl = cloudUrl;
        this.cloudType = cloudType;
        this.token = token;
        this.state = ConnectionState.DISCONECTED;
    }

    public ExternalCloudSettings(URL cloudUrl, SupportedClouds cloudType) {
        this.cloudUrl = cloudUrl;
        this.cloudType = cloudType;
        this.state = ConnectionState.DISCONECTED;
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

    public AccessToken getToken() {
        return token;
    }

    public void setToken(AccessToken token) {
        this.token = token;
    }

    public ConnectionState getState() {
        return state;
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }
}

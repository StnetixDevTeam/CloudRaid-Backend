package com.stnetix.cloudraid.transport;

/**
 * oAuth2 Access Token
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class ExternalCloudAccessToken {
    private String accessToken;
    private int expiresIn;
    private String refreshToken;
    private String rawInfo;

    public ExternalCloudAccessToken(String accessToken, int expiresIn, String refreshToken, String rawInfo) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.rawInfo = rawInfo;
    }

    public ExternalCloudAccessToken(String accessToken, int expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public ExternalCloudAccessToken() {
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getRawInfo() {
        return rawInfo;
    }

    public void setRawInfo(String rawInfo) {
        this.rawInfo = rawInfo;
    }
}

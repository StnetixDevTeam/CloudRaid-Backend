package com.stnetix.cloudraid.transport;

import com.stnetix.cloudraid.core.CloudObject;

import java.net.URL;

/**
 * Abstract external cloud
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public abstract class ExternalCloud extends CloudObject {
    private ExternalCloudSettings settings;

    public ExternalCloud(URL cloudUrl, SupportedClouds cloudType) {
        super();
        settings = new ExternalCloudSettings(cloudUrl, cloudType, "", "");
    }

    public ExternalCloud(ExternalCloudSettings settings) {
        super();
        this.settings = settings;
    }

    /**
     * An abstract method for connect some external cloud
     *
     * @return true if connect success and false if get any error
     */

    abstract public boolean connect();

    /**
     * An abstract method which realization will be used only once during first connection for receiving an Access Token.
     * After the Access Token was received it is stored to field accessToken of class ExternalCloudAccessToken and can be
     * encrypted and saved at user's local storage.
     * Next time one just needs to pick up the Access Token from local storage or get it out of class ExternalCloudAccessToken
     * and use it for establishing connection by means of connect method.
     *
     * @return true if connect success and false if get any error
     */
    abstract public boolean firstConnectWithoutAcsToken();

    public ExternalCloudSettings getSettings() {
        return settings;
    }

    public void setSettings(ExternalCloudSettings settings) {
        this.settings = settings;
    }
}

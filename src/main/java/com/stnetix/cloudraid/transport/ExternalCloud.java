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
     * Abstract method for connect some external cloud
     *
     * @return true if connect success and false if get any error
     */
    abstract public boolean connect();

    public ExternalCloudSettings getSettings() {
        return settings;
    }

    public void setSettings(ExternalCloudSettings settings) {
        this.settings = settings;
    }
}

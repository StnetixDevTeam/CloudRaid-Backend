package com.stnetix.cloudraid.model;

import java.net.URL;

/**
 * Dropbox it is external cloud implementation
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class DropboxCloud extends ExternalCloud {

    public DropboxCloud(URL cloudUrl, SupportedClouds cloudType) {
        super(cloudUrl, cloudType);
    }

    @Override
    public boolean connect() {
        return false;
    }


}
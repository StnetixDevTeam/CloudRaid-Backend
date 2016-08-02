package com.stnetix.cloudraid.api;


/**
 * API for automatic authorization during the first connection to an external cloud.
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IExternalCloudAuthApi {
    boolean authUrlOpener();
    boolean tokenExtractor(String authorizationCode);
}

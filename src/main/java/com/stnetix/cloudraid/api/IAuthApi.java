package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.model.AccessToken;

/**
 * API for authentification REST client on external clouds
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IAuthApi extends ICloudRaidAPI {
    AccessToken getAuthToken();
    boolean logout(AccessToken token);
}

package com.stnetix.cloudraid.api;

/**
 * API for authentification client on CloudRaid service
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IAuthApi extends ICloudRaidAPI {
    CloudRaidAccessToken getAuthToken(); //FIXME: param?
    void logout(CloudRaidAccessToken token);
}

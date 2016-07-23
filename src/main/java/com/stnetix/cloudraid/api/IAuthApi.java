package com.stnetix.cloudraid.api;

/**
 * API for authentification client on CloudRaid service
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IAuthApi extends ICloudRaidAPI {
    AccessToken getAuthToken(); //FIXME: param?
    boolean logout(AccessToken token);
}

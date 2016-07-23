package com.stnetix.cloudraid.core;

import com.stnetix.cloudraid.transport.ExternalCloud;

import java.util.List;

/**
 * User on CloudRaid service
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class User extends CloudObject{
    private UserProfile profile;
    private List<ExternalCloud> clouds;

}

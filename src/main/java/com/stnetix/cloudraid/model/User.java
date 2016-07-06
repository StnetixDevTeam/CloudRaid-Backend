package com.stnetix.cloudraid.model;

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

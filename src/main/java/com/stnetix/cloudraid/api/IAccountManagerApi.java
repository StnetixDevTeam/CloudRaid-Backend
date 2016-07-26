package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.core.User;
import com.stnetix.cloudraid.core.UserProfile;

import java.util.List;
import java.util.UUID;

/**
 * API for manage user accounts on CloudRaid service
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IAccountManagerApi extends ICloudRaidAPI {
    UUID addUser(UserProfile profile);
    void changeUserPassword(User user, String passwordHash);
    void deleteUser(User user);
    void setUserProfile(User user, UserProfile profile);
    UserProfile getUserProfile(User user);
    List<User> findUser(UserProfile patternProfile);
}

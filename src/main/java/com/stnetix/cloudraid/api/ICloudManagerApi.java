package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.transport.ExternalCloudSettings;
import com.stnetix.cloudraid.transport.ExternalCloud;
import com.stnetix.cloudraid.core.User;

import java.util.List;
import java.util.UUID;

/**
 * API for manage external clouds by user on CloudRaid service
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface ICloudManagerApi extends ICloudRaidAPI {
    String addExternalCloud(User user, ExternalCloud cloud);
    void delExternalCloud(User user, ExternalCloud cloud);
    List<ExternalCloud> getExternalCloudsLists(User user);
    ExternalCloudSettings getSettingsByExternalCloud(User user, ExternalCloud cloud);
    void setSettingsByExternalCloud(User user, ExternalCloud cloud, ExternalCloudSettings settings);
}

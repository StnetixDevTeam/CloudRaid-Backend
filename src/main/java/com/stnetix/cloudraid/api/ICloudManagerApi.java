package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.model.ExternalCloudSettings;
import com.stnetix.cloudraid.model.ExternalCloud;

import java.util.List;

/**
 * API for manage external clouds
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface ICloudManagerApi extends ICloudRaidAPI {
    String addExternalCloud(ExternalCloud cloud);
    boolean delExternalCloud(ExternalCloud cloud);
    List<ExternalCloud> getExternalCloudsLists();
    List<ExternalCloudSettings<String, String>> getSettingsByExternalCloud(ExternalCloud cloud);
    boolean setSettingsByExternalCloud(ExternalCloud cloud, List<ExternalCloudSettings<String,String>> settings);
}

package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.core.CloudObject;

import java.util.UUID;

/**
 * A tag interface to indicate that a class is a CloudRaidAPI.
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface ICloudRaidAPI {
    int version = 1;

    CloudObject getObjectByUuid(UUID uuid);
    void  setObjectByUuid(CloudObject object);
}

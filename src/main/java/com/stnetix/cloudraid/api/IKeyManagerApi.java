package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.secure.KeyMetaInfo;
import com.stnetix.cloudraid.secure.KeyObject;

/**
 * API for management certificates for decrypt chunks
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IKeyManagerApi extends ICloudRaidAPI {
    KeyMetaInfo getKeyMetaInfo(KeyObject key);
    void setKeyMetaInfo(KeyObject key, KeyMetaInfo meta);
    void deleteKeyMetaInfo(KeyObject key);
}

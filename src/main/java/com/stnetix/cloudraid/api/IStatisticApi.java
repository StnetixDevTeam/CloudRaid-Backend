package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.model.CloudObject;
import com.stnetix.cloudraid.model.StatByObject;

/**
 * API for collect statistic info
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IStatisticApi {
    StatByObject getStatByObject(CloudObject object);
    boolean setStatByObject(CloudObject object, StatByObject stat);
}

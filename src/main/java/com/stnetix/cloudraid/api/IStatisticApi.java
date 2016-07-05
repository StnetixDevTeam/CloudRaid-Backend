package com.stnetix.cloudraid.api;

import com.codahale.metrics.MetricSet;
import com.stnetix.cloudraid.model.CloudObject;

/**
 * API for collect statistic info
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IStatisticApi {
    MetricSet getStatByObject(CloudObject object);
    boolean setStatByObject(CloudObject object, MetricSet metrics);
}

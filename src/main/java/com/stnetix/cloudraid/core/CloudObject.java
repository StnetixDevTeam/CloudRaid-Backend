package com.stnetix.cloudraid.core;

import com.codahale.metrics.MetricSet;

import java.io.Serializable;
import java.util.UUID;

/**
 * Base class for any cloud objects
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class CloudObject implements Serializable{
    private UUID uuid;
    private MetricSet metrics;

    public CloudObject() {
        this.uuid = UUID.fromString("0");
    }

    public CloudObject(UUID uuid) {
        this.uuid = uuid;
    }

    public CloudObject(UUID uuid, MetricSet metrics) {
        this.uuid = uuid;
        this.metrics = metrics;
    }

    public UUID getUuid() {
        return uuid;
    }

    public MetricSet getMetrics() {
        return metrics;
    }

    public void setMetrics(MetricSet metrics) {
        this.metrics = metrics;
    }
}

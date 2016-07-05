package com.stnetix.cloudraid.model;

import com.codahale.metrics.MetricSet;

import java.util.UUID;

/**
 * Abstract base class for any cloud objects
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public abstract class CloudObject {
    private UUID uuid;
    private MetricSet metrics;

    public CloudObject() {
        this.uuid = UUID.randomUUID();
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

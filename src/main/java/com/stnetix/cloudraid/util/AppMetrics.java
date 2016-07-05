package com.stnetix.cloudraid.util;

import com.codahale.metrics.MetricRegistry;

/**
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class AppMetrics {
    private final MetricRegistry metrics = new MetricRegistry();
    private static AppMetrics instance;

    private AppMetrics() {
    }

    public static AppMetrics getInstance() {
        if (instance == null){
            synchronized (AppMetrics.class) {
                if (instance == null){
                    instance = new AppMetrics();
                }
            }
        }
        return instance;
    }

    public void
}

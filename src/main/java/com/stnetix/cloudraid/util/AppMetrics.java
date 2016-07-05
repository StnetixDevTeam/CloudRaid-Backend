package com.stnetix.cloudraid.util;

import com.codahale.metrics.*;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/**
 * Registry all app metrics
 * Singleton
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class AppMetrics {
    private final MetricRegistry metricsRegistry = new MetricRegistry();
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

    public void registryAllMetrics(MetricSet metrics){
        metricsRegistry.registerAll(metrics);
    }

    public static String name(String name, String... names) {
        return MetricRegistry.name(name, names);
    }

    public Timer timer(String name) {
        return metricsRegistry.timer(name);
    }

    public SortedMap<String, Counter> getCounters() {
        return metricsRegistry.getCounters();
    }

    public SortedMap<String, Meter> getMeters(MetricFilter filter) {
        return metricsRegistry.getMeters(filter);
    }

    public Map<String, Metric> getMetrics() {
        return metricsRegistry.getMetrics();
    }

    public <T extends Metric> T register(String name, T metric) throws IllegalArgumentException {
        return metricsRegistry.register(name, metric);
    }

    public Counter counter(String name) {
        return metricsRegistry.counter(name);
    }

    public Meter meter(String name) {
        return metricsRegistry.meter(name);
    }

    public SortedSet<String> getNames() {
        return metricsRegistry.getNames();
    }

    public Histogram histogram(String name) {
        return metricsRegistry.histogram(name);
    }

    public SortedMap<String, Histogram> getHistograms() {
        return metricsRegistry.getHistograms();
    }

    public SortedMap<String, Timer> getTimers(MetricFilter filter) {
        return metricsRegistry.getTimers(filter);
    }

    public void registerAll(MetricSet metrics) throws IllegalArgumentException {
        metricsRegistry.registerAll(metrics);
    }

    public boolean remove(String name) {
        return metricsRegistry.remove(name);
    }

    public void removeMatching(MetricFilter filter) {
        metricsRegistry.removeMatching(filter);
    }

    public SortedMap<String, Counter> getCounters(MetricFilter filter) {
        return metricsRegistry.getCounters(filter);
    }

    public SortedMap<String, Gauge> getGauges(MetricFilter filter) {
        return metricsRegistry.getGauges(filter);
    }

    public SortedMap<String, Meter> getMeters() {
        return metricsRegistry.getMeters();
    }

    public void removeListener(MetricRegistryListener listener) {
        metricsRegistry.removeListener(listener);
    }

    public SortedMap<String, Histogram> getHistograms(MetricFilter filter) {
        return metricsRegistry.getHistograms(filter);
    }

    public void addListener(MetricRegistryListener listener) {
        metricsRegistry.addListener(listener);
    }

    public SortedMap<String, Gauge> getGauges() {
        return metricsRegistry.getGauges();
    }

    public static String name(Class<?> klass, String... names) {
        return MetricRegistry.name(klass, names);
    }

    public SortedMap<String, Timer> getTimers() {
        return metricsRegistry.getTimers();
    }
}

package com.stnetix.cloudraid.model;

/**
 * Statistics parameters by cloud objects
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class StatByObject<V> {
    private String paramName;
    private V value;

    public StatByObject(String paramName, V value) {
        this.paramName = paramName;
        this.value = value;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

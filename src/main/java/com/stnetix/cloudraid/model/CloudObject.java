package com.stnetix.cloudraid.model;

import java.util.UUID;

/**
 * Abstract cloud object
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public abstract class CloudObject {
    private UUID uuid;
    //private List<StatByObject<>> statistics;?


    public CloudObject() {
        this.uuid = UUID.randomUUID();
    }

    public CloudObject(UUID uuid) {
        this.uuid = uuid;
    }
}

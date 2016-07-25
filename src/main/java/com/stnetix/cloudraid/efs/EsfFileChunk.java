package com.stnetix.cloudraid.efs;

import com.stnetix.cloudraid.core.CloudObject;
import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.UUID;

/**
 * Chunk of ESF file
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class EsfFileChunk extends CloudObject implements Comparable<EsfFileChunk>{
    private List<UUID> stroragesUuid;
    private int chunksNumber;
    private int chunksStart;
    private int chunksLength;

    public EsfFileChunk(int chunksLength, int chunksStart, int chunksNumber, List<UUID> stroragesUuid) {
        this.chunksLength = chunksLength;
        this.chunksStart = chunksStart;
        this.chunksNumber = chunksNumber;
        this.stroragesUuid = stroragesUuid;
    }

    public EsfFileChunk() {
    }

    @Override
    public int compareTo(EsfFileChunk o) {
        return this.chunksNumber - o.chunksNumber;
    }
}

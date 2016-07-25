package com.stnetix.cloudraid.efs;

import com.stnetix.cloudraid.core.CloudObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * EFS File - this class container for file meta data
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class EfsFile extends File {
    private CloudObject cloudObject;
    private boolean isArchives;
    private boolean isHidden;
    private boolean isReadOnly;
    private boolean isExecutable;
    private long createdTime;
    private long modifiedTime;
    private long openedTime;
    private MimeType mimeType = MimeType.undefined;
    private long totalSize;
    /**
     * MD5 or SHA-1 hash sum of file
     */
    private String fileHashSum;
    /**
     * List chunks of file.
     */
    private List<EsfFileChunk> chunks = new ArrayList<>();

    /**
     * Create new File in CloudRaid service
     * @param pathname
     */
    public EfsFile(String pathname) {
        super(pathname);
        this.cloudObject = new CloudObject();
    }

    /**
     * Create new File in CloudRaid service with meta data
     *
     * @param pathname
     * @param isArchives
     * @param isHidden
     * @param isReadOnly
     * @param isExecutable
     * @param createdTime
     * @param modifiedTime
     * @param openedTime
     * @param mimeType
     * @param totalSize
     */
    public EfsFile(String pathname, boolean isArchives, boolean isHidden, boolean isReadOnly, boolean isExecutable, long createdTime, long modifiedTime, long openedTime, MimeType mimeType, long totalSize) {
        super(pathname);
        this.cloudObject = new CloudObject();
        this.isArchives = isArchives;
        this.isHidden = isHidden;
        this.isReadOnly = isReadOnly;
        this.isExecutable = isExecutable;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
        this.openedTime = openedTime;
        this.mimeType = mimeType;
        this.totalSize = totalSize;
    }

    /**
     * Create exists file in CloudRaid service
     * @param uuid
     * @param pathname
     */
    public EfsFile(UUID uuid, String pathname) {
        super(pathname);
        this.cloudObject = new CloudObject(uuid);
    }

    /**
     * Create exists file in CloudRaid service with meta data
     *
     * @param uuid
     * @param pathname
     * @param isArchives
     * @param isHidden
     * @param isReadOnly
     * @param isExecutable
     * @param createdTime
     * @param modifiedTime
     * @param openedTime
     * @param mimeType
     * @param totalSize
     */
    public EfsFile(UUID uuid, String pathname, boolean isArchives, boolean isHidden, boolean isReadOnly, boolean isExecutable, long createdTime, long modifiedTime, long openedTime, MimeType mimeType, long totalSize) {
        super(pathname);
        this.cloudObject = new CloudObject(uuid);
        this.isArchives = isArchives;
        this.isHidden = isHidden;
        this.isReadOnly = isReadOnly;
        this.isExecutable = isExecutable;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
        this.openedTime = openedTime;
        this.mimeType = mimeType;
        this.totalSize = totalSize;
    }

    public void calculateHash(){
        //FIXME: SHA-1 check sum
    }

    public void calculateChunks(){
        //FIXME: create sorted chunks collection
    }

    public void lock(){
        //FIXME: lock file on file system
    }

    public void unlock(){
        //FIXME: unlock file on file system
    }

    public boolean isArchives() {
        return isArchives;
    }

    public void setIsArchives(boolean isArchives) {
        this.isArchives = isArchives;
    }

    @Override
    public boolean isHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }

    public void setIsReadOnly(boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    public boolean isExecutable() {
        return isExecutable;
    }

    public void setIsExecutable(boolean isExecutable) {
        this.isExecutable = isExecutable;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public long getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public long getOpenedTime() {
        return openedTime;
    }

    public void setOpenedTime(long openedTime) {
        this.openedTime = openedTime;
    }

    public MimeType getMimeType() {
        return mimeType;
    }

    public void setMimeType(MimeType mimeType) {
        this.mimeType = mimeType;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public String getFileHashSum() {
        return fileHashSum;
    }

    public void setFileHashSum(String fileHashSum) {
        this.fileHashSum = fileHashSum;
    }

    public List<EsfFileChunk> getChunks() {
        return chunks;
    }

    public void setChunks(List<EsfFileChunk> chunks) {
        this.chunks = chunks;
    }
}

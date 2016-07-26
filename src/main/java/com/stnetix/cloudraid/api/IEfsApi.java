package com.stnetix.cloudraid.api;

import com.stnetix.cloudraid.api.ICloudRaidAPI;
import com.stnetix.cloudraid.efs.*;

import java.util.List;
import java.util.UUID;

/**
 * API for usage EFS
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public interface IEfsApi extends ICloudRaidAPI {
    EfsSnapshot getEfsSnapshot();
    EfsDiff getEfsDiff(EfsSnapshot snapshot);
    UUID addEfsFolder(EfsFolder folder);
    void deleteEfsFolder(EfsFolder folder);
    List<EfsFile> listEfsFolder(EfsFolder folder);
    UUID copyEfsFolder(EfsFolder src, EfsFolder dst);
    UUID moveEfsFolder(EfsFolder src, EfsFolder dst);
    UUID addEfsFile(EfsFile file);
    void deleteEfsFile(EfsFile file);
    UUID copyEfsFile(EfsFile src, EfsFile dst);
    UUID moveEfsFile(EfsFile src, EfsFile dst);
    EfsFileProperties getEfsFileProperties(EfsFile file);
    void setEfsFileProperties(EfsFile file, EfsFileProperties prop);
}

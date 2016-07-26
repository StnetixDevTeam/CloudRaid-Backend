package com.stnetix.cloudraid.efs;

import java.util.UUID;

/**
 * Folder on EFS
 *
 * @author Cloudraid Dev Team (cloudraid.stnetix.com)
 */
public class EfsFolder extends EfsFile {
    //FIXME: write implementation

    public EfsFolder(String pathname) {
        super(pathname);
    }

    public EfsFolder(UUID uuid, String pathname) {
        super(uuid, pathname);
    }
}

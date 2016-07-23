package com.stnetix.cloudraid.efs;

import java.io.File;
import java.net.URI;

/**
 * Created by Vladislav Gasanov on 23.07.2016.
 */
public abstract class EfsFile extends File {
    public EfsFile(String pathname) {
        super(pathname);
    }

    public EfsFile(String parent, String child) {
        super(parent, child);
    }

    public EfsFile(File parent, String child) {
        super(parent, child);
    }

    public EfsFile(URI uri) {
        super(uri);
    }
}

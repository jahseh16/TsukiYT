package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class LogFileManager {
    private static final String LOGFILE_NAME = "userlog";
    static final int MAX_LOG_SIZE = 65536;
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore((1) null);
    private FileLogStore currentLog;
    private final FileStore fileStore;

    public LogFileManager(FileStore fileStore) {
        this.fileStore = fileStore;
        this.currentLog = NOOP_LOG_STORE;
    }

    private File getWorkingFileForSession(String str) {
        return this.fileStore.getSessionFile(str, LOGFILE_NAME);
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    @Nullable
    public String getLogString() {
        return this.currentLog.getLogAsString();
    }

    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str == null) {
            return;
        }
        setLogFile(getWorkingFileForSession(str), MAX_LOG_SIZE);
    }

    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    public LogFileManager(FileStore fileStore, String str) {
        this(fileStore);
        setCurrentSession(str);
    }
}

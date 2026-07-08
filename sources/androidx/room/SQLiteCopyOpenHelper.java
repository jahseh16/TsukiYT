package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import gq.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import l.a;
import qj.c5;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCopyOpenHelper implements c5, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final c5 delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i, c5 delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = delegate;
    }

    private final void copyDatabaseFile(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e4) {
                throw new IOException("inputStreamCallable exception on call", e4);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        FileUtil.copy(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(intermediateFile, z);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final c5 createFrameworkOpenHelper(File file) {
        try {
            final int version = DBUtil.readVersion(file);
            a aVar = new a();
            c5.n3.y yVarZn = c5.n3.f7466a.y(this.context).zn(file.getAbsolutePath());
            final int iCoerceAtLeast = RangesKt.coerceAtLeast(version, 1);
            return aVar.create(yVarZn.n3(new c5.y(iCoerceAtLeast) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // qj.c5.y
                public void onCreate(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                }

                @Override // qj.c5.y
                public void onOpen(s db) {
                    Intrinsics.checkNotNullParameter(db, "db");
                    int i = version;
                    if (i < 1) {
                        db.setVersion(i);
                    }
                }

                @Override // qj.c5.y
                public void onUpgrade(s db, int i, int i5) {
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }).y());
        } catch (IOException e4) {
            throw new RuntimeException("Malformed database file, unable to read version.", e4);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z) {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        c5 c5VarCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            s writableDatabase = z ? c5VarCreateFrameworkOpenHelper.getWritableDatabase() : c5VarCreateFrameworkOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            Intrinsics.checkNotNull(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(c5VarCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        boolean z5 = databaseConfiguration.multiInstanceInvalidation;
        File filesDir = this.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        y yVar = new y(databaseName, filesDir, z5);
        try {
            y.zn(yVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    copyDatabaseFile(databaseFile, z);
                    yVar.gv();
                    return;
                } catch (IOException e4) {
                    throw new RuntimeException("Unable to copy database file.", e4);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int version = DBUtil.readVersion(databaseFile);
                if (version == this.databaseVersion) {
                    yVar.gv();
                    return;
                }
                DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                    yVar.gv();
                    return;
                }
                if (this.context.deleteDatabase(databaseName)) {
                    try {
                        copyDatabaseFile(databaseFile, z);
                    } catch (IOException e5) {
                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e5);
                    }
                } else {
                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                yVar.gv();
                return;
            } catch (IOException e6) {
                Log.w(Room.LOG_TAG, "Unable to read database version.", e6);
                yVar.gv();
                return;
            }
        } catch (Throwable th) {
            yVar.gv();
            throw th;
        }
        yVar.gv();
        throw th;
    }

    @Override // qj.c5, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // qj.c5
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public c5 getDelegate() {
        return this.delegate;
    }

    @Override // qj.c5
    public s getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // qj.c5
    public s getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // qj.c5
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}

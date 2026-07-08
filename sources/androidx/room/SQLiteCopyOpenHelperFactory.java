package androidx.room;

import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import qj.c5;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteCopyOpenHelperFactory implements c5.zn {
    private final String mCopyFromAssetPath;
    private final File mCopyFromFile;
    private final Callable<InputStream> mCopyFromInputStream;
    private final c5.zn mDelegate;

    public SQLiteCopyOpenHelperFactory(String str, File file, Callable<InputStream> callable, c5.zn mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.mDelegate = mDelegate;
    }

    @Override // qj.c5.zn
    public c5 create(c5.n3 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new SQLiteCopyOpenHelper(configuration.y, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.zn.version, this.mDelegate.create(configuration));
    }
}

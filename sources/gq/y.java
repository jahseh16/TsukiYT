package gq;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public FileChannel f5244gv;
    public final File n3;
    public final boolean y;

    @SuppressLint({"SyntheticAccessor"})
    public final Lock zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0099y f5243v = new C0099y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Lock> f5242a = new HashMap();

    /* JADX INFO: renamed from: gq.y$y, reason: collision with other inner class name */
    public static final class C0099y {
        public /* synthetic */ C0099y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Lock n3(String str) {
            Lock lock;
            synchronized (y.f5242a) {
                try {
                    Map map = y.f5242a;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public C0099y() {
        }
    }

    public y(String name, File lockDir, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.y = z;
        File file = new File(lockDir, name + ".lck");
        this.n3 = file;
        C0099y c0099y = f5243v;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        this.zn = c0099y.n3(absolutePath);
    }

    public static /* synthetic */ void zn(y yVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = yVar.y;
        }
        yVar.n3(z);
    }

    public final void gv() {
        try {
            FileChannel fileChannel = this.f5244gv;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.zn.unlock();
    }

    public final void n3(boolean z) {
        this.zn.lock();
        if (z) {
            try {
                File parentFile = this.n3.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.n3).getChannel();
                channel.lock();
                this.f5244gv = channel;
            } catch (IOException e4) {
                this.f5244gv = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e4);
            }
        }
    }
}

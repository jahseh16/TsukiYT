package androidx.work;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.Reader;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import yk.i4;
import yk.i9;
import yk.mt;
import yk.s;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f1135a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final int f1136c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1137f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f1138fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public final i9 f1139gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f1140i9;

    @NonNull
    public final Executor n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1141s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final mt f1142v;

    @NonNull
    public final Executor y;

    @NonNull
    public final i4 zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f1143a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public Executor f1146gv;
        public i4 n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public mt f1149v;
        public Executor y;
        public i9 zn;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f1145fb = 4;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1148s = 0;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f1144c5 = Reader.READ_DONE;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public int f1147i9 = 20;

        @NonNull
        public y y() {
            return new y(this);
        }
    }

    /* JADX INFO: renamed from: androidx.work.y$y, reason: collision with other inner class name */
    public class ThreadFactoryC0030y implements ThreadFactory {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f1151v;
        public final AtomicInteger y = new AtomicInteger(0);

        public ThreadFactoryC0030y(boolean z) {
            this.f1151v = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f1151v ? "WM.task-" : "androidx.work-") + this.y.incrementAndGet());
        }
    }

    public interface zn {
        @NonNull
        y y();
    }

    public y(@NonNull n3 n3Var) {
        Executor executor = n3Var.y;
        if (executor == null) {
            this.y = y(false);
        } else {
            this.y = executor;
        }
        Executor executor2 = n3Var.f1146gv;
        if (executor2 == null) {
            this.f1137f = true;
            this.n3 = y(true);
        } else {
            this.f1137f = false;
            this.n3 = executor2;
        }
        i4 i4Var = n3Var.n3;
        if (i4Var == null) {
            this.zn = i4.zn();
        } else {
            this.zn = i4Var;
        }
        i9 i9Var = n3Var.zn;
        if (i9Var == null) {
            this.f1139gv = i9.zn();
        } else {
            this.f1139gv = i9Var;
        }
        mt mtVar = n3Var.f1149v;
        if (mtVar == null) {
            this.f1142v = new i2.y();
        } else {
            this.f1142v = mtVar;
        }
        this.f1138fb = n3Var.f1145fb;
        this.f1141s = n3Var.f1148s;
        this.f1136c5 = n3Var.f1144c5;
        this.f1140i9 = n3Var.f1147i9;
        this.f1135a = n3Var.f1143a;
    }

    @NonNull
    public i9 a() {
        return this.f1139gv;
    }

    public int c5() {
        return this.f1141s;
    }

    @NonNull
    public mt f() {
        return this.f1142v;
    }

    public int fb() {
        return this.f1136c5;
    }

    @Nullable
    public s gv() {
        return null;
    }

    public int i9() {
        return this.f1138fb;
    }

    @NonNull
    public final ThreadFactory n3(boolean z) {
        return new ThreadFactoryC0030y(z);
    }

    public int s() {
        return Build.VERSION.SDK_INT == 23 ? this.f1140i9 / 2 : this.f1140i9;
    }

    @NonNull
    public Executor t() {
        return this.n3;
    }

    @NonNull
    public i4 tl() {
        return this.zn;
    }

    @NonNull
    public Executor v() {
        return this.y;
    }

    @NonNull
    public final Executor y(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), n3(z));
    }

    @Nullable
    public String zn() {
        return this.f1135a;
    }
}

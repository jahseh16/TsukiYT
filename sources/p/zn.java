package p;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class zn extends v {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public static final Executor f7283gv = new Executor() { // from class: p.y
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            zn.c5(runnable);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public static final Executor f7284v = new Executor() { // from class: p.n3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            zn.i9(runnable);
        }
    };
    public static volatile zn zn;

    @NonNull
    public final v n3;

    @NonNull
    public v y;

    public zn() {
        gv gvVar = new gv();
        this.n3 = gvVar;
        this.y = gvVar;
    }

    public static /* synthetic */ void c5(Runnable runnable) {
        s().gv(runnable);
    }

    @NonNull
    public static Executor fb() {
        return f7284v;
    }

    public static /* synthetic */ void i9(Runnable runnable) {
        s().y(runnable);
    }

    @NonNull
    public static zn s() {
        if (zn != null) {
            return zn;
        }
        synchronized (zn.class) {
            try {
                if (zn == null) {
                    zn = new zn();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zn;
    }

    @Override // p.v
    public void gv(@NonNull Runnable runnable) {
        this.y.gv(runnable);
    }

    @Override // p.v
    public void y(@NonNull Runnable runnable) {
        this.y.y(runnable);
    }

    @Override // p.v
    public boolean zn() {
        return this.y.zn();
    }
}

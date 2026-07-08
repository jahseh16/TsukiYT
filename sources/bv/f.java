package bv;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile Runnable f1337s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f1338v;
    public final ArrayDeque<y> y = new ArrayDeque<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Object f1336fb = new Object();

    public static class y implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Runnable f1339v;
        public final f y;

        public y(@NonNull f fVar, @NonNull Runnable runnable) {
            this.y = fVar;
            this.f1339v = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1339v.run();
            } finally {
                this.y.zn();
            }
        }
    }

    public f(@NonNull Executor executor) {
        this.f1338v = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.f1336fb) {
            try {
                this.y.add(new y(this, runnable));
                if (this.f1337s == null) {
                    zn();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n3() {
        boolean z;
        synchronized (this.f1336fb) {
            z = !this.y.isEmpty();
        }
        return z;
    }

    public void zn() {
        synchronized (this.f1336fb) {
            try {
                y yVarPoll = this.y.poll();
                this.f1337s = yVarPoll;
                if (yVarPoll != null) {
                    this.f1338v.execute(this.f1337s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package ft;

import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Object f4835a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4837f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public Looper f4838fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final xq f4839gv;
    public final y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4842t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f4843tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4844v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f4845wz;
    public final n3 y;
    public final v0.v zn;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f4836c5 = -9223372036854775807L;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f4840i9 = true;

    public interface n3 {
        void f(int i, @Nullable Object obj) throws p;
    }

    public interface y {
        void zn(h hVar);
    }

    public h(y yVar, n3 n3Var, xq xqVar, int i, v0.v vVar, Looper looper) {
        this.n3 = yVar;
        this.y = n3Var;
        this.f4839gv = xqVar;
        this.f4838fb = looper;
        this.zn = vVar;
        this.f4841s = i;
    }

    public long a() {
        return this.f4836c5;
    }

    public int c5() {
        return this.f4844v;
    }

    public synchronized void f(boolean z) {
        this.f4842t = z | this.f4842t;
        this.f4843tl = true;
        notifyAll();
    }

    public n3 fb() {
        return this.y;
    }

    public int gv() {
        return this.f4841s;
    }

    public synchronized boolean i9() {
        return this.f4845wz;
    }

    public boolean n3() {
        return this.f4840i9;
    }

    public xq s() {
        return this.f4839gv;
    }

    public h t() {
        v0.y.fb(!this.f4837f);
        if (this.f4836c5 == -9223372036854775807L) {
            v0.y.y(this.f4840i9);
        }
        this.f4837f = true;
        this.n3.zn(this);
        return this;
    }

    public h tl(@Nullable Object obj) {
        v0.y.fb(!this.f4837f);
        this.f4835a = obj;
        return this;
    }

    @Nullable
    public Object v() {
        return this.f4835a;
    }

    public h wz(int i) {
        v0.y.fb(!this.f4837f);
        this.f4844v = i;
        return this;
    }

    public synchronized boolean y(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            v0.y.fb(this.f4837f);
            v0.y.fb(this.f4838fb.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.zn.elapsedRealtime() + j;
            while (true) {
                z = this.f4843tl;
                if (z || j <= 0) {
                    break;
                }
                this.zn.zn();
                wait(j);
                j = jElapsedRealtime - this.zn.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4842t;
    }

    public Looper zn() {
        return this.f4838fb;
    }
}

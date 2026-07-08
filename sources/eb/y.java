package eb;

import android.os.SystemClock;
import java.util.ArrayList;
import x4.s;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final ThreadLocal<y> f3325fb = new ThreadLocal<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public zn f3327gv;
    public final s<n3, Long> y = new s<>();
    public final ArrayList<n3> n3 = new ArrayList<>();
    public final y zn = new y(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f3328v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3326a = false;

    public interface n3 {
        boolean y(long j);
    }

    public static y gv() {
        ThreadLocal<y> threadLocal = f3325fb;
        if (threadLocal.get() == null) {
            threadLocal.set(new y());
        }
        return threadLocal.get();
    }

    public final boolean a(n3 n3Var, long j) {
        Long l3 = this.y.get(n3Var);
        if (l3 == null) {
            return true;
        }
        if (l3.longValue() >= j) {
            return false;
        }
        this.y.remove(n3Var);
        return true;
    }

    public void fb(n3 n3Var) {
        this.y.remove(n3Var);
        int iIndexOf = this.n3.indexOf(n3Var);
        if (iIndexOf >= 0) {
            this.n3.set(iIndexOf, null);
            this.f3326a = true;
        }
    }

    public final void n3() {
        if (this.f3326a) {
            for (int size = this.n3.size() - 1; size >= 0; size--) {
                if (this.n3.get(size) == null) {
                    this.n3.remove(size);
                }
            }
            this.f3326a = false;
        }
    }

    public zn v() {
        if (this.f3327gv == null) {
            this.f3327gv = new gv(this.zn);
        }
        return this.f3327gv;
    }

    public void y(n3 n3Var, long j) {
        if (this.n3.size() == 0) {
            v().y();
        }
        if (!this.n3.contains(n3Var)) {
            this.n3.add(n3Var);
        }
        if (j > 0) {
            this.y.put(n3Var, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public void zn(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.n3.size(); i++) {
            n3 n3Var = this.n3.get(i);
            if (n3Var != null && a(n3Var, jUptimeMillis)) {
                n3Var.y(j);
            }
        }
        n3();
    }
}

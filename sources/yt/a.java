package yt;

import android.os.CancellationSignal;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f9360gv;
    public n3 n3;
    public boolean y;
    public Object zn;

    public interface n3 {
        void y();
    }

    public static class y {
        public static CancellationSignal n3() {
            return new CancellationSignal();
        }

        public static void y(Object obj) {
            ((CancellationSignal) obj).cancel();
        }
    }

    public void n3(@Nullable n3 n3Var) {
        synchronized (this) {
            try {
                zn();
                if (this.n3 == n3Var) {
                    return;
                }
                this.n3 = n3Var;
                if (this.y && n3Var != null) {
                    n3Var.y();
                }
            } finally {
            }
        }
    }

    public void y() {
        synchronized (this) {
            try {
                if (this.y) {
                    return;
                }
                this.y = true;
                this.f9360gv = true;
                n3 n3Var = this.n3;
                Object obj = this.zn;
                if (n3Var != null) {
                    try {
                        n3Var.y();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f9360gv = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    y.y(obj);
                }
                synchronized (this) {
                    this.f9360gv = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public final void zn() {
        while (this.f9360gv) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}

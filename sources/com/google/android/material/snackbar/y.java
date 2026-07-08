package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static y f2809v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public zn f2810gv;

    @Nullable
    public zn zn;

    @NonNull
    public final Object y = new Object();

    @NonNull
    public final Handler n3 = new Handler(Looper.getMainLooper(), new C0069y());

    public interface n3 {
        void show();

        void y(int i);
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.y$y, reason: collision with other inner class name */
    public class C0069y implements Handler.Callback {
        public C0069y() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            if (message.what != 0) {
                return false;
            }
            y.this.gv((zn) message.obj);
            return true;
        }
    }

    public static class zn {
        public int n3;

        @NonNull
        public final WeakReference<n3> y;
        public boolean zn;

        public zn(int i, n3 n3Var) {
            this.y = new WeakReference<>(n3Var);
            this.n3 = i;
        }

        public boolean y(@Nullable n3 n3Var) {
            return n3Var != null && this.y.get() == n3Var;
        }
    }

    public static y zn() {
        if (f2809v == null) {
            f2809v = new y();
        }
        return f2809v;
    }

    public final boolean a(n3 n3Var) {
        zn znVar = this.zn;
        return znVar != null && znVar.y(n3Var);
    }

    public void c5(n3 n3Var) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    t(this.zn);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(n3 n3Var) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    zn znVar = this.zn;
                    if (znVar.zn) {
                        znVar.zn = false;
                        t(znVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean fb(n3 n3Var) {
        zn znVar = this.f2810gv;
        return znVar != null && znVar.y(n3Var);
    }

    public void gv(@NonNull zn znVar) {
        synchronized (this.y) {
            try {
                if (this.zn == znVar || this.f2810gv == znVar) {
                    y(znVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i9(n3 n3Var) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    zn znVar = this.zn;
                    if (!znVar.zn) {
                        znVar.zn = true;
                        this.n3.removeCallbacksAndMessages(znVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n3(n3 n3Var, int i) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    y(this.zn, i);
                } else if (fb(n3Var)) {
                    y(this.f2810gv, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(n3 n3Var) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    this.zn = null;
                    if (this.f2810gv != null) {
                        wz();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(@NonNull zn znVar) {
        int i = znVar.n3;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : 2750;
        }
        this.n3.removeCallbacksAndMessages(znVar);
        Handler handler = this.n3;
        handler.sendMessageDelayed(Message.obtain(handler, 0, znVar), i);
    }

    public void tl(int i, n3 n3Var) {
        synchronized (this.y) {
            try {
                if (a(n3Var)) {
                    zn znVar = this.zn;
                    znVar.n3 = i;
                    this.n3.removeCallbacksAndMessages(znVar);
                    t(this.zn);
                    return;
                }
                if (fb(n3Var)) {
                    this.f2810gv.n3 = i;
                } else {
                    this.f2810gv = new zn(i, n3Var);
                }
                zn znVar2 = this.zn;
                if (znVar2 == null || !y(znVar2, 4)) {
                    this.zn = null;
                    wz();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean v(n3 n3Var) {
        boolean z;
        synchronized (this.y) {
            try {
                z = a(n3Var) || fb(n3Var);
            } finally {
            }
        }
        return z;
    }

    public final void wz() {
        zn znVar = this.f2810gv;
        if (znVar != null) {
            this.zn = znVar;
            this.f2810gv = null;
            n3 n3Var = znVar.y.get();
            if (n3Var != null) {
                n3Var.show();
            } else {
                this.zn = null;
            }
        }
    }

    public final boolean y(@NonNull zn znVar, int i) {
        n3 n3Var = znVar.y.get();
        if (n3Var == null) {
            return false;
        }
        this.n3.removeCallbacksAndMessages(znVar);
        n3Var.y(i);
        return true;
    }
}

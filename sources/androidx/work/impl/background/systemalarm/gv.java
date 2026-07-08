package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bv.mt;
import bv.wz;
import i2.i9;
import i2.n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public class gv implements n3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1101r = f.a("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Intent f1102co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i9 f1103f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final mt f1104fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<Intent> f1105p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i2.gv f1106s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f1107t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final br.y f1108v;
    public final Handler w;
    public final Context y;

    @Nullable
    public zn z;

    public interface zn {
        void n3();
    }

    public gv(@NonNull Context context) {
        this(context, null, null);
    }

    public br.y a() {
        return this.f1108v;
    }

    public final boolean c5(@NonNull String str) {
        n3();
        synchronized (this.f1105p) {
            try {
                Iterator<Intent> it = this.f1105p.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(@NonNull Runnable runnable) {
        this.w.post(runnable);
    }

    public i9 fb() {
        return this.f1103f;
    }

    public i2.gv gv() {
        return this.f1106s;
    }

    public void i9() {
        f.zn().y(f1101r, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1106s.c5(this);
        this.f1104fb.y();
        this.z = null;
    }

    public final void n3() {
        if (this.w.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public mt s() {
        return this.f1104fb;
    }

    public final void t() {
        n3();
        PowerManager.WakeLock wakeLockN3 = wz.n3(this.y, "ProcessCommand");
        try {
            wakeLockN3.acquire();
            this.f1103f.z().n3(new y(this));
        } finally {
            wakeLockN3.release();
        }
    }

    public void tl(@NonNull zn znVar) {
        if (this.z != null) {
            f.zn().n3(f1101r, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.z = znVar;
        }
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        f(new n3(this, y.zn(this.y, str, z), 0));
    }

    public boolean y(@NonNull Intent intent, int i) {
        f fVarZn = f.zn();
        String str = f1101r;
        fVarZn.y(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        n3();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            f.zn().s(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && c5("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f1105p) {
            try {
                boolean zIsEmpty = this.f1105p.isEmpty();
                this.f1105p.add(intent);
                if (zIsEmpty) {
                    t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void zn() {
        f fVarZn = f.zn();
        String str = f1101r;
        fVarZn.y(str, "Checking if commands are complete.", new Throwable[0]);
        n3();
        synchronized (this.f1105p) {
            try {
                if (this.f1102co != null) {
                    f.zn().y(str, String.format("Removing command %s", this.f1102co), new Throwable[0]);
                    if (!this.f1105p.remove(0).equals(this.f1102co)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f1102co = null;
                }
                bv.f backgroundExecutor = this.f1108v.getBackgroundExecutor();
                if (!this.f1107t.xc() && this.f1105p.isEmpty() && !backgroundExecutor.n3()) {
                    f.zn().y(str, "No more commands & intents.", new Throwable[0]);
                    zn znVar = this.z;
                    if (znVar != null) {
                        znVar.n3();
                    }
                } else if (!this.f1105p.isEmpty()) {
                    t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public gv(@NonNull Context context, @Nullable i2.gv gvVar, @Nullable i9 i9Var) {
        Context applicationContext = context.getApplicationContext();
        this.y = applicationContext;
        this.f1107t = new y(applicationContext);
        this.f1104fb = new mt();
        i9Var = i9Var == null ? i9.xc(context) : i9Var;
        this.f1103f = i9Var;
        gvVar = gvVar == null ? i9Var.p() : gvVar;
        this.f1106s = gvVar;
        this.f1108v = i9Var.z();
        gvVar.zn(this);
        this.f1105p = new ArrayList();
        this.f1102co = null;
        this.w = new Handler(Looper.getMainLooper());
    }
}

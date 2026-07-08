package i2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.R$bool;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.y;
import bv.t;
import bv.tl;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import yk.f;
import yk.r;
import yk.w;
import yk.wz;
import yk.x4;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gv f5474a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f5475c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public bv.s f5476fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public br.y f5477gv;
    public androidx.work.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5478s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<v> f5479v;
    public Context y;
    public WorkDatabase zn;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final String f5471i9 = yk.f.a("WorkManagerImpl");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static i9 f5470f = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static i9 f5472t = null;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final Object f5473tl = new Object();

    public i9(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2) {
        this(context, yVar, yVar2, context.getResources().getBoolean(R$bool.y));
    }

    public static void s(@NonNull Context context, @NonNull androidx.work.y yVar) {
        synchronized (f5473tl) {
            try {
                i9 i9Var = f5470f;
                if (i9Var != null && f5472t != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (i9Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f5472t == null) {
                        f5472t = new i9(applicationContext, yVar, new br.n3(yVar.t()));
                    }
                    f5470f = f5472t;
                }
            } finally {
            }
        }
    }

    @Nullable
    @Deprecated
    public static i9 wz() {
        synchronized (f5473tl) {
            try {
                i9 i9Var = f5470f;
                if (i9Var != null) {
                    return i9Var;
                }
                return f5472t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static i9 xc(@NonNull Context context) {
        i9 i9VarWz;
        synchronized (f5473tl) {
            try {
                i9VarWz = wz();
                if (i9VarWz == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof y.zn)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    s(applicationContext, ((y.zn) applicationContext).y());
                    i9VarWz = xc(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i9VarWz;
    }

    public void c(@NonNull String str, @Nullable WorkerParameters.y yVar) {
        this.f5477gv.n3(new t(this, str, yVar));
    }

    @NonNull
    public wz c5(@NonNull UUID uuid) {
        bv.y yVarN3 = bv.y.n3(uuid, this);
        this.f5477gv.n3(yVarN3);
        return yVarN3.v();
    }

    @NonNull
    public WorkDatabase co() {
        return this.zn;
    }

    public void d0(@NonNull String str) {
        this.f5477gv.n3(new tl(this, str, true));
    }

    @NonNull
    public fb f(@NonNull String str, @NonNull yk.gv gvVar, @NonNull w wVar) {
        return new fb(this, str, gvVar == yk.gv.KEEP ? yk.v.KEEP : yk.v.REPLACE, Collections.singletonList(wVar));
    }

    public void f3(@NonNull BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5473tl) {
            try {
                this.f5475c5 = pendingResult;
                if (this.f5478s) {
                    pendingResult.finish();
                    this.f5475c5 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void fh(@NonNull String str) {
        this.f5477gv.n3(new tl(this, str, false));
    }

    public void i4() {
        if (Build.VERSION.SDK_INT >= 23) {
            j3.t.n3(t());
        }
        co().workSpecDao().resetScheduledState();
        a.n3(tl(), co(), mt());
    }

    @NonNull
    public List<v> i9(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2) {
        return Arrays.asList(a.y(context, this), new i3.n3(context, yVar, yVar2, this));
    }

    @NonNull
    public List<v> mt() {
        return this.f5479v;
    }

    public void n(@NonNull String str) {
        c(str, null);
    }

    @Override // yk.r
    @NonNull
    public wz n3(@NonNull String str) {
        bv.y yVarZn = bv.y.zn(str, this, true);
        this.f5477gv.n3(yVarZn);
        return yVarZn.v();
    }

    @NonNull
    public gv p() {
        return this.f5474a;
    }

    public final void r(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, @NonNull WorkDatabase workDatabase, @NonNull List<v> list, @NonNull gv gvVar) {
        Context applicationContext = context.getApplicationContext();
        this.y = applicationContext;
        this.n3 = yVar;
        this.f5477gv = yVar2;
        this.zn = workDatabase;
        this.f5479v = list;
        this.f5474a = gvVar;
        this.f5476fb = new bv.s(workDatabase);
        this.f5478s = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f5477gv.n3(new ForceStopRunnable(applicationContext, this));
    }

    @NonNull
    public Context t() {
        return this.y;
    }

    @NonNull
    public androidx.work.y tl() {
        return this.n3;
    }

    @Override // yk.r
    @NonNull
    public wz v(@NonNull String str, @NonNull yk.gv gvVar, @NonNull w wVar) {
        return f(str, gvVar, wVar).y();
    }

    @NonNull
    public bv.s w() {
        return this.f5476fb;
    }

    public void x4() {
        synchronized (f5473tl) {
            try {
                this.f5478s = true;
                BroadcastReceiver.PendingResult pendingResult = this.f5475c5;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f5475c5 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yk.r
    @NonNull
    public wz y(@NonNull String str) {
        bv.y yVarGv = bv.y.gv(str, this);
        this.f5477gv.n3(yVarGv);
        return yVarGv.v();
    }

    @NonNull
    public br.y z() {
        return this.f5477gv;
    }

    @Override // yk.r
    @NonNull
    public wz zn(@NonNull List<? extends x4> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new fb(this, list).y();
    }

    public i9(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, boolean z) {
        this(context, yVar, yVar2, WorkDatabase.create(context.getApplicationContext(), yVar2.getBackgroundExecutor(), z));
    }

    public i9(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, @NonNull WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        yk.f.v(new f.y(yVar.i9()));
        List<v> listI9 = i9(applicationContext, yVar, yVar2);
        r(context, yVar, yVar2, workDatabase, listI9, new gv(context, yVar, yVar2, workDatabase, listI9));
    }
}

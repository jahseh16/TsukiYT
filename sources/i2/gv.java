package i2;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import bv.wz;
import i2.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public class gv implements n3, nd.y {
    public static final String f3 = yk.f.a("Processor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorkDatabase f5461f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public androidx.work.y f5462fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List<v> f5463p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public br.y f5465s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Context f5467v;
    public Map<String, f> w = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<String, f> f5466t = new HashMap();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public Set<String> f5460co = new HashSet();
    public final List<n3> z = new ArrayList();

    @Nullable
    public PowerManager.WakeLock y = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f5464r = new Object();

    public static class y implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @NonNull
        public s4.a<Boolean> f5468fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NonNull
        public String f5469v;

        @NonNull
        public n3 y;

        public y(@NonNull n3 n3Var, @NonNull String str, @NonNull s4.a<Boolean> aVar) {
            this.y = n3Var;
            this.f5469v = str;
            this.f5468fb = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f5468fb.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.y.v(this.f5469v, zBooleanValue);
        }
    }

    public gv(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, @NonNull WorkDatabase workDatabase, @NonNull List<v> list) {
        this.f5467v = context;
        this.f5462fb = yVar;
        this.f5465s = yVar2;
        this.f5461f = workDatabase;
        this.f5463p = list;
    }

    public static boolean gv(@NonNull String str, @Nullable f fVar) {
        if (fVar == null) {
            yk.f.zn().y(f3, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        fVar.gv();
        yk.f.zn().y(f3, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public boolean a(@NonNull String str) {
        boolean zContains;
        synchronized (this.f5464r) {
            zContains = this.f5460co.contains(str);
        }
        return zContains;
    }

    public void c5(@NonNull n3 n3Var) {
        synchronized (this.f5464r) {
            this.z.remove(n3Var);
        }
    }

    public boolean f(@NonNull String str, @Nullable WorkerParameters.y yVar) {
        synchronized (this.f5464r) {
            try {
                if (fb(str)) {
                    yk.f.zn().y(f3, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                f fVarY = new f.zn(this.f5467v, this.f5462fb, this.f5465s, this, this.f5461f, str).zn(this.f5463p).n3(yVar).y();
                s4.a<Boolean> aVarN3 = fVarY.n3();
                aVarN3.addListener(new y(this, str, aVarN3), this.f5465s.y());
                this.w.put(str, fVarY);
                this.f5465s.getBackgroundExecutor().execute(fVarY);
                yk.f.zn().y(f3, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean fb(@NonNull String str) {
        boolean z;
        synchronized (this.f5464r) {
            try {
                z = this.w.containsKey(str) || this.f5466t.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public boolean i9(@NonNull String str) {
        return f(str, null);
    }

    @Override // nd.y
    public void n3(@NonNull String str, @NonNull yk.a aVar) {
        synchronized (this.f5464r) {
            try {
                yk.f.zn().gv(f3, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                f fVarRemove = this.w.remove(str);
                if (fVarRemove != null) {
                    if (this.y == null) {
                        PowerManager.WakeLock wakeLockN3 = wz.n3(this.f5467v, "ProcessorForegroundLck");
                        this.y = wakeLockN3;
                        wakeLockN3.acquire();
                    }
                    this.f5466t.put(str, fVarRemove);
                    d.y.startForegroundService(this.f5467v, androidx.work.impl.foreground.y.zn(this.f5467v, str, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean s(@NonNull String str) {
        boolean zContainsKey;
        synchronized (this.f5464r) {
            zContainsKey = this.f5466t.containsKey(str);
        }
        return zContainsKey;
    }

    public boolean t(@NonNull String str) {
        boolean zGv;
        synchronized (this.f5464r) {
            try {
                yk.f.zn().y(f3, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f5460co.add(str);
                f fVarRemove = this.f5466t.remove(str);
                boolean z = fVarRemove != null;
                if (fVarRemove == null) {
                    fVarRemove = this.w.remove(str);
                }
                zGv = gv(str, fVarRemove);
                if (z) {
                    tl();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zGv;
    }

    public final void tl() {
        synchronized (this.f5464r) {
            try {
                if (this.f5466t.isEmpty()) {
                    try {
                        this.f5467v.startService(androidx.work.impl.foreground.y.gv(this.f5467v));
                    } catch (Throwable th) {
                        yk.f.zn().n3(f3, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.y;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.y = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        synchronized (this.f5464r) {
            try {
                this.w.remove(str);
                yk.f.zn().y(f3, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
                Iterator<n3> it = this.z.iterator();
                while (it.hasNext()) {
                    it.next().v(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean wz(@NonNull String str) {
        boolean zGv;
        synchronized (this.f5464r) {
            yk.f.zn().y(f3, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zGv = gv(str, this.f5466t.remove(str));
        }
        return zGv;
    }

    public boolean xc(@NonNull String str) {
        boolean zGv;
        synchronized (this.f5464r) {
            yk.f.zn().y(f3, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zGv = gv(str, this.w.remove(str));
        }
        return zGv;
    }

    @Override // nd.y
    public void y(@NonNull String str) {
        synchronized (this.f5464r) {
            this.f5466t.remove(str);
            tl();
        }
    }

    public void zn(@NonNull n3 n3Var) {
        synchronized (this.f5464r) {
            this.z.add(n3Var);
        }
    }
}

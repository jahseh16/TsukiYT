package i3;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import i2.i9;
import i2.v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ne.gv;
import ne.zn;
import yk.f;
import yk.z;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements v, zn, i2.n3 {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final String f5481co = f.a("GreedyScheduler");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f5482f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final gv f5483fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Boolean f5484p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5486t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i9 f5487v;
    public final Context y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set<androidx.work.impl.model.n3> f5485s = new HashSet();
    public final Object w = new Object();

    public n3(@NonNull Context context, @NonNull androidx.work.y yVar, @NonNull br.y yVar2, @NonNull i9 i9Var) {
        this.y = context;
        this.f5487v = i9Var;
        this.f5483fb = new gv(context, yVar2, this);
        this.f5482f = new y(this, yVar.f());
    }

    @Override // ne.zn
    public void a(@NonNull List<String> list) {
        for (String str : list) {
            f.zn().y(f5481co, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f5487v.n(str);
        }
    }

    public final void c5(@NonNull String str) {
        synchronized (this.w) {
            try {
                Iterator<androidx.work.impl.model.n3> it = this.f5485s.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    androidx.work.impl.model.n3 next = it.next();
                    if (next.id.equals(str)) {
                        f.zn().y(f5481co, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.f5485s.remove(next);
                        this.f5483fb.gv(this.f5485s);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void fb() {
        this.f5484p = Boolean.valueOf(bv.i9.n3(this.y, this.f5487v.tl()));
    }

    @Override // i2.v
    public boolean gv() {
        return false;
    }

    @Override // ne.zn
    public void n3(@NonNull List<String> list) {
        for (String str : list) {
            f.zn().y(f5481co, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f5487v.fh(str);
        }
    }

    public final void s() {
        if (this.f5486t) {
            return;
        }
        this.f5487v.p().zn(this);
        this.f5486t = true;
    }

    @Override // i2.n3
    public void v(@NonNull String str, boolean z) {
        c5(str);
    }

    @Override // i2.v
    public void y(@NonNull String str) {
        if (this.f5484p == null) {
            fb();
        }
        if (!this.f5484p.booleanValue()) {
            f.zn().gv(f5481co, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        s();
        f.zn().y(f5481co, String.format("Cancelling work ID %s", str), new Throwable[0]);
        y yVar = this.f5482f;
        if (yVar != null) {
            yVar.n3(str);
        }
        this.f5487v.fh(str);
    }

    @Override // i2.v
    public void zn(@NonNull androidx.work.impl.model.n3... n3VarArr) {
        if (this.f5484p == null) {
            fb();
        }
        if (!this.f5484p.booleanValue()) {
            f.zn().gv(f5481co, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        s();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (androidx.work.impl.model.n3 n3Var : n3VarArr) {
            long jY = n3Var.y();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (n3Var.state == z.y.ENQUEUED) {
                if (jCurrentTimeMillis < jY) {
                    y yVar = this.f5482f;
                    if (yVar != null) {
                        yVar.y(n3Var);
                    }
                } else if (n3Var.n3()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && n3Var.constraints.s()) {
                        f.zn().y(f5481co, String.format("Ignoring WorkSpec %s, Requires device idle.", n3Var), new Throwable[0]);
                    } else if (i < 24 || !n3Var.constraints.v()) {
                        hashSet.add(n3Var);
                        hashSet2.add(n3Var.id);
                    } else {
                        f.zn().y(f5481co, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", n3Var), new Throwable[0]);
                    }
                } else {
                    f.zn().y(f5481co, String.format("Starting work for %s", n3Var.id), new Throwable[0]);
                    this.f5487v.n(n3Var.id);
                }
            }
        }
        synchronized (this.w) {
            try {
                if (!hashSet.isEmpty()) {
                    f.zn().y(f5481co, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f5485s.addAll(hashSet);
                    this.f5483fb.gv(this.f5485s);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<Function0<Unit>> f13fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f14gv;
    public final Function0<Unit> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f15s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16v;
    public final Executor y;
    public final Object zn;

    public t(Executor executor, Function0<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.y = executor;
        this.n3 = reportFullyDrawn;
        this.zn = new Object();
        this.f13fb = new ArrayList();
        this.f15s = new Runnable() { // from class: a.f
            @Override // java.lang.Runnable
            public final void run() {
                t.gv(this.y);
            }
        };
    }

    public static final void gv(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.zn) {
            try {
                this$0.f16v = false;
                if (this$0.f14gv == 0 && !this$0.f12a) {
                    this$0.n3.invoke();
                    this$0.n3();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n3() {
        synchronized (this.zn) {
            try {
                this.f12a = true;
                Iterator<T> it = this.f13fb.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f13fb.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zn() {
        boolean z;
        synchronized (this.zn) {
            z = this.f12a;
        }
        return z;
    }
}

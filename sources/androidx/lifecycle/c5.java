package androidx.lifecycle;

import androidx.lifecycle.s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final t f826gv;
    public final s.n3 n3;
    public final s y;
    public final ap.c5 zn;

    public c5(s lifecycle, s.n3 minState, ap.c5 dispatchQueue, final Job parentJob) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minState, "minState");
        Intrinsics.checkNotNullParameter(dispatchQueue, "dispatchQueue");
        Intrinsics.checkNotNullParameter(parentJob, "parentJob");
        this.y = lifecycle;
        this.n3 = minState;
        this.zn = dispatchQueue;
        t tVar = new t() { // from class: ap.tl
            @Override // androidx.lifecycle.t
            public final void onStateChanged(mt mtVar, s.y yVar) {
                androidx.lifecycle.c5.zn(this.y, parentJob, mtVar, yVar);
            }
        };
        this.f826gv = tVar;
        if (lifecycle.n3() != s.n3.DESTROYED) {
            lifecycle.y(tVar);
        } else {
            Job.DefaultImpls.cancel$default(parentJob, null, 1, null);
            n3();
        }
    }

    public static final void zn(c5 this$0, Job parentJob, ap.mt source, s.y yVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(yVar, "<anonymous parameter 1>");
        if (source.getLifecycle().n3() == s.n3.DESTROYED) {
            Job.DefaultImpls.cancel$default(parentJob, null, 1, null);
            this$0.n3();
        } else if (source.getLifecycle().n3().compareTo(this$0.n3) < 0) {
            this$0.zn.s();
        } else {
            this$0.zn.c5();
        }
    }

    public final void n3() {
        this.y.gv(this.f826gv);
        this.zn.fb();
    }
}

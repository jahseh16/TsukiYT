package ap;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public boolean n3;
    public boolean zn;
    public boolean y = true;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Queue<Runnable> f1176gv = new ArrayDeque();

    public static final void gv(c5 this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        this$0.a(runnable);
    }

    public final void a(Runnable runnable) {
        if (!this.f1176gv.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        v();
    }

    public final void c5() {
        if (this.y) {
            if (this.n3) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.y = false;
            v();
        }
    }

    public final void fb() {
        this.n3 = true;
        v();
    }

    public final boolean n3() {
        return this.n3 || !this.y;
    }

    public final void s() {
        this.y = true;
    }

    public final void v() {
        if (this.zn) {
            return;
        }
        try {
            this.zn = true;
            while (!this.f1176gv.isEmpty() && n3()) {
                Runnable runnablePoll = this.f1176gv.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.zn = false;
        }
    }

    public final void zn(CoroutineContext context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(context) || n3()) {
            immediate.mo210dispatch(context, new Runnable() { // from class: ap.s
                @Override // java.lang.Runnable
                public final void run() {
                    c5.gv(this.y, runnable);
                }
            });
        } else {
            a(runnable);
        }
    }
}

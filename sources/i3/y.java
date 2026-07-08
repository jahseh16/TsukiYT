package i3;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import yk.f;
import yk.mt;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final String f5488gv = f.a("DelayedWorkTracker");
    public final mt n3;
    public final n3 y;
    public final Map<String, Runnable> zn = new HashMap();

    /* JADX INFO: renamed from: i3.y$y, reason: collision with other inner class name */
    public class RunnableC0102y implements Runnable {
        public final /* synthetic */ androidx.work.impl.model.n3 y;

        public RunnableC0102y(androidx.work.impl.model.n3 n3Var) {
            this.y = n3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.zn().y(y.f5488gv, String.format("Scheduling work %s", this.y.id), new Throwable[0]);
            y.this.y.zn(this.y);
        }
    }

    public y(@NonNull n3 n3Var, @NonNull mt mtVar) {
        this.y = n3Var;
        this.n3 = mtVar;
    }

    public void n3(@NonNull String str) {
        Runnable runnableRemove = this.zn.remove(str);
        if (runnableRemove != null) {
            this.n3.y(runnableRemove);
        }
    }

    public void y(@NonNull androidx.work.impl.model.n3 n3Var) {
        Runnable runnableRemove = this.zn.remove(n3Var.id);
        if (runnableRemove != null) {
            this.n3.y(runnableRemove);
        }
        RunnableC0102y runnableC0102y = new RunnableC0102y(n3Var);
        this.zn.put(n3Var.id, runnableC0102y);
        this.n3.n3(n3Var.y() - System.currentTimeMillis(), runnableC0102y);
    }
}

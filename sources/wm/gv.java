package wm;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import yk.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9036a = f.a("ConstraintTracker");
    public final Context n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public T f9038v;
    public final br.y y;
    public final Object zn = new Object();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Set<ne.y<T>> f9037gv = new LinkedHashSet();

    public class y implements Runnable {
        public final /* synthetic */ List y;

        public y(List list) {
            this.y = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                ((ne.y) it.next()).y(gv.this.f9038v);
            }
        }
    }

    public gv(@NonNull Context context, @NonNull br.y yVar) {
        this.n3 = context.getApplicationContext();
        this.y = yVar;
    }

    public abstract void a();

    public void gv(T t3) {
        synchronized (this.zn) {
            try {
                T t5 = this.f9038v;
                if (t5 != t3 && (t5 == null || !t5.equals(t3))) {
                    this.f9038v = t3;
                    this.y.y().execute(new y(new ArrayList(this.f9037gv)));
                }
            } finally {
            }
        }
    }

    public abstract T n3();

    public abstract void v();

    public void y(ne.y<T> yVar) {
        synchronized (this.zn) {
            try {
                if (this.f9037gv.add(yVar)) {
                    if (this.f9037gv.size() == 1) {
                        this.f9038v = n3();
                        f.zn().y(f9036a, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f9038v), new Throwable[0]);
                        v();
                    }
                    yVar.y(this.f9038v);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void zn(ne.y<T> yVar) {
        synchronized (this.zn) {
            try {
                if (this.f9037gv.remove(yVar) && this.f9037gv.isEmpty()) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

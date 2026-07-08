package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes.dex */
public class wz extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f864f = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f865a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public ArrayList<s.n3> f866c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public boolean f867fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public s.n3 f868gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final MutableStateFlow<s.n3> f869i9;
    public final boolean n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f870s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final WeakReference<ap.mt> f871v;
    public mt.y<ap.p, n3> zn;

    public static final class n3 {
        public t n3;
        public s.n3 y;

        public n3(ap.p pVar, s.n3 initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(pVar);
            this.n3 = ap.x4.a(pVar);
            this.y = initialState;
        }

        public final s.n3 n3() {
            return this.y;
        }

        public final void y(ap.mt mtVar, s.y event) {
            Intrinsics.checkNotNullParameter(event, "event");
            s.n3 n3VarGv = event.gv();
            this.y = wz.f864f.y(this.y, n3VarGv);
            t tVar = this.n3;
            Intrinsics.checkNotNull(mtVar);
            tVar.onStateChanged(mtVar, event);
            this.y = n3VarGv;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s.n3 y(s.n3 state1, s.n3 n3Var) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (n3Var == null || n3Var.compareTo(state1) >= 0) ? state1 : n3Var;
        }

        public y() {
        }
    }

    public wz(ap.mt mtVar, boolean z) {
        this.n3 = z;
        this.zn = new mt.y<>();
        s.n3 n3Var = s.n3.INITIALIZED;
        this.f868gv = n3Var;
        this.f866c5 = new ArrayList<>();
        this.f871v = new WeakReference<>(mtVar);
        this.f869i9 = StateFlowKt.MutableStateFlow(n3Var);
    }

    public final s.n3 a(ap.p pVar) {
        n3 value;
        Map.Entry<ap.p, n3> entryS = this.zn.s(pVar);
        s.n3 n3Var = null;
        s.n3 n3VarN3 = (entryS == null || (value = entryS.getValue()) == null) ? null : value.n3();
        if (!this.f866c5.isEmpty()) {
            n3Var = this.f866c5.get(r0.size() - 1);
        }
        y yVar = f864f;
        return yVar.y(yVar.y(this.f868gv, n3VarN3), n3Var);
    }

    public void c5(s.y event) {
        Intrinsics.checkNotNullParameter(event, "event");
        fb("handleLifecycleEvent");
        t(event.gv());
    }

    public void f(s.n3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        fb("markState");
        xc(state);
    }

    @SuppressLint({"RestrictedApi"})
    public final void fb(String str) {
        if (!this.n3 || p.zn.s().zn()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    @Override // androidx.lifecycle.s
    public void gv(ap.p observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        fb("removeObserver");
        this.zn.fb(observer);
    }

    public final boolean i9() {
        if (this.zn.size() == 0) {
            return true;
        }
        Map.Entry<ap.p, n3> entryY = this.zn.y();
        Intrinsics.checkNotNull(entryY);
        s.n3 n3VarN3 = entryY.getValue().n3();
        Map.Entry<ap.p, n3> entryGv = this.zn.gv();
        Intrinsics.checkNotNull(entryGv);
        s.n3 n3VarN32 = entryGv.getValue().n3();
        return n3VarN3 == n3VarN32 && this.f868gv == n3VarN32;
    }

    @Override // androidx.lifecycle.s
    public s.n3 n3() {
        return this.f868gv;
    }

    public final void s(ap.mt mtVar) {
        mt.n3<ap.p, n3>.gv gvVarZn = this.zn.zn();
        Intrinsics.checkNotNullExpressionValue(gvVarZn, "observerMap.iteratorWithAdditions()");
        while (gvVarZn.hasNext() && !this.f870s) {
            Map.Entry next = gvVarZn.next();
            ap.p pVar = (ap.p) next.getKey();
            n3 n3Var = (n3) next.getValue();
            while (n3Var.n3().compareTo(this.f868gv) < 0 && !this.f870s && this.zn.contains(pVar)) {
                wz(n3Var.n3());
                s.y yVarN3 = s.y.Companion.n3(n3Var.n3());
                if (yVarN3 == null) {
                    throw new IllegalStateException("no event up from " + n3Var.n3());
                }
                n3Var.y(mtVar, yVarN3);
                tl();
            }
        }
    }

    public final void t(s.n3 n3Var) {
        s.n3 n3Var2 = this.f868gv;
        if (n3Var2 == n3Var) {
            return;
        }
        if (n3Var2 == s.n3.INITIALIZED && n3Var == s.n3.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f868gv + " in component " + this.f871v.get()).toString());
        }
        this.f868gv = n3Var;
        if (this.f867fb || this.f865a != 0) {
            this.f870s = true;
            return;
        }
        this.f867fb = true;
        w();
        this.f867fb = false;
        if (this.f868gv == s.n3.DESTROYED) {
            this.zn = new mt.y<>();
        }
    }

    public final void tl() {
        this.f866c5.remove(r0.size() - 1);
    }

    public final void v(ap.mt mtVar) {
        Iterator<Map.Entry<ap.p, n3>> itDescendingIterator = this.zn.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.f870s) {
            Map.Entry<ap.p, n3> next = itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            ap.p key = next.getKey();
            n3 value = next.getValue();
            while (value.n3().compareTo(this.f868gv) > 0 && !this.f870s && this.zn.contains(key)) {
                s.y yVarY = s.y.Companion.y(value.n3());
                if (yVarY == null) {
                    throw new IllegalStateException("no event down from " + value.n3());
                }
                wz(yVarY.gv());
                value.y(mtVar, yVarY);
                tl();
            }
        }
    }

    public final void w() {
        ap.mt mtVar = this.f871v.get();
        if (mtVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i9()) {
            this.f870s = false;
            s.n3 n3Var = this.f868gv;
            Map.Entry<ap.p, n3> entryY = this.zn.y();
            Intrinsics.checkNotNull(entryY);
            if (n3Var.compareTo(entryY.getValue().n3()) < 0) {
                v(mtVar);
            }
            Map.Entry<ap.p, n3> entryGv = this.zn.gv();
            if (!this.f870s && entryGv != null && this.f868gv.compareTo(entryGv.getValue().n3()) > 0) {
                s(mtVar);
            }
        }
        this.f870s = false;
        this.f869i9.setValue(n3());
    }

    public final void wz(s.n3 n3Var) {
        this.f866c5.add(n3Var);
    }

    public void xc(s.n3 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        fb("setCurrentState");
        t(state);
    }

    @Override // androidx.lifecycle.s
    public void y(ap.p observer) {
        ap.mt mtVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        fb("addObserver");
        s.n3 n3Var = this.f868gv;
        s.n3 n3Var2 = s.n3.DESTROYED;
        if (n3Var != n3Var2) {
            n3Var2 = s.n3.INITIALIZED;
        }
        n3 n3Var3 = new n3(observer, n3Var2);
        if (this.zn.a(observer, n3Var3) == null && (mtVar = this.f871v.get()) != null) {
            boolean z = this.f865a != 0 || this.f867fb;
            s.n3 n3VarA = a(observer);
            this.f865a++;
            while (n3Var3.n3().compareTo(n3VarA) < 0 && this.zn.contains(observer)) {
                wz(n3Var3.n3());
                s.y yVarN3 = s.y.Companion.n3(n3Var3.n3());
                if (yVarN3 == null) {
                    throw new IllegalStateException("no event up from " + n3Var3.n3());
                }
                n3Var3.y(mtVar, yVarN3);
                tl();
                n3VarA = a(observer);
            }
            if (!z) {
                w();
            }
            this.f865a--;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wz(ap.mt provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}

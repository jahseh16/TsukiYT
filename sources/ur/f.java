package ur;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;
import ft.xb;
import ft.xq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class f extends fb<v> {
    public static final xb qn = new xb.zn().s(Uri.EMPTY).y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8504b;
    public final List<v> c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<v> f8505d;
    public final IdentityHashMap<d0, v> d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final boolean f8506ej;
    public final Set<gv> f3;
    public final Map<Object, v> fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public Set<gv> f8507hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public u f8508j5;

    @Nullable
    public Handler n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List<v> f8509r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f8510x;

    public static final class a<T> {
        public final T n3;
        public final int y;

        @Nullable
        public final gv zn;

        public a(int i, T t3, @Nullable gv gvVar) {
            this.y = i;
            this.n3 = t3;
            this.zn = gvVar;
        }
    }

    public static final class gv {
        public final Runnable n3;
        public final Handler y;

        public gv(Handler handler, Runnable runnable) {
            this.y = handler;
            this.n3 = runnable;
        }

        public void y() {
            this.y.post(this.n3);
        }
    }

    public static final class n3 extends ft.y {
        public final Object[] c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final int f8511co;
        public final HashMap<Object, Integer> d0;
        public final int[] f3;
        public final xq[] n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int[] f8512r;
        public final int z;

        public n3(Collection<v> collection, u uVar, boolean z) {
            super(z, uVar);
            int size = collection.size();
            this.f8512r = new int[size];
            this.f3 = new int[size];
            this.n = new xq[size];
            this.c = new Object[size];
            this.d0 = new HashMap<>();
            int iZ = 0;
            int iTl = 0;
            int i = 0;
            for (v vVar : collection) {
                this.n[i] = vVar.y.vp();
                this.f3[i] = iZ;
                this.f8512r[i] = iTl;
                iZ += this.n[i].z();
                iTl += this.n[i].tl();
                Object[] objArr = this.c;
                Object obj = vVar.n3;
                objArr[i] = obj;
                this.d0.put(obj, Integer.valueOf(i));
                i++;
            }
            this.f8511co = iZ;
            this.z = iTl;
        }

        @Override // ft.y
        public xq ej(int i) {
            return this.n[i];
        }

        @Override // ft.y
        public int f3(int i) {
            return v0.ut.s(this.f8512r, i + 1, false, false);
        }

        @Override // ft.y
        public Object fh(int i) {
            return this.c[i];
        }

        @Override // ft.y
        public int i4(Object obj) {
            Integer num = this.d0.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // ft.y
        public int mg(int i) {
            return this.f8512r[i];
        }

        @Override // ft.y
        public int n(int i) {
            return v0.ut.s(this.f3, i + 1, false, false);
        }

        @Override // ft.y
        public int ta(int i) {
            return this.f3[i];
        }

        @Override // ft.xq
        public int tl() {
            return this.z;
        }

        @Override // ft.xq
        public int z() {
            return this.f8511co;
        }
    }

    public static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f8513a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f8514gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8515v;
        public final n y;
        public final List<mg.n3> zn = new ArrayList();
        public final Object n3 = new Object();

        public v(mg mgVar, boolean z) {
            this.y = new n(mgVar, z);
        }

        public void y(int i, int i5) {
            this.f8514gv = i;
            this.f8515v = i5;
            this.f8513a = false;
            this.zn.clear();
        }
    }

    public f(boolean z, u uVar, mg... mgVarArr) {
        this(z, false, uVar, mgVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean cs(Message message) {
        int i = message.what;
        if (i == 0) {
            a aVar = (a) v0.ut.i9(message.obj);
            this.f8508j5 = this.f8508j5.a(aVar.y, ((Collection) aVar.n3).size());
            wf(aVar.y, (Collection) aVar.n3);
            gf(aVar.zn);
        } else if (i == 1) {
            a aVar2 = (a) v0.ut.i9(message.obj);
            int i5 = aVar2.y;
            int iIntValue = ((Integer) aVar2.n3).intValue();
            if (i5 == 0 && iIntValue == this.f8508j5.getLength()) {
                this.f8508j5 = this.f8508j5.gv();
            } else {
                this.f8508j5 = this.f8508j5.y(i5, iIntValue);
            }
            for (int i8 = iIntValue - 1; i8 >= i5; i8--) {
                ne(i8);
            }
            gf(aVar2.zn);
        } else if (i == 2) {
            a aVar3 = (a) v0.ut.i9(message.obj);
            u uVar = this.f8508j5;
            int i10 = aVar3.y;
            u uVarY = uVar.y(i10, i10 + 1);
            this.f8508j5 = uVarY;
            this.f8508j5 = uVarY.a(((Integer) aVar3.n3).intValue(), 1);
            yk(aVar3.y, ((Integer) aVar3.n3).intValue());
            gf(aVar3.zn);
        } else if (i == 3) {
            a aVar4 = (a) v0.ut.i9(message.obj);
            this.f8508j5 = (u) aVar4.n3;
            gf(aVar4.zn);
        } else if (i == 4) {
            fc();
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            l((Set) v0.ut.i9(message.obj));
        }
        return true;
    }

    public static Object vp(Object obj) {
        return ft.y.c(obj);
    }

    public static Object w2(Object obj) {
        return ft.y.d0(obj);
    }

    public static Object x5(v vVar, Object obj) {
        return ft.y.rz(vVar.n3, obj);
    }

    public final void ad(int i, Collection<mg> collection, @Nullable Handler handler, @Nullable Runnable runnable) {
        v0.y.y((handler == null) == (runnable == null));
        Handler handler2 = this.n;
        Iterator<mg> it = collection.iterator();
        while (it.hasNext()) {
            v0.y.v(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<mg> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new v(it2.next(), this.f8510x));
        }
        this.f8509r.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new a(i, arrayList, qk(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @Override // ur.fb, ur.y
    public synchronized void ap() {
        try {
            super.ap();
            this.c.clear();
            this.f8505d.clear();
            this.fh.clear();
            this.f8508j5 = this.f8508j5.gv();
            Handler handler = this.n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.n = null;
            }
            this.f8504b = false;
            this.f8507hw.clear();
            l(this.f3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void bv(v vVar, xq xqVar) {
        if (vVar.f8514gv + 1 < this.c.size()) {
            int iZ = xqVar.z() - (this.c.get(vVar.f8514gv + 1).f8515v - vVar.f8515v);
            if (iZ != 0) {
                cy(vVar.f8514gv + 1, 0, iZ);
            }
        }
        nd();
    }

    @Override // ur.mg
    public xb c() {
        return qn;
    }

    public final void cr(int i, v vVar) {
        if (i > 0) {
            v vVar2 = this.c.get(i - 1);
            vVar.y(i, vVar2.f8515v + vVar2.y.vp().z());
        } else {
            vVar.y(i, 0);
        }
        cy(i, 1, vVar.y.vp().z());
        this.c.add(i, vVar);
        this.fh.put(vVar.n3, vVar);
        bk(vVar, vVar.y);
        if (ra() && this.d0.isEmpty()) {
            this.f8505d.add(vVar);
        } else {
            yc(vVar);
        }
    }

    public final void cy(int i, int i5, int i8) {
        while (i < this.c.size()) {
            v vVar = this.c.get(i);
            vVar.f8514gv += i5;
            vVar.f8515v += i8;
            i++;
        }
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        v vVar = (v) v0.y.v(this.d0.remove(d0Var));
        vVar.y.d(d0Var);
        vVar.zn.remove(((f3) d0Var).y);
        if (!this.d0.isEmpty()) {
            qj();
        }
        ro(vVar);
    }

    @Override // ur.fb, ur.y
    public synchronized void e(@Nullable r0.o oVar) {
        try {
            super.e(oVar);
            this.n = new Handler(new Handler.Callback() { // from class: ur.i9
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.y.cs(message);
                }
            });
            if (this.f8509r.isEmpty()) {
                fc();
            } else {
                this.f8508j5 = this.f8508j5.a(0, this.f8509r.size());
                wf(0, this.f8509r);
                nd();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ur.fb, ur.y
    public void eb() {
        super.eb();
        this.f8505d.clear();
    }

    public final void fc() {
        this.f8504b = false;
        Set<gv> set = this.f8507hw;
        this.f8507hw = new HashSet();
        s8(new n3(this.c, this.f8508j5, this.f8506ej));
        q5().obtainMessage(5, set).sendToTarget();
    }

    public final void gf(@Nullable gv gvVar) {
        if (!this.f8504b) {
            q5().obtainMessage(4).sendToTarget();
            this.f8504b = true;
        }
        if (gvVar != null) {
            this.f8507hw.add(gvVar);
        }
    }

    public final void gq(v vVar) {
        this.f8505d.add(vVar);
        kp(vVar);
    }

    public final void i2(int i, int i5, @Nullable Handler handler, @Nullable Runnable runnable) {
        v0.y.y((handler == null) == (runnable == null));
        Handler handler2 = this.n;
        List<v> list = this.f8509r;
        list.add(i5, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new a(i, Integer.valueOf(i5), qk(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    @Override // ur.fb
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public void g(v vVar, mg mgVar, xq xqVar) {
        bv(vVar, xqVar);
    }

    public synchronized void ix(int i, int i5) {
        i2(i, i5, null, null);
    }

    public synchronized mg j3(int i, Handler handler, Runnable runnable) {
        mg mgVarW9;
        mgVarW9 = w9(i);
        wm(i, i + 1, handler, runnable);
        return mgVarW9;
    }

    public final synchronized void l(Set<gv> set) {
        try {
            Iterator<gv> it = set.iterator();
            while (it.hasNext()) {
                it.next().y();
            }
            this.f3.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ur.fb
    /* JADX INFO: renamed from: le, reason: merged with bridge method [inline-methods] */
    public int m(v vVar, int i) {
        return i + vVar.f8515v;
    }

    public synchronized int mp() {
        return this.f8509r.size();
    }

    public final void nd() {
        gf(null);
    }

    public final void ne(int i) {
        v vVarRemove = this.c.remove(i);
        this.fh.remove(vVarRemove.n3);
        cy(i, -1, -vVarRemove.y.vp().z());
        vVarRemove.f8513a = true;
        ro(vVarRemove);
    }

    public synchronized void o0(int i, Collection<mg> collection) {
        ad(i, collection, null, null);
    }

    @Override // ur.fb
    @Nullable
    /* JADX INFO: renamed from: oa, reason: merged with bridge method [inline-methods] */
    public mg.n3 rb(v vVar, mg.n3 n3Var) {
        for (int i = 0; i < vVar.zn.size(); i++) {
            if (vVar.zn.get(i).f8549gv == n3Var.f8549gv) {
                return n3Var.zn(x5(vVar, n3Var.y));
            }
        }
        return null;
    }

    public synchronized void pq(int i, mg mgVar) {
        ad(i, Collections.singletonList(mgVar), null, null);
    }

    public synchronized void q(int i, int i5) {
        wm(i, i5, null, null);
    }

    public final Handler q5() {
        return (Handler) v0.y.v(this.n);
    }

    @Override // ur.y, ur.mg
    public synchronized xq q9() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new n3(this.f8509r, this.f8508j5.getLength() != this.f8509r.size() ? this.f8508j5.gv().a(0, this.f8509r.size()) : this.f8508j5, this.f8506ej);
    }

    public final void qj() {
        Iterator<v> it = this.f8505d.iterator();
        while (it.hasNext()) {
            v next = it.next();
            if (next.zn.isEmpty()) {
                yc(next);
                it.remove();
            }
        }
    }

    @Nullable
    public final gv qk(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        gv gvVar = new gv(handler, runnable);
        this.f3.add(gvVar);
        return gvVar;
    }

    public final void ro(v vVar) {
        if (vVar.f8513a && vVar.zn.isEmpty()) {
            this.f8505d.remove(vVar);
            y4(vVar);
        }
    }

    @Override // ur.y, ur.mg
    public boolean ut() {
        return false;
    }

    public synchronized mg vn(int i) {
        mg mgVarW9;
        mgVarW9 = w9(i);
        wm(i, i + 1, null, null);
        return mgVarW9;
    }

    public synchronized mg w9(int i) {
        return this.f8509r.get(i).y;
    }

    public final void wf(int i, Collection<v> collection) {
        Iterator<v> it = collection.iterator();
        while (it.hasNext()) {
            cr(i, it.next());
            i++;
        }
    }

    public final void wm(int i, int i5, @Nullable Handler handler, @Nullable Runnable runnable) {
        v0.y.y((handler == null) == (runnable == null));
        Handler handler2 = this.n;
        v0.ut.w2(this.f8509r, i, i5);
        if (handler2 != null) {
            handler2.obtainMessage(1, new a(i, Integer.valueOf(i5), qk(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public synchronized void xb(Collection<mg> collection) {
        ad(this.f8509r.size(), collection, null, null);
    }

    public final void yk(int i, int i5) {
        int iMin = Math.min(i, i5);
        int iMax = Math.max(i, i5);
        int iZ = this.c.get(iMin).f8515v;
        List<v> list = this.c;
        list.add(i5, list.remove(i));
        while (iMin <= iMax) {
            v vVar = this.c.get(iMin);
            vVar.f8514gv = iMin;
            vVar.f8515v = iZ;
            iZ += vVar.y.vp().z();
            iMin++;
        }
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        Object objW2 = w2(n3Var.y);
        mg.n3 n3VarZn = n3Var.zn(vp(n3Var.y));
        v vVar = this.fh.get(objW2);
        if (vVar == null) {
            vVar = new v(new zn(), this.f8510x);
            vVar.f8513a = true;
            bk(vVar, vVar.y);
        }
        gq(vVar);
        vVar.zn.add(n3VarZn);
        f3 f3VarZn = vVar.y.zn(n3VarZn, n3Var2, j);
        this.d0.put(f3VarZn, vVar);
        qj();
        return f3VarZn;
    }

    public f(boolean z, boolean z5, u uVar, mg... mgVarArr) {
        for (mg mgVar : mgVarArr) {
            v0.y.v(mgVar);
        }
        this.f8508j5 = uVar.getLength() > 0 ? uVar.gv() : uVar;
        this.d0 = new IdentityHashMap<>();
        this.fh = new HashMap();
        this.f8509r = new ArrayList();
        this.c = new ArrayList();
        this.f8507hw = new HashSet();
        this.f3 = new HashSet();
        this.f8505d = new HashSet();
        this.f8506ej = z;
        this.f8510x = z5;
        xb(Arrays.asList(mgVarArr));
    }

    public static final class zn extends ur.y {
        public zn() {
        }

        @Override // ur.mg
        public xb c() {
            return f.qn;
        }

        @Override // ur.mg
        public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // ur.y
        public void ap() {
        }

        @Override // ur.mg
        public void oz() {
        }

        @Override // ur.mg
        public void d(d0 d0Var) {
        }

        @Override // ur.y
        public void e(@Nullable r0.o oVar) {
        }
    }

    @Override // ur.fb, ur.y
    public void lc() {
    }
}

package ft;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ur.mg;
import ur.u;

/* JADX INFO: loaded from: classes.dex */
public final class ne {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final v0.p f4947c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4948f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zo.y f4952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public r0.o f4953t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final gv f4954v;
    public final zo.gn y;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public ur.u f4951i9 = new u.y(0);
    public final IdentityHashMap<ur.d0, zn> zn = new IdentityHashMap<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<Object, zn> f4950gv = new HashMap();
    public final List<zn> n3 = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<zn, n3> f4946a = new HashMap<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Set<zn> f4949fb = new HashSet();

    public interface gv {
        void n3();
    }

    public static final class n3 {
        public final mg.zn n3;
        public final ur.mg y;
        public final y zn;

        public n3(ur.mg mgVar, mg.zn znVar, y yVar) {
            this.y = mgVar;
            this.n3 = znVar;
            this.zn = yVar;
        }
    }

    public final class y implements ur.b, com.google.android.exoplayer2.drm.v {
        public final zn y;

        public y(zn znVar) {
            this.y = znVar;
        }

        @Override // ur.b
        public void a(int i, @Nullable mg.n3 n3Var, final ur.c cVar) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.vn
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.eb(pairJ, cVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void c(int i, @Nullable mg.n3 n3Var) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.q5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.q9(pairJ);
                    }
                });
            }
        }

        public final /* synthetic */ void ct(Pair pair, ur.i4 i4Var, ur.c cVar) {
            ne.this.f4952s.mg(((Integer) pair.first).intValue(), (mg.n3) pair.second, i4Var, cVar);
        }

        @Override // com.google.android.exoplayer2.drm.v
        public /* synthetic */ void d0(int i, mg.n3 n3Var) {
            v5.f.y(this, i, n3Var);
        }

        public final /* synthetic */ void dm(Pair pair, ur.i4 i4Var, ur.c cVar) {
            ne.this.f4952s.jz(((Integer) pair.first).intValue(), (mg.n3) pair.second, i4Var, cVar);
        }

        public final /* synthetic */ void eb(Pair pair, ur.c cVar) {
            ne.this.f4952s.a(((Integer) pair.first).intValue(), (mg.n3) v0.y.v((mg.n3) pair.second), cVar);
        }

        @Override // ur.b
        public void en(int i, @Nullable mg.n3 n3Var, final ur.c cVar) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.le
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.oz(pairJ, cVar);
                    }
                });
            }
        }

        public final /* synthetic */ void f7(Pair pair, int i) {
            ne.this.f4952s.y(((Integer) pair.first).intValue(), (mg.n3) pair.second, i);
        }

        @Nullable
        public final Pair<Integer, mg.n3> j(int i, @Nullable mg.n3 n3Var) {
            mg.n3 n3Var2 = null;
            if (n3Var != null) {
                mg.n3 n3VarWz = ne.wz(this.y, n3Var);
                if (n3VarWz == null) {
                    return null;
                }
                n3Var2 = n3VarWz;
            }
            return Pair.create(Integer.valueOf(ne.mt(this.y, i)), n3Var2);
        }

        @Override // ur.b
        public void jz(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.dm(pairJ, i4Var, cVar);
                    }
                });
            }
        }

        public final /* synthetic */ void k(Pair pair) {
            ne.this.f4952s.z(((Integer) pair.first).intValue(), (mg.n3) pair.second);
        }

        @Override // ur.b
        public void mg(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.x5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.ct(pairJ, i4Var, cVar);
                    }
                });
            }
        }

        public final /* synthetic */ void o4(Pair pair, ur.i4 i4Var, ur.c cVar, IOException iOException, boolean z) {
            ne.this.f4952s.u(((Integer) pair.first).intValue(), (mg.n3) pair.second, i4Var, cVar, iOException, z);
        }

        public final /* synthetic */ void oz(Pair pair, ur.c cVar) {
            ne.this.f4952s.en(((Integer) pair.first).intValue(), (mg.n3) pair.second, cVar);
        }

        public final /* synthetic */ void q9(Pair pair) {
            ne.this.f4952s.c(((Integer) pair.first).intValue(), (mg.n3) pair.second);
        }

        public final /* synthetic */ void rs(Pair pair, ur.i4 i4Var, ur.c cVar) {
            ne.this.f4952s.yt(((Integer) pair.first).intValue(), (mg.n3) pair.second, i4Var, cVar);
        }

        @Override // ur.b
        public void u(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar, final IOException iOException, final boolean z) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.i3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.o4(pairJ, i4Var, cVar, iOException, z);
                    }
                });
            }
        }

        public final /* synthetic */ void ut(Pair pair) {
            ne.this.f4952s.zn(((Integer) pair.first).intValue(), (mg.n3) pair.second);
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void w(int i, @Nullable mg.n3 n3Var, final Exception exc) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.ro
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.y5(pairJ, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void xc(int i, @Nullable mg.n3 n3Var) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.cs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.xg(pairJ);
                    }
                });
            }
        }

        public final /* synthetic */ void xg(Pair pair) {
            ne.this.f4952s.xc(((Integer) pair.first).intValue(), (mg.n3) pair.second);
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void y(int i, @Nullable mg.n3 n3Var, final int i5) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.yk
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.f7(pairJ, i5);
                    }
                });
            }
        }

        public final /* synthetic */ void y5(Pair pair, Exception exc) {
            ne.this.f4952s.w(((Integer) pair.first).intValue(), (mg.n3) pair.second, exc);
        }

        @Override // ur.b
        public void yt(int i, @Nullable mg.n3 n3Var, final ur.i4 i4Var, final ur.c cVar) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.ix
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.rs(pairJ, i4Var, cVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void z(int i, @Nullable mg.n3 n3Var) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.j3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.k(pairJ);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.v
        public void zn(int i, @Nullable mg.n3 n3Var) {
            final Pair<Integer, mg.n3> pairJ = j(i, n3Var);
            if (pairJ != null) {
                ne.this.f4947c5.c5(new Runnable() { // from class: ft.mp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.y.ut(pairJ);
                    }
                });
            }
        }
    }

    public static final class zn implements w9 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f4956gv;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f4957v;
        public final ur.n y;
        public final List<mg.n3> zn = new ArrayList();
        public final Object n3 = new Object();

        public zn(ur.mg mgVar, boolean z) {
            this.y = new ur.n(mgVar, z);
        }

        @Override // ft.w9
        public xq n3() {
            return this.y.vp();
        }

        @Override // ft.w9
        public Object y() {
            return this.n3;
        }

        public void zn(int i) {
            this.f4956gv = i;
            this.f4957v = false;
            this.zn.clear();
        }
    }

    public ne(gv gvVar, zo.y yVar, v0.p pVar, zo.gn gnVar) {
        this.y = gnVar;
        this.f4954v = gvVar;
        this.f4952s = yVar;
        this.f4947c5 = pVar;
    }

    public static int mt(zn znVar, int i) {
        return i + znVar.f4956gv;
    }

    public static Object tl(Object obj) {
        return ft.y.c(obj);
    }

    public static Object w(zn znVar, Object obj) {
        return ft.y.rz(znVar.n3, obj);
    }

    @Nullable
    public static mg.n3 wz(zn znVar, mg.n3 n3Var) {
        for (int i = 0; i < znVar.zn.size(); i++) {
            if (znVar.zn.get(i).f8549gv == n3Var.f8549gv) {
                return n3Var.zn(w(znVar, n3Var.y));
            }
        }
        return null;
    }

    public static Object xc(Object obj) {
        return ft.y.d0(obj);
    }

    public xq a(int i, List<zn> list, ur.u uVar) {
        if (!list.isEmpty()) {
            this.f4951i9 = uVar;
            for (int i5 = i; i5 < list.size() + i; i5++) {
                zn znVar = list.get(i5 - i);
                if (i5 > 0) {
                    zn znVar2 = this.n3.get(i5 - 1);
                    znVar.zn(znVar2.f4956gv + znVar2.y.vp().z());
                } else {
                    znVar.zn(0);
                }
                fb(i5, znVar.y.vp().z());
                this.n3.add(i5, znVar);
                this.f4950gv.put(znVar.n3, znVar);
                if (this.f4948f) {
                    f3(znVar);
                    if (this.zn.isEmpty()) {
                        this.f4949fb.add(znVar);
                    } else {
                        i9(znVar);
                    }
                }
            }
        }
        return c5();
    }

    public void c(ur.d0 d0Var) {
        zn znVar = (zn) v0.y.v(this.zn.remove(d0Var));
        znVar.y.d(d0Var);
        znVar.zn.remove(((ur.f3) d0Var).y);
        if (!this.zn.isEmpty()) {
            f();
        }
        r(znVar);
    }

    public xq c5() {
        if (this.n3.isEmpty()) {
            return xq.y;
        }
        int iZ = 0;
        for (int i = 0; i < this.n3.size(); i++) {
            zn znVar = this.n3.get(i);
            znVar.f4956gv = iZ;
            iZ += znVar.y.vp().z();
        }
        return new ia(this.n3, this.f4951i9);
    }

    public boolean co() {
        return this.f4948f;
    }

    public xq d0(int i, int i5, ur.u uVar) {
        v0.y.y(i >= 0 && i <= i5 && i5 <= p());
        this.f4951i9 = uVar;
        fh(i, i5);
        return c5();
    }

    public final void f() {
        Iterator<zn> it = this.f4949fb.iterator();
        while (it.hasNext()) {
            zn next = it.next();
            if (next.zn.isEmpty()) {
                i9(next);
                it.remove();
            }
        }
    }

    public final void f3(zn znVar) {
        ur.n nVar = znVar.y;
        mg.zn znVar2 = new mg.zn() { // from class: ft.w2
            @Override // ur.mg.zn
            public final void y(ur.mg mgVar, xq xqVar) {
                this.y.z(mgVar, xqVar);
            }
        };
        y yVar = new y(znVar);
        this.f4946a.put(znVar, new n3(nVar, znVar2, yVar));
        nVar.k(v0.ut.n(), yVar);
        nVar.o(v0.ut.n(), yVar);
        nVar.hw(znVar2, this.f4953t, this.y);
    }

    public final void fb(int i, int i5) {
        while (i < this.n3.size()) {
            this.n3.get(i).f4956gv += i5;
            i++;
        }
    }

    public final void fh(int i, int i5) {
        for (int i8 = i5 - 1; i8 >= i; i8--) {
            zn znVarRemove = this.n3.remove(i8);
            this.f4950gv.remove(znVarRemove.n3);
            fb(i8, -znVarRemove.y.vp().z());
            znVarRemove.f4957v = true;
            if (this.f4948f) {
                r(znVarRemove);
            }
        }
    }

    public void i4(@Nullable r0.o oVar) {
        v0.y.fb(!this.f4948f);
        this.f4953t = oVar;
        for (int i = 0; i < this.n3.size(); i++) {
            zn znVar = this.n3.get(i);
            f3(znVar);
            this.f4949fb.add(znVar);
        }
        this.f4948f = true;
    }

    public final void i9(zn znVar) {
        n3 n3Var = this.f4946a.get(znVar);
        if (n3Var != null) {
            n3Var.y.ej(n3Var.n3);
        }
    }

    public xq mg(ur.u uVar) {
        int iP = p();
        if (uVar.getLength() != iP) {
            uVar = uVar.gv().a(0, iP);
        }
        this.f4951i9 = uVar;
        return c5();
    }

    public void n() {
        for (n3 n3Var : this.f4946a.values()) {
            try {
                n3Var.y.y5(n3Var.n3);
            } catch (RuntimeException e4) {
                v0.r.gv("MediaSourceList", "Failed to release child source.", e4);
            }
            n3Var.y.f7(n3Var.zn);
            n3Var.y.j(n3Var.zn);
        }
        this.f4946a.clear();
        this.f4949fb.clear();
        this.f4948f = false;
    }

    public int p() {
        return this.n3.size();
    }

    public final void r(zn znVar) {
        if (znVar.f4957v && znVar.zn.isEmpty()) {
            n3 n3Var = (n3) v0.y.v(this.f4946a.remove(znVar));
            n3Var.y.y5(n3Var.n3);
            n3Var.y.f7(n3Var.zn);
            n3Var.y.j(n3Var.zn);
            this.f4949fb.remove(znVar);
        }
    }

    public xq rz(List<zn> list, ur.u uVar) {
        fh(0, this.n3.size());
        return a(this.n3.size(), list, uVar);
    }

    public ur.d0 s(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        Object objXc = xc(n3Var.y);
        mg.n3 n3VarZn = n3Var.zn(tl(n3Var.y));
        zn znVar = (zn) v0.y.v(this.f4950gv.get(objXc));
        t(znVar);
        znVar.zn.add(n3VarZn);
        ur.f3 f3VarZn = znVar.y.zn(n3VarZn, n3Var2, j);
        this.zn.put(f3VarZn, znVar);
        f();
        return f3VarZn;
    }

    public final void t(zn znVar) {
        this.f4949fb.add(znVar);
        n3 n3Var = this.f4946a.get(znVar);
        if (n3Var != null) {
            n3Var.y.w(n3Var.n3);
        }
    }

    public xq x4(int i, int i5, int i8, ur.u uVar) {
        v0.y.y(i >= 0 && i <= i5 && i5 <= p() && i8 >= 0);
        this.f4951i9 = uVar;
        if (i == i5 || i == i8) {
            return c5();
        }
        int iMin = Math.min(i, i8);
        int iMax = Math.max(((i5 - i) + i8) - 1, i5 - 1);
        int iZ = this.n3.get(iMin).f4956gv;
        v0.ut.o0(this.n3, i, i5, i8);
        while (iMin <= iMax) {
            zn znVar = this.n3.get(iMin);
            znVar.f4956gv = iZ;
            iZ += znVar.y.vp().z();
            iMin++;
        }
        return c5();
    }

    public final /* synthetic */ void z(ur.mg mgVar, xq xqVar) {
        this.f4954v.n3();
    }
}

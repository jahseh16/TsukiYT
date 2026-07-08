package h6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.v;
import ft.g;
import ft.p1;
import ft.u0;
import h6.i9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r0.mg;
import r0.ta;
import ur.b;
import ur.c;
import ur.en;
import ur.f7;
import ur.i4;
import ur.jz;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class c5<T extends i9> implements en, jz, ta.n3<a>, ta.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5291b;
    public final f7[] c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final ta f5292co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f5293d;
    public final zn d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    @Nullable
    public n3<T> f5294ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f5295f;
    public final List<h6.y> f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final g[] f5296fb;

    @Nullable
    public a fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public int f5297hw;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    @Nullable
    public h6.y f5298j5;
    public final f7 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mg f5299p;
    public boolean qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<h6.y> f5300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean[] f5301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jz.y<c5<T>> f5302t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f5303v;
    public final b.y w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5304x;
    public final int y;
    public final s z;

    public interface n3<T extends i9> {
        void n3(c5<T> c5Var);
    }

    public c5(int i, @Nullable int[] iArr, @Nullable g[] gVarArr, T t3, jz.y<c5<T>> yVar, r0.n3 n3Var, long j, com.google.android.exoplayer2.drm.a aVar, v.y yVar2, mg mgVar, b.y yVar3) {
        this.y = i;
        int i5 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f5303v = iArr;
        this.f5296fb = gVarArr == null ? new g[0] : gVarArr;
        this.f5295f = t3;
        this.f5302t = yVar;
        this.w = yVar3;
        this.f5299p = mgVar;
        this.f5292co = new ta("ChunkSampleStream");
        this.z = new s();
        ArrayList<h6.y> arrayList = new ArrayList<>();
        this.f5300r = arrayList;
        this.f3 = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.c = new f7[length];
        this.f5301s = new boolean[length];
        int i8 = length + 1;
        int[] iArr2 = new int[i8];
        f7[] f7VarArr = new f7[i8];
        f7 f7VarF = f7.f(n3Var, aVar, yVar2);
        this.n = f7VarF;
        iArr2[0] = i;
        f7VarArr[0] = f7VarF;
        while (i5 < length) {
            f7 f7VarT = f7.t(n3Var);
            this.c[i5] = f7VarT;
            int i10 = i5 + 1;
            f7VarArr[i10] = f7VarT;
            iArr2[i10] = this.f5303v[i5];
            i5 = i10;
        }
        this.d0 = new zn(iArr2, f7VarArr);
        this.f5304x = j;
        this.f5291b = j;
    }

    @Override // ur.en
    public int a(u0 u0Var, di.fb fbVar, int i) {
        if (z6()) {
            return -3;
        }
        h6.y yVar = this.f5298j5;
        if (yVar != null && yVar.fb(0) <= this.n.rz()) {
            return -3;
        }
        ej();
        return this.n.o(u0Var, fbVar, i, this.qn);
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: a8, reason: merged with bridge method [inline-methods] */
    public void j5(a aVar, long j, long j4, boolean z) {
        this.fh = null;
        this.f5298j5 = null;
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, aVar.y());
        this.f5299p.gv(aVar.y);
        this.w.mt(i4Var, aVar.zn, this.y, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        if (z) {
            return;
        }
        if (z6()) {
            hw();
        } else if (d(aVar)) {
            d0(this.f5300r.size() - 1);
            if (this.f5300r.isEmpty()) {
                this.f5304x = this.f5291b;
            }
        }
        this.f5302t.a(this);
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(a aVar, long j, long j4, IOException iOException, int i) {
        ta.zn znVarS;
        long jY = aVar.y();
        boolean zD = d(aVar);
        int size = this.f5300r.size() - 1;
        boolean z = (jY != 0 && zD && ta(size)) ? false : true;
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, jY);
        mg.zn znVar = new mg.zn(i4Var, new c(aVar.zn, this.y, aVar.f5288gv, aVar.f5290v, aVar.f5285a, ut.gf(aVar.f5287fb), ut.gf(aVar.f5289s)), iOException, i);
        if (!this.f5295f.i9(aVar, z, znVar, this.f5299p)) {
            znVarS = null;
        } else if (z) {
            znVarS = ta.f7548a;
            if (zD) {
                v0.y.fb(d0(size) == aVar);
                if (this.f5300r.isEmpty()) {
                    this.f5304x = this.f5291b;
                }
            }
        } else {
            r.c5("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            znVarS = null;
        }
        if (znVarS == null) {
            long jY2 = this.f5299p.y(znVar);
            znVarS = jY2 != -9223372036854775807L ? ta.s(false, jY2) : ta.f7549fb;
        }
        boolean zZn = znVarS.zn();
        this.w.i4(i4Var, aVar.zn, this.y, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s, iOException, !zZn);
        if (!zZn) {
            this.fh = null;
            this.f5299p.gv(aVar.y);
            this.f5302t.a(this);
        }
        return znVarS;
    }

    public final void c(int i) {
        v0.y.fb(!this.f5292co.i9());
        int size = this.f5300r.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!ta(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = mg().f5289s;
        h6.y yVarD0 = d0(i);
        if (this.f5300r.isEmpty()) {
            this.f5304x = this.f5291b;
        }
        this.qn = false;
        this.w.mg(this.y, yVarD0.f5287fb, j);
    }

    public void co(long j, boolean z) {
        if (z6()) {
            return;
        }
        int iF3 = this.n.f3();
        this.n.p(j, z, true);
        int iF32 = this.n.f3();
        if (iF32 > iF3) {
            long jN = this.n.n();
            int i = 0;
            while (true) {
                f7[] f7VarArr = this.c;
                if (i >= f7VarArr.length) {
                    break;
                }
                f7VarArr[i].p(jN, z, this.f5301s[i]);
                i++;
            }
        }
        n(iF32);
    }

    public final boolean d(a aVar) {
        return aVar instanceof h6.y;
    }

    public final h6.y d0(int i) {
        h6.y yVar = this.f5300r.get(i);
        ArrayList<h6.y> arrayList = this.f5300r;
        ut.w2(arrayList, i, arrayList.size());
        this.f5297hw = Math.max(this.f5297hw, this.f5300r.size());
        int i5 = 0;
        this.n.r(yVar.fb(0));
        while (true) {
            f7[] f7VarArr = this.c;
            if (i5 >= f7VarArr.length) {
                return yVar;
            }
            f7 f7Var = f7VarArr[i5];
            i5++;
            f7Var.r(yVar.fb(i5));
        }
    }

    public final void ej() {
        int iK5 = k5(this.n.rz(), this.f5297hw - 1);
        while (true) {
            int i = this.f5297hw;
            if (i > iK5) {
                return;
            }
            this.f5297hw = i + 1;
            ud(i);
        }
    }

    @Override // ur.jz
    public long fb() {
        if (this.qn) {
            return Long.MIN_VALUE;
        }
        if (z6()) {
            return this.f5304x;
        }
        long jMax = this.f5291b;
        h6.y yVarMg = mg();
        if (!yVarMg.a()) {
            if (this.f5300r.size() > 1) {
                yVarMg = this.f5300r.get(r2.size() - 2);
            } else {
                yVarMg = null;
            }
        }
        if (yVarMg != null) {
            jMax = Math.max(jMax, yVarMg.f5289s);
        }
        return Math.max(jMax, this.n.c());
    }

    public long gv(long j, p1 p1Var) {
        return this.f5295f.gv(j, p1Var);
    }

    public final void hw() {
        this.n.ut();
        for (f7 f7Var : this.c) {
            f7Var.ut();
        }
    }

    @Override // ur.en
    public boolean isReady() {
        return !z6() && this.n.x(this.qn);
    }

    public final int k5(int i, int i5) {
        do {
            i5++;
            if (i5 >= this.f5300r.size()) {
                return this.f5300r.size() - 1;
            }
        } while (this.f5300r.get(i5).fb(0) <= i);
        return i5 - 1;
    }

    public final h6.y mg() {
        return this.f5300r.get(r0.size() - 1);
    }

    public final void n(int i) {
        int iMin = Math.min(k5(i, 0), this.f5297hw);
        if (iMin > 0) {
            ut.w2(this.f5300r, 0, iMin);
            this.f5297hw -= iMin;
        }
    }

    @Override // ur.en
    public void n3() throws IOException {
        this.f5292co.n3();
        this.n.yt();
        if (this.f5292co.i9()) {
            return;
        }
        this.f5295f.n3();
    }

    public c5<T>.y o(long j, int i) {
        for (int i5 = 0; i5 < this.c.length; i5++) {
            if (this.f5303v[i5] == i) {
                v0.y.fb(!this.f5301s[i5]);
                this.f5301s[i5] = true;
                this.c[i5].en(j, true);
                return new y(this, this.c[i5], i5);
            }
        }
        throw new IllegalStateException();
    }

    public void qn(long j) {
        h6.y yVar;
        this.f5291b = j;
        if (z6()) {
            this.f5304x = j;
            return;
        }
        int i = 0;
        for (int i5 = 0; i5 < this.f5300r.size(); i5++) {
            yVar = this.f5300r.get(i5);
            long j4 = yVar.f5287fb;
            if (j4 == j && yVar.f5336f == -9223372036854775807L) {
                break;
            } else {
                if (j4 > j) {
                    break;
                }
            }
        }
        yVar = null;
        if (yVar != null ? this.n.f7(yVar.fb(0)) : this.n.en(j, j < zn())) {
            this.f5297hw = k5(this.n.rz(), 0);
            f7[] f7VarArr = this.c;
            int length = f7VarArr.length;
            while (i < length) {
                f7VarArr[i].en(j, true);
                i++;
            }
            return;
        }
        this.f5304x = j;
        this.qn = false;
        this.f5300r.clear();
        this.f5297hw = 0;
        if (!this.f5292co.i9()) {
            this.f5292co.fb();
            hw();
            return;
        }
        this.n.mt();
        f7[] f7VarArr2 = this.c;
        int length2 = f7VarArr2.length;
        while (i < length2) {
            f7VarArr2[i].mt();
            i++;
        }
        this.f5292co.a();
    }

    public T rz() {
        return this.f5295f;
    }

    @Override // ur.jz
    public void s(long j) {
        if (this.f5292co.c5() || z6()) {
            return;
        }
        if (!this.f5292co.i9()) {
            int iC5 = this.f5295f.c5(j, this.f3);
            if (iC5 < this.f5300r.size()) {
                c(iC5);
                return;
            }
            return;
        }
        a aVar = (a) v0.y.v(this.fh);
        if (!(d(aVar) && ta(this.f5300r.size() - 1)) && this.f5295f.a(j, aVar, this.f3)) {
            this.f5292co.a();
            if (d(aVar)) {
                this.f5298j5 = (h6.y) aVar;
            }
        }
    }

    public final boolean ta(int i) {
        int iRz;
        h6.y yVar = this.f5300r.get(i);
        if (this.n.rz() > yVar.fb(0)) {
            return true;
        }
        int i5 = 0;
        do {
            f7[] f7VarArr = this.c;
            if (i5 >= f7VarArr.length) {
                return false;
            }
            iRz = f7VarArr[i5].rz();
            i5++;
        } while (iRz <= yVar.fb(i5));
        return true;
    }

    @Override // r0.ta.a
    public void tl() {
        this.n.j();
        for (f7 f7Var : this.c) {
            f7Var.j();
        }
        this.f5295f.release();
        n3<T> n3Var = this.f5294ej;
        if (n3Var != null) {
            n3Var.n3(this);
        }
    }

    public final void ud(int i) {
        h6.y yVar = this.f5300r.get(i);
        g gVar = yVar.f5288gv;
        if (!gVar.equals(this.f5293d)) {
            this.w.c5(this.y, gVar, yVar.f5290v, yVar.f5285a, yVar.f5287fb);
        }
        this.f5293d = gVar;
    }

    @Override // ur.jz
    public boolean v(long j) {
        List<h6.y> listEmptyList;
        long j4;
        if (this.qn || this.f5292co.i9() || this.f5292co.c5()) {
            return false;
        }
        boolean zZ6 = z6();
        if (zZ6) {
            listEmptyList = Collections.emptyList();
            j4 = this.f5304x;
        } else {
            listEmptyList = this.f3;
            j4 = mg().f5289s;
        }
        this.f5295f.s(j, j4, listEmptyList, this.z);
        s sVar = this.z;
        boolean z = sVar.n3;
        a aVar = sVar.y;
        sVar.y();
        if (z) {
            this.f5304x = -9223372036854775807L;
            this.qn = true;
            return true;
        }
        if (aVar == null) {
            return false;
        }
        this.fh = aVar;
        if (d(aVar)) {
            h6.y yVar = (h6.y) aVar;
            if (zZ6) {
                long j7 = yVar.f5287fb;
                long j8 = this.f5304x;
                if (j7 != j8) {
                    this.n.u(j8);
                    for (f7 f7Var : this.c) {
                        f7Var.u(this.f5304x);
                    }
                }
                this.f5304x = -9223372036854775807L;
            }
            yVar.c5(this.d0);
            this.f5300r.add(yVar);
        } else if (aVar instanceof tl) {
            ((tl) aVar).v(this.d0);
        }
        this.w.d0(new i4(aVar.y, aVar.n3, this.f5292co.wz(aVar, this, this.f5299p.zn(aVar.zn))), aVar.zn, this.y, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        return true;
    }

    public void vl(@Nullable n3<T> n3Var) {
        this.f5294ej = n3Var;
        this.n.qn();
        for (f7 f7Var : this.c) {
            f7Var.qn();
        }
        this.f5292co.tl(this);
    }

    @Override // ur.en
    public int w(long j) {
        if (z6()) {
            return 0;
        }
        int iTa = this.n.ta(j, this.qn);
        h6.y yVar = this.f5298j5;
        if (yVar != null) {
            iTa = Math.min(iTa, yVar.fb(0) - this.n.rz());
        }
        this.n.dm(iTa);
        ej();
        return iTa;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void xc(a aVar, long j, long j4) {
        this.fh = null;
        this.f5295f.v(aVar);
        i4 i4Var = new i4(aVar.y, aVar.n3, aVar.gv(), aVar.zn(), j, j4, aVar.y());
        this.f5299p.gv(aVar.y);
        this.w.r(i4Var, aVar.zn, this.y, aVar.f5288gv, aVar.f5290v, aVar.f5285a, aVar.f5287fb, aVar.f5289s);
        this.f5302t.a(this);
    }

    @Override // ur.jz
    public boolean y() {
        return this.f5292co.i9();
    }

    public void yt() {
        vl(null);
    }

    public boolean z6() {
        return this.f5304x != -9223372036854775807L;
    }

    @Override // ur.jz
    public long zn() {
        if (z6()) {
            return this.f5304x;
        }
        if (this.qn) {
            return Long.MIN_VALUE;
        }
        return mg().f5289s;
    }

    public final class y implements en {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f5306fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f5307s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final f7 f5308v;
        public final c5<T> y;

        public y(c5<T> c5Var, f7 f7Var, int i) {
            this.y = c5Var;
            this.f5308v = f7Var;
            this.f5306fb = i;
        }

        private void y() {
            if (this.f5307s) {
                return;
            }
            c5.this.w.c5(c5.this.f5303v[this.f5306fb], c5.this.f5296fb[this.f5306fb], 0, null, c5.this.f5291b);
            this.f5307s = true;
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            if (c5.this.z6()) {
                return -3;
            }
            if (c5.this.f5298j5 != null && c5.this.f5298j5.fb(this.f5306fb + 1) <= this.f5308v.rz()) {
                return -3;
            }
            y();
            return this.f5308v.o(u0Var, fbVar, i, c5.this.qn);
        }

        @Override // ur.en
        public boolean isReady() {
            return !c5.this.z6() && this.f5308v.x(c5.this.qn);
        }

        @Override // ur.en
        public int w(long j) {
            if (c5.this.z6()) {
                return 0;
            }
            int iTa = this.f5308v.ta(j, c5.this.qn);
            if (c5.this.f5298j5 != null) {
                iTa = Math.min(iTa, c5.this.f5298j5.fb(this.f5306fb + 1) - this.f5308v.rz());
            }
            this.f5308v.dm(iTa);
            if (iTa > 0) {
                y();
            }
            return iTa;
        }

        public void zn() {
            v0.y.fb(c5.this.f5301s[this.f5306fb]);
            c5.this.f5301s[this.f5306fb] = false;
        }

        @Override // ur.en
        public void n3() {
        }
    }
}

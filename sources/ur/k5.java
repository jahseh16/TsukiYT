package ur;

import androidx.annotation.Nullable;
import ft.g;
import ft.p1;
import ft.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import ur.d0;

/* JADX INFO: loaded from: classes.dex */
public final class k5 implements d0, d0.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public jz f8593co;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final c5 f8595fb;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public d0.y f8598t;

    @Nullable
    public lc w;
    public final d0[] y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList<d0> f8597s = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<rs, rs> f8594f = new HashMap<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final IdentityHashMap<en, Integer> f8599v = new IdentityHashMap<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d0[] f8596p = new d0[0];

    public static final class n3 implements d0, d0.y {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public d0.y f8600fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f8601v;
        public final d0 y;

        public n3(d0 d0Var, long j) {
            this.y = d0Var;
            this.f8601v = j;
        }

        @Override // ur.d0
        public void c5(d0.y yVar, long j) {
            this.f8600fb = yVar;
            this.y.c5(this, j - this.f8601v);
        }

        @Override // ur.d0
        public void co(long j, boolean z) {
            this.y.co(j - this.f8601v, z);
        }

        @Override // ur.d0
        public long f(n0.c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
            en[] enVarArr2 = new en[enVarArr.length];
            int i = 0;
            while (true) {
                en enVarY = null;
                if (i >= enVarArr.length) {
                    break;
                }
                zn znVar = (zn) enVarArr[i];
                if (znVar != null) {
                    enVarY = znVar.y();
                }
                enVarArr2[i] = enVarY;
                i++;
            }
            long jF = this.y.f(cVarArr, zArr, enVarArr2, zArr2, j - this.f8601v);
            for (int i5 = 0; i5 < enVarArr.length; i5++) {
                en enVar = enVarArr2[i5];
                if (enVar == null) {
                    enVarArr[i5] = null;
                } else {
                    en enVar2 = enVarArr[i5];
                    if (enVar2 == null || ((zn) enVar2).y() != enVar) {
                        enVarArr[i5] = new zn(enVar, this.f8601v);
                    }
                }
            }
            return jF + this.f8601v;
        }

        @Override // ur.d0, ur.jz
        public long fb() {
            long jFb = this.y.fb();
            if (jFb == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f8601v + jFb;
        }

        @Override // ur.d0
        public long gv(long j, p1 p1Var) {
            return this.y.gv(j - this.f8601v, p1Var) + this.f8601v;
        }

        @Override // ur.d0
        public long i9(long j) {
            return this.y.i9(j - this.f8601v) + this.f8601v;
        }

        @Override // ur.d0
        public lc mt() {
            return this.y.mt();
        }

        @Override // ur.d0, ur.jz
        public void s(long j) {
            this.y.s(j - this.f8601v);
        }

        @Override // ur.d0
        public long t() {
            long jT = this.y.t();
            if (jT == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f8601v + jT;
        }

        @Override // ur.d0, ur.jz
        public boolean v(long j) {
            return this.y.v(j - this.f8601v);
        }

        @Override // ur.jz.y
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public void a(d0 d0Var) {
            ((d0.y) v0.y.v(this.f8600fb)).a(this);
        }

        @Override // ur.d0
        public void wz() throws IOException {
            this.y.wz();
        }

        @Override // ur.d0.y
        public void xc(d0 d0Var) {
            ((d0.y) v0.y.v(this.f8600fb)).xc(this);
        }

        @Override // ur.d0, ur.jz
        public boolean y() {
            return this.y.y();
        }

        @Override // ur.d0, ur.jz
        public long zn() {
            long jZn = this.y.zn();
            if (jZn == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f8601v + jZn;
        }
    }

    public static final class y implements n0.c {
        public final rs n3;
        public final n0.c y;

        public y(n0.c cVar, rs rsVar) {
            this.y = cVar;
            this.n3 = rsVar;
        }

        @Override // n0.rz
        public int a(int i) {
            return this.y.a(i);
        }

        @Override // n0.c
        public void c5(float f3) {
            this.y.c5(f3);
        }

        @Override // n0.c
        public int co() {
            return this.y.co();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return this.y.equals(yVar.y) && this.n3.equals(yVar.n3);
        }

        @Override // n0.c
        public void f() {
            this.y.f();
        }

        @Override // n0.c
        public void fb() {
            this.y.fb();
        }

        @Override // n0.c
        public boolean gv(int i, long j) {
            return this.y.gv(i, j);
        }

        public int hashCode() {
            return ((527 + this.n3.hashCode()) * 31) + this.y.hashCode();
        }

        @Override // n0.c
        @Nullable
        public Object i9() {
            return this.y.i9();
        }

        @Override // n0.rz
        public int length() {
            return this.y.length();
        }

        @Override // n0.c
        public g mt() {
            return this.y.mt();
        }

        @Override // n0.c
        public int n3() {
            return this.y.n3();
        }

        @Override // n0.c
        public int p() {
            return this.y.p();
        }

        @Override // n0.c
        public void r() {
            this.y.r();
        }

        @Override // n0.rz
        public int s(g gVar) {
            return this.y.s(gVar);
        }

        @Override // n0.rz
        public int t(int i) {
            return this.y.t(i);
        }

        @Override // n0.rz
        public rs tl() {
            return this.n3;
        }

        @Override // n0.rz
        public g v(int i) {
            return this.y.v(i);
        }

        @Override // n0.c
        public boolean w(long j, h6.a aVar, List<? extends h6.wz> list) {
            return this.y.w(j, aVar, list);
        }

        @Override // n0.c
        public void wz(boolean z) {
            this.y.wz(z);
        }

        @Override // n0.c
        public int xc(long j, List<? extends h6.wz> list) {
            return this.y.xc(j, list);
        }

        @Override // n0.c
        public void y() {
            this.y.y();
        }

        @Override // n0.c
        public void z(long j, long j4, long j7, List<? extends h6.wz> list, h6.xc[] xcVarArr) {
            this.y.z(j, j4, j7, list, xcVarArr);
        }

        @Override // n0.c
        public boolean zn(int i, long j) {
            return this.y.zn(i, j);
        }
    }

    public static final class zn implements en {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final long f8602v;
        public final en y;

        public zn(en enVar, long j) {
            this.y = enVar;
            this.f8602v = j;
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            int iA = this.y.a(u0Var, fbVar, i);
            if (iA == -4) {
                fbVar.f3178f = Math.max(0L, fbVar.f3178f + this.f8602v);
            }
            return iA;
        }

        @Override // ur.en
        public boolean isReady() {
            return this.y.isReady();
        }

        @Override // ur.en
        public void n3() throws IOException {
            this.y.n3();
        }

        @Override // ur.en
        public int w(long j) {
            return this.y.w(j - this.f8602v);
        }

        public en y() {
            return this.y;
        }
    }

    public k5(c5 c5Var, long[] jArr, d0... d0VarArr) {
        this.f8595fb = c5Var;
        this.y = d0VarArr;
        this.f8593co = c5Var.y(new jz[0]);
        for (int i = 0; i < d0VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.y[i] = new n3(d0VarArr[i], j);
            }
        }
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f8598t = yVar;
        Collections.addAll(this.f8597s, this.y);
        for (d0 d0Var : this.y) {
            d0Var.c5(this, j);
        }
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        for (d0 d0Var : this.f8596p) {
            d0Var.co(j, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.d0
    public long f(n0.c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        Integer num;
        int[] iArr = new int[cVarArr.length];
        int[] iArr2 = new int[cVarArr.length];
        int i = 0;
        while (true) {
            if (i >= cVarArr.length) {
                break;
            }
            en enVar = enVarArr[i];
            num = enVar != null ? this.f8599v.get(enVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            n0.c cVar = cVarArr[i];
            if (cVar != null) {
                String str = cVar.tl().f8639v;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.f8599v.clear();
        int length = cVarArr.length;
        en[] enVarArr2 = new en[length];
        en[] enVarArr3 = new en[cVarArr.length];
        Object[] objArr = new n0.c[cVarArr.length];
        ArrayList arrayList = new ArrayList(this.y.length);
        long j4 = j;
        int i5 = 0;
        while (i5 < this.y.length) {
            for (int i8 = 0; i8 < cVarArr.length; i8++) {
                enVarArr3[i8] = iArr[i8] == i5 ? enVarArr[i8] : num;
                if (iArr2[i8] == i5) {
                    n0.c cVar2 = (n0.c) v0.y.v(cVarArr[i8]);
                    objArr[i8] = new y(cVar2, (rs) v0.y.v(this.f8594f.get(cVar2.tl())));
                } else {
                    objArr[i8] = num;
                }
            }
            int i10 = i5;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long jF = this.y[i5].f(objArr, zArr, enVarArr3, zArr2, j4);
            if (i10 == 0) {
                j4 = jF;
            } else if (jF != j4) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i11 = 0; i11 < cVarArr.length; i11++) {
                if (iArr2[i11] == i10) {
                    en enVar2 = (en) v0.y.v(enVarArr3[i11]);
                    enVarArr2[i11] = enVarArr3[i11];
                    this.f8599v.put(enVar2, Integer.valueOf(i10));
                    z = true;
                } else if (iArr[i11] == i10) {
                    v0.y.fb(enVarArr3[i11] == 0);
                }
            }
            if (z) {
                arrayList2.add(this.y[i10]);
            }
            i5 = i10 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            num = null;
        }
        System.arraycopy(enVarArr2, 0, enVarArr, 0, length);
        d0[] d0VarArr = (d0[]) arrayList.toArray(new d0[0]);
        this.f8596p = d0VarArr;
        this.f8593co = this.f8595fb.y(d0VarArr);
        return j4;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return this.f8593co.fb();
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        d0[] d0VarArr = this.f8596p;
        return (d0VarArr.length > 0 ? d0VarArr[0] : this.y[0]).gv(j, p1Var);
    }

    @Override // ur.d0
    public long i9(long j) {
        long jI9 = this.f8596p[0].i9(j);
        int i = 1;
        while (true) {
            d0[] d0VarArr = this.f8596p;
            if (i >= d0VarArr.length) {
                return jI9;
            }
            if (d0VarArr[i].i9(jI9) != jI9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // ur.d0
    public lc mt() {
        return (lc) v0.y.v(this.w);
    }

    public d0 n3(int i) {
        d0 d0Var = this.y[i];
        return d0Var instanceof n3 ? ((n3) d0Var).y : d0Var;
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
        this.f8593co.s(j);
    }

    @Override // ur.d0
    public long t() {
        long j = -9223372036854775807L;
        for (d0 d0Var : this.f8596p) {
            long jT = d0Var.t();
            if (jT == -9223372036854775807L) {
                if (j != -9223372036854775807L && d0Var.i9(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (d0 d0Var2 : this.f8596p) {
                    if (d0Var2 == d0Var) {
                        break;
                    }
                    if (d0Var2.i9(jT) != jT) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jT;
            } else if (jT != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        if (this.f8597s.isEmpty()) {
            return this.f8593co.v(j);
        }
        int size = this.f8597s.size();
        for (int i = 0; i < size; i++) {
            this.f8597s.get(i).v(j);
        }
        return false;
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void a(d0 d0Var) {
        ((d0.y) v0.y.v(this.f8598t)).a(this);
    }

    @Override // ur.d0
    public void wz() throws IOException {
        for (d0 d0Var : this.y) {
            d0Var.wz();
        }
    }

    @Override // ur.d0.y
    public void xc(d0 d0Var) {
        this.f8597s.remove(d0Var);
        if (!this.f8597s.isEmpty()) {
            return;
        }
        int i = 0;
        for (d0 d0Var2 : this.y) {
            i += d0Var2.mt().y;
        }
        rs[] rsVarArr = new rs[i];
        int i5 = 0;
        int i8 = 0;
        while (true) {
            d0[] d0VarArr = this.y;
            if (i5 >= d0VarArr.length) {
                this.w = new lc(rsVarArr);
                ((d0.y) v0.y.v(this.f8598t)).xc(this);
                return;
            }
            lc lcVarMt = d0VarArr[i5].mt();
            int i10 = lcVarMt.y;
            int i11 = 0;
            while (i11 < i10) {
                rs rsVarN3 = lcVarMt.n3(i11);
                rs rsVarN32 = rsVarN3.n3(i5 + ":" + rsVarN3.f8639v);
                this.f8594f.put(rsVarN32, rsVarN3);
                rsVarArr[i8] = rsVarN32;
                i11++;
                i8++;
            }
            i5++;
        }
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.f8593co.y();
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return this.f8593co.zn();
    }
}

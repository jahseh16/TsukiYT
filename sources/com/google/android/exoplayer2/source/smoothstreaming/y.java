package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.smoothstreaming.n3;
import e7.y;
import ft.g;
import ft.p1;
import h6.a;
import h6.f;
import h6.fb;
import h6.s;
import h6.v;
import h6.wz;
import java.io.IOException;
import java.util.List;
import n0.c;
import n0.ej;
import r0.d;
import r0.mg;
import r0.o;
import r0.p;
import r0.tl;
import tn.w;
import tn.xc;

/* JADX INFO: loaded from: classes.dex */
public class y implements com.google.android.exoplayer2.source.smoothstreaming.n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e7.y f1872a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1873fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final tl f1874gv;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public IOException f1875s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f1876v;
    public final d y;
    public final fb[] zn;

    public static final class n3 extends h6.n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1877a;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final y.n3 f1878v;

        public n3(y.n3 n3Var, int i, int i5) {
            super(i5, n3Var.f3290f - 1);
            this.f1878v = n3Var;
            this.f1877a = i;
        }

        @Override // h6.xc
        public long n3() {
            return y() + this.f1878v.zn((int) gv());
        }

        @Override // h6.xc
        public long y() {
            zn();
            return this.f1878v.v((int) gv());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.y$y, reason: collision with other inner class name */
    public static final class C0058y implements n3.y {
        public final tl.y y;

        public C0058y(tl.y yVar) {
            this.y = yVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.n3.y
        public com.google.android.exoplayer2.source.smoothstreaming.n3 y(d dVar, e7.y yVar, int i, c cVar, @Nullable o oVar) {
            tl tlVarY = this.y.y();
            if (oVar != null) {
                tlVarY.co(oVar);
            }
            return new y(dVar, yVar, i, cVar, tlVarY);
        }
    }

    public y(d dVar, e7.y yVar, int i, c cVar, tl tlVar) {
        this.y = dVar;
        this.f1872a = yVar;
        this.n3 = i;
        this.f1876v = cVar;
        this.f1874gv = tlVar;
        y.n3 n3Var = yVar.f3283a[i];
        this.zn = new fb[cVar.length()];
        for (int i5 = 0; i5 < this.zn.length; i5++) {
            int iA = cVar.a(i5);
            g gVar = n3Var.f3293i9[iA];
            w[] wVarArr = gVar.d0 != null ? ((y.C0084y) v0.y.v(yVar.f3287v)).zn : null;
            int i8 = n3Var.y;
            this.zn[i5] = new v(new tn.fb(3, null, new xc(iA, i8, n3Var.zn, -9223372036854775807L, yVar.f3284fb, gVar, 0, wVarArr, i8 == 2 ? 4 : 0, null, null)), n3Var.y, gVar);
        }
    }

    public static wz f(g gVar, tl tlVar, Uri uri, int i, long j, long j4, long j7, int i5, @Nullable Object obj, fb fbVar) {
        return new f(tlVar, new p(uri), gVar, i5, obj, j, j4, j7, -9223372036854775807L, i, 1, j, fbVar);
    }

    @Override // h6.i9
    public boolean a(long j, a aVar, List<? extends wz> list) {
        if (this.f1875s != null) {
            return false;
        }
        return this.f1876v.w(j, aVar, list);
    }

    @Override // h6.i9
    public int c5(long j, List<? extends wz> list) {
        return (this.f1875s != null || this.f1876v.length() < 2) ? list.size() : this.f1876v.xc(j, list);
    }

    @Override // h6.i9
    public long gv(long j, p1 p1Var) {
        y.n3 n3Var = this.f1872a.f3283a[this.n3];
        int iGv = n3Var.gv(j);
        long jV = n3Var.v(iGv);
        return p1Var.y(j, jV, (jV >= j || iGv >= n3Var.f3290f + (-1)) ? jV : n3Var.v(iGv + 1));
    }

    @Override // h6.i9
    public boolean i9(a aVar, boolean z, mg.zn znVar, mg mgVar) {
        mg.n3 n3VarN3 = mgVar.n3(ej.zn(this.f1876v), znVar);
        if (z && n3VarN3 != null && n3VarN3.y == 2) {
            c cVar = this.f1876v;
            if (cVar.zn(cVar.s(aVar.f5288gv), n3VarN3.n3)) {
                return true;
            }
        }
        return false;
    }

    @Override // h6.i9
    public void n3() throws IOException {
        IOException iOException = this.f1875s;
        if (iOException != null) {
            throw iOException;
        }
        this.y.n3();
    }

    @Override // h6.i9
    public void release() {
        for (fb fbVar : this.zn) {
            fbVar.release();
        }
    }

    @Override // h6.i9
    public final void s(long j, long j4, List<? extends wz> list, s sVar) {
        int iV;
        long j7 = j4;
        if (this.f1875s != null) {
            return;
        }
        y.n3 n3Var = this.f1872a.f3283a[this.n3];
        if (n3Var.f3290f == 0) {
            sVar.n3 = !r4.f3285gv;
            return;
        }
        if (list.isEmpty()) {
            iV = n3Var.gv(j7);
        } else {
            iV = (int) (list.get(list.size() - 1).v() - ((long) this.f1873fb));
            if (iV < 0) {
                this.f1875s = new ur.n3();
                return;
            }
        }
        if (iV >= n3Var.f3290f) {
            sVar.n3 = !this.f1872a.f3285gv;
            return;
        }
        long j8 = j7 - j;
        long jT = t(j);
        int length = this.f1876v.length();
        h6.xc[] xcVarArr = new h6.xc[length];
        for (int i = 0; i < length; i++) {
            xcVarArr[i] = new n3(n3Var, this.f1876v.a(i), iV);
        }
        this.f1876v.z(j, j8, jT, list, xcVarArr);
        long jV = n3Var.v(iV);
        long jZn = jV + n3Var.zn(iV);
        if (!list.isEmpty()) {
            j7 = -9223372036854775807L;
        }
        long j9 = j7;
        int i5 = iV + this.f1873fb;
        int iN3 = this.f1876v.n3();
        sVar.y = f(this.f1876v.mt(), this.f1874gv, n3Var.y(this.f1876v.a(iN3), iV), i5, jV, jZn, j9, this.f1876v.co(), this.f1876v.i9(), this.zn[iN3]);
    }

    public final long t(long j) {
        e7.y yVar = this.f1872a;
        if (!yVar.f3285gv) {
            return -9223372036854775807L;
        }
        y.n3 n3Var = yVar.f3283a[this.n3];
        int i = n3Var.f3290f - 1;
        return (n3Var.v(i) + n3Var.zn(i)) - j;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.n3
    public void y(c cVar) {
        this.f1876v = cVar;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.n3
    public void zn(e7.y yVar) {
        y.n3[] n3VarArr = this.f1872a.f3283a;
        int i = this.n3;
        y.n3 n3Var = n3VarArr[i];
        int i5 = n3Var.f3290f;
        y.n3 n3Var2 = yVar.f3283a[i];
        if (i5 == 0 || n3Var2.f3290f == 0) {
            this.f1873fb += i5;
        } else {
            int i8 = i5 - 1;
            long jV = n3Var.v(i8) + n3Var.zn(i8);
            long jV2 = n3Var2.v(0);
            if (jV <= jV2) {
                this.f1873fb += i5;
            } else {
                this.f1873fb += n3Var.gv(jV2);
            }
        }
        this.f1872a = yVar;
    }

    @Override // h6.i9
    public void v(a aVar) {
    }
}

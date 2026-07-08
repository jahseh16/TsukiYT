package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.v;
import com.google.android.exoplayer2.source.smoothstreaming.n3;
import e7.y;
import ft.g;
import ft.p1;
import h6.c5;
import java.io.IOException;
import java.util.ArrayList;
import n0.c;
import r0.d;
import r0.mg;
import r0.o;
import ur.b;
import ur.d0;
import ur.en;
import ur.jz;
import ur.lc;
import ur.rs;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements d0, jz.y<c5<n3>> {
    public jz c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final lc f1879co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v.y f1880f;
    public e7.y f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final d f1881fb;
    public c5<n3>[] n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0.n3 f1882p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public d0.y f1883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f1884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mg f1885t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final o f1886v;
    public final b.y w;
    public final n3.y y;
    public final ur.c5 z;

    public zn(e7.y yVar, n3.y yVar2, @Nullable o oVar, ur.c5 c5Var, a aVar, v.y yVar3, mg mgVar, b.y yVar4, d dVar, r0.n3 n3Var) {
        this.f3 = yVar;
        this.y = yVar2;
        this.f1886v = oVar;
        this.f1881fb = dVar;
        this.f1884s = aVar;
        this.f1880f = yVar3;
        this.f1885t = mgVar;
        this.w = yVar4;
        this.f1882p = n3Var;
        this.z = c5Var;
        this.f1879co = w(yVar, aVar);
        c5<n3>[] c5VarArrP = p(0);
        this.n = c5VarArrP;
        this.c = c5Var.y(c5VarArrP);
    }

    private static c5<n3>[] p(int i) {
        return new c5[i];
    }

    public static lc w(e7.y yVar, a aVar) {
        rs[] rsVarArr = new rs[yVar.f3283a.length];
        int i = 0;
        while (true) {
            y.n3[] n3VarArr = yVar.f3283a;
            if (i >= n3VarArr.length) {
                return new lc(rsVarArr);
            }
            g[] gVarArr = n3VarArr[i].f3293i9;
            g[] gVarArr2 = new g[gVarArr.length];
            for (int i5 = 0; i5 < gVarArr.length; i5++) {
                g gVar = gVarArr[i5];
                gVarArr2[i5] = gVar.zn(aVar.zn(gVar));
            }
            rsVarArr[i] = new rs(Integer.toString(i), gVarArr2);
            i++;
        }
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f1883r = yVar;
        yVar.xc(this);
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        for (c5<n3> c5Var : this.n) {
            c5Var.co(j, z);
        }
    }

    @Override // ur.d0
    public long f(c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        c cVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < cVarArr.length; i++) {
            en enVar = enVarArr[i];
            if (enVar != null) {
                c5 c5Var = (c5) enVar;
                if (cVarArr[i] == null || !zArr[i]) {
                    c5Var.yt();
                    enVarArr[i] = null;
                } else {
                    ((n3) c5Var.rz()).y(cVarArr[i]);
                    arrayList.add(c5Var);
                }
            }
            if (enVarArr[i] == null && (cVar = cVarArr[i]) != null) {
                c5<n3> c5VarN3 = n3(cVar, j);
                arrayList.add(c5VarN3);
                enVarArr[i] = c5VarN3;
                zArr2[i] = true;
            }
        }
        c5<n3>[] c5VarArrP = p(arrayList.size());
        this.n = c5VarArrP;
        arrayList.toArray(c5VarArrP);
        this.c = this.z.y(this.n);
        return j;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return this.c.fb();
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        for (c5<n3> c5Var : this.n) {
            if (c5Var.y == 2) {
                return c5Var.gv(j, p1Var);
            }
        }
        return j;
    }

    @Override // ur.d0
    public long i9(long j) {
        for (c5<n3> c5Var : this.n) {
            c5Var.qn(j);
        }
        return j;
    }

    @Override // ur.d0
    public lc mt() {
        return this.f1879co;
    }

    public final c5<n3> n3(c cVar, long j) {
        int iZn = this.f1879co.zn(cVar.tl());
        return new c5<>(this.f3.f3283a[iZn].y, null, null, this.y.y(this.f1881fb, this.f3, iZn, cVar, this.f1886v), this, this.f1882p, j, this.f1884s, this.f1880f, this.f1885t, this.w);
    }

    public void r() {
        for (c5<n3> c5Var : this.n) {
            c5Var.yt();
        }
        this.f1883r = null;
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
        this.c.s(j);
    }

    @Override // ur.d0
    public long t() {
        return -9223372036854775807L;
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        return this.c.v(j);
    }

    @Override // ur.d0
    public void wz() throws IOException {
        this.f1881fb.n3();
    }

    public void x4(e7.y yVar) {
        this.f3 = yVar;
        for (c5<n3> c5Var : this.n) {
            ((n3) c5Var.rz()).zn(yVar);
        }
        this.f1883r.a(this);
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.c.y();
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void a(c5<n3> c5Var) {
        this.f1883r.a(this);
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return this.c.zn();
    }
}

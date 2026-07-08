package jn;

import b1.ta;
import ft.q;
import k4.i4;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class s implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5847a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5848fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5849gv;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5850s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5851v;
    public final hx.s y;
    public ta zn;

    public s(hx.s sVar) {
        this.y = sVar;
        try {
            this.n3 = v(sVar.f5399gv);
            this.f5849gv = -9223372036854775807L;
            this.f5851v = -1;
            this.f5847a = 0;
            this.f5848fb = 0L;
            this.f5850s = -9223372036854775807L;
        } catch (q e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    private void a() {
        ((ta) v0.y.v(this.zn)).a(this.f5850s, 1, this.f5847a, 0, null);
        this.f5847a = 0;
        this.f5850s = -9223372036854775807L;
    }

    public static int v(i4<String, String> i4Var) throws q {
        String str = i4Var.get("config");
        int i = 0;
        i = 0;
        if (str != null && str.length() % 2 == 0) {
            v0.ta taVar = new v0.ta(ut.a8(str));
            int iS = taVar.s(1);
            if (iS != 0) {
                throw q.n3("unsupported audio mux version: " + iS, null);
            }
            v0.y.n3(taVar.s(1) == 1, "Only supports allStreamsSameTimeFraming.");
            int iS2 = taVar.s(6);
            v0.y.n3(taVar.s(4) == 0, "Only suppors one program.");
            v0.y.n3(taVar.s(3) == 0, "Only suppors one layer.");
            i = iS2;
        }
        return i + 1;
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        v0.y.c5(this.zn);
        int iN3 = hx.v.n3(this.f5851v);
        if (this.f5847a > 0 && iN3 < i) {
            a();
        }
        for (int i5 = 0; i5 < this.n3; i5++) {
            int i8 = 0;
            while (dVar.a() < dVar.fb()) {
                int iEj = dVar.ej();
                i8 += iEj;
                if (iEj != 255) {
                    break;
                }
            }
            this.zn.n3(dVar, i8);
            this.f5847a += i8;
        }
        this.f5850s = tl.y(this.f5848fb, j, this.f5849gv, this.y.n3);
        if (z) {
            a();
        }
        this.f5851v = i;
    }

    @Override // jn.f
    public void n3(long j, int i) {
        v0.y.fb(this.f5849gv == -9223372036854775807L);
        this.f5849gv = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5849gv = j;
        this.f5847a = 0;
        this.f5848fb = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        ta taVarA = wzVar.a(i, 2);
        this.zn = taVarA;
        ((ta) ut.i9(taVarA)).y(this.y.zn);
    }
}

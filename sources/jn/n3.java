package jn;

import v0.d;
import v0.ta;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5841a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f5842c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5843fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f5844gv;
    public final ta n3 = new ta();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b1.ta f5845s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5846v;
    public final hx.s y;
    public final int zn;

    public n3(hx.s sVar) {
        this.y = sVar;
        this.zn = sVar.n3;
        String str = (String) v0.y.v(sVar.f5399gv.get("mode"));
        if (g4.zn.y(str, "AAC-hbr")) {
            this.f5844gv = 13;
            this.f5846v = 3;
        } else {
            if (!g4.zn.y(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f5844gv = 6;
            this.f5846v = 2;
        }
        this.f5841a = this.f5846v + this.f5844gv;
    }

    public static void v(b1.ta taVar, long j, int i) {
        taVar.a(j, 1, i, 0, null);
    }

    @Override // jn.f
    public void gv(d dVar, long j, int i, boolean z) {
        v0.y.v(this.f5845s);
        short sMg = dVar.mg();
        int i5 = sMg / this.f5841a;
        long jY = tl.y(this.f5842c5, j, this.f5843fb, this.zn);
        this.n3.tl(dVar);
        if (i5 == 1) {
            int iS = this.n3.s(this.f5844gv);
            this.n3.mt(this.f5846v);
            this.f5845s.n3(dVar, dVar.y());
            if (z) {
                v(this.f5845s, jY, iS);
                return;
            }
            return;
        }
        dVar.ut((sMg + 7) / 8);
        for (int i8 = 0; i8 < i5; i8++) {
            int iS2 = this.n3.s(this.f5844gv);
            this.n3.mt(this.f5846v);
            this.f5845s.n3(dVar, iS2);
            v(this.f5845s, jY, iS2);
            jY += ut.x5(i5, 1000000L, this.zn);
        }
    }

    @Override // jn.f
    public void n3(long j, int i) {
        this.f5843fb = j;
    }

    @Override // jn.f
    public void y(long j, long j4) {
        this.f5843fb = j;
        this.f5842c5 = j4;
    }

    @Override // jn.f
    public void zn(b1.wz wzVar, int i) {
        b1.ta taVarA = wzVar.a(i, 1);
        this.f5845s = taVarA;
        taVarA.y(this.y.zn);
    }
}

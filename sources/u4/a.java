package u4;

import b1.ta;
import ft.g;
import ft.q;
import u4.v;
import v0.c;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8347a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8348fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8349gv;
    public final d n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8350v;
    public final d zn;

    public a(ta taVar) {
        super(taVar);
        this.n3 = new d(c.y);
        this.zn = new d(4);
    }

    @Override // u4.v
    public boolean n3(d dVar) throws v.y {
        int iEj = dVar.ej();
        int i = (iEj >> 4) & 15;
        int i5 = iEj & 15;
        if (i5 == 7) {
            this.f8348fb = i;
            return i != 5;
        }
        throw new v.y("Video format not supported: " + i5);
    }

    @Override // u4.v
    public boolean zn(d dVar, long j) throws q {
        int iEj = dVar.ej();
        long jMt = j + (((long) dVar.mt()) * 1000);
        if (iEj == 0 && !this.f8350v) {
            d dVar2 = new d(new byte[dVar.y()]);
            dVar.t(dVar2.v(), 0, dVar.y());
            w0.y yVarN3 = w0.y.n3(dVar2);
            this.f8349gv = yVarN3.n3;
            this.y.y(new g.n3().o4("video/avc").x(yVarN3.f8943a).s8(yVarN3.zn).o(yVarN3.f8944gv).y5(yVarN3.f8945v).ut(yVarN3.y).z6());
            this.f8350v = true;
            return false;
        }
        if (iEj != 1 || !this.f8350v) {
            return false;
        }
        int i = this.f8348fb == 1 ? 1 : 0;
        if (!this.f8347a && i == 0) {
            return false;
        }
        byte[] bArrV = this.zn.v();
        bArrV[0] = 0;
        bArrV[1] = 0;
        bArrV[2] = 0;
        int i5 = 4 - this.f8349gv;
        int i8 = 0;
        while (dVar.y() > 0) {
            dVar.t(this.zn.v(), i5, this.f8349gv);
            this.zn.oz(0);
            int iB = this.zn.b();
            this.n3.oz(0);
            this.y.n3(this.n3, 4);
            this.y.n3(dVar, iB);
            i8 = i8 + 4 + iB;
        }
        this.y.a(jMt, i, i8, 0, null);
        this.f8347a = true;
        return true;
    }
}

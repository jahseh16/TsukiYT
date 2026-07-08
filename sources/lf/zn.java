package lf;

import androidx.annotation.Nullable;
import ft.g;
import lf.ud;
import mn.n3;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6450a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f6451c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6452f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6453fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public String f6454gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public g f6455i9;
    public final v0.d n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6457t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b1.ta f6458v;
    public final v0.ta y;

    @Nullable
    public final String zn;

    public zn() {
        this(null);
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6457t = j;
        }
    }

    public final void fb() {
        this.y.w(0);
        n3.C0131n3 c0131n3A = mn.n3.a(this.y);
        g gVar = this.f6455i9;
        if (gVar == null || c0131n3A.f6645gv != gVar.j || c0131n3A.zn != gVar.oz || !ut.zn(c0131n3A.y, gVar.f3)) {
            g.n3 n3VarU = new g.n3().oz(this.f6454gv).o4(c0131n3A.y).a8(c0131n3A.f6645gv).rs(c0131n3A.zn).k(this.zn).u(c0131n3A.f6644fb);
            if ("audio/ac3".equals(c0131n3A.y)) {
                n3VarU.ud(c0131n3A.f6644fb);
            }
            g gVarZ6 = n3VarU.z6();
            this.f6455i9 = gVarZ6;
            this.f6458v.y(gVarZ6);
        }
        this.f6452f = c0131n3A.f6646v;
        this.f6451c5 = (((long) c0131n3A.f6643a) * 1000000) / ((long) this.f6455i9.oz);
    }

    public final boolean n3(v0.d dVar, byte[] bArr, int i) {
        int iMin = Math.min(dVar.y(), i - this.f6453fb);
        dVar.t(bArr, this.f6453fb, iMin);
        int i5 = this.f6453fb + iMin;
        this.f6453fb = i5;
        return i5 == i;
    }

    public final boolean s(v0.d dVar) {
        while (true) {
            if (dVar.y() <= 0) {
                return false;
            }
            if (this.f6456s) {
                int iEj = dVar.ej();
                if (iEj == 119) {
                    this.f6456s = false;
                    return true;
                }
                this.f6456s = iEj == 11;
            } else {
                this.f6456s = dVar.ej() == 11;
            }
        }
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6454gv = gvVar.n3();
        this.f6458v = wzVar.a(gvVar.zn(), 1);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.f6458v);
        while (dVar.y() > 0) {
            int i = this.f6450a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(dVar.y(), this.f6452f - this.f6453fb);
                        this.f6458v.n3(dVar, iMin);
                        int i5 = this.f6453fb + iMin;
                        this.f6453fb = i5;
                        int i8 = this.f6452f;
                        if (i5 == i8) {
                            long j = this.f6457t;
                            if (j != -9223372036854775807L) {
                                this.f6458v.a(j, 1, i8, 0, null);
                                this.f6457t += this.f6451c5;
                            }
                            this.f6450a = 0;
                        }
                    }
                } else if (n3(dVar, this.n3.v(), 128)) {
                    fb();
                    this.n3.oz(0);
                    this.f6458v.n3(this.n3, 128);
                    this.f6450a = 2;
                }
            } else if (s(dVar)) {
                this.f6450a = 1;
                this.n3.v()[0] = 11;
                this.n3.v()[1] = 119;
                this.f6453fb = 2;
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6450a = 0;
        this.f6453fb = 0;
        this.f6456s = false;
        this.f6457t = -9223372036854775807L;
    }

    public zn(@Nullable String str) {
        v0.ta taVar = new v0.ta(new byte[128]);
        this.y = taVar;
        this.n3 = new v0.d(taVar.y);
        this.f6450a = 0;
        this.f6457t = -9223372036854775807L;
        this.zn = str;
    }

    @Override // lf.tl
    public void gv() {
    }
}

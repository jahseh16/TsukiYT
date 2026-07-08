package lf;

import androidx.annotation.Nullable;
import ft.g;
import lf.ud;
import mn.zn;

/* JADX INFO: loaded from: classes.dex */
public final class a implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6221a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6222c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f6223f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6224fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public String f6225gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f6226i9;
    public final v0.d n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6228t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f6229tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b1.ta f6230v;
    public final v0.ta y;

    @Nullable
    public final String zn;

    public a() {
        this(null);
    }

    private void fb() {
        this.y.w(0);
        zn.n3 n3VarGv = mn.zn.gv(this.y);
        g gVar = this.f6223f;
        if (gVar == null || n3VarGv.zn != gVar.j || n3VarGv.n3 != gVar.oz || !"audio/ac4".equals(gVar.f3)) {
            g gVarZ6 = new g.n3().oz(this.f6225gv).o4("audio/ac4").a8(n3VarGv.zn).rs(n3VarGv.n3).k(this.zn).z6();
            this.f6223f = gVarZ6;
            this.f6230v.y(gVarZ6);
        }
        this.f6228t = n3VarGv.f6707gv;
        this.f6226i9 = (((long) n3VarGv.f6708v) * 1000000) / ((long) this.f6223f.oz);
    }

    private boolean n3(v0.d dVar, byte[] bArr, int i) {
        int iMin = Math.min(dVar.y(), i - this.f6224fb);
        dVar.t(bArr, this.f6224fb, iMin);
        int i5 = this.f6224fb + iMin;
        this.f6224fb = i5;
        return i5 == i;
    }

    private boolean s(v0.d dVar) {
        int iEj;
        while (true) {
            if (dVar.y() <= 0) {
                return false;
            }
            if (this.f6227s) {
                iEj = dVar.ej();
                this.f6227s = iEj == 172;
                if (iEj == 64 || iEj == 65) {
                    break;
                }
            } else {
                this.f6227s = dVar.ej() == 172;
            }
        }
        this.f6222c5 = iEj == 65;
        return true;
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6229tl = j;
        }
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6225gv = gvVar.n3();
        this.f6230v = wzVar.a(gvVar.zn(), 1);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.f6230v);
        while (dVar.y() > 0) {
            int i = this.f6221a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(dVar.y(), this.f6228t - this.f6224fb);
                        this.f6230v.n3(dVar, iMin);
                        int i5 = this.f6224fb + iMin;
                        this.f6224fb = i5;
                        int i8 = this.f6228t;
                        if (i5 == i8) {
                            long j = this.f6229tl;
                            if (j != -9223372036854775807L) {
                                this.f6230v.a(j, 1, i8, 0, null);
                                this.f6229tl += this.f6226i9;
                            }
                            this.f6221a = 0;
                        }
                    }
                } else if (n3(dVar, this.n3.v(), 16)) {
                    fb();
                    this.n3.oz(0);
                    this.f6230v.n3(this.n3, 16);
                    this.f6221a = 2;
                }
            } else if (s(dVar)) {
                this.f6221a = 1;
                this.n3.v()[0] = -84;
                this.n3.v()[1] = (byte) (this.f6222c5 ? 65 : 64);
                this.f6224fb = 2;
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6221a = 0;
        this.f6224fb = 0;
        this.f6227s = false;
        this.f6222c5 = false;
        this.f6229tl = -9223372036854775807L;
    }

    public a(@Nullable String str) {
        v0.ta taVar = new v0.ta(new byte[16]);
        this.y = taVar;
        this.n3 = new v0.d(taVar.y);
        this.f6221a = 0;
        this.f6224fb = 0;
        this.f6227s = false;
        this.f6222c5 = false;
        this.f6229tl = -9223372036854775807L;
        this.zn = str;
    }

    @Override // lf.tl
    public void gv() {
    }
}

package lf;

import androidx.annotation.Nullable;
import ft.g;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class f implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6301a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public g f6302c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6304fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public b1.ta f6305gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6306i9;

    @Nullable
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6307s;
    public String zn;
    public final v0.d y = new v0.d(new byte[18]);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6308v = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6303f = -9223372036854775807L;

    public f(@Nullable String str) {
        this.n3 = str;
    }

    private void fb() {
        byte[] bArrV = this.y.v();
        if (this.f6302c5 == null) {
            g gVarFb = mn.ud.fb(bArrV, this.zn, this.n3, null);
            this.f6302c5 = gVarFb;
            this.f6305gv.y(gVarFb);
        }
        this.f6306i9 = mn.ud.y(bArrV);
        this.f6307s = (int) ((((long) mn.ud.a(bArrV)) * 1000000) / ((long) this.f6302c5.oz));
    }

    private boolean n3(v0.d dVar, byte[] bArr, int i) {
        int iMin = Math.min(dVar.y(), i - this.f6301a);
        dVar.t(bArr, this.f6301a, iMin);
        int i5 = this.f6301a + iMin;
        this.f6301a = i5;
        return i5 == i;
    }

    private boolean s(v0.d dVar) {
        while (dVar.y() > 0) {
            int i = this.f6304fb << 8;
            this.f6304fb = i;
            int iEj = i | dVar.ej();
            this.f6304fb = iEj;
            if (mn.ud.gv(iEj)) {
                byte[] bArrV = this.y.v();
                int i5 = this.f6304fb;
                bArrV[0] = (byte) ((i5 >> 24) & 255);
                bArrV[1] = (byte) ((i5 >> 16) & 255);
                bArrV[2] = (byte) ((i5 >> 8) & 255);
                bArrV[3] = (byte) (i5 & 255);
                this.f6301a = 4;
                this.f6304fb = 0;
                return true;
            }
        }
        return false;
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6303f = j;
        }
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.zn = gvVar.n3();
        this.f6305gv = wzVar.a(gvVar.zn(), 1);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.f6305gv);
        while (dVar.y() > 0) {
            int i = this.f6308v;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(dVar.y(), this.f6306i9 - this.f6301a);
                    this.f6305gv.n3(dVar, iMin);
                    int i5 = this.f6301a + iMin;
                    this.f6301a = i5;
                    int i8 = this.f6306i9;
                    if (i5 == i8) {
                        long j = this.f6303f;
                        if (j != -9223372036854775807L) {
                            this.f6305gv.a(j, 1, i8, 0, null);
                            this.f6303f += this.f6307s;
                        }
                        this.f6308v = 0;
                    }
                } else if (n3(dVar, this.y.v(), 18)) {
                    fb();
                    this.y.oz(0);
                    this.f6305gv.n3(this.y, 18);
                    this.f6308v = 2;
                }
            } else if (s(dVar)) {
                this.f6308v = 1;
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6308v = 0;
        this.f6301a = 0;
        this.f6304fb = 0;
        this.f6303f = -9223372036854775807L;
    }

    @Override // lf.tl
    public void gv() {
    }
}

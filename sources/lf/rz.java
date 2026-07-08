package lf;

import lf.ud;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6350a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6351gv;
    public final v0.d n3 = new v0.d(32);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6352v;
    public final fh y;
    public int zn;

    public rz(fh fhVar) {
        this.y = fhVar;
    }

    @Override // lf.ud
    public void n3(hw hwVar, b1.wz wzVar, ud.gv gvVar) {
        this.y.n3(hwVar, wzVar, gvVar);
        this.f6350a = true;
    }

    @Override // lf.ud
    public void y(v0.d dVar, int i) {
        boolean z = (i & 1) != 0;
        int iA = z ? dVar.a() + dVar.ej() : -1;
        if (this.f6350a) {
            if (!z) {
                return;
            }
            this.f6350a = false;
            dVar.oz(iA);
            this.f6351gv = 0;
        }
        while (dVar.y() > 0) {
            int i5 = this.f6351gv;
            if (i5 < 3) {
                if (i5 == 0) {
                    int iEj = dVar.ej();
                    dVar.oz(dVar.a() - 1);
                    if (iEj == 255) {
                        this.f6350a = true;
                        return;
                    }
                }
                int iMin = Math.min(dVar.y(), 3 - this.f6351gv);
                dVar.t(this.n3.v(), this.f6351gv, iMin);
                int i8 = this.f6351gv + iMin;
                this.f6351gv = i8;
                if (i8 == 3) {
                    this.n3.oz(0);
                    this.n3.j(3);
                    this.n3.ut(1);
                    int iEj2 = this.n3.ej();
                    int iEj3 = this.n3.ej();
                    this.f6352v = (iEj2 & 128) != 0;
                    this.zn = (((iEj2 & 15) << 8) | iEj3) + 3;
                    int iN3 = this.n3.n3();
                    int i10 = this.zn;
                    if (iN3 < i10) {
                        this.n3.zn(Math.min(4098, Math.max(i10, this.n3.n3() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(dVar.y(), this.zn - this.f6351gv);
                dVar.t(this.n3.v(), this.f6351gv, iMin2);
                int i11 = this.f6351gv + iMin2;
                this.f6351gv = i11;
                int i12 = this.zn;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f6352v) {
                        this.n3.j(i12);
                    } else {
                        if (ut.z(this.n3.v(), 0, this.zn, -1) != 0) {
                            this.f6350a = true;
                            return;
                        }
                        this.n3.j(this.zn - 4);
                    }
                    this.n3.oz(0);
                    this.y.y(this.n3);
                    this.f6351gv = 0;
                }
            }
        }
    }

    @Override // lf.ud
    public void zn() {
        this.f6350a = true;
    }
}

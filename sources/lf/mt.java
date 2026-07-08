package lf;

import ft.g;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class mt implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6318a;
    public b1.ta n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6320v;
    public boolean zn;
    public final v0.d y = new v0.d(10);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f6319gv = -9223372036854775807L;

    @Override // lf.tl
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zn = true;
        if (j != -9223372036854775807L) {
            this.f6319gv = j;
        }
        this.f6320v = 0;
        this.f6318a = 0;
    }

    @Override // lf.tl
    public void gv() {
        int i;
        v0.y.c5(this.n3);
        if (this.zn && (i = this.f6320v) != 0 && this.f6318a == i) {
            long j = this.f6319gv;
            if (j != -9223372036854775807L) {
                this.n3.a(j, 1, i, 0, null);
            }
            this.zn = false;
        }
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        b1.ta taVarA = wzVar.a(gvVar.zn(), 5);
        this.n3 = taVarA;
        taVarA.y(new g.n3().oz(gvVar.n3()).o4("application/id3").z6());
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.n3);
        if (this.zn) {
            int iY = dVar.y();
            int i = this.f6318a;
            if (i < 10) {
                int iMin = Math.min(iY, 10 - i);
                System.arraycopy(dVar.v(), dVar.a(), this.y.v(), this.f6318a, iMin);
                if (this.f6318a + iMin == 10) {
                    this.y.oz(0);
                    if (73 != this.y.ej() || 68 != this.y.ej() || 51 != this.y.ej()) {
                        v0.r.c5("Id3Reader", "Discarding invalid ID3 tag");
                        this.zn = false;
                        return;
                    } else {
                        this.y.ut(3);
                        this.f6320v = this.y.z6() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iY, this.f6320v - this.f6318a);
            this.n3.n3(dVar, iMin2);
            this.f6318a += iMin2;
        }
    }

    @Override // lf.tl
    public void zn() {
        this.zn = false;
        this.f6319gv = -9223372036854775807L;
    }
}

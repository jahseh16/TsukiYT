package lf;

import ft.g;
import java.util.Collections;
import java.util.List;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class t implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6363a = -9223372036854775807L;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6364gv;
    public final b1.ta[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6365v;
    public final List<ud.y> y;
    public boolean zn;

    public t(List<ud.y> list) {
        this.y = list;
        this.n3 = new b1.ta[list.size()];
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zn = true;
        if (j != -9223372036854775807L) {
            this.f6363a = j;
        }
        this.f6365v = 0;
        this.f6364gv = 2;
    }

    @Override // lf.tl
    public void gv() {
        if (this.zn) {
            if (this.f6363a != -9223372036854775807L) {
                for (b1.ta taVar : this.n3) {
                    taVar.a(this.f6363a, 1, this.f6365v, 0, null);
                }
            }
            this.zn = false;
        }
    }

    public final boolean n3(v0.d dVar, int i) {
        if (dVar.y() == 0) {
            return false;
        }
        if (dVar.ej() != i) {
            this.zn = false;
        }
        this.f6364gv--;
        return this.zn;
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        for (int i = 0; i < this.n3.length; i++) {
            ud.y yVar = this.y.get(i);
            gvVar.y();
            b1.ta taVarA = wzVar.a(gvVar.zn(), 3);
            taVarA.y(new g.n3().oz(gvVar.n3()).o4("application/dvbsubs").ut(Collections.singletonList(yVar.zn)).k(yVar.y).z6());
            this.n3[i] = taVarA;
        }
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        if (this.zn) {
            if (this.f6364gv != 2 || n3(dVar, 32)) {
                if (this.f6364gv != 1 || n3(dVar, 0)) {
                    int iA = dVar.a();
                    int iY = dVar.y();
                    for (b1.ta taVar : this.n3) {
                        dVar.oz(iA);
                        taVar.n3(dVar, iY);
                    }
                    this.f6365v += iY;
                }
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.zn = false;
        this.f6363a = -9223372036854775807L;
    }
}

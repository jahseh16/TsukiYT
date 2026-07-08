package nr;

import b1.d0;
import ft.g;
import java.io.IOException;
import lf.ej;
import v0.hw;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final d0 f7018gv = new d0();
    public final g n3;
    public final b1.t y;
    public final hw zn;

    public n3(b1.t tVar, g gVar, hw hwVar) {
        this.y = tVar;
        this.n3 = gVar;
        this.zn = hwVar;
    }

    @Override // nr.f
    public f a() {
        b1.t aVar;
        v0.y.fb(!gv());
        b1.t tVar = this.y;
        if (tVar instanceof z) {
            aVar = new z(this.n3.f4782fb, this.zn);
        } else if (tVar instanceof lf.s) {
            aVar = new lf.s();
        } else if (tVar instanceof lf.n3) {
            aVar = new lf.n3();
        } else if (tVar instanceof lf.v) {
            aVar = new lf.v();
        } else {
            if (!(tVar instanceof ao.a)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.y.getClass().getSimpleName());
            }
            aVar = new ao.a();
        }
        return new n3(aVar, this.n3, this.zn);
    }

    @Override // nr.f
    public boolean gv() {
        b1.t tVar = this.y;
        return (tVar instanceof ej) || (tVar instanceof tn.fb);
    }

    @Override // nr.f
    public boolean n3(b1.tl tlVar) throws IOException {
        return this.y.fb(tlVar, f7018gv) == 0;
    }

    @Override // nr.f
    public boolean v() {
        b1.t tVar = this.y;
        return (tVar instanceof lf.s) || (tVar instanceof lf.n3) || (tVar instanceof lf.v) || (tVar instanceof ao.a);
    }

    @Override // nr.f
    public void y() {
        this.y.y(0L, 0L);
    }

    @Override // nr.f
    public void zn(b1.wz wzVar) {
        this.y.zn(wzVar);
    }
}

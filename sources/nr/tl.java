package nr;

import ft.u0;
import java.io.IOException;
import ur.en;

/* JADX INFO: loaded from: classes.dex */
public final class tl implements en {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7067fb = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f7068v;
    public final int y;

    public tl(p pVar, int i) {
        this.f7068v = pVar;
        this.y = i;
    }

    @Override // ur.en
    public int a(u0 u0Var, di.fb fbVar, int i) {
        if (this.f7067fb == -3) {
            fbVar.v(4);
            return -4;
        }
        if (zn()) {
            return this.f7068v.dm(this.f7067fb, u0Var, fbVar, i);
        }
        return -3;
    }

    public void gv() {
        if (this.f7067fb != -1) {
            this.f7068v.yg(this.y);
            this.f7067fb = -1;
        }
    }

    @Override // ur.en
    public boolean isReady() {
        return this.f7067fb == -3 || (zn() && this.f7068v.hw(this.f7067fb));
    }

    @Override // ur.en
    public void n3() throws IOException {
        int i = this.f7067fb;
        if (i == -2) {
            throw new mt(this.f7068v.mt().n3(this.y).zn(0).f3);
        }
        if (i == -1) {
            this.f7068v.oz();
        } else if (i != -3) {
            this.f7068v.ut(i);
        }
    }

    @Override // ur.en
    public int w(long j) {
        if (zn()) {
            return this.f7068v.ap(this.f7067fb, j);
        }
        return 0;
    }

    public void y() {
        v0.y.y(this.f7067fb == -1);
        this.f7067fb = this.f7068v.i4(this.y);
    }

    public final boolean zn() {
        int i = this.f7067fb;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}

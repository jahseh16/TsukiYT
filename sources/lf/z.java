package lf;

import androidx.annotation.Nullable;
import ft.g;
import lf.ud;
import mn.yt;

/* JADX INFO: loaded from: classes.dex */
public final class z implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6441a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6442c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6443f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6444fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public b1.ta f6445gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f6446i9;
    public final yt.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6448t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f6449v;
    public final v0.d y;

    @Nullable
    public final String zn;

    public z() {
        this(null);
    }

    @Override // lf.tl
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6448t = j;
        }
    }

    public final void fb(v0.d dVar) {
        int iMin = Math.min(dVar.y(), this.f6443f - this.f6444fb);
        this.f6445gv.n3(dVar, iMin);
        int i = this.f6444fb + iMin;
        this.f6444fb = i;
        int i5 = this.f6443f;
        if (i < i5) {
            return;
        }
        long j = this.f6448t;
        if (j != -9223372036854775807L) {
            this.f6445gv.a(j, 1, i5, 0, null);
            this.f6448t += this.f6446i9;
        }
        this.f6444fb = 0;
        this.f6441a = 0;
    }

    public final void n3(v0.d dVar) {
        byte[] bArrV = dVar.v();
        int iFb = dVar.fb();
        for (int iA = dVar.a(); iA < iFb; iA++) {
            byte b4 = bArrV[iA];
            boolean z = (b4 & 255) == 255;
            boolean z5 = this.f6442c5 && (b4 & 224) == 224;
            this.f6442c5 = z;
            if (z5) {
                dVar.oz(iA + 1);
                this.f6442c5 = false;
                this.y.v()[1] = bArrV[iA];
                this.f6444fb = 2;
                this.f6441a = 1;
                return;
            }
        }
        dVar.oz(iFb);
    }

    public final void s(v0.d dVar) {
        int iMin = Math.min(dVar.y(), 4 - this.f6444fb);
        dVar.t(this.y.v(), this.f6444fb, iMin);
        int i = this.f6444fb + iMin;
        this.f6444fb = i;
        if (i < 4) {
            return;
        }
        this.y.oz(0);
        if (!this.n3.y(this.y.p())) {
            this.f6444fb = 0;
            this.f6441a = 1;
            return;
        }
        yt.y yVar = this.n3;
        this.f6443f = yVar.zn;
        if (!this.f6447s) {
            this.f6446i9 = (((long) yVar.f6703fb) * 1000000) / ((long) yVar.f6704gv);
            this.f6445gv.y(new g.n3().oz(this.f6449v).o4(this.n3.n3).f7(4096).a8(this.n3.f6705v).rs(this.n3.f6704gv).k(this.zn).z6());
            this.f6447s = true;
        }
        this.y.oz(0);
        this.f6445gv.n3(this.y, 4);
        this.f6441a = 2;
    }

    @Override // lf.tl
    public void v(b1.wz wzVar, ud.gv gvVar) {
        gvVar.y();
        this.f6449v = gvVar.n3();
        this.f6445gv = wzVar.a(gvVar.zn(), 1);
    }

    @Override // lf.tl
    public void y(v0.d dVar) {
        v0.y.c5(this.f6445gv);
        while (dVar.y() > 0) {
            int i = this.f6441a;
            if (i == 0) {
                n3(dVar);
            } else if (i == 1) {
                s(dVar);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                fb(dVar);
            }
        }
    }

    @Override // lf.tl
    public void zn() {
        this.f6441a = 0;
        this.f6444fb = 0;
        this.f6442c5 = false;
        this.f6448t = -9223372036854775807L;
    }

    public z(@Nullable String str) {
        this.f6441a = 0;
        v0.d dVar = new v0.d(4);
        this.y = dVar;
        dVar.v()[0] = -1;
        this.n3 = new yt.y();
        this.f6448t = -9223372036854775807L;
        this.zn = str;
    }

    @Override // lf.tl
    public void gv() {
    }
}

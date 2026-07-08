package lf;

import java.io.IOException;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6264a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f6267gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6269v;
    public final int y;
    public final hw n3 = new hw(0);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6266fb = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6268s = -9223372036854775807L;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f6265c5 = -9223372036854775807L;
    public final v0.d zn = new v0.d();

    public d(int i) {
        this.y = i;
    }

    public final int a(b1.tl tlVar, b1.d0 d0Var, int i) throws IOException {
        int iMin = (int) Math.min(this.y, tlVar.getLength());
        long j = 0;
        if (tlVar.getPosition() != j) {
            d0Var.y = j;
            return 1;
        }
        this.zn.j5(iMin);
        tlVar.s();
        tlVar.z(this.zn.v(), 0, iMin);
        this.f6266fb = fb(this.zn, i);
        this.f6269v = true;
        return 0;
    }

    public final long c5(v0.d dVar, int i) {
        int iA = dVar.a();
        int iFb = dVar.fb();
        for (int i5 = iFb - 188; i5 >= iA; i5--) {
            if (a8.n3(dVar.v(), iA, iFb, i5)) {
                long jZn = a8.zn(dVar, i5, i);
                if (jZn != -9223372036854775807L) {
                    return jZn;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final long fb(v0.d dVar, int i) {
        int iFb = dVar.fb();
        for (int iA = dVar.a(); iA < iFb; iA++) {
            if (dVar.v()[iA] == 71) {
                long jZn = a8.zn(dVar, iA, i);
                if (jZn != -9223372036854775807L) {
                    return jZn;
                }
            }
        }
        return -9223372036854775807L;
    }

    public boolean gv() {
        return this.f6267gv;
    }

    public long n3() {
        return this.f6265c5;
    }

    public final int s(b1.tl tlVar, b1.d0 d0Var, int i) throws IOException {
        long length = tlVar.getLength();
        int iMin = (int) Math.min(this.y, length);
        long j = length - ((long) iMin);
        if (tlVar.getPosition() != j) {
            d0Var.y = j;
            return 1;
        }
        this.zn.j5(iMin);
        tlVar.s();
        tlVar.z(this.zn.v(), 0, iMin);
        this.f6268s = c5(this.zn, i);
        this.f6264a = true;
        return 0;
    }

    public int v(b1.tl tlVar, b1.d0 d0Var, int i) throws IOException {
        if (i <= 0) {
            return y(tlVar);
        }
        if (!this.f6264a) {
            return s(tlVar, d0Var, i);
        }
        if (this.f6268s == -9223372036854775807L) {
            return y(tlVar);
        }
        if (!this.f6269v) {
            return a(tlVar, d0Var, i);
        }
        long j = this.f6266fb;
        if (j == -9223372036854775807L) {
            return y(tlVar);
        }
        long jN3 = this.n3.n3(this.f6268s) - this.n3.n3(j);
        this.f6265c5 = jN3;
        if (jN3 < 0) {
            v0.r.c5("TsDurationReader", "Invalid duration: " + this.f6265c5 + ". Using TIME_UNSET instead.");
            this.f6265c5 = -9223372036854775807L;
        }
        return y(tlVar);
    }

    public final int y(b1.tl tlVar) {
        this.zn.qn(ut.f8757a);
        this.f6267gv = true;
        tlVar.s();
        return 0;
    }

    public hw zn() {
        return this.n3;
    }
}

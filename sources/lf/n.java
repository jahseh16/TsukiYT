package lf;

import java.io.IOException;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f6323gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6325v;
    public boolean zn;
    public final hw y = new hw(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6321a = -9223372036854775807L;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f6322fb = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6324s = -9223372036854775807L;
    public final v0.d n3 = new v0.d();

    public static long t(v0.d dVar) {
        int iA = dVar.a();
        if (dVar.y() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dVar.t(bArr, 0, 9);
        dVar.oz(iA);
        if (y(bArr)) {
            return tl(bArr);
        }
        return -9223372036854775807L;
    }

    public static long tl(byte[] bArr) {
        byte b4 = bArr[0];
        long j = (((((long) b4) & 56) >> 3) << 30) | ((((long) b4) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b6 = bArr[2];
        return j | (((((long) b6) & 248) >> 3) << 15) | ((((long) b6) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static boolean y(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final long c5(v0.d dVar) {
        int iFb = dVar.fb();
        for (int iA = dVar.a(); iA < iFb - 3; iA++) {
            if (a(dVar.v(), iA) == 442) {
                dVar.oz(iA + 4);
                long jT = t(dVar);
                if (jT != -9223372036854775807L) {
                    return jT;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final long f(v0.d dVar) {
        int iA = dVar.a();
        for (int iFb = dVar.fb() - 4; iFb >= iA; iFb--) {
            if (a(dVar.v(), iFb) == 442) {
                dVar.oz(iFb + 4);
                long jT = t(dVar);
                if (jT != -9223372036854775807L) {
                    return jT;
                }
            }
        }
        return -9223372036854775807L;
    }

    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        if (!this.f6325v) {
            return i9(tlVar, d0Var);
        }
        if (this.f6322fb == -9223372036854775807L) {
            return n3(tlVar);
        }
        if (!this.f6323gv) {
            return s(tlVar, d0Var);
        }
        long j = this.f6321a;
        if (j == -9223372036854775807L) {
            return n3(tlVar);
        }
        long jN3 = this.y.n3(this.f6322fb) - this.y.n3(j);
        this.f6324s = jN3;
        if (jN3 < 0) {
            v0.r.c5("PsDurationReader", "Invalid duration: " + this.f6324s + ". Using TIME_UNSET instead.");
            this.f6324s = -9223372036854775807L;
        }
        return n3(tlVar);
    }

    public hw gv() {
        return this.y;
    }

    public final int i9(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        long length = tlVar.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (tlVar.getPosition() != j) {
            d0Var.y = j;
            return 1;
        }
        this.n3.j5(iMin);
        tlVar.s();
        tlVar.z(this.n3.v(), 0, iMin);
        this.f6322fb = f(this.n3);
        this.f6325v = true;
        return 0;
    }

    public final int n3(b1.tl tlVar) {
        this.n3.qn(ut.f8757a);
        this.zn = true;
        tlVar.s();
        return 0;
    }

    public final int s(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        int iMin = (int) Math.min(20000L, tlVar.getLength());
        long j = 0;
        if (tlVar.getPosition() != j) {
            d0Var.y = j;
            return 1;
        }
        this.n3.j5(iMin);
        tlVar.s();
        tlVar.z(this.n3.v(), 0, iMin);
        this.f6321a = c5(this.n3);
        this.f6323gv = true;
        return 0;
    }

    public boolean v() {
        return this.zn;
    }

    public long zn() {
        return this.f6324s;
    }
}

package ao;

import androidx.annotation.Nullable;
import b1.fh;
import b1.rz;
import mn.yt;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class s implements fb {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f1173gv;
    public final long[] n3;
    public final long[] y;
    public final long zn;

    public s(long[] jArr, long[] jArr2, long j, long j4) {
        this.y = jArr;
        this.n3 = jArr2;
        this.zn = j;
        this.f1173gv = j4;
    }

    @Nullable
    public static s y(long j, long j4, yt.y yVar, d dVar) {
        int iEj;
        dVar.ut(10);
        int iP = dVar.p();
        if (iP <= 0) {
            return null;
        }
        int i = yVar.f6704gv;
        long jX5 = ut.x5(iP, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, i);
        int iYt = dVar.yt();
        int iYt2 = dVar.yt();
        int iYt3 = dVar.yt();
        dVar.ut(2);
        long j7 = j4 + ((long) yVar.zn);
        long[] jArr = new long[iYt];
        long[] jArr2 = new long[iYt];
        int i5 = 0;
        long j8 = j4;
        while (i5 < iYt) {
            int i8 = iYt2;
            long j9 = j7;
            jArr[i5] = (((long) i5) * jX5) / ((long) iYt);
            jArr2[i5] = Math.max(j8, j9);
            if (iYt3 == 1) {
                iEj = dVar.ej();
            } else if (iYt3 == 2) {
                iEj = dVar.yt();
            } else if (iYt3 == 3) {
                iEj = dVar.x();
            } else {
                if (iYt3 != 4) {
                    return null;
                }
                iEj = dVar.b();
            }
            j8 += ((long) iEj) * ((long) i8);
            i5++;
            jArr = jArr;
            iYt2 = i8;
            j7 = j9;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j8) {
            r.c5("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j8);
        }
        return new s(jArr3, jArr2, jX5, j8);
    }

    @Override // ao.fb
    public long a() {
        return this.f1173gv;
    }

    @Override // b1.fh
    public long c5() {
        return this.zn;
    }

    @Override // ao.fb
    public long n3(long j) {
        return this.y[ut.c5(this.n3, j, true, true)];
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    @Override // b1.fh
    public fh.y v(long j) {
        int iC5 = ut.c5(this.y, j, true, true);
        rz rzVar = new rz(this.y[iC5], this.n3[iC5]);
        if (rzVar.y >= j || iC5 == this.y.length - 1) {
            return new fh.y(rzVar);
        }
        int i = iC5 + 1;
        return new fh.y(rzVar, new rz(this.y[i], this.n3[i]));
    }
}

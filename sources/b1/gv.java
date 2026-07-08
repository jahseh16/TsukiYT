package b1;

import b1.fh;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1275a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long[] f1276gv;
    public final int[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f1277v;
    public final int y;
    public final long[] zn;

    public gv(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.n3 = iArr;
        this.zn = jArr;
        this.f1276gv = jArr2;
        this.f1277v = jArr3;
        int length = iArr.length;
        this.y = length;
        if (length > 0) {
            this.f1275a = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f1275a = 0L;
        }
    }

    @Override // b1.fh
    public long c5() {
        return this.f1275a;
    }

    @Override // b1.fh
    public boolean s() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.y + ", sizes=" + Arrays.toString(this.n3) + ", offsets=" + Arrays.toString(this.zn) + ", timeUs=" + Arrays.toString(this.f1277v) + ", durationsUs=" + Arrays.toString(this.f1276gv) + ")";
    }

    @Override // b1.fh
    public fh.y v(long j) {
        int iY = y(j);
        rz rzVar = new rz(this.f1277v[iY], this.zn[iY]);
        if (rzVar.y >= j || iY == this.y - 1) {
            return new fh.y(rzVar);
        }
        int i = iY + 1;
        return new fh.y(rzVar, new rz(this.f1277v[i], this.zn[i]));
    }

    public int y(long j) {
        return ut.c5(this.f1277v, j, true, true);
    }
}

package x9;

import b1.tl;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final long[] f9105gv = {128, 64, 32, 16, 8, 4, 2, 1};
    public int n3;
    public final byte[] y = new byte[8];
    public int zn;

    public static long y(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f9105gv[i - 1];
        }
        for (int i5 = 1; i5 < i; i5++) {
            j = (j << 8) | (((long) bArr[i5]) & 255);
        }
        return j;
    }

    public static int zn(int i) {
        int i5 = 0;
        while (true) {
            long[] jArr = f9105gv;
            if (i5 >= jArr.length) {
                return -1;
            }
            if ((jArr[i5] & ((long) i)) != 0) {
                return i5 + 1;
            }
            i5++;
        }
    }

    public long gv(tl tlVar, boolean z, boolean z5, int i) throws IOException {
        if (this.n3 == 0) {
            if (!tlVar.i9(this.y, 0, 1, z)) {
                return -1L;
            }
            int iZn = zn(this.y[0] & 255);
            this.zn = iZn;
            if (iZn == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.n3 = 1;
        }
        int i5 = this.zn;
        if (i5 > i) {
            this.n3 = 0;
            return -2L;
        }
        if (i5 != 1) {
            tlVar.readFully(this.y, 1, i5 - 1);
        }
        this.n3 = 0;
        return y(this.y, this.zn, z5);
    }

    public int n3() {
        return this.zn;
    }

    public void v() {
        this.n3 = 0;
        this.zn = 0;
    }
}

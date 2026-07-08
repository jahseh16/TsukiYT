package tn;

import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f8274a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int[] f8275fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int[] f8276gv;
    public final int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f8277s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f8278v;
    public final xc y;
    public final long[] zn;

    public mt(xc xcVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        v0.y.y(iArr.length == jArr2.length);
        v0.y.y(jArr.length == jArr2.length);
        v0.y.y(iArr2.length == jArr2.length);
        this.y = xcVar;
        this.zn = jArr;
        this.f8276gv = iArr;
        this.f8278v = i;
        this.f8274a = jArr2;
        this.f8275fb = iArr2;
        this.f8277s = j;
        this.n3 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int n3(long j) {
        for (int iV = ut.v(this.f8274a, j, true, false); iV < this.f8274a.length; iV++) {
            if ((this.f8275fb[iV] & 1) != 0) {
                return iV;
            }
        }
        return -1;
    }

    public int y(long j) {
        for (int iC5 = ut.c5(this.f8274a, j, true, false); iC5 >= 0; iC5--) {
            if ((this.f8275fb[iC5] & 1) != 0) {
                return iC5;
            }
        }
        return -1;
    }
}

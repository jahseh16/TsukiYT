package b1;

/* JADX INFO: loaded from: classes.dex */
public final class z6 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f1304gv;
    public final int n3;
    public final byte[] y;
    public int zn;

    public z6(byte[] bArr) {
        this.y = bArr;
        this.n3 = bArr.length;
    }

    public int gv(int i) {
        int i5 = this.zn;
        int iMin = Math.min(i, 8 - this.f1304gv);
        int i8 = i5 + 1;
        int i10 = ((this.y[i5] & 255) >> this.f1304gv) & (255 >> (8 - iMin));
        while (iMin < i) {
            i10 |= (this.y[i8] & 255) << iMin;
            iMin += 8;
            i8++;
        }
        int i11 = i10 & ((-1) >>> (32 - i));
        v(i);
        return i11;
    }

    public int n3() {
        return (this.zn * 8) + this.f1304gv;
    }

    public void v(int i) {
        int i5 = i / 8;
        int i8 = this.zn + i5;
        this.zn = i8;
        int i10 = this.f1304gv + (i - (i5 * 8));
        this.f1304gv = i10;
        if (i10 > 7) {
            this.zn = i8 + 1;
            this.f1304gv = i10 - 8;
        }
        y();
    }

    public final void y() {
        int i;
        int i5 = this.zn;
        v0.y.fb(i5 >= 0 && (i5 < (i = this.n3) || (i5 == i && this.f1304gv == 0)));
    }

    public boolean zn() {
        boolean z = (((this.y[this.zn] & 255) >> this.f1304gv) & 1) == 1;
        v(1);
        return z;
    }
}

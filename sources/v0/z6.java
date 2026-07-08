package v0;

/* JADX INFO: loaded from: classes.dex */
public final class z6 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8782gv;
    public int n3;
    public byte[] y;
    public int zn;

    public z6(byte[] bArr, int i, int i5) {
        c5(bArr, i, i5);
    }

    public final int a() {
        int i = 0;
        while (!gv()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? v(i) : 0);
    }

    public void c5(byte[] bArr, int i, int i5) {
        this.y = bArr;
        this.zn = i;
        this.n3 = i5;
        this.f8782gv = 0;
        y();
    }

    public void f() {
        int i = this.f8782gv + 1;
        this.f8782gv = i;
        if (i == 8) {
            this.f8782gv = 0;
            int i5 = this.zn;
            this.zn = i5 + (i9(i5 + 1) ? 2 : 1);
        }
        y();
    }

    public int fb() {
        int iA = a();
        return (iA % 2 == 0 ? -1 : 1) * ((iA + 1) / 2);
    }

    public boolean gv() {
        boolean z = (this.y[this.zn] & (128 >> this.f8782gv)) != 0;
        f();
        return z;
    }

    public final boolean i9(int i) {
        if (2 <= i && i < this.n3) {
            byte[] bArr = this.y;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean n3(int i) {
        int i5 = this.zn;
        int i8 = i / 8;
        int i10 = i5 + i8;
        int i11 = (this.f8782gv + i) - (i8 * 8);
        if (i11 > 7) {
            i10++;
            i11 -= 8;
        }
        while (true) {
            i5++;
            if (i5 > i10 || i10 >= this.n3) {
                break;
            }
            if (i9(i5)) {
                i10++;
                i5 += 2;
            }
        }
        int i12 = this.n3;
        if (i10 >= i12) {
            return i10 == i12 && i11 == 0;
        }
        return true;
    }

    public int s() {
        return a();
    }

    public void t(int i) {
        int i5 = this.zn;
        int i8 = i / 8;
        int i10 = i5 + i8;
        this.zn = i10;
        int i11 = this.f8782gv + (i - (i8 * 8));
        this.f8782gv = i11;
        if (i11 > 7) {
            this.zn = i10 + 1;
            this.f8782gv = i11 - 8;
        }
        while (true) {
            i5++;
            if (i5 > this.zn) {
                y();
                return;
            } else if (i9(i5)) {
                this.zn++;
                i5 += 2;
            }
        }
    }

    public int v(int i) {
        int i5;
        this.f8782gv += i;
        int i8 = 0;
        while (true) {
            i5 = this.f8782gv;
            if (i5 <= 8) {
                break;
            }
            int i10 = i5 - 8;
            this.f8782gv = i10;
            byte[] bArr = this.y;
            int i11 = this.zn;
            i8 |= (bArr[i11] & 255) << i10;
            if (!i9(i11 + 1)) {
                i = 1;
            }
            this.zn = i11 + i;
        }
        byte[] bArr2 = this.y;
        int i12 = this.zn;
        int i13 = ((-1) >>> (32 - i)) & (i8 | ((bArr2[i12] & 255) >> (8 - i5)));
        if (i5 == 8) {
            this.f8782gv = 0;
            this.zn = i12 + (i9(i12 + 1) ? 2 : 1);
        }
        y();
        return i13;
    }

    public final void y() {
        int i;
        int i5 = this.zn;
        y.fb(i5 >= 0 && (i5 < (i = this.n3) || (i5 == i && this.f8782gv == 0)));
    }

    public boolean zn() {
        int i = this.zn;
        int i5 = this.f8782gv;
        int i8 = 0;
        while (this.zn < this.n3 && !gv()) {
            i8++;
        }
        boolean z = this.zn == this.n3;
        this.zn = i;
        this.f8782gv = i5;
        return !z && n3((i8 * 2) + 1);
    }
}

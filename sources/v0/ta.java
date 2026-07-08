package v0;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class ta {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8756gv;
    public int n3;
    public byte[] y;
    public int zn;

    public ta() {
        this.y = ut.f8757a;
    }

    public void a(int i, int i5) {
        if (i5 < 32) {
            i &= (1 << i5) - 1;
        }
        int iMin = Math.min(8 - this.zn, i5);
        int i8 = this.zn;
        int i10 = (8 - i8) - iMin;
        byte[] bArr = this.y;
        int i11 = this.n3;
        byte b4 = (byte) (((65280 >> i8) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b4;
        int i12 = i5 - iMin;
        bArr[i11] = (byte) (b4 | ((i >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.y[i13] = (byte) (i >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.y;
        byte b6 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b6;
        bArr2[i13] = (byte) (((i & ((1 << i12) - 1)) << i14) | b6);
        mt(i5);
        y();
    }

    public void c5(byte[] bArr, int i, int i5) {
        int i8 = (i5 >> 3) + i;
        while (i < i8) {
            byte[] bArr2 = this.y;
            int i10 = this.n3;
            int i11 = i10 + 1;
            this.n3 = i11;
            byte b4 = bArr2[i10];
            int i12 = this.zn;
            byte b6 = (byte) (b4 << i12);
            bArr[i] = b6;
            bArr[i] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b6);
            i++;
        }
        int i13 = i5 & 7;
        if (i13 == 0) {
            return;
        }
        byte b7 = (byte) (bArr[i8] & (255 >> i13));
        bArr[i8] = b7;
        int i14 = this.zn;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.y;
            int i15 = this.n3;
            this.n3 = i15 + 1;
            bArr[i8] = (byte) (b7 | ((bArr3[i15] & 255) << i14));
            this.zn = i14 - 8;
        }
        int i16 = this.zn + i13;
        this.zn = i16;
        byte[] bArr4 = this.y;
        int i17 = this.n3;
        bArr[i8] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i8]);
        if (i16 == 8) {
            this.zn = 0;
            this.n3 = i17 + 1;
        }
        y();
    }

    public void co(int i) {
        y.fb(this.zn == 0);
        this.n3 += i;
        y();
    }

    public void f(byte[] bArr, int i, int i5) {
        y.fb(this.zn == 0);
        System.arraycopy(this.y, this.n3, bArr, i, i5);
        this.n3 += i5;
        y();
    }

    public boolean fb() {
        boolean z = (this.y[this.n3] & (128 >> this.zn)) != 0;
        p();
        return z;
    }

    public int gv() {
        y.fb(this.zn == 0);
        return this.n3;
    }

    public long i9(int i) {
        return i <= 32 ? ut.q(s(i)) : ut.ne(s(i - 32), s(32));
    }

    public void mt(int i) {
        int i5 = i / 8;
        int i8 = this.n3 + i5;
        this.n3 = i8;
        int i10 = this.zn + (i - (i5 * 8));
        this.zn = i10;
        if (i10 > 7) {
            this.n3 = i8 + 1;
            this.zn = i10 - 8;
        }
        y();
    }

    public int n3() {
        return ((this.f8756gv - this.n3) * 8) - this.zn;
    }

    public void p() {
        int i = this.zn + 1;
        this.zn = i;
        if (i == 8) {
            this.zn = 0;
            this.n3++;
        }
        y();
    }

    public int s(int i) {
        int i5;
        if (i == 0) {
            return 0;
        }
        this.zn += i;
        int i8 = 0;
        while (true) {
            i5 = this.zn;
            if (i5 <= 8) {
                break;
            }
            int i10 = i5 - 8;
            this.zn = i10;
            byte[] bArr = this.y;
            int i11 = this.n3;
            this.n3 = i11 + 1;
            i8 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.y;
        int i12 = this.n3;
        int i13 = ((-1) >>> (32 - i)) & (i8 | ((bArr2[i12] & 255) >> (8 - i5)));
        if (i5 == 8) {
            this.zn = 0;
            this.n3 = i12 + 1;
        }
        y();
        return i13;
    }

    public String t(int i, Charset charset) {
        byte[] bArr = new byte[i];
        f(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void tl(d dVar) {
        xc(dVar.v(), dVar.fb());
        w(dVar.a() * 8);
    }

    public int v() {
        return (this.n3 * 8) + this.zn;
    }

    public void w(int i) {
        int i5 = i / 8;
        this.n3 = i5;
        this.zn = i - (i5 * 8);
        y();
    }

    public void wz(byte[] bArr) {
        xc(bArr, bArr.length);
    }

    public void xc(byte[] bArr, int i) {
        this.y = bArr;
        this.n3 = 0;
        this.zn = 0;
        this.f8756gv = i;
    }

    public final void y() {
        int i;
        int i5 = this.n3;
        y.fb(i5 >= 0 && (i5 < (i = this.f8756gv) || (i5 == i && this.zn == 0)));
    }

    public void zn() {
        if (this.zn == 0) {
            return;
        }
        this.zn = 0;
        this.n3++;
        y();
    }

    public ta(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ta(byte[] bArr, int i) {
        this.y = bArr;
        this.f8756gv = i;
    }
}

package mn;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class qn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6661a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final short[] f6662c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6663co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6664f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f6665fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f6666gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public short[] f6667i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6668mt;
    public final int n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6669p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public short[] f6672t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6673tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f6674v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public short[] f6675wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f6676x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f6677xc;
    public final int y;
    public int z;
    public final float zn;

    public qn(int i, int i5, float f3, float f4, int i8) {
        this.y = i;
        this.n3 = i5;
        this.zn = f3;
        this.f6666gv = f4;
        this.f6674v = i / i8;
        this.f6661a = i / 400;
        int i10 = i / 65;
        this.f6665fb = i10;
        int i11 = i10 * 2;
        this.f6671s = i11;
        this.f6662c5 = new short[i11];
        this.f6667i9 = new short[i11 * i5];
        this.f6672t = new short[i11 * i5];
        this.f6675wz = new short[i11 * i5];
    }

    public static void w(int i, int i5, short[] sArr, int i8, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i5; i12++) {
            int i13 = (i8 * i5) + i12;
            int i14 = (i11 * i5) + i12;
            int i15 = (i10 * i5) + i12;
            for (int i16 = 0; i16 < i; i16++) {
                sArr[i13] = (short) (((sArr2[i15] * (i - i16)) + (sArr3[i14] * i16)) / i);
                i13 += i5;
                i15 += i5;
                i14 += i5;
            }
        }
    }

    public final short[] a(short[] sArr, int i, int i5) {
        int length = sArr.length;
        int i8 = this.n3;
        int i10 = length / i8;
        return i + i5 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i5) * i8);
    }

    public void c5() {
        this.f6664f = 0;
        this.f6673tl = 0;
        this.f6677xc = 0;
        this.w = 0;
        this.f6669p = 0;
        this.f6668mt = 0;
        this.f6663co = 0;
        this.z = 0;
        this.f6670r = 0;
        this.f6676x4 = 0;
    }

    public void co() {
        int i;
        int i5 = this.f6664f;
        float f3 = this.zn;
        float f4 = this.f6666gv;
        int i8 = this.f6673tl + ((int) ((((i5 / (f3 / f4)) + this.f6677xc) / (this.f6674v * f4)) + 0.5f));
        this.f6667i9 = a(this.f6667i9, i5, (this.f6671s * 2) + i5);
        int i10 = 0;
        while (true) {
            i = this.f6671s;
            int i11 = this.n3;
            if (i10 >= i * 2 * i11) {
                break;
            }
            this.f6667i9[(i11 * i5) + i10] = 0;
            i10++;
        }
        this.f6664f += i * 2;
        mt();
        if (this.f6673tl > i8) {
            this.f6673tl = i8;
        }
        this.f6664f = 0;
        this.f6668mt = 0;
        this.f6677xc = 0;
    }

    public int f() {
        return this.f6673tl * this.n3 * 2;
    }

    public final int fb(short[] sArr, int i) {
        int iS;
        int i5 = this.y;
        int i8 = i5 > 4000 ? i5 / 4000 : 1;
        if (this.n3 == 1 && i8 == 1) {
            iS = s(sArr, i, this.f6661a, this.f6665fb);
        } else {
            v(sArr, i, i8);
            int iS2 = s(this.f6662c5, 0, this.f6661a / i8, this.f6665fb / i8);
            if (i8 != 1) {
                int i10 = iS2 * i8;
                int i11 = i8 * 4;
                int i12 = i10 - i11;
                int i13 = i10 + i11;
                int i14 = this.f6661a;
                if (i12 < i14) {
                    i12 = i14;
                }
                int i15 = this.f6665fb;
                if (i13 > i15) {
                    i13 = i15;
                }
                if (this.n3 == 1) {
                    iS = s(sArr, i, i12, i13);
                } else {
                    v(sArr, i, 1);
                    iS = s(this.f6662c5, 0, i12, i13);
                }
            } else {
                iS = iS2;
            }
        }
        int i16 = p(this.f6670r, this.f6676x4) ? this.f6663co : iS;
        this.z = this.f6670r;
        this.f6663co = iS;
        return i16;
    }

    public final void gv(short[] sArr, int i, int i5) {
        short[] sArrA = a(this.f6672t, this.f6673tl, i5);
        this.f6672t = sArrA;
        int i8 = this.n3;
        System.arraycopy(sArr, i * i8, sArrA, this.f6673tl * i8, i8 * i5);
        this.f6673tl += i5;
    }

    public final int i4(short[] sArr, int i, float f3, int i5) {
        int i8;
        if (f3 >= 2.0f) {
            i8 = (int) (i5 / (f3 - 1.0f));
        } else {
            this.f6668mt = (int) ((i5 * (2.0f - f3)) / (f3 - 1.0f));
            i8 = i5;
        }
        short[] sArrA = a(this.f6672t, this.f6673tl, i8);
        this.f6672t = sArrA;
        w(i8, this.n3, sArrA, this.f6673tl, sArr, i, sArr, i + i5);
        this.f6673tl += i8;
        return i8;
    }

    public void i9(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.n3, this.f6673tl);
        shortBuffer.put(this.f6672t, 0, this.n3 * iMin);
        int i = this.f6673tl - iMin;
        this.f6673tl = i;
        short[] sArr = this.f6672t;
        int i5 = this.n3;
        System.arraycopy(sArr, iMin * i5, sArr, 0, i * i5);
    }

    public final void mt() {
        int i = this.f6673tl;
        float f3 = this.zn;
        float f4 = this.f6666gv;
        float f5 = f3 / f4;
        float f7 = this.f6674v * f4;
        double d4 = f5;
        if (d4 > 1.00001d || d4 < 0.99999d) {
            n3(f5);
        } else {
            gv(this.f6667i9, 0, this.f6664f);
            this.f6664f = 0;
        }
        if (f7 != 1.0f) {
            y(f7, i);
        }
    }

    public final void n3(float f3) {
        int iI4;
        int i = this.f6664f;
        if (i < this.f6671s) {
            return;
        }
        int i5 = 0;
        do {
            if (this.f6668mt > 0) {
                iI4 = zn(i5);
            } else {
                int iFb = fb(this.f6667i9, i5);
                iI4 = ((double) f3) > 1.0d ? iFb + i4(this.f6667i9, i5, f3, iFb) : tl(this.f6667i9, i5, f3, iFb);
            }
            i5 += iI4;
        } while (this.f6671s + i5 <= i);
        x4(i5);
    }

    public final boolean p(int i, int i5) {
        return i != 0 && this.f6663co != 0 && i5 <= i * 3 && i * 2 > this.z * 3;
    }

    public final void r(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f6675wz;
        int i5 = this.n3;
        System.arraycopy(sArr, i * i5, sArr, 0, (this.f6677xc - i) * i5);
        this.f6677xc -= i;
    }

    public final int s(short[] sArr, int i, int i5, int i8) {
        int i10 = i * this.n3;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i5 <= i8) {
            int iAbs = 0;
            for (int i15 = 0; i15 < i5; i15++) {
                iAbs += Math.abs(sArr[i10 + i15] - sArr[(i10 + i5) + i15]);
            }
            if (iAbs * i13 < i12 * i5) {
                i13 = i5;
                i12 = iAbs;
            }
            if (iAbs * i11 > i14 * i5) {
                i11 = i5;
                i14 = iAbs;
            }
            i5++;
        }
        this.f6670r = i12 / i13;
        this.f6676x4 = i14 / i11;
        return i13;
    }

    public int t() {
        return this.f6664f * this.n3 * 2;
    }

    public final int tl(short[] sArr, int i, float f3, int i5) {
        int i8;
        if (f3 < 0.5f) {
            i8 = (int) ((i5 * f3) / (1.0f - f3));
        } else {
            this.f6668mt = (int) ((i5 * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
            i8 = i5;
        }
        int i10 = i5 + i8;
        short[] sArrA = a(this.f6672t, this.f6673tl, i10);
        this.f6672t = sArrA;
        int i11 = this.n3;
        System.arraycopy(sArr, i * i11, sArrA, this.f6673tl * i11, i11 * i5);
        w(i8, this.n3, this.f6672t, this.f6673tl + i5, sArr, i + i5, sArr, i);
        this.f6673tl += i10;
        return i8;
    }

    public final void v(short[] sArr, int i, int i5) {
        int i8 = this.f6671s / i5;
        int i10 = this.n3;
        int i11 = i5 * i10;
        int i12 = i * i10;
        for (int i13 = 0; i13 < i8; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f6662c5[i13] = (short) (i14 / i11);
        }
    }

    public final short wz(short[] sArr, int i, int i5, int i8) {
        short s3 = sArr[i];
        short s5 = sArr[i + this.n3];
        int i10 = this.f6669p * i5;
        int i11 = this.w;
        int i12 = i11 * i8;
        int i13 = (i11 + 1) * i8;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) (((s3 * i14) + ((i15 - i14) * s5)) / i15);
    }

    public final void x4(int i) {
        int i5 = this.f6664f - i;
        short[] sArr = this.f6667i9;
        int i8 = this.n3;
        System.arraycopy(sArr, i * i8, sArr, 0, i8 * i5);
        this.f6664f = i5;
    }

    public final void xc(int i) {
        int i5 = this.f6673tl - i;
        short[] sArrA = a(this.f6675wz, this.f6677xc, i5);
        this.f6675wz = sArrA;
        short[] sArr = this.f6672t;
        int i8 = this.n3;
        System.arraycopy(sArr, i * i8, sArrA, this.f6677xc * i8, i8 * i5);
        this.f6673tl = i;
        this.f6677xc += i5;
    }

    public final void y(float f3, int i) {
        int i5;
        int i8;
        if (this.f6673tl == i) {
            return;
        }
        int i10 = this.y;
        int i11 = (int) (i10 / f3);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        xc(i);
        int i12 = 0;
        while (true) {
            int i13 = this.f6677xc;
            if (i12 >= i13 - 1) {
                r(i13 - 1);
                return;
            }
            while (true) {
                i5 = this.w;
                int i14 = (i5 + 1) * i11;
                i8 = this.f6669p;
                if (i14 <= i8 * i10) {
                    break;
                }
                this.f6672t = a(this.f6672t, this.f6673tl, 1);
                int i15 = 0;
                while (true) {
                    int i16 = this.n3;
                    if (i15 < i16) {
                        this.f6672t[(this.f6673tl * i16) + i15] = wz(this.f6675wz, (i16 * i12) + i15, i10, i11);
                        i15++;
                    }
                }
                this.f6669p++;
                this.f6673tl++;
            }
            int i17 = i5 + 1;
            this.w = i17;
            if (i17 == i10) {
                this.w = 0;
                v0.y.fb(i8 == i11);
                this.f6669p = 0;
            }
            i12++;
        }
    }

    public void z(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.n3;
        int i5 = iRemaining / i;
        short[] sArrA = a(this.f6667i9, this.f6664f, i5);
        this.f6667i9 = sArrA;
        shortBuffer.get(sArrA, this.f6664f * this.n3, ((i * i5) * 2) / 2);
        this.f6664f += i5;
        mt();
    }

    public final int zn(int i) {
        int iMin = Math.min(this.f6671s, this.f6668mt);
        gv(this.f6667i9, i, iMin);
        this.f6668mt -= iMin;
        return iMin;
    }
}

package v0;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public int n3;
    public byte[] y;
    public int zn;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final char[] f8739gv = {'\r', '\n'};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final char[] f8740v = {'\n'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k4.n<Charset> f8738a = k4.n.j(g4.v.y, g4.v.zn, g4.v.f5203a, g4.v.f5204gv, g4.v.f5205v);

    public d() {
        this.y = ut.f8757a;
    }

    public int a() {
        return this.n3;
    }

    public long a8() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        long j = (((long) bArr[i]) & 255) << 24;
        int i8 = i + 2;
        this.n3 = i8;
        long j4 = j | ((((long) bArr[i5]) & 255) << 16);
        int i10 = i + 3;
        this.n3 = i10;
        long j7 = j4 | ((((long) bArr[i8]) & 255) << 8);
        this.n3 = i + 4;
        return (((long) bArr[i10]) & 255) | j7;
    }

    public int b() {
        int iP = p();
        if (iP >= 0) {
            return iP;
        }
        throw new IllegalStateException("Top bit not zero: " + iP);
    }

    public int c() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = bArr[i] & 255;
        this.n3 = i + 2;
        return ((bArr[i5] & 255) << 8) | i8;
    }

    public final int c5(Charset charset) {
        byte bY;
        char cZn;
        int i = 1;
        if ((charset.equals(g4.v.zn) || charset.equals(g4.v.y)) && y() >= 1) {
            bY = (byte) n4.zn.y(n4.c5.y(this.y[this.n3]));
        } else {
            if ((charset.equals(g4.v.f5203a) || charset.equals(g4.v.f5204gv)) && y() >= 2) {
                byte[] bArr = this.y;
                int i5 = this.n3;
                cZn = n4.zn.zn(bArr[i5], bArr[i5 + 1]);
            } else {
                if (!charset.equals(g4.v.f5205v) || y() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.y;
                int i8 = this.n3;
                cZn = n4.zn.zn(bArr2[i8 + 1], bArr2[i8]);
            }
            bY = (byte) cZn;
            i = 2;
        }
        return (n4.zn.y(bY) << 16) + i;
    }

    @Nullable
    public String co() {
        return z(g4.v.zn);
    }

    public String d(int i, Charset charset) {
        String str = new String(this.y, this.n3, i, charset);
        this.n3 += i;
        return str;
    }

    public long d0() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        long j = (((long) bArr[i]) & 255) << 56;
        int i8 = i + 2;
        this.n3 = i8;
        long j4 = j | ((((long) bArr[i5]) & 255) << 48);
        int i10 = i + 3;
        this.n3 = i10;
        long j7 = j4 | ((((long) bArr[i8]) & 255) << 40);
        int i11 = i + 4;
        this.n3 = i11;
        long j8 = j7 | ((((long) bArr[i10]) & 255) << 32);
        int i12 = i + 5;
        this.n3 = i12;
        long j9 = j8 | ((((long) bArr[i11]) & 255) << 24);
        int i13 = i + 6;
        this.n3 = i13;
        long j10 = j9 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i + 7;
        this.n3 = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 8);
        this.n3 = i + 8;
        return (((long) bArr[i14]) & 255) | j11;
    }

    public int ej() {
        byte[] bArr = this.y;
        int i = this.n3;
        this.n3 = i + 1;
        return bArr[i] & 255;
    }

    public void f(ta taVar, int i) {
        t(taVar.y, 0, i);
        taVar.w(0);
    }

    public long f3() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        long j = ((long) bArr[i]) & 255;
        int i8 = i + 2;
        this.n3 = i8;
        long j4 = j | ((((long) bArr[i5]) & 255) << 8);
        int i10 = i + 3;
        this.n3 = i10;
        long j7 = j4 | ((((long) bArr[i8]) & 255) << 16);
        this.n3 = i + 4;
        return ((((long) bArr[i10]) & 255) << 24) | j7;
    }

    public int fb() {
        return this.zn;
    }

    @Nullable
    public String fh() {
        return wz((char) 0);
    }

    public final int gv(Charset charset) {
        int i;
        if (charset.equals(g4.v.zn) || charset.equals(g4.v.y)) {
            i = 1;
        } else {
            if (!charset.equals(g4.v.f5203a) && !charset.equals(g4.v.f5205v) && !charset.equals(g4.v.f5204gv)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i5 = this.n3;
        while (true) {
            int i8 = this.zn;
            if (i5 >= i8 - (i - 1)) {
                return i8;
            }
            if ((charset.equals(g4.v.zn) || charset.equals(g4.v.y)) && ut.bk(this.y[i5])) {
                return i5;
            }
            if (charset.equals(g4.v.f5203a) || charset.equals(g4.v.f5204gv)) {
                byte[] bArr = this.y;
                if (bArr[i5] == 0 && ut.bk(bArr[i5 + 1])) {
                    return i5;
                }
            }
            if (charset.equals(g4.v.f5205v)) {
                byte[] bArr2 = this.y;
                if (bArr2[i5 + 1] == 0 && ut.bk(bArr2[i5])) {
                    return i5;
                }
            }
            i5 += i;
        }
    }

    @Nullable
    public Charset hw() {
        if (y() >= 3) {
            byte[] bArr = this.y;
            int i = this.n3;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.n3 = i + 3;
                return g4.v.zn;
            }
        }
        if (y() < 2) {
            return null;
        }
        byte[] bArr2 = this.y;
        int i5 = this.n3;
        byte b4 = bArr2[i5];
        if (b4 == -2 && bArr2[i5 + 1] == -1) {
            this.n3 = i5 + 2;
            return g4.v.f5204gv;
        }
        if (b4 != -1 || bArr2[i5 + 1] != -2) {
            return null;
        }
        this.n3 = i5 + 2;
        return g4.v.f5205v;
    }

    public short i4() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = bArr[i] & 255;
        this.n3 = i + 2;
        return (short) (((bArr[i5] & 255) << 8) | i8);
    }

    public int i9() {
        return this.y[this.n3] & 255;
    }

    public void j(int i) {
        y.y(i >= 0 && i <= this.y.length);
        this.zn = i;
    }

    public void j5(int i) {
        o(n3() < i ? new byte[i] : this.y, i);
    }

    public long k5() {
        long jD0 = d0();
        if (jD0 >= 0) {
            return jD0;
        }
        throw new IllegalStateException("Top bit not zero: " + jD0);
    }

    public short mg() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = (bArr[i] & 255) << 8;
        this.n3 = i + 2;
        return (short) ((bArr[i5] & 255) | i8);
    }

    public int mt() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = ((bArr[i] & 255) << 24) >> 8;
        int i10 = i + 2;
        this.n3 = i10;
        int i11 = ((bArr[i5] & 255) << 8) | i8;
        this.n3 = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public int n() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        throw new IllegalStateException("Top bit not zero: " + iR);
    }

    public int n3() {
        return this.y.length;
    }

    public void o(byte[] bArr, int i) {
        this.y = bArr;
        this.zn = i;
        this.n3 = 0;
    }

    public void oz(int i) {
        y.y(i >= 0 && i <= this.zn);
        this.n3 = i;
    }

    public int p() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = (bArr[i] & 255) << 24;
        int i10 = i + 2;
        this.n3 = i10;
        int i11 = ((bArr[i5] & 255) << 16) | i8;
        int i12 = i + 3;
        this.n3 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 8);
        this.n3 = i + 4;
        return (bArr[i12] & 255) | i13;
    }

    public final void q9(Charset charset) {
        if (tl(charset, f8739gv) == '\r') {
            tl(charset, f8740v);
        }
    }

    public void qn(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public int r() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = bArr[i] & 255;
        int i10 = i + 2;
        this.n3 = i10;
        int i11 = ((bArr[i5] & 255) << 8) | i8;
        int i12 = i + 3;
        this.n3 = i12;
        int i13 = i11 | ((bArr[i10] & 255) << 16);
        this.n3 = i + 4;
        return ((bArr[i12] & 255) << 24) | i13;
    }

    public String rz(int i) {
        if (i == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int i5 = this.n3;
        int i8 = (i5 + i) - 1;
        String strTa = ut.ta(this.y, i5, (i8 >= this.zn || this.y[i8] != 0) ? i : i - 1);
        this.n3 += i;
        return strTa;
    }

    public char s(Charset charset) {
        y.n3(f8738a.contains(charset), "Unsupported charset: " + charset);
        return (char) (c5(charset) >> 16);
    }

    public void t(byte[] bArr, int i, int i5) {
        System.arraycopy(this.y, this.n3, bArr, i, i5);
        this.n3 += i5;
    }

    public String ta(int i) {
        return d(i, g4.v.zn);
    }

    public final char tl(Charset charset, char[] cArr) {
        int iC5 = c5(charset);
        if (iC5 == 0) {
            return (char) 0;
        }
        char c = (char) (iC5 >> 16);
        if (!n4.zn.n3(cArr, c)) {
            return (char) 0;
        }
        this.n3 += iC5 & 65535;
        return c;
    }

    public int ud() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = (bArr[i] & 255) << 8;
        this.n3 = i + 2;
        int i10 = (bArr[i5] & 255) | i8;
        this.n3 = i + 4;
        return i10;
    }

    public void ut(int i) {
        oz(this.n3 + i);
    }

    public byte[] v() {
        return this.y;
    }

    public long vl() {
        int i;
        int i5;
        long j = this.y[this.n3];
        int i8 = 7;
        while (true) {
            if (i8 < 0) {
                break;
            }
            int i10 = 1 << i8;
            if ((((long) i10) & j) != 0) {
                i8--;
            } else if (i8 < 6) {
                j &= (long) (i10 - 1);
                i5 = 7 - i8;
            } else if (i8 == 7) {
                i5 = 1;
            }
        }
        i5 = 0;
        if (i5 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i5; i++) {
            byte b4 = this.y[this.n3 + i];
            if ((b4 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b4 & 63));
        }
        this.n3 += i5;
        return j;
    }

    public float w() {
        return Float.intBitsToFloat(p());
    }

    @Nullable
    public String wz(char c) {
        if (y() == 0) {
            return null;
        }
        int i = this.n3;
        while (i < this.zn && this.y[i] != c) {
            i++;
        }
        byte[] bArr = this.y;
        int i5 = this.n3;
        String strTa = ut.ta(bArr, i5, i - i5);
        this.n3 = i;
        if (i < this.zn) {
            this.n3 = i + 1;
        }
        return strTa;
    }

    public int x() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = (bArr[i] & 255) << 16;
        int i10 = i + 2;
        this.n3 = i10;
        int i11 = ((bArr[i5] & 255) << 8) | i8;
        this.n3 = i + 3;
        return (bArr[i10] & 255) | i11;
    }

    public long x4() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        long j = ((long) bArr[i]) & 255;
        int i8 = i + 2;
        this.n3 = i8;
        long j4 = j | ((((long) bArr[i5]) & 255) << 8);
        int i10 = i + 3;
        this.n3 = i10;
        long j7 = j4 | ((((long) bArr[i8]) & 255) << 16);
        int i11 = i + 4;
        this.n3 = i11;
        long j8 = j7 | ((((long) bArr[i10]) & 255) << 24);
        int i12 = i + 5;
        this.n3 = i12;
        long j9 = j8 | ((((long) bArr[i11]) & 255) << 32);
        int i13 = i + 6;
        this.n3 = i13;
        long j10 = j9 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i + 7;
        this.n3 = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 48);
        this.n3 = i + 8;
        return ((((long) bArr[i14]) & 255) << 56) | j11;
    }

    public double xc() {
        return Double.longBitsToDouble(d0());
    }

    public int y() {
        return this.zn - this.n3;
    }

    public int yt() {
        byte[] bArr = this.y;
        int i = this.n3;
        int i5 = i + 1;
        this.n3 = i5;
        int i8 = (bArr[i] & 255) << 8;
        this.n3 = i + 2;
        return (bArr[i5] & 255) | i8;
    }

    @Nullable
    public String z(Charset charset) {
        y.n3(f8738a.contains(charset), "Unsupported charset: " + charset);
        if (y() == 0) {
            return null;
        }
        if (!charset.equals(g4.v.y)) {
            hw();
        }
        String strD = d(gv(charset) - this.n3, charset);
        if (this.n3 == this.zn) {
            return strD;
        }
        q9(charset);
        return strD;
    }

    public int z6() {
        return (ej() << 21) | (ej() << 14) | (ej() << 7) | ej();
    }

    public void zn(int i) {
        if (i > n3()) {
            this.y = Arrays.copyOf(this.y, i);
        }
    }

    public d(int i) {
        this.y = new byte[i];
        this.zn = i;
    }

    public d(byte[] bArr) {
        this.y = bArr;
        this.zn = bArr.length;
    }

    public d(byte[] bArr, int i) {
        this.y = bArr;
        this.zn = i;
    }
}

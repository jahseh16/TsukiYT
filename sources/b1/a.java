package b1;

import ft.rb;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1243a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f1244fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f1245gv;
    public final r0.c5 n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f1246v = new byte[65536];
    public final byte[] y = new byte[4096];
    public final long zn;

    static {
        rb.y("goog.exo.extractor");
    }

    public a(r0.c5 c5Var, long j, long j4) {
        this.n3 = c5Var;
        this.f1245gv = j;
        this.zn = j4;
    }

    public final void a(int i) {
        if (i != -1) {
            this.f1245gv += (long) i;
        }
    }

    public final void c5(int i) {
        int i5 = this.f1243a + i;
        byte[] bArr = this.f1246v;
        if (i5 > bArr.length) {
            this.f1246v = Arrays.copyOf(this.f1246v, ut.p(bArr.length * 2, 65536 + i5, i5 + 524288));
        }
    }

    @Override // b1.tl
    public long f() {
        return this.f1245gv + ((long) this.f1243a);
    }

    public final void f3(int i) {
        int i5 = this.f1244fb - i;
        this.f1244fb = i5;
        this.f1243a = 0;
        byte[] bArr = this.f1246v;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i5);
        this.f1246v = bArr2;
    }

    @Override // b1.tl
    public long getLength() {
        return this.zn;
    }

    @Override // b1.tl
    public long getPosition() {
        return this.f1245gv;
    }

    public boolean i4(int i, boolean z) throws IOException {
        int iX4 = x4(i);
        while (iX4 < i && iX4 != -1) {
            iX4 = r(this.y, -iX4, Math.min(i, this.y.length + iX4), iX4, z);
        }
        a(iX4);
        return iX4 != -1;
    }

    @Override // b1.tl
    public boolean i9(byte[] bArr, int i, int i5, boolean z) throws IOException {
        int iP = p(bArr, i, i5);
        while (iP < i5 && iP != -1) {
            iP = r(bArr, i, i5, iP, z);
        }
        a(iP);
        return iP != -1;
    }

    @Override // b1.tl
    public boolean mt(int i, boolean z) throws IOException {
        c5(i);
        int iR = this.f1244fb - this.f1243a;
        while (iR < i) {
            iR = r(this.f1246v, this.f1243a, i, iR, z);
            if (iR == -1) {
                return false;
            }
            this.f1244fb = this.f1243a + iR;
        }
        this.f1243a += i;
        return true;
    }

    public final int p(byte[] bArr, int i, int i5) {
        int i8 = this.f1244fb;
        if (i8 == 0) {
            return 0;
        }
        int iMin = Math.min(i8, i5);
        System.arraycopy(this.f1246v, 0, bArr, i, iMin);
        f3(iMin);
        return iMin;
    }

    public final int r(byte[] bArr, int i, int i5, int i8, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i10 = this.n3.read(bArr, i + i8, i5 - i8);
        if (i10 != -1) {
            return i8 + i10;
        }
        if (i8 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // b1.tl, r0.c5
    public int read(byte[] bArr, int i, int i5) throws IOException {
        int iP = p(bArr, i, i5);
        if (iP == 0) {
            iP = r(bArr, i, i5, 0, true);
        }
        a(iP);
        return iP;
    }

    @Override // b1.tl
    public void readFully(byte[] bArr, int i, int i5) throws IOException {
        i9(bArr, i, i5, false);
    }

    @Override // b1.tl
    public void s() {
        this.f1243a = 0;
    }

    @Override // b1.tl
    public void tl(int i) throws IOException {
        mt(i, false);
    }

    @Override // b1.tl
    public boolean v(byte[] bArr, int i, int i5, boolean z) throws IOException {
        if (!mt(i5, z)) {
            return false;
        }
        System.arraycopy(this.f1246v, this.f1243a - i5, bArr, i, i5);
        return true;
    }

    @Override // b1.tl
    public void w(int i) throws IOException {
        i4(i, false);
    }

    @Override // b1.tl
    public int wz(int i) throws IOException {
        int iX4 = x4(i);
        if (iX4 == 0) {
            byte[] bArr = this.y;
            iX4 = r(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        a(iX4);
        return iX4;
    }

    public final int x4(int i) {
        int iMin = Math.min(this.f1244fb, i);
        f3(iMin);
        return iMin;
    }

    @Override // b1.tl
    public int xc(byte[] bArr, int i, int i5) throws IOException {
        int iMin;
        c5(i5);
        int i8 = this.f1244fb;
        int i10 = this.f1243a;
        int i11 = i8 - i10;
        if (i11 == 0) {
            iMin = r(this.f1246v, i10, i5, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f1244fb += iMin;
        } else {
            iMin = Math.min(i5, i11);
        }
        System.arraycopy(this.f1246v, this.f1243a, bArr, i, iMin);
        this.f1243a += iMin;
        return iMin;
    }

    @Override // b1.tl
    public void z(byte[] bArr, int i, int i5) throws IOException {
        v(bArr, i, i5, false);
    }
}

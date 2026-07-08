package ur;

import androidx.annotation.Nullable;
import b1.ta;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import r0.n3;
import ur.f7;

/* JADX INFO: loaded from: classes.dex */
public class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f8627a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f8628fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public y f8629gv;
    public final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y f8630v;
    public final r0.n3 y;
    public final v0.d zn;

    public static final class y implements n3.y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public y f8631gv;
        public long n3;
        public long y;

        @Nullable
        public r0.y zn;

        public y(long j, int i) {
            gv(j, i);
        }

        public void gv(long j, int i) {
            v0.y.fb(this.zn == null);
            this.y = j;
            this.n3 = j + ((long) i);
        }

        public y n3() {
            this.zn = null;
            y yVar = this.f8631gv;
            this.f8631gv = null;
            return yVar;
        }

        @Override // r0.n3.y
        @Nullable
        public n3.y next() {
            y yVar = this.f8631gv;
            if (yVar == null || yVar.zn == null) {
                return null;
            }
            return yVar;
        }

        public int v(long j) {
            return ((int) (j - this.y)) + this.zn.n3;
        }

        @Override // r0.n3.y
        public r0.y y() {
            return (r0.y) v0.y.v(this.zn);
        }

        public void zn(r0.y yVar, y yVar2) {
            this.zn = yVar;
            this.f8631gv = yVar2;
        }
    }

    public q9(r0.n3 n3Var) {
        this.y = n3Var;
        int iV = n3Var.v();
        this.n3 = iV;
        this.zn = new v0.d(32);
        y yVar = new y(0L, iV);
        this.f8629gv = yVar;
        this.f8630v = yVar;
        this.f8627a = yVar;
    }

    public static y c5(y yVar, long j, ByteBuffer byteBuffer, int i) {
        y yVarGv = gv(yVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (yVarGv.n3 - j));
            byteBuffer.put(yVarGv.zn.y, yVarGv.v(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == yVarGv.n3) {
                yVarGv = yVarGv.f8631gv;
            }
        }
        return yVarGv;
    }

    public static y f(y yVar, di.fb fbVar, f7.n3 n3Var, v0.d dVar) {
        int iYt;
        long j = n3Var.n3;
        dVar.j5(1);
        y yVarI9 = i9(yVar, j, dVar.v(), 1);
        long j4 = j + 1;
        byte b4 = dVar.v()[0];
        boolean z = (b4 & 128) != 0;
        int i = b4 & 127;
        di.zn znVar = fbVar.f3183v;
        byte[] bArr = znVar.y;
        if (bArr == null) {
            znVar.y = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        y yVarI92 = i9(yVarI9, j4, znVar.y, i);
        long j7 = j4 + ((long) i);
        if (z) {
            dVar.j5(2);
            yVarI92 = i9(yVarI92, j7, dVar.v(), 2);
            j7 += 2;
            iYt = dVar.yt();
        } else {
            iYt = 1;
        }
        int[] iArr = znVar.f3208gv;
        if (iArr == null || iArr.length < iYt) {
            iArr = new int[iYt];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = znVar.f3211v;
        if (iArr3 == null || iArr3.length < iYt) {
            iArr3 = new int[iYt];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i5 = iYt * 6;
            dVar.j5(i5);
            yVarI92 = i9(yVarI92, j7, dVar.v(), i5);
            j7 += (long) i5;
            dVar.oz(0);
            for (int i8 = 0; i8 < iYt; i8++) {
                iArr2[i8] = dVar.yt();
                iArr4[i8] = dVar.b();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = n3Var.y - ((int) (j7 - n3Var.n3));
        }
        ta.y yVar2 = (ta.y) v0.ut.i9(n3Var.zn);
        znVar.zn(iYt, iArr2, iArr4, yVar2.n3, znVar.y, yVar2.y, yVar2.zn, yVar2.f1278gv);
        long j8 = n3Var.n3;
        int i10 = (int) (j7 - j8);
        n3Var.n3 = j8 + ((long) i10);
        n3Var.y -= i10;
        return yVarI92;
    }

    public static y gv(y yVar, long j) {
        while (j >= yVar.n3) {
            yVar = yVar.f8631gv;
        }
        return yVar;
    }

    public static y i9(y yVar, long j, byte[] bArr, int i) {
        y yVarGv = gv(yVar, j);
        int i5 = i;
        while (i5 > 0) {
            int iMin = Math.min(i5, (int) (yVarGv.n3 - j));
            System.arraycopy(yVarGv.zn.y, yVarGv.v(j), bArr, i - i5, iMin);
            i5 -= iMin;
            j += (long) iMin;
            if (j == yVarGv.n3) {
                yVarGv = yVarGv.f8631gv;
            }
        }
        return yVarGv;
    }

    public static y t(y yVar, di.fb fbVar, f7.n3 n3Var, v0.d dVar) {
        if (fbVar.z()) {
            yVar = f(yVar, fbVar, n3Var, dVar);
        }
        if (!fbVar.c5()) {
            fbVar.mt(n3Var.y);
            return c5(yVar, n3Var.n3, fbVar.f3179fb, n3Var.y);
        }
        dVar.j5(4);
        y yVarI9 = i9(yVar, n3Var.n3, dVar.v(), 4);
        int iB = dVar.b();
        n3Var.n3 += 4;
        n3Var.y -= 4;
        fbVar.mt(iB);
        y yVarC5 = c5(yVarI9, n3Var.n3, fbVar.f3179fb, iB);
        n3Var.n3 += (long) iB;
        int i = n3Var.y - iB;
        n3Var.y = i;
        fbVar.x4(i);
        return c5(yVarC5, n3Var.n3, fbVar.f3182t, n3Var.y);
    }

    public void a(di.fb fbVar, f7.n3 n3Var) {
        t(this.f8630v, fbVar, n3Var, this.zn);
    }

    public final void fb(int i) {
        long j = this.f8628fb + ((long) i);
        this.f8628fb = j;
        y yVar = this.f8627a;
        if (j == yVar.n3) {
            this.f8627a = yVar.f8631gv;
        }
    }

    public void n3(long j) {
        y yVar;
        if (j == -1) {
            return;
        }
        while (true) {
            yVar = this.f8629gv;
            if (j < yVar.n3) {
                break;
            }
            this.y.gv(yVar.zn);
            this.f8629gv = this.f8629gv.n3();
        }
        if (this.f8630v.y < yVar.y) {
            this.f8630v = yVar;
        }
    }

    public void p(v0.d dVar, int i) {
        while (i > 0) {
            int iS = s(i);
            y yVar = this.f8627a;
            dVar.t(yVar.zn.y, yVar.v(this.f8628fb), iS);
            i -= iS;
            fb(iS);
        }
    }

    public final int s(int i) {
        y yVar = this.f8627a;
        if (yVar.zn == null) {
            yVar.zn(this.y.n3(), new y(this.f8627a.n3, this.n3));
        }
        return Math.min(i, (int) (this.f8627a.n3 - this.f8628fb));
    }

    public void tl(di.fb fbVar, f7.n3 n3Var) {
        this.f8630v = t(this.f8630v, fbVar, n3Var, this.zn);
    }

    public long v() {
        return this.f8628fb;
    }

    public int w(r0.c5 c5Var, int i, boolean z) throws IOException {
        int iS = s(i);
        y yVar = this.f8627a;
        int i5 = c5Var.read(yVar.zn.y, yVar.v(this.f8628fb), iS);
        if (i5 != -1) {
            fb(i5);
            return i5;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void wz() {
        y(this.f8629gv);
        this.f8629gv.gv(0L, this.n3);
        y yVar = this.f8629gv;
        this.f8630v = yVar;
        this.f8627a = yVar;
        this.f8628fb = 0L;
        this.y.zn();
    }

    public void xc() {
        this.f8630v = this.f8629gv;
    }

    public final void y(y yVar) {
        if (yVar.zn == null) {
            return;
        }
        this.y.y(yVar);
        yVar.n3();
    }

    public void zn(long j) {
        v0.y.y(j <= this.f8628fb);
        this.f8628fb = j;
        if (j != 0) {
            y yVar = this.f8629gv;
            if (j != yVar.y) {
                while (this.f8628fb > yVar.n3) {
                    yVar = yVar.f8631gv;
                }
                y yVar2 = (y) v0.y.v(yVar.f8631gv);
                y(yVar2);
                y yVar3 = new y(yVar.n3, this.n3);
                yVar.f8631gv = yVar3;
                if (this.f8628fb == yVar.n3) {
                    yVar = yVar3;
                }
                this.f8627a = yVar;
                if (this.f8630v == yVar2) {
                    this.f8630v = yVar3;
                    return;
                }
                return;
            }
        }
        y(this.f8629gv);
        y yVar4 = new y(this.f8628fb, this.n3);
        this.f8629gv = yVar4;
        this.f8630v = yVar4;
        this.f8627a = yVar4;
    }
}

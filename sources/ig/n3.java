package ig;

import androidx.annotation.Nullable;
import b1.co;
import b1.fh;
import b1.r;
import b1.tl;
import b1.x4;
import b1.z;
import ig.c5;
import java.util.Arrays;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends c5 {

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public x4 f5698wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public y f5699xc;

    public static final class y implements fb {
        public x4.y n3;
        public x4 y;
        public long zn = -1;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f5700gv = -1;

        public y(x4 x4Var, x4.y yVar) {
            this.y = x4Var;
            this.n3 = yVar;
        }

        public void gv(long j) {
            this.zn = j;
        }

        @Override // ig.fb
        public long n3(tl tlVar) {
            long j = this.f5700gv;
            if (j < 0) {
                return -1L;
            }
            long j4 = -(j + 2);
            this.f5700gv = -1L;
            return j4;
        }

        @Override // ig.fb
        public fh y() {
            v0.y.fb(this.zn != -1);
            return new r(this.y, this.zn);
        }

        @Override // ig.fb
        public void zn(long j) {
            long[] jArr = this.n3.y;
            this.f5700gv = jArr[ut.c5(jArr, j, true, true)];
        }
    }

    public static boolean w(d dVar) {
        return dVar.y() >= 5 && dVar.ej() == 127 && dVar.a8() == 1179402563;
    }

    public static boolean xc(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // ig.c5
    public long a(d dVar) {
        if (xc(dVar.v())) {
            return wz(dVar);
        }
        return -1L;
    }

    @Override // ig.c5
    public boolean c5(d dVar, long j, c5.n3 n3Var) {
        byte[] bArrV = dVar.v();
        x4 x4Var = this.f5698wz;
        if (x4Var == null) {
            x4 x4Var2 = new x4(bArrV, 17);
            this.f5698wz = x4Var2;
            n3Var.y = x4Var2.fb(Arrays.copyOfRange(bArrV, 9, dVar.fb()), null);
            return true;
        }
        if ((bArrV[0] & 127) == 3) {
            x4.y yVarFb = z.fb(dVar);
            x4 x4VarN3 = x4Var.n3(yVarFb);
            this.f5698wz = x4VarN3;
            this.f5699xc = new y(x4VarN3, yVarFb);
            return true;
        }
        if (!xc(bArrV)) {
            return true;
        }
        y yVar = this.f5699xc;
        if (yVar != null) {
            yVar.gv(j);
            n3Var.n3 = this.f5699xc;
        }
        v0.y.v(n3Var.y);
        return false;
    }

    @Override // ig.c5
    public void t(boolean z) {
        super.t(z);
        if (z) {
            this.f5698wz = null;
            this.f5699xc = null;
        }
    }

    public final int wz(d dVar) {
        int i = (dVar.v()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            dVar.ut(4);
            dVar.vl();
        }
        int iI9 = co.i9(dVar, i);
        dVar.oz(0);
        return iI9;
    }
}

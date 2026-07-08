package n0;

import android.util.Pair;
import androidx.annotation.Nullable;
import ft.gn;
import ft.ic;
import ft.k3;
import ft.xq;
import java.util.Arrays;
import ur.lc;
import ur.mg;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class fh extends ud {

    @Nullable
    public y zn;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[][][] f6750a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final lc f6751fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final lc[] f6752gv;
        public final String[] n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int[] f6753v;
        public final int y;
        public final int[] zn;

        public y(String[] strArr, int[] iArr, lc[] lcVarArr, int[] iArr2, int[][][] iArr3, lc lcVar) {
            this.n3 = strArr;
            this.zn = iArr;
            this.f6752gv = lcVarArr;
            this.f6750a = iArr3;
            this.f6753v = iArr2;
            this.f6751fb = lcVar;
            this.y = iArr.length;
        }

        public lc a(int i) {
            return this.f6752gv[i];
        }

        public int fb(int i, int i5, int i8) {
            return k3.a(zn(i, i5, i8));
        }

        public int gv() {
            return this.y;
        }

        public int n3(int i, int i5, int[] iArr) {
            int i8 = 0;
            String str = null;
            boolean z = false;
            int i10 = 0;
            int iMin = 16;
            while (i8 < iArr.length) {
                String str2 = this.f6752gv[i].n3(i5).zn(iArr[i8]).f3;
                int i11 = i10 + 1;
                if (i10 == 0) {
                    str = str2;
                } else {
                    z |= !ut.zn(str, str2);
                }
                iMin = Math.min(iMin, k3.gv(this.f6750a[i][i5][i8]));
                i8++;
                i10 = i11;
            }
            return z ? Math.min(iMin, this.f6753v[i]) : iMin;
        }

        public lc s() {
            return this.f6751fb;
        }

        public int v(int i) {
            return this.zn[i];
        }

        public int y(int i, int i5, boolean z) {
            int i8 = this.f6752gv[i].n3(i5).y;
            int[] iArr = new int[i8];
            int i10 = 0;
            for (int i11 = 0; i11 < i8; i11++) {
                int iFb = fb(i, i5, i11);
                if (iFb == 4 || (z && iFb == 3)) {
                    iArr[i10] = i11;
                    i10++;
                }
            }
            return n3(i, i5, Arrays.copyOf(iArr, i10));
        }

        public int zn(int i, int i5, int i8) {
            return this.f6750a[i][i5][i8];
        }
    }

    public static int[] p(ic[] icVarArr) throws ft.p {
        int length = icVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = icVarArr[i].mt();
        }
        return iArr;
    }

    public static int[] w(ic icVar, rs rsVar) throws ft.p {
        int[] iArr = new int[rsVar.y];
        for (int i = 0; i < rsVar.y; i++) {
            iArr[i] = icVar.n3(rsVar.zn(i));
        }
        return iArr;
    }

    public static int wz(ic[] icVarArr, rs rsVar, int[] iArr, boolean z) throws ft.p {
        int length = icVarArr.length;
        int i = 0;
        boolean z5 = true;
        for (int i5 = 0; i5 < icVarArr.length; i5++) {
            ic icVar = icVarArr[i5];
            int iMax = 0;
            for (int i8 = 0; i8 < rsVar.y; i8++) {
                iMax = Math.max(iMax, k3.a(icVar.n3(rsVar.zn(i8))));
            }
            boolean z7 = iArr[i5] == 0;
            if (iMax > i || (iMax == i && z && !z5 && z7)) {
                length = i5;
                z5 = z7;
                i = iMax;
            }
        }
        return length;
    }

    @Override // n0.ud
    public final void c5(@Nullable Object obj) {
        this.zn = (y) obj;
    }

    @Override // n0.ud
    public final a8 f(ic[] icVarArr, lc lcVar, mg.n3 n3Var, xq xqVar) throws ft.p {
        int[] iArr = new int[icVarArr.length + 1];
        int length = icVarArr.length + 1;
        rs[][] rsVarArr = new rs[length][];
        int[][][] iArr2 = new int[icVarArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i5 = lcVar.y;
            rsVarArr[i] = new rs[i5];
            iArr2[i] = new int[i5][];
        }
        int[] iArrP = p(icVarArr);
        for (int i8 = 0; i8 < lcVar.y; i8++) {
            rs rsVarN3 = lcVar.n3(i8);
            int iWz = wz(icVarArr, rsVarN3, iArr, rsVarN3.f8637fb == 5);
            int[] iArrW = iWz == icVarArr.length ? new int[rsVarN3.y] : w(icVarArr[iWz], rsVarN3);
            int i10 = iArr[iWz];
            rsVarArr[iWz][i10] = rsVarN3;
            iArr2[iWz][i10] = iArrW;
            iArr[iWz] = i10 + 1;
        }
        lc[] lcVarArr = new lc[icVarArr.length];
        String[] strArr = new String[icVarArr.length];
        int[] iArr3 = new int[icVarArr.length];
        for (int i11 = 0; i11 < icVarArr.length; i11++) {
            int i12 = iArr[i11];
            lcVarArr[i11] = new lc((rs[]) ut.qj(rsVarArr[i11], i12));
            iArr2[i11] = (int[][]) ut.qj(iArr2[i11], i12);
            strArr[i11] = icVarArr[i11].getName();
            iArr3[i11] = icVarArr[i11].s();
        }
        y yVar = new y(strArr, iArr3, lcVarArr, iArrP, iArr2, new lc((rs[]) ut.qj(rsVarArr[icVarArr.length], iArr[icVarArr.length])));
        Pair<gn[], c[]> pairMt = mt(yVar, iArr2, iArrP, n3Var, xqVar);
        return new a8((gn[]) pairMt.first, (c[]) pairMt.second, ej.n3(yVar, (rz[]) pairMt.second), yVar);
    }

    public abstract Pair<gn[], c[]> mt(y yVar, int[][][] iArr, int[] iArr2, mg.n3 n3Var, xq xqVar) throws ft.p;

    @Nullable
    public final y xc() {
        return this.zn;
    }
}

package zo;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import zo.zn;

/* JADX INFO: loaded from: classes.dex */
public final class k3 {
    public static final k3 vl = co(new k3[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9522a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public final int f9523a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<y> f9524b;
    public final int c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final long f9525c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final long f9526co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9527d;
    public final int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final long f9528ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9529f;
    public final long f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f9530fb;
    public final long fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f9531gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final long f9532i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int f9533i9;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public final List<y> f9534k5;
    public final long mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final List<n3> f9535mt;
    public final int n;
    public final List<zn> n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<n3> f9536p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f9537r;
    public final int rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f9539t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final long f9540ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final int f9541tl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public final int f9542ud;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f9543v;
    public final int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final int f9544wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f9545x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final long f9546x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final long f9547xc;
    public final int y;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public final long[] f9548yt;
    public final long z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public final long f9549z6;
    public final List<long[]> zn;

    public static final class n3 {

        @Nullable
        public final ft.g n3;
        public final zn.y y;

        public n3(zn.y yVar, @Nullable ft.g gVar) {
            this.y = yVar;
            this.n3 = gVar;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n3.class != obj.getClass()) {
                return false;
            }
            n3 n3Var = (n3) obj;
            if (!this.y.equals(n3Var.y)) {
                return false;
            }
            ft.g gVar = this.n3;
            ft.g gVar2 = n3Var.n3;
            return gVar != null ? gVar.equals(gVar2) : gVar2 == null;
        }

        public int hashCode() {
            int iHashCode = this.y.hashCode() * 31;
            ft.g gVar = this.n3;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }
    }

    public static final class y {
        public final Exception n3;
        public final zn.y y;

        public y(zn.y yVar, Exception exc) {
            this.y = yVar;
            this.n3 = exc;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || y.class != obj.getClass()) {
                return false;
            }
            y yVar = (y) obj;
            if (this.y.equals(yVar.y)) {
                return this.n3.equals(yVar.n3);
            }
            return false;
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + this.n3.hashCode();
        }
    }

    public static final class zn {
        public final int n3;
        public final zn.y y;

        public zn(zn.y yVar, int i) {
            this.y = yVar;
            this.n3 = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || zn.class != obj.getClass()) {
                return false;
            }
            zn znVar = (zn) obj;
            if (this.n3 != znVar.n3) {
                return false;
            }
            return this.y.equals(znVar.y);
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + this.n3;
        }
    }

    public k3(int i, long[] jArr, List<zn> list, List<long[]> list2, long j, int i5, int i8, int i10, int i11, long j4, int i12, int i13, int i14, int i15, int i16, long j7, int i17, List<n3> list3, List<n3> list4, long j8, long j9, long j10, long j11, long j12, long j13, int i18, int i19, int i20, long j14, int i21, long j15, long j16, long j17, long j18, long j19, int i22, int i23, int i24, List<y> list5, List<y> list6) {
        this.y = i;
        this.f9548yt = jArr;
        this.n3 = Collections.unmodifiableList(list);
        this.zn = Collections.unmodifiableList(list2);
        this.f9531gv = j;
        this.f9543v = i5;
        this.f9522a = i8;
        this.f9530fb = i10;
        this.f9538s = i11;
        this.f9525c5 = j4;
        this.f9533i9 = i12;
        this.f9529f = i13;
        this.f9539t = i14;
        this.f9541tl = i15;
        this.f9544wz = i16;
        this.f9547xc = j7;
        this.w = i17;
        this.f9536p = Collections.unmodifiableList(list3);
        this.f9535mt = Collections.unmodifiableList(list4);
        this.f9526co = j8;
        this.z = j9;
        this.f9537r = j10;
        this.f9546x4 = j11;
        this.f9532i4 = j12;
        this.f3 = j13;
        this.n = i18;
        this.c = i19;
        this.d0 = i20;
        this.fh = j14;
        this.rz = i21;
        this.mg = j15;
        this.f9540ta = j16;
        this.f9527d = j17;
        this.f9549z6 = j18;
        this.f9528ej = j19;
        this.f9542ud = i22;
        this.f9523a8 = i23;
        this.f9545x = i24;
        this.f9524b = Collections.unmodifiableList(list5);
        this.f9534k5 = Collections.unmodifiableList(list6);
    }

    public static k3 co(k3... k3VarArr) {
        int i;
        int i5 = 16;
        long[] jArr = new long[16];
        int length = k3VarArr.length;
        long j = 0;
        long j4 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        int i8 = 0;
        int i10 = 0;
        int i11 = -1;
        long jMax = -9223372036854775807L;
        long jMin = -9223372036854775807L;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        long j15 = -9223372036854775807L;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        long j16 = -1;
        int i24 = 0;
        long j17 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i8 < length) {
            k3 k3Var = k3VarArr[i8];
            i10 += k3Var.y;
            for (int i28 = 0; i28 < i5; i28++) {
                jArr[i28] = jArr[i28] + k3Var.f9548yt[i28];
            }
            if (jMin == -9223372036854775807L) {
                jMin = k3Var.f9531gv;
                i = length;
            } else {
                i = length;
                long j18 = k3Var.f9531gv;
                if (j18 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j18);
                }
            }
            i12 += k3Var.f9543v;
            i13 += k3Var.f9522a;
            i14 += k3Var.f9530fb;
            i15 += k3Var.f9538s;
            if (j15 == -9223372036854775807L) {
                j15 = k3Var.f9525c5;
            } else {
                long j19 = k3Var.f9525c5;
                if (j19 != -9223372036854775807L) {
                    j15 += j19;
                }
            }
            i16 += k3Var.f9533i9;
            i17 += k3Var.f9529f;
            i18 += k3Var.f9539t;
            i19 += k3Var.f9541tl;
            i20 += k3Var.f9544wz;
            if (jMax == -9223372036854775807L) {
                jMax = k3Var.f9547xc;
            } else {
                long j20 = k3Var.f9547xc;
                if (j20 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j20);
                }
            }
            i21 += k3Var.w;
            j += k3Var.f9526co;
            j4 += k3Var.z;
            j7 += k3Var.f9537r;
            j8 += k3Var.f9546x4;
            j9 += k3Var.f9532i4;
            j10 += k3Var.f3;
            i22 += k3Var.n;
            i23 += k3Var.c;
            if (i11 == -1) {
                i11 = k3Var.d0;
            } else {
                int i29 = k3Var.d0;
                if (i29 != -1) {
                    i11 += i29;
                }
            }
            if (j16 == -1) {
                j16 = k3Var.fh;
            } else {
                long j21 = k3Var.fh;
                if (j21 != -1) {
                    j16 += j21;
                }
            }
            i24 += k3Var.rz;
            if (j17 == -1) {
                j17 = k3Var.mg;
            } else {
                long j22 = k3Var.mg;
                if (j22 != -1) {
                    j17 += j22;
                }
            }
            j11 += k3Var.f9540ta;
            j12 += k3Var.f9527d;
            j13 += k3Var.f9549z6;
            j14 += k3Var.f9528ej;
            i25 += k3Var.f9542ud;
            i26 += k3Var.f9523a8;
            i27 += k3Var.f9545x;
            i8++;
            length = i;
            i5 = 16;
        }
        return new k3(i10, jArr, Collections.emptyList(), Collections.emptyList(), jMin, i12, i13, i14, i15, j15, i16, i17, i18, i19, i20, jMax, i21, Collections.emptyList(), Collections.emptyList(), j, j4, j7, j8, j9, j10, i22, i23, i11, j16, i24, j17, j11, j12, j13, j14, i25, i26, i27, Collections.emptyList(), Collections.emptyList());
    }

    public int a() {
        long j = this.f9540ta;
        if (j == 0) {
            return -1;
        }
        return (int) ((this.f9527d * 8000) / j);
    }

    public int c5() {
        int i = this.n;
        if (i == 0) {
            return -1;
        }
        return this.d0 / i;
    }

    public int f() {
        long j = this.f9526co;
        if (j == 0) {
            return -1;
        }
        return (int) (this.z / j);
    }

    public int fb() {
        int i = this.rz;
        if (i == 0) {
            return -1;
        }
        return (int) (this.mg / ((long) i));
    }

    public float gv() {
        int i = this.f9543v;
        if (i == 0) {
            return 0.0f;
        }
        return this.f9530fb / i;
    }

    public int i9() {
        long j = this.f9537r;
        if (j == 0) {
            return -1;
        }
        return (int) (this.f9546x4 / j);
    }

    public long mt() {
        return t(2) + t(6) + t(5);
    }

    public float n3() {
        long jW = w();
        if (jW == 0) {
            return 0.0f;
        }
        return (this.f9528ej * 1000.0f) / jW;
    }

    public long p() {
        return t(6);
    }

    public int s() {
        int i = this.c;
        if (i == 0) {
            return -1;
        }
        return (int) (this.fh / ((long) i));
    }

    public long t(int i) {
        return this.f9548yt[i];
    }

    public float tl() {
        long jW = w();
        if (jW == 0) {
            return 0.0f;
        }
        return (this.f9544wz * 1000.0f) / jW;
    }

    public int v() {
        long j = this.f9532i4;
        if (j == 0) {
            return -1;
        }
        return (int) (this.f3 / j);
    }

    public long w() {
        return t(3);
    }

    public float wz() {
        long jXc = xc();
        if (jXc == 0) {
            return 0.0f;
        }
        return p() / jXc;
    }

    public long xc() {
        return w() + mt();
    }

    public float y() {
        int i = this.f9522a;
        int i5 = this.y;
        int i8 = this.f9543v;
        int i10 = i - (i5 - i8);
        if (i8 == 0) {
            return 0.0f;
        }
        return i10 / i8;
    }

    public float zn() {
        long jW = w();
        if (jW == 0) {
            return 0.0f;
        }
        return (this.f9549z6 * 1000.0f) / jW;
    }
}

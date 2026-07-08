package n0;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.xq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k4.r;
import n0.c;
import ur.mg;
import ur.rs;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class y extends zn {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final long f6836c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6837co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6838f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final long f6839i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public float f6840mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v0.v f6841p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0.a f6843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6844t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final int f6845tl;
    public final k4.r<C0136y> w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final float f6846wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @Nullable
    public h6.wz f6847x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final float f6848xc;
    public int z;

    public static class n3 implements c.n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f6849a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final float f6850fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6851gv;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final v0.v f6852s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f6853v;
        public final int y;
        public final int zn;

        public n3() {
            this(10000, 25000, 25000, 0.7f);
        }

        public y n3(rs rsVar, int[] iArr, int i, r0.a aVar, k4.r<C0136y> rVar) {
            return new y(rsVar, iArr, i, aVar, this.y, this.n3, this.zn, this.f6851gv, this.f6853v, this.f6849a, this.f6850fb, rVar, this.f6852s);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // n0.c.n3
        public final c[] y(c.y[] yVarArr, r0.a aVar, mg.n3 n3Var, xq xqVar) {
            k4.r rVarFh = y.fh(yVarArr);
            c[] cVarArr = new c[yVarArr.length];
            for (int i = 0; i < yVarArr.length; i++) {
                c.y yVar = yVarArr[i];
                if (yVar != null) {
                    int[] iArr = yVar.n3;
                    if (iArr.length != 0) {
                        cVarArr[i] = iArr.length == 1 ? new d0(yVar.y, iArr[0], yVar.zn) : n3(yVar.y, iArr, yVar.zn, aVar, (k4.r) rVarFh.get(i));
                    }
                }
            }
            return cVarArr;
        }

        public n3(int i, int i5, int i8, float f3) {
            this(i, i5, i8, 1279, 719, f3, 0.75f, v0.v.y);
        }

        public n3(int i, int i5, int i8, int i10, int i11, float f3, float f4, v0.v vVar) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f6851gv = i10;
            this.f6853v = i11;
            this.f6849a = f3;
            this.f6850fb = f4;
            this.f6852s = vVar;
        }
    }

    /* JADX INFO: renamed from: n0.y$y, reason: collision with other inner class name */
    public static final class C0136y {
        public final long n3;
        public final long y;

        public C0136y(long j, long j4) {
            this.y = j;
            this.n3 = j4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0136y)) {
                return false;
            }
            C0136y c0136y = (C0136y) obj;
            return this.y == c0136y.y && this.n3 == c0136y.n3;
        }

        public int hashCode() {
            return (((int) this.y) * 31) + ((int) this.n3);
        }
    }

    public y(rs rsVar, int[] iArr, int i, r0.a aVar, long j, long j4, long j7, int i5, int i8, float f3, float f4, List<C0136y> list, v0.v vVar) {
        r0.a aVar2;
        long j8;
        super(rsVar, iArr, i);
        if (j7 < j) {
            v0.r.c5("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            aVar2 = aVar;
            j8 = j;
        } else {
            aVar2 = aVar;
            j8 = j7;
        }
        this.f6843s = aVar2;
        this.f6836c5 = j * 1000;
        this.f6839i9 = j4 * 1000;
        this.f6838f = j8 * 1000;
        this.f6844t = i5;
        this.f6845tl = i8;
        this.f6846wz = f3;
        this.f6848xc = f4;
        this.w = k4.r.rz(list);
        this.f6841p = vVar;
        this.f6840mt = 1.0f;
        this.z = 0;
        this.f6842r = -9223372036854775807L;
    }

    private static k4.r<Integer> ej(long[][] jArr) {
        k4.d dVarV = k4.z6.zn().y().v();
        for (int i = 0; i < jArr.length; i++) {
            long[] jArr2 = jArr[i];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i5 = 0;
                while (true) {
                    long[] jArr3 = jArr[i];
                    int length2 = jArr3.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i5 >= length2) {
                        break;
                    }
                    long j = jArr3[i5];
                    if (j != -1) {
                        dLog = Math.log(j);
                    }
                    dArr[i5] = dLog;
                    i5++;
                }
                int i8 = length - 1;
                double d4 = dArr[i8] - dArr[0];
                int i10 = 0;
                while (i10 < i8) {
                    double d5 = dArr[i10];
                    i10++;
                    dVarV.put(Double.valueOf(d4 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d5 + dArr[i10]) * 0.5d) - dArr[0]) / d4), Integer.valueOf(i));
                }
            }
        }
        return k4.r.rz(dVarV.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k4.r<k4.r<C0136y>> fh(c.y[] yVarArr) {
        ArrayList arrayList = new ArrayList();
        for (c.y yVar : yVarArr) {
            if (yVar == null || yVar.n3.length <= 1) {
                arrayList.add(null);
            } else {
                r.y yVarN = k4.r.n();
                yVarN.y(new C0136y(0L, 0L));
                arrayList.add(yVarN);
            }
        }
        long[][] jArrZ6 = z6(yVarArr);
        int[] iArr = new int[jArrZ6.length];
        long[] jArr = new long[jArrZ6.length];
        for (int i = 0; i < jArrZ6.length; i++) {
            long[] jArr2 = jArrZ6[i];
            jArr[i] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        n(arrayList, jArr);
        k4.r<Integer> rVarEj = ej(jArrZ6);
        for (int i5 = 0; i5 < rVarEj.size(); i5++) {
            int iIntValue = rVarEj.get(i5).intValue();
            int i8 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i8;
            jArr[iIntValue] = jArrZ6[iIntValue][i8];
            n(arrayList, jArr);
        }
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            if (arrayList.get(i10) != null) {
                jArr[i10] = jArr[i10] * 2;
            }
        }
        n(arrayList, jArr);
        r.y yVarN2 = k4.r.n();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            r.y yVar2 = (r.y) arrayList.get(i11);
            yVarN2.y(yVar2 == null ? k4.r.yt() : yVar2.f());
        }
        return yVarN2.f();
    }

    private static void n(List<r.y<C0136y>> list, long[] jArr) {
        long j = 0;
        for (long j4 : jArr) {
            j += j4;
        }
        for (int i = 0; i < list.size(); i++) {
            r.y<C0136y> yVar = list.get(i);
            if (yVar != null) {
                yVar.y(new C0136y(j, jArr[i]));
            }
        }
    }

    private static long[][] z6(c.y[] yVarArr) {
        long[][] jArr = new long[yVarArr.length][];
        for (int i = 0; i < yVarArr.length; i++) {
            c.y yVar = yVarArr[i];
            if (yVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[yVar.n3.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = yVar.n3;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = yVar.y.zn(iArr[i5]).f4786p;
                    long[] jArr2 = jArr[i];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    public final long a8(long j, long j4) {
        if (j == -9223372036854775807L) {
            return this.f6836c5;
        }
        if (j4 != -9223372036854775807L) {
            j -= j4;
        }
        return Math.min((long) (j * this.f6848xc), this.f6836c5);
    }

    public boolean c(g gVar, int i, long j) {
        return ((long) i) <= j;
    }

    @Override // n0.zn, n0.c
    public void c5(float f3) {
        this.f6840mt = f3;
    }

    @Override // n0.c
    public int co() {
        return this.z;
    }

    public final long d(h6.xc[] xcVarArr, List<? extends h6.wz> list) {
        int i = this.f6837co;
        if (i < xcVarArr.length && xcVarArr[i].next()) {
            h6.xc xcVar = xcVarArr[this.f6837co];
            return xcVar.n3() - xcVar.y();
        }
        for (h6.xc xcVar2 : xcVarArr) {
            if (xcVar2.next()) {
                return xcVar2.n3() - xcVar2.y();
            }
        }
        return mg(list);
    }

    public final int d0(long j, long j4) {
        long jRz = rz(j4);
        int i = 0;
        for (int i5 = 0; i5 < this.n3; i5++) {
            if (j == Long.MIN_VALUE || !gv(i5, j)) {
                g gVarV = v(i5);
                if (c(gVarV, gVarV.f4786p, jRz)) {
                    return i5;
                }
                i = i5;
            }
        }
        return i;
    }

    @Override // n0.zn, n0.c
    public void fb() {
        this.f6847x4 = null;
    }

    @Override // n0.c
    @Nullable
    public Object i9() {
        return null;
    }

    public final long mg(List<? extends h6.wz> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        h6.wz wzVar = (h6.wz) k4.c.gv(list);
        long j = wzVar.f5287fb;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j4 = wzVar.f5289s;
        if (j4 != -9223372036854775807L) {
            return j4 - j;
        }
        return -9223372036854775807L;
    }

    @Override // n0.c
    public int n3() {
        return this.f6837co;
    }

    public final long rz(long j) {
        long jUd = ud(j);
        if (this.w.isEmpty()) {
            return jUd;
        }
        int i = 1;
        while (i < this.w.size() - 1 && this.w.get(i).y < jUd) {
            i++;
        }
        C0136y c0136y = this.w.get(i - 1);
        C0136y c0136y2 = this.w.get(i);
        long j4 = c0136y.y;
        float f3 = (jUd - j4) / (c0136y2.y - j4);
        return c0136y.n3 + ((long) (f3 * (c0136y2.n3 - r2)));
    }

    public long ta() {
        return this.f6838f;
    }

    public final long ud(long j) {
        long jV = (long) (this.f6843s.v() * this.f6846wz);
        long jN3 = this.f6843s.n3();
        if (jN3 == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (jV / this.f6840mt);
        }
        float f3 = j;
        return (long) ((jV * Math.max((f3 / this.f6840mt) - jN3, 0.0f)) / f3);
    }

    public boolean x(long j, List<? extends h6.wz> list) {
        long j4 = this.f6842r;
        return j4 == -9223372036854775807L || j - j4 >= 1000 || !(list.isEmpty() || ((h6.wz) k4.c.gv(list)).equals(this.f6847x4));
    }

    @Override // n0.zn, n0.c
    public int xc(long j, List<? extends h6.wz> list) {
        int i;
        int i5;
        long jElapsedRealtime = this.f6841p.elapsedRealtime();
        if (!x(jElapsedRealtime, list)) {
            return list.size();
        }
        this.f6842r = jElapsedRealtime;
        this.f6847x4 = list.isEmpty() ? null : (h6.wz) k4.c.gv(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jO4 = ut.o4(list.get(size - 1).f5287fb - j, this.f6840mt);
        long jTa = ta();
        if (jO4 < jTa) {
            return size;
        }
        g gVarV = v(d0(jElapsedRealtime, mg(list)));
        for (int i8 = 0; i8 < size; i8++) {
            h6.wz wzVar = list.get(i8);
            g gVar = wzVar.f5288gv;
            if (ut.o4(wzVar.f5287fb - j, this.f6840mt) >= jTa && gVar.f4786p < gVarV.f4786p && (i = gVar.f4780ej) != -1 && i <= this.f6845tl && (i5 = gVar.f4779d) != -1 && i5 <= this.f6844t && i < gVarV.f4780ej) {
                return i8;
            }
        }
        return size;
    }

    @Override // n0.zn, n0.c
    public void y() {
        this.f6842r = -9223372036854775807L;
        this.f6847x4 = null;
    }

    @Override // n0.c
    public void z(long j, long j4, long j7, List<? extends h6.wz> list, h6.xc[] xcVarArr) {
        long jElapsedRealtime = this.f6841p.elapsedRealtime();
        long jD = d(xcVarArr, list);
        int i = this.z;
        if (i == 0) {
            this.z = 1;
            this.f6837co = d0(jElapsedRealtime, jD);
            return;
        }
        int i5 = this.f6837co;
        int iS = list.isEmpty() ? -1 : s(((h6.wz) k4.c.gv(list)).f5288gv);
        if (iS != -1) {
            i = ((h6.wz) k4.c.gv(list)).f5290v;
            i5 = iS;
        }
        int iD0 = d0(jElapsedRealtime, jD);
        if (!gv(i5, jElapsedRealtime)) {
            g gVarV = v(i5);
            g gVarV2 = v(iD0);
            long jA8 = a8(j7, jD);
            int i8 = gVarV2.f4786p;
            int i10 = gVarV.f4786p;
            if ((i8 > i10 && j4 < jA8) || (i8 < i10 && j4 >= this.f6839i9)) {
                iD0 = i5;
            }
        }
        if (iD0 != i5) {
            i = 3;
        }
        this.z = i;
        this.f6837co = iD0;
    }
}

package zo;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.gi;
import ft.im;
import ft.xq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ur.mg;
import zo.hk;
import zo.k3;
import zo.zn;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements zn, hk.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq.n3 f9478a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f9479c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9480f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public k3 f9481fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final y f9482gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f9483i9;
    public final Map<String, n3> n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public w0.mg f9484p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public String f9485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Exception f9486t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f9487tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9488v;

    @Nullable
    public ft.g w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f9489wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public ft.g f9490xc;
    public final hk y;
    public final Map<String, zn.y> zn;

    public static final class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k3.n3> f9491a;

        /* JADX INFO: renamed from: a8, reason: collision with root package name */
        public boolean f9492a8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9493b;
        public long c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final boolean f9494c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f9495co;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9496d;
        public long d0;

        /* JADX INFO: renamed from: ej, reason: collision with root package name */
        public int f9497ej;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9498f;
        public long f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final List<k3.y> f9499fb;
        public long fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<long[]> f9500gv;

        /* JADX INFO: renamed from: hw, reason: collision with root package name */
        @Nullable
        public ft.g f9501hw;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public long f9502i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f9503i9;
        public float j;

        /* JADX INFO: renamed from: j5, reason: collision with root package name */
        @Nullable
        public ft.g f9504j5;

        /* JADX INFO: renamed from: k5, reason: collision with root package name */
        public boolean f9505k5;
        public long mg;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public long f9506mt;
        public long n;
        public final long[] n3 = new long[16];
        public long o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f9507p;
        public long qn;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f9508r;
        public long rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final List<k3.y> f9509s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f9510t;

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        public long f9511ta;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public boolean f9512tl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public long f9513ud;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final List<k3.n3> f9514v;
        public long vl;
        public int w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f9515wz;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f9516x;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public long f9517x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f9518xc;
        public final boolean y;

        /* JADX INFO: renamed from: yt, reason: collision with root package name */
        public boolean f9519yt;
        public long z;

        /* JADX INFO: renamed from: z6, reason: collision with root package name */
        public int f9520z6;
        public final List<k3.zn> zn;

        public n3(boolean z, zn.y yVar) {
            this.y = z;
            this.zn = z ? new ArrayList<>() : Collections.emptyList();
            this.f9500gv = z ? new ArrayList<>() : Collections.emptyList();
            this.f9514v = z ? new ArrayList<>() : Collections.emptyList();
            this.f9491a = z ? new ArrayList<>() : Collections.emptyList();
            this.f9499fb = z ? new ArrayList<>() : Collections.emptyList();
            this.f9509s = z ? new ArrayList<>() : Collections.emptyList();
            boolean z5 = false;
            this.f9497ej = 0;
            this.f9513ud = yVar.y;
            this.f9503i9 = -9223372036854775807L;
            this.f9506mt = -9223372036854775807L;
            mg.n3 n3Var = yVar.f9574gv;
            if (n3Var != null && n3Var.n3()) {
                z5 = true;
            }
            this.f9494c5 = z5;
            this.f9508r = -1L;
            this.z = -1L;
            this.f9495co = -1;
            this.j = 1.0f;
        }

        public static boolean a(int i) {
            return i == 6 || i == 7 || i == 10;
        }

        public static boolean gv(int i) {
            return i == 4 || i == 7;
        }

        public static boolean v(int i) {
            return i == 3 || i == 4 || i == 9;
        }

        public static boolean zn(int i, int i5) {
            return ((i != 1 && i != 2 && i != 14) || i5 == 1 || i5 == 2 || i5 == 14 || i5 == 3 || i5 == 4 || i5 == 9 || i5 == 11) ? false : true;
        }

        public final void c5(zn.y yVar, @Nullable ft.g gVar) {
            int i;
            if (v0.ut.zn(this.f9504j5, gVar)) {
                return;
            }
            fb(yVar.y);
            if (gVar != null && this.f9508r == -1 && (i = gVar.f4786p) != -1) {
                this.f9508r = i;
            }
            this.f9504j5 = gVar;
            if (this.y) {
                this.f9491a.add(new k3.n3(yVar, gVar));
            }
        }

        public final void f(long j, long j4) {
            if (this.y) {
                if (this.f9497ej != 3) {
                    if (j4 == -9223372036854775807L) {
                        return;
                    }
                    if (!this.f9500gv.isEmpty()) {
                        List<long[]> list = this.f9500gv;
                        long j7 = list.get(list.size() - 1)[1];
                        if (j7 != j4) {
                            this.f9500gv.add(new long[]{j, j7});
                        }
                    }
                }
                if (j4 != -9223372036854775807L) {
                    this.f9500gv.add(new long[]{j, j4});
                } else {
                    if (this.f9500gv.isEmpty()) {
                        return;
                    }
                    this.f9500gv.add(n3(j));
                }
            }
        }

        public final void fb(long j) {
            ft.g gVar;
            int i;
            if (this.f9497ej == 3 && (gVar = this.f9504j5) != null && (i = gVar.f4786p) != -1) {
                long j4 = (long) ((j - this.o) * this.j);
                this.c += j4;
                this.d0 += j4 * ((long) i);
            }
            this.o = j;
        }

        public final void i9(long j) {
            if (a(this.f9497ej)) {
                long j4 = j - this.vl;
                long j7 = this.f9506mt;
                if (j7 == -9223372036854775807L || j4 > j7) {
                    this.f9506mt = j4;
                }
            }
        }

        public final void mt(int i, zn.y yVar) {
            v0.y.y(yVar.y >= this.f9513ud);
            long j = yVar.y;
            long j4 = j - this.f9513ud;
            long[] jArr = this.n3;
            int i5 = this.f9497ej;
            jArr[i5] = jArr[i5] + j4;
            if (this.f9503i9 == -9223372036854775807L) {
                this.f9503i9 = j;
            }
            this.f9512tl |= zn(i5, i);
            this.f9498f |= v(i);
            this.f9510t |= i == 11;
            if (!gv(this.f9497ej) && gv(i)) {
                this.f9515wz++;
            }
            if (i == 5) {
                this.w++;
            }
            if (!a(this.f9497ej) && a(i)) {
                this.f9507p++;
                this.vl = yVar.y;
            }
            if (a(this.f9497ej) && this.f9497ej != 7 && i == 7) {
                this.f9518xc++;
            }
            i9(yVar.y);
            this.f9497ej = i;
            this.f9513ud = yVar.y;
            if (this.y) {
                this.zn.add(new k3.zn(yVar, i));
            }
        }

        public final long[] n3(long j) {
            List<long[]> list = this.f9500gv;
            return new long[]{j, list.get(list.size() - 1)[1] + ((long) ((j - r0[0]) * this.j))};
        }

        public final int p(ft.im imVar) {
            int iN3 = imVar.n3();
            if (this.f9492a8 && this.f9516x) {
                return 5;
            }
            if (this.f9505k5) {
                return 13;
            }
            if (!this.f9516x) {
                return this.f9519yt ? 1 : 0;
            }
            if (this.f9493b) {
                return 14;
            }
            if (iN3 == 4) {
                return 11;
            }
            if (iN3 != 2) {
                if (iN3 == 3) {
                    if (imVar.k()) {
                        return imVar.k5() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (iN3 != 1 || this.f9497ej == 0) {
                    return this.f9497ej;
                }
                return 12;
            }
            int i = this.f9497ej;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (imVar.k()) {
                return imVar.k5() != 0 ? 10 : 6;
            }
            return 7;
        }

        public final void s(long j) {
            ft.g gVar;
            if (this.f9497ej == 3 && (gVar = this.f9501hw) != null) {
                long j4 = (long) ((j - this.qn) * this.j);
                int i = gVar.f4780ej;
                if (i != -1) {
                    this.f9517x4 += j4;
                    this.f9502i4 += ((long) i) * j4;
                }
                int i5 = gVar.f4786p;
                if (i5 != -1) {
                    this.f3 += j4;
                    this.n += j4 * ((long) i5);
                }
            }
            this.qn = j;
        }

        public final void t(zn.y yVar, @Nullable ft.g gVar) {
            int i;
            int i5;
            if (v0.ut.zn(this.f9501hw, gVar)) {
                return;
            }
            s(yVar.y);
            if (gVar != null) {
                if (this.f9495co == -1 && (i5 = gVar.f4780ej) != -1) {
                    this.f9495co = i5;
                }
                if (this.z == -1 && (i = gVar.f4786p) != -1) {
                    this.z = i;
                }
            }
            this.f9501hw = gVar;
            if (this.y) {
                this.f9514v.add(new k3.n3(yVar, gVar));
            }
        }

        public void tl(ft.im imVar, zn.y yVar, boolean z, long j, boolean z5, int i, boolean z7, boolean z8, @Nullable ft.bv bvVar, @Nullable Exception exc, long j4, long j7, @Nullable ft.g gVar, @Nullable ft.g gVar2, @Nullable w0.mg mgVar) {
            if (j != -9223372036854775807L) {
                f(yVar.y, j);
                this.f9492a8 = true;
            }
            if (imVar.n3() != 2) {
                this.f9492a8 = false;
            }
            int iN3 = imVar.n3();
            if (iN3 == 1 || iN3 == 4 || z5) {
                this.f9493b = false;
            }
            if (bvVar != null) {
                this.f9505k5 = true;
                this.f9496d++;
                if (this.y) {
                    this.f9499fb.add(new k3.y(yVar, bvVar));
                }
            } else if (imVar.a() == null) {
                this.f9505k5 = false;
            }
            if (this.f9516x && !this.f9493b) {
                gi giVarFh = imVar.fh();
                if (!giVarFh.gv(2)) {
                    t(yVar, null);
                }
                if (!giVarFh.gv(1)) {
                    c5(yVar, null);
                }
            }
            if (gVar != null) {
                t(yVar, gVar);
            }
            if (gVar2 != null) {
                c5(yVar, gVar2);
            }
            ft.g gVar3 = this.f9501hw;
            if (gVar3 != null && gVar3.f4780ej == -1 && mgVar != null) {
                t(yVar, gVar3.n3().s8(mgVar.y).o(mgVar.f8904v).z6());
            }
            if (z8) {
                this.f9519yt = true;
            }
            if (z7) {
                this.f9511ta++;
            }
            this.mg += (long) i;
            this.fh += j4;
            this.rz += j7;
            if (exc != null) {
                this.f9520z6++;
                if (this.y) {
                    this.f9509s.add(new k3.y(yVar, exc));
                }
            }
            int iP = p(imVar);
            float f3 = imVar.v().y;
            if (this.f9497ej != iP || this.j != f3) {
                f(yVar.y, z ? yVar.f9577v : -9223372036854775807L);
                s(yVar.y);
                fb(yVar.y);
            }
            this.j = f3;
            if (this.f9497ej != iP) {
                mt(iP, yVar);
            }
        }

        public void w() {
            this.f9493b = true;
            this.f9492a8 = false;
        }

        public void wz(zn.y yVar, boolean z, long j) {
            int i = 11;
            if (this.f9497ej != 11 && !z) {
                i = 15;
            }
            f(yVar.y, j);
            s(yVar.y);
            fb(yVar.y);
            mt(i, yVar);
        }

        public void xc() {
            this.f9516x = true;
        }

        public k3 y(boolean z) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.n3;
            List<long[]> list2 = this.f9500gv;
            if (z) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.n3, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.f9513ud);
                int i = this.f9497ej;
                jArrCopyOf[i] = jArrCopyOf[i] + jMax;
                i9(jElapsedRealtime);
                s(jElapsedRealtime);
                fb(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.f9500gv);
                if (this.y && this.f9497ej == 3) {
                    arrayList.add(n3(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i5 = (this.f9512tl || !this.f9498f) ? 1 : 0;
            long j = i5 != 0 ? -9223372036854775807L : jArr[2];
            int i8 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z ? this.f9514v : new ArrayList(this.f9514v);
            List arrayList3 = z ? this.f9491a : new ArrayList(this.f9491a);
            List arrayList4 = z ? this.zn : new ArrayList(this.zn);
            long j4 = this.f9503i9;
            boolean z5 = this.f9516x;
            int i10 = !this.f9498f ? 1 : 0;
            boolean z7 = this.f9510t;
            int i11 = i5 ^ 1;
            int i12 = this.f9515wz;
            int i13 = this.f9518xc;
            int i14 = this.w;
            int i15 = this.f9507p;
            long j7 = this.f9506mt;
            boolean z8 = this.f9494c5;
            long[] jArr3 = jArr;
            long j8 = this.f9517x4;
            long j9 = this.f9502i4;
            long j10 = this.f3;
            long j11 = this.n;
            long j12 = this.c;
            long j13 = this.d0;
            int i16 = this.f9495co;
            int i17 = i16 == -1 ? 0 : 1;
            long j14 = this.z;
            int i18 = j14 == -1 ? 0 : 1;
            long j15 = this.f9508r;
            int i19 = j15 == -1 ? 0 : 1;
            long j16 = this.fh;
            long j17 = this.rz;
            long j18 = this.mg;
            long j19 = this.f9511ta;
            int i20 = this.f9496d;
            return new k3(1, jArr3, arrayList4, list, j4, z5 ? 1 : 0, i10, z7 ? 1 : 0, i8, j, i11, i12, i13, i14, i15, j7, z8 ? 1 : 0, arrayList2, arrayList3, j8, j9, j10, j11, j12, j13, i17, i18, i16, j14, i19, j15, j16, j17, j18, j19, i20 > 0 ? 1 : 0, i20, this.f9520z6, this.f9499fb, this.f9509s);
        }
    }

    public interface y {
        void y(zn.y yVar, k3 k3Var);
    }

    public ic(boolean z, @Nullable y yVar) {
        this.f9482gv = yVar;
        this.f9488v = z;
        kp kpVar = new kp();
        this.y = kpVar;
        this.n3 = new HashMap();
        this.zn = new HashMap();
        this.f9481fb = k3.vl;
        this.f9478a = new xq.n3();
        this.f9484p = w0.mg.f8899f;
        kpVar.fb(this);
    }

    private void cr(zn.n3 n3Var) {
        for (int i = 0; i < n3Var.gv(); i++) {
            int iN3 = n3Var.n3(i);
            zn.y yVarZn = n3Var.zn(iN3);
            if (iN3 == 0) {
                this.y.v(yVarZn);
            } else if (iN3 == 11) {
                this.y.zn(yVarZn, this.f9483i9);
            } else {
                this.y.gv(yVarZn);
            }
        }
    }

    @Override // zo.zn
    public /* synthetic */ void a(zn.y yVar, String str, long j) {
        zo.n3.n3(this, yVar, str, j);
    }

    @Override // zo.zn
    public /* synthetic */ void a8(zn.y yVar, ft.g gVar, di.c5 c5Var) {
        zo.n3.s(this, yVar, gVar, c5Var);
    }

    @Override // zo.zn
    public /* synthetic */ void ap(zn.y yVar, boolean z, int i) {
        zo.n3.hw(this, yVar, z, i);
    }

    @Override // zo.zn
    public /* synthetic */ void b(zn.y yVar, b0.a aVar) {
        zo.n3.wz(this, yVar, aVar);
    }

    @Override // zo.zn
    public /* synthetic */ void bk(zn.y yVar, int i, String str, long j) {
        zo.n3.mt(this, yVar, i, str, j);
    }

    @Override // zo.hk.y
    public void c(zn.y yVar, String str, String str2) {
        ((n3) v0.y.v(this.n3.get(str))).w();
    }

    @Override // zo.zn
    public /* synthetic */ void c5(zn.y yVar, im.n3 n3Var) {
        zo.n3.t(this, yVar, n3Var);
    }

    @Override // zo.zn
    public /* synthetic */ void co(zn.y yVar, ft.g gVar) {
        zo.n3.kp(this, yVar, gVar);
    }

    @Override // zo.zn
    public /* synthetic */ void ct(zn.y yVar, ft.uo uoVar) {
        zo.n3.j5(this, yVar, uoVar);
    }

    @Override // zo.zn
    public /* synthetic */ void d(zn.y yVar) {
        zo.n3.ut(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void d0(zn.y yVar, int i, di.v vVar) {
        zo.n3.p(this, yVar, i, vVar);
    }

    @Override // zo.hk.y
    public void dm(zn.y yVar, String str, boolean z) {
        n3 n3Var = (n3) v0.y.v(this.n3.remove(str));
        zn.y yVar2 = (zn.y) v0.y.v(this.zn.remove(str));
        n3Var.wz(yVar, z, str.equals(this.f9485s) ? this.f9479c5 : -9223372036854775807L);
        k3 k3VarY = n3Var.y(true);
        this.f9481fb = k3.co(this.f9481fb, k3VarY);
        y yVar3 = this.f9482gv;
        if (yVar3 != null) {
            yVar3.y(yVar2, k3VarY);
        }
    }

    @Override // zo.zn
    public /* synthetic */ void e(zn.y yVar, boolean z) {
        zo.n3.xg(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void eb(zn.y yVar, int i, long j, long j4) {
        zo.n3.f(this, yVar, i, j, j4);
    }

    @Override // zo.zn
    public void ej(zn.y yVar, Exception exc) {
        this.f9486t = exc;
    }

    @Override // zo.zn
    public /* synthetic */ void en(zn.y yVar, ur.i4 i4Var, ur.c cVar) {
        zo.n3.x(this, yVar, i4Var, cVar);
    }

    @Override // zo.zn
    public /* synthetic */ void f(zn.y yVar, di.v vVar) {
        zo.n3.a(this, yVar, vVar);
    }

    @Override // zo.zn
    public /* synthetic */ void f3(zn.y yVar, String str, long j) {
        zo.n3.ra(this, yVar, str, j);
    }

    @Override // zo.zn
    public /* synthetic */ void f7(zn.y yVar) {
        zo.n3.f3(this, yVar);
    }

    @Override // zo.zn
    public void fb(zn.y yVar, ur.c cVar) {
        int i = cVar.n3;
        if (i == 2 || i == 0) {
            this.f9490xc = cVar.zn;
        } else if (i == 1) {
            this.w = cVar.zn;
        }
    }

    @Override // zo.zn
    public void fh(zn.y yVar, int i, long j, long j4) {
        this.f9487tl = i;
        this.f9489wz = j;
    }

    @Override // zo.zn
    public /* synthetic */ void g(zn.y yVar, ft.g gVar) {
        zo.n3.fb(this, yVar, gVar);
    }

    @Override // zo.zn
    public /* synthetic */ void g3(zn.y yVar, String str) {
        zo.n3.s8(this, yVar, str);
    }

    @Override // zo.zn
    public /* synthetic */ void gv(zn.y yVar, ft.qj qjVar) {
        zo.n3.yt(this, yVar, qjVar);
    }

    @Override // zo.zn
    public /* synthetic */ void hw(zn.y yVar, Metadata metadata) {
        zo.n3.vl(this, yVar, metadata);
    }

    @Override // zo.hk.y
    public void i4(zn.y yVar, String str) {
        ((n3) v0.y.v(this.n3.get(str))).xc();
    }

    @Override // zo.zn
    public /* synthetic */ void i9(zn.y yVar, int i) {
        zo.n3.o4(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void j(zn.y yVar, ur.c cVar) {
        zo.n3.lc(this, yVar, cVar);
    }

    @Override // zo.zn
    public /* synthetic */ void j5(zn.y yVar, di.v vVar) {
        zo.n3.yg(this, yVar, vVar);
    }

    @Override // zo.zn
    public /* synthetic */ void jz(zn.y yVar, gi giVar) {
        zo.n3.eb(this, yVar, giVar);
    }

    @Override // zo.zn
    public /* synthetic */ void k(zn.y yVar, ft.bv bvVar) {
        zo.n3.j(this, yVar, bvVar);
    }

    @Override // zo.zn
    public /* synthetic */ void k5(zn.y yVar, di.v vVar) {
        zo.n3.ap(this, yVar, vVar);
    }

    @Override // zo.zn
    public /* synthetic */ void kp(zn.y yVar, boolean z) {
        zo.n3.b(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void lc(zn.y yVar, Exception exc) {
        zo.n3.nf(this, yVar, exc);
    }

    @Override // zo.zn
    public /* synthetic */ void m(zn.y yVar, di.v vVar) {
        zo.n3.v(this, yVar, vVar);
    }

    @Override // zo.zn
    public void mg(zn.y yVar, w0.mg mgVar) {
        this.f9484p = mgVar;
    }

    @Override // zo.zn
    public void mt(zn.y yVar, im.v vVar, im.v vVar2, int i) {
        if (this.f9485s == null) {
            this.f9485s = this.y.n3();
            this.f9479c5 = vVar.w;
        }
        this.f9483i9 = i;
    }

    @Override // zo.zn
    public /* synthetic */ void n(zn.y yVar, String str, long j, long j4) {
        zo.n3.e(this, yVar, str, j, j4);
    }

    @Override // zo.zn
    public /* synthetic */ void n3(zn.y yVar, int i) {
        zo.n3.jz(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void nf(zn.y yVar, boolean z) {
        zo.n3.d(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void o(zn.y yVar, long j) {
        zo.n3.c5(this, yVar, j);
    }

    @Override // zo.zn
    public void o4(zn.y yVar, int i, long j) {
        this.f9480f = i;
    }

    @Override // zo.zn
    public /* synthetic */ void oz(zn.y yVar, int i, di.v vVar) {
        zo.n3.w(this, yVar, i, vVar);
    }

    @Override // zo.zn
    public /* synthetic */ void p(zn.y yVar, ft.xc xcVar) {
        zo.n3.z(this, yVar, xcVar);
    }

    public final boolean pq(zn.n3 n3Var, String str, int i) {
        return n3Var.y(i) && this.y.y(n3Var.zn(i), str);
    }

    public final Pair<zn.y, Boolean> pz(zn.n3 n3Var, String str) {
        mg.n3 n3Var2;
        zn.y yVar = null;
        boolean zY = false;
        for (int i = 0; i < n3Var.gv(); i++) {
            zn.y yVarZn = n3Var.zn(n3Var.n3(i));
            boolean zY2 = this.y.y(yVarZn, str);
            if (yVar == null || ((zY2 && !zY) || (zY2 == zY && yVarZn.y > yVar.y))) {
                yVar = yVarZn;
                zY = zY2;
            }
        }
        v0.y.v(yVar);
        if (!zY && (n3Var2 = yVar.f9574gv) != null && n3Var2.n3()) {
            long jC5 = yVar.n3.t(yVar.f9574gv.y, this.f9478a).c5(yVar.f9574gv.n3);
            if (jC5 == Long.MIN_VALUE) {
                jC5 = this.f9478a.f5173s;
            }
            long jP = jC5 + this.f9478a.p();
            long j = yVar.y;
            xq xqVar = yVar.n3;
            int i5 = yVar.zn;
            mg.n3 n3Var3 = yVar.f9574gv;
            zn.y yVar2 = new zn.y(j, xqVar, i5, new mg.n3(n3Var3.y, n3Var3.f8549gv, n3Var3.n3), v0.ut.gf(jP), yVar.n3, yVar.f9573fb, yVar.f9576s, yVar.f9572c5, yVar.f9575i9);
            zY = this.y.y(yVar2, str);
            yVar = yVar2;
        }
        return Pair.create(yVar, Boolean.valueOf(zY));
    }

    @Override // zo.zn
    public void q9(ft.im imVar, zn.n3 n3Var) {
        if (n3Var.gv() == 0) {
            return;
        }
        cr(n3Var);
        for (String str : this.n3.keySet()) {
            Pair<zn.y, Boolean> pairPz = pz(n3Var, str);
            n3 n3Var2 = this.n3.get(str);
            boolean zPq = pq(n3Var, str, 11);
            boolean zPq2 = pq(n3Var, str, 1018);
            boolean zPq3 = pq(n3Var, str, 1011);
            boolean zPq4 = pq(n3Var, str, 1000);
            boolean zPq5 = pq(n3Var, str, 10);
            boolean z = pq(n3Var, str, 1003) || pq(n3Var, str, UserMetadata.MAX_ATTRIBUTE_SIZE);
            boolean zPq6 = pq(n3Var, str, 1006);
            boolean zPq7 = pq(n3Var, str, 1004);
            n3Var2.tl(imVar, (zn.y) pairPz.first, ((Boolean) pairPz.second).booleanValue(), str.equals(this.f9485s) ? this.f9479c5 : -9223372036854775807L, zPq, zPq2 ? this.f9480f : 0, zPq3, zPq4, zPq5 ? imVar.a() : null, z ? this.f9486t : null, zPq6 ? this.f9487tl : 0L, zPq6 ? this.f9489wz : 0L, zPq7 ? this.f9490xc : null, zPq7 ? this.w : null, pq(n3Var, str, 25) ? this.f9484p : null);
        }
        this.f9490xc = null;
        this.w = null;
        this.f9485s = null;
        if (n3Var.y(1028)) {
            this.y.s(n3Var.zn(1028));
        }
    }

    @Override // zo.zn
    public /* synthetic */ void qn(zn.y yVar, ft.xb xbVar, int i) {
        zo.n3.k5(this, yVar, xbVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void r(zn.y yVar, ur.i4 i4Var, ur.c cVar) {
        zo.n3.ej(this, yVar, i4Var, cVar);
    }

    @Override // zo.zn
    public /* synthetic */ void ra(zn.y yVar, int i, int i5) {
        zo.n3.ct(this, yVar, i, i5);
    }

    @Override // zo.zn
    public /* synthetic */ void rb(zn.y yVar) {
        zo.n3.i4(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void rs(zn.y yVar, String str) {
        zo.n3.gv(this, yVar, str);
    }

    @Override // zo.zn
    public /* synthetic */ void rz(zn.y yVar, int i) {
        zo.n3.k(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void s(zn.y yVar) {
        zo.n3.u(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void s8(zn.y yVar, Exception exc) {
        zo.n3.i9(this, yVar, exc);
    }

    @Override // zo.hk.y
    public void t(zn.y yVar, String str) {
        this.n3.put(str, new n3(this.f9488v, yVar));
        this.zn.put(str, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void ta(zn.y yVar, n0.z6 z6Var) {
        zo.n3.rs(this, yVar, z6Var);
    }

    @Override // zo.zn
    public /* synthetic */ void tg(zn.y yVar, int i, boolean z) {
        zo.n3.r(this, yVar, i, z);
    }

    @Override // zo.zn
    public /* synthetic */ void tl(zn.y yVar, ur.i4 i4Var, ur.c cVar) {
        zo.n3.ud(this, yVar, i4Var, cVar);
    }

    @Override // zo.zn
    public /* synthetic */ void u(zn.y yVar) {
        zo.n3.y5(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void u0(zn.y yVar, String str, long j, long j4) {
        zo.n3.zn(this, yVar, str, j, j4);
    }

    @Override // zo.zn
    public void ud(zn.y yVar, ur.i4 i4Var, ur.c cVar, IOException iOException, boolean z) {
        this.f9486t = iOException;
    }

    @Override // zo.zn
    public /* synthetic */ void ut(zn.y yVar, ft.g gVar, di.c5 c5Var) {
        zo.n3.rb(this, yVar, gVar, c5Var);
    }

    @Override // zo.zn
    public /* synthetic */ void v(zn.y yVar, boolean z, int i) {
        zo.n3.q9(this, yVar, z, i);
    }

    @Override // zo.zn
    public /* synthetic */ void vl(zn.y yVar, Object obj, long j) {
        zo.n3.en(this, yVar, obj, j);
    }

    @Override // zo.zn
    public /* synthetic */ void w(zn.y yVar, ft.bv bvVar) {
        zo.n3.oz(this, yVar, bvVar);
    }

    @Override // zo.zn
    public /* synthetic */ void wz(zn.y yVar, int i, int i5, int i8, float f3) {
        zo.n3.g3(this, yVar, i, i5, i8, f3);
    }

    @Override // zo.zn
    public /* synthetic */ void x(zn.y yVar) {
        zo.n3.n(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void x4(zn.y yVar, boolean z) {
        zo.n3.dm(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void xc(zn.y yVar, long j, int i) {
        zo.n3.yc(this, yVar, j, i);
    }

    @Override // zo.zn
    public /* synthetic */ void xg(zn.y yVar, boolean z) {
        zo.n3.z6(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void y(zn.y yVar) {
        zo.n3.rz(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void y4(zn.y yVar, int i) {
        zo.n3.o(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void y5(zn.y yVar) {
        zo.n3.c(this, yVar);
    }

    @Override // zo.zn
    public /* synthetic */ void yc(zn.y yVar, Exception exc) {
        zo.n3.y(this, yVar, exc);
    }

    @Override // zo.zn
    public /* synthetic */ void yg(zn.y yVar, int i) {
        zo.n3.qn(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void yt(zn.y yVar, int i) {
        zo.n3.d0(this, yVar, i);
    }

    @Override // zo.zn
    public /* synthetic */ void z(zn.y yVar, List list) {
        zo.n3.xc(this, yVar, list);
    }

    @Override // zo.zn
    public /* synthetic */ void z6(zn.y yVar, int i, ft.g gVar) {
        zo.n3.co(this, yVar, i, gVar);
    }

    @Override // zo.zn
    public /* synthetic */ void zn(zn.y yVar, float f3) {
        zo.n3.g(this, yVar, f3);
    }
}

package ur;

import androidx.annotation.Nullable;
import b1.ta;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.drm.v;
import ft.g;
import ft.u0;
import java.io.IOException;
import ur.f7;

/* JADX INFO: loaded from: classes.dex */
public class f7 implements b1.ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public gv f8523a;
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f8525co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8526d;

    @Nullable
    public g d0;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public g f8528fb;

    @Nullable
    public g fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.drm.a f8529gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f8530i4;
    public boolean mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f8532mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8533p;
    public int rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.gv f8535s;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public boolean f8537ta;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final v.y f8539v;
    public int w;
    public final q9 y;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public boolean f8543z6;
    public final n3 n3 = new n3();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f8524c5 = 1000;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int[] f8531i9 = new int[1000];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long[] f8527f = new long[1000];

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long[] f8540wz = new long[1000];

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int[] f8538tl = new int[1000];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f8536t = new int[1000];

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public ta.y[] f8542xc = new ta.y[1000];
    public final ct<zn> zn = new ct<>(new v0.c5() { // from class: ur.k
        @Override // v0.c5
        public final void accept(Object obj) {
            f7.b((f7.zn) obj);
        }
    });
    public long z = Long.MIN_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8534r = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public long f8541x4 = Long.MIN_VALUE;
    public boolean n = true;
    public boolean f3 = true;

    public interface gv {
        void w(g gVar);
    }

    public static final class n3 {
        public long n3;
        public int y;

        @Nullable
        public ta.y zn;
    }

    public static final class zn {
        public final a.n3 n3;
        public final g y;

        public zn(g gVar, a.n3 n3Var) {
            this.y = gVar;
            this.n3 = n3Var;
        }
    }

    public f7(r0.n3 n3Var, @Nullable com.google.android.exoplayer2.drm.a aVar, @Nullable v.y yVar) {
        this.f8529gv = aVar;
        this.f8539v = yVar;
        this.y = new q9(n3Var);
    }

    public static /* synthetic */ void b(zn znVar) {
        znVar.n3.release();
    }

    public static f7 f(r0.n3 n3Var, com.google.android.exoplayer2.drm.a aVar, v.y yVar) {
        return new f7(n3Var, (com.google.android.exoplayer2.drm.a) v0.y.v(aVar), (v.y) v0.y.v(yVar));
    }

    public static f7 t(r0.n3 n3Var) {
        return new f7(n3Var, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // b1.ta
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r12, int r14, int r15, int r16, @androidx.annotation.Nullable b1.ta.y r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.c
            if (r0 == 0) goto L10
            ft.g r0 = r8.d0
            java.lang.Object r0 = v0.y.c5(r0)
            ft.g r0 = (ft.g) r0
            r11.y(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            boolean r4 = r8.f3
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f3 = r1
        L22:
            long r4 = r8.f8526d
            long r4 = r4 + r12
            boolean r6 = r8.mg
            if (r6 == 0) goto L54
            long r6 = r8.z
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.f8537ta
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            ft.g r6 = r8.fh
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            v0.r.c5(r6, r0)
            r8.f8537ta = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.f8543z6
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.s(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.f8543z6 = r1
            goto L66
        L65:
            return
        L66:
            ur.q9 r0 = r8.y
            long r0 = r0.v()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.c5(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.f7.a(long, int, int, int, b1.ta$y):void");
    }

    public final synchronized boolean a8() {
        return this.f8530i4;
    }

    public final synchronized long c() {
        return this.f8541x4;
    }

    public final synchronized void c5(long j, int i, long j4, int i5, @Nullable ta.y yVar) {
        try {
            int i8 = this.w;
            if (i8 > 0) {
                int iMg = mg(i8 - 1);
                v0.y.y(this.f8527f[iMg] + ((long) this.f8536t[iMg]) <= j4);
            }
            this.f8530i4 = (536870912 & i) != 0;
            this.f8541x4 = Math.max(this.f8541x4, j);
            int iMg2 = mg(this.w);
            this.f8540wz[iMg2] = j;
            this.f8527f[iMg2] = j4;
            this.f8536t[iMg2] = i5;
            this.f8538tl[iMg2] = i;
            this.f8542xc[iMg2] = yVar;
            this.f8531i9[iMg2] = this.rz;
            if (this.zn.fb() || !this.zn.a().y.equals(this.fh)) {
                com.google.android.exoplayer2.drm.a aVar = this.f8529gv;
                this.zn.y(z6(), new zn((g) v0.y.v(this.fh), aVar != null ? aVar.y(this.f8539v, this.fh) : a.n3.y));
            }
            int i10 = this.w + 1;
            this.w = i10;
            int i11 = this.f8524c5;
            if (i10 == i11) {
                int i12 = i11 + 1000;
                int[] iArr = new int[i12];
                long[] jArr = new long[i12];
                long[] jArr2 = new long[i12];
                int[] iArr2 = new int[i12];
                int[] iArr3 = new int[i12];
                ta.y[] yVarArr = new ta.y[i12];
                int i13 = this.f8532mt;
                int i14 = i11 - i13;
                System.arraycopy(this.f8527f, i13, jArr, 0, i14);
                System.arraycopy(this.f8540wz, this.f8532mt, jArr2, 0, i14);
                System.arraycopy(this.f8538tl, this.f8532mt, iArr2, 0, i14);
                System.arraycopy(this.f8536t, this.f8532mt, iArr3, 0, i14);
                System.arraycopy(this.f8542xc, this.f8532mt, yVarArr, 0, i14);
                System.arraycopy(this.f8531i9, this.f8532mt, iArr, 0, i14);
                int i15 = this.f8532mt;
                System.arraycopy(this.f8527f, 0, jArr, i14, i15);
                System.arraycopy(this.f8540wz, 0, jArr2, i14, i15);
                System.arraycopy(this.f8538tl, 0, iArr2, i14, i15);
                System.arraycopy(this.f8536t, 0, iArr3, i14, i15);
                System.arraycopy(this.f8542xc, 0, yVarArr, i14, i15);
                System.arraycopy(this.f8531i9, 0, iArr, i14, i15);
                this.f8527f = jArr;
                this.f8540wz = jArr2;
                this.f8538tl = iArr2;
                this.f8536t = iArr3;
                this.f8542xc = yVarArr;
                this.f8531i9 = iArr;
                this.f8532mt = 0;
                this.f8524c5 = i12;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void co() {
        this.y.n3(xc());
    }

    public final void ct(int i) {
        this.rz = i;
    }

    @Nullable
    public final synchronized g d() {
        return this.n ? null : this.fh;
    }

    public final synchronized long d0() {
        return Math.max(this.f8534r, fh(this.f8525co));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void dm(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f8525co     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.w     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            v0.y.y(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f8525co     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f8525co = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ur.f7.dm(int):void");
    }

    public final boolean ej() {
        return this.f8525co != this.w;
    }

    public final synchronized boolean en(long j, boolean z) {
        k();
        int iMg = mg(this.f8525co);
        if (ej() && j >= this.f8540wz[iMg] && (j <= this.f8541x4 || z)) {
            int iX4 = x4(iMg, this.w - this.f8525co, j, true);
            if (iX4 == -1) {
                return false;
            }
            this.z = j;
            this.f8525co += iX4;
            return true;
        }
        return false;
    }

    public final int f3() {
        return this.f8533p;
    }

    public final synchronized boolean f7(int i) {
        k();
        int i5 = this.f8533p;
        if (i >= i5 && i <= this.w + i5) {
            this.z = Long.MIN_VALUE;
            this.f8525co = i - i5;
            return true;
        }
        return false;
    }

    public final long fh(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iMg = mg(i - 1);
        for (int i5 = 0; i5 < i; i5++) {
            jMax = Math.max(jMax, this.f8540wz[iMg]);
            if ((this.f8538tl[iMg] & 1) != 0) {
                break;
            }
            iMg--;
            if (iMg == -1) {
                iMg = this.f8524c5 - 1;
            }
        }
        return jMax;
    }

    @Override // b1.ta
    public final int gv(r0.c5 c5Var, int i, boolean z, int i5) throws IOException {
        return this.y.w(c5Var, i, z);
    }

    public final synchronized int hw(u0 u0Var, di.fb fbVar, boolean z, boolean z5, n3 n3Var) {
        try {
            fbVar.f3181s = false;
            if (!ej()) {
                if (!z5 && !this.f8530i4) {
                    g gVar = this.fh;
                    if (gVar == null || (!z && gVar == this.f8528fb)) {
                        return -3;
                    }
                    vl((g) v0.y.v(gVar), u0Var);
                    return -5;
                }
                fbVar.w(4);
                return -4;
            }
            g gVar2 = this.zn.v(rz()).y;
            if (!z && gVar2 == this.f8528fb) {
                int iMg = mg(this.f8525co);
                if (!k5(iMg)) {
                    fbVar.f3181s = true;
                    return -3;
                }
                fbVar.w(this.f8538tl[iMg]);
                if (this.f8525co == this.w - 1 && (z5 || this.f8530i4)) {
                    fbVar.v(536870912);
                }
                long j = this.f8540wz[iMg];
                fbVar.f3178f = j;
                if (j < this.z) {
                    fbVar.v(Integer.MIN_VALUE);
                }
                n3Var.y = this.f8536t[iMg];
                n3Var.n3 = this.f8527f[iMg];
                n3Var.zn = this.f8542xc[iMg];
                return -4;
            }
            vl(gVar2, u0Var);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    public g i4(g gVar) {
        return (this.f8526d == 0 || gVar.fh == Long.MAX_VALUE) ? gVar : gVar.n3().nf(gVar.fh + this.f8526d).z6();
    }

    public final int i9(long j) {
        int i = this.w;
        int iMg = mg(i - 1);
        while (i > this.f8525co && this.f8540wz[iMg] >= j) {
            i--;
            iMg--;
            if (iMg == -1) {
                iMg = this.f8524c5 - 1;
            }
        }
        return i;
    }

    public void j() {
        q9(true);
        oz();
    }

    public final synchronized int j5() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return ej() ? this.f8531i9[mg(this.f8525co)] : this.rz;
    }

    public final void jz(long j) {
        if (this.f8526d != j) {
            this.f8526d = j;
            ud();
        }
    }

    public final synchronized void k() {
        this.f8525co = 0;
        this.y.xc();
    }

    public final boolean k5(int i) {
        com.google.android.exoplayer2.drm.gv gvVar = this.f8535s;
        return gvVar == null || gvVar.getState() == 4 || ((this.f8538tl[i] & 1073741824) == 0 && this.f8535s.gv());
    }

    public final int mg(int i) {
        int i5 = this.f8532mt + i;
        int i8 = this.f8524c5;
        return i5 < i8 ? i5 : i5 - i8;
    }

    public final void mt() {
        this.y.n3(wz());
    }

    public final synchronized long n() {
        return this.w == 0 ? Long.MIN_VALUE : this.f8540wz[this.f8532mt];
    }

    @Override // b1.ta
    public /* synthetic */ void n3(v0.d dVar, int i) {
        b1.mg.n3(this, dVar, i);
    }

    public int o(u0 u0Var, di.fb fbVar, int i, boolean z) {
        int iHw = hw(u0Var, fbVar, (i & 2) != 0, z, this.n3);
        if (iHw == -4 && !fbVar.t()) {
            boolean z5 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z5) {
                    this.y.a(fbVar, this.n3);
                } else {
                    this.y.tl(fbVar, this.n3);
                }
            }
            if (!z5) {
                this.f8525co++;
            }
        }
        return iHw;
    }

    public final void o4() {
        this.f8543z6 = true;
    }

    public final void oz() {
        com.google.android.exoplayer2.drm.gv gvVar = this.f8535s;
        if (gvVar != null) {
            gvVar.n3(this.f8539v);
            this.f8535s = null;
            this.f8528fb = null;
        }
    }

    public final void p(long j, boolean z, boolean z5) {
        this.y.n3(tl(j, z, z5));
    }

    public void q9(boolean z) {
        this.y.wz();
        this.w = 0;
        this.f8533p = 0;
        this.f8532mt = 0;
        this.f8525co = 0;
        this.f3 = true;
        this.z = Long.MIN_VALUE;
        this.f8534r = Long.MIN_VALUE;
        this.f8541x4 = Long.MIN_VALUE;
        this.f8530i4 = false;
        this.zn.n3();
        if (z) {
            this.d0 = null;
            this.fh = null;
            this.n = true;
        }
    }

    public void qn() {
        mt();
        oz();
    }

    public final void r(int i) {
        this.y.zn(z(i));
    }

    public final int rz() {
        return this.f8533p + this.f8525co;
    }

    public final synchronized boolean s(long j) {
        if (this.w == 0) {
            return j > this.f8534r;
        }
        if (d0() >= j) {
            return false;
        }
        z(this.f8533p + i9(j));
        return true;
    }

    public final synchronized int ta(long j, boolean z) {
        int iMg = mg(this.f8525co);
        if (ej() && j >= this.f8540wz[iMg]) {
            if (j > this.f8541x4 && z) {
                return this.w - this.f8525co;
            }
            int iX4 = x4(iMg, this.w - this.f8525co, j, true);
            if (iX4 == -1) {
                return 0;
            }
            return iX4;
        }
        return 0;
    }

    public final synchronized long tl(long j, boolean z, boolean z5) {
        int i;
        try {
            int i5 = this.w;
            if (i5 != 0) {
                long[] jArr = this.f8540wz;
                int i8 = this.f8532mt;
                if (j >= jArr[i8]) {
                    if (z5 && (i = this.f8525co) != i5) {
                        i5 = i + 1;
                    }
                    int iX4 = x4(i8, i5, j, z);
                    if (iX4 == -1) {
                        return -1L;
                    }
                    return w(iX4);
                }
            }
            return -1L;
        } finally {
        }
    }

    public final void u(long j) {
        this.z = j;
    }

    public final void ud() {
        this.c = true;
    }

    public final void ut() {
        q9(false);
    }

    @Override // b1.ta
    public /* synthetic */ int v(r0.c5 c5Var, int i, boolean z) {
        return b1.mg.y(this, c5Var, i, z);
    }

    public final void vl(g gVar, u0 u0Var) {
        g gVar2 = this.f8528fb;
        boolean z = gVar2 == null;
        DrmInitData drmInitData = z ? null : gVar2.d0;
        this.f8528fb = gVar;
        DrmInitData drmInitData2 = gVar.d0;
        com.google.android.exoplayer2.drm.a aVar = this.f8529gv;
        u0Var.n3 = aVar != null ? gVar.zn(aVar.zn(gVar)) : gVar;
        u0Var.y = this.f8535s;
        if (this.f8529gv == null) {
            return;
        }
        if (z || !v0.ut.zn(drmInitData, drmInitData2)) {
            com.google.android.exoplayer2.drm.gv gvVar = this.f8535s;
            com.google.android.exoplayer2.drm.gv gvVarGv = this.f8529gv.gv(this.f8539v, gVar);
            this.f8535s = gvVarGv;
            u0Var.y = gvVarGv;
            if (gvVar != null) {
                gvVar.n3(this.f8539v);
            }
        }
    }

    public final long w(int i) {
        this.f8534r = Math.max(this.f8534r, fh(i));
        this.w -= i;
        int i5 = this.f8533p + i;
        this.f8533p = i5;
        int i8 = this.f8532mt + i;
        this.f8532mt = i8;
        int i10 = this.f8524c5;
        if (i8 >= i10) {
            this.f8532mt = i8 - i10;
        }
        int i11 = this.f8525co - i;
        this.f8525co = i11;
        if (i11 < 0) {
            this.f8525co = 0;
        }
        this.zn.gv(i5);
        if (this.w != 0) {
            return this.f8527f[this.f8532mt];
        }
        int i12 = this.f8532mt;
        if (i12 == 0) {
            i12 = this.f8524c5;
        }
        int i13 = i12 - 1;
        return this.f8527f[i13] + ((long) this.f8536t[i13]);
    }

    public final synchronized long wz() {
        int i = this.w;
        if (i == 0) {
            return -1L;
        }
        return w(i);
    }

    public synchronized boolean x(boolean z) {
        g gVar;
        boolean z5 = true;
        if (ej()) {
            if (this.zn.v(rz()).y != this.f8528fb) {
                return true;
            }
            return k5(mg(this.f8525co));
        }
        if (!z && !this.f8530i4 && ((gVar = this.fh) == null || gVar == this.f8528fb)) {
            z5 = false;
        }
        return z5;
    }

    public final int x4(int i, int i5, long j, boolean z) {
        int i8 = -1;
        for (int i10 = 0; i10 < i5; i10++) {
            long j4 = this.f8540wz[i];
            if (j4 > j) {
                return i8;
            }
            if (!z || (this.f8538tl[i] & 1) != 0) {
                if (j4 == j) {
                    return i10;
                }
                i8 = i10;
            }
            i++;
            if (i == this.f8524c5) {
                i = 0;
            }
        }
        return i8;
    }

    public synchronized long xc() {
        int i = this.f8525co;
        if (i == 0) {
            return -1L;
        }
        return w(i);
    }

    public final void xg(@Nullable gv gvVar) {
        this.f8523a = gvVar;
    }

    @Override // b1.ta
    public final void y(g gVar) {
        g gVarI4 = i4(gVar);
        this.c = false;
        this.d0 = gVar;
        boolean zY5 = y5(gVarI4);
        gv gvVar = this.f8523a;
        if (gvVar == null || !zY5) {
            return;
        }
        gvVar.w(gVarI4);
    }

    public final synchronized boolean y5(g gVar) {
        try {
            this.n = false;
            if (v0.ut.zn(gVar, this.fh)) {
                return false;
            }
            if (this.zn.fb() || !this.zn.a().y.equals(gVar)) {
                this.fh = gVar;
            } else {
                this.fh = this.zn.a().y;
            }
            g gVar2 = this.fh;
            this.mg = v0.n.y(gVar2.f3, gVar2.f4778co);
            this.f8537ta = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void yt() throws IOException {
        com.google.android.exoplayer2.drm.gv gvVar = this.f8535s;
        if (gvVar != null && gvVar.getState() == 1) {
            throw ((gv.y) v0.y.v(this.f8535s.getError()));
        }
    }

    public final long z(int i) {
        int iZ6 = z6() - i;
        boolean z = false;
        v0.y.y(iZ6 >= 0 && iZ6 <= this.w - this.f8525co);
        int i5 = this.w - iZ6;
        this.w = i5;
        this.f8541x4 = Math.max(this.f8534r, fh(i5));
        if (iZ6 == 0 && this.f8530i4) {
            z = true;
        }
        this.f8530i4 = z;
        this.zn.zn(i);
        int i8 = this.w;
        if (i8 == 0) {
            return 0L;
        }
        int iMg = mg(i8 - 1);
        return this.f8527f[iMg] + ((long) this.f8536t[iMg]);
    }

    public final int z6() {
        return this.f8533p + this.w;
    }

    @Override // b1.ta
    public final void zn(v0.d dVar, int i, int i5) {
        this.y.p(dVar, i);
    }
}

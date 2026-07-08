package ur;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import ft.p1;
import ft.u0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import r0.mg;
import r0.ta;
import r0.tl;
import ur.b;
import ur.d0;

/* JADX INFO: loaded from: classes.dex */
public final class xg implements d0, ta.n3<zn> {
    public int c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b.y f8659f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final r0.o f8660fb;
    public byte[] n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f8661p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f8662r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0.mg f8663s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lc f8664t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final tl.y f8665v;
    public final r0.p y;
    public final g z;
    public final ArrayList<n3> w = new ArrayList<>();

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final r0.ta f8658co = new r0.ta("SingleSampleMediaPeriod");

    public final class n3 implements en {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8667v;
        public int y;

        public n3() {
        }

        @Override // ur.en
        public int a(u0 u0Var, di.fb fbVar, int i) {
            y();
            xg xgVar = xg.this;
            boolean z = xgVar.f3;
            if (z && xgVar.n == null) {
                this.y = 2;
            }
            int i5 = this.y;
            if (i5 == 2) {
                fbVar.v(4);
                return -4;
            }
            if ((i & 2) != 0 || i5 == 0) {
                u0Var.n3 = xgVar.z;
                this.y = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            v0.y.v(xgVar.n);
            fbVar.v(1);
            fbVar.f3178f = 0L;
            if ((i & 4) == 0) {
                fbVar.mt(xg.this.c);
                ByteBuffer byteBuffer = fbVar.f3179fb;
                xg xgVar2 = xg.this;
                byteBuffer.put(xgVar2.n, 0, xgVar2.c);
            }
            if ((i & 1) == 0) {
                this.y = 2;
            }
            return -4;
        }

        @Override // ur.en
        public boolean isReady() {
            return xg.this.f3;
        }

        @Override // ur.en
        public void n3() throws IOException {
            xg xgVar = xg.this;
            if (xgVar.f8662r) {
                return;
            }
            xgVar.f8658co.n3();
        }

        @Override // ur.en
        public int w(long j) {
            y();
            if (j <= 0 || this.y == 2) {
                return 0;
            }
            this.y = 2;
            return 1;
        }

        public final void y() {
            if (this.f8667v) {
                return;
            }
            xg.this.f8659f.c5(v0.n.f(xg.this.z.f3), xg.this.z, 0, null, 0L);
            this.f8667v = true;
        }

        public void zn() {
            if (this.y == 2) {
                this.y = 1;
            }
        }
    }

    public xg(r0.p pVar, tl.y yVar, @Nullable r0.o oVar, g gVar, long j, r0.mg mgVar, b.y yVar2, boolean z) {
        this.y = pVar;
        this.f8665v = yVar;
        this.f8660fb = oVar;
        this.z = gVar;
        this.f8661p = j;
        this.f8663s = mgVar;
        this.f8659f = yVar2;
        this.f8662r = z;
        this.f8664t = new lc(new rs(gVar));
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void j5(zn znVar, long j, long j4, boolean z) {
        r0.j5 j5Var = znVar.zn;
        i4 i4Var = new i4(znVar.y, znVar.n3, j5Var.c5(), j5Var.p(), j, j4, j5Var.a());
        this.f8663s.gv(znVar.y);
        this.f8659f.mt(i4Var, 1, -1, null, 0, null, 0L, this.f8661p);
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        yVar.xc(this);
    }

    @Override // ur.d0
    public long f(n0.c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < cVarArr.length; i++) {
            en enVar = enVarArr[i];
            if (enVar != null && (cVarArr[i] == null || !zArr[i])) {
                this.w.remove(enVar);
                enVarArr[i] = null;
            }
            if (enVarArr[i] == null && cVarArr[i] != null) {
                n3 n3Var = new n3();
                this.w.add(n3Var);
                enVarArr[i] = n3Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return this.f3 ? Long.MIN_VALUE : 0L;
    }

    @Override // ur.d0
    public long i9(long j) {
        for (int i = 0; i < this.w.size(); i++) {
            this.w.get(i).zn();
        }
        return j;
    }

    @Override // ur.d0
    public lc mt() {
        return this.f8664t;
    }

    public void p() {
        this.f8658co.t();
    }

    @Override // ur.d0
    public long t() {
        return -9223372036854775807L;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public void xc(zn znVar, long j, long j4) {
        this.c = (int) znVar.zn.a();
        this.n = (byte[]) v0.y.v(znVar.f8668gv);
        this.f3 = true;
        r0.j5 j5Var = znVar.zn;
        i4 i4Var = new i4(znVar.y, znVar.n3, j5Var.c5(), j5Var.p(), j, j4, this.c);
        this.f8663s.gv(znVar.y);
        this.f8659f.r(i4Var, 1, -1, this.z, 0, null, 0L, this.f8661p);
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        if (this.f3 || this.f8658co.i9() || this.f8658co.c5()) {
            return false;
        }
        r0.tl tlVarY = this.f8665v.y();
        r0.o oVar = this.f8660fb;
        if (oVar != null) {
            tlVarY.co(oVar);
        }
        zn znVar = new zn(this.y, tlVarY);
        this.f8659f.d0(new i4(znVar.y, this.y, this.f8658co.wz(znVar, this, this.f8663s.zn(1))), 1, -1, this.z, 0, null, 0L, this.f8661p);
        return true;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(zn znVar, long j, long j4, IOException iOException, int i) {
        ta.zn znVarS;
        r0.j5 j5Var = znVar.zn;
        i4 i4Var = new i4(znVar.y, znVar.n3, j5Var.c5(), j5Var.p(), j, j4, j5Var.a());
        long jY = this.f8663s.y(new mg.zn(i4Var, new c(1, -1, this.z, 0, null, 0L, v0.ut.gf(this.f8661p)), iOException, i));
        boolean z = jY == -9223372036854775807L || i >= this.f8663s.zn(1);
        if (this.f8662r && z) {
            v0.r.i9("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f3 = true;
            znVarS = r0.ta.f7548a;
        } else {
            znVarS = jY != -9223372036854775807L ? r0.ta.s(false, jY) : r0.ta.f7549fb;
        }
        ta.zn znVar2 = znVarS;
        boolean zZn = znVar2.zn();
        this.f8659f.i4(i4Var, 1, -1, this.z, 0, null, 0L, this.f8661p, iOException, !zZn);
        if (!zZn) {
            this.f8663s.gv(znVar.y);
        }
        return znVar2;
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        return this.f8658co.i9();
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return (this.f3 || this.f8658co.i9()) ? Long.MIN_VALUE : 0L;
    }

    public static final class zn implements ta.v {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public byte[] f8668gv;
        public final r0.p n3;
        public final long y = i4.y();
        public final r0.j5 zn;

        public zn(r0.p pVar, r0.tl tlVar) {
            this.n3 = pVar;
            this.zn = new r0.j5(tlVar);
        }

        @Override // r0.ta.v
        public void i9() throws IOException {
            this.zn.r();
            try {
                this.zn.y(this.n3);
                int i = 0;
                while (i != -1) {
                    int iA = (int) this.zn.a();
                    byte[] bArr = this.f8668gv;
                    if (bArr == null) {
                        this.f8668gv = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    } else if (iA == bArr.length) {
                        this.f8668gv = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    r0.j5 j5Var = this.zn;
                    byte[] bArr2 = this.f8668gv;
                    i = j5Var.read(bArr2, iA, bArr2.length - iA);
                }
                r0.w.y(this.zn);
            } catch (Throwable th) {
                r0.w.y(this.zn);
                throw th;
            }
        }

        @Override // r0.ta.v
        public void f() {
        }
    }

    @Override // ur.d0
    public void wz() {
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        return j;
    }
}

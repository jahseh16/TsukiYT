package t0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r0.a8;
import r0.c;
import r0.f;
import r0.o;
import r0.qn;
import r0.tl;
import r0.ud;
import t0.n3;
import t0.y;
import v0.ej;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements r0.tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8157a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public Uri f8158c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f8159co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public r0.p f8160f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f8161fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final r0.tl f8162gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public r0.p f8163i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public boolean f8164mt;
    public final r0.tl n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8165p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public r0.tl f8167t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f8168tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CacheKeyFactory f8169v;

    @Nullable
    public c5 w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f8170wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f8171xc;
    public final t0.y y;
    public long z;

    @Nullable
    public final r0.tl zn;

    public interface n3 {
    }

    /* JADX INFO: renamed from: t0.zn$zn, reason: collision with other inner class name */
    public static final class C0175zn implements tl.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public tl.y f8172a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f8173c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public ej f8174fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8176s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f8177v;
        public t0.y y;

        @Nullable
        public f.y zn;
        public tl.y n3 = new c.n3();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public CacheKeyFactory f8175gv = CacheKeyFactory.DEFAULT;

        public CacheKeyFactory a() {
            return this.f8175gv;
        }

        public C0175zn c5(int i) {
            this.f8173c5 = i;
            return this;
        }

        public C0175zn fb(t0.y yVar) {
            this.y = yVar;
            return this;
        }

        public final zn gv(@Nullable r0.tl tlVar, int i, int i5) {
            r0.f fVarY;
            t0.y yVar = (t0.y) v0.y.v(this.y);
            if (this.f8177v || tlVar == null) {
                fVarY = null;
            } else {
                f.y yVar2 = this.zn;
                fVarY = yVar2 != null ? yVar2.y() : new n3.C0173n3().n3(yVar).y();
            }
            return new zn(yVar, tlVar, this.n3.y(), fVarY, this.f8175gv, i, this.f8174fb, i5, null);
        }

        public C0175zn i9(@Nullable tl.y yVar) {
            this.f8172a = yVar;
            return this;
        }

        @Override // r0.tl.y
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public zn y() {
            tl.y yVar = this.f8172a;
            return gv(yVar != null ? yVar.y() : null, this.f8173c5, this.f8176s);
        }

        public C0175zn s(@Nullable f.y yVar) {
            this.zn = yVar;
            this.f8177v = yVar == null;
            return this;
        }

        @Nullable
        public t0.y v() {
            return this.y;
        }

        public zn zn() {
            tl.y yVar = this.f8172a;
            return gv(yVar != null ? yVar.y() : null, this.f8173c5 | 1, -1000);
        }
    }

    public static Uri r(t0.y yVar, String str, Uri uri) {
        Uri uriN3 = tl.n3(yVar.n3(str));
        return uriN3 != null ? uriN3 : uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() throws IOException {
        r0.tl tlVar = this.f8167t;
        if (tlVar == null) {
            return;
        }
        try {
            tlVar.close();
        } finally {
            this.f8160f = null;
            this.f8167t = null;
            c5 c5Var = this.w;
            if (c5Var != null) {
                this.y.fb(c5Var);
                this.w = null;
            }
        }
    }

    public final boolean c() {
        return this.f8167t == this.zn;
    }

    public t0.y c5() {
        return this.y;
    }

    @Override // r0.tl
    public void close() throws IOException {
        this.f8163i9 = null;
        this.f8158c5 = null;
        this.f8170wz = 0L;
        d0();
        try {
            a();
        } catch (Throwable th) {
            x4(th);
            throw th;
        }
    }

    @Override // r0.tl
    public void co(o oVar) {
        v0.y.v(oVar);
        this.n3.co(oVar);
        this.f8162gv.co(oVar);
    }

    public final boolean f3() {
        return this.f8167t == this.n3;
    }

    @Override // r0.tl
    public Map<String, List<String>> fb() {
        return n() ? this.f8162gv.fb() : Collections.emptyMap();
    }

    public final boolean i4() {
        return this.f8167t == this.f8162gv;
    }

    public final void mg(String str) throws IOException {
        this.f8171xc = 0L;
        if (c()) {
            xc xcVar = new xc();
            xc.fb(xcVar, this.f8170wz);
            this.y.s(str, xcVar);
        }
    }

    public final boolean n() {
        return !f3();
    }

    @Override // r0.tl
    @Nullable
    public Uri n3() {
        return this.f8158c5;
    }

    public CacheKeyFactory p() {
        return this.f8169v;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:9:0x001e, B:11:0x0026, B:14:0x002d, B:16:0x003d, B:18:0x0043, B:19:0x0049, B:21:0x005a, B:22:0x005e, B:24:0x0064, B:26:0x006a, B:28:0x0070, B:29:0x007c, B:35:0x0088), top: B:39:0x001e }] */
    @Override // r0.c5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r13, int r14, int r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 != 0) goto L4
            return r0
        L4:
            long r1 = r12.f8171xc
            r3 = -1
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Le
            return r3
        Le:
            r0.p r1 = r12.f8163i9
            java.lang.Object r1 = v0.y.v(r1)
            r0.p r1 = (r0.p) r1
            r0.p r2 = r12.f8160f
            java.lang.Object r2 = v0.y.v(r2)
            r0.p r2 = (r0.p) r2
            long r6 = r12.f8170wz     // Catch: java.lang.Throwable -> L2b
            long r8 = r12.z     // Catch: java.lang.Throwable -> L2b
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L2d
            r6 = 1
            r12.rz(r1, r6)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r13 = move-exception
            goto L93
        L2d:
            r0.tl r6 = r12.f8167t     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = v0.y.v(r6)     // Catch: java.lang.Throwable -> L2b
            r0.tl r6 = (r0.tl) r6     // Catch: java.lang.Throwable -> L2b
            int r6 = r6.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L2b
            r7 = -1
            if (r6 == r3) goto L5e
            boolean r13 = r12.f3()     // Catch: java.lang.Throwable -> L2b
            if (r13 == 0) goto L49
            long r13 = r12.f8159co     // Catch: java.lang.Throwable -> L2b
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f8159co = r13     // Catch: java.lang.Throwable -> L2b
        L49:
            long r13 = r12.f8170wz     // Catch: java.lang.Throwable -> L2b
            long r0 = (long) r6     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f8170wz = r13     // Catch: java.lang.Throwable -> L2b
            long r13 = r12.f8168tl     // Catch: java.lang.Throwable -> L2b
            long r13 = r13 + r0
            r12.f8168tl = r13     // Catch: java.lang.Throwable -> L2b
            long r13 = r12.f8171xc     // Catch: java.lang.Throwable -> L2b
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L87
            long r13 = r13 - r0
            r12.f8171xc = r13     // Catch: java.lang.Throwable -> L2b
            goto L87
        L5e:
            boolean r3 = r12.n()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L7c
            long r2 = r2.f7524s     // Catch: java.lang.Throwable -> L2b
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L70
            long r9 = r12.f8168tl     // Catch: java.lang.Throwable -> L2b
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L7c
        L70:
            java.lang.String r13 = r1.f7519c5     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r13 = v0.ut.i9(r13)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L2b
            r12.mg(r13)     // Catch: java.lang.Throwable -> L2b
            goto L87
        L7c:
            long r2 = r12.f8171xc     // Catch: java.lang.Throwable -> L2b
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L88
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L87
            goto L88
        L87:
            return r6
        L88:
            r12.a()     // Catch: java.lang.Throwable -> L2b
            r12.rz(r1, r0)     // Catch: java.lang.Throwable -> L2b
            int r13 = r12.read(r13, r14, r15)     // Catch: java.lang.Throwable -> L2b
            return r13
        L93:
            r12.x4(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.zn.read(byte[], int, int):int");
    }

    public final void rz(r0.p pVar, boolean z) throws IOException {
        c5 c5VarC5;
        long jMin;
        r0.p pVarY;
        r0.tl tlVar;
        String str = (String) ut.i9(pVar.f7519c5);
        if (this.f8164mt) {
            c5VarC5 = null;
        } else if (this.f8157a) {
            try {
                c5VarC5 = this.y.c5(str, this.f8170wz, this.f8171xc);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            c5VarC5 = this.y.gv(str, this.f8170wz, this.f8171xc);
        }
        if (c5VarC5 == null) {
            tlVar = this.f8162gv;
            pVarY = pVar.y().s(this.f8170wz).fb(this.f8171xc).y();
        } else if (c5VarC5.f8118s) {
            Uri uriFromFile = Uri.fromFile((File) ut.i9(c5VarC5.f8116f));
            long j = c5VarC5.f8120v;
            long j4 = this.f8170wz - j;
            long jMin2 = c5VarC5.f8117fb - j4;
            long j7 = this.f8171xc;
            if (j7 != -1) {
                jMin2 = Math.min(jMin2, j7);
            }
            pVarY = pVar.y().c5(uriFromFile).f(j).s(j4).fb(jMin2).y();
            tlVar = this.n3;
        } else {
            if (c5VarC5.zn()) {
                jMin = this.f8171xc;
            } else {
                jMin = c5VarC5.f8117fb;
                long j8 = this.f8171xc;
                if (j8 != -1) {
                    jMin = Math.min(jMin, j8);
                }
            }
            pVarY = pVar.y().s(this.f8170wz).fb(jMin).y();
            tlVar = this.zn;
            if (tlVar == null) {
                tlVar = this.f8162gv;
                this.y.fb(c5VarC5);
                c5VarC5 = null;
            }
        }
        this.z = (this.f8164mt || tlVar != this.f8162gv) ? Long.MAX_VALUE : this.f8170wz + 102400;
        if (z) {
            v0.y.fb(i4());
            if (tlVar == this.f8162gv) {
                return;
            }
            try {
                a();
            } finally {
            }
        }
        if (c5VarC5 != null && c5VarC5.n3()) {
            this.w = c5VarC5;
        }
        this.f8167t = tlVar;
        this.f8160f = pVarY;
        this.f8168tl = 0L;
        long jY = tlVar.y(pVarY);
        xc xcVar = new xc();
        if (pVarY.f7524s == -1 && jY != -1) {
            this.f8171xc = jY;
            xc.fb(xcVar, this.f8170wz + jY);
        }
        if (n()) {
            Uri uriN3 = tlVar.n3();
            this.f8158c5 = uriN3;
            xc.s(xcVar, pVar.y.equals(uriN3) ? null : this.f8158c5);
        }
        if (c()) {
            this.y.s(str, xcVar);
        }
    }

    public final int ta(r0.p pVar) {
        if (this.f8161fb && this.f8165p) {
            return 0;
        }
        return (this.f8166s && pVar.f7524s == -1) ? 1 : -1;
    }

    public final void x4(Throwable th) {
        if (f3() || (th instanceof y.C0174y)) {
            this.f8165p = true;
        }
    }

    @Override // r0.tl
    public long y(r0.p pVar) throws IOException {
        try {
            String strBuildCacheKey = this.f8169v.buildCacheKey(pVar);
            r0.p pVarY = pVar.y().a(strBuildCacheKey).y();
            this.f8163i9 = pVarY;
            this.f8158c5 = r(this.y, strBuildCacheKey, pVarY.y);
            this.f8170wz = pVar.f7521fb;
            int iTa = ta(pVar);
            boolean z = iTa != -1;
            this.f8164mt = z;
            if (z) {
                fh(iTa);
            }
            if (this.f8164mt) {
                this.f8171xc = -1L;
            } else {
                long jY = tl.y(this.y.n3(strBuildCacheKey));
                this.f8171xc = jY;
                if (jY != -1) {
                    long j = jY - pVar.f7521fb;
                    this.f8171xc = j;
                    if (j < 0) {
                        throw new r0.wz(2008);
                    }
                }
            }
            long jMin = pVar.f7524s;
            if (jMin != -1) {
                long j4 = this.f8171xc;
                if (j4 != -1) {
                    jMin = Math.min(j4, jMin);
                }
                this.f8171xc = jMin;
            }
            long j7 = this.f8171xc;
            if (j7 > 0 || j7 == -1) {
                rz(pVarY, false);
            }
            long j8 = pVar.f7524s;
            return j8 != -1 ? j8 : this.f8171xc;
        } catch (Throwable th) {
            x4(th);
            throw th;
        }
    }

    public zn(t0.y yVar, @Nullable r0.tl tlVar, r0.tl tlVar2, @Nullable r0.f fVar, @Nullable CacheKeyFactory cacheKeyFactory, int i, @Nullable ej ejVar, int i5, @Nullable n3 n3Var) {
        this.y = yVar;
        this.n3 = tlVar2;
        this.f8169v = cacheKeyFactory == null ? CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.f8157a = (i & 1) != 0;
        this.f8161fb = (i & 2) != 0;
        this.f8166s = (i & 4) != 0;
        if (tlVar == null) {
            this.f8162gv = ud.y;
            this.zn = null;
        } else {
            tlVar = ejVar != null ? new a8(tlVar, ejVar, i5) : tlVar;
            this.f8162gv = tlVar;
            this.zn = fVar != null ? new qn(tlVar, fVar) : null;
        }
    }

    public final void d0() {
    }

    public final void fh(int i) {
    }
}

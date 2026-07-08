package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.smoothstreaming.n3;
import com.google.android.exoplayer2.source.smoothstreaming.y;
import e7.y;
import ft.rb;
import ft.xb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r0.d;
import r0.mg;
import r0.n;
import r0.o;
import r0.ta;
import r0.tl;
import r0.z6;
import ur.b;
import ur.c;
import ur.c5;
import ur.d0;
import ur.i4;
import ur.mg;
import ur.t;
import ur.y5;
import v0.ut;
import v5.r;

/* JADX INFO: loaded from: classes.dex */
public final class SsMediaSource extends ur.y implements ta.n3<z6<e7.y>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<zn> f1858b;
    public final c5 c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final Uri f1859co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1860d;
    public final a d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final b.y f1861ej;
    public final tl.y f3;
    public final mg fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public tl f1862hw;
    public long j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public ta f1863j5;
    public final n3.y n;

    @Nullable
    public o o;
    public e7.y oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1864p;
    public d qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xb f1865r;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public Handler f1866ut;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z6.y<? extends e7.y> f1867x;
    public final xb.s z;

    public static final class Factory implements mg.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1868a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public z6.y<? extends e7.y> f1869fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public r f1870gv;

        @Nullable
        public final tl.y n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public r0.mg f1871v;
        public final n3.y y;
        public c5 zn;

        public Factory(tl.y yVar) {
            this(new y.C0058y(yVar), yVar);
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Factory zn(r0.mg mgVar) {
            this.f1871v = (r0.mg) v0.y.a(mgVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public SsMediaSource y(xb xbVar) {
            v0.y.v(xbVar.f5080v);
            z6.y n3Var = this.f1869fb;
            if (n3Var == null) {
                n3Var = new e7.n3();
            }
            List<StreamKey> list = xbVar.f5080v.f5122gv;
            return new SsMediaSource(xbVar, null, this.n3, !list.isEmpty() ? new np.n3(n3Var, list) : n3Var, this.y, this.zn, this.f1870gv.y(xbVar), this.f1871v, this.f1868a);
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public Factory n3(r rVar) {
            this.f1870gv = (r) v0.y.a(rVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public Factory(n3.y yVar, @Nullable tl.y yVar2) {
            this.y = (n3.y) v0.y.v(yVar);
            this.n3 = yVar2;
            this.f1870gv = new com.google.android.exoplayer2.drm.zn();
            this.f1871v = new n();
            this.f1868a = 30000L;
            this.zn = new t();
        }
    }

    static {
        rb.y("goog.exo.smoothstreaming");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f1863j5.c5()) {
            return;
        }
        z6 z6Var = new z6(this.f1862hw, this.f1859co, 4, this.f1867x);
        this.f1861ej.c(new i4(z6Var.y, z6Var.n3, this.f1863j5.wz(z6Var, this, this.fh.zn(z6Var.zn))), z6Var.zn);
    }

    @Override // ur.y
    public void ap() {
        this.oz = this.f1864p ? this.oz : null;
        this.f1862hw = null;
        this.j = 0L;
        ta taVar = this.f1863j5;
        if (taVar != null) {
            taVar.t();
            this.f1863j5 = null;
        }
        Handler handler = this.f1866ut;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f1866ut = null;
        }
        this.d0.release();
    }

    @Override // ur.mg
    public xb c() {
        return this.f1865r;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((zn) d0Var).r();
        this.f1858b.remove(d0Var);
    }

    @Override // ur.y
    public void e(@Nullable o oVar) {
        this.o = oVar;
        this.d0.n3(Looper.myLooper(), nf());
        this.d0.prepare();
        if (this.f1864p) {
            this.qn = new d.y();
            g3();
            return;
        }
        this.f1862hw = this.f3.y();
        ta taVar = new ta("SsMediaSource");
        this.f1863j5 = taVar;
        this.qn = taVar;
        this.f1866ut = ut.i4();
        g();
    }

    public final void g3() {
        y5 y5Var;
        for (int i = 0; i < this.f1858b.size(); i++) {
            this.f1858b.get(i).x4(this.oz);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (y.n3 n3Var : this.oz.f3283a) {
            if (n3Var.f3290f > 0) {
                jMax2 = Math.min(jMax2, n3Var.v(0));
                jMax = Math.max(jMax, n3Var.v(n3Var.f3290f - 1) + n3Var.zn(n3Var.f3290f - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j = this.oz.f3285gv ? -9223372036854775807L : 0L;
            e7.y yVar = this.oz;
            boolean z = yVar.f3285gv;
            y5Var = new y5(j, 0L, 0L, 0L, true, z, z, yVar, this.f1865r);
        } else {
            e7.y yVar2 = this.oz;
            if (yVar2.f3285gv) {
                long j4 = yVar2.f3286s;
                if (j4 != -9223372036854775807L && j4 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j4);
                }
                long j7 = jMax2;
                long j8 = jMax - j7;
                long jXb = j8 - ut.xb(this.f1860d);
                if (jXb < 5000000) {
                    jXb = Math.min(5000000L, j8 / 2);
                }
                y5Var = new y5(-9223372036854775807L, j8, j7, jXb, true, true, true, this.oz, this.f1865r);
            } else {
                long j9 = yVar2.f3284fb;
                long j10 = j9 != -9223372036854775807L ? j9 : jMax - jMax2;
                y5Var = new y5(jMax2 + j10, j10, jMax2, 0L, true, false, false, this.oz, this.f1865r);
            }
        }
        s8(y5Var);
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: kp, reason: merged with bridge method [inline-methods] */
    public void xc(z6<e7.y> z6Var, long j, long j4) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.fh.gv(z6Var.y);
        this.f1861ej.z(i4Var, z6Var.zn);
        this.oz = z6Var.zn();
        this.j = j - j4;
        g3();
        m();
    }

    public final void m() {
        if (this.oz.f3285gv) {
            this.f1866ut.postDelayed(new Runnable() { // from class: bm.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.g();
                }
            }, Math.max(0L, (this.j + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // ur.mg
    public void oz() throws IOException {
        this.qn.n3();
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: rb, reason: merged with bridge method [inline-methods] */
    public ta.zn fh(z6<e7.y> z6Var, long j, long j4, IOException iOException, int i) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        long jY = this.fh.y(new mg.zn(i4Var, new c(z6Var.zn), iOException, i));
        ta.zn znVarS = jY == -9223372036854775807L ? ta.f7549fb : ta.s(false, jY);
        boolean zZn = znVarS.zn();
        this.f1861ej.f3(i4Var, z6Var.zn, iOException, !zZn);
        if (!zZn) {
            this.fh.gv(z6Var.y);
        }
        return znVarS;
    }

    @Override // r0.ta.n3
    /* JADX INFO: renamed from: yc, reason: merged with bridge method [inline-methods] */
    public void j5(z6<e7.y> z6Var, long j, long j4, boolean z) {
        i4 i4Var = new i4(z6Var.y, z6Var.n3, z6Var.gv(), z6Var.n3(), j, j4, z6Var.y());
        this.fh.gv(z6Var.y);
        this.f1861ej.p(i4Var, z6Var.zn);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        b.y yVarO4 = o4(n3Var);
        zn znVar = new zn(this.oz, this.n, this.o, this.c, this.d0, dm(n3Var), this.fh, yVarO4, this.qn, n3Var2);
        this.f1858b.add(znVar);
        return znVar;
    }

    public SsMediaSource(xb xbVar, @Nullable e7.y yVar, @Nullable tl.y yVar2, @Nullable z6.y<? extends e7.y> yVar3, n3.y yVar4, c5 c5Var, a aVar, r0.mg mgVar, long j) {
        v0.y.fb(yVar == null || !yVar.f3285gv);
        this.f1865r = xbVar;
        xb.s sVar = (xb.s) v0.y.v(xbVar.f5080v);
        this.z = sVar;
        this.oz = yVar;
        this.f1859co = sVar.y.equals(Uri.EMPTY) ? null : ut.fh(sVar.y);
        this.f3 = yVar2;
        this.f1867x = yVar3;
        this.n = yVar4;
        this.c = c5Var;
        this.d0 = aVar;
        this.fh = mgVar;
        this.f1860d = j;
        this.f1861ej = o4(null);
        this.f1864p = yVar != null;
        this.f1858b = new ArrayList<>();
    }
}

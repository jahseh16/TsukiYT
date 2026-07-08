package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.a;
import com.google.android.exoplayer2.offline.StreamKey;
import ft.rb;
import ft.xb;
import java.io.IOException;
import java.util.List;
import nr.fb;
import nr.s;
import nr.zn;
import os.f;
import os.fb;
import os.t;
import os.v;
import r0.mg;
import r0.n;
import r0.n3;
import r0.o;
import r0.tl;
import ur.b;
import ur.c5;
import ur.d0;
import ur.mg;
import ur.y5;
import v0.ut;
import v5.r;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource extends ur.y implements t.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xb.fb f1761b;
    public final boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final xb.s f1762co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f1763d;
    public final int d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final long f1764ej;
    public final a f3;
    public final boolean fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public o f1765hw;
    public final mg n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f1766p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c5 f1767r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xb f1768x;
    public final fb z;

    public static final class Factory implements mg.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f1769a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f1770c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1771f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public r0.mg f1772fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public t.y f1773gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public boolean f1774i9;
        public s n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f1775s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public c5 f1776v;
        public final fb y;
        public f zn;

        public Factory(tl.y yVar) {
            this(new zn(yVar));
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Factory n3(r rVar) {
            this.f1769a = (r) v0.y.a(rVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
        public Factory zn(r0.mg mgVar) {
            this.f1772fb = (r0.mg) v0.y.a(mgVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ur.mg.y
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource y(xb xbVar) {
            v0.y.v(xbVar.f5080v);
            f vVar = this.zn;
            List<StreamKey> list = xbVar.f5080v.f5122gv;
            if (!list.isEmpty()) {
                vVar = new v(vVar, list);
            }
            fb fbVar = this.y;
            s sVar = this.n3;
            c5 c5Var = this.f1776v;
            a aVarY = this.f1769a.y(xbVar);
            r0.mg mgVar = this.f1772fb;
            return new HlsMediaSource(xbVar, fbVar, sVar, c5Var, aVarY, mgVar, this.f1773gv.y(this.y, mgVar, vVar), this.f1771f, this.f1775s, this.f1770c5, this.f1774i9);
        }

        public Factory v(boolean z) {
            this.f1775s = z;
            return this;
        }

        public Factory(fb fbVar) {
            this.y = (fb) v0.y.v(fbVar);
            this.f1769a = new com.google.android.exoplayer2.drm.zn();
            this.zn = new os.y();
            this.f1773gv = os.zn.fh;
            this.n3 = s.y;
            this.f1772fb = new n();
            this.f1776v = new ur.t();
            this.f1770c5 = 1;
            this.f1771f = -9223372036854775807L;
            this.f1775s = true;
        }
    }

    static {
        rb.y("goog.exo.hls");
    }

    public static long g(os.fb fbVar, long j) {
        long j4;
        fb.a aVar = fbVar.f7208x4;
        long j7 = fbVar.f7206v;
        if (j7 != -9223372036854775807L) {
            j4 = fbVar.f7202r - j7;
        } else {
            long j8 = aVar.f7210gv;
            if (j8 == -9223372036854775807L || fbVar.f7207wz == -9223372036854775807L) {
                long j9 = aVar.zn;
                j4 = j9 != -9223372036854775807L ? j9 : fbVar.f7205tl * 3;
            } else {
                j4 = j8;
            }
        }
        return j4 + j;
    }

    @Nullable
    public static fb.n3 kp(List<fb.n3> list, long j) {
        fb.n3 n3Var = null;
        for (int i = 0; i < list.size(); i++) {
            fb.n3 n3Var2 = list.get(i);
            long j4 = n3Var2.f7213f;
            if (j4 > j || !n3Var2.f3) {
                if (j4 > j) {
                    break;
                }
            } else {
                n3Var = n3Var2;
            }
        }
        return n3Var;
    }

    public static fb.gv rb(List<fb.gv> list, long j) {
        return list.get(ut.a(list, Long.valueOf(j), true, true));
    }

    @Override // os.t.v
    public void a8(os.fb fbVar) {
        long jGf = fbVar.w ? ut.gf(fbVar.f7203s) : -9223372036854775807L;
        int i = fbVar.f7198gv;
        long j = (i == 2 || i == 1) ? jGf : -9223372036854775807L;
        nr.c5 c5Var = new nr.c5((os.s) v0.y.v(this.f1763d.gv()), fbVar);
        s8(this.f1763d.isLive() ? yg(fbVar, j, jGf, c5Var) : yc(fbVar, j, jGf, c5Var));
    }

    @Override // ur.y
    public void ap() {
        this.f1763d.stop();
        this.f3.release();
    }

    @Override // ur.mg
    public xb c() {
        return this.f1768x;
    }

    @Override // ur.mg
    public void d(d0 d0Var) {
        ((nr.t) d0Var).fh();
    }

    @Override // ur.y
    public void e(@Nullable o oVar) {
        this.f1765hw = oVar;
        this.f3.n3((Looper) v0.y.v(Looper.myLooper()), nf());
        this.f3.prepare();
        this.f1763d.s(this.f1762co.y, o4(null), this);
    }

    public final long g3(os.fb fbVar) {
        if (fbVar.w) {
            return ut.xb(ut.y5(this.f1764ej)) - fbVar.v();
        }
        return 0L;
    }

    public final long m(os.fb fbVar, long j) {
        long jXb = fbVar.f7206v;
        if (jXb == -9223372036854775807L) {
            jXb = (fbVar.f7202r + j) - ut.xb(this.f1761b.y);
        }
        if (fbVar.f7197fb) {
            return jXb;
        }
        fb.n3 n3VarKp = kp(fbVar.f7195co, jXb);
        if (n3VarKp != null) {
            return n3VarKp.f7213f;
        }
        if (fbVar.f7200mt.isEmpty()) {
            return 0L;
        }
        fb.gv gvVarRb = rb(fbVar.f7200mt, jXb);
        fb.n3 n3VarKp2 = kp(gvVarRb.n, jXb);
        return n3VarKp2 != null ? n3VarKp2.f7213f : gvVarRb.f7213f;
    }

    @Override // ur.mg
    public void oz() throws IOException {
        this.f1763d.i9();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(os.fb r6, long r7) {
        /*
            r5 = this;
            ft.xb r0 = r5.f1768x
            ft.xb$fb r0 = r0.f5078s
            float r1 = r0.f5100s
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f5098f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            os.fb$a r6 = r6.f7208x4
            long r0 = r6.zn
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L28
            long r0 = r6.f7210gv
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            ft.xb$fb$y r0 = new ft.xb$fb$y
            r0.<init>()
            long r7 = v0.ut.gf(r7)
            ft.xb$fb$y r7 = r0.f(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L41
        L3d:
            ft.xb$fb r0 = r5.f1761b
            float r0 = r0.f5100s
        L41:
            ft.xb$fb$y r7 = r7.i9(r0)
            if (r6 == 0) goto L48
            goto L4c
        L48:
            ft.xb$fb r6 = r5.f1761b
            float r8 = r6.f5098f
        L4c:
            ft.xb$fb$y r6 = r7.s(r8)
            ft.xb$fb r6 = r6.a()
            r5.f1761b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.u0(os.fb, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ur.y5 yc(os.fb r25, long r26, long r28, nr.c5 r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f7206v
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.List<os.fb$gv> r1 = r0.f7200mt
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L31
        L16:
            boolean r1 = r0.f7197fb
            if (r1 != 0) goto L2e
            long r1 = r0.f7206v
            long r3 = r0.f7202r
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L2e
        L23:
            java.util.List<os.fb$gv> r3 = r0.f7200mt
            os.fb$gv r1 = rb(r3, r1)
            long r1 = r1.f7213f
        L2b:
            r16 = r1
            goto L34
        L2e:
            long r1 = r0.f7206v
            goto L2b
        L31:
            r1 = 0
            goto L2b
        L34:
            ur.y5 r1 = new ur.y5
            r3 = r1
            long r10 = r0.f7202r
            r12 = r10
            r0 = r24
            ft.xb r2 = r0.f1768x
            r22 = r2
            r23 = 0
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.yc(os.fb, long, long, nr.c5):ur.y5");
    }

    public final y5 yg(os.fb fbVar, long j, long j4, nr.c5 c5Var) {
        long jZn = fbVar.f7203s - this.f1763d.zn();
        long j7 = fbVar.f7209xc ? jZn + fbVar.f7202r : -9223372036854775807L;
        long jG3 = g3(fbVar);
        long j8 = this.f1761b.y;
        u0(fbVar, ut.mt(j8 != -9223372036854775807L ? ut.xb(j8) : g(fbVar, jG3), jG3, fbVar.f7202r + jG3));
        return new y5(j, j4, -9223372036854775807L, j7, fbVar.f7202r, jZn, m(fbVar, jG3), true, !fbVar.f7209xc, fbVar.f7198gv == 2 && fbVar.f7193a, c5Var, this.f1768x, this.f1761b);
    }

    @Override // ur.mg
    public d0 zn(mg.n3 n3Var, n3 n3Var2, long j) {
        b.y yVarO4 = o4(n3Var);
        return new nr.t(this.f1766p, this.f1763d, this.z, this.f1765hw, this.f3, dm(n3Var), this.n, yVarO4, n3Var2, this.f1767r, this.c, this.d0, this.fh, nf());
    }

    public HlsMediaSource(xb xbVar, nr.fb fbVar, s sVar, c5 c5Var, a aVar, r0.mg mgVar, t tVar, long j, boolean z, int i, boolean z5) {
        this.f1762co = (xb.s) v0.y.v(xbVar.f5080v);
        this.f1768x = xbVar;
        this.f1761b = xbVar.f5078s;
        this.z = fbVar;
        this.f1766p = sVar;
        this.f1767r = c5Var;
        this.f3 = aVar;
        this.n = mgVar;
        this.f1763d = tVar;
        this.f1764ej = j;
        this.c = z;
        this.d0 = i;
        this.fh = z5;
    }
}

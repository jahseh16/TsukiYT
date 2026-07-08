package ft;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import ft.co;
import ft.dp;
import ft.gv;
import ft.h;
import ft.im;
import ft.kp;
import ft.n3;
import ft.ne;
import ft.xq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import ur.mg;
import ur.u;
import v0.z;
import z0.t;

/* JADX INFO: loaded from: classes.dex */
public final class dm extends ft.v implements co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im f4672a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public boolean f4673a8;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public boolean f4674ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1 f4675b;
    public final ft.n3 c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final v0.p f4676c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final Looper f4677co;
    public int ct;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4678d;
    public final ft.gv d0;

    @Nullable
    public di.v dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public v0.ej f4679e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public boolean f4680eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public int f4681ej;

    @Nullable
    public TextureView en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kp f4682f;
    public final zn f3;
    public boolean f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final hk[] f4683fb;
    public final dp fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4684g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public int f4685g3;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final v0.s f4686gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public qj f4687hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public final v0.v f4688i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final kp.a f4689i9;

    @Nullable
    public AudioTrack j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public qj f4690j5;
    public int jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public z0.t f4691k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public ur.u f4692k5;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public qj f4693kp;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public b0.a f4694lc;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4695m;
    public final l0 mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final zo.y f4696mt;
    public final gv n;
    public final n0.a8 n3;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public boolean f4697nf;

    @Nullable
    public g o;
    public mn.v o4;

    @Nullable
    public Object oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mg.y f4698p;

    @Nullable
    public SurfaceHolder q9;

    @Nullable
    public g qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4699r;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f4700ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public fc f4701rb;
    public float rs;
    public final zx rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n0.ud f4702s;
    public boolean s8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v0.z<im.gv> f4703t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public final long f4704ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final CopyOnWriteArraySet<co.y> f4705tl;
    public int u;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f4706ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    @Nullable
    public Surface f4707ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f4708v;
    public im.n3 vl;
    public final boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final xq.n3 f4709wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4710x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public final long f4711x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final List<v> f4712xc;

    @Nullable
    public di.v xg;
    public v0.a8 y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public w0.mg f4713yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public xc f4714yg;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    public boolean f4715yt;
    public final r0.a z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public boolean f4716z6;
    public final im.n3 zn;

    public static final class gv implements w0.wz, z0.y, h.n3 {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public w0.wz f4717fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public z0.y f4718s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public z0.y f4719v;

        @Nullable
        public w0.wz y;

        public gv() {
        }

        @Override // ft.h.n3
        public void f(int i, @Nullable Object obj) {
            if (i == 7) {
                this.y = (w0.wz) obj;
                return;
            }
            if (i == 8) {
                this.f4719v = (z0.y) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            z0.t tVar = (z0.t) obj;
            if (tVar == null) {
                this.f4717fb = null;
                this.f4718s = null;
            } else {
                this.f4717fb = tVar.getVideoFrameMetadataListener();
                this.f4718s = tVar.getCameraMotionListener();
            }
        }

        @Override // w0.wz
        public void n3(long j, long j4, g gVar, @Nullable MediaFormat mediaFormat) {
            w0.wz wzVar = this.f4717fb;
            if (wzVar != null) {
                wzVar.n3(j, j4, gVar, mediaFormat);
            }
            w0.wz wzVar2 = this.y;
            if (wzVar2 != null) {
                wzVar2.n3(j, j4, gVar, mediaFormat);
            }
        }

        @Override // z0.y
        public void v() {
            z0.y yVar = this.f4718s;
            if (yVar != null) {
                yVar.v();
            }
            z0.y yVar2 = this.f4719v;
            if (yVar2 != null) {
                yVar2.v();
            }
        }

        @Override // z0.y
        public void zn(long j, float[] fArr) {
            z0.y yVar = this.f4718s;
            if (yVar != null) {
                yVar.zn(j, fArr);
            }
            z0.y yVar2 = this.f4719v;
            if (yVar2 != null) {
                yVar2.zn(j, fArr);
            }
        }
    }

    public static final class n3 {
        public static zo.gn y(Context context, dm dmVar, boolean z) {
            zo.zq zqVarPq = zo.zq.pq(context);
            if (zqVarPq == null) {
                v0.r.c5("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new zo.gn(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                dmVar.ct(zqVarPq);
            }
            return new zo.gn(zqVarPq.qk());
        }
    }

    public static final class v implements w9 {
        public xq n3;
        public final Object y;

        public v(Object obj, xq xqVar) {
            this.y = obj;
            this.n3 = xqVar;
        }

        @Override // ft.w9
        public xq n3() {
            return this.n3;
        }

        @Override // ft.w9
        public Object y() {
            return this.y;
        }
    }

    public final class zn implements w0.fh, mn.r, b0.w, de.v, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, t.n3, gv.n3, n3.InterfaceC0092n3, dp.n3, co.y {
        public zn() {
        }

        @Override // z0.t.n3
        public void a(Surface surface) {
            dm.this.jf(null);
        }

        @Override // mn.r
        public /* synthetic */ void c(g gVar) {
            mn.i9.y(this, gVar);
        }

        @Override // w0.fh
        public void c5(di.v vVar) {
            dm.this.xg = vVar;
            dm.this.f4696mt.c5(vVar);
        }

        @Override // mn.r
        public void co(g gVar, @Nullable di.c5 c5Var) {
            dm.this.o = gVar;
            dm.this.f4696mt.co(gVar, c5Var);
        }

        @Override // ft.co.y
        public void d0(boolean z) {
            dm.this.ni();
        }

        @Override // mn.r
        public void f(long j) {
            dm.this.f4696mt.f(j);
        }

        @Override // w0.fh
        public void f3(long j, int i) {
            dm.this.f4696mt.f3(j, i);
        }

        @Override // mn.r
        public void fb(String str) {
            dm.this.f4696mt.fb(str);
        }

        @Override // ft.gv.n3
        public void fh(float f3) {
            dm.this.t6();
        }

        @Override // mn.r
        public void gv(Exception exc) {
            dm.this.f4696mt.gv(exc);
        }

        @Override // mn.r
        public void i4(int i, long j, long j4) {
            dm.this.f4696mt.i4(i, j, j4);
        }

        @Override // mn.r
        public void i9(di.v vVar) {
            dm.this.f4696mt.i9(vVar);
            dm.this.o = null;
            dm.this.dm = null;
        }

        @Override // w0.fh
        public void mt(Object obj, long j) {
            dm.this.f4696mt.mt(obj, j);
            if (dm.this.oz == obj) {
                dm.this.f4703t.t(26, new z.y() { // from class: ft.e
                    @Override // v0.z.y
                    public final void invoke(Object obj2) {
                        ((im.gv) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // w0.fh
        public /* synthetic */ void n(g gVar) {
            w0.p.y(this, gVar);
        }

        @Override // w0.fh
        public void n3(String str) {
            dm.this.f4696mt.n3(str);
        }

        @Override // b0.w
        public void onCues(final List<b0.n3> list) {
            dm.this.f4703t.t(27, new z.y() { // from class: ft.o4
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onCues((List<b0.n3>) list);
                }
            });
        }

        @Override // de.v
        public void onMetadata(final Metadata metadata) {
            dm dmVar = dm.this;
            dmVar.f4693kp = dmVar.f4693kp.n3().x(metadata).ej();
            qj qjVarL0 = dm.this.l0();
            if (!qjVarL0.equals(dm.this.f4687hw)) {
                dm.this.f4687hw = qjVarL0;
                dm.this.f4703t.c5(14, new z.y() { // from class: ft.eb
                    @Override // v0.z.y
                    public final void invoke(Object obj) {
                        this.y.yt((im.gv) obj);
                    }
                });
            }
            dm.this.f4703t.c5(28, new z.y() { // from class: ft.lc
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onMetadata(metadata);
                }
            });
            dm.this.f4703t.a();
        }

        @Override // mn.r
        public void onSkipSilenceEnabledChanged(final boolean z) {
            if (dm.this.f4680eb == z) {
                return;
            }
            dm.this.f4680eb = z;
            dm.this.f4703t.t(23, new z.y() { // from class: ft.ap
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onSkipSilenceEnabledChanged(z);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
            dm.this.gm(surfaceTexture);
            dm.this.bx(i, i5);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            dm.this.jf(null);
            dm.this.bx(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
            dm.this.bx(i, i5);
        }

        @Override // w0.fh
        public void onVideoSizeChanged(final w0.mg mgVar) {
            dm.this.f4713yc = mgVar;
            dm.this.f4703t.t(25, new z.y() { // from class: ft.s8
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onVideoSizeChanged(mgVar);
                }
            });
        }

        @Override // w0.fh
        public void p(int i, long j) {
            dm.this.f4696mt.p(i, j);
        }

        @Override // mn.r
        public void r(Exception exc) {
            dm.this.f4696mt.r(exc);
        }

        @Override // ft.gv.n3
        public void rz(int i) {
            boolean zK = dm.this.k();
            dm.this.w5(zK, i, dm.rt(zK, i));
        }

        @Override // mn.r
        public void s(String str, long j, long j4) {
            dm.this.f4696mt.s(str, j, j4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i5, int i8) {
            dm.this.bx(i5, i8);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (dm.this.f7) {
                dm.this.jf(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (dm.this.f7) {
                dm.this.jf(null);
            }
            dm.this.bx(0, 0);
        }

        @Override // w0.fh
        public void t(g gVar, @Nullable di.c5 c5Var) {
            dm.this.qn = gVar;
            dm.this.f4696mt.t(gVar, c5Var);
        }

        @Override // w0.fh
        public void tl(Exception exc) {
            dm.this.f4696mt.tl(exc);
        }

        @Override // w0.fh
        public void v(String str, long j, long j4) {
            dm.this.f4696mt.v(str, j, j4);
        }

        @Override // ft.dp.n3
        public void w(final int i, final boolean z) {
            dm.this.f4703t.t(30, new z.y() { // from class: ft.nf
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onDeviceVolumeChanged(i, z);
                }
            });
        }

        @Override // mn.r
        public void wz(di.v vVar) {
            dm.this.dm = vVar;
            dm.this.f4696mt.wz(vVar);
        }

        @Override // w0.fh
        public void x4(di.v vVar) {
            dm.this.f4696mt.x4(vVar);
            dm.this.qn = null;
            dm.this.xg = null;
        }

        @Override // z0.t.n3
        public void xc(Surface surface) {
            dm.this.jf(surface);
        }

        @Override // ft.dp.n3
        public void y(int i) {
            final xc xcVarZh = dm.zh(dm.this.fh);
            if (xcVarZh.equals(dm.this.f4714yg)) {
                return;
            }
            dm.this.f4714yg = xcVarZh;
            dm.this.f4703t.t(29, new z.y() { // from class: ft.ra
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onDeviceInfoChanged(xcVarZh);
                }
            });
        }

        public final /* synthetic */ void yt(im.gv gvVar) {
            gvVar.onMediaMetadataChanged(dm.this.f4687hw);
        }

        @Override // ft.co.y
        public /* synthetic */ void z(boolean z) {
            mt.y(this, z);
        }

        @Override // ft.n3.InterfaceC0092n3
        public void zn() {
            dm.this.w5(false, -1, 3);
        }

        @Override // b0.w
        public void onCues(final b0.a aVar) {
            dm.this.f4694lc = aVar;
            dm.this.f4703t.t(27, new z.y() { // from class: ft.rs
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onCues(aVar);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    static {
        rb.y("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public dm(co.n3 n3Var, @Nullable im imVar) throws Throwable {
        dm dmVar;
        final dm dmVar2 = this;
        v0.s sVar = new v0.s();
        dmVar2.f4686gv = sVar;
        try {
            v0.r.a("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + v0.ut.f8766v + "]");
            Context applicationContext = n3Var.y.getApplicationContext();
            dmVar2.f4708v = applicationContext;
            zo.y yVarApply = n3Var.f4654c5.apply(n3Var.n3);
            dmVar2.f4696mt = yVarApply;
            dmVar2.f4679e = n3Var.f4656f;
            dmVar2.o4 = n3Var.f4665t;
            dmVar2.jz = n3Var.f4662p;
            dmVar2.u = n3Var.f4661mt;
            dmVar2.f4680eb = n3Var.w;
            dmVar2.f4704ta = n3Var.n;
            zn znVar = new zn();
            dmVar2.f3 = znVar;
            gv gvVar = new gv();
            dmVar2.n = gvVar;
            Handler handler = new Handler(n3Var.f4660i9);
            hk[] hkVarArrY = n3Var.f4658gv.get().y(handler, znVar, znVar, znVar, znVar);
            dmVar2.f4683fb = hkVarArrY;
            v0.y.fb(hkVarArrY.length > 0);
            n0.ud udVar = n3Var.f4653a.get();
            dmVar2.f4702s = udVar;
            dmVar2.f4698p = n3Var.f4667v.get();
            r0.a aVar = n3Var.f4664s.get();
            dmVar2.z = aVar;
            dmVar2.w = n3Var.f4655co;
            dmVar2.f4675b = n3Var.z;
            dmVar2.f4699r = n3Var.f4663r;
            dmVar2.f4711x4 = n3Var.f4669x4;
            dmVar2.f4715yt = n3Var.c;
            Looper looper = n3Var.f4660i9;
            dmVar2.f4677co = looper;
            v0.v vVar = n3Var.n3;
            dmVar2.f4688i4 = vVar;
            im imVar2 = imVar == null ? dmVar2 : imVar;
            dmVar2.f4672a = imVar2;
            dmVar2.f4703t = new v0.z<>(looper, vVar, new z.n3() { // from class: ft.yt
                @Override // v0.z.n3
                public final void y(Object obj, v0.wz wzVar) {
                    this.y.vi((im.gv) obj, wzVar);
                }
            });
            dmVar2.f4705tl = new CopyOnWriteArraySet<>();
            dmVar2.f4712xc = new ArrayList();
            dmVar2.f4692k5 = new u.y(0);
            n0.a8 a8Var = new n0.a8(new gn[hkVarArrY.length], new n0.c[hkVarArrY.length], gi.f4815v, null);
            dmVar2.n3 = a8Var;
            dmVar2.f4709wz = new xq.n3();
            im.n3 n3VarV = new im.n3.y().zn(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).gv(29, udVar.s()).v();
            dmVar2.zn = n3VarV;
            dmVar2.vl = new im.n3.y().n3(n3VarV).y(4).y(10).v();
            dmVar2.f4676c5 = vVar.n3(looper, null);
            kp.a aVar2 = new kp.a() { // from class: ft.vl
                @Override // ft.kp.a
                public final void y(kp.v vVar2) {
                    this.y.e5(vVar2);
                }
            };
            dmVar2.f4689i9 = aVar2;
            dmVar2.f4701rb = fc.i9(a8Var);
            yVarApply.b(imVar2, looper);
            int i = v0.ut.y;
            try {
                kp kpVar = new kp(hkVarArrY, udVar, a8Var, n3Var.f4657fb.get(), aVar, dmVar2.f4678d, dmVar2.f4716z6, yVarApply, dmVar2.f4675b, n3Var.f4659i4, n3Var.f3, dmVar2.f4715yt, looper, vVar, aVar2, i < 31 ? new zo.gn() : n3.y(applicationContext, dmVar2, n3Var.d0), n3Var.fh);
                dmVar2 = this;
                dmVar2.f4682f = kpVar;
                dmVar2.rs = 1.0f;
                dmVar2.f4678d = 0;
                qj qjVar = qj.xg;
                dmVar2.f4687hw = qjVar;
                dmVar2.f4690j5 = qjVar;
                dmVar2.f4693kp = qjVar;
                dmVar2.f4685g3 = -1;
                if (i < 21) {
                    dmVar2.ct = dmVar2.hf(0);
                } else {
                    dmVar2.ct = v0.ut.d(applicationContext);
                }
                dmVar2.f4694lc = b0.a.f1185fb;
                dmVar2.f4697nf = true;
                dmVar2.f(yVarApply);
                aVar.s(new Handler(looper), yVarApply);
                dmVar2.v1(znVar);
                long j = n3Var.zn;
                if (j > 0) {
                    kpVar.r(j);
                }
                ft.n3 n3Var2 = new ft.n3(n3Var.y, handler, znVar);
                dmVar2.c = n3Var2;
                n3Var2.n3(n3Var.f4670xc);
                ft.gv gvVar2 = new ft.gv(n3Var.y, handler, znVar);
                dmVar2.d0 = gvVar2;
                gvVar2.tl(n3Var.f4666tl ? dmVar2.o4 : null);
                dp dpVar = new dp(n3Var.y, handler, znVar);
                dmVar2.fh = dpVar;
                dpVar.s(v0.ut.rs(dmVar2.o4.f6689fb));
                zx zxVar = new zx(n3Var.y);
                dmVar2.rz = zxVar;
                zxVar.y(n3Var.f4668wz != 0);
                l0 l0Var = new l0(n3Var.y);
                dmVar2.mg = l0Var;
                l0Var.y(n3Var.f4668wz == 2);
                dmVar2.f4714yg = zh(dpVar);
                dmVar2.f4713yc = w0.mg.f8899f;
                dmVar2.y5 = v0.a8.zn;
                udVar.t(dmVar2.o4);
                dmVar2.y0(1, 10, Integer.valueOf(dmVar2.ct));
                dmVar2.y0(2, 10, Integer.valueOf(dmVar2.ct));
                dmVar2.y0(1, 3, dmVar2.o4);
                dmVar2.y0(2, 4, Integer.valueOf(dmVar2.jz));
                dmVar2.y0(2, 5, Integer.valueOf(dmVar2.u));
                dmVar2.y0(1, 9, Boolean.valueOf(dmVar2.f4680eb));
                dmVar2.y0(2, 7, gvVar);
                dmVar2.y0(6, 8, gvVar);
                sVar.a();
            } catch (Throwable th) {
                th = th;
                dmVar = this;
                dmVar.f4686gv.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dmVar = dmVar2;
        }
    }

    public static /* synthetic */ void cw(fc fcVar, int i, im.gv gvVar) {
        gvVar.onPlayWhenReadyChanged(fcVar.f4751t, i);
    }

    public static /* synthetic */ void ez(fc fcVar, im.gv gvVar) {
        gvVar.onPlayerError(fcVar.f4742a);
    }

    public static long hj(fc fcVar) {
        xq.gv gvVar = new xq.gv();
        xq.n3 n3Var = new xq.n3();
        fcVar.y.t(fcVar.n3.y, n3Var);
        return fcVar.zn == -9223372036854775807L ? fcVar.y.mt(n3Var.f5172fb, gvVar).v() : n3Var.p() + fcVar.zn;
    }

    public static /* synthetic */ void iu(fc fcVar, im.gv gvVar) {
        gvVar.onPlaybackStateChanged(fcVar.f4753v);
    }

    public static /* synthetic */ void jm(fc fcVar, int i, im.gv gvVar) {
        gvVar.onTimelineChanged(fcVar.y, i);
    }

    public static /* synthetic */ void l8(fc fcVar, im.gv gvVar) {
        gvVar.onIsPlayingChanged(w7(fcVar));
    }

    public static /* synthetic */ void mc(fc fcVar, im.gv gvVar) {
        gvVar.onPlayerErrorChanged(fcVar.f4742a);
    }

    public static /* synthetic */ void mq(int i, im.v vVar, im.v vVar2, im.gv gvVar) {
        gvVar.onPositionDiscontinuity(i);
        gvVar.onPositionDiscontinuity(vVar, vVar2, i);
    }

    public static /* synthetic */ void nz(fc fcVar, im.gv gvVar) {
        gvVar.onPlaybackSuppressionReasonChanged(fcVar.f4752tl);
    }

    public static /* synthetic */ void p2(fc fcVar, im.gv gvVar) {
        gvVar.onPlayerStateChanged(fcVar.f4751t, fcVar.f4753v);
    }

    public static int rt(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    public static /* synthetic */ void t7(fc fcVar, im.gv gvVar) {
        gvVar.onLoadingChanged(fcVar.f4745fb);
        gvVar.onIsLoadingChanged(fcVar.f4745fb);
    }

    public static boolean w7(fc fcVar) {
        return fcVar.f4753v == 3 && fcVar.f4751t && fcVar.f4752tl == 0;
    }

    public static /* synthetic */ void wb(fc fcVar, im.gv gvVar) {
        gvVar.onTracksChanged(fcVar.f4743c5.f6746gv);
    }

    public static /* synthetic */ void xh(fc fcVar, im.gv gvVar) {
        gvVar.onPlaybackParametersChanged(fcVar.f4754wz);
    }

    public static /* synthetic */ void yh(im.gv gvVar) {
        gvVar.onPlayerError(p.n(new g3(1), 1003));
    }

    public static xc zh(dp dpVar) {
        return new xc(0, dpVar.gv(), dpVar.zn());
    }

    @Override // ft.co
    public void a8(List<ur.mg> list, int i, long j) {
        r3();
        m5(list, i, j, false);
    }

    @Override // ft.im
    public long ap() {
        r3();
        if (!i9()) {
            return getCurrentPosition();
        }
        fc fcVar = this.f4701rb;
        fcVar.y.t(fcVar.n3.y, this.f4709wz);
        fc fcVar2 = this.f4701rb;
        return fcVar2.zn == -9223372036854775807L ? fcVar2.y.mt(g3(), this.y).gv() : this.f4709wz.w() + v0.ut.gf(this.f4701rb.zn);
    }

    @Override // ft.im
    public long bk() {
        r3();
        if (this.f4701rb.y.r()) {
            return this.f4684g;
        }
        fc fcVar = this.f4701rb;
        if (fcVar.f4744f.f8549gv != fcVar.n3.f8549gv) {
            return fcVar.y.mt(g3(), this.y).a();
        }
        long j = fcVar.w;
        if (this.f4701rb.f4744f.n3()) {
            fc fcVar2 = this.f4701rb;
            xq.n3 n3VarT = fcVar2.y.t(fcVar2.f4744f.y, this.f4709wz);
            long jC5 = n3VarT.c5(this.f4701rb.f4744f.n3);
            j = jC5 == Long.MIN_VALUE ? n3VarT.f5173s : jC5;
        }
        fc fcVar3 = this.f4701rb;
        return v0.ut.gf(ja(fcVar3.y, fcVar3.f4744f, j));
    }

    public final void bx(final int i, final int i5) {
        if (i == this.y5.n3() && i5 == this.y5.y()) {
            return;
        }
        this.y5 = new v0.a8(i, i5);
        this.f4703t.t(24, new z.y() { // from class: ft.qn
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((im.gv) obj).onSurfaceSizeChanged(i, i5);
            }
        });
    }

    @Override // ft.im
    public void c(boolean z) {
        r3();
        int iW = this.d0.w(z, n3());
        w5(z, iW, rt(z, iW));
    }

    @Override // ft.im
    public int c5() {
        r3();
        return this.f4678d;
    }

    @Override // ft.im
    public void co(@Nullable SurfaceView surfaceView) {
        r3();
        if (surfaceView instanceof w0.tl) {
            ng();
            jf(surfaceView);
            op(surfaceView.getHolder());
        } else {
            if (!(surfaceView instanceof z0.t)) {
                x2(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            ng();
            this.f4691k = (z0.t) surfaceView;
            vb(this.n).wz(10000).tl(this.f4691k).t();
            this.f4691k.gv(this.f3);
            jf(this.f4691k.getVideoSurface());
            op(surfaceView.getHolder());
        }
    }

    public final fc cp(int i, int i5) {
        int iG3 = g3();
        xq xqVarYt = yt();
        int size = this.f4712xc.size();
        this.f4681ej++;
        gd(i, i5);
        xq xqVarHb = hb();
        fc fcVarWv = wv(this.f4701rb, xqVarHb, t5(xqVarYt, xqVarHb));
        int i8 = fcVarWv.f4753v;
        if (i8 != 1 && i8 != 4 && i < i5 && i5 == size && iG3 >= fcVarWv.y.z()) {
            fcVarWv = fcVarWv.fb(4);
        }
        this.f4682f.s8(i, i5, this.f4692k5);
        return fcVarWv;
    }

    @Override // ft.co
    public void ct(zo.zn znVar) {
        this.f4696mt.n((zo.zn) v0.y.v(znVar));
    }

    @Override // ft.im
    public b0.a d() {
        r3();
        return this.f4694lc;
    }

    @Override // ft.im
    public w0.mg dm() {
        r3();
        return this.f4713yc;
    }

    public final /* synthetic */ void e5(final kp.v vVar) {
        this.f4676c5.c5(new Runnable() { // from class: ft.oz
            @Override // java.lang.Runnable
            public final void run() {
                this.y.l3(vVar);
            }
        });
    }

    @Override // ft.co
    public void eb(List<ur.mg> list) {
        r3();
        zx(this.f4712xc.size(), list);
    }

    @Override // ft.co
    public void ej(boolean z) {
        r3();
        if (this.f4674ap) {
            return;
        }
        this.c.n3(z);
    }

    @Override // ft.im
    public void en(boolean z) {
        r3();
        this.d0.w(k(), 1);
        mf(z, null);
        this.f4694lc = new b0.a(k4.r.yt(), this.f4701rb.f4748mt);
    }

    @Override // ft.im
    public void f(im.gv gvVar) {
        this.f4703t.zn((im.gv) v0.y.v(gvVar));
    }

    @Override // ft.im
    public void f7(final boolean z) {
        r3();
        if (this.f4716z6 != z) {
            this.f4716z6 = z;
            this.f4682f.i2(z);
            this.f4703t.c5(9, new z.y() { // from class: ft.o
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onShuffleModeEnabledChanged(z);
                }
            });
            fm();
            this.f4703t.a();
        }
    }

    @Override // ft.im
    public gi fh() {
        r3();
        return this.f4701rb.f4743c5.f6746gv;
    }

    public final void fm() {
        im.n3 n3Var = this.vl;
        im.n3 n3VarEj = v0.ut.ej(this.f4672a, this.zn);
        this.vl = n3VarEj;
        if (n3VarEj.equals(n3Var)) {
            return;
        }
        this.f4703t.c5(13, new z.y() { // from class: ft.ut
            @Override // v0.z.y
            public final void invoke(Object obj) {
                this.y.ih((im.gv) obj);
            }
        });
    }

    public final im.v fp(int i, fc fcVar, int i5) {
        int i8;
        Object obj;
        xb xbVar;
        Object obj2;
        int i10;
        long jHj;
        long jHj2;
        xq.n3 n3Var = new xq.n3();
        if (fcVar.y.r()) {
            i8 = i5;
            obj = null;
            xbVar = null;
            obj2 = null;
            i10 = -1;
        } else {
            Object obj3 = fcVar.n3.y;
            fcVar.y.t(obj3, n3Var);
            int i11 = n3Var.f5172fb;
            int iA = fcVar.y.a(obj3);
            Object obj4 = fcVar.y.mt(i11, this.y).y;
            xbVar = this.y.f5162fb;
            obj2 = obj3;
            i10 = iA;
            obj = obj4;
            i8 = i11;
        }
        if (i == 0) {
            if (fcVar.n3.n3()) {
                mg.n3 n3Var2 = fcVar.n3;
                jHj = n3Var.v(n3Var2.n3, n3Var2.zn);
                jHj2 = hj(fcVar);
            } else {
                jHj = fcVar.n3.f8550v != -1 ? hj(this.f4701rb) : n3Var.f5171f + n3Var.f5173s;
                jHj2 = jHj;
            }
        } else if (fcVar.n3.n3()) {
            jHj = fcVar.f4748mt;
            jHj2 = hj(fcVar);
        } else {
            jHj = n3Var.f5171f + fcVar.f4748mt;
            jHj2 = jHj;
        }
        long jGf = v0.ut.gf(jHj);
        long jGf2 = v0.ut.gf(jHj2);
        mg.n3 n3Var3 = fcVar.n3;
        return new im.v(obj, i8, xbVar, obj2, i10, jGf, jGf2, n3Var3.n3, n3Var3.zn);
    }

    public final Pair<Boolean, Integer> fq(fc fcVar, fc fcVar2, boolean z, int i, boolean z5, boolean z7) {
        xq xqVar = fcVar2.y;
        xq xqVar2 = fcVar.y;
        if (xqVar2.r() && xqVar.r()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i5 = 3;
        if (xqVar2.r() != xqVar.r()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (xqVar.mt(xqVar.t(fcVar2.n3.y, this.f4709wz).f5172fb, this.y).y.equals(xqVar2.mt(xqVar2.t(fcVar.n3.y, this.f4709wz).f5172fb, this.y).y)) {
            return (z && i == 0 && fcVar2.n3.f8549gv < fcVar.n3.f8549gv) ? new Pair<>(Boolean.TRUE, 0) : (z && i == 1 && z7) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i == 0) {
            i5 = 1;
        } else if (z && i == 1) {
            i5 = 2;
        } else if (!z5) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i5));
    }

    @Override // ft.im
    public int g3() {
        r3();
        int iVd = vd();
        if (iVd == -1) {
            return 0;
        }
        return iVd;
    }

    public final void gd(int i, int i5) {
        for (int i8 = i5 - 1; i8 >= i; i8--) {
            this.f4712xc.remove(i8);
        }
        this.f4692k5 = this.f4692k5.y(i, i5);
    }

    @Override // ft.co
    public int getAudioSessionId() {
        r3();
        return this.ct;
    }

    @Override // ft.im
    public long getCurrentPosition() {
        r3();
        return v0.ut.gf(ux(this.f4701rb));
    }

    @Override // ft.im
    public long getDuration() {
        r3();
        if (!i9()) {
            return z();
        }
        fc fcVar = this.f4701rb;
        mg.n3 n3Var = fcVar.n3;
        fcVar.y.t(n3Var.y, this.f4709wz);
        return v0.ut.gf(this.f4709wz.v(n3Var.n3, n3Var.zn));
    }

    @Override // ft.im
    public float getVolume() {
        r3();
        return this.rs;
    }

    public final List<ne.zn> gi(int i, List<ur.mg> list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            ne.zn znVar = new ne.zn(list.get(i5), this.w);
            arrayList.add(znVar);
            this.f4712xc.add(i5 + i, new v(znVar.n3, znVar.y.vp()));
        }
        this.f4692k5 = this.f4692k5.a(i, arrayList.size());
        return arrayList;
    }

    public final void gm(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        jf(surface);
        this.f4707ut = surface;
    }

    @Override // ft.im
    public void gv(final int i) {
        r3();
        if (this.f4678d != i) {
            this.f4678d = i;
            this.f4682f.cs(i);
            this.f4703t.c5(8, new z.y() { // from class: ft.j5
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onRepeatModeChanged(i);
                }
            });
            fm();
            this.f4703t.a();
        }
    }

    public final xq hb() {
        return new ia(this.f4712xc, this.f4692k5);
    }

    public final int hf(int i) {
        AudioTrack audioTrack = this.j;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.j.release();
            this.j = null;
        }
        if (this.j == null) {
            this.j = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.j.getAudioSessionId();
    }

    @Override // ft.im
    public n0.z6 hw() {
        r3();
        return this.f4702s.v();
    }

    @Override // ft.im
    public boolean i9() {
        r3();
        return this.f4701rb.n3.n3();
    }

    public final /* synthetic */ void ih(im.gv gvVar) {
        gvVar.onAvailableCommandsChanged(this.vl);
    }

    public final void ik(boolean z) {
        v0.ej ejVar = this.f4679e;
        if (ejVar != null) {
            if (z && !this.s8) {
                ejVar.y(0);
                this.s8 = true;
            } else {
                if (z || !this.s8) {
                    return;
                }
                ejVar.zn(0);
                this.s8 = false;
            }
        }
    }

    @Override // ft.co
    public void j() {
        r3();
        t3(new mn.c(0, 0.0f));
    }

    public final long ja(xq xqVar, mg.n3 n3Var, long j) {
        xqVar.t(n3Var.y, this.f4709wz);
        return j + this.f4709wz.p();
    }

    public final void jf(@Nullable Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        hk[] hkVarArr = this.f4683fb;
        int length = hkVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            hk hkVar = hkVarArr[i];
            if (hkVar.s() == 2) {
                arrayList.add(vb(hkVar).wz(1).tl(obj).t());
            }
            i++;
        }
        Object obj2 = this.oz;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).y(this.f4704ta);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.oz;
            Surface surface = this.f4707ut;
            if (obj3 == surface) {
                surface.release();
                this.f4707ut = null;
            }
        }
        this.oz = obj;
        if (z) {
            mf(false, p.n(new g3(3), 1003));
        }
    }

    @Override // ft.co
    public int jz() {
        r3();
        return this.f4683fb.length;
    }

    @Override // ft.im
    public boolean k() {
        r3();
        return this.f4701rb.f4751t;
    }

    @Override // ft.im
    public int k5() {
        r3();
        return this.f4701rb.f4752tl;
    }

    @Override // ft.im
    public void kp(im.gv gvVar) {
        r3();
        this.f4703t.f((im.gv) v0.y.v(gvVar));
    }

    public final im.v ks(long j) {
        Object obj;
        xb xbVar;
        Object obj2;
        int iA;
        int iG3 = g3();
        if (this.f4701rb.y.r()) {
            obj = null;
            xbVar = null;
            obj2 = null;
            iA = -1;
        } else {
            fc fcVar = this.f4701rb;
            Object obj3 = fcVar.n3.y;
            fcVar.y.t(obj3, this.f4709wz);
            iA = this.f4701rb.y.a(obj3);
            obj2 = obj3;
            obj = this.f4701rb.y.mt(iG3, this.y).y;
            xbVar = this.y.f5162fb;
        }
        long jGf = v0.ut.gf(j);
        long jGf2 = this.f4701rb.n3.n3() ? v0.ut.gf(hj(this.f4701rb)) : jGf;
        mg.n3 n3Var = this.f4701rb.n3;
        return new im.v(obj, iG3, xbVar, obj2, iA, jGf, jGf2, n3Var.n3, n3Var.zn);
    }

    public final qj l0() {
        xq xqVarYt = yt();
        if (xqVarYt.r()) {
            return this.f4693kp;
        }
        return this.f4693kp.n3().a8(xqVarYt.mt(g3(), this.y).f5162fb.f5075f).ej();
    }

    @Override // ft.im
    public void lc(final n0.z6 z6Var) {
        r3();
        if (!this.f4702s.s() || z6Var.equals(this.f4702s.v())) {
            return;
        }
        this.f4702s.tl(z6Var);
        this.f4703t.t(19, new z.y() { // from class: ft.hw
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((im.gv) obj).onTrackSelectionParametersChanged(z6Var);
            }
        });
    }

    @Override // ft.im
    public void m(@Nullable SurfaceView surfaceView) {
        r3();
        wo(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final void m5(List<ur.mg> list, int i, long j, boolean z) {
        int iV;
        long j4;
        int iVd = vd();
        long currentPosition = getCurrentPosition();
        this.f4681ej++;
        if (!this.f4712xc.isEmpty()) {
            gd(0, this.f4712xc.size());
        }
        List<ne.zn> listGi = gi(0, list);
        xq xqVarHb = hb();
        if (!xqVarHb.r() && i >= xqVarHb.z()) {
            throw new pz(xqVarHb, i, j);
        }
        if (z) {
            j4 = -9223372036854775807L;
            iV = xqVarHb.v(this.f4716z6);
        } else if (i == -1) {
            iV = iVd;
            j4 = currentPosition;
        } else {
            iV = i;
            j4 = j;
        }
        fc fcVarWv = wv(this.f4701rb, xqVarHb, rk(xqVarHb, iV, j4));
        int i5 = fcVarWv.f4753v;
        if (iV != -1 && i5 != 1) {
            i5 = (xqVarHb.r() || iV >= xqVarHb.z()) ? 4 : 2;
        }
        fc fcVarFb = fcVarWv.fb(i5);
        this.f4682f.oa(listGi, iV, v0.ut.xb(j4), this.f4692k5);
        p4(fcVarFb, 0, 1, false, (this.f4701rb.n3.y.equals(fcVarFb.n3.y) || this.f4701rb.y.r()) ? false : true, 4, ux(fcVarFb), -1, false);
    }

    public final void mf(boolean z, @Nullable p pVar) {
        fc fcVarN3;
        if (z) {
            fcVarN3 = cp(0, this.f4712xc.size()).v(null);
        } else {
            fc fcVar = this.f4701rb;
            fcVarN3 = fcVar.n3(fcVar.n3);
            fcVarN3.w = fcVarN3.f4748mt;
            fcVarN3.f4749p = 0L;
        }
        fc fcVarFb = fcVarN3.fb(1);
        if (pVar != null) {
            fcVarFb = fcVarFb.v(pVar);
        }
        fc fcVar2 = fcVarFb;
        this.f4681ej++;
        this.f4682f.fc();
        p4(fcVar2, 0, 1, false, fcVar2.y.r() && !this.f4701rb.y.r(), 4, ux(fcVar2), -1, false);
    }

    @Override // ft.im
    public void mt(List<xb> list, boolean z) {
        r3();
        rz(ob(list), z);
    }

    @Override // ft.im
    public int n3() {
        r3();
        return this.f4701rb.f4753v;
    }

    public final void ng() {
        if (this.f4691k != null) {
            vb(this.n).wz(10000).tl(null).t();
            this.f4691k.c5(this.f3);
            this.f4691k = null;
        }
        TextureView textureView = this.en;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f3) {
                v0.r.c5("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.en.setSurfaceTextureListener(null);
            }
            this.en = null;
        }
        SurfaceHolder surfaceHolder = this.q9;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f3);
            this.q9 = null;
        }
    }

    public final void ni() {
        int iN3 = n3();
        if (iN3 != 1) {
            if (iN3 == 2 || iN3 == 3) {
                this.rz.n3(k() && !sx());
                this.mg.n3(k());
                return;
            } else if (iN3 != 4) {
                throw new IllegalStateException();
            }
        }
        this.rz.n3(false);
        this.mg.n3(false);
    }

    @Override // ft.co
    public int o(int i) {
        r3();
        return this.f4683fb[i].s();
    }

    @Override // ft.v
    public void o0(int i, long j, int i5, boolean z) {
        r3();
        v0.y.y(i >= 0);
        this.f4696mt.rz();
        xq xqVar = this.f4701rb.y;
        if (xqVar.r() || i < xqVar.z()) {
            this.f4681ej++;
            if (i9()) {
                v0.r.c5("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                kp.v vVar = new kp.v(this.f4701rb);
                vVar.n3(1);
                this.f4689i9.y(vVar);
                return;
            }
            int i8 = n3() != 1 ? 2 : 1;
            int iG3 = g3();
            fc fcVarWv = wv(this.f4701rb.fb(i8), xqVar, rk(xqVar, i, j));
            this.f4682f.pz(xqVar, i, v0.ut.xb(j));
            p4(fcVarWv, 0, 1, true, true, 1, ux(fcVarWv), iG3, z);
        }
    }

    public final List<ur.mg> ob(List<xb> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f4698p.y(list.get(i)));
        }
        return arrayList;
    }

    public final void op(SurfaceHolder surfaceHolder) {
        this.f7 = false;
        this.q9 = surfaceHolder;
        surfaceHolder.addCallback(this.f3);
        Surface surface = this.q9.getSurface();
        if (surface == null || !surface.isValid()) {
            bx(0, 0);
        } else {
            Rect surfaceFrame = this.q9.getSurfaceFrame();
            bx(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void p4(final fc fcVar, final int i, final int i5, boolean z, boolean z5, final int i8, long j, int i10, boolean z7) {
        fc fcVar2 = this.f4701rb;
        this.f4701rb = fcVar;
        boolean zEquals = fcVar2.y.equals(fcVar.y);
        Pair<Boolean, Integer> pairFq = fq(fcVar, fcVar2, z5, i8, !zEquals, z7);
        boolean zBooleanValue = ((Boolean) pairFq.first).booleanValue();
        final int iIntValue = ((Integer) pairFq.second).intValue();
        qj qjVarL0 = this.f4687hw;
        if (zBooleanValue) {
            xbVar = fcVar.y.r() ? null : fcVar.y.mt(fcVar.y.t(fcVar.n3.y, this.f4709wz).f5172fb, this.y).f5162fb;
            this.f4693kp = qj.xg;
        }
        if (zBooleanValue || !fcVar2.f4747i9.equals(fcVar.f4747i9)) {
            this.f4693kp = this.f4693kp.n3().b(fcVar.f4747i9).ej();
            qjVarL0 = l0();
        }
        boolean zEquals2 = qjVarL0.equals(this.f4687hw);
        this.f4687hw = qjVarL0;
        boolean z8 = fcVar2.f4751t != fcVar.f4751t;
        boolean z9 = fcVar2.f4753v != fcVar.f4753v;
        if (z9 || z8) {
            ni();
        }
        boolean z10 = fcVar2.f4745fb;
        boolean z11 = fcVar.f4745fb;
        boolean z12 = z10 != z11;
        if (z12) {
            ik(z11);
        }
        if (!zEquals) {
            this.f4703t.c5(0, new z.y() { // from class: ft.q9
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.jm(fcVar, i, (im.gv) obj);
                }
            });
        }
        if (z5) {
            final im.v vVarFp = fp(i8, fcVar2, i10);
            final im.v vVarKs = ks(j);
            this.f4703t.c5(11, new z.y() { // from class: ft.y5
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.mq(i8, vVarFp, vVarKs, (im.gv) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f4703t.c5(1, new z.y() { // from class: ft.xg
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onMediaItemTransition(xbVar, iIntValue);
                }
            });
        }
        if (fcVar2.f4742a != fcVar.f4742a) {
            this.f4703t.c5(10, new z.y() { // from class: ft.d
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.mc(fcVar, (im.gv) obj);
                }
            });
            if (fcVar.f4742a != null) {
                this.f4703t.c5(10, new z.y() { // from class: ft.z6
                    @Override // v0.z.y
                    public final void invoke(Object obj) {
                        dm.ez(fcVar, (im.gv) obj);
                    }
                });
            }
        }
        n0.a8 a8Var = fcVar2.f4743c5;
        n0.a8 a8Var2 = fcVar.f4743c5;
        if (a8Var != a8Var2) {
            this.f4702s.c5(a8Var2.f6747v);
            this.f4703t.c5(2, new z.y() { // from class: ft.ej
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.wb(fcVar, (im.gv) obj);
                }
            });
        }
        if (!zEquals2) {
            final qj qjVar = this.f4687hw;
            this.f4703t.c5(14, new z.y() { // from class: ft.ud
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onMediaMetadataChanged(qjVar);
                }
            });
        }
        if (z12) {
            this.f4703t.c5(3, new z.y() { // from class: ft.a8
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.t7(fcVar, (im.gv) obj);
                }
            });
        }
        if (z9 || z8) {
            this.f4703t.c5(-1, new z.y() { // from class: ft.x
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.p2(fcVar, (im.gv) obj);
                }
            });
        }
        if (z9) {
            this.f4703t.c5(4, new z.y() { // from class: ft.b
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.iu(fcVar, (im.gv) obj);
                }
            });
        }
        if (z8) {
            this.f4703t.c5(5, new z.y() { // from class: ft.k
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.cw(fcVar, i5, (im.gv) obj);
                }
            });
        }
        if (fcVar2.f4752tl != fcVar.f4752tl) {
            this.f4703t.c5(6, new z.y() { // from class: ft.f7
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.nz(fcVar, (im.gv) obj);
                }
            });
        }
        if (w7(fcVar2) != w7(fcVar)) {
            this.f4703t.c5(7, new z.y() { // from class: ft.en
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.l8(fcVar, (im.gv) obj);
                }
            });
        }
        if (!fcVar2.f4754wz.equals(fcVar.f4754wz)) {
            this.f4703t.c5(12, new z.y() { // from class: ft.jz
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.xh(fcVar, (im.gv) obj);
                }
            });
        }
        if (z) {
            this.f4703t.c5(-1, new z.y() { // from class: ft.u
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    ((im.gv) obj).onSeekProcessed();
                }
            });
        }
        fm();
        this.f4703t.a();
        if (fcVar2.f4755xc != fcVar.f4755xc) {
            Iterator<co.y> it = this.f4705tl.iterator();
            while (it.hasNext()) {
                it.next().d0(fcVar.f4755xc);
            }
        }
    }

    @Override // ft.im
    public long pq() {
        r3();
        return this.f4699r;
    }

    @Override // ft.im
    public void prepare() {
        r3();
        boolean zK = k();
        int iW = this.d0.w(zK, 2);
        w5(zK, iW, rt(zK, iW));
        fc fcVar = this.f4701rb;
        if (fcVar.f4753v != 1) {
            return;
        }
        fc fcVarV = fcVar.v(null);
        fc fcVarFb = fcVarV.fb(fcVarV.y.r() ? 4 : 2);
        this.f4681ej++;
        this.f4682f.eb();
        p4(fcVarFb, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // ft.im
    public qj pz() {
        r3();
        return this.f4687hw;
    }

    @Override // ft.im
    public im.n3 q9() {
        r3();
        return this.vl;
    }

    @Override // ft.im
    public void qn(@Nullable TextureView textureView) {
        r3();
        if (textureView == null) {
            ra();
            return;
        }
        ng();
        this.en = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            v0.r.c5("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f3);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            jf(null);
            bx(0, 0);
        } else {
            gm(surfaceTexture);
            bx(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final void r3() {
        this.f4686gv.zn();
        if (Thread.currentThread() != vl().getThread()) {
            String strRz = v0.ut.rz("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), vl().getThread().getName());
            if (this.f4697nf) {
                throw new IllegalStateException(strRz);
            }
            v0.r.i9("ExoPlayerImpl", strRz, this.f4700ra ? null : new IllegalStateException());
            this.f4700ra = true;
        }
    }

    @Override // ft.im
    public void ra() {
        r3();
        ng();
        jf(null);
        bx(0, 0);
    }

    @Override // ft.co
    public boolean rb() {
        r3();
        return this.f4680eb;
    }

    @Override // ft.im
    public void release() {
        AudioTrack audioTrack;
        v0.r.a("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + v0.ut.f8766v + "] [" + rb.n3() + "]");
        r3();
        if (v0.ut.y < 21 && (audioTrack = this.j) != null) {
            audioTrack.release();
            this.j = null;
        }
        this.c.n3(false);
        this.fh.fb();
        this.rz.n3(false);
        this.mg.n3(false);
        this.d0.c5();
        if (!this.f4682f.nf()) {
            this.f4703t.t(10, new z.y() { // from class: ft.ta
                @Override // v0.z.y
                public final void invoke(Object obj) {
                    dm.yh((im.gv) obj);
                }
            });
        }
        this.f4703t.i9();
        this.f4676c5.a(null);
        this.z.zn(this.f4696mt);
        fc fcVarFb = this.f4701rb.fb(1);
        this.f4701rb = fcVarFb;
        fc fcVarN3 = fcVarFb.n3(fcVarFb.n3);
        this.f4701rb = fcVarN3;
        fcVarN3.w = fcVarN3.f4748mt;
        this.f4701rb.f4749p = 0L;
        this.f4696mt.release();
        this.f4702s.i9();
        ng();
        Surface surface = this.f4707ut;
        if (surface != null) {
            surface.release();
            this.f4707ut = null;
        }
        if (this.s8) {
            ((v0.ej) v0.y.v(this.f4679e)).zn(0);
            this.s8 = false;
        }
        this.f4694lc = b0.a.f1185fb;
        this.f4674ap = true;
    }

    @Nullable
    public final Pair<Object, Long> rk(xq xqVar, int i, long j) {
        if (xqVar.r()) {
            this.f4685g3 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f4684g = j;
            this.f4695m = 0;
            return null;
        }
        if (i == -1 || i >= xqVar.z()) {
            i = xqVar.v(this.f4716z6);
            j = xqVar.mt(i, this.y).gv();
        }
        return xqVar.wz(this.y, this.f4709wz, i, v0.ut.xb(j));
    }

    @Override // ft.im
    public int rs() {
        r3();
        if (i9()) {
            return this.f4701rb.n3.zn;
        }
        return -1;
    }

    @Override // ft.co
    public void rz(List<ur.mg> list, boolean z) {
        r3();
        m5(list, -1, -9223372036854775807L, z);
    }

    @Override // ft.co
    public void s(final boolean z) {
        r3();
        if (this.f4680eb == z) {
            return;
        }
        this.f4680eb = z;
        y0(1, 9, Boolean.valueOf(z));
        this.f4703t.t(23, new z.y() { // from class: ft.j
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((im.gv) obj).onSkipSilenceEnabledChanged(z);
            }
        });
    }

    @Override // ft.im
    public long s8() {
        r3();
        return this.f4711x4;
    }

    @Override // ft.im
    public void setVolume(float f3) {
        r3();
        final float fW = v0.ut.w(f3, 0.0f, 1.0f);
        if (this.rs == fW) {
            return;
        }
        this.rs = fW;
        t6();
        this.f4703t.t(22, new z.y() { // from class: ft.k5
            @Override // v0.z.y
            public final void invoke(Object obj) {
                ((im.gv) obj).onVolumeChanged(fW);
            }
        });
    }

    /* JADX INFO: renamed from: sh, reason: merged with bridge method [inline-methods] */
    public final void l3(kp.v vVar) {
        long j;
        boolean z;
        long jJa;
        int i = this.f4681ej - vVar.zn;
        this.f4681ej = i;
        boolean z5 = true;
        if (vVar.f4922gv) {
            this.f4706ud = vVar.f4923v;
            this.f4673a8 = true;
        }
        if (vVar.f4920a) {
            this.f4710x = vVar.f4921fb;
        }
        if (i == 0) {
            xq xqVar = vVar.n3.y;
            if (!this.f4701rb.y.r() && xqVar.r()) {
                this.f4685g3 = -1;
                this.f4684g = 0L;
                this.f4695m = 0;
            }
            if (!xqVar.r()) {
                List<xq> listUd = ((ia) xqVar).ud();
                v0.y.fb(listUd.size() == this.f4712xc.size());
                for (int i5 = 0; i5 < listUd.size(); i5++) {
                    this.f4712xc.get(i5).n3 = listUd.get(i5);
                }
            }
            if (this.f4673a8) {
                if (vVar.n3.n3.equals(this.f4701rb.n3) && vVar.n3.f4746gv == this.f4701rb.f4748mt) {
                    z5 = false;
                }
                if (z5) {
                    if (xqVar.r() || vVar.n3.n3.n3()) {
                        jJa = vVar.n3.f4746gv;
                    } else {
                        fc fcVar = vVar.n3;
                        jJa = ja(xqVar, fcVar.n3, fcVar.f4746gv);
                    }
                    j = jJa;
                } else {
                    j = -9223372036854775807L;
                }
                z = z5;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f4673a8 = false;
            p4(vVar.n3, 1, this.f4710x, false, z, this.f4706ud, j, -1, false);
        }
    }

    @Override // ft.im
    public void stop() {
        r3();
        en(false);
    }

    public boolean sx() {
        r3();
        return this.f4701rb.f4755xc;
    }

    @Override // ft.im
    public long t() {
        r3();
        return v0.ut.gf(this.f4701rb.f4749p);
    }

    public void t3(mn.c cVar) {
        r3();
        y0(1, 6, cVar);
    }

    @Nullable
    public final Pair<Object, Long> t5(xq xqVar, xq xqVar2) {
        long jAp = ap();
        if (xqVar.r() || xqVar2.r()) {
            boolean z = !xqVar.r() && xqVar2.r();
            int iVd = z ? -1 : vd();
            if (z) {
                jAp = -9223372036854775807L;
            }
            return rk(xqVar2, iVd, jAp);
        }
        Pair<Object, Long> pairWz = xqVar.wz(this.y, this.f4709wz, g3(), v0.ut.xb(jAp));
        Object obj = ((Pair) v0.ut.i9(pairWz)).first;
        if (xqVar2.a(obj) != -1) {
            return pairWz;
        }
        Object objY4 = kp.y4(this.y, this.f4709wz, this.f4678d, this.f4716z6, obj, xqVar, xqVar2);
        if (objY4 == null) {
            return rk(xqVar2, -1, -9223372036854775807L);
        }
        xqVar2.t(objY4, this.f4709wz);
        int i = this.f4709wz.f5172fb;
        return rk(xqVar2, i, xqVar2.mt(i, this.y).gv());
    }

    public final void t6() {
        y0(1, 2, Float.valueOf(this.rs * this.d0.fb()));
    }

    @Override // ft.co
    public void ta(zo.zn znVar) {
        r3();
        this.f4696mt.qn((zo.zn) v0.y.v(znVar));
    }

    @Override // ft.co
    public void tl(@Nullable p1 p1Var) {
        r3();
        if (p1Var == null) {
            p1Var = p1.f4973fb;
        }
        if (this.f4675b.equals(p1Var)) {
            return;
        }
        this.f4675b = p1Var;
        this.f4682f.ix(p1Var);
    }

    @Override // ft.im
    public long u() {
        r3();
        return 3000L;
    }

    @Override // ft.im
    public boolean u0() {
        r3();
        return this.f4716z6;
    }

    public final long ux(fc fcVar) {
        return fcVar.y.r() ? v0.ut.xb(this.f4684g) : fcVar.n3.n3() ? fcVar.f4748mt : ja(fcVar.y, fcVar.n3, fcVar.f4748mt);
    }

    @Override // ft.im
    public uo v() {
        r3();
        return this.f4701rb.f4754wz;
    }

    public void v1(co.y yVar) {
        this.f4705tl.add(yVar);
    }

    public final h vb(h.n3 n3Var) {
        int iVd = vd();
        kp kpVar = this.f4682f;
        return new h(kpVar, n3Var, this.f4701rb.y, iVd == -1 ? 0 : iVd, this.f4688i4, kpVar.fh());
    }

    public final int vd() {
        if (this.f4701rb.y.r()) {
            return this.f4685g3;
        }
        fc fcVar = this.f4701rb;
        return fcVar.y.t(fcVar.n3.y, this.f4709wz).f5172fb;
    }

    public final /* synthetic */ void vi(im.gv gvVar, v0.wz wzVar) {
        gvVar.onEvents(this.f4672a, new im.zn(wzVar));
    }

    @Override // ft.im
    public Looper vl() {
        return this.f4677co;
    }

    @Override // ft.co
    public n0.ud w() {
        r3();
        return this.f4702s;
    }

    public final void w5(boolean z, int i, int i5) {
        int i8 = 0;
        boolean z5 = z && i != -1;
        if (z5 && i != 1) {
            i8 = 1;
        }
        fc fcVar = this.f4701rb;
        if (fcVar.f4751t == z5 && fcVar.f4752tl == i8) {
            return;
        }
        this.f4681ej++;
        fc fcVarGv = fcVar.gv(z5, i8);
        this.f4682f.x5(z5, i8);
        p4(fcVarGv, 0, i5, false, false, 5, -9223372036854775807L, -1, false);
    }

    public void wo(@Nullable SurfaceHolder surfaceHolder) {
        r3();
        if (surfaceHolder == null || surfaceHolder != this.q9) {
            return;
        }
        ra();
    }

    public final fc wv(fc fcVar, xq xqVar, @Nullable Pair<Object, Long> pair) {
        v0.y.y(xqVar.r() || pair != null);
        xq xqVar2 = fcVar.y;
        fc fcVarC5 = fcVar.c5(xqVar);
        if (xqVar.r()) {
            mg.n3 n3VarF = fc.f();
            long jXb = v0.ut.xb(this.f4684g);
            fc fcVarN3 = fcVarC5.zn(n3VarF, jXb, jXb, jXb, 0L, ur.lc.f8604s, this.n3, k4.r.yt()).n3(n3VarF);
            fcVarN3.w = fcVarN3.f4748mt;
            return fcVarN3;
        }
        Object obj = fcVarC5.n3.y;
        boolean zEquals = obj.equals(((Pair) v0.ut.i9(pair)).first);
        mg.n3 n3Var = !zEquals ? new mg.n3(pair.first) : fcVarC5.n3;
        long jLongValue = ((Long) pair.second).longValue();
        long jXb2 = v0.ut.xb(ap());
        if (!xqVar2.r()) {
            jXb2 -= xqVar2.t(obj, this.f4709wz).p();
        }
        if (!zEquals || jLongValue < jXb2) {
            v0.y.fb(!n3Var.n3());
            fc fcVarN32 = fcVarC5.zn(n3Var, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? ur.lc.f8604s : fcVarC5.f4750s, !zEquals ? this.n3 : fcVarC5.f4743c5, !zEquals ? k4.r.yt() : fcVarC5.f4747i9).n3(n3Var);
            fcVarN32.w = jLongValue;
            return fcVarN32;
        }
        if (jLongValue == jXb2) {
            int iA = xqVar.a(fcVarC5.f4744f.y);
            if (iA == -1 || xqVar.i9(iA, this.f4709wz).f5172fb != xqVar.t(n3Var.y, this.f4709wz).f5172fb) {
                xqVar.t(n3Var.y, this.f4709wz);
                long jV = n3Var.n3() ? this.f4709wz.v(n3Var.n3, n3Var.zn) : this.f4709wz.f5173s;
                fcVarC5 = fcVarC5.zn(n3Var, fcVarC5.f4748mt, fcVarC5.f4748mt, fcVarC5.f4746gv, jV - fcVarC5.f4748mt, fcVarC5.f4750s, fcVarC5.f4743c5, fcVarC5.f4747i9).n3(n3Var);
                fcVarC5.w = jV;
            }
        } else {
            v0.y.fb(!n3Var.n3());
            long jMax = Math.max(0L, fcVarC5.f4749p - (jLongValue - jXb2));
            long j = fcVarC5.w;
            if (fcVarC5.f4744f.equals(fcVarC5.n3)) {
                j = jLongValue + jMax;
            }
            fcVarC5 = fcVarC5.zn(n3Var, jLongValue, jLongValue, jLongValue, jMax, fcVarC5.f4750s, fcVarC5.f4743c5, fcVarC5.f4747i9);
            fcVarC5.w = j;
        }
        return fcVarC5;
    }

    public void x2(@Nullable SurfaceHolder surfaceHolder) {
        r3();
        if (surfaceHolder == null) {
            ra();
            return;
        }
        ng();
        this.f7 = true;
        this.q9 = surfaceHolder;
        surfaceHolder.addCallback(this.f3);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            jf(null);
            bx(0, 0);
        } else {
            jf(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            bx(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // ft.im
    public void x4(int i, int i5) {
        r3();
        v0.y.y(i >= 0 && i5 >= i);
        int size = this.f4712xc.size();
        int iMin = Math.min(i5, size);
        if (i >= size || i == iMin) {
            return;
        }
        fc fcVarCp = cp(i, iMin);
        p4(fcVarCp, 0, 1, false, !fcVarCp.n3.y.equals(this.f4701rb.n3.y), 4, ux(fcVarCp), -1, false);
    }

    @Override // ft.im
    public void xg(@Nullable TextureView textureView) {
        r3();
        if (textureView == null || textureView != this.en) {
            return;
        }
        ra();
    }

    @Override // ft.im
    public boolean y() {
        r3();
        return this.f4701rb.f4745fb;
    }

    public final void y0(int i, int i5, @Nullable Object obj) {
        for (hk hkVar : this.f4683fb) {
            if (hkVar.s() == i) {
                vb(hkVar).wz(i5).tl(obj).t();
            }
        }
    }

    @Override // ft.im
    public int y5() {
        r3();
        if (this.f4701rb.y.r()) {
            return this.f4695m;
        }
        fc fcVar = this.f4701rb;
        return fcVar.y.a(fcVar.n3.y);
    }

    @Override // ft.im
    public long yg() {
        r3();
        if (!i9()) {
            return bk();
        }
        fc fcVar = this.f4701rb;
        return fcVar.f4744f.equals(fcVar.n3) ? v0.ut.gf(this.f4701rb.w) : getDuration();
    }

    @Override // ft.im
    public xq yt() {
        r3();
        return this.f4701rb.y;
    }

    @Override // ft.im
    public int z6() {
        r3();
        if (i9()) {
            return this.f4701rb.n3.n3;
        }
        return -1;
    }

    @Override // ft.im
    public void zn(uo uoVar) {
        r3();
        if (uoVar == null) {
            uoVar = uo.f5058s;
        }
        if (this.f4701rb.f4754wz.equals(uoVar)) {
            return;
        }
        fc fcVarA = this.f4701rb.a(uoVar);
        this.f4681ej++;
        this.f4682f.mp(uoVar);
        p4(fcVarA, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    public void zx(int i, List<ur.mg> list) {
        r3();
        v0.y.y(i >= 0);
        int iMin = Math.min(i, this.f4712xc.size());
        xq xqVarYt = yt();
        this.f4681ej++;
        List<ne.zn> listGi = gi(iMin, list);
        xq xqVarHb = hb();
        fc fcVarWv = wv(this.f4701rb, xqVarHb, t5(xqVarYt, xqVarHb));
        this.f4682f.i9(iMin, listGi, this.f4692k5);
        p4(fcVarWv, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // ft.im
    @Nullable
    public p a() {
        r3();
        return this.f4701rb.f4742a;
    }
}

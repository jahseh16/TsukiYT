package ur;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import b1.fh;
import com.google.protobuf.Reader;
import ft.g;
import ft.xb;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r0.r;
import r0.tl;
import ur.dm;
import ur.mg;
import ur.oz;

/* JADX INFO: loaded from: classes.dex */
public final class co implements mg.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8482a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f8483c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f8484fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public r0.mg f8485gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public boolean f8486i9;
    public tl.y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8487s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8488v;
    public final y y;

    @Nullable
    public mg.y zn;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public v5.r f8489a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public r0.mg f8490fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public tl.y f8492v;
        public final b1.mt y;
        public final Map<Integer, g4.r<mg.y>> n3 = new HashMap();
        public final Set<Integer> zn = new HashSet();

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Map<Integer, mg.y> f8491gv = new HashMap();

        public y(b1.mt mtVar) {
            this.y = mtVar;
        }

        @Nullable
        public mg.y a(int i) {
            mg.y yVar = this.f8491gv.get(Integer.valueOf(i));
            if (yVar != null) {
                return yVar;
            }
            g4.r<mg.y> rVarT = t(i);
            if (rVarT == null) {
                return null;
            }
            mg.y yVar2 = rVarT.get();
            v5.r rVar = this.f8489a;
            if (rVar != null) {
                yVar2.n3(rVar);
            }
            r0.mg mgVar = this.f8490fb;
            if (mgVar != null) {
                yVar2.zn(mgVar);
            }
            this.f8491gv.put(Integer.valueOf(i), yVar2);
            return yVar2;
        }

        public final /* synthetic */ mg.y f(tl.y yVar) {
            return new oz.n3(yVar, this.y);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
        @androidx.annotation.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final g4.r<ur.mg.y> t(int r5) {
            /*
                r4 = this;
                java.util.Map<java.lang.Integer, g4.r<ur.mg$y>> r0 = r4.n3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L19
                java.util.Map<java.lang.Integer, g4.r<ur.mg$y>> r0 = r4.n3
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                g4.r r5 = (g4.r) r5
                return r5
            L19:
                r0.tl$y r0 = r4.f8492v
                java.lang.Object r0 = v0.y.v(r0)
                r0.tl$y r0 = (r0.tl.y) r0
                java.lang.Class<ur.mg$y> r1 = ur.mg.y.class
                r2 = 0
                if (r5 == 0) goto L69
                r3 = 1
                if (r5 == r3) goto L59
                r3 = 2
                if (r5 == r3) goto L4c
                r3 = 3
                if (r5 == r3) goto L3c
                r1 = 4
                if (r5 == r1) goto L33
                goto L75
            L33:
                ur.mt r1 = new ur.mt     // Catch: java.lang.ClassNotFoundException -> L3a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
            L38:
                r2 = r1
                goto L75
            L3a:
                goto L75
            L3c:
                java.lang.String r0 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3a
                java.lang.Class r0 = r0.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                ur.p r1 = new ur.p     // Catch: java.lang.ClassNotFoundException -> L3a
                r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L38
            L4c:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r3 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                ur.w r3 = new ur.w     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
            L57:
                r2 = r3
                goto L75
            L59:
                java.lang.String r3 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L3a
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                ur.xc r3 = new ur.xc     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L57
            L69:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r1 = r3.asSubclass(r1)     // Catch: java.lang.ClassNotFoundException -> L3a
                ur.wz r3 = new ur.wz     // Catch: java.lang.ClassNotFoundException -> L3a
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L3a
                goto L57
            L75:
                java.util.Map<java.lang.Integer, g4.r<ur.mg$y>> r0 = r4.n3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                r0.put(r1, r2)
                if (r2 == 0) goto L89
                java.util.Set<java.lang.Integer> r0 = r4.zn
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L89:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ur.co.y.t(int):g4.r");
        }

        public void tl(tl.y yVar) {
            if (yVar != this.f8492v) {
                this.f8492v = yVar;
                this.n3.clear();
                this.f8491gv.clear();
            }
        }

        public void wz(v5.r rVar) {
            this.f8489a = rVar;
            Iterator<mg.y> it = this.f8491gv.values().iterator();
            while (it.hasNext()) {
                it.next().n3(rVar);
            }
        }

        public void xc(r0.mg mgVar) {
            this.f8490fb = mgVar;
            Iterator<mg.y> it = this.f8491gv.values().iterator();
            while (it.hasNext()) {
                it.next().zn(mgVar);
            }
        }
    }

    public co(Context context, b1.mt mtVar) {
        this(new r.y(context), mtVar);
    }

    public static mg.y f(Class<? extends mg.y> cls, tl.y yVar) {
        try {
            return cls.getConstructor(tl.y.class).newInstance(yVar);
        } catch (Exception e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static /* synthetic */ b1.t[] fb(g gVar) {
        b0.t tVar = b0.t.y;
        return new b1.t[]{tVar.n3(gVar) ? new b0.tl(tVar.zn(gVar), gVar) : new n3(gVar)};
    }

    public static mg.y i9(Class<? extends mg.y> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static mg s(xb xbVar, mg mgVar) {
        xb.gv gvVar = xbVar.f5079t;
        if (gvVar.y == 0 && gvVar.f5111v == Long.MIN_VALUE && !gvVar.f5110s) {
            return mgVar;
        }
        long jXb = v0.ut.xb(xbVar.f5079t.y);
        long jXb2 = v0.ut.xb(xbVar.f5079t.f5111v);
        xb.gv gvVar2 = xbVar.f5079t;
        return new v(mgVar, jXb, jXb2, !gvVar2.f5108f, gvVar2.f5109fb, gvVar2.f5110s);
    }

    public final mg c5(xb xbVar, mg mgVar) {
        v0.y.v(xbVar.f5080v);
        xbVar.f5080v.getClass();
        return mgVar;
    }

    @Override // ur.mg.y
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public co n3(v5.r rVar) {
        this.y.wz((v5.r) v0.y.a(rVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // ur.mg.y
    /* JADX INFO: renamed from: tl, reason: merged with bridge method [inline-methods] */
    public co zn(r0.mg mgVar) {
        this.f8485gv = (r0.mg) v0.y.a(mgVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.y.xc(mgVar);
        return this;
    }

    @Override // ur.mg.y
    public mg y(xb xbVar) {
        v0.y.v(xbVar.f5080v);
        String scheme = xbVar.f5080v.y.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((mg.y) v0.y.v(this.zn)).y(xbVar);
        }
        xb.s sVar = xbVar.f5080v;
        int iKp = v0.ut.kp(sVar.y, sVar.n3);
        mg.y yVarA = this.y.a(iKp);
        v0.y.i9(yVarA, "No suitable media source factory found for content type: " + iKp);
        xb.fb.y yVarN3 = xbVar.f5078s.n3();
        if (xbVar.f5078s.y == -9223372036854775807L) {
            yVarN3.f(this.f8488v);
        }
        if (xbVar.f5078s.f5100s == -3.4028235E38f) {
            yVarN3.i9(this.f8487s);
        }
        if (xbVar.f5078s.f5098f == -3.4028235E38f) {
            yVarN3.s(this.f8483c5);
        }
        if (xbVar.f5078s.f5101v == -9223372036854775807L) {
            yVarN3.c5(this.f8482a);
        }
        if (xbVar.f5078s.f5099fb == -9223372036854775807L) {
            yVarN3.fb(this.f8484fb);
        }
        xb.fb fbVarA = yVarN3.a();
        if (!fbVarA.equals(xbVar.f5078s)) {
            xbVar = xbVar.n3().zn(fbVarA).y();
        }
        mg mgVarY = yVarA.y(xbVar);
        k4.r<xb.t> rVar = ((xb.s) v0.ut.i9(xbVar.f5080v)).f5120a;
        if (!rVar.isEmpty()) {
            mg[] mgVarArr = new mg[rVar.size() + 1];
            mgVarArr[0] = mgVarY;
            for (int i = 0; i < rVar.size(); i++) {
                if (this.f8486i9) {
                    final g gVarZ6 = new g.n3().o4(rVar.get(i).n3).k(rVar.get(i).zn).eb(rVar.get(i).f5127gv).dm(rVar.get(i).f5128v).q9(rVar.get(i).f5125a).oz(rVar.get(i).f5126fb).z6();
                    oz.n3 n3Var = new oz.n3(this.n3, new b1.mt() { // from class: ur.tl
                        @Override // b1.mt
                        public final b1.t[] createExtractors() {
                            return co.fb(gVarZ6);
                        }

                        @Override // b1.mt
                        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
                            return b1.p.y(this, uri, map);
                        }
                    });
                    r0.mg mgVar = this.f8485gv;
                    if (mgVar != null) {
                        n3Var.zn(mgVar);
                    }
                    mgVarArr[i + 1] = n3Var.y(xb.gv(rVar.get(i).y.toString()));
                } else {
                    dm.n3 n3Var2 = new dm.n3(this.n3);
                    r0.mg mgVar2 = this.f8485gv;
                    if (mgVar2 != null) {
                        n3Var2.n3(mgVar2);
                    }
                    mgVarArr[i + 1] = n3Var2.y(rVar.get(i), -9223372036854775807L);
                }
            }
            mgVarY = new yt(mgVarArr);
        }
        return c5(xbVar, s(xbVar, mgVarY));
    }

    public co(tl.y yVar, b1.mt mtVar) {
        this.n3 = yVar;
        y yVar2 = new y(mtVar);
        this.y = yVar2;
        yVar2.tl(yVar);
        this.f8488v = -9223372036854775807L;
        this.f8482a = -9223372036854775807L;
        this.f8484fb = -9223372036854775807L;
        this.f8487s = -3.4028235E38f;
        this.f8483c5 = -3.4028235E38f;
    }

    public static final class n3 implements b1.t {
        public final g y;

        public n3(g gVar) {
            this.y = gVar;
        }

        @Override // b1.t
        public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
            return tlVar.wz(Reader.READ_DONE) == -1 ? -1 : 0;
        }

        @Override // b1.t
        public boolean gv(b1.tl tlVar) {
            return true;
        }

        @Override // b1.t
        public void zn(b1.wz wzVar) {
            b1.ta taVarA = wzVar.a(0, 3);
            wzVar.z(new fh.n3(-9223372036854775807L));
            wzVar.p();
            taVarA.y(this.y.n3().o4("text/x-unknown").x(this.y.f3).z6());
        }

        @Override // b1.t
        public void release() {
        }

        @Override // b1.t
        public void y(long j, long j4) {
        }
    }
}

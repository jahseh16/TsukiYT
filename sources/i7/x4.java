package i7;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import di.fb;
import ft.g;
import ft.u0;
import i7.rz;
import i7.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import v0.j5;
import v0.ut;
import v0.vl;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public abstract class x4 extends ft.a {

    /* JADX INFO: renamed from: yk, reason: collision with root package name */
    public static final byte[] f5521yk = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public int f5522ad;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public boolean f5523ap;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final di.fb f5524b;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public int f5525bk;
    public final t.n3 c;

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    public boolean f5526cr;

    /* JADX INFO: renamed from: cs, reason: collision with root package name */
    public zn f5527cs;
    public boolean ct;
    public int cy;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5528d;
    public final f3 d0;

    @Nullable
    public MediaFormat dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5529e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    @Nullable
    public n3 f5530eb;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final di.fb f5531ej;
    public long en;
    public boolean f7;
    public final boolean fh;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public c5 f5532g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public boolean f5533g3;

    /* JADX INFO: renamed from: gq, reason: collision with root package name */
    public boolean f5534gq;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final s f5535hw;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    public boolean f5536ix;

    @Nullable
    public g j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final ArrayList<Long> f5537j5;
    public float jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public MediaCrypto f5538k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public boolean f5539kp;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5540l;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    @Nullable
    public z f5541lc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public di.v f5542le;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5543m;

    /* JADX INFO: renamed from: mp, reason: collision with root package name */
    @Nullable
    public ft.p f5544mp;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public int f5545nf;
    public final ArrayDeque<zn> o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f5546o0;
    public float o4;
    public long oa;

    @Nullable
    public g oz;
    public boolean pq;
    public boolean pz;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public boolean f5547q5;

    @Nullable
    public com.google.android.exoplayer2.drm.gv q9;

    /* JADX INFO: renamed from: qj, reason: collision with root package name */
    public boolean f5548qj;

    /* JADX INFO: renamed from: qk, reason: collision with root package name */
    public int f5549qk;
    public final MediaCodec.BufferInfo qn;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f5550ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public boolean f5551rb;

    /* JADX INFO: renamed from: ro, reason: collision with root package name */
    public long f5552ro;

    @Nullable
    public ArrayDeque<z> rs;
    public boolean s8;

    @Nullable
    public ByteBuffer tg;
    public float u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f5553u0;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.gv f5554ut;
    public long vp;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public boolean f5555w2;

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public boolean f5556w9;
    public boolean wf;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final di.fb f5557x;
    public boolean x5;
    public boolean xb;

    @Nullable
    public g xg;
    public int y4;

    @Nullable
    public t y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public boolean f5558yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public boolean f5559yg;

    public static final class y {
        public static void y(t.y yVar, gn gnVar) {
            LogSessionId logSessionIdY = gnVar.y();
            if (logSessionIdY.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            yVar.n3.setString("log-session-id", logSessionIdY.getStringId());
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final zn f5560v = new zn(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final vl<g> f5561gv = new vl<>();
        public final long n3;
        public final long y;
        public final long zn;

        public zn(long j, long j4, long j7) {
            this.y = j;
            this.n3 = j4;
            this.zn = j7;
        }
    }

    public x4(int i, t.n3 n3Var, f3 f3Var, boolean z, float f3) {
        super(i);
        this.c = n3Var;
        this.d0 = (f3) v0.y.v(f3Var);
        this.fh = z;
        this.f5528d = f3;
        this.f5531ej = di.fb.r();
        this.f5557x = new di.fb(0);
        this.f5524b = new di.fb(2);
        s sVar = new s();
        this.f5535hw = sVar;
        this.f5537j5 = new ArrayList<>();
        this.qn = new MediaCodec.BufferInfo();
        this.jz = 1.0f;
        this.u = 1.0f;
        this.en = -9223372036854775807L;
        this.o = new ArrayDeque<>();
        ne(zn.f5560v);
        sVar.mt(0);
        sVar.f3179fb.order(ByteOrder.nativeOrder());
        this.o4 = -1.0f;
        this.f5545nf = 0;
        this.f5522ad = 0;
        this.f5525bk = -1;
        this.y4 = -1;
        this.f5553u0 = -9223372036854775807L;
        this.vp = -9223372036854775807L;
        this.oa = -9223372036854775807L;
        this.f5552ro = -9223372036854775807L;
        this.cy = 0;
        this.f5549qk = 0;
    }

    public static boolean cr(IllegalStateException illegalStateException) {
        if (ut.y >= 21 && o0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean en(String str, g gVar) {
        return ut.y <= 18 && gVar.j == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean f7(String str) {
        int i = ut.y;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && ut.f8761gv.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean im(g gVar) {
        int i = gVar.u;
        return i == 0 || i == 2;
    }

    public static boolean j(String str, g gVar) {
        return ut.y < 21 && gVar.c.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean jz(String str) {
        return ut.y == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean k(z zVar) {
        String str = zVar.y;
        int i = ut.y;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(ut.zn) && "AFTS".equals(ut.f8761gv) && zVar.f5565fb));
    }

    public static boolean o0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean oz(String str) {
        if (ut.y < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(ut.zn)) {
            String str2 = ut.n3;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean q9(String str) {
        return ut.y == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean ut(String str) {
        int i = ut.y;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = ut.n3;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean xb(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    @Override // ft.hk
    public boolean a() {
        return this.f5555w2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(android.media.MediaCrypto r8, boolean r9) throws i7.x4.n3 {
        /*
            r7 = this;
            java.util.ArrayDeque<i7.z> r0 = r7.rs
            r1 = 0
            if (r0 != 0) goto L3a
            java.util.List r0 = r7.e(r9)     // Catch: i7.rz.zn -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: i7.rz.zn -> L18
            r2.<init>()     // Catch: i7.rz.zn -> L18
            r7.rs = r2     // Catch: i7.rz.zn -> L18
            boolean r3 = r7.fh     // Catch: i7.rz.zn -> L18
            if (r3 == 0) goto L1a
            r2.addAll(r0)     // Catch: i7.rz.zn -> L18
            goto L2c
        L18:
            r8 = move-exception
            goto L2f
        L1a:
            boolean r2 = r0.isEmpty()     // Catch: i7.rz.zn -> L18
            if (r2 != 0) goto L2c
            java.util.ArrayDeque<i7.z> r2 = r7.rs     // Catch: i7.rz.zn -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: i7.rz.zn -> L18
            i7.z r0 = (i7.z) r0     // Catch: i7.rz.zn -> L18
            r2.add(r0)     // Catch: i7.rz.zn -> L18
        L2c:
            r7.f5530eb = r1     // Catch: i7.rz.zn -> L18
            goto L3a
        L2f:
            i7.x4$n3 r0 = new i7.x4$n3
            ft.g r1 = r7.j
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L3a:
            java.util.ArrayDeque<i7.z> r0 = r7.rs
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb6
            java.util.ArrayDeque<i7.z> r0 = r7.rs
            java.lang.Object r0 = r0.peekFirst()
            i7.z r0 = (i7.z) r0
        L4a:
            i7.t r2 = r7.y5
            if (r2 != 0) goto Lb3
            java.util.ArrayDeque<i7.z> r2 = r7.rs
            java.lang.Object r2 = r2.peekFirst()
            i7.z r2 = (i7.z) r2
            boolean r3 = r7.bv(r2)
            if (r3 != 0) goto L5d
            return
        L5d:
            r7.pz(r2, r8)     // Catch: java.lang.Exception -> L61
            goto L4a
        L61:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L76
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            v0.r.c5(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.pz(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L4a
        L74:
            r3 = move-exception
            goto L77
        L76:
            throw r3     // Catch: java.lang.Exception -> L74
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            v0.r.i9(r4, r5, r3)
            java.util.ArrayDeque<i7.z> r4 = r7.rs
            r4.removeFirst()
            i7.x4$n3 r4 = new i7.x4$n3
            ft.g r5 = r7.j
            r4.<init>(r5, r3, r9, r2)
            r7.cy(r4)
            i7.x4$n3 r2 = r7.f5530eb
            if (r2 != 0) goto La1
            r7.f5530eb = r4
            goto La7
        La1:
            i7.x4$n3 r2 = i7.x4.n3.y(r2, r4)
            r7.f5530eb = r2
        La7:
            java.util.ArrayDeque<i7.z> r2 = r7.rs
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb0
            goto L4a
        Lb0:
            i7.x4$n3 r8 = r7.f5530eb
            throw r8
        Lb3:
            r7.rs = r1
            return
        Lb6:
            i7.x4$n3 r8 = new i7.x4$n3
            ft.g r0 = r7.j
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.x4.ad(android.media.MediaCrypto, boolean):void");
    }

    @Nullable
    public final z ap() {
        return this.f5541lc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // ft.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(ft.g[] r16, long r17, long r19) throws ft.p {
        /*
            r15 = this;
            r0 = r15
            i7.x4$zn r1 = r0.f5527cs
            long r1 = r1.zn
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            i7.x4$zn r1 = new i7.x4$zn
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.ne(r1)
            goto L68
        L21:
            java.util.ArrayDeque<i7.x4$zn> r1 = r0.o
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.vp
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.f5552ro
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            i7.x4$zn r1 = new i7.x4$zn
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.ne(r1)
            i7.x4$zn r1 = r0.f5527cs
            long r1 = r1.zn
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L68
            r15.w9()
            goto L68
        L57:
            java.util.ArrayDeque<i7.x4$zn> r1 = r0.o
            i7.x4$zn r9 = new i7.x4$zn
            long r3 = r0.vp
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.x4.b(ft.g[], long, long):void");
    }

    public boolean br(g gVar) {
        return false;
    }

    public boolean bv(z zVar) {
        return true;
    }

    public final void c8(long j) throws ft.p {
        g gVarI9 = this.f5527cs.f5561gv.i9(j);
        if (gVarI9 == null && this.f5536ix && this.dm != null) {
            gVarI9 = this.f5527cs.f5561gv.c5();
        }
        if (gVarI9 != null) {
            this.oz = gVarI9;
        } else if (!this.ct || this.oz == null) {
            return;
        }
        gq(this.oz, this.dm);
        this.ct = false;
        this.f5536ix = false;
    }

    @Override // ft.hk
    public void co(long j, long j4) throws ft.p {
        boolean z = false;
        if (this.f5547q5) {
            this.f5547q5 = false;
            x5();
        }
        ft.p pVar = this.f5544mp;
        if (pVar != null) {
            this.f5544mp = null;
            throw pVar;
        }
        try {
            if (this.f5555w2) {
                ix();
                return;
            }
            if (this.j != null || le(2)) {
                wf();
                if (this.f5526cr) {
                    j5.y("bypassRender");
                    while (j5(j, j4)) {
                    }
                    j5.zn();
                } else if (this.y5 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    j5.y("drainAndFeed");
                    while (o4(j, j4) && gf(jElapsedRealtime)) {
                    }
                    while (eb() && gf(jElapsedRealtime)) {
                    }
                    j5.zn();
                } else {
                    this.f5542le.f3200gv += vl(j);
                    le(1);
                }
                this.f5542le.zn();
            }
        } catch (IllegalStateException e4) {
            if (!cr(e4)) {
                throw e4;
            }
            cy(e4);
            if (ut.y >= 21 && xb(e4)) {
                z = true;
            }
            if (z) {
                ro();
            }
            throw n(u(e4, ap()), this.j, z, 4003);
        }
    }

    public final void cs() throws ft.p {
        ro();
        wf();
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    public final boolean ct() throws ft.p {
        if (this.f5548qj) {
            this.cy = 1;
            if (this.f5529e || this.f5523ap) {
                this.f5549qk = 3;
                return false;
            }
            this.f5549qk = 2;
        } else {
            n7();
        }
        return true;
    }

    public abstract void cy(Exception exc);

    @Override // ft.a
    public void d() {
        this.j = null;
        ne(zn.f5560v);
        this.o.clear();
        ra();
    }

    public final void dm() throws ft.p {
        if (!this.f5548qj) {
            cs();
        } else {
            this.cy = 1;
            this.f5549qk = 3;
        }
    }

    public final List<z> e(boolean z) throws rz.zn {
        List<z> listRb = rb(this.d0, this.j, z);
        if (listRb.isEmpty() && z) {
            listRb = rb(this.d0, this.j, false);
            if (!listRb.isEmpty()) {
                v0.r.c5("MediaCodecRenderer", "Drm session requires secure decoder for " + this.j.f3 + ", but no secure decoder available. Trying to proceed with " + listRb + ".");
            }
        }
        return listRb;
    }

    public final boolean eb() throws ft.p {
        int i;
        if (this.y5 == null || (i = this.cy) == 2 || this.f5556w9) {
            return false;
        }
        if (i == 0 && fc()) {
            dm();
        }
        if (this.f5525bk < 0) {
            int iF = this.y5.f();
            this.f5525bk = iF;
            if (iF < 0) {
                return false;
            }
            this.f5557x.f3179fb = this.y5.gv(iF);
            this.f5557x.a();
        }
        if (this.cy == 1) {
            if (!this.f5543m) {
                this.f5540l = true;
                this.y5.a(this.f5525bk, 0, 0, 0L, 4);
                i3();
            }
            this.cy = 2;
            return false;
        }
        if (this.f5551rb) {
            this.f5551rb = false;
            ByteBuffer byteBuffer = this.f5557x.f3179fb;
            byte[] bArr = f5521yk;
            byteBuffer.put(bArr);
            this.y5.a(this.f5525bk, 0, bArr.length, 0L, 0);
            i3();
            this.f5548qj = true;
            return true;
        }
        if (this.f5522ad == 1) {
            for (int i5 = 0; i5 < this.xg.c.size(); i5++) {
                this.f5557x.f3179fb.put(this.xg.c.get(i5));
            }
            this.f5522ad = 2;
        }
        int iPosition = this.f5557x.f3179fb.position();
        u0 u0VarD0 = d0();
        try {
            int iK5 = k5(u0VarD0, this.f5557x, 0);
            if (c5() || this.f5557x.xc()) {
                this.oa = this.vp;
            }
            if (iK5 == -3) {
                return false;
            }
            if (iK5 == -5) {
                if (this.f5522ad == 2) {
                    this.f5557x.a();
                    this.f5522ad = 1;
                }
                l(u0VarD0);
                return true;
            }
            if (this.f5557x.t()) {
                if (this.f5522ad == 2) {
                    this.f5557x.a();
                    this.f5522ad = 1;
                }
                this.f5556w9 = true;
                if (!this.f5548qj) {
                    x5();
                    return false;
                }
                try {
                    if (!this.f5543m) {
                        this.f5540l = true;
                        this.y5.a(this.f5525bk, 0, 0, 0L, 4);
                        i3();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e4) {
                    throw f3(e4, this.j, ut.q9(e4.getErrorCode()));
                }
            }
            if (!this.f5548qj && !this.f5557x.wz()) {
                this.f5557x.a();
                if (this.f5522ad == 2) {
                    this.f5522ad = 1;
                }
                return true;
            }
            boolean z = this.f5557x.z();
            if (z) {
                this.f5557x.f3183v.n3(iPosition);
            }
            if (this.f5550ra && !z) {
                v0.c.n3(this.f5557x.f3179fb);
                if (this.f5557x.f3179fb.position() == 0) {
                    return true;
                }
                this.f5550ra = false;
            }
            di.fb fbVar = this.f5557x;
            long jGv = fbVar.f3178f;
            c5 c5Var = this.f5532g;
            if (c5Var != null) {
                jGv = c5Var.gv(this.j, fbVar);
                this.vp = Math.max(this.vp, this.f5532g.n3(this.j));
            }
            long j = jGv;
            if (this.f5557x.i9()) {
                this.f5537j5.add(Long.valueOf(j));
            }
            if (this.x5) {
                if (this.o.isEmpty()) {
                    this.f5527cs.f5561gv.y(j, this.j);
                } else {
                    this.o.peekLast().f5561gv.y(j, this.j);
                }
                this.x5 = false;
            }
            this.vp = Math.max(this.vp, j);
            this.f5557x.co();
            if (this.f5557x.c5()) {
                bk(this.f5557x);
            }
            w2(this.f5557x);
            try {
                if (z) {
                    this.y5.y(this.f5525bk, 0, this.f5557x.f3183v, j, 0);
                } else {
                    this.y5.a(this.f5525bk, 0, this.f5557x.f3179fb.limit(), j, 0);
                }
                i3();
                this.f5548qj = true;
                this.f5522ad = 0;
                this.f5542le.zn++;
                return true;
            } catch (MediaCodec.CryptoException e5) {
                throw f3(e5, this.j, ut.q9(e5.getErrorCode()));
            }
        } catch (fb.y e6) {
            cy(e6);
            le(0);
            lc();
            return true;
        }
    }

    @Override // ft.a
    public void ej(long j, boolean z) throws ft.p {
        this.f5556w9 = false;
        this.f5555w2 = false;
        this.f5547q5 = false;
        if (this.f5526cr) {
            this.f5535hw.a();
            this.f5524b.a();
            this.f5546o0 = false;
        } else {
            nf();
        }
        if (this.f5527cs.f5561gv.t() > 0) {
            this.x5 = true;
        }
        this.f5527cs.f5561gv.zn();
        this.o.clear();
    }

    public boolean fc() {
        return false;
    }

    public final long g() {
        return this.f5527cs.zn;
    }

    @Nullable
    public final v5.i4 g3(com.google.android.exoplayer2.drm.gv gvVar) throws ft.p {
        di.n3 n3VarV = gvVar.v();
        if (n3VarV == null || (n3VarV instanceof v5.i4)) {
            return (v5.i4) n3VarV;
        }
        throw f3(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + n3VarV), this.j, 6001);
    }

    public final boolean gf(long j) {
        return this.en == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.en;
    }

    public abstract void gq(g gVar, @Nullable MediaFormat mediaFormat) throws ft.p;

    public final void hw() throws ft.p {
        v0.y.fb(!this.f5556w9);
        u0 u0VarD0 = d0();
        this.f5524b.a();
        do {
            this.f5524b.a();
            int iK5 = k5(u0VarD0, this.f5524b, 0);
            if (iK5 == -5) {
                l(u0VarD0);
                return;
            }
            if (iK5 != -4) {
                if (iK5 != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f5524b.t()) {
                    this.f5556w9 = true;
                    return;
                }
                if (this.x5) {
                    g gVar = (g) v0.y.v(this.j);
                    this.oz = gVar;
                    gq(gVar, null);
                    this.x5 = false;
                }
                this.f5524b.co();
            }
        } while (this.f5535hw.i4(this.f5524b));
        this.f5546o0 = true;
    }

    public void i2() {
        yk();
        this.f5544mp = null;
        this.f5532g = null;
        this.rs = null;
        this.f5541lc = null;
        this.xg = null;
        this.dm = null;
        this.ct = false;
        this.f5534gq = false;
        this.o4 = -1.0f;
        this.f5545nf = 0;
        this.f5550ra = false;
        this.f5529e = false;
        this.s8 = false;
        this.f5523ap = false;
        this.f5559yg = false;
        this.f5558yc = false;
        this.f5539kp = false;
        this.f5543m = false;
        this.wf = false;
        this.f5522ad = 0;
        this.f7 = false;
    }

    public final void i3() {
        this.f5525bk = -1;
        this.f5557x.f3179fb = null;
    }

    @Override // ft.hk
    public boolean isReady() {
        return this.j != null && (ta() || y4() || (this.f5553u0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f5553u0));
    }

    public final void j3(@Nullable com.google.android.exoplayer2.drm.gv gvVar) {
        v5.i9.y(this.f5554ut, gvVar);
        this.f5554ut = gvVar;
    }

    public final boolean j5(long j, long j4) throws ft.p {
        v0.y.fb(!this.f5555w2);
        if (this.f5535hw.fh()) {
            s sVar = this.f5535hw;
            if (!q5(j, j4, null, sVar.f3179fb, this.y4, 0, sVar.d0(), this.f5535hw.n(), this.f5535hw.i9(), this.f5535hw.t(), this.oz)) {
                return false;
            }
            oa(this.f5535hw.c());
            this.f5535hw.a();
        }
        if (this.f5556w9) {
            this.f5555w2 = true;
            return false;
        }
        if (this.f5546o0) {
            v0.y.fb(this.f5535hw.i4(this.f5524b));
            this.f5546o0 = false;
        }
        if (this.xb) {
            if (this.f5535hw.fh()) {
                return true;
            }
            y5();
            this.xb = false;
            wf();
            if (!this.f5526cr) {
                return false;
            }
        }
        hw();
        if (this.f5535hw.fh()) {
            this.f5535hw.co();
        }
        return this.f5535hw.fh() || this.f5556w9 || this.xb;
    }

    @Nullable
    public final MediaFormat kp() {
        return this.dm;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public di.c5 l(ft.u0 r12) throws ft.p {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.x4.l(ft.u0):di.c5");
    }

    public final void lc() {
        try {
            this.y5.flush();
        } finally {
            yk();
        }
    }

    public final boolean le(int i) throws ft.p {
        u0 u0VarD0 = d0();
        this.f5531ej.a();
        int iK5 = k5(u0VarD0, this.f5531ej, i | 4);
        if (iK5 == -5) {
            l(u0VarD0);
            return true;
        }
        if (iK5 != -4 || !this.f5531ej.t()) {
            return false;
        }
        this.f5556w9 = true;
        x5();
        return false;
    }

    public abstract t.y m(z zVar, g gVar, @Nullable MediaCrypto mediaCrypto, float f3);

    public final boolean mh(g gVar) throws ft.p {
        if (ut.y >= 23 && this.y5 != null && this.f5549qk != 3 && getState() != 0) {
            float fYc = yc(this.u, gVar, mg());
            float f3 = this.o4;
            if (f3 == fYc) {
                return true;
            }
            if (fYc == -1.0f) {
                dm();
                return false;
            }
            if (f3 == -1.0f && fYc <= this.f5528d) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fYc);
            this.y5.c5(bundle);
            this.o4 = fYc;
        }
        return true;
    }

    public final void mp() {
        this.f5534gq = true;
        MediaFormat mediaFormatN3 = this.y5.n3();
        if (this.f5545nf != 0 && mediaFormatN3.getInteger("width") == 32 && mediaFormatN3.getInteger("height") == 32) {
            this.f5533g3 = true;
            return;
        }
        if (this.f5539kp) {
            mediaFormatN3.setInteger("channel-count", 1);
        }
        this.dm = mediaFormatN3;
        this.ct = true;
    }

    @Override // ft.a, ft.ic
    public final int mt() {
        return 8;
    }

    @Override // ft.ic
    public final int n3(g gVar) throws ft.p {
        try {
            return uo(this.d0, gVar);
        } catch (rz.zn e4) {
            throw f3(e4, gVar, 4002);
        }
    }

    public final void n7() throws ft.p {
        try {
            ob.s.y(this.f5538k, g3(this.q9).n3);
            j3(this.q9);
            this.cy = 0;
            this.f5549qk = 0;
        } catch (MediaCryptoException e4) {
            throw f3(e4, this.j, 6006);
        }
    }

    public final void nd(@Nullable com.google.android.exoplayer2.drm.gv gvVar) {
        v5.i9.y(this.q9, gvVar);
        this.q9 = gvVar;
    }

    public final void ne(zn znVar) {
        this.f5527cs = znVar;
        long j = znVar.zn;
        if (j != -9223372036854775807L) {
            this.f5536ix = true;
            vp(j);
        }
    }

    public final boolean nf() throws ft.p {
        boolean zRa = ra();
        if (zRa) {
            wf();
        }
        return zRa;
    }

    public final int o(String str) {
        int i = ut.y;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = ut.f8761gv;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = ut.n3;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final boolean o4(long j, long j4) throws ft.p {
        boolean z;
        boolean zQ5;
        int iT;
        if (!y4()) {
            if (this.f5559yg && this.f5540l) {
                try {
                    iT = this.y5.t(this.qn);
                } catch (IllegalStateException unused) {
                    x5();
                    if (this.f5555w2) {
                        ro();
                    }
                    return false;
                }
            } else {
                iT = this.y5.t(this.qn);
            }
            if (iT < 0) {
                if (iT == -2) {
                    mp();
                    return true;
                }
                if (this.f5543m && (this.f5556w9 || this.cy == 2)) {
                    x5();
                }
                return false;
            }
            if (this.f5533g3) {
                this.f5533g3 = false;
                this.y5.tl(iT, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.qn;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                x5();
                return false;
            }
            this.y4 = iT;
            ByteBuffer byteBufferWz = this.y5.wz(iT);
            this.tg = byteBufferWz;
            if (byteBufferWz != null) {
                byteBufferWz.position(this.qn.offset);
                ByteBuffer byteBuffer = this.tg;
                MediaCodec.BufferInfo bufferInfo2 = this.qn;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f5558yc) {
                MediaCodec.BufferInfo bufferInfo3 = this.qn;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j7 = this.vp;
                    if (j7 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j7;
                    }
                }
            }
            this.pz = pq(this.qn.presentationTimeUs);
            long j8 = this.oa;
            long j9 = this.qn.presentationTimeUs;
            this.pq = j8 == j9;
            c8(j9);
        }
        if (this.f5559yg && this.f5540l) {
            try {
                t tVar = this.y5;
                ByteBuffer byteBuffer2 = this.tg;
                int i = this.y4;
                MediaCodec.BufferInfo bufferInfo4 = this.qn;
                z = false;
                try {
                    zQ5 = q5(j, j4, tVar, byteBuffer2, i, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.pz, this.pq, this.oz);
                } catch (IllegalStateException unused2) {
                    x5();
                    if (this.f5555w2) {
                        ro();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            t tVar2 = this.y5;
            ByteBuffer byteBuffer3 = this.tg;
            int i5 = this.y4;
            MediaCodec.BufferInfo bufferInfo5 = this.qn;
            zQ5 = q5(j, j4, tVar2, byteBuffer3, i5, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.pz, this.pq, this.oz);
        }
        if (zQ5) {
            oa(this.qn.presentationTimeUs);
            boolean z5 = (this.qn.flags & 4) != 0;
            vn();
            if (!z5) {
                return true;
            }
            x5();
        }
        return z;
    }

    public void oa(long j) {
        this.f5552ro = j;
        while (!this.o.isEmpty() && j >= this.o.peek().y) {
            ne(this.o.poll());
            w9();
        }
    }

    public final boolean pq(long j) {
        int size = this.f5537j5.size();
        for (int i = 0; i < size; i++) {
            if (this.f5537j5.get(i).longValue() == j) {
                this.f5537j5.remove(i);
                return true;
            }
        }
        return false;
    }

    public final void pz(z zVar, MediaCrypto mediaCrypto) throws Exception {
        String str = zVar.y;
        int i = ut.y;
        float fYc = i < 23 ? -1.0f : yc(this.u, this.j, mg());
        float f3 = fYc > this.f5528d ? fYc : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        t.y yVarM = m(zVar, this.j, mediaCrypto, f3);
        if (i >= 31) {
            y.y(yVarM, rz());
        }
        try {
            j5.y("createCodec:" + str);
            this.y5 = this.c.y(yVarM);
            j5.zn();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!zVar.p(this.j)) {
                v0.r.c5("MediaCodecRenderer", ut.rz("Format exceeds selected codec's capabilities [%s, %s]", g.i9(this.j), str));
            }
            this.f5541lc = zVar;
            this.o4 = f3;
            this.xg = this.j;
            this.f5545nf = o(str);
            this.f5550ra = j(str, this.xg);
            this.f5529e = f7(str);
            this.s8 = jz(str);
            this.f5523ap = ut(str);
            this.f5559yg = q9(str);
            this.f5558yc = oz(str);
            this.f5539kp = en(str, this.xg);
            this.f5543m = k(zVar) || yg();
            if (this.y5.s()) {
                this.wf = true;
                this.f5522ad = 1;
                this.f5551rb = this.f5545nf != 0;
            }
            if ("c2.android.mp3.decoder".equals(zVar.y)) {
                this.f5532g = new c5();
            }
            if (getState() == 2) {
                this.f5553u0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f5542le.y++;
            qk(str, yVarM, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            j5.zn();
            throw th;
        }
    }

    public final void q() {
        this.f5547q5 = true;
    }

    public abstract boolean q5(long j, long j4, @Nullable t tVar, @Nullable ByteBuffer byteBuffer, int i, int i5, int i8, long j7, boolean z, boolean z5, g gVar) throws ft.p;

    public abstract void qj(String str);

    public abstract void qk(String str, t.y yVar, long j, long j4);

    public abstract di.c5 qn(z zVar, g gVar, g gVar2);

    public boolean ra() {
        if (this.y5 == null) {
            return false;
        }
        int i = this.f5549qk;
        if (i == 3 || this.f5529e || ((this.s8 && !this.f5534gq) || (this.f5523ap && this.f5540l))) {
            ro();
            return true;
        }
        if (i == 2) {
            int i5 = ut.y;
            v0.y.fb(i5 >= 23);
            if (i5 >= 23) {
                try {
                    n7();
                } catch (ft.p e4) {
                    v0.r.i9("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e4);
                    ro();
                    return true;
                }
            }
        }
        lc();
        return false;
    }

    public abstract List<z> rb(f3 f3Var, g gVar, boolean z) throws rz.zn;

    /* JADX WARN: Multi-variable type inference failed */
    public void ro() {
        try {
            t tVar = this.y5;
            if (tVar != null) {
                tVar.release();
                this.f5542le.n3++;
                qj(this.f5541lc.y);
            }
            this.y5 = null;
            try {
                MediaCrypto mediaCrypto = this.f5538k;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.y5 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f5538k;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public final boolean rs(z zVar, g gVar, @Nullable com.google.android.exoplayer2.drm.gv gvVar, @Nullable com.google.android.exoplayer2.drm.gv gvVar2) throws ft.p {
        v5.i4 i4VarG3;
        if (gvVar == gvVar2) {
            return false;
        }
        if (gvVar2 == null || gvVar == null || !gvVar2.zn().equals(gvVar.zn()) || ut.y < 23) {
            return true;
        }
        UUID uuid = ft.c5.f4652v;
        if (uuid.equals(gvVar.zn()) || uuid.equals(gvVar2.zn()) || (i4VarG3 = g3(gvVar2)) == null) {
            return true;
        }
        return !zVar.f5565fb && (i4VarG3.zn ? false : gvVar2.fb(gVar.f3));
    }

    @Nullable
    public final t s8() {
        return this.y5;
    }

    public final void tg(g gVar) {
        y5();
        String str = gVar.f3;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f5535hw.rz(32);
        } else {
            this.f5535hw.rz(1);
        }
        this.f5526cr = true;
    }

    public tl u(Throwable th, @Nullable z zVar) {
        return new tl(th, zVar);
    }

    public float u0() {
        return this.jz;
    }

    @Override // ft.a
    public void ud() {
        try {
            y5();
            ro();
        } finally {
            nd(null);
        }
    }

    public abstract int uo(f3 f3Var, g gVar) throws rz.zn;

    public final void vn() {
        this.y4 = -1;
        this.tg = null;
    }

    @Override // ft.a, ft.hk
    public void w(float f3, float f4) throws ft.p {
        this.jz = f3;
        this.u = f4;
        mh(this.xg);
    }

    public abstract void w2(di.fb fbVar) throws ft.p;

    public final void wf() throws ft.p {
        g gVar;
        if (this.y5 != null || this.f5526cr || (gVar = this.j) == null) {
            return;
        }
        if (this.q9 == null && br(gVar)) {
            tg(this.j);
            return;
        }
        j3(this.q9);
        String str = this.j.f3;
        com.google.android.exoplayer2.drm.gv gvVar = this.f5554ut;
        if (gvVar != null) {
            if (this.f5538k == null) {
                v5.i4 i4VarG3 = g3(gvVar);
                if (i4VarG3 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(i4VarG3.y, i4VarG3.n3);
                        this.f5538k = mediaCrypto;
                        this.f7 = !i4VarG3.zn && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e4) {
                        throw f3(e4, this.j, 6006);
                    }
                } else if (this.f5554ut.getError() == null) {
                    return;
                }
            }
            if (v5.i4.f8799gv) {
                int state = this.f5554ut.getState();
                if (state == 1) {
                    gv.y yVar = (gv.y) v0.y.v(this.f5554ut.getError());
                    throw f3(yVar, this.j, yVar.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            ad(this.f5538k, this.f7);
        } catch (n3 e5) {
            throw f3(e5, this.j, 4001);
        }
    }

    public final void wm(ft.p pVar) {
        this.f5544mp = pVar;
    }

    @TargetApi(ConnectionResult.API_DISABLED)
    public final void x5() throws ft.p {
        int i = this.f5549qk;
        if (i == 1) {
            lc();
            return;
        }
        if (i == 2) {
            lc();
            n7();
        } else if (i == 3) {
            cs();
        } else {
            this.f5555w2 = true;
            ix();
        }
    }

    public final boolean xg() {
        if (this.f5548qj) {
            this.cy = 1;
            if (this.f5529e || this.f5523ap) {
                this.f5549qk = 3;
                return false;
            }
            this.f5549qk = 1;
        }
        return true;
    }

    public final boolean y4() {
        return this.y4 >= 0;
    }

    public final void y5() {
        this.xb = false;
        this.f5535hw.a();
        this.f5524b.a();
        this.f5546o0 = false;
        this.f5526cr = false;
    }

    public abstract float yc(float f3, g gVar, g[] gVarArr);

    public boolean yg() {
        return false;
    }

    public void yk() {
        i3();
        vn();
        this.f5553u0 = -9223372036854775807L;
        this.f5540l = false;
        this.f5548qj = false;
        this.f5551rb = false;
        this.f5533g3 = false;
        this.pz = false;
        this.pq = false;
        this.f5537j5.clear();
        this.vp = -9223372036854775807L;
        this.oa = -9223372036854775807L;
        this.f5552ro = -9223372036854775807L;
        c5 c5Var = this.f5532g;
        if (c5Var != null) {
            c5Var.zn();
        }
        this.cy = 0;
        this.f5549qk = 0;
        this.f5522ad = this.wf ? 1 : 0;
    }

    @Override // ft.a
    public void z6(boolean z, boolean z5) throws ft.p {
        this.f5542le = new di.v();
    }

    public static class n3 extends Exception {

        @Nullable
        public final z codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final n3 fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public n3(g gVar, @Nullable Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + gVar, th, gVar.f3, z, null, n3(i), null);
        }

        @Nullable
        public static String a(@Nullable Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public static String n3(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING) + Math.abs(i);
        }

        @CheckResult
        public final n3 gv(n3 n3Var) {
            return new n3(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, n3Var);
        }

        public n3(g gVar, @Nullable Throwable th, boolean z, z zVar) {
            this("Decoder init failed: " + zVar.y + ", " + gVar, th, gVar.f3, z, zVar, ut.y >= 21 ? a(th) : null, null);
        }

        public n3(String str, @Nullable Throwable th, String str2, boolean z, @Nullable z zVar, @Nullable String str3, @Nullable n3 n3Var) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = zVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = n3Var;
        }
    }

    @Override // ft.a
    public void a8() {
    }

    public void ix() throws ft.p {
    }

    public void w9() {
    }

    @Override // ft.a
    public void x() {
    }

    public void bk(di.fb fbVar) throws ft.p {
    }

    public void vp(long j) {
    }
}

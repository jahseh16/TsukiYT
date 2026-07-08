package zo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.gv;
import com.google.android.exoplayer2.drm.n3;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import ft.gi;
import ft.im;
import ft.xb;
import ft.xq;
import i7.x4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import mn.i4;
import r0.c;
import r0.d0;
import r0.j;
import ur.mg;
import zo.hk;
import zo.zn;

/* JADX INFO: loaded from: classes.dex */
public final class zq implements zn, hk.y {
    public int c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public String f9579c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public ft.g f9580co;
    public boolean d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9581f;
    public int f3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public boolean f9584i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public PlaybackMetrics.Builder f9585i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public ft.g f9586mt;
    public int n;
    public final hk n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public n3 f9587p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9588r;

    @Nullable
    public n3 w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public ft.bv f9593wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public int f9594x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    @Nullable
    public n3 f9595xc;
    public final Context y;

    @Nullable
    public ft.g z;
    public final PlaybackSession zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xq.gv f9592v = new xq.gv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq.n3 f9578a = new xq.n3();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap<String, Long> f9589s = new HashMap<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final HashMap<String, Long> f9582fb = new HashMap<>();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final long f9583gv = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9590t = 0;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f9591tl = 0;

    public static final class n3 {
        public final int n3;
        public final ft.g y;
        public final String zn;

        public n3(ft.g gVar, int i, String str) {
            this.y = gVar;
            this.n3 = i;
            this.zn = str;
        }
    }

    public static final class y {
        public final int n3;
        public final int y;

        public y(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }
    }

    public zq(Context context, PlaybackSession playbackSession) {
        this.y = context.getApplicationContext();
        this.zn = playbackSession;
        kp kpVar = new kp();
        this.n3 = kpVar;
        kpVar.fb(this);
    }

    public static y ad(ft.bv bvVar, Context context, boolean z) {
        int i;
        boolean z5;
        if (bvVar.errorCode == 1001) {
            return new y(20, 0);
        }
        if (bvVar instanceof ft.p) {
            ft.p pVar = (ft.p) bvVar;
            z5 = pVar.type == 1;
            i = pVar.rendererFormatSupport;
        } else {
            i = 0;
            z5 = false;
        }
        Throwable th = (Throwable) v0.y.v(bvVar.getCause());
        if (!(th instanceof IOException)) {
            if (z5 && (i == 0 || i == 1)) {
                return new y(35, 0);
            }
            if (z5 && i == 3) {
                return new y(15, 0);
            }
            if (z5 && i == 2) {
                return new y(23, 0);
            }
            if (th instanceof x4.n3) {
                return new y(13, v0.ut.k(((x4.n3) th).diagnosticInfo));
            }
            if (th instanceof i7.tl) {
                return new y(14, v0.ut.k(((i7.tl) th).diagnosticInfo));
            }
            if (th instanceof OutOfMemoryError) {
                return new y(14, 0);
            }
            if (th instanceof i4.n3) {
                return new y(17, ((i4.n3) th).audioTrackState);
            }
            if (th instanceof i4.v) {
                return new y(18, ((i4.v) th).errorCode);
            }
            if (v0.ut.y < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new y(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new y(o0(errorCode), errorCode);
        }
        if (th instanceof d0.v) {
            return new y(5, ((d0.v) th).responseCode);
        }
        if ((th instanceof d0.gv) || (th instanceof ft.q)) {
            return new y(z ? 10 : 11, 0);
        }
        boolean z7 = th instanceof d0.zn;
        if (z7 || (th instanceof j.y)) {
            if (NetworkTypeObserver.getInstance(context).getNetworkType() == 1) {
                return new y(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new y(6, 0) : cause instanceof SocketTimeoutException ? new y(7, 0) : (z7 && ((d0.zn) th).type == 1) ? new y(4, 0) : new y(8, 0);
        }
        if (bvVar.errorCode == 1002) {
            return new y(21, 0);
        }
        if (!(th instanceof gv.y)) {
            if (!(th instanceof c.zn) || !(th.getCause() instanceof FileNotFoundException)) {
                return new y(9, 0);
            }
            Throwable cause2 = ((Throwable) v0.y.v(th.getCause())).getCause();
            return (v0.ut.y >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new y(32, 0) : new y(31, 0);
        }
        Throwable th2 = (Throwable) v0.y.v(th.getCause());
        int i5 = v0.ut.y;
        if (i5 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i5 < 23 || !xq.xc.y(th2)) ? (i5 < 18 || !(th2 instanceof NotProvisionedException)) ? (i5 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof v5.ta ? new y(23, 0) : th2 instanceof n3.v ? new y(28, 0) : new y(30, 0) : new y(29, 0) : new y(24, 0) : new y(27, 0);
        }
        int iK = v0.ut.k(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new y(o0(iK), iK);
    }

    public static Pair<String, String> cy(String str) {
        String[] strArrRo = v0.ut.ro(str, "-");
        return Pair.create(strArrRo[0], strArrRo.length >= 2 ? strArrRo[1] : null);
    }

    public static int gq(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    public static int l(ft.xb xbVar) {
        xb.s sVar = xbVar.f5080v;
        if (sVar == null) {
            return 0;
        }
        int iKp = v0.ut.kp(sVar.y, sVar.n3);
        if (iKp == 0) {
            return 3;
        }
        if (iKp != 1) {
            return iKp != 2 ? 1 : 4;
        }
        return 5;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int o0(int i) {
        switch (v0.ut.q9(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Nullable
    public static zq pq(Context context) {
        MediaMetricsManager mediaMetricsManagerY = c8.y(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerY == null) {
            return null;
        }
        return new zq(context, mediaMetricsManagerY.createPlaybackSession());
    }

    public static int qj(Context context) {
        switch (NetworkTypeObserver.getInstance(context).getNetworkType()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    public static int wf(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.f1511s; i++) {
            UUID uuid = drmInitData.v(i).f1516v;
            if (uuid.equals(ft.c5.f4651gv)) {
                return 3;
            }
            if (uuid.equals(ft.c5.f4652v)) {
                return 2;
            }
            if (uuid.equals(ft.c5.zn)) {
                return 6;
            }
        }
        return 1;
    }

    @Nullable
    public static DrmInitData xb(k4.r<gi.y> rVar) {
        DrmInitData drmInitData;
        k4.k<gi.y> it = rVar.iterator();
        while (it.hasNext()) {
            gi.y next = it.next();
            for (int i = 0; i < next.y; i++) {
                if (next.fb(i) && (drmInitData = next.zn(i).d0) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
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

    @Override // zo.zn
    public /* synthetic */ void c5(zn.y yVar, im.n3 n3Var) {
        zo.n3.t(this, yVar, n3Var);
    }

    @Override // zo.zn
    public /* synthetic */ void co(zn.y yVar, ft.g gVar) {
        zo.n3.kp(this, yVar, gVar);
    }

    public final void cr() {
        PlaybackMetrics.Builder builder = this.f9585i9;
        if (builder != null && this.d0) {
            builder.setAudioUnderrunCount(this.c);
            this.f9585i9.setVideoFramesDropped(this.f3);
            this.f9585i9.setVideoFramesPlayed(this.n);
            Long l3 = this.f9582fb.get(this.f9579c5);
            this.f9585i9.setNetworkTransferDurationMillis(l3 == null ? 0L : l3.longValue());
            Long l4 = this.f9589s.get(this.f9579c5);
            this.f9585i9.setNetworkBytesRead(l4 == null ? 0L : l4.longValue());
            this.f9585i9.setStreamSource((l4 == null || l4.longValue() <= 0) ? 0 : 1);
            this.zn.reportPlaybackMetrics(this.f9585i9.build());
        }
        this.f9585i9 = null;
        this.f9579c5 = null;
        this.c = 0;
        this.f3 = 0;
        this.n = 0;
        this.f9586mt = null;
        this.f9580co = null;
        this.z = null;
        this.d0 = false;
    }

    public final void cs(xq xqVar, @Nullable mg.n3 n3Var) {
        int iA;
        PlaybackMetrics.Builder builder = this.f9585i9;
        if (n3Var == null || (iA = xqVar.a(n3Var.y)) == -1) {
            return;
        }
        xqVar.i9(iA, this.f9578a);
        xqVar.mt(this.f9578a.f5172fb, this.f9592v);
        builder.setStreamType(l(this.f9592v.f5162fb));
        xq.gv gvVar = this.f9592v;
        if (gvVar.c != -9223372036854775807L && !gvVar.f3 && !gvVar.f5159co && !gvVar.s()) {
            builder.setMediaDurationMillis(this.f9592v.a());
        }
        builder.setPlaybackType(this.f9592v.s() ? 2 : 1);
        this.d0 = true;
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
        mg.n3 n3Var = yVar.f9574gv;
        if ((n3Var == null || !n3Var.n3()) && str.equals(this.f9579c5)) {
            cr();
        }
        this.f9582fb.remove(str);
        this.f9589s.remove(str);
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
    public /* synthetic */ void ej(zn.y yVar, Exception exc) {
        zo.n3.fh(this, yVar, exc);
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
        if (yVar.f9574gv == null) {
            return;
        }
        n3 n3Var = new n3((ft.g) v0.y.v(cVar.zn), cVar.f8480gv, this.n3.a(yVar.n3, (mg.n3) v0.y.v(yVar.f9574gv)));
        int i = cVar.n3;
        if (i != 0) {
            if (i == 1) {
                this.w = n3Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f9587p = n3Var;
                return;
            }
        }
        this.f9595xc = n3Var;
    }

    @Override // zo.zn
    public void fh(zn.y yVar, int i, long j, long j4) {
        mg.n3 n3Var = yVar.f9574gv;
        if (n3Var != null) {
            String strA = this.n3.a(yVar.n3, (mg.n3) v0.y.v(n3Var));
            Long l3 = this.f9589s.get(strA);
            Long l4 = this.f9582fb.get(strA);
            this.f9589s.put(strA, Long.valueOf((l3 == null ? 0L : l3.longValue()) + j));
            this.f9582fb.put(strA, Long.valueOf((l4 != null ? l4.longValue() : 0L) + ((long) i)));
        }
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
        mg.n3 n3Var = yVar.f9574gv;
        if (n3Var == null || !n3Var.n3()) {
            cr();
            this.f9579c5 = str;
            this.f9585i9 = uo.y().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
            cs(yVar.n3, yVar.f9574gv);
        }
    }

    @Override // zo.zn
    public /* synthetic */ void i9(zn.y yVar, int i) {
        zo.n3.o4(this, yVar, i);
    }

    public final void ix(int i, long j, @Nullable ft.g gVar, int i5) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = w9.y(i).setTimeSinceCreatedMillis(j - this.f9583gv);
        if (gVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(gq(i5));
            String str = gVar.f4787r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = gVar.f3;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = gVar.f4778co;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i8 = gVar.f4786p;
            if (i8 != -1) {
                timeSinceCreatedMillis.setBitrate(i8);
            }
            int i10 = gVar.f4779d;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = gVar.f4780ej;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = gVar.j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = gVar.oz;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = gVar.f4782fb;
            if (str4 != null) {
                Pair<String, String> pairCy = cy(str4);
                timeSinceCreatedMillis.setLanguage((String) pairCy.first);
                Object obj = pairCy.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f3 = gVar.f4792x;
            if (f3 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f3);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.d0 = true;
        this.zn.reportTrackChangeEvent(timeSinceCreatedMillis.build());
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
    public void k(zn.y yVar, ft.bv bvVar) {
        this.f9593wz = bvVar;
    }

    @Override // zo.zn
    public void k5(zn.y yVar, di.v vVar) {
        this.f3 += vVar.f3199fb;
        this.n += vVar.f3204v;
    }

    @Override // zo.zn
    public /* synthetic */ void kp(zn.y yVar, boolean z) {
        zo.n3.b(this, yVar, z);
    }

    @Override // zo.zn
    public /* synthetic */ void lc(zn.y yVar, Exception exc) {
        zo.n3.nf(this, yVar, exc);
    }

    public final void le(long j, @Nullable ft.g gVar, int i) {
        if (v0.ut.zn(this.z, gVar)) {
            return;
        }
        int i5 = (this.z == null && i == 0) ? 1 : i;
        this.z = gVar;
        ix(2, j, gVar, i5);
    }

    @Override // zo.zn
    public /* synthetic */ void m(zn.y yVar, di.v vVar) {
        zo.n3.v(this, yVar, vVar);
    }

    @Override // zo.zn
    public void mg(zn.y yVar, w0.mg mgVar) {
        n3 n3Var = this.f9595xc;
        if (n3Var != null) {
            ft.g gVar = n3Var.y;
            if (gVar.f4780ej == -1) {
                this.f9595xc = new n3(gVar.n3().s8(mgVar.y).o(mgVar.f8904v).z6(), n3Var.n3, n3Var.zn);
            }
        }
    }

    public final void mp(ft.im imVar, zn.n3 n3Var) {
        DrmInitData drmInitDataXb;
        if (n3Var.y(0)) {
            zn.y yVarZn = n3Var.zn(0);
            if (this.f9585i9 != null) {
                cs(yVarZn.n3, yVarZn.f9574gv);
            }
        }
        if (n3Var.y(2) && this.f9585i9 != null && (drmInitDataXb = xb(imVar.fh().n3())) != null) {
            m.y(v0.ut.i9(this.f9585i9)).setDrmType(wf(drmInitDataXb));
        }
        if (n3Var.y(1011)) {
            this.c++;
        }
    }

    @Override // zo.zn
    public void mt(zn.y yVar, im.v vVar, im.v vVar2, int i) {
        if (i == 1) {
            this.f9588r = true;
        }
        this.f9581f = i;
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
    public /* synthetic */ void o4(zn.y yVar, int i, long j) {
        zo.n3.mg(this, yVar, i, j);
    }

    public final void oa(long j) {
        int iQj = qj(this.y);
        if (iQj != this.f9591tl) {
            this.f9591tl = iQj;
            this.zn.reportNetworkEvent(i3.y().setNetworkType(iQj).setTimeSinceCreatedMillis(j - this.f9583gv).build());
        }
    }

    @Override // zo.zn
    public /* synthetic */ void oz(zn.y yVar, int i, di.v vVar) {
        zo.n3.w(this, yVar, i, vVar);
    }

    @Override // zo.zn
    public /* synthetic */ void p(zn.y yVar, ft.xc xcVar) {
        zo.n3.z(this, yVar, xcVar);
    }

    public final boolean pz(@Nullable n3 n3Var) {
        return n3Var != null && n3Var.zn.equals(this.n3.n3());
    }

    public final void q5(long j, @Nullable ft.g gVar, int i) {
        if (v0.ut.zn(this.f9580co, gVar)) {
            return;
        }
        int i5 = (this.f9580co == null && i == 0) ? 1 : i;
        this.f9580co = gVar;
        ix(0, j, gVar, i5);
    }

    @Override // zo.zn
    public void q9(ft.im imVar, zn.n3 n3Var) {
        if (n3Var.gv() == 0) {
            return;
        }
        vp(n3Var);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        mp(imVar, n3Var);
        w9(jElapsedRealtime);
        x5(imVar, n3Var, jElapsedRealtime);
        oa(jElapsedRealtime);
        w2(imVar, n3Var, jElapsedRealtime);
        if (n3Var.y(1028)) {
            this.n3.s(n3Var.zn(1028));
        }
    }

    public LogSessionId qk() {
        return this.zn.getSessionId();
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

    public final void ro(long j, @Nullable ft.g gVar, int i) {
        if (v0.ut.zn(this.f9586mt, gVar)) {
            return;
        }
        int i5 = (this.f9586mt == null && i == 0) ? 1 : i;
        this.f9586mt = gVar;
        ix(1, j, gVar, i5);
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
        this.f9594x4 = cVar.y;
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

    public final void vp(zn.n3 n3Var) {
        for (int i = 0; i < n3Var.gv(); i++) {
            int iN3 = n3Var.n3(i);
            zn.y yVarZn = n3Var.zn(iN3);
            if (iN3 == 0) {
                this.n3.v(yVarZn);
            } else if (iN3 == 11) {
                this.n3.zn(yVarZn, this.f9581f);
            } else {
                this.n3.gv(yVarZn);
            }
        }
    }

    @Override // zo.zn
    public /* synthetic */ void w(zn.y yVar, ft.bv bvVar) {
        zo.n3.oz(this, yVar, bvVar);
    }

    public final void w2(ft.im imVar, zn.n3 n3Var, long j) {
        if (imVar.n3() != 2) {
            this.f9588r = false;
        }
        if (imVar.a() == null) {
            this.f9584i4 = false;
        } else if (n3Var.y(10)) {
            this.f9584i4 = true;
        }
        int iYk = yk(imVar);
        if (this.f9590t != iYk) {
            this.f9590t = iYk;
            this.d0 = true;
            this.zn.reportPlaybackStateEvent(rb.y().setState(this.f9590t).setTimeSinceCreatedMillis(j - this.f9583gv).build());
        }
    }

    public final void w9(long j) {
        ft.bv bvVar = this.f9593wz;
        if (bvVar == null) {
            return;
        }
        y yVarAd = ad(bvVar, this.y, this.f9594x4 == 4);
        this.zn.reportPlaybackErrorEvent(o0.y().setTimeSinceCreatedMillis(j - this.f9583gv).setErrorCode(yVarAd.y).setSubErrorCode(yVarAd.n3).setException(bvVar).build());
        this.d0 = true;
        this.f9593wz = null;
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

    public final void x5(ft.im imVar, zn.n3 n3Var, long j) {
        if (n3Var.y(2)) {
            gi giVarFh = imVar.fh();
            boolean zGv = giVarFh.gv(2);
            boolean zGv2 = giVarFh.gv(1);
            boolean zGv3 = giVarFh.gv(3);
            if (zGv || zGv2 || zGv3) {
                if (!zGv) {
                    ro(j, null, 0);
                }
                if (!zGv2) {
                    q5(j, null, 0);
                }
                if (!zGv3) {
                    le(j, null, 0);
                }
            }
        }
        if (pz(this.f9595xc)) {
            n3 n3Var2 = this.f9595xc;
            ft.g gVar = n3Var2.y;
            if (gVar.f4780ej != -1) {
                ro(j, gVar, n3Var2.n3);
                this.f9595xc = null;
            }
        }
        if (pz(this.w)) {
            n3 n3Var3 = this.w;
            q5(j, n3Var3.y, n3Var3.n3);
            this.w = null;
        }
        if (pz(this.f9587p)) {
            n3 n3Var4 = this.f9587p;
            le(j, n3Var4.y, n3Var4.n3);
            this.f9587p = null;
        }
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

    public final int yk(ft.im imVar) {
        int iN3 = imVar.n3();
        if (this.f9588r) {
            return 5;
        }
        if (this.f9584i4) {
            return 13;
        }
        if (iN3 == 4) {
            return 11;
        }
        if (iN3 == 2) {
            int i = this.f9590t;
            if (i == 0 || i == 2) {
                return 2;
            }
            if (imVar.k()) {
                return imVar.k5() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iN3 == 3) {
            if (imVar.k()) {
                return imVar.k5() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iN3 != 1 || this.f9590t == 0) {
            return this.f9590t;
        }
        return 12;
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

    @Override // zo.hk.y
    public void t(zn.y yVar, String str) {
    }

    @Override // zo.hk.y
    public void c(zn.y yVar, String str, String str2) {
    }
}

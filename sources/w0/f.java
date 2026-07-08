package w0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.ConnectionResult;
import ft.g;
import ft.k3;
import ft.u0;
import i7.rz;
import i7.t;
import java.nio.ByteBuffer;
import java.util.List;
import v0.j5;
import v0.ut;
import w0.fh;

/* JADX INFO: loaded from: classes.dex */
public class f extends i7.x4 {
    public static boolean jb;
    public static final int[] jt = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean sw;

    /* JADX INFO: renamed from: br, reason: collision with root package name */
    public boolean f8869br;

    /* JADX INFO: renamed from: bv, reason: collision with root package name */
    @Nullable
    public Surface f8870bv;

    /* JADX INFO: renamed from: c8, reason: collision with root package name */
    public long f8871c8;
    public boolean cx;
    public float dp;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    @Nullable
    public PlaceholderSurface f8872fc;

    /* JADX INFO: renamed from: gf, reason: collision with root package name */
    public boolean f8873gf;

    /* JADX INFO: renamed from: gn, reason: collision with root package name */
    public int f8874gn;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8875h;

    /* JADX INFO: renamed from: hk, reason: collision with root package name */
    public long f8876hk;

    @Nullable
    public mg hr;

    @Nullable
    public zn hy;
    public int i;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final Context f8877i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public final w f8878i3;

    /* JADX INFO: renamed from: ia, reason: collision with root package name */
    public long f8879ia;

    /* JADX INFO: renamed from: ic, reason: collision with root package name */
    public long f8880ic;

    /* JADX INFO: renamed from: im, reason: collision with root package name */
    public boolean f8881im;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public final long f8882j3;

    /* JADX INFO: renamed from: jr, reason: collision with root package name */
    public int f8883jr;
    public long k3;

    /* JADX INFO: renamed from: mh, reason: collision with root package name */
    public boolean f8884mh;

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public boolean f8885n7;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    public boolean f8886nd;

    /* JADX INFO: renamed from: ne, reason: collision with root package name */
    public final int f8887ne;
    public int p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f8888q;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public int f8889r6;
    public int rv;

    /* JADX INFO: renamed from: uo, reason: collision with root package name */
    public int f8890uo;
    public long vc;
    public int vh;

    /* JADX INFO: renamed from: vn, reason: collision with root package name */
    public final fh.y f8891vn;

    /* JADX INFO: renamed from: wm, reason: collision with root package name */
    public n3 f8892wm;

    @Nullable
    public wz xq;
    public int zq;

    public static final class n3 {
        public final int n3;
        public final int y;
        public final int zn;

        public n3(int i, int i5, int i8) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
        }
    }

    public static final class y {
        public static boolean y(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class zn implements t.zn, Handler.Callback {
        public final Handler y;

        public zn(i7.t tVar) {
            Handler handlerF3 = ut.f3(this);
            this.y = handlerF3;
            tVar.fb(this, handlerF3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            n3(ut.ne(message.arg1, message.arg2));
            return true;
        }

        public final void n3(long j) {
            f fVar = f.this;
            if (this != fVar.hy || fVar.s8() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                f.this.hb();
                return;
            }
            try {
                f.this.zh(j);
            } catch (ft.p e4) {
                f.this.wm(e4);
            }
        }

        @Override // i7.t.zn
        public void y(i7.t tVar, long j, long j4) {
            if (ut.y >= 30) {
                n3(j);
            } else {
                this.y.sendMessageAtFrontOfQueue(Message.obtain(this.y, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    public f(Context context, i7.f3 f3Var, long j, boolean z, @Nullable Handler handler, @Nullable fh fhVar, int i) {
        this(context, t.n3.y, f3Var, j, z, handler, fhVar, i, 30.0f);
    }

    public static int cx(int i, int i5) {
        return (i * 3) / (i5 * 2);
    }

    public static List<i7.z> dp(Context context, i7.f3 f3Var, g gVar, boolean z, boolean z5) throws rz.zn {
        String str = gVar.f3;
        if (str == null) {
            return k4.r.yt();
        }
        List<i7.z> decoderInfos = f3Var.getDecoderInfos(str, z, z5);
        String strTl = i7.rz.tl(gVar);
        if (strTl == null) {
            return k4.r.rz(decoderInfos);
        }
        List<i7.z> decoderInfos2 = f3Var.getDecoderInfos(strTl, z, z5);
        return (ut.y < 26 || !"video/dolby-vision".equals(gVar.f3) || decoderInfos2.isEmpty() || y.y(context)) ? k4.r.n().i9(decoderInfos).i9(decoderInfos2).f() : k4.r.rz(decoderInfos2);
    }

    public static int hr(i7.z zVar, g gVar) {
        if (gVar.n == -1) {
            return p1(zVar, gVar);
        }
        int size = gVar.c.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += gVar.c.get(i).length;
        }
        return gVar.n + length;
    }

    public static boolean hy(long j) {
        return j < -30000;
    }

    @Nullable
    public static Point i(i7.z zVar, g gVar) {
        int i = gVar.f4780ej;
        int i5 = gVar.f4779d;
        boolean z = i > i5;
        int i8 = z ? i : i5;
        if (z) {
            i = i5;
        }
        float f3 = i / i8;
        for (int i10 : jt) {
            int i11 = (int) (i10 * f3);
            if (i10 <= i8 || i11 <= i) {
                break;
            }
            if (ut.y >= 21) {
                int i12 = z ? i11 : i10;
                if (!z) {
                    i10 = i11;
                }
                Point pointZn = zVar.zn(i12, i10);
                if (zVar.n(pointZn.x, pointZn.y, gVar.f4792x)) {
                    return pointZn;
                }
            } else {
                try {
                    int iT = ut.t(i10, 16) * 16;
                    int iT2 = ut.t(i11, 16) * 16;
                    if (iT * iT2 <= i7.rz.yt()) {
                        int i13 = z ? iT2 : iT;
                        if (!z) {
                            iT = iT2;
                        }
                        return new Point(i13, iT);
                    }
                } catch (rz.zn unused) {
                }
            }
        }
        return null;
    }

    public static boolean ic() {
        return "NVIDIA".equals(ut.zn);
    }

    public static void k3(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int p1(i7.z r10, ft.g r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.p1(i7.z, ft.g):int");
    }

    public static void sx(i7.t tVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        tVar.c5(bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean vc() {
        /*
            Method dump skipped, instruction units count: 3184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.vc():boolean");
    }

    public static boolean xq(long j) {
        return j < -500000;
    }

    @Override // i7.x4, ft.a
    public void a8() {
        super.a8();
        this.f8889r6 = 0;
        this.f8879ia = SystemClock.elapsedRealtime();
        this.k3 = SystemClock.elapsedRealtime() * 1000;
        this.f8880ic = 0L;
        this.f8874gn = 0;
        this.f8878i3.f();
    }

    @Override // i7.x4
    @TargetApi(29)
    public void bk(di.fb fbVar) throws ft.p {
        if (this.f8873gf) {
            ByteBuffer byteBuffer = (ByteBuffer) v0.y.v(fbVar.f3182t);
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s3 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b6 = byteBuffer.get();
                byte b7 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s3 == 60 && s5 == 1 && b6 == 4) {
                    if (b7 == 0 || b7 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        sx(s8(), bArr);
                    }
                }
            }
        }
    }

    @Override // i7.x4
    public boolean bv(i7.z zVar) {
        return this.f8870bv != null || hj(zVar);
    }

    @Override // i7.x4
    public void cy(Exception exc) {
        v0.r.gv("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f8891vn.rz(exc);
    }

    @Override // i7.x4, ft.a
    public void d() {
        zq();
        jr();
        this.f8869br = false;
        this.hy = null;
        try {
            super.d();
        } finally {
            this.f8891vn.tl(this.f5542le);
        }
    }

    @Override // i7.x4, ft.a
    public void ej(long j, boolean z) throws ft.p {
        super.ej(j, z);
        jr();
        this.f8878i3.i9();
        this.f8876hk = -9223372036854775807L;
        this.f8871c8 = -9223372036854775807L;
        this.f8883jr = 0;
        if (z) {
            ux();
        } else {
            this.f8875h = -9223372036854775807L;
        }
    }

    @Override // ft.a, ft.h.n3
    public void f(int i, @Nullable Object obj) throws ft.p {
        if (i == 1) {
            vd(obj);
            return;
        }
        if (i == 7) {
            this.xq = (wz) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.vh != iIntValue) {
                this.vh = iIntValue;
                if (this.cx) {
                    ro();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                super.f(i, obj);
                return;
            } else {
                this.f8878i3.xc(((Integer) obj).intValue());
                return;
            }
        }
        this.f8890uo = ((Integer) obj).intValue();
        i7.t tVarS8 = s8();
        if (tVarS8 != null) {
            tVarS8.zn(this.f8890uo);
        }
    }

    public boolean fp(long j, long j4) {
        return hy(j) && j4 > 100000;
    }

    public void fq(i7.t tVar, int i, long j, long j4) {
        gi();
        j5.y("releaseOutputBuffer");
        tVar.i9(i, j4);
        j5.zn();
        this.k3 = SystemClock.elapsedRealtime() * 1000;
        this.f5542le.f3204v++;
        this.f8883jr = 0;
        sw();
    }

    @Override // ft.hk, ft.ic
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final void gi() {
        int i = this.p1;
        if (i == -1 && this.i == -1) {
            return;
        }
        mg mgVar = this.hr;
        if (mgVar != null && mgVar.y == i && mgVar.f8904v == this.i && mgVar.f8902fb == this.rv && mgVar.f8903s == this.dp) {
            return;
        }
        mg mgVar2 = new mg(this.p1, this.i, this.rv, this.dp);
        this.hr = mgVar2;
        this.f8891vn.mg(mgVar2);
    }

    public void gn(i7.t tVar, int i, long j) {
        j5.y("dropVideoBuffer");
        tVar.tl(i, false);
        j5.zn();
        hf(0, 1);
    }

    @Override // i7.x4
    public void gq(g gVar, @Nullable MediaFormat mediaFormat) {
        i7.t tVarS8 = s8();
        if (tVarS8 != null) {
            tVarS8.zn(this.f8890uo);
        }
        if (this.cx) {
            this.p1 = gVar.f4779d;
            this.i = gVar.f4780ej;
        } else {
            v0.y.v(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.p1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.i = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f3 = gVar.f4783hw;
        this.dp = f3;
        if (ut.y >= 21) {
            int i = gVar.f4777b;
            if (i == 90 || i == 270) {
                int i5 = this.p1;
                this.p1 = this.i;
                this.i = i5;
                this.dp = 1.0f / f3;
            }
        } else {
            this.rv = gVar.f4777b;
        }
        this.f8878i3.fb(gVar.f4792x);
    }

    public final void hb() {
        q();
    }

    public void hf(int i, int i5) {
        di.v vVar = this.f5542le;
        vVar.f3202s += i;
        int i8 = i + i5;
        vVar.f3199fb += i8;
        this.f8889r6 += i8;
        int i10 = this.f8883jr + i8;
        this.f8883jr = i10;
        vVar.f3197c5 = Math.max(i10, vVar.f3197c5);
        int i11 = this.f8887ne;
        if (i11 <= 0 || this.f8889r6 < i11) {
            return;
        }
        jb();
    }

    public final boolean hj(i7.z zVar) {
        return ut.y >= 23 && !this.cx && !hk(zVar.y) && (!zVar.f5565fb || PlaceholderSurface.n3(this.f8877i2));
    }

    public boolean hk(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (f.class) {
            try {
                if (!jb) {
                    sw = vc();
                    jb = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sw;
    }

    @Override // i7.x4, ft.hk
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && (this.f8881im || (((placeholderSurface = this.f8872fc) != null && this.f8870bv == placeholderSurface) || s8() == null || this.cx))) {
            this.f8875h = -9223372036854775807L;
            return true;
        }
        if (this.f8875h == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f8875h) {
            return true;
        }
        this.f8875h = -9223372036854775807L;
        return false;
    }

    public final void jb() {
        if (this.f8889r6 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f8891vn.wz(this.f8889r6, jElapsedRealtime - this.f8879ia);
            this.f8889r6 = 0;
            this.f8879ia = jElapsedRealtime;
        }
    }

    public final void jr() {
        i7.t tVarS8;
        this.f8881im = false;
        if (ut.y < 23 || !this.cx || (tVarS8 = s8()) == null) {
            return;
        }
        this.hy = new zn(tVarS8);
    }

    public boolean jt(long j, boolean z) throws ft.p {
        int iVl = vl(j);
        if (iVl == 0) {
            return false;
        }
        if (z) {
            di.v vVar = this.f5542le;
            vVar.f3200gv += iVl;
            vVar.f3196a += this.zq;
        } else {
            this.f5542le.f3201i9++;
            hf(iVl, this.zq);
        }
        nf();
        return true;
    }

    public boolean ks(long j, long j4, boolean z) {
        return hy(j) && !z;
    }

    @Override // i7.x4
    @Nullable
    public di.c5 l(u0 u0Var) throws ft.p {
        di.c5 c5VarL = super.l(u0Var);
        this.f8891vn.w(u0Var.n3, c5VarL);
        return c5VarL;
    }

    public final void l0() {
        mg mgVar = this.hr;
        if (mgVar != null) {
            this.f8891vn.mg(mgVar);
        }
    }

    @Override // i7.x4
    @TargetApi(ConnectionResult.SIGN_IN_FAILED)
    public t.y m(i7.z zVar, g gVar, @Nullable MediaCrypto mediaCrypto, float f3) {
        PlaceholderSurface placeholderSurface = this.f8872fc;
        if (placeholderSurface != null && placeholderSurface.y != zVar.f5565fb) {
            ob();
        }
        String str = zVar.zn;
        n3 n3VarRv = rv(zVar, gVar, mg());
        this.f8892wm = n3VarRv;
        MediaFormat mediaFormatVh = vh(gVar, str, n3VarRv, f3, this.f8888q, this.cx ? this.vh : 0);
        if (this.f8870bv == null) {
            if (!hj(zVar)) {
                throw new IllegalStateException();
            }
            if (this.f8872fc == null) {
                this.f8872fc = PlaceholderSurface.zn(this.f8877i2, zVar.f5565fb);
            }
            this.f8870bv = this.f8872fc;
        }
        return t.y.n3(zVar, mediaFormatVh, gVar, this.f8870bv, mediaCrypto);
    }

    @Override // i7.x4
    public void oa(long j) {
        super.oa(j);
        if (this.cx) {
            return;
        }
        this.zq--;
    }

    public final void ob() {
        Surface surface = this.f8870bv;
        PlaceholderSurface placeholderSurface = this.f8872fc;
        if (surface == placeholderSurface) {
            this.f8870bv = null;
        }
        placeholderSurface.release();
        this.f8872fc = null;
    }

    @Override // i7.x4
    public boolean q5(long j, long j4, @Nullable i7.t tVar, @Nullable ByteBuffer byteBuffer, int i, int i5, int i8, long j7, boolean z, boolean z5, g gVar) throws ft.p {
        long j8;
        boolean z7;
        v0.y.v(tVar);
        if (this.f8871c8 == -9223372036854775807L) {
            this.f8871c8 = j;
        }
        if (j7 != this.f8876hk) {
            this.f8878i3.s(j7);
            this.f8876hk = j7;
        }
        long jG = g();
        long j9 = j7 - jG;
        if (z && !z5) {
            sh(tVar, i, j9);
            return true;
        }
        double dU0 = u0();
        boolean z8 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j10 = (long) ((j7 - j) / dU0);
        if (z8) {
            j10 -= jElapsedRealtime - j4;
        }
        if (this.f8870bv == this.f8872fc) {
            if (!hy(j10)) {
                return false;
            }
            sh(tVar, i, j9);
            w7(j10);
            return true;
        }
        long j11 = jElapsedRealtime - this.k3;
        if (this.f8885n7 ? this.f8881im : !(z8 || this.f8884mh)) {
            j8 = j11;
            z7 = false;
        } else {
            j8 = j11;
            z7 = true;
        }
        if (this.f8875h == -9223372036854775807L && j >= jG && (z7 || (z8 && fp(j10, j8)))) {
            long jNanoTime = System.nanoTime();
            wo(j9, jNanoTime, gVar);
            if (ut.y >= 21) {
                fq(tVar, i, j9, jNanoTime);
            } else {
                vb(tVar, i, j9);
            }
            w7(j10);
            return true;
        }
        if (z8 && j != this.f8871c8) {
            long jNanoTime2 = System.nanoTime();
            long jN3 = this.f8878i3.n3((j10 * 1000) + jNanoTime2);
            long j12 = (jN3 - jNanoTime2) / 1000;
            boolean z9 = this.f8875h != -9223372036854775807L;
            if (rt(j12, j4, z5) && jt(j, z9)) {
                return false;
            }
            if (ks(j12, j4, z5)) {
                if (z9) {
                    sh(tVar, i, j9);
                } else {
                    gn(tVar, i, j9);
                }
                w7(j12);
                return true;
            }
            if (ut.y >= 21) {
                if (j12 < 50000) {
                    if (jN3 == this.vc) {
                        sh(tVar, i, j9);
                    } else {
                        wo(j9, jN3, gVar);
                        fq(tVar, i, j9, jN3);
                    }
                    w7(j12);
                    this.vc = jN3;
                    return true;
                }
            } else if (j12 < 30000) {
                if (j12 > 11000) {
                    try {
                        Thread.sleep((j12 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                wo(j9, jN3, gVar);
                vb(tVar, i, j9);
                w7(j12);
                return true;
            }
        }
        return false;
    }

    @Override // i7.x4
    public void qj(String str) {
        this.f8891vn.t(str);
    }

    @Override // i7.x4
    public void qk(String str, t.y yVar, long j, long j4) {
        this.f8891vn.f(str, j, j4);
        this.f8886nd = hk(str);
        this.f8873gf = ((i7.z) v0.y.v(ap())).mt();
        if (ut.y < 23 || !this.cx) {
            return;
        }
        this.hy = new zn((i7.t) v0.y.v(s8()));
    }

    @Override // i7.x4
    public di.c5 qn(i7.z zVar, g gVar, g gVar2) {
        di.c5 c5VarA = zVar.a(gVar, gVar2);
        int i = c5VarA.f3172v;
        int i5 = gVar2.f4779d;
        n3 n3Var = this.f8892wm;
        if (i5 > n3Var.y || gVar2.f4780ej > n3Var.n3) {
            i |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (hr(zVar, gVar2) > this.f8892wm.zn) {
            i |= 64;
        }
        int i8 = i;
        return new di.c5(zVar.y, gVar, gVar2, i8 != 0 ? 0 : c5VarA.f3171gv, i8);
    }

    @Override // i7.x4
    public List<i7.z> rb(i7.f3 f3Var, g gVar, boolean z) throws rz.zn {
        return i7.rz.r(dp(this.f8877i2, f3Var, gVar, z, this.cx), gVar);
    }

    public boolean rt(long j, long j4, boolean z) {
        return xq(j) && !z;
    }

    public n3 rv(i7.z zVar, g gVar, g[] gVarArr) {
        int iP1;
        int iMax = gVar.f4779d;
        int iMax2 = gVar.f4780ej;
        int iHr = hr(zVar, gVar);
        if (gVarArr.length == 1) {
            if (iHr != -1 && (iP1 = p1(zVar, gVar)) != -1) {
                iHr = Math.min((int) (iHr * 1.5f), iP1);
            }
            return new n3(iMax, iMax2, iHr);
        }
        int length = gVarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            g gVarZ6 = gVarArr[i];
            if (gVar.o != null && gVarZ6.o == null) {
                gVarZ6 = gVarZ6.n3().b(gVar.o).z6();
            }
            if (zVar.a(gVar, gVarZ6).f3171gv != 0) {
                int i5 = gVarZ6.f4779d;
                z |= i5 == -1 || gVarZ6.f4780ej == -1;
                iMax = Math.max(iMax, i5);
                iMax2 = Math.max(iMax2, gVarZ6.f4780ej);
                iHr = Math.max(iHr, hr(zVar, gVarZ6));
            }
        }
        if (z) {
            v0.r.c5("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointI = i(zVar, gVar);
            if (pointI != null) {
                iMax = Math.max(iMax, pointI.x);
                iMax2 = Math.max(iMax2, pointI.y);
                iHr = Math.max(iHr, p1(zVar, gVar.n3().s8(iMax).o(iMax2).z6()));
                v0.r.c5("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new n3(iMax, iMax2, iHr);
    }

    public void sh(i7.t tVar, int i, long j) {
        j5.y("skipVideoBuffer");
        tVar.tl(i, false);
        j5.zn();
        this.f5542le.f3196a++;
    }

    public void sw() {
        this.f8885n7 = true;
        if (this.f8881im) {
            return;
        }
        this.f8881im = true;
        this.f8891vn.d0(this.f8870bv);
        this.f8869br = true;
    }

    public void t5(i7.t tVar, Surface surface) {
        tVar.v(surface);
    }

    @Override // i7.x4
    public i7.tl u(Throwable th, @Nullable i7.z zVar) {
        return new fb(th, zVar, this.f8870bv);
    }

    @Override // i7.x4, ft.a
    @TargetApi(ConnectionResult.SIGN_IN_FAILED)
    public void ud() {
        try {
            super.ud();
        } finally {
            if (this.f8872fc != null) {
                ob();
            }
        }
    }

    @Override // i7.x4
    public int uo(i7.f3 f3Var, g gVar) throws rz.zn {
        boolean z;
        int i = 0;
        if (!v0.n.co(gVar.f3)) {
            return k3.y(0);
        }
        boolean z5 = gVar.d0 != null;
        List<i7.z> listDp = dp(this.f8877i2, f3Var, gVar, z5, false);
        if (z5 && listDp.isEmpty()) {
            listDp = dp(this.f8877i2, f3Var, gVar, false, false);
        }
        if (listDp.isEmpty()) {
            return k3.y(1);
        }
        if (!i7.x4.im(gVar)) {
            return k3.y(2);
        }
        i7.z zVar = listDp.get(0);
        boolean zP = zVar.p(gVar);
        if (zP) {
            z = true;
        } else {
            for (int i5 = 1; i5 < listDp.size(); i5++) {
                i7.z zVar2 = listDp.get(i5);
                if (zVar2.p(gVar)) {
                    zVar = zVar2;
                    z = false;
                    zP = true;
                    break;
                }
            }
            z = true;
        }
        int i8 = zP ? 4 : 3;
        int i10 = zVar.z(gVar) ? 16 : 8;
        int i11 = zVar.f5568s ? 64 : 0;
        int i12 = z ? 128 : 0;
        if (ut.y >= 26 && "video/dolby-vision".equals(gVar.f3) && !y.y(this.f8877i2)) {
            i12 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zP) {
            List<i7.z> listDp2 = dp(this.f8877i2, f3Var, gVar, z5, true);
            if (!listDp2.isEmpty()) {
                i7.z zVar3 = i7.rz.r(listDp2, gVar).get(0);
                if (zVar3.p(gVar) && zVar3.z(gVar)) {
                    i = 32;
                }
            }
        }
        return k3.zn(i8, i10, i, i11, i12);
    }

    public final void ux() {
        this.f8875h = this.f8882j3 > 0 ? SystemClock.elapsedRealtime() + this.f8882j3 : -9223372036854775807L;
    }

    public final void v1() {
        int i = this.f8874gn;
        if (i != 0) {
            this.f8891vn.fh(this.f8880ic, i);
            this.f8880ic = 0L;
            this.f8874gn = 0;
        }
    }

    public void vb(i7.t tVar, int i, long j) {
        gi();
        j5.y("releaseOutputBuffer");
        tVar.tl(i, true);
        j5.zn();
        this.k3 = SystemClock.elapsedRealtime() * 1000;
        this.f5542le.f3204v++;
        this.f8883jr = 0;
        sw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [w0.w] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ft.a, i7.x4, w0.f] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void vd(@Nullable Object obj) throws ft.p {
        ?? Zn = obj instanceof Surface ? (Surface) obj : 0;
        if (Zn == 0) {
            PlaceholderSurface placeholderSurface = this.f8872fc;
            if (placeholderSurface != null) {
                Zn = placeholderSurface;
            } else {
                i7.z zVarAp = ap();
                if (zVarAp != null && hj(zVarAp)) {
                    Zn = PlaceholderSurface.zn(this.f8877i2, zVarAp.f5565fb);
                    this.f8872fc = Zn;
                }
            }
        }
        if (this.f8870bv == Zn) {
            if (Zn == 0 || Zn == this.f8872fc) {
                return;
            }
            l0();
            zx();
            return;
        }
        this.f8870bv = Zn;
        this.f8878i3.tl(Zn);
        this.f8869br = false;
        int state = getState();
        i7.t tVarS8 = s8();
        if (tVarS8 != null) {
            if (ut.y < 23 || Zn == 0 || this.f8886nd) {
                ro();
                wf();
            } else {
                t5(tVarS8, Zn);
            }
        }
        if (Zn == 0 || Zn == this.f8872fc) {
            zq();
            jr();
            return;
        }
        l0();
        jr();
        if (state == 2) {
            ux();
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat vh(g gVar, String str, n3 n3Var, float f3, boolean z, int i) {
        Pair<Integer, Integer> pairP;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", gVar.f4779d);
        mediaFormat.setInteger("height", gVar.f4780ej);
        v0.f3.v(mediaFormat, gVar.c);
        v0.f3.zn(mediaFormat, "frame-rate", gVar.f4792x);
        v0.f3.gv(mediaFormat, "rotation-degrees", gVar.f4777b);
        v0.f3.n3(mediaFormat, gVar.o);
        if ("video/dolby-vision".equals(gVar.f3) && (pairP = i7.rz.p(gVar)) != null) {
            v0.f3.gv(mediaFormat, "profile", ((Integer) pairP.first).intValue());
        }
        mediaFormat.setInteger("max-width", n3Var.y);
        mediaFormat.setInteger("max-height", n3Var.n3);
        v0.f3.gv(mediaFormat, "max-input-size", n3Var.zn);
        if (ut.y >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f3 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f3);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            k3(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // i7.x4, ft.a, ft.hk
    public void w(float f3, float f4) throws ft.p {
        super.w(f3, f4);
        this.f8878i3.c5(f3);
    }

    @Override // i7.x4
    public void w2(di.fb fbVar) throws ft.p {
        boolean z = this.cx;
        if (!z) {
            this.zq++;
        }
        if (ut.y >= 23 || !z) {
            return;
        }
        zh(fbVar.f3178f);
    }

    public void w7(long j) {
        this.f5542le.y(j);
        this.f8880ic += j;
        this.f8874gn++;
    }

    @Override // i7.x4
    public void w9() {
        super.w9();
        jr();
    }

    public final void wo(long j, long j4, g gVar) {
        wz wzVar = this.xq;
        if (wzVar != null) {
            wzVar.n3(j, j4, gVar, kp());
        }
    }

    @Override // i7.x4, ft.a
    public void x() {
        this.f8875h = -9223372036854775807L;
        jb();
        v1();
        this.f8878i3.t();
        super.x();
    }

    @Override // i7.x4
    public float yc(float f3, g gVar, g[] gVarArr) {
        float fMax = -1.0f;
        for (g gVar2 : gVarArr) {
            float f4 = gVar2.f4792x;
            if (f4 != -1.0f) {
                fMax = Math.max(fMax, f4);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f3;
    }

    @Override // i7.x4
    public boolean yg() {
        return this.cx && ut.y < 23;
    }

    @Override // i7.x4
    public void yk() {
        super.yk();
        this.zq = 0;
    }

    @Override // i7.x4, ft.a
    public void z6(boolean z, boolean z5) throws ft.p {
        super.z6(z, z5);
        boolean z7 = c().y;
        v0.y.fb((z7 && this.vh == 0) ? false : true);
        if (this.cx != z7) {
            this.cx = z7;
            ro();
        }
        this.f8891vn.xc(this.f5542le);
        this.f8884mh = z5;
        this.f8885n7 = false;
    }

    public void zh(long j) throws ft.p {
        c8(j);
        gi();
        this.f5542le.f3204v++;
        sw();
        oa(j);
    }

    public final void zq() {
        this.hr = null;
    }

    public final void zx() {
        if (this.f8869br) {
            this.f8891vn.d0(this.f8870bv);
        }
    }

    public f(Context context, t.n3 n3Var, i7.f3 f3Var, long j, boolean z, @Nullable Handler handler, @Nullable fh fhVar, int i) {
        this(context, n3Var, f3Var, j, z, handler, fhVar, i, 30.0f);
    }

    public f(Context context, t.n3 n3Var, i7.f3 f3Var, long j, boolean z, @Nullable Handler handler, @Nullable fh fhVar, int i, float f3) {
        super(2, n3Var, f3Var, z, f3);
        this.f8882j3 = j;
        this.f8887ne = i;
        Context applicationContext = context.getApplicationContext();
        this.f8877i2 = applicationContext;
        this.f8878i3 = new w(applicationContext);
        this.f8891vn = new fh.y(handler, fhVar);
        this.f8888q = ic();
        this.f8875h = -9223372036854775807L;
        this.p1 = -1;
        this.i = -1;
        this.dp = -1.0f;
        this.f8890uo = 1;
        this.vh = 0;
        zq();
    }
}

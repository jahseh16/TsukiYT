package mn;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.internal.Code;
import ft.co;
import ft.g;
import ft.uo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import mn.ej;
import mn.i4;
import mn.n;
import mn.s;
import v0.ut;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public final class mg implements i4 {
    public static final Object ct = new Object();
    public static boolean dm = false;

    @Nullable
    public static ExecutorService o4;
    public static int rs;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn.s[] f6575a;

    /* JADX INFO: renamed from: a8, reason: collision with root package name */
    public long f6576a8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mn.s[] f6577b;
    public uo c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final n f6578c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public i4.zn f6579co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6580d;

    @Nullable
    public ByteBuffer d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public boolean f6581ej;

    @Nullable
    public gv en;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6582f;

    @Nullable
    public f f3;
    public c f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final mn.s[] f6583fb;
    public int fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final fh f6584gv;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    @Nullable
    public ByteBuffer f6585hw;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public mn.v f6586i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final ArrayDeque<f> f6587i9;
    public boolean j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public byte[] f6588j5;
    public boolean jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6589k;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public ByteBuffer[] f6590k5;
    public long mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public gn f6591mt;
    public f n;
    public final mn.c5 n3;
    public int o;
    public boolean oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final co.y f6592p;
    public boolean q9;
    public int qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f6593r;
    public long rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v0.s f6594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6595t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public long f6596ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public wz f6597tl;
    public long u;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public boolean f6598ud;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public boolean f6599ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f6600v;
    public int vl;
    public final a w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public final t<i4.n3> f6601wz;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f6602x;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    @Nullable
    public AudioTrack f6603x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final t<i4.v> f6604xc;
    public boolean xg;
    public final mn.fb y;
    public boolean y5;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    @Nullable
    public ByteBuffer f6605yt;

    @Nullable
    public s z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public int f6606z6;
    public final boolean zn;

    public interface a {
        public static final a y = new ej.y().fb();

        int y(int i, int i5, int i8, int i10, int i11, int i12, double d4);
    }

    public static class c5 implements v {
        public final j5 n3;
        public final mn.s[] y;
        public final o zn;

        public c5(mn.s... sVarArr) {
            this(sVarArr, new j5(), new o());
        }

        @Override // mn.c5
        public boolean gv(boolean z) {
            this.n3.x4(z);
            return z;
        }

        @Override // mn.c5
        public mn.s[] n3() {
            return this.y;
        }

        @Override // mn.c5
        public uo v(uo uoVar) {
            this.zn.c5(uoVar.y);
            this.zn.s(uoVar.f5061v);
            return uoVar;
        }

        @Override // mn.c5
        public long y(long j) {
            return this.zn.fb(j);
        }

        @Override // mn.c5
        public long zn() {
            return this.n3.w();
        }

        public c5(mn.s[] sVarArr, j5 j5Var, o oVar) {
            mn.s[] sVarArr2 = new mn.s[sVarArr.length + 2];
            this.y = sVarArr2;
            System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            this.n3 = j5Var;
            this.zn = oVar;
            sVarArr2[sVarArr.length] = j5Var;
            sVarArr2[sVarArr.length + 1] = oVar;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final long f6607gv;
        public final boolean n3;
        public final uo y;
        public final long zn;

        public f(uo uoVar, boolean z, long j, long j4) {
            this.y = uoVar;
            this.n3 = z;
            this.zn = j;
            this.f6607gv = j4;
        }
    }

    public static final class fb {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        @Nullable
        public co.y f6609fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f6610gv;

        @Nullable
        public mn.c5 n3;
        public boolean zn;
        public mn.fb y = mn.fb.zn;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f6611v = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f6608a = a.y;

        public mg a() {
            if (this.n3 == null) {
                this.n3 = new c5(new mn.s[0]);
            }
            return new mg(this);
        }

        public fb c5(boolean z) {
            this.f6610gv = z;
            return this;
        }

        public fb f(int i) {
            this.f6611v = i;
            return this;
        }

        public fb fb(mn.fb fbVar) {
            v0.y.v(fbVar);
            this.y = fbVar;
            return this;
        }

        public fb i9(boolean z) {
            this.zn = z;
            return this;
        }

        public fb s(mn.c5 c5Var) {
            v0.y.v(c5Var);
            this.n3 = c5Var;
            return this;
        }
    }

    public static final class gv {
        public final AudioDeviceInfo y;

        public gv(AudioDeviceInfo audioDeviceInfo) {
            this.y = audioDeviceInfo;
        }
    }

    public static final class i9 extends RuntimeException {
        public i9(String str) {
            super(str);
        }
    }

    public static final class n3 {
        public static void y(AudioTrack audioTrack, @Nullable gv gvVar) {
            audioTrack.setPreferredDevice(gvVar == null ? null : gvVar.y);
        }
    }

    public static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6612a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final mn.s[] f6613c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int f6614fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6615gv;
        public final int n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f6616s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f6617v;
        public final g y;
        public final int zn;

        public s(g gVar, int i, int i5, int i8, int i10, int i11, int i12, int i13, mn.s[] sVarArr) {
            this.y = gVar;
            this.n3 = i;
            this.zn = i5;
            this.f6615gv = i8;
            this.f6617v = i10;
            this.f6612a = i11;
            this.f6614fb = i12;
            this.f6616s = i13;
            this.f6613c5 = sVarArr;
        }

        public static AudioAttributes c5(mn.v vVar, boolean z) {
            return z ? i9() : vVar.n3().y;
        }

        public static AudioAttributes i9() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public final AudioTrack a(boolean z, mn.v vVar, int i) {
            return cx.x.y(cx.a8.y(cx.ud.y(cx.ej.y(cx.z6.y(cx.d.y(cx.ta.y(cx.b.y(), c5(vVar, z)), mg.k5(this.f6617v, this.f6612a, this.f6614fb)), 1), this.f6616s), i), this.zn == 1));
        }

        public long f(long j) {
            return (j * 1000000) / ((long) this.y.oz);
        }

        public final AudioTrack fb(mn.v vVar, int i) {
            int iRs = ut.rs(vVar.f6689fb);
            return i == 0 ? new AudioTrack(iRs, this.f6617v, this.f6612a, this.f6614fb, this.f6616s, 1) : new AudioTrack(iRs, this.f6617v, this.f6612a, this.f6614fb, this.f6616s, 1, i);
        }

        public final AudioTrack gv(boolean z, mn.v vVar, int i) {
            int i5 = ut.y;
            return i5 >= 29 ? a(z, vVar, i) : i5 >= 21 ? v(z, vVar, i) : fb(vVar, i);
        }

        public boolean n3(s sVar) {
            return sVar.zn == this.zn && sVar.f6614fb == this.f6614fb && sVar.f6617v == this.f6617v && sVar.f6612a == this.f6612a && sVar.f6615gv == this.f6615gv;
        }

        public long s(long j) {
            return (j * 1000000) / ((long) this.f6617v);
        }

        public boolean t() {
            return this.zn == 1;
        }

        public final AudioTrack v(boolean z, mn.v vVar, int i) {
            return new AudioTrack(c5(vVar, z), mg.k5(this.f6617v, this.f6612a, this.f6614fb), this.f6616s, 1, i);
        }

        public AudioTrack y(boolean z, mn.v vVar, int i) throws i4.n3 {
            try {
                AudioTrack audioTrackGv = gv(z, vVar, i);
                int state = audioTrackGv.getState();
                if (state == 1) {
                    return audioTrackGv;
                }
                try {
                    audioTrackGv.release();
                } catch (Exception unused) {
                }
                throw new i4.n3(state, this.f6617v, this.f6612a, this.f6616s, this.y, t(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e4) {
                throw new i4.n3(0, this.f6617v, this.f6612a, this.f6616s, this.y, t(), e4);
            }
        }

        public s zn(int i) {
            return new s(this.y, this.n3, this.zn, this.f6615gv, this.f6617v, this.f6612a, this.f6614fb, i, this.f6613c5);
        }
    }

    public static final class t<T extends Exception> {

        @Nullable
        public T n3;
        public final long y;
        public long zn;

        public t(long j) {
            this.y = j;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void n3(T t3) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.n3 == null) {
                this.n3 = t3;
                this.zn = this.y + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.zn) {
                T t5 = this.n3;
                if (t5 != t3) {
                    t5.addSuppressed(t3);
                }
                T t6 = this.n3;
                y();
                throw t6;
            }
        }

        public void y() {
            this.n3 = null;
        }
    }

    public final class tl implements n.y {
        public tl() {
        }

        @Override // mn.n.y
        public void fb(long j) {
            if (mg.this.f6579co != null) {
                mg.this.f6579co.fb(j);
            }
        }

        @Override // mn.n.y
        public void gv(long j, long j4, long j7, long j8) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j4 + ", " + j7 + ", " + j8 + ", " + mg.this.j() + ", " + mg.this.oz();
            if (mg.dm) {
                throw new i9(str);
            }
            v0.r.c5("DefaultAudioSink", str);
        }

        @Override // mn.n.y
        public void n3(long j) {
            v0.r.c5("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        @Override // mn.n.y
        public void y(int i, long j) {
            if (mg.this.f6579co != null) {
                mg.this.f6579co.c(i, j, SystemClock.elapsedRealtime() - mg.this.u);
            }
        }

        @Override // mn.n.y
        public void zn(long j, long j4, long j7, long j8) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j4 + ", " + j7 + ", " + j8 + ", " + mg.this.j() + ", " + mg.this.oz();
            if (mg.dm) {
                throw new i9(str);
            }
            v0.r.c5("DefaultAudioSink", str);
        }
    }

    @Deprecated
    public interface v extends mn.c5 {
    }

    public final class wz {
        public final AudioTrack.StreamEventCallback n3;
        public final Handler y = new Handler(Looper.myLooper());

        public class y extends AudioTrack.StreamEventCallback {
            public final /* synthetic */ mg y;

            public y(mg mgVar) {
                this.y = mgVar;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                if (audioTrack.equals(mg.this.f6603x4) && mg.this.f6579co != null && mg.this.f6599ut) {
                    mg.this.f6579co.rz();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(mg.this.f6603x4) && mg.this.f6579co != null && mg.this.f6599ut) {
                    mg.this.f6579co.rz();
                }
            }
        }

        public wz() {
            this.n3 = new y(mg.this);
        }

        public void n3(AudioTrack audioTrack) {
            cx.k5.y(audioTrack, this.n3);
            this.y.removeCallbacksAndMessages(null);
        }

        public void y(AudioTrack audioTrack) {
            Handler handler = this.y;
            Objects.requireNonNull(handler);
            cx.yt.y(audioTrack, new cx.vl(handler), this.n3);
        }
    }

    public static final class zn {
        public static void y(AudioTrack audioTrack, gn gnVar) {
            LogSessionId logSessionIdY = gnVar.y();
            if (logSessionIdY.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdY);
        }
    }

    public static void dm(final AudioTrack audioTrack, final v0.s sVar) {
        sVar.gv();
        synchronized (ct) {
            try {
                if (o4 == null) {
                    o4 = ut.wf("ExoPlayer:AudioTrackReleaseThread");
                }
                rs++;
                o4.execute(new Runnable() { // from class: mn.rz
                    @Override // java.lang.Runnable
                    public final void run() {
                        mg.en(audioTrack, sVar);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void en(AudioTrack audioTrack, v0.s sVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            sVar.a();
            synchronized (ct) {
                try {
                    int i = rs - 1;
                    rs = i;
                    if (i == 0) {
                        o4.shutdown();
                        o4 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            sVar.a();
            synchronized (ct) {
                try {
                    int i5 = rs - 1;
                    rs = i5;
                    if (i5 == 0) {
                        o4.shutdown();
                        o4 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public static boolean f7(AudioTrack audioTrack) {
        return ut.y >= 29 && cx.x4.y(audioTrack);
    }

    public static int hw(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return mn.n3.v(byteBuffer);
            case 7:
            case 8:
                return ud.v(byteBuffer);
            case 9:
                int iTl = yt.tl(ut.ud(byteBuffer, byteBuffer.position()));
                if (iTl != -1) {
                    return iTl;
                }
                throw new IllegalArgumentException();
            case 10:
                return UserMetadata.MAX_ATTRIBUTE_SIZE;
            case 11:
            case Code.UNIMPLEMENTED /* 12 */:
                return 2048;
            case 13:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i);
            case 14:
                int iN3 = mn.n3.n3(byteBuffer);
                if (iN3 == -1) {
                    return 0;
                }
                return mn.n3.c5(byteBuffer, iN3) * 16;
            case 15:
                return NotificationCompat.FLAG_GROUP_SUMMARY;
            case 16:
                return UserMetadata.MAX_ATTRIBUTE_SIZE;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                return mn.zn.zn(byteBuffer);
            case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                return vl.fb(byteBuffer);
        }
    }

    public static AudioFormat k5(int i, int i5, int i8) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i5).setEncoding(i8).build();
    }

    public static void lc(AudioTrack audioTrack, float f3) {
        audioTrack.setVolume(f3);
    }

    public static void nf(AudioTrack audioTrack, float f3) {
        audioTrack.setStereoVolume(f3, f3);
    }

    public static boolean q9(int i) {
        return (ut.y >= 24 && i == -6) || i == -32;
    }

    public static int vl(int i, int i5, int i8) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i5, i8);
        v0.y.fb(minBufferSize != -2);
        return minBufferSize;
    }

    public static int yc(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @Override // mn.i4
    public boolean a() {
        return !k() || (this.j && !i9());
    }

    public final AudioTrack a8() throws i4.n3 {
        try {
            return ud((s) v0.y.v(this.f6593r));
        } catch (i4.n3 e4) {
            s sVar = this.f6593r;
            if (sVar.f6616s > 1000000) {
                s sVarZn = sVar.zn(1000000);
                try {
                    AudioTrack audioTrackUd = ud(sVarZn);
                    this.f6593r = sVarZn;
                    return audioTrackUd;
                } catch (i4.n3 e5) {
                    e4.addSuppressed(e5);
                    jz();
                    throw e4;
                }
            }
            jz();
            throw e4;
        }
    }

    public final boolean ap(g gVar, mn.v vVar) {
        int iA;
        int iZ6;
        int iQn;
        if (ut.y < 29 || this.f6595t == 0 || (iA = v0.n.a((String) v0.y.v(gVar.f3), gVar.f4778co)) == 0 || (iZ6 = ut.z6(gVar.j)) == 0 || (iQn = qn(k5(gVar.oz, iZ6, iA), vVar.n3().y)) == 0) {
            return false;
        }
        if (iQn == 1) {
            return ((gVar.q9 != 0 || gVar.f4785k != 0) && (this.f6595t == 1)) ? false : true;
        }
        if (iQn == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public final void b() {
        int i = 0;
        while (true) {
            mn.s[] sVarArr = this.f6577b;
            if (i >= sVarArr.length) {
                return;
            }
            mn.s sVar = sVarArr[i];
            sVar.flush();
            this.f6590k5[i] = sVar.n3();
            i++;
        }
    }

    @Override // mn.i4
    public void c5(@Nullable AudioDeviceInfo audioDeviceInfo) {
        gv gvVar = audioDeviceInfo == null ? null : new gv(audioDeviceInfo);
        this.en = gvVar;
        AudioTrack audioTrack = this.f6603x4;
        if (audioTrack != null) {
            n3.y(audioTrack, gvVar);
        }
    }

    @Override // mn.i4
    public int co(g gVar) {
        if (!"audio/raw".equals(gVar.f3)) {
            return ((this.y5 || !ap(gVar, this.f6586i4)) && !this.y.s(gVar)) ? 0 : 2;
        }
        if (ut.u0(gVar.f4790ut)) {
            int i = gVar.f4790ut;
            return (i == 2 || (this.zn && i == 4)) ? 2 : 1;
        }
        v0.r.c5("DefaultAudioSink", "Invalid PCM encoding: " + gVar.f4790ut);
        return 0;
    }

    public final void ct() {
        this.rz = 0L;
        this.mg = 0L;
        this.f6596ta = 0L;
        this.f6580d = 0L;
        this.xg = false;
        this.f6606z6 = 0;
        this.n = new f(yt(), o(), 0L, 0L);
        this.f6576a8 = 0L;
        this.f3 = null;
        this.f6587i9.clear();
        this.f6605yt = null;
        this.vl = 0;
        this.f6585hw = null;
        this.oz = false;
        this.j = false;
        this.o = -1;
        this.d0 = null;
        this.fh = 0;
        this.f6600v.wz();
        b();
    }

    public final void d(long j) {
        uo uoVarV = e() ? this.n3.v(yt()) : uo.f5058s;
        boolean zGv = e() ? this.n3.gv(o()) : false;
        this.f6587i9.add(new f(uoVarV, zGv, Math.max(0L, j), this.f6593r.s(oz())));
        ra();
        i4.zn znVar = this.f6579co;
        if (znVar != null) {
            znVar.onSkipSilenceEnabledChanged(zGv);
        }
    }

    @Override // mn.i4
    public void d0() {
        v0.y.fb(ut.y >= 21);
        v0.y.fb(this.q9);
        if (this.jz) {
            return;
        }
        this.jz = true;
        flush();
    }

    public final boolean e() {
        return (this.jz || !"audio/raw".equals(this.f6593r.y.f3) || s8(this.f6593r.y.f4790ut)) ? false : true;
    }

    public final void eb() {
        if (k()) {
            if (ut.y >= 21) {
                lc(this.f6603x4, this.f6602x);
            } else {
                nf(this.f6603x4, this.f6602x);
            }
        }
    }

    public final long ej(long j) {
        return j + this.f6593r.s(this.n3.zn());
    }

    @Override // mn.i4
    public void f(int i) {
        if (this.f6589k != i) {
            this.f6589k = i;
            this.q9 = i != 0;
            flush();
        }
    }

    @Override // mn.i4
    public /* synthetic */ void f3(long j) {
        x4.y(this, j);
    }

    @Override // mn.i4
    public void flush() {
        if (k()) {
            ct();
            if (this.f6578c5.c5()) {
                this.f6603x4.pause();
            }
            if (f7(this.f6603x4)) {
                ((wz) v0.y.v(this.f6597tl)).n3(this.f6603x4);
            }
            if (ut.y < 21 && !this.q9) {
                this.f6589k = 0;
            }
            s sVar = this.z;
            if (sVar != null) {
                this.f6593r = sVar;
                this.z = null;
            }
            this.f6578c5.p();
            dm(this.f6603x4, this.f6594s);
            this.f6603x4 = null;
        }
        this.f6604xc.y();
        this.f6601wz.y();
    }

    @Override // mn.i4
    public long i4(boolean z) {
        if (!k() || this.f6598ud) {
            return Long.MIN_VALUE;
        }
        return ej(z6(Math.min(this.f6578c5.gv(z), this.f6593r.s(oz()))));
    }

    @Override // mn.i4
    public boolean i9() {
        return k() && this.f6578c5.s(oz());
    }

    public final long j() {
        s sVar = this.f6593r;
        return sVar.zn == 0 ? this.rz / ((long) sVar.n3) : this.mg;
    }

    public final f j5() {
        f fVar = this.f3;
        return fVar != null ? fVar : !this.f6587i9.isEmpty() ? this.f6587i9.getLast() : this.n;
    }

    public final void jz() {
        if (this.f6593r.t()) {
            this.y5 = true;
        }
    }

    public final boolean k() {
        return this.f6603x4 != null;
    }

    public final int kp(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (ut.y >= 26) {
            return cx.w.y(audioTrack, byteBuffer, i, 1, j * 1000);
        }
        if (this.d0 == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.d0 = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.d0.putInt(1431633921);
        }
        if (this.fh == 0) {
            this.d0.putInt(4, i);
            this.d0.putLong(8, j * 1000);
            this.d0.position(0);
            this.fh = i;
        }
        int iRemaining = this.d0.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.d0, iRemaining, 1);
            if (iWrite < 0) {
                this.fh = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iYc = yc(audioTrack, byteBuffer, i);
        if (iYc < 0) {
            this.fh = 0;
            return iYc;
        }
        this.fh -= iYc;
        return iYc;
    }

    @Override // mn.i4
    public void mt(@Nullable gn gnVar) {
        this.f6591mt = gnVar;
    }

    @Override // mn.i4
    public void n() {
        this.f6581ej = true;
    }

    @Override // mn.i4
    public boolean n3(g gVar) {
        return co(gVar) != 0;
    }

    public boolean o() {
        return j5().n3;
    }

    public final void o4(uo uoVar, boolean z) {
        f fVarJ5 = j5();
        if (uoVar.equals(fVarJ5.y) && z == fVarJ5.n3) {
            return;
        }
        f fVar = new f(uoVar, z, -9223372036854775807L, -9223372036854775807L);
        if (k()) {
            this.f3 = fVar;
        } else {
            this.n = fVar;
        }
    }

    public final long oz() {
        s sVar = this.f6593r;
        return sVar.zn == 0 ? this.f6596ta / ((long) sVar.f6615gv) : this.f6580d;
    }

    @Override // mn.i4
    public void p(mn.v vVar) {
        if (this.f6586i4.equals(vVar)) {
            return;
        }
        this.f6586i4 = vVar;
        if (this.jz) {
            return;
        }
        flush();
    }

    @Override // mn.i4
    public void pause() {
        this.f6599ut = false;
        if (k() && this.f6578c5.w()) {
            this.f6603x4.pause();
        }
    }

    @Override // mn.i4
    public void play() {
        this.f6599ut = true;
        if (k()) {
            this.f6578c5.r();
            this.f6603x4.play();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final int qn(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i = ut.y;
        if (i >= 31) {
            return cx.co.y(audioFormat, audioAttributes);
        }
        if (cx.z.y(audioFormat, audioAttributes)) {
            return (i == 30 && ut.f8761gv.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    @Override // mn.i4
    public void r(i4.zn znVar) {
        this.f6579co = znVar;
    }

    public final void ra() {
        mn.s[] sVarArr = this.f6593r.f6613c5;
        ArrayList arrayList = new ArrayList();
        for (mn.s sVar : sVarArr) {
            if (sVar.isActive()) {
                arrayList.add(sVar);
            } else {
                sVar.flush();
            }
        }
        int size = arrayList.size();
        this.f6577b = (mn.s[]) arrayList.toArray(new mn.s[size]);
        this.f6590k5 = new ByteBuffer[size];
        b();
    }

    public final void rs(uo uoVar) {
        if (k()) {
            try {
                cx.fh.y(this.f6603x4, cx.d0.y(cx.c.y(cx.n.y(cx.f3.y(cx.r.y()), uoVar.y), uoVar.f5061v), 2));
            } catch (IllegalArgumentException e4) {
                v0.r.i9("DefaultAudioSink", "Failed to set playback params", e4);
            }
            uoVar = new uo(cx.mg.y(cx.rz.y(this.f6603x4)), cx.p.y(cx.rz.y(this.f6603x4)));
            this.f6578c5.z(uoVar.y);
        }
        this.c = uoVar;
    }

    @Override // mn.i4
    public void s(boolean z) {
        o4(yt(), z);
    }

    public final boolean s8(int i) {
        return this.zn && ut.g(i);
    }

    @Override // mn.i4
    public void setVolume(float f3) {
        if (this.f6602x != f3) {
            this.f6602x = f3;
            eb();
        }
    }

    @Override // mn.i4
    public void tl() {
        if (this.jz) {
            this.jz = false;
            flush();
        }
    }

    public final void u() {
        if (this.oz) {
            return;
        }
        this.oz = true;
        this.f6578c5.fb(oz());
        this.f6603x4.stop();
        this.fh = 0;
    }

    public final AudioTrack ud(s sVar) throws i4.n3 {
        try {
            AudioTrack audioTrackY = sVar.y(this.jz, this.f6586i4, this.f6589k);
            co.y yVar = this.f6592p;
            if (yVar != null) {
                yVar.z(f7(audioTrackY));
            }
            return audioTrackY;
        } catch (i4.n3 e4) {
            i4.zn znVar = this.f6579co;
            if (znVar != null) {
                znVar.gv(e4);
            }
            throw e4;
        }
    }

    public final boolean ut() throws i4.n3 {
        gn gnVar;
        if (!this.f6594s.v()) {
            return false;
        }
        AudioTrack audioTrackA8 = a8();
        this.f6603x4 = audioTrackA8;
        if (f7(audioTrackA8)) {
            xg(this.f6603x4);
            if (this.f6595t != 3) {
                AudioTrack audioTrack = this.f6603x4;
                g gVar = this.f6593r.y;
                cx.i4.y(audioTrack, gVar.q9, gVar.f4785k);
            }
        }
        int i = ut.y;
        if (i >= 31 && (gnVar = this.f6591mt) != null) {
            zn.y(this.f6603x4, gnVar);
        }
        this.f6589k = this.f6603x4.getAudioSessionId();
        n nVar = this.f6578c5;
        AudioTrack audioTrack2 = this.f6603x4;
        s sVar = this.f6593r;
        nVar.co(audioTrack2, sVar.zn == 2, sVar.f6614fb, sVar.f6615gv, sVar.f6616s);
        eb();
        int i5 = this.f7.y;
        if (i5 != 0) {
            this.f6603x4.attachAuxEffect(i5);
            this.f6603x4.setAuxEffectSendLevel(this.f7.n3);
        }
        gv gvVar = this.en;
        if (gvVar != null && i >= 23) {
            n3.y(this.f6603x4, gvVar);
        }
        this.f6598ud = true;
        return true;
    }

    @Override // mn.i4
    public uo v() {
        return this.f6582f ? this.c : yt();
    }

    @Override // mn.i4
    public void w() {
        if (ut.y < 25) {
            flush();
            return;
        }
        this.f6604xc.y();
        this.f6601wz.y();
        if (k()) {
            ct();
            if (this.f6578c5.c5()) {
                this.f6603x4.pause();
            }
            this.f6603x4.flush();
            this.f6578c5.p();
            n nVar = this.f6578c5;
            AudioTrack audioTrack = this.f6603x4;
            s sVar = this.f6593r;
            nVar.co(audioTrack, sVar.zn == 2, sVar.f6614fb, sVar.f6615gv, sVar.f6616s);
            this.f6598ud = true;
        }
    }

    @Override // mn.i4
    public boolean wz(ByteBuffer byteBuffer, long j, int i) throws Exception {
        ByteBuffer byteBuffer2 = this.f6605yt;
        v0.y.y(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.z != null) {
            if (!x()) {
                return false;
            }
            if (this.z.n3(this.f6593r)) {
                this.f6593r = this.z;
                this.z = null;
                if (f7(this.f6603x4) && this.f6595t != 3) {
                    if (this.f6603x4.getPlayState() == 3) {
                        cx.mt.y(this.f6603x4);
                    }
                    AudioTrack audioTrack = this.f6603x4;
                    g gVar = this.f6593r.y;
                    cx.i4.y(audioTrack, gVar.q9, gVar.f4785k);
                    this.xg = true;
                }
            } else {
                u();
                if (i9()) {
                    return false;
                }
                flush();
            }
            d(j);
        }
        if (!k()) {
            try {
                if (!ut()) {
                    return false;
                }
            } catch (i4.n3 e4) {
                if (e4.isRecoverable) {
                    throw e4;
                }
                this.f6601wz.n3(e4);
                return false;
            }
        }
        this.f6601wz.y();
        if (this.f6598ud) {
            this.f6576a8 = Math.max(0L, j);
            this.f6581ej = false;
            this.f6598ud = false;
            if (this.f6582f && ut.y >= 23) {
                rs(this.c);
            }
            d(j);
            if (this.f6599ut) {
                play();
            }
        }
        if (!this.f6578c5.f(oz())) {
            return false;
        }
        if (this.f6605yt == null) {
            v0.y.y(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            s sVar = this.f6593r;
            if (sVar.zn != 0 && this.f6606z6 == 0) {
                int iHw = hw(sVar.f6614fb, byteBuffer);
                this.f6606z6 = iHw;
                if (iHw == 0) {
                    return true;
                }
            }
            if (this.f3 != null) {
                if (!x()) {
                    return false;
                }
                d(j);
                this.f3 = null;
            }
            long jF = this.f6576a8 + this.f6593r.f(j() - this.f6600v.tl());
            if (!this.f6581ej && Math.abs(jF - j) > 200000) {
                i4.zn znVar = this.f6579co;
                if (znVar != null) {
                    znVar.gv(new i4.gv(j, jF));
                }
                this.f6581ej = true;
            }
            if (this.f6581ej) {
                if (!x()) {
                    return false;
                }
                long j4 = j - jF;
                this.f6576a8 += j4;
                this.f6581ej = false;
                d(j);
                i4.zn znVar2 = this.f6579co;
                if (znVar2 != null && j4 != 0) {
                    znVar2.fh();
                }
            }
            if (this.f6593r.zn == 0) {
                this.rz += (long) byteBuffer.remaining();
            } else {
                this.mg += ((long) this.f6606z6) * ((long) i);
            }
            this.f6605yt = byteBuffer;
            this.vl = i;
        }
        y5(j);
        if (!this.f6605yt.hasRemaining()) {
            this.f6605yt = null;
            this.vl = 0;
            return true;
        }
        if (!this.f6578c5.i9(oz())) {
            return false;
        }
        v0.r.c5("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.o
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.o = r2
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.o
            mn.s[] r5 = r9.f6577b
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.v()
        L1f:
            r9.y5(r7)
            boolean r0 = r4.a()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.o
            int r0 = r0 + r1
            r9.o = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f6585hw
            if (r0 == 0) goto L3b
            r9.yg(r0, r7)
            java.nio.ByteBuffer r0 = r9.f6585hw
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.o = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.mg.x():boolean");
    }

    @Override // mn.i4
    public void x4(c cVar) {
        if (this.f7.equals(cVar)) {
            return;
        }
        int i = cVar.y;
        float f3 = cVar.n3;
        AudioTrack audioTrack = this.f6603x4;
        if (audioTrack != null) {
            if (this.f7.y != i) {
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.f6603x4.setAuxEffectSendLevel(f3);
            }
        }
        this.f7 = cVar;
    }

    @Override // mn.i4
    public void xc(g gVar, int i, @Nullable int[] iArr) throws i4.y {
        mn.s[] sVarArr;
        int i5;
        int iIntValue;
        int iA;
        int iCt;
        int iCt2;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int iY;
        int[] iArr2;
        if ("audio/raw".equals(gVar.f3)) {
            v0.y.y(ut.u0(gVar.f4790ut));
            iCt = ut.ct(gVar.f4790ut, gVar.j);
            mn.s[] sVarArr2 = s8(gVar.f4790ut) ? this.f6583fb : this.f6575a;
            this.f6600v.xc(gVar.q9, gVar.f4785k);
            if (ut.y < 21 && gVar.j == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i14 = 0; i14 < 6; i14++) {
                    iArr2[i14] = i14;
                }
            } else {
                iArr2 = iArr;
            }
            this.f6584gv.tl(iArr2);
            s.y yVar = new s.y(gVar.oz, gVar.j, gVar.f4790ut);
            for (mn.s sVar : sVarArr2) {
                try {
                    s.y yVarZn = sVar.zn(yVar);
                    if (sVar.isActive()) {
                        yVar = yVarZn;
                    }
                } catch (s.n3 e4) {
                    throw new i4.y(e4, gVar);
                }
            }
            int i15 = yVar.zn;
            int i16 = yVar.y;
            int iZ6 = ut.z6(yVar.n3);
            sVarArr = sVarArr2;
            iCt2 = ut.ct(i15, yVar.n3);
            iA = i15;
            i5 = i16;
            iIntValue = iZ6;
            i8 = 0;
        } else {
            mn.s[] sVarArr3 = new mn.s[0];
            int i17 = gVar.oz;
            if (ap(gVar, this.f6586i4)) {
                sVarArr = sVarArr3;
                i5 = i17;
                iA = v0.n.a((String) v0.y.v(gVar.f3), gVar.f4778co);
                iIntValue = ut.z6(gVar.j);
                iCt = -1;
                iCt2 = -1;
                i8 = 1;
            } else {
                Pair<Integer, Integer> pairA = this.y.a(gVar);
                if (pairA == null) {
                    throw new i4.y("Unable to configure passthrough for: " + gVar, gVar);
                }
                int iIntValue2 = ((Integer) pairA.first).intValue();
                sVarArr = sVarArr3;
                i5 = i17;
                iIntValue = ((Integer) pairA.second).intValue();
                iA = iIntValue2;
                iCt = -1;
                iCt2 = -1;
                i8 = 2;
            }
        }
        if (iA == 0) {
            throw new i4.y("Invalid output encoding (mode=" + i8 + ") for: " + gVar, gVar);
        }
        if (iIntValue == 0) {
            throw new i4.y("Invalid output channel config (mode=" + i8 + ") for: " + gVar, gVar);
        }
        if (i != 0) {
            iY = i;
            i10 = iA;
            i11 = iIntValue;
            i12 = iCt2;
            i13 = i5;
        } else {
            i10 = iA;
            i11 = iIntValue;
            i12 = iCt2;
            i13 = i5;
            iY = this.w.y(vl(i5, iIntValue, iA), iA, i8, iCt2 != -1 ? iCt2 : 1, i5, gVar.f4786p, this.f6582f ? 8.0d : 1.0d);
        }
        this.y5 = false;
        s sVar2 = new s(gVar, iCt, i8, i12, i13, i11, i10, iY, sVarArr);
        if (k()) {
            this.z = sVar2;
        } else {
            this.f6593r = sVar2;
        }
    }

    public final void xg(AudioTrack audioTrack) {
        if (this.f6597tl == null) {
            this.f6597tl = new wz();
        }
        this.f6597tl.y(audioTrack);
    }

    @Override // mn.i4
    public void y() {
        flush();
        for (mn.s sVar : this.f6575a) {
            sVar.y();
        }
        for (mn.s sVar2 : this.f6583fb) {
            sVar2.y();
        }
        this.f6599ut = false;
        this.y5 = false;
    }

    public final void y5(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f6577b.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f6590k5[i - 1];
            } else {
                byteBuffer = this.f6605yt;
                if (byteBuffer == null) {
                    byteBuffer = mn.s.y;
                }
            }
            if (i == length) {
                yg(byteBuffer, j);
            } else {
                mn.s sVar = this.f6577b[i];
                if (i > this.o) {
                    sVar.gv(byteBuffer);
                }
                ByteBuffer byteBufferN3 = sVar.n3();
                this.f6590k5[i] = byteBufferN3;
                if (byteBufferN3.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void yg(ByteBuffer byteBuffer, long j) throws Exception {
        int iYc;
        i4.zn znVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f6585hw;
            if (byteBuffer2 != null) {
                v0.y.y(byteBuffer2 == byteBuffer);
            } else {
                this.f6585hw = byteBuffer;
                if (ut.y < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f6588j5;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f6588j5 = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f6588j5, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.qn = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (ut.y < 21) {
                int iZn = this.f6578c5.zn(this.f6596ta);
                if (iZn > 0) {
                    iYc = this.f6603x4.write(this.f6588j5, this.qn, Math.min(iRemaining2, iZn));
                    if (iYc > 0) {
                        this.qn += iYc;
                        byteBuffer.position(byteBuffer.position() + iYc);
                    }
                } else {
                    iYc = 0;
                }
            } else if (this.jz) {
                v0.y.fb(j != -9223372036854775807L);
                iYc = kp(this.f6603x4, byteBuffer, iRemaining2, j);
            } else {
                iYc = yc(this.f6603x4, byteBuffer, iRemaining2);
            }
            this.u = SystemClock.elapsedRealtime();
            if (iYc < 0) {
                i4.v vVar = new i4.v(iYc, this.f6593r.y, q9(iYc) && this.f6580d > 0);
                i4.zn znVar2 = this.f6579co;
                if (znVar2 != null) {
                    znVar2.gv(vVar);
                }
                if (vVar.isRecoverable) {
                    throw vVar;
                }
                this.f6604xc.n3(vVar);
                return;
            }
            this.f6604xc.y();
            if (f7(this.f6603x4)) {
                if (this.f6580d > 0) {
                    this.xg = false;
                }
                if (this.f6599ut && (znVar = this.f6579co) != null && iYc < iRemaining2 && !this.xg) {
                    znVar.t();
                }
            }
            int i = this.f6593r.zn;
            if (i == 0) {
                this.f6596ta += (long) iYc;
            }
            if (iYc == iRemaining2) {
                if (i != 0) {
                    v0.y.fb(byteBuffer == this.f6605yt);
                    this.f6580d += ((long) this.f6606z6) * ((long) this.vl);
                }
                this.f6585hw = null;
            }
        }
    }

    public final uo yt() {
        return j5().y;
    }

    @Override // mn.i4
    public void z() throws i4.v {
        if (!this.j && k() && x()) {
            u();
            this.j = true;
        }
    }

    public final long z6(long j) {
        while (!this.f6587i9.isEmpty() && j >= this.f6587i9.getFirst().f6607gv) {
            this.n = this.f6587i9.remove();
        }
        f fVar = this.n;
        long j4 = j - fVar.f6607gv;
        if (fVar.y.equals(uo.f5058s)) {
            return this.n.zn + j4;
        }
        if (this.f6587i9.isEmpty()) {
            return this.n.zn + this.n3.y(j4);
        }
        f first = this.f6587i9.getFirst();
        return first.zn - ut.u(first.f6607gv - j, this.n.y.y);
    }

    @Override // mn.i4
    public void zn(uo uoVar) {
        uo uoVar2 = new uo(ut.w(uoVar.y, 0.1f, 8.0f), ut.w(uoVar.f5061v, 0.1f, 8.0f));
        if (!this.f6582f || ut.y < 23) {
            o4(uoVar2, o());
        } else {
            rs(uoVar2);
        }
    }

    @Deprecated
    public mg(@Nullable mn.fb fbVar, v vVar, boolean z, boolean z5, int i) {
        this(new fb().fb((mn.fb) g4.c5.y(fbVar, mn.fb.zn)).s(vVar).i9(z).c5(z5).f(i));
    }

    public mg(fb fbVar) {
        this.y = fbVar.y;
        mn.c5 c5Var = fbVar.n3;
        this.n3 = c5Var;
        int i = ut.y;
        this.zn = i >= 21 && fbVar.zn;
        this.f6582f = i >= 23 && fbVar.f6610gv;
        this.f6595t = i >= 29 ? fbVar.f6611v : 0;
        this.w = fbVar.f6608a;
        v0.s sVar = new v0.s(v0.v.y);
        this.f6594s = sVar;
        sVar.a();
        this.f6578c5 = new n(new tl());
        fh fhVar = new fh();
        this.f6584gv = fhVar;
        j jVar = new j();
        this.f6600v = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new hw(), fhVar, jVar);
        Collections.addAll(arrayList, c5Var.n3());
        this.f6575a = (mn.s[]) arrayList.toArray(new mn.s[0]);
        this.f6583fb = new mn.s[]{new a8()};
        this.f6602x = 1.0f;
        this.f6586i4 = mn.v.w;
        this.f6589k = 0;
        this.f7 = new c(0, 0.0f);
        uo uoVar = uo.f5058s;
        this.n = new f(uoVar, false, 0L, 0L);
        this.c = uoVar;
        this.o = -1;
        this.f6577b = new mn.s[0];
        this.f6590k5 = new ByteBuffer[0];
        this.f6587i9 = new ArrayDeque<>();
        this.f6601wz = new t<>(100L);
        this.f6604xc = new t<>(100L);
        this.f6592p = fbVar.f6609fb;
    }
}

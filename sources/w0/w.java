package w0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8924a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public float f8925c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8926f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public float f8927fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f8928gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f8929i9;

    @Nullable
    public final n3 n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f8930p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f8931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f8932t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f8933tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Surface f8934v;
    public long w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f8935wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f8936xc;
    public final w0.v y = new w0.v();

    @Nullable
    public final v zn;

    public interface n3 {

        public interface y {
            void onDefaultDisplayChanged(@Nullable Display display);
        }

        void unregister();

        void y(y yVar);
    }

    public static final class v implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final v f8937t = new v();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8938f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final HandlerThread f8939fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Choreographer f8940s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Handler f8941v;
        public volatile long y = -9223372036854775807L;

        public v() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f8939fb = handlerThread;
            handlerThread.start();
            Handler handlerX4 = ut.x4(handlerThread.getLooper(), this);
            this.f8941v = handlerX4;
            handlerX4.sendEmptyMessage(0);
        }

        public static v gv() {
            return f8937t;
        }

        public final void a() {
            Choreographer choreographer = this.f8940s;
            if (choreographer != null) {
                int i = this.f8938f - 1;
                this.f8938f = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.y = -9223372036854775807L;
                }
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.y = j;
            ((Choreographer) v0.y.v(this.f8940s)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                zn();
                return true;
            }
            if (i == 1) {
                n3();
                return true;
            }
            if (i != 2) {
                return false;
            }
            a();
            return true;
        }

        public final void n3() {
            Choreographer choreographer = this.f8940s;
            if (choreographer != null) {
                int i = this.f8938f + 1;
                this.f8938f = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public void v() {
            this.f8941v.sendEmptyMessage(2);
        }

        public void y() {
            this.f8941v.sendEmptyMessage(1);
        }

        public final void zn() {
            try {
                this.f8940s = Choreographer.getInstance();
            } catch (RuntimeException e4) {
                v0.r.i9("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
        }
    }

    public static final class y {
        public static void y(Surface surface, float f3) {
            try {
                hj.zn.y(surface, f3, f3 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e4) {
                v0.r.gv("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
            }
        }
    }

    public w(@Nullable Context context) {
        n3 n3VarA = a(context);
        this.n3 = n3VarA;
        this.zn = n3VarA != null ? v.gv() : null;
        this.f8926f = -9223372036854775807L;
        this.f8932t = -9223372036854775807L;
        this.f8924a = -1.0f;
        this.f8925c5 = 1.0f;
        this.f8929i9 = 0;
    }

    @Nullable
    public static n3 a(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        n3 n3VarZn = ut.y >= 17 ? gv.zn(applicationContext) : null;
        return n3VarZn == null ? zn.n3(applicationContext) : n3VarZn;
    }

    public static long v(long j, long j4, long j7) {
        long j8;
        long j9 = j4 + (((j - j4) / j7) * j7);
        if (j <= j9) {
            j8 = j9 - j7;
        } else {
            j9 = j7 + j9;
            j8 = j9;
        }
        return j9 - j < j - j8 ? j9 : j8;
    }

    public static boolean zn(long j, long j4) {
        return Math.abs(j - j4) <= 20000000;
    }

    public void c5(float f3) {
        this.f8925c5 = f3;
        wz();
        mt(false);
    }

    public void f() {
        this.f8928gv = true;
        wz();
        if (this.n3 != null) {
            ((v) v0.y.v(this.zn)).y();
            this.n3.y(new n3.y() { // from class: w0.xc
                @Override // w0.w.n3.y
                public final void onDefaultDisplayChanged(Display display) {
                    this.y.w(display);
                }
            });
        }
        mt(false);
    }

    public void fb(float f3) {
        this.f8924a = f3;
        this.y.fb();
        p();
    }

    public final void gv() {
        Surface surface;
        if (ut.y < 30 || (surface = this.f8934v) == null || this.f8929i9 == Integer.MIN_VALUE || this.f8931s == 0.0f) {
            return;
        }
        this.f8931s = 0.0f;
        y.y(surface, 0.0f);
    }

    public void i9() {
        wz();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mt(boolean r4) {
        /*
            r3 = this;
            int r0 = v0.ut.y
            r1 = 30
            if (r0 < r1) goto L31
            android.view.Surface r0 = r3.f8934v
            if (r0 == 0) goto L31
            int r1 = r3.f8929i9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L31
        L11:
            boolean r1 = r3.f8928gv
            if (r1 == 0) goto L22
            float r1 = r3.f8927fb
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L22
            float r2 = r3.f8925c5
            float r1 = r1 * r2
            goto L23
        L22:
            r1 = 0
        L23:
            if (r4 != 0) goto L2c
            float r4 = r3.f8931s
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2c
            return
        L2c:
            r3.f8931s = r1
            w0.w.y.y(r0, r1)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.w.mt(boolean):void");
    }

    public long n3(long j) {
        long j4;
        if (this.w == -1 || !this.y.v()) {
            j4 = j;
        } else {
            long jY = this.f8930p + ((long) ((this.y.y() * (this.f8933tl - this.w)) / this.f8925c5));
            if (zn(j, jY)) {
                j4 = jY;
            } else {
                wz();
                j4 = j;
            }
        }
        this.f8935wz = this.f8933tl;
        this.f8936xc = j4;
        v vVar = this.zn;
        if (vVar == null || this.f8926f == -9223372036854775807L) {
            return j4;
        }
        long j7 = vVar.y;
        return j7 == -9223372036854775807L ? j4 : v(j4, j7, this.f8926f) - this.f8932t;
    }

    public final void p() {
        if (ut.y < 30 || this.f8934v == null) {
            return;
        }
        float fN3 = this.y.v() ? this.y.n3() : this.f8924a;
        float f3 = this.f8927fb;
        if (fN3 == f3) {
            return;
        }
        if (fN3 != -1.0f && f3 != -1.0f) {
            if (Math.abs(fN3 - this.f8927fb) < ((!this.y.v() || this.y.gv() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fN3 == -1.0f && this.y.zn() < 30) {
            return;
        }
        this.f8927fb = fN3;
        mt(false);
    }

    public void s(long j) {
        long j4 = this.f8935wz;
        if (j4 != -1) {
            this.w = j4;
            this.f8930p = this.f8936xc;
        }
        this.f8933tl++;
        this.y.a(j * 1000);
        p();
    }

    public void t() {
        this.f8928gv = false;
        n3 n3Var = this.n3;
        if (n3Var != null) {
            n3Var.unregister();
            ((v) v0.y.v(this.zn)).v();
        }
        gv();
    }

    public void tl(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f8934v == surface) {
            return;
        }
        gv();
        this.f8934v = surface;
        mt(true);
    }

    public final void w(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f8926f = refreshRate;
            this.f8932t = (refreshRate * 80) / 100;
        } else {
            v0.r.c5("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f8926f = -9223372036854775807L;
            this.f8932t = -9223372036854775807L;
        }
    }

    public final void wz() {
        this.f8933tl = 0L;
        this.w = -1L;
        this.f8935wz = -1L;
    }

    public void xc(int i) {
        if (this.f8929i9 == i) {
            return;
        }
        this.f8929i9 = i;
        mt(true);
    }

    public static final class zn implements n3 {
        public final WindowManager y;

        public zn(WindowManager windowManager) {
            this.y = windowManager;
        }

        @Nullable
        public static n3 n3(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new zn(windowManager);
            }
            return null;
        }

        @Override // w0.w.n3
        public void y(n3.y yVar) {
            yVar.onDefaultDisplayChanged(this.y.getDefaultDisplay());
        }

        @Override // w0.w.n3
        public void unregister() {
        }
    }

    public static final class gv implements n3, DisplayManager.DisplayListener {

        @Nullable
        public n3.y n3;
        public final DisplayManager y;

        public gv(DisplayManager displayManager) {
            this.y = displayManager;
        }

        @Nullable
        public static n3 zn(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new gv(displayManager);
            }
            return null;
        }

        public final Display n3() {
            return this.y.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            n3.y yVar = this.n3;
            if (yVar == null || i != 0) {
                return;
            }
            yVar.onDefaultDisplayChanged(n3());
        }

        @Override // w0.w.n3
        public void unregister() {
            this.y.unregisterDisplayListener(this);
            this.n3 = null;
        }

        @Override // w0.w.n3
        public void y(n3.y yVar) {
            this.n3 = yVar;
            this.y.registerDisplayListener(this, ut.i4());
            yVar.onDefaultDisplayChanged(n3());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }
}

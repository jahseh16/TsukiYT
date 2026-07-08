package mn;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public f3 f6619a;
    public long c;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f6620c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f6621co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6622d;
    public long d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6623f;
    public int f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f6624fb;
    public long fh;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f6625gv;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public int f6626i4;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public float f6627i9;
    public long mg;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f6628mt;
    public long n;
    public final long[] n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f6629p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6630r;
    public long rz;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f6631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f6632t;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public boolean f6633ta;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f6634tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6635v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public Method f6636wz;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public long f6637x4;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f6638xc;
    public final y y;
    public long z;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public long f6639z6;

    @Nullable
    public AudioTrack zn;

    public interface y {
        void fb(long j);

        void gv(long j, long j4, long j7, long j8);

        void n3(long j);

        void y(int i, long j);

        void zn(long j, long j4, long j7, long j8);
    }

    public n(y yVar) {
        this.y = (y) v0.y.v(yVar);
        if (ut.y >= 18) {
            try {
                this.f6636wz = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.n3 = new long[10];
    }

    public static boolean xc(int i) {
        return ut.y < 23 && (i == 5 || i == 6);
    }

    public final long a() {
        return n3(v());
    }

    public boolean c5() {
        return ((AudioTrack) v0.y.v(this.zn)).getPlayState() == 3;
    }

    public void co(AudioTrack audioTrack, boolean z, int i, int i5, int i8) {
        this.zn = audioTrack;
        this.f6625gv = i5;
        this.f6635v = i8;
        this.f6619a = new f3(audioTrack);
        this.f6624fb = audioTrack.getSampleRate();
        this.f6631s = z && xc(i);
        boolean zU0 = ut.u0(i);
        this.f6629p = zU0;
        this.f6620c5 = zU0 ? n3(i8 / i5) : -9223372036854775807L;
        this.z = 0L;
        this.f6630r = 0L;
        this.f6637x4 = 0L;
        this.w = false;
        this.n = -9223372036854775807L;
        this.c = -9223372036854775807L;
        this.f6628mt = 0L;
        this.f6638xc = 0L;
        this.f6627i9 = 1.0f;
    }

    public boolean f(long j) {
        int playState = ((AudioTrack) v0.y.v(this.zn)).getPlayState();
        if (this.f6631s) {
            if (playState == 2) {
                this.w = false;
                return false;
            }
            if (playState == 1 && v() == 0) {
                return false;
            }
        }
        boolean z = this.w;
        boolean zS = s(j);
        this.w = zS;
        if (z && !zS && playState != 1) {
            this.y.y(this.f6635v, ut.gf(this.f6620c5));
        }
        return true;
    }

    public void fb(long j) {
        this.d0 = v();
        this.n = SystemClock.elapsedRealtime() * 1000;
        this.fh = j;
    }

    public long gv(boolean z) {
        long jA;
        if (((AudioTrack) v0.y.v(this.zn)).getPlayState() == 3) {
            tl();
        }
        long jNanoTime = System.nanoTime() / 1000;
        f3 f3Var = (f3) v0.y.v(this.f6619a);
        boolean zGv = f3Var.gv();
        if (zGv) {
            jA = n3(f3Var.n3()) + ut.u(jNanoTime - f3Var.zn(), this.f6627i9);
        } else {
            jA = this.f3 == 0 ? a() : ut.u(this.f6632t + jNanoTime, this.f6627i9);
            if (!z) {
                jA = Math.max(0L, jA - this.f6638xc);
            }
        }
        if (this.f6633ta != zGv) {
            this.f6639z6 = this.mg;
            this.f6622d = this.rz;
        }
        long j = jNanoTime - this.f6639z6;
        if (j < 1000000) {
            long jU = this.f6622d + ut.u(j, this.f6627i9);
            long j4 = (j * 1000) / 1000000;
            jA = ((jA * j4) + ((1000 - j4) * jU)) / 1000;
        }
        if (!this.f6623f) {
            long j7 = this.rz;
            if (jA > j7) {
                this.f6623f = true;
                this.y.fb(System.currentTimeMillis() - ut.gf(ut.o4(ut.gf(jA - j7), this.f6627i9)));
            }
        }
        this.mg = jNanoTime;
        this.rz = jA;
        this.f6633ta = zGv;
        return jA;
    }

    public boolean i9(long j) {
        return this.c != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.c >= 200;
    }

    public final void mt() {
        this.f6632t = 0L;
        this.f3 = 0;
        this.f6626i4 = 0;
        this.f6634tl = 0L;
        this.mg = 0L;
        this.f6639z6 = 0L;
        this.f6623f = false;
    }

    public final long n3(long j) {
        return (j * 1000000) / ((long) this.f6624fb);
    }

    public void p() {
        mt();
        this.zn = null;
        this.f6619a = null;
    }

    public void r() {
        ((f3) v0.y.v(this.f6619a)).fb();
    }

    public boolean s(long j) {
        return j > v() || y();
    }

    public final void t(long j) {
        f3 f3Var = (f3) v0.y.v(this.f6619a);
        if (f3Var.v(j)) {
            long jZn = f3Var.zn();
            long jN3 = f3Var.n3();
            long jA = a();
            if (Math.abs(jZn - j) > 5000000) {
                this.y.gv(jN3, jZn, j, jA);
                f3Var.a();
            } else if (Math.abs(n3(jN3) - jA) <= 5000000) {
                f3Var.y();
            } else {
                this.y.zn(jN3, jZn, j, jA);
                f3Var.a();
            }
        }
    }

    public final void tl() {
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f6634tl >= 30000) {
            long jA = a();
            if (jA != 0) {
                this.n3[this.f6626i4] = ut.o4(jA, this.f6627i9) - jNanoTime;
                this.f6626i4 = (this.f6626i4 + 1) % 10;
                int i = this.f3;
                if (i < 10) {
                    this.f3 = i + 1;
                }
                this.f6634tl = jNanoTime;
                this.f6632t = 0L;
                int i5 = 0;
                while (true) {
                    int i8 = this.f3;
                    if (i5 >= i8) {
                        break;
                    }
                    this.f6632t += this.n3[i5] / ((long) i8);
                    i5++;
                }
            } else {
                return;
            }
        }
        if (this.f6631s) {
            return;
        }
        t(jNanoTime);
        wz(jNanoTime);
    }

    public final long v() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.n;
        if (j != -9223372036854775807L) {
            return Math.min(this.fh, this.d0 + ((ut.u((jElapsedRealtime * 1000) - j, this.f6627i9) * ((long) this.f6624fb)) / 1000000));
        }
        if (jElapsedRealtime - this.f6621co >= 5) {
            x4(jElapsedRealtime);
            this.f6621co = jElapsedRealtime;
        }
        return this.z + (this.f6630r << 32);
    }

    public boolean w() {
        mt();
        if (this.n != -9223372036854775807L) {
            return false;
        }
        ((f3) v0.y.v(this.f6619a)).fb();
        return true;
    }

    public final void wz(long j) {
        Method method;
        if (!this.f6629p || (method = this.f6636wz) == null || j - this.f6628mt < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) ut.i9((Integer) method.invoke(v0.y.v(this.zn), null))).intValue()) * 1000) - this.f6620c5;
            this.f6638xc = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f6638xc = jMax;
            if (jMax > 5000000) {
                this.y.n3(jMax);
                this.f6638xc = 0L;
            }
        } catch (Exception unused) {
            this.f6636wz = null;
        }
        this.f6628mt = j;
    }

    public final void x4(long j) {
        AudioTrack audioTrack = (AudioTrack) v0.y.v(this.zn);
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f6631s) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6637x4 = this.z;
            }
            playbackHeadPosition += this.f6637x4;
        }
        if (ut.y <= 29) {
            if (playbackHeadPosition == 0 && this.z > 0 && playState == 3) {
                if (this.c == -9223372036854775807L) {
                    this.c = j;
                    return;
                }
                return;
            }
            this.c = -9223372036854775807L;
        }
        if (this.z > playbackHeadPosition) {
            this.f6630r++;
        }
        this.z = playbackHeadPosition;
    }

    public final boolean y() {
        return this.f6631s && ((AudioTrack) v0.y.v(this.zn)).getPlayState() == 2 && v() == 0;
    }

    public void z(float f3) {
        this.f6627i9 = f3;
        f3 f3Var = this.f6619a;
        if (f3Var != null) {
            f3Var.fb();
        }
        mt();
    }

    public int zn(long j) {
        return this.f6635v - ((int) (j - (v() * ((long) this.f6625gv))));
    }
}

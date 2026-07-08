package r0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ta implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zn f7548a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final zn f7549fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final zn f7550gv = s(false, -9223372036854775807L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final zn f7551v = s(true, -9223372036854775807L);

    @Nullable
    public gv<? extends v> n3;
    public final ExecutorService y;

    @Nullable
    public IOException zn;

    public interface a {
        void tl();
    }

    public static final class fb implements Runnable {
        public final a y;

        public fb(a aVar) {
            this.y = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.y.tl();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class gv<T extends v> extends Handler implements Runnable {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public volatile boolean f7552co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f7553f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f7554fb;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f7555p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Nullable
        public n3<T> f7556s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7557t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final T f7558v;

        @Nullable
        public Thread w;
        public final int y;

        public gv(Looper looper, T t3, n3<T> n3Var, int i, long j) {
            super(looper);
            this.f7558v = t3;
            this.f7556s = n3Var;
            this.y = i;
            this.f7554fb = j;
        }

        public void a(long j) {
            v0.y.fb(ta.this.n3 == null);
            ta.this.n3 = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                n3();
            }
        }

        public final long gv() {
            return Math.min((this.f7557t - 1) * 1000, 5000);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f7552co) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                n3();
                return;
            }
            if (i == 3) {
                throw ((Error) message.obj);
            }
            zn();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.f7554fb;
            n3 n3Var = (n3) v0.y.v(this.f7556s);
            if (this.f7555p) {
                n3Var.j5(this.f7558v, jElapsedRealtime, j, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    n3Var.xc(this.f7558v, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e4) {
                    v0.r.gv("LoadTask", "Unexpected exception handling load completed", e4);
                    ta.this.zn = new s(e4);
                    return;
                }
            }
            if (i5 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f7553f = iOException;
            int i8 = this.f7557t + 1;
            this.f7557t = i8;
            zn znVarFh = n3Var.fh(this.f7558v, jElapsedRealtime, j, iOException, i8);
            if (znVarFh.y == 3) {
                ta.this.zn = this.f7553f;
            } else if (znVarFh.y != 2) {
                if (znVarFh.y == 1) {
                    this.f7557t = 1;
                }
                a(znVarFh.n3 != -9223372036854775807L ? znVarFh.n3 : gv());
            }
        }

        public final void n3() {
            this.f7553f = null;
            ta.this.y.execute((Runnable) v0.y.v(ta.this.n3));
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.f7555p;
                    this.w = Thread.currentThread();
                }
                if (!z) {
                    v0.j5.y("load:" + this.f7558v.getClass().getSimpleName());
                    try {
                        this.f7558v.i9();
                        v0.j5.zn();
                    } catch (Throwable th) {
                        v0.j5.zn();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.w = null;
                    Thread.interrupted();
                }
                if (this.f7552co) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e4) {
                if (this.f7552co) {
                    return;
                }
                obtainMessage(2, e4).sendToTarget();
            } catch (Error e5) {
                if (!this.f7552co) {
                    v0.r.gv("LoadTask", "Unexpected error loading stream", e5);
                    obtainMessage(3, e5).sendToTarget();
                }
                throw e5;
            } catch (Exception e6) {
                if (this.f7552co) {
                    return;
                }
                v0.r.gv("LoadTask", "Unexpected exception loading stream", e6);
                obtainMessage(2, new s(e6)).sendToTarget();
            } catch (OutOfMemoryError e8) {
                if (this.f7552co) {
                    return;
                }
                v0.r.gv("LoadTask", "OutOfMemory error loading stream", e8);
                obtainMessage(2, new s(e8)).sendToTarget();
            }
        }

        public void v(int i) throws IOException {
            IOException iOException = this.f7553f;
            if (iOException != null && this.f7557t > i) {
                throw iOException;
            }
        }

        public void y(boolean z) {
            this.f7552co = z;
            this.f7553f = null;
            if (hasMessages(0)) {
                this.f7555p = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f7555p = true;
                        this.f7558v.f();
                        Thread thread = this.w;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                zn();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((n3) v0.y.v(this.f7556s)).j5(this.f7558v, jElapsedRealtime, jElapsedRealtime - this.f7554fb, true);
                this.f7556s = null;
            }
        }

        public final void zn() {
            ta.this.n3 = null;
        }
    }

    public interface n3<T extends v> {
        zn fh(T t3, long j, long j4, IOException iOException, int i);

        void j5(T t3, long j, long j4, boolean z);

        void xc(T t3, long j, long j4);
    }

    public static final class s extends IOException {
        public s(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public interface v {
        void f();

        void i9() throws IOException;
    }

    public static final class zn {
        public final long n3;
        public final int y;

        public boolean zn() {
            int i = this.y;
            return i == 0 || i == 1;
        }

        public zn(int i, long j) {
            this.y = i;
            this.n3 = j;
        }
    }

    static {
        long j = -9223372036854775807L;
        f7548a = new zn(2, j);
        f7549fb = new zn(3, j);
    }

    public ta(String str) {
        this.y = ut.wf("ExoPlayer:Loader:" + str);
    }

    public static zn s(boolean z, long j) {
        return new zn(z ? 1 : 0, j);
    }

    public void a() {
        ((gv) v0.y.c5(this.n3)).y(false);
    }

    public boolean c5() {
        return this.zn != null;
    }

    public void f(int i) throws IOException {
        IOException iOException = this.zn;
        if (iOException != null) {
            throw iOException;
        }
        gv<? extends v> gvVar = this.n3;
        if (gvVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = gvVar.y;
            }
            gvVar.v(i);
        }
    }

    public void fb() {
        this.zn = null;
    }

    public boolean i9() {
        return this.n3 != null;
    }

    @Override // r0.d
    public void n3() throws IOException {
        f(Integer.MIN_VALUE);
    }

    public void t() {
        tl(null);
    }

    public void tl(@Nullable a aVar) {
        gv<? extends v> gvVar = this.n3;
        if (gvVar != null) {
            gvVar.y(true);
        }
        if (aVar != null) {
            this.y.execute(new fb(aVar));
        }
        this.y.shutdown();
    }

    public <T extends v> long wz(T t3, n3<T> n3Var, int i) {
        Looper looper = (Looper) v0.y.c5(Looper.myLooper());
        this.zn = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new gv(looper, t3, n3Var, i, jElapsedRealtime).a(0L);
        return jElapsedRealtime;
    }
}

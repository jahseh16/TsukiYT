package hx;

import android.os.SystemClock;
import b1.d0;
import b1.fh;
import java.io.IOException;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements b1.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5368f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public b1.wz f5369fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final int f5370gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5372s;
    public final jn.f y;
    public final d n3 = new d(65507);
    public final d zn = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f5375v = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb f5366a = new fb();

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public volatile long f5367c5 = -9223372036854775807L;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public volatile int f5371i9 = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5373t = -9223372036854775807L;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f5374tl = -9223372036854775807L;

    public gv(s sVar, int i) {
        this.f5370gv = i;
        this.y = (jn.f) v0.y.v(new jn.y().y(sVar));
    }

    public static long n3(long j) {
        return j - 30;
    }

    public void a() {
        synchronized (this.f5375v) {
            this.f5368f = true;
        }
    }

    public void c5(long j) {
        this.f5367c5 = j;
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, d0 d0Var) throws IOException {
        v0.y.v(this.f5369fb);
        int i = tlVar.read(this.n3.v(), 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.n3.oz(0);
        this.n3.j(i);
        v vVarGv = v.gv(this.n3);
        if (vVarGv == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jN3 = n3(jElapsedRealtime);
        this.f5366a.v(vVarGv, jElapsedRealtime);
        v vVarA = this.f5366a.a(jN3);
        if (vVarA == null) {
            return 0;
        }
        if (!this.f5372s) {
            if (this.f5367c5 == -9223372036854775807L) {
                this.f5367c5 = vVarA.f5408s;
            }
            if (this.f5371i9 == -1) {
                this.f5371i9 = vVarA.f5405fb;
            }
            this.y.n3(this.f5367c5, this.f5371i9);
            this.f5372s = true;
        }
        synchronized (this.f5375v) {
            try {
                if (!this.f5368f) {
                    do {
                        this.zn.qn(vVarA.f5404f);
                        this.y.gv(this.zn, vVarA.f5408s, vVarA.f5405fb, vVarA.f5409v);
                        vVarA = this.f5366a.a(jN3);
                    } while (vVarA != null);
                } else if (this.f5373t != -9223372036854775807L && this.f5374tl != -9223372036854775807L) {
                    this.f5366a.fb();
                    this.y.y(this.f5373t, this.f5374tl);
                    this.f5368f = false;
                    this.f5373t = -9223372036854775807L;
                    this.f5374tl = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // b1.t
    public boolean gv(b1.tl tlVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    public void s(int i) {
        this.f5371i9 = i;
    }

    public boolean v() {
        return this.f5372s;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        synchronized (this.f5375v) {
            try {
                if (!this.f5368f) {
                    this.f5368f = true;
                }
                this.f5373t = j;
                this.f5374tl = j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.y.zn(wzVar, this.f5370gv);
        wzVar.p();
        wzVar.z(new fh.n3(-9223372036854775807L));
        this.f5369fb = wzVar;
    }

    @Override // b1.t
    public void release() {
    }
}

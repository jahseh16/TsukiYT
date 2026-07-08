package ft;

import android.os.SystemClock;
import ft.xb;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements pq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4854a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f4855c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f4856co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4857f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float f4858fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final float f4859gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f4860i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public long f4861mt;
    public final float n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4862p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f4863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4864t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f4865tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f4866v;
    public float w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public float f4867wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public float f4868xc;
    public final float y;
    public final long zn;

    public static final class n3 {
        public float y = 0.97f;
        public float n3 = 1.03f;
        public long zn = 1000;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public float f4871gv = 1.0E-7f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f4872v = v0.ut.xb(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4869a = v0.ut.xb(500);

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public float f4870fb = 0.999f;

        public i9 y() {
            return new i9(this.y, this.n3, this.zn, this.f4871gv, this.f4872v, this.f4869a, this.f4870fb);
        }
    }

    public static long s(long j, long j4, float f3) {
        return (long) ((j * f3) + ((1.0f - f3) * j4));
    }

    public final void a(long j) {
        long j4 = this.f4861mt + (this.f4856co * 3);
        if (this.f4865tl > j4) {
            float fXb = v0.ut.xb(this.zn);
            this.f4865tl = n4.s.gv(j4, this.f4860i9, this.f4865tl - (((long) ((this.w - 1.0f) * fXb)) + ((long) ((this.f4867wz - 1.0f) * fXb))));
            return;
        }
        long jMt = v0.ut.mt(j - ((long) (Math.max(0.0f, this.w - 1.0f) / this.f4859gv)), this.f4865tl, j4);
        this.f4865tl = jMt;
        long j7 = this.f4864t;
        if (j7 == -9223372036854775807L || jMt <= j7) {
            return;
        }
        this.f4865tl = j7;
    }

    public final void c5(long j, long j4) {
        long j7 = j - j4;
        long j8 = this.f4861mt;
        if (j8 == -9223372036854775807L) {
            this.f4861mt = j7;
            this.f4856co = 0L;
        } else {
            long jMax = Math.max(j7, s(j8, j7, this.f4858fb));
            this.f4861mt = jMax;
            this.f4856co = s(this.f4856co, Math.abs(j7 - jMax), this.f4858fb);
        }
    }

    public final void fb() {
        long j = this.f4863s;
        if (j != -9223372036854775807L) {
            long j4 = this.f4855c5;
            if (j4 != -9223372036854775807L) {
                j = j4;
            }
            long j7 = this.f4857f;
            if (j7 != -9223372036854775807L && j < j7) {
                j = j7;
            }
            long j8 = this.f4864t;
            if (j8 != -9223372036854775807L && j > j8) {
                j = j8;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f4860i9 == j) {
            return;
        }
        this.f4860i9 = j;
        this.f4865tl = j;
        this.f4861mt = -9223372036854775807L;
        this.f4856co = -9223372036854775807L;
        this.f4862p = -9223372036854775807L;
    }

    @Override // ft.pq
    public void gv(xb.fb fbVar) {
        this.f4863s = v0.ut.xb(fbVar.y);
        this.f4857f = v0.ut.xb(fbVar.f5101v);
        this.f4864t = v0.ut.xb(fbVar.f5099fb);
        float f3 = fbVar.f5100s;
        if (f3 == -3.4028235E38f) {
            f3 = this.y;
        }
        this.f4868xc = f3;
        float f4 = fbVar.f5098f;
        if (f4 == -3.4028235E38f) {
            f4 = this.n3;
        }
        this.f4867wz = f4;
        if (f3 == 1.0f && f4 == 1.0f) {
            this.f4863s = -9223372036854775807L;
        }
        fb();
    }

    @Override // ft.pq
    public long n3() {
        return this.f4865tl;
    }

    @Override // ft.pq
    public void v(long j) {
        this.f4855c5 = j;
        fb();
    }

    @Override // ft.pq
    public float y(long j, long j4) {
        if (this.f4863s == -9223372036854775807L) {
            return 1.0f;
        }
        c5(j, j4);
        if (this.f4862p != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f4862p < this.zn) {
            return this.w;
        }
        this.f4862p = SystemClock.elapsedRealtime();
        a(j);
        long j7 = j - this.f4865tl;
        if (Math.abs(j7) < this.f4866v) {
            this.w = 1.0f;
        } else {
            this.w = v0.ut.w((this.f4859gv * j7) + 1.0f, this.f4868xc, this.f4867wz);
        }
        return this.w;
    }

    @Override // ft.pq
    public void zn() {
        long j = this.f4865tl;
        if (j == -9223372036854775807L) {
            return;
        }
        long j4 = j + this.f4854a;
        this.f4865tl = j4;
        long j7 = this.f4864t;
        if (j7 != -9223372036854775807L && j4 > j7) {
            this.f4865tl = j7;
        }
        this.f4862p = -9223372036854775807L;
    }

    public i9(float f3, float f4, long j, float f5, long j4, long j7, float f7) {
        this.y = f3;
        this.n3 = f4;
        this.zn = j;
        this.f4859gv = f5;
        this.f4866v = j4;
        this.f4854a = j7;
        this.f4858fb = f7;
        this.f4863s = -9223372036854775807L;
        this.f4855c5 = -9223372036854775807L;
        this.f4857f = -9223372036854775807L;
        this.f4864t = -9223372036854775807L;
        this.f4868xc = f3;
        this.f4867wz = f4;
        this.w = 1.0f;
        this.f4862p = -9223372036854775807L;
        this.f4860i9 = -9223372036854775807L;
        this.f4865tl = -9223372036854775807L;
        this.f4861mt = -9223372036854775807L;
        this.f4856co = -9223372036854775807L;
    }
}

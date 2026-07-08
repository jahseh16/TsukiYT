package w0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8916a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public boolean f8917gv;
    public boolean zn;
    public y y = new y();
    public y n3 = new y();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f8918v = -9223372036854775807L;

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8919a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean[] f8920fb = new boolean[15];

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public long f8921gv;
        public long n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8922s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f8923v;
        public long y;
        public long zn;

        public static int zn(long j) {
            return (int) (j % 15);
        }

        public void a(long j) {
            long j4 = this.f8921gv;
            if (j4 == 0) {
                this.y = j;
            } else if (j4 == 1) {
                long j7 = j - this.y;
                this.n3 = j7;
                this.f8919a = j7;
                this.f8923v = 1L;
            } else {
                long j8 = j - this.zn;
                int iZn = zn(j4);
                if (Math.abs(j8 - this.n3) <= 1000000) {
                    this.f8923v++;
                    this.f8919a += j8;
                    boolean[] zArr = this.f8920fb;
                    if (zArr[iZn]) {
                        zArr[iZn] = false;
                        this.f8922s--;
                    }
                } else {
                    boolean[] zArr2 = this.f8920fb;
                    if (!zArr2[iZn]) {
                        zArr2[iZn] = true;
                        this.f8922s++;
                    }
                }
            }
            this.f8921gv++;
            this.zn = j;
        }

        public void fb() {
            this.f8921gv = 0L;
            this.f8923v = 0L;
            this.f8919a = 0L;
            this.f8922s = 0;
            Arrays.fill(this.f8920fb, false);
        }

        public boolean gv() {
            long j = this.f8921gv;
            if (j == 0) {
                return false;
            }
            return this.f8920fb[zn(j - 1)];
        }

        public long n3() {
            return this.f8919a;
        }

        public boolean v() {
            return this.f8921gv > 15 && this.f8922s == 0;
        }

        public long y() {
            long j = this.f8923v;
            if (j == 0) {
                return 0L;
            }
            return this.f8919a / j;
        }
    }

    public void a(long j) {
        this.y.a(j);
        if (this.y.v() && !this.f8917gv) {
            this.zn = false;
        } else if (this.f8918v != -9223372036854775807L) {
            if (!this.zn || this.n3.gv()) {
                this.n3.fb();
                this.n3.a(this.f8918v);
            }
            this.zn = true;
            this.n3.a(j);
        }
        if (this.zn && this.n3.v()) {
            y yVar = this.y;
            this.y = this.n3;
            this.n3 = yVar;
            this.zn = false;
            this.f8917gv = false;
        }
        this.f8918v = j;
        this.f8916a = this.y.v() ? 0 : this.f8916a + 1;
    }

    public void fb() {
        this.y.fb();
        this.n3.fb();
        this.zn = false;
        this.f8918v = -9223372036854775807L;
        this.f8916a = 0;
    }

    public long gv() {
        if (v()) {
            return this.y.n3();
        }
        return -9223372036854775807L;
    }

    public float n3() {
        if (v()) {
            return (float) (1.0E9d / this.y.y());
        }
        return -1.0f;
    }

    public boolean v() {
        return this.y.v();
    }

    public long y() {
        if (v()) {
            return this.y.y();
        }
        return -9223372036854775807L;
    }

    public int zn() {
        return this.f8916a;
    }
}

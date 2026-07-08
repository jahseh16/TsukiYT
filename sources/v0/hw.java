package v0;

/* JADX INFO: loaded from: classes.dex */
public final class hw {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ThreadLocal<Long> f8748gv = new ThreadLocal<>();
    public long n3;
    public long y;
    public long zn;

    public hw(long j) {
        fb(j);
    }

    public static long a(long j) {
        return (j * 1000000) / 90000;
    }

    public static long c5(long j) {
        return (j * 90000) / 1000000;
    }

    public static long i9(long j) {
        return c5(j) % 8589934592L;
    }

    public synchronized void fb(long j) {
        this.y = j;
        this.n3 = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zn = -9223372036854775807L;
    }

    public synchronized long gv() {
        long j;
        try {
            j = this.zn;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.n3 : zn();
    }

    public synchronized long n3(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j4 = this.zn;
            if (j4 != -9223372036854775807L) {
                long jC5 = c5(j4);
                long j7 = (4294967296L + jC5) / 8589934592L;
                long j8 = ((j7 - 1) * 8589934592L) + j;
                j += j7 * 8589934592L;
                if (Math.abs(j8 - jC5) < Math.abs(j - jC5)) {
                    j = j8;
                }
            }
            return y(a(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(boolean z, long j) throws InterruptedException {
        try {
            y.fb(this.y == 9223372036854775806L);
            if (this.n3 != -9223372036854775807L) {
                return;
            }
            if (z) {
                this.f8748gv.set(Long.valueOf(j));
            } else {
                while (this.n3 == -9223372036854775807L) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long v() {
        return this.n3;
    }

    public synchronized long y(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.n3 == -9223372036854775807L) {
                long jLongValue = this.y;
                if (jLongValue == 9223372036854775806L) {
                    jLongValue = ((Long) y.v(this.f8748gv.get())).longValue();
                }
                this.n3 = jLongValue - j;
                notifyAll();
            }
            this.zn = j;
            return j + this.n3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long zn() {
        long j;
        j = this.y;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }
}

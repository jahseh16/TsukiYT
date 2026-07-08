package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IB {
    public long A00;
    public long A01;
    public volatile long A02 = -9223372036854775807L;

    public IB(long j) {
        A02(j);
    }

    public static long A00(long j) {
        return (1000000 * j) / 90000;
    }

    public static long A01(long j) {
        return (90000 * j) / 1000000;
    }

    private final synchronized void A02(long j) {
        AbstractC0620Ha.A04(this.A02 == -9223372036854775807L);
        this.A00 = j;
    }

    public final long A03() {
        return this.A00;
    }

    public final long A04() {
        if (this.A02 != -9223372036854775807L) {
            return this.A01 + this.A02;
        }
        long j = this.A00;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public final long A05() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.A02 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.A01;
    }

    public final long A06(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            this.A02 = j;
        } else {
            long j4 = this.A00;
            if (j4 != Long.MAX_VALUE) {
                this.A01 = j4 - j;
            }
            synchronized (this) {
                this.A02 = j;
                notifyAll();
            }
        }
        return this.A01 + j;
    }

    public final long A07(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            long jA01 = A01(this.A02);
            long closestWrapCount = (4294967296L + jA01) / 8589934592L;
            long j4 = ((closestWrapCount - 1) * 8589934592L) + j;
            long j7 = (8589934592L * closestWrapCount) + j;
            long lastPts = j4 - jA01;
            long jAbs = Math.abs(lastPts);
            long lastPts2 = j7 - jA01;
            if (jAbs >= Math.abs(lastPts2)) {
                j4 = j7;
            }
            j = j4;
        }
        long lastPts3 = A00(j);
        return A06(lastPts3);
    }

    public final void A08() {
        this.A02 = -9223372036854775807L;
    }
}

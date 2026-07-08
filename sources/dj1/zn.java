package dj1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn {
    public static /* synthetic */ long y(long j, long j4) {
        if (j4 < 0) {
            return (j ^ Long.MIN_VALUE) < (j4 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j4;
        }
        long j7 = ((j >>> 1) / j4) << 1;
        return j7 + ((long) (((j - (j7 * j4)) ^ Long.MIN_VALUE) < (j4 ^ Long.MIN_VALUE) ? 0 : 1));
    }
}

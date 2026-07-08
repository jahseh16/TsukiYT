package i9;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static p f5597gv;
    public long n3;
    public long y;
    public int zn;

    public static p n3() {
        if (f5597gv == null) {
            f5597gv = new p();
        }
        return f5597gv;
    }

    public void y(long j, double d4, double d5) {
        double d6 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = ((double) (Math.round(((double) (r3 - 9.0E-4f)) - r7) + 9.0E-4f)) + ((-d5) / 360.0d) + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d4;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.zn = 1;
            this.y = -1L;
            this.n3 = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.zn = 0;
                this.y = -1L;
                this.n3 = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.y = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.n3 = jRound;
            if (jRound >= j || this.y <= j) {
                this.zn = 1;
            } else {
                this.zn = 0;
            }
        }
    }
}

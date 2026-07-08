package lf;

import b1.y;
import java.io.IOException;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends b1.y {

    public static final class y implements y.a {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6366gv;
        public final v0.d n3 = new v0.d();
        public final hw y;
        public final int zn;

        public y(int i, hw hwVar, int i5) {
            this.zn = i;
            this.y = hwVar;
            this.f6366gv = i5;
        }

        @Override // b1.y.a
        public void n3() {
            this.n3.qn(ut.f8757a);
        }

        @Override // b1.y.a
        public y.v y(b1.tl tlVar, long j) throws IOException {
            long position = tlVar.getPosition();
            int iMin = (int) Math.min(this.f6366gv, tlVar.getLength() - position);
            this.n3.j5(iMin);
            tlVar.z(this.n3.v(), 0, iMin);
            return zn(this.n3, j, position);
        }

        public final y.v zn(v0.d dVar, long j, long j4) {
            int iY;
            int iY2;
            int iFb = dVar.fb();
            long j7 = -1;
            long j8 = -1;
            long j9 = -9223372036854775807L;
            while (dVar.y() >= 188 && (iY2 = (iY = a8.y(dVar.v(), dVar.a(), iFb)) + 188) <= iFb) {
                long jZn = a8.zn(dVar, iY, this.zn);
                if (jZn != -9223372036854775807L) {
                    long jN3 = this.y.n3(jZn);
                    if (jN3 > j) {
                        return j9 == -9223372036854775807L ? y.v.gv(jN3, j4) : y.v.v(j4 + j8);
                    }
                    if (100000 + jN3 > j) {
                        return y.v.v(j4 + ((long) iY));
                    }
                    j8 = iY;
                    j9 = jN3;
                }
                dVar.oz(iY2);
                j7 = iY2;
            }
            return j9 != -9223372036854775807L ? y.v.a(j9, j4 + j7) : y.v.f1294gv;
        }
    }

    public ta(hw hwVar, long j, long j4, int i, int i5) {
        super(new y.n3(), new y(i, hwVar, i5), j, 0L, j + 1, 0L, j4, 188L, 940);
    }
}

package lf;

import b1.y;
import java.io.IOException;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends b1.y {

    public static final class n3 implements y.a {
        public final v0.d n3;
        public final hw y;

        public static void gv(v0.d dVar) {
            int iF;
            int iFb = dVar.fb();
            if (dVar.y() < 10) {
                dVar.oz(iFb);
                return;
            }
            dVar.ut(9);
            int iEj = dVar.ej() & 7;
            if (dVar.y() < iEj) {
                dVar.oz(iFb);
                return;
            }
            dVar.ut(iEj);
            if (dVar.y() < 4) {
                dVar.oz(iFb);
                return;
            }
            if (f3.f(dVar.v(), dVar.a()) == 443) {
                dVar.ut(4);
                int iYt = dVar.yt();
                if (dVar.y() < iYt) {
                    dVar.oz(iFb);
                    return;
                }
                dVar.ut(iYt);
            }
            while (dVar.y() >= 4 && (iF = f3.f(dVar.v(), dVar.a())) != 442 && iF != 441 && (iF >>> 8) == 1) {
                dVar.ut(4);
                if (dVar.y() < 2) {
                    dVar.oz(iFb);
                    return;
                }
                dVar.oz(Math.min(dVar.fb(), dVar.a() + dVar.yt()));
            }
        }

        @Override // b1.y.a
        public void n3() {
            this.n3.qn(ut.f8757a);
        }

        @Override // b1.y.a
        public y.v y(b1.tl tlVar, long j) throws IOException {
            long position = tlVar.getPosition();
            int iMin = (int) Math.min(20000L, tlVar.getLength() - position);
            this.n3.j5(iMin);
            tlVar.z(this.n3.v(), 0, iMin);
            return zn(this.n3, j, position);
        }

        public final y.v zn(v0.d dVar, long j, long j4) {
            int iA = -1;
            long j7 = -9223372036854775807L;
            int iA2 = -1;
            while (dVar.y() >= 4) {
                if (f3.f(dVar.v(), dVar.a()) != 442) {
                    dVar.ut(1);
                } else {
                    dVar.ut(4);
                    long jT = n.t(dVar);
                    if (jT != -9223372036854775807L) {
                        long jN3 = this.y.n3(jT);
                        if (jN3 > j) {
                            return j7 == -9223372036854775807L ? y.v.gv(jN3, j4) : y.v.v(j4 + ((long) iA2));
                        }
                        if (100000 + jN3 > j) {
                            return y.v.v(j4 + ((long) dVar.a()));
                        }
                        iA2 = dVar.a();
                        j7 = jN3;
                    }
                    gv(dVar);
                    iA = dVar.a();
                }
            }
            return j7 != -9223372036854775807L ? y.v.a(j7, j4 + ((long) iA)) : y.v.f1294gv;
        }

        public n3(hw hwVar) {
            this.y = hwVar;
            this.n3 = new v0.d();
        }
    }

    public f3(hw hwVar, long j, long j4) {
        super(new y.n3(), new n3(hwVar), j, 0L, j + 1, 0L, j4, 188L, 1000);
    }

    public static int f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}

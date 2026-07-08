package mo;

import android.util.Pair;
import b1.tl;
import ft.q;
import java.io.IOException;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv {

    public static final class y {
        public final long n3;
        public final int y;

        public y(int i, long j) {
            this.y = i;
            this.n3 = j;
        }

        public static y y(tl tlVar, d dVar) throws IOException {
            tlVar.z(dVar.v(), 0, 8);
            dVar.oz(0);
            return new y(dVar.p(), dVar.f3());
        }
    }

    public static y gv(int i, tl tlVar, d dVar) throws IOException {
        y yVarY = y.y(tlVar, dVar);
        while (yVarY.y != i) {
            r.c5("WavHeaderReader", "Ignoring unknown WAV chunk: " + yVarY.y);
            long j = yVarY.n3 + 8;
            if (j > 2147483647L) {
                throw q.f("Chunk is too large (~2GB+) to skip; id: " + yVarY.y);
            }
            tlVar.w((int) j);
            yVarY = y.y(tlVar, dVar);
        }
        return yVarY;
    }

    public static zn n3(tl tlVar) throws IOException {
        byte[] bArr;
        d dVar = new d(16);
        y yVarGv = gv(1718449184, tlVar, dVar);
        v0.y.fb(yVarGv.n3 >= 16);
        tlVar.z(dVar.v(), 0, 16);
        dVar.oz(0);
        int iC = dVar.c();
        int iC2 = dVar.c();
        int iN = dVar.n();
        int iN2 = dVar.n();
        int iC3 = dVar.c();
        int iC4 = dVar.c();
        int i = ((int) yVarGv.n3) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            tlVar.z(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = ut.f8757a;
        }
        tlVar.w((int) (tlVar.f() - tlVar.getPosition()));
        return new zn(iC, iC2, iN, iN2, iC3, iC4, bArr);
    }

    public static Pair<Long, Long> v(tl tlVar) throws IOException {
        tlVar.s();
        y yVarGv = gv(1684108385, tlVar, new d(8));
        tlVar.w(8);
        return Pair.create(Long.valueOf(tlVar.getPosition()), Long.valueOf(yVarGv.n3));
    }

    public static boolean y(tl tlVar) throws IOException {
        d dVar = new d(8);
        int i = y.y(tlVar, dVar).y;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        tlVar.z(dVar.v(), 0, 4);
        dVar.oz(0);
        int iP = dVar.p();
        if (iP == 1463899717) {
            return true;
        }
        r.zn("WavHeaderReader", "Unsupported form type: " + iP);
        return false;
    }

    public static long zn(tl tlVar) throws IOException {
        d dVar = new d(8);
        y yVarY = y.y(tlVar, dVar);
        if (yVarY.y != 1685272116) {
            tlVar.s();
            return -1L;
        }
        tlVar.tl(8);
        dVar.oz(0);
        tlVar.z(dVar.v(), 0, 8);
        long jX4 = dVar.x4();
        tlVar.w(((int) yVarY.n3) + 8);
        return jX4;
    }
}

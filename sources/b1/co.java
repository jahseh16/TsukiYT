package b1;

import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.internal.Code;
import ft.q;
import java.io.IOException;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class co {

    public static final class y {
        public long y;
    }

    public static boolean a(int i, x4 x4Var) {
        return i == 0 || i == x4Var.f1285c5;
    }

    public static long c5(tl tlVar, x4 x4Var) throws IOException {
        tlVar.s();
        tlVar.tl(1);
        byte[] bArr = new byte[1];
        tlVar.z(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        tlVar.tl(2);
        int i = z ? 7 : 6;
        v0.d dVar = new v0.d(i);
        dVar.j(xc.zn(tlVar, dVar.v(), 0, i));
        tlVar.s();
        y yVar = new y();
        if (zn(dVar, x4Var, z, yVar)) {
            return yVar.y;
        }
        throw q.y(null, null);
    }

    public static boolean fb(int i, x4 x4Var) {
        return i <= 7 ? i == x4Var.f1287fb - 1 : i <= 10 && x4Var.f1287fb == 2;
    }

    public static boolean gv(v0.d dVar, x4 x4Var, int i, y yVar) {
        int iA = dVar.a();
        long jA8 = dVar.a8();
        long j = jA8 >>> 16;
        if (j != i) {
            return false;
        }
        return fb((int) (15 & (jA8 >> 4)), x4Var) && a((int) ((jA8 >> 1) & 7), x4Var) && !(((jA8 & 1) > 1L ? 1 : ((jA8 & 1) == 1L ? 0 : -1)) == 0) && zn(dVar, x4Var, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, yVar) && y(dVar, x4Var, (int) ((jA8 >> 12) & 15)) && v(dVar, x4Var, (int) ((jA8 >> 8) & 15)) && n3(dVar, iA);
    }

    public static int i9(v0.d dVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return dVar.ej() + 1;
            case 7:
                return dVar.yt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Code.UNIMPLEMENTED /* 12 */:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean n3(v0.d dVar, int i) {
        return dVar.ej() == ut.r(dVar.v(), i, dVar.a() - 1, 0);
    }

    public static boolean s(tl tlVar, x4 x4Var, int i, y yVar) throws IOException {
        long jF = tlVar.f();
        byte[] bArr = new byte[2];
        tlVar.z(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            tlVar.s();
            tlVar.tl((int) (jF - tlVar.getPosition()));
            return false;
        }
        v0.d dVar = new v0.d(16);
        System.arraycopy(bArr, 0, dVar.v(), 0, 2);
        dVar.j(xc.zn(tlVar, dVar.v(), 2, 14));
        tlVar.s();
        tlVar.tl((int) (jF - tlVar.getPosition()));
        return gv(dVar, x4Var, i, yVar);
    }

    public static boolean v(v0.d dVar, x4 x4Var, int i) {
        int i5 = x4Var.f1292v;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == x4Var.f1284a;
        }
        if (i == 12) {
            return dVar.ej() * 1000 == i5;
        }
        if (i > 14) {
            return false;
        }
        int iYt = dVar.yt();
        if (i == 14) {
            iYt *= 10;
        }
        return iYt == i5;
    }

    public static boolean y(v0.d dVar, x4 x4Var, int i) {
        int iI9 = i9(dVar, i);
        return iI9 != -1 && iI9 <= x4Var.n3;
    }

    public static boolean zn(v0.d dVar, x4 x4Var, boolean z, y yVar) {
        try {
            long jVl = dVar.vl();
            if (!z) {
                jVl *= (long) x4Var.n3;
            }
            yVar.y = jVl;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}

package b1;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static void n3(long j, v0.d dVar, ta[] taVarArr) {
        int iEj = dVar.ej();
        if ((iEj & 64) != 0) {
            dVar.ut(1);
            int i = (iEj & 31) * 3;
            int iA = dVar.a();
            for (ta taVar : taVarArr) {
                dVar.oz(iA);
                taVar.n3(dVar, i);
                if (j != -9223372036854775807L) {
                    taVar.a(j, 1, i, 0, null);
                }
            }
        }
    }

    public static void y(long j, v0.d dVar, ta[] taVarArr) {
        while (true) {
            if (dVar.y() <= 1) {
                return;
            }
            int iZn = zn(dVar);
            int iZn2 = zn(dVar);
            int iA = dVar.a() + iZn2;
            if (iZn2 == -1 || iZn2 > dVar.y()) {
                v0.r.c5("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iA = dVar.fb();
            } else if (iZn == 4 && iZn2 >= 8) {
                int iEj = dVar.ej();
                int iYt = dVar.yt();
                int iP = iYt == 49 ? dVar.p() : 0;
                int iEj2 = dVar.ej();
                if (iYt == 47) {
                    dVar.ut(1);
                }
                boolean z = iEj == 181 && (iYt == 49 || iYt == 47) && iEj2 == 3;
                if (iYt == 49) {
                    z &= iP == 1195456820;
                }
                if (z) {
                    n3(j, dVar, taVarArr);
                }
            }
            dVar.oz(iA);
        }
    }

    public static int zn(v0.d dVar) {
        int i = 0;
        while (dVar.y() != 0) {
            int iEj = dVar.ej();
            i += iEj;
            if (iEj != 255) {
                return i;
            }
        }
        return -1;
    }
}

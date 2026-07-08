package n0;

import android.os.SystemClock;
import ft.gi;
import java.util.Arrays;
import java.util.List;
import k4.r;
import n0.fh;
import r0.mg;
import ur.lc;
import ur.rs;

/* JADX INFO: loaded from: classes.dex */
public final class ej {
    public static gi n3(fh.y yVar, rz[] rzVarArr) {
        List[] listArr = new List[rzVarArr.length];
        for (int i = 0; i < rzVarArr.length; i++) {
            rz rzVar = rzVarArr[i];
            listArr[i] = rzVar != null ? k4.r.j(rzVar) : k4.r.yt();
        }
        return y(yVar, listArr);
    }

    public static gi y(fh.y yVar, List<? extends rz>[] listArr) {
        boolean z;
        r.y yVar2 = new r.y();
        for (int i = 0; i < yVar.gv(); i++) {
            lc lcVarA = yVar.a(i);
            List<? extends rz> list = listArr[i];
            for (int i5 = 0; i5 < lcVarA.y; i5++) {
                rs rsVarN3 = lcVarA.n3(i5);
                boolean z5 = yVar.y(i, i5, false) != 0;
                int i8 = rsVarN3.y;
                int[] iArr = new int[i8];
                boolean[] zArr = new boolean[i8];
                for (int i10 = 0; i10 < rsVarN3.y; i10++) {
                    iArr[i10] = yVar.fb(i, i5, i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z = false;
                            break;
                        }
                        rz rzVar = list.get(i11);
                        if (rzVar.tl().equals(rsVarN3) && rzVar.t(i10) != -1) {
                            z = true;
                            break;
                        }
                        i11++;
                    }
                    zArr[i10] = z;
                }
                yVar2.y(new gi.y(rsVarN3, z5, iArr, zArr));
            }
        }
        lc lcVarS = yVar.s();
        for (int i12 = 0; i12 < lcVarS.y; i12++) {
            rs rsVarN32 = lcVarS.n3(i12);
            int[] iArr2 = new int[rsVarN32.y];
            Arrays.fill(iArr2, 0);
            yVar2.y(new gi.y(rsVarN32, false, iArr2, new boolean[rsVarN32.y]));
        }
        return new gi(yVar2.f());
    }

    public static mg.y zn(c cVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = cVar.length();
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (cVar.gv(i5, jElapsedRealtime)) {
                i++;
            }
        }
        return new mg.y(1, 0, length, i);
    }
}

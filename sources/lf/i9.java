package lf;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import ft.g;
import java.util.ArrayList;
import java.util.List;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements ud.zn {
    public final List<g> n3;
    public final int y;

    public i9(int i) {
        this(i, k4.r.yt());
    }

    public final boolean a(int i) {
        return (i & this.y) != 0;
    }

    public final x gv(ud.n3 n3Var) {
        return new x(v(n3Var));
    }

    @Override // lf.ud.zn
    @Nullable
    public ud n3(int i, ud.n3 n3Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new i4(new z(n3Var.n3));
            }
            if (i == 21) {
                return new i4(new mt());
            }
            if (i == 27) {
                if (a(4)) {
                    return null;
                }
                return new i4(new w(zn(n3Var), a(1), a(8)));
            }
            if (i == 36) {
                return new i4(new p(zn(n3Var)));
            }
            if (i == 89) {
                return new i4(new t(n3Var.zn));
            }
            if (i != 138) {
                if (i == 172) {
                    return new i4(new a(n3Var.n3));
                }
                if (i == 257) {
                    return new rz(new x4("application/vnd.dvb.ait"));
                }
                if (i == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new rz(new x4("application/x-scte35"));
                }
                if (i != 135) {
                    switch (i) {
                        case 15:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        case 16:
                            break;
                        case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                            if (!a(2)) {
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 130:
                                    if (!a(64)) {
                                    }
                                    break;
                            }
                            break;
                    }
                    return null;
                }
                return new i4(new zn(n3Var.n3));
            }
            return new i4(new f(n3Var.n3));
        }
        return new i4(new wz(gv(n3Var)));
    }

    public final List<g> v(ud.n3 n3Var) {
        String str;
        int i;
        if (a(32)) {
            return this.n3;
        }
        v0.d dVar = new v0.d(n3Var.f6369gv);
        List<g> arrayList = this.n3;
        while (dVar.y() > 0) {
            int iEj = dVar.ej();
            int iA = dVar.a() + dVar.ej();
            if (iEj == 134) {
                arrayList = new ArrayList<>();
                int iEj2 = dVar.ej() & 31;
                for (int i5 = 0; i5 < iEj2; i5++) {
                    String strTa = dVar.ta(3);
                    int iEj3 = dVar.ej();
                    boolean z = (iEj3 & 128) != 0;
                    if (z) {
                        i = iEj3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bEj = (byte) dVar.ej();
                    dVar.ut(1);
                    arrayList.add(new g.n3().o4(str).k(strTa).ej(i).ut(z ? v0.a.n3((bEj & 64) != 0) : null).z6());
                }
            }
            dVar.oz(iA);
        }
        return arrayList;
    }

    @Override // lf.ud.zn
    public SparseArray<ud> y() {
        return new SparseArray<>();
    }

    public final mg zn(ud.n3 n3Var) {
        return new mg(v(n3Var));
    }

    public i9(int i, List<g> list) {
        this.y = i;
        this.n3 = list;
    }
}

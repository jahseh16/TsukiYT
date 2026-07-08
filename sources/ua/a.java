package ua;

import androidx.annotation.Nullable;
import k4.k;
import k4.r;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements y {
    public final int n3;
    public final r<y> y;

    public a(int i, r<y> rVar) {
        this.n3 = i;
        this.y = rVar;
    }

    @Nullable
    public static y y(int i, int i5, d dVar) {
        switch (i) {
            case 1718776947:
                return fb.gv(i5, dVar);
            case 1751742049:
                return zn.n3(dVar);
            case 1752331379:
                return gv.zn(dVar);
            case 1852994675:
                return s.y(dVar);
            default:
                return null;
        }
    }

    public static a zn(int i, d dVar) {
        r.y yVar = new r.y();
        int iFb = dVar.fb();
        int iN3 = -2;
        while (dVar.y() > 8) {
            int iR = dVar.r();
            int iA = dVar.a() + dVar.r();
            dVar.j(iA);
            y yVarZn = iR == 1414744396 ? zn(dVar.r(), dVar) : y(iR, iN3, dVar);
            if (yVarZn != null) {
                if (yVarZn.getType() == 1752331379) {
                    iN3 = ((gv) yVarZn).n3();
                }
                yVar.y(yVarZn);
            }
            dVar.oz(iA);
            dVar.j(iFb);
        }
        return new a(i, yVar.f());
    }

    @Override // ua.y
    public int getType() {
        return this.n3;
    }

    @Nullable
    public <T extends y> T n3(Class<T> cls) {
        k<y> it = this.y.iterator();
        while (it.hasNext()) {
            T t3 = (T) it.next();
            if (t3.getClass() == cls) {
                return t3;
            }
        }
        return null;
    }
}

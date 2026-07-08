package ft;

import android.util.Pair;
import ft.xq;

/* JADX INFO: loaded from: classes.dex */
public abstract class y extends xq {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5179p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5180t;
    public final ur.u w;

    public y(boolean z, ur.u uVar) {
        this.f5179p = z;
        this.w = uVar;
        this.f5180t = uVar.getLength();
    }

    public static Object c(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object d0(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object rz(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    @Override // ft.xq
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objD0 = d0(obj);
        Object objC = c(obj);
        int iI4 = i4(objD0);
        if (iI4 == -1 || (iA = ej(iI4).a(objC)) == -1) {
            return -1;
        }
        return mg(iI4) + iA;
    }

    @Override // ft.xq
    public int c5(int i, int i5, boolean z) {
        if (this.f5179p) {
            if (i5 == 1) {
                i5 = 2;
            }
            z = false;
        }
        int iN = n(i);
        int iTa = ta(iN);
        int iC5 = ej(iN).c5(i - iTa, i5 != 2 ? i5 : 0, z);
        if (iC5 != -1) {
            return iTa + iC5;
        }
        int iD = d(iN, z);
        while (iD != -1 && ej(iD).r()) {
            iD = d(iD, z);
        }
        if (iD != -1) {
            return ta(iD) + ej(iD).v(z);
        }
        if (i5 == 2) {
            return v(z);
        }
        return -1;
    }

    @Override // ft.xq
    public final xq.gv co(int i, xq.gv gvVar, long j) {
        int iN = n(i);
        int iTa = ta(iN);
        int iMg = mg(iN);
        ej(iN).co(i - iTa, gvVar, j);
        Object objFh = fh(iN);
        if (!xq.gv.f5153ej.equals(gvVar.y)) {
            objFh = rz(objFh, gvVar.y);
        }
        gvVar.y = objFh;
        gvVar.d0 += iMg;
        gvVar.fh += iMg;
        return gvVar;
    }

    public final int d(int i, boolean z) {
        if (z) {
            return this.w.zn(i);
        }
        if (i < this.f5180t - 1) {
            return i + 1;
        }
        return -1;
    }

    public abstract xq ej(int i);

    @Override // ft.xq
    public final xq.n3 f(int i, xq.n3 n3Var, boolean z) {
        int iF3 = f3(i);
        int iTa = ta(iF3);
        ej(iF3).f(i - mg(iF3), n3Var, z);
        n3Var.f5172fb += iTa;
        if (z) {
            n3Var.f5175v = rz(fh(iF3), v0.y.v(n3Var.f5175v));
        }
        return n3Var;
    }

    public abstract int f3(int i);

    @Override // ft.xq
    public int fb(boolean z) {
        int i = this.f5180t;
        if (i == 0) {
            return -1;
        }
        if (this.f5179p) {
            z = false;
        }
        int iZ = z ? this.w.z() : i - 1;
        while (ej(iZ).r()) {
            iZ = z6(iZ, z);
            if (iZ == -1) {
                return -1;
            }
        }
        return ta(iZ) + ej(iZ).fb(z);
    }

    public abstract Object fh(int i);

    public abstract int i4(Object obj);

    public abstract int mg(int i);

    public abstract int n(int i);

    @Override // ft.xq
    public final Object p(int i) {
        int iF3 = f3(i);
        return rz(fh(iF3), ej(iF3).p(i - mg(iF3)));
    }

    @Override // ft.xq
    public final xq.n3 t(Object obj, xq.n3 n3Var) {
        Object objD0 = d0(obj);
        Object objC = c(obj);
        int iI4 = i4(objD0);
        int iTa = ta(iI4);
        ej(iI4).t(objC, n3Var);
        n3Var.f5172fb += iTa;
        n3Var.f5175v = obj;
        return n3Var;
    }

    public abstract int ta(int i);

    @Override // ft.xq
    public int v(boolean z) {
        if (this.f5180t == 0) {
            return -1;
        }
        if (this.f5179p) {
            z = false;
        }
        int iV = z ? this.w.v() : 0;
        while (ej(iV).r()) {
            iV = d(iV, z);
            if (iV == -1) {
                return -1;
            }
        }
        return ta(iV) + ej(iV).v(z);
    }

    @Override // ft.xq
    public int w(int i, int i5, boolean z) {
        if (this.f5179p) {
            if (i5 == 1) {
                i5 = 2;
            }
            z = false;
        }
        int iN = n(i);
        int iTa = ta(iN);
        int iW = ej(iN).w(i - iTa, i5 != 2 ? i5 : 0, z);
        if (iW != -1) {
            return iTa + iW;
        }
        int iZ6 = z6(iN, z);
        while (iZ6 != -1 && ej(iZ6).r()) {
            iZ6 = z6(iZ6, z);
        }
        if (iZ6 != -1) {
            return ta(iZ6) + ej(iZ6).fb(z);
        }
        if (i5 == 2) {
            return fb(z);
        }
        return -1;
    }

    public final int z6(int i, boolean z) {
        if (z) {
            return this.w.n3(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}

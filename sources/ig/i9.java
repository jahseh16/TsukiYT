package ig;

import androidx.annotation.Nullable;
import b1.ej;
import ft.g;
import ft.q;
import ig.c5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import k4.r;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends c5 {

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    @Nullable
    public ej.n3 f5692mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ej.gv f5693p;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    @Nullable
    public y f5694wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f5695xc;

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final ej.zn[] f5696gv;
        public final ej.n3 n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f5697v;
        public final ej.gv y;
        public final byte[] zn;

        public y(ej.gv gvVar, ej.n3 n3Var, byte[] bArr, ej.zn[] znVarArr, int i) {
            this.y = gvVar;
            this.n3 = n3Var;
            this.zn = bArr;
            this.f5696gv = znVarArr;
            this.f5697v = i;
        }
    }

    public static boolean mt(d dVar) {
        try {
            return ej.tl(1, dVar, true);
        } catch (q unused) {
            return false;
        }
    }

    public static int w(byte b4, int i, int i5) {
        return (b4 >> i5) & (255 >>> (8 - i));
    }

    public static void wz(d dVar, long j) {
        if (dVar.n3() < dVar.fb() + 4) {
            dVar.qn(Arrays.copyOf(dVar.v(), dVar.fb() + 4));
        } else {
            dVar.j(dVar.fb() + 4);
        }
        byte[] bArrV = dVar.v();
        bArrV[dVar.fb() - 4] = (byte) (j & 255);
        bArrV[dVar.fb() - 3] = (byte) ((j >>> 8) & 255);
        bArrV[dVar.fb() - 2] = (byte) ((j >>> 16) & 255);
        bArrV[dVar.fb() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int xc(byte b4, y yVar) {
        return !yVar.f5696gv[w(b4, yVar.f5697v, 1)].y ? yVar.y.f1267fb : yVar.y.f1270s;
    }

    @Override // ig.c5
    public long a(d dVar) {
        if ((dVar.v()[0] & 1) == 1) {
            return -1L;
        }
        int iXc = xc(dVar.v()[0], (y) v0.y.c5(this.f5694wz));
        long j = this.w ? (this.f5695xc + iXc) / 4 : 0;
        wz(dVar, j);
        this.w = true;
        this.f5695xc = iXc;
        return j;
    }

    @Override // ig.c5
    public boolean c5(d dVar, long j, c5.n3 n3Var) throws IOException {
        if (this.f5694wz != null) {
            v0.y.v(n3Var.y);
            return false;
        }
        y yVarP = p(dVar);
        this.f5694wz = yVarP;
        if (yVarP == null) {
            return true;
        }
        ej.gv gvVar = yVarP.y;
        ArrayList arrayList = new ArrayList();
        arrayList.add(gvVar.f1269i9);
        arrayList.add(yVarP.zn);
        n3Var.y = new g.n3().o4("audio/vorbis").ud(gvVar.f1271v).u(gvVar.f1268gv).a8(gvVar.n3).rs(gvVar.zn).ut(arrayList).en(ej.zn(r.mg(yVarP.n3.n3))).z6();
        return true;
    }

    @Nullable
    public y p(d dVar) throws IOException {
        ej.gv gvVar = this.f5693p;
        if (gvVar == null) {
            this.f5693p = ej.f(dVar);
            return null;
        }
        ej.n3 n3Var = this.f5692mt;
        if (n3Var == null) {
            this.f5692mt = ej.c5(dVar);
            return null;
        }
        byte[] bArr = new byte[dVar.fb()];
        System.arraycopy(dVar.v(), 0, bArr, 0, dVar.fb());
        return new y(gvVar, n3Var, bArr, ej.t(dVar, gvVar.n3), ej.y(r4.length - 1));
    }

    @Override // ig.c5
    public void t(boolean z) {
        super.t(z);
        if (z) {
            this.f5694wz = null;
            this.f5693p = null;
            this.f5692mt = null;
        }
        this.f5695xc = 0;
        this.w = false;
    }

    @Override // ig.c5
    public void v(long j) {
        super.v(j);
        this.w = j != 0;
        ej.gv gvVar = this.f5693p;
        this.f5695xc = gvVar != null ? gvVar.f1267fb : 0;
    }
}

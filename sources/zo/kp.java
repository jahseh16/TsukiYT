package zo;

import android.util.Base64;
import androidx.annotation.Nullable;
import ft.xq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import ur.mg;
import zo.hk;
import zo.zn;

/* JADX INFO: loaded from: classes.dex */
public final class kp implements hk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xq f9552a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public String f9553fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final g4.r<String> f9554gv;
    public final xq.n3 n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public hk.y f9555v;
    public final xq.gv y;
    public final HashMap<String, y> zn;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g4.r<String> f9551s = new g4.r() { // from class: zo.yc
        @Override // g4.r
        public final Object get() {
            return kp.t();
        }
    };

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final Random f9550c5 = new Random();

    public final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9556a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public mg.n3 f9558gv;
        public int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9559v;
        public final String y;
        public long zn;

        public y(String str, int i, @Nullable mg.n3 n3Var) {
            this.y = str;
            this.n3 = i;
            this.zn = n3Var == null ? -1L : n3Var.f8549gv;
            if (n3Var == null || !n3Var.n3()) {
                return;
            }
            this.f9558gv = n3Var;
        }

        public boolean c5(int i, @Nullable mg.n3 n3Var) {
            if (n3Var == null) {
                return i == this.n3;
            }
            mg.n3 n3Var2 = this.f9558gv;
            return n3Var2 == null ? !n3Var.n3() && n3Var.f8549gv == this.zn : n3Var.f8549gv == n3Var2.f8549gv && n3Var.n3 == n3Var2.n3 && n3Var.zn == n3Var2.zn;
        }

        public void f(int i, @Nullable mg.n3 n3Var) {
            if (this.zn == -1 && i == this.n3 && n3Var != null) {
                this.zn = n3Var.f8549gv;
            }
        }

        public boolean i9(zn.y yVar) {
            mg.n3 n3Var = yVar.f9574gv;
            if (n3Var == null) {
                return this.n3 != yVar.zn;
            }
            long j = this.zn;
            if (j == -1) {
                return false;
            }
            if (n3Var.f8549gv > j) {
                return true;
            }
            if (this.f9558gv == null) {
                return false;
            }
            int iA = yVar.n3.a(n3Var.y);
            int iA2 = yVar.n3.a(this.f9558gv.y);
            mg.n3 n3Var2 = yVar.f9574gv;
            if (n3Var2.f8549gv < this.f9558gv.f8549gv || iA < iA2) {
                return false;
            }
            if (iA > iA2) {
                return true;
            }
            if (!n3Var2.n3()) {
                int i = yVar.f9574gv.f8550v;
                return i == -1 || i > this.f9558gv.n3;
            }
            mg.n3 n3Var3 = yVar.f9574gv;
            int i5 = n3Var3.n3;
            int i8 = n3Var3.zn;
            mg.n3 n3Var4 = this.f9558gv;
            int i10 = n3Var4.n3;
            if (i5 <= i10) {
                return i5 == i10 && i8 > n3Var4.zn;
            }
            return true;
        }

        public final int t(xq xqVar, xq xqVar2, int i) {
            if (i >= xqVar.z()) {
                if (i < xqVar2.z()) {
                    return i;
                }
                return -1;
            }
            xqVar.mt(i, kp.this.y);
            for (int i5 = kp.this.y.d0; i5 <= kp.this.y.fh; i5++) {
                int iA = xqVar2.a(xqVar.p(i5));
                if (iA != -1) {
                    return xqVar2.i9(iA, kp.this.n3).f5172fb;
                }
            }
            return -1;
        }

        public boolean tl(xq xqVar, xq xqVar2) {
            int iT = t(xqVar, xqVar2, this.n3);
            this.n3 = iT;
            if (iT == -1) {
                return false;
            }
            mg.n3 n3Var = this.f9558gv;
            return n3Var == null || xqVar2.a(n3Var.y) != -1;
        }
    }

    public kp() {
        this(f9551s);
    }

    public static String t() {
        byte[] bArr = new byte[12];
        f9550c5.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // zo.hk
    public synchronized String a(xq xqVar, mg.n3 n3Var) {
        return tl(xqVar.t(n3Var.y, this.n3).f5172fb, n3Var).y;
    }

    @Override // zo.hk
    public void fb(hk.y yVar) {
        this.f9555v = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r25.f9574gv.f8549gv < r2.zn) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    @Override // zo.hk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void gv(zo.zn.y r25) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zo.kp.gv(zo.zn$y):void");
    }

    @Override // zo.hk
    @Nullable
    public synchronized String n3() {
        return this.f9553fb;
    }

    @Override // zo.hk
    public synchronized void s(zn.y yVar) {
        hk.y yVar2;
        this.f9553fb = null;
        Iterator<y> it = this.zn.values().iterator();
        while (it.hasNext()) {
            y next = it.next();
            it.remove();
            if (next.f9559v && (yVar2 = this.f9555v) != null) {
                yVar2.dm(yVar, next.y, false);
            }
        }
    }

    public final y tl(int i, @Nullable mg.n3 n3Var) {
        y yVar = null;
        long j = Long.MAX_VALUE;
        for (y yVar2 : this.zn.values()) {
            yVar2.f(i, n3Var);
            if (yVar2.c5(i, n3Var)) {
                long j4 = yVar2.zn;
                if (j4 == -1 || j4 < j) {
                    yVar = yVar2;
                    j = j4;
                } else if (j4 == j && ((y) v0.ut.i9(yVar)).f9558gv != null && yVar2.f9558gv != null) {
                    yVar = yVar2;
                }
            }
        }
        if (yVar != null) {
            return yVar;
        }
        String str = this.f9554gv.get();
        y yVar3 = new y(str, i, n3Var);
        this.zn.put(str, yVar3);
        return yVar3;
    }

    @Override // zo.hk
    public synchronized void v(zn.y yVar) {
        try {
            v0.y.v(this.f9555v);
            xq xqVar = this.f9552a;
            this.f9552a = yVar.n3;
            Iterator<y> it = this.zn.values().iterator();
            while (it.hasNext()) {
                y next = it.next();
                if (!next.tl(xqVar, this.f9552a) || next.i9(yVar)) {
                    it.remove();
                    if (next.f9559v) {
                        if (next.y.equals(this.f9553fb)) {
                            this.f9553fb = null;
                        }
                        this.f9555v.dm(yVar, next.y, false);
                    }
                }
            }
            wz(yVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void wz(zn.y yVar) {
        if (yVar.n3.r()) {
            this.f9553fb = null;
            return;
        }
        y yVar2 = this.zn.get(this.f9553fb);
        y yVarTl = tl(yVar.zn, yVar.f9574gv);
        this.f9553fb = yVarTl.y;
        gv(yVar);
        mg.n3 n3Var = yVar.f9574gv;
        if (n3Var == null || !n3Var.n3()) {
            return;
        }
        if (yVar2 != null && yVar2.zn == yVar.f9574gv.f8549gv && yVar2.f9558gv != null && yVar2.f9558gv.n3 == yVar.f9574gv.n3 && yVar2.f9558gv.zn == yVar.f9574gv.zn) {
            return;
        }
        mg.n3 n3Var2 = yVar.f9574gv;
        this.f9555v.c(yVar, tl(yVar.zn, new mg.n3(n3Var2.y, n3Var2.f8549gv)).y, yVarTl.y);
    }

    @Override // zo.hk
    public synchronized boolean y(zn.y yVar, String str) {
        y yVar2 = this.zn.get(str);
        if (yVar2 == null) {
            return false;
        }
        yVar2.f(yVar.zn, yVar.f9574gv);
        return yVar2.c5(yVar.zn, yVar.f9574gv);
    }

    @Override // zo.hk
    public synchronized void zn(zn.y yVar, int i) {
        try {
            v0.y.v(this.f9555v);
            boolean z = i == 0;
            Iterator<y> it = this.zn.values().iterator();
            while (it.hasNext()) {
                y next = it.next();
                if (next.i9(yVar)) {
                    it.remove();
                    if (next.f9559v) {
                        boolean zEquals = next.y.equals(this.f9553fb);
                        boolean z5 = z && zEquals && next.f9556a;
                        if (zEquals) {
                            this.f9553fb = null;
                        }
                        this.f9555v.dm(yVar, next.y, z5);
                    }
                }
            }
            wz(yVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public kp(g4.r<String> rVar) {
        this.f9554gv = rVar;
        this.y = new xq.gv();
        this.n3 = new xq.n3();
        this.zn = new HashMap<>();
        this.f9552a = xq.y;
    }
}

package lf;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import b1.fh;
import ft.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lf.ud;
import v0.hw;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ej implements b1.t {
    public static final b1.mt z = new b1.mt() { // from class: lf.z6
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return ej.i4();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.zn f6284a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final SparseBooleanArray f6285c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f6286co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ta f6287f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final SparseArray<ud> f6288fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final v0.d f6289gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final d f6290i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6291mt;
    public final int n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ud f6292p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseBooleanArray f6293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b1.wz f6294t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6295tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseIntArray f6296v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f6297wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f6298xc;
    public final int y;
    public final List<hw> zn;

    public ej() {
        this(0);
    }

    public static /* synthetic */ int f(ej ejVar) {
        int i = ejVar.f6295tl;
        ejVar.f6295tl = i + 1;
        return i;
    }

    private void f3(long j) {
        if (this.f6298xc) {
            return;
        }
        this.f6298xc = true;
        if (this.f6290i9.n3() == -9223372036854775807L) {
            this.f6294t.z(new fh.n3(this.f6290i9.n3()));
            return;
        }
        ta taVar = new ta(this.f6290i9.zn(), this.f6290i9.n3(), j, this.f6286co, this.n3);
        this.f6287f = taVar;
        this.f6294t.z(taVar.n3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] i4() {
        return new b1.t[]{new ej()};
    }

    public final boolean c(int i) {
        return this.y == 2 || this.f6297wz || !this.f6285c5.get(i, false);
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        long length = tlVar.getLength();
        if (this.f6297wz) {
            if (length != -1 && this.y != 2 && !this.f6290i9.gv()) {
                return this.f6290i9.v(tlVar, d0Var, this.f6286co);
            }
            f3(length);
            if (this.w) {
                this.w = false;
                y(0L, 0L);
                if (tlVar.getPosition() != 0) {
                    d0Var.y = 0L;
                    return 1;
                }
            }
            ta taVar = this.f6287f;
            if (taVar != null && taVar.gv()) {
                return this.f6287f.zn(tlVar, d0Var);
            }
        }
        if (!r(tlVar)) {
            return -1;
        }
        int iX4 = x4();
        int iFb = this.f6289gv.fb();
        if (iX4 > iFb) {
            return 0;
        }
        int iP = this.f6289gv.p();
        if ((8388608 & iP) != 0) {
            this.f6289gv.oz(iX4);
            return 0;
        }
        int i = (4194304 & iP) != 0 ? 1 : 0;
        int i5 = (2096896 & iP) >> 8;
        boolean z5 = (iP & 32) != 0;
        ud udVar = (iP & 16) != 0 ? this.f6288fb.get(i5) : null;
        if (udVar == null) {
            this.f6289gv.oz(iX4);
            return 0;
        }
        if (this.y != 2) {
            int i8 = iP & 15;
            int i10 = this.f6296v.get(i5, i8 - 1);
            this.f6296v.put(i5, i8);
            if (i10 == i8) {
                this.f6289gv.oz(iX4);
                return 0;
            }
            if (i8 != ((i10 + 1) & 15)) {
                udVar.zn();
            }
        }
        if (z5) {
            int iEj = this.f6289gv.ej();
            i |= (this.f6289gv.ej() & 64) != 0 ? 2 : 0;
            this.f6289gv.ut(iEj - 1);
        }
        boolean z7 = this.f6297wz;
        if (c(i5)) {
            this.f6289gv.j(iX4);
            udVar.y(this.f6289gv, i);
            this.f6289gv.j(iFb);
        }
        if (this.y != 2 && !z7 && this.f6297wz && length != -1) {
            this.w = true;
        }
        this.f6289gv.oz(iX4);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // b1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gv(b1.tl r7) throws java.io.IOException {
        /*
            r6 = this;
            v0.d r0 = r6.f6289gv
            byte[] r0 = r0.v()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.z(r0, r2, r1)
            r1 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.w(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.ej.gv(b1.tl):boolean");
    }

    public final void n() {
        this.f6293s.clear();
        this.f6288fb.clear();
        SparseArray<ud> sparseArrayY = this.f6284a.y();
        int size = sparseArrayY.size();
        for (int i = 0; i < size; i++) {
            this.f6288fb.put(sparseArrayY.keyAt(i), sparseArrayY.valueAt(i));
        }
        this.f6288fb.put(0, new rz(new y()));
        this.f6292p = null;
    }

    public final boolean r(b1.tl tlVar) throws IOException {
        byte[] bArrV = this.f6289gv.v();
        if (9400 - this.f6289gv.a() < 188) {
            int iY = this.f6289gv.y();
            if (iY > 0) {
                System.arraycopy(bArrV, this.f6289gv.a(), bArrV, 0, iY);
            }
            this.f6289gv.o(bArrV, iY);
        }
        while (this.f6289gv.y() < 188) {
            int iFb = this.f6289gv.fb();
            int i = tlVar.read(bArrV, iFb, 9400 - iFb);
            if (i == -1) {
                return false;
            }
            this.f6289gv.j(iFb + i);
        }
        return true;
    }

    public final int x4() throws q {
        int iA = this.f6289gv.a();
        int iFb = this.f6289gv.fb();
        int iY = a8.y(this.f6289gv.v(), iA, iFb);
        this.f6289gv.oz(iY);
        int i = iY + 188;
        if (i > iFb) {
            int i5 = this.f6291mt + (iY - iA);
            this.f6291mt = i5;
            if (this.y == 2 && i5 > 376) {
                throw q.y("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f6291mt = 0;
        }
        return i;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        ta taVar;
        v0.y.fb(this.y != 2);
        int size = this.zn.size();
        for (int i = 0; i < size; i++) {
            hw hwVar = this.zn.get(i);
            boolean z5 = hwVar.v() == -9223372036854775807L;
            if (!z5) {
                long jZn = hwVar.zn();
                z5 = (jZn == -9223372036854775807L || jZn == 0 || jZn == j4) ? false : true;
            }
            if (z5) {
                hwVar.fb(j4);
            }
        }
        if (j4 != 0 && (taVar = this.f6287f) != null) {
            taVar.s(j4);
        }
        this.f6289gv.j5(0);
        this.f6296v.clear();
        for (int i5 = 0; i5 < this.f6288fb.size(); i5++) {
            this.f6288fb.valueAt(i5).zn();
        }
        this.f6291mt = 0;
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.f6294t = wzVar;
    }

    public ej(int i) {
        this(1, i, 112800);
    }

    public ej(int i, int i5, int i8) {
        this(i, new hw(0L), new i9(i5), i8);
    }

    public ej(int i, hw hwVar, ud.zn znVar) {
        this(i, hwVar, znVar, 112800);
    }

    public ej(int i, hw hwVar, ud.zn znVar, int i5) {
        this.f6284a = (ud.zn) v0.y.v(znVar);
        this.n3 = i5;
        this.y = i;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.zn = arrayList;
            arrayList.add(hwVar);
        } else {
            this.zn = Collections.singletonList(hwVar);
        }
        this.f6289gv = new v0.d(new byte[9400], 0);
        this.f6293s = new SparseBooleanArray();
        this.f6285c5 = new SparseBooleanArray();
        this.f6288fb = new SparseArray<>();
        this.f6296v = new SparseIntArray();
        this.f6290i9 = new d(i5);
        this.f6294t = b1.wz.f1283c5;
        this.f6286co = -1;
        n();
    }

    @Override // b1.t
    public void release() {
    }

    public class n3 implements fh {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f6299gv;
        public final v0.ta y = new v0.ta(new byte[5]);
        public final SparseArray<ud> n3 = new SparseArray<>();
        public final SparseIntArray zn = new SparseIntArray();

        public n3(int i) {
            this.f6299gv = i;
        }

        @Override // lf.fh
        public void y(v0.d dVar) {
            hw hwVar;
            if (dVar.ej() != 2) {
                return;
            }
            if (ej.this.y == 1 || ej.this.y == 2 || ej.this.f6295tl == 1) {
                hwVar = (hw) ej.this.zn.get(0);
            } else {
                hwVar = new hw(((hw) ej.this.zn.get(0)).zn());
                ej.this.zn.add(hwVar);
            }
            if ((dVar.ej() & 128) == 0) {
                return;
            }
            dVar.ut(1);
            int iYt = dVar.yt();
            int i = 3;
            dVar.ut(3);
            dVar.f(this.y, 2);
            this.y.mt(3);
            int i5 = 13;
            ej.this.f6286co = this.y.s(13);
            dVar.f(this.y, 2);
            int i8 = 4;
            this.y.mt(4);
            dVar.ut(this.y.s(12));
            if (ej.this.y == 2 && ej.this.f6292p == null) {
                ud.n3 n3Var = new ud.n3(21, null, null, ut.f8757a);
                ej ejVar = ej.this;
                ejVar.f6292p = ejVar.f6284a.n3(21, n3Var);
                if (ej.this.f6292p != null) {
                    ej.this.f6292p.n3(hwVar, ej.this.f6294t, new ud.gv(iYt, 21, 8192));
                }
            }
            this.n3.clear();
            this.zn.clear();
            int iY = dVar.y();
            while (iY > 0) {
                dVar.f(this.y, 5);
                int iS = this.y.s(8);
                this.y.mt(i);
                int iS2 = this.y.s(i5);
                this.y.mt(i8);
                int iS3 = this.y.s(12);
                ud.n3 n3VarZn = zn(dVar, iS3);
                if (iS == 6 || iS == 5) {
                    iS = n3VarZn.y;
                }
                iY -= iS3 + 5;
                int i10 = ej.this.y == 2 ? iS : iS2;
                if (!ej.this.f6293s.get(i10)) {
                    ud udVarN3 = (ej.this.y == 2 && iS == 21) ? ej.this.f6292p : ej.this.f6284a.n3(iS, n3VarZn);
                    if (ej.this.y != 2 || iS2 < this.zn.get(i10, 8192)) {
                        this.zn.put(i10, iS2);
                        this.n3.put(i10, udVarN3);
                    }
                }
                i = 3;
                i8 = 4;
                i5 = 13;
            }
            int size = this.zn.size();
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.zn.keyAt(i11);
                int iValueAt = this.zn.valueAt(i11);
                ej.this.f6293s.put(iKeyAt, true);
                ej.this.f6285c5.put(iValueAt, true);
                ud udVarValueAt = this.n3.valueAt(i11);
                if (udVarValueAt != null) {
                    if (udVarValueAt != ej.this.f6292p) {
                        udVarValueAt.n3(hwVar, ej.this.f6294t, new ud.gv(iYt, iKeyAt, 8192));
                    }
                    ej.this.f6288fb.put(iValueAt, udVarValueAt);
                }
            }
            if (ej.this.y == 2) {
                if (ej.this.f6297wz) {
                    return;
                }
                ej.this.f6294t.p();
                ej.this.f6295tl = 0;
                ej.this.f6297wz = true;
                return;
            }
            ej.this.f6288fb.remove(this.f6299gv);
            ej ejVar2 = ej.this;
            ejVar2.f6295tl = ejVar2.y == 1 ? 0 : ej.this.f6295tl - 1;
            if (ej.this.f6295tl == 0) {
                ej.this.f6294t.p();
                ej.this.f6297wz = true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final lf.ud.n3 zn(v0.d r14, int r15) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lf.ej.n3.zn(v0.d, int):lf.ud$n3");
        }

        @Override // lf.fh
        public void n3(hw hwVar, b1.wz wzVar, ud.gv gvVar) {
        }
    }

    public class y implements fh {
        public final v0.ta y = new v0.ta(new byte[4]);

        public y() {
        }

        @Override // lf.fh
        public void y(v0.d dVar) {
            if (dVar.ej() == 0 && (dVar.ej() & 128) != 0) {
                dVar.ut(6);
                int iY = dVar.y() / 4;
                for (int i = 0; i < iY; i++) {
                    dVar.f(this.y, 4);
                    int iS = this.y.s(16);
                    this.y.mt(3);
                    if (iS == 0) {
                        this.y.mt(13);
                    } else {
                        int iS2 = this.y.s(13);
                        if (ej.this.f6288fb.get(iS2) == null) {
                            ej.this.f6288fb.put(iS2, new rz(ej.this.new n3(iS2)));
                            ej.f(ej.this);
                        }
                    }
                }
                if (ej.this.y != 2) {
                    ej.this.f6288fb.remove(0);
                }
            }
        }

        @Override // lf.fh
        public void n3(hw hwVar, b1.wz wzVar, ud.gv gvVar) {
        }
    }
}

package ig;

import b1.tl;
import b1.xc;
import ft.q;
import java.io.IOException;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5673a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f5674c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f5676fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f5677gv;
    public int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5679s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5680v;
    public int y;
    public long zn;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final int[] f5678i9 = new int[255];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5675f = new d(255);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.wz(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gv(b1.tl r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.f()
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            v0.y.y(r0)
            v0.d r0 = r8.f5675f
            r1 = 4
            r0.j5(r1)
        L1a:
            r2 = -1
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r2 = r9.getPosition()
            r6 = 4
            long r2 = r2 + r6
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 >= 0) goto L51
        L2b:
            v0.d r2 = r8.f5675f
            byte[] r2 = r2.v()
            boolean r2 = b1.xc.n3(r9, r2, r4, r1, r5)
            if (r2 == 0) goto L51
            v0.d r0 = r8.f5675f
            r0.oz(r4)
            v0.d r0 = r8.f5675f
            long r2 = r0.a8()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.s()
            return r5
        L4d:
            r9.w(r5)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r1 = r9.getPosition()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r1 = r9.wz(r5)
            r2 = -1
            if (r1 == r2) goto L63
            goto L51
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.a.gv(b1.tl, long):boolean");
    }

    public void n3() {
        this.y = 0;
        this.n3 = 0;
        this.zn = 0L;
        this.f5677gv = 0L;
        this.f5680v = 0L;
        this.f5673a = 0L;
        this.f5676fb = 0;
        this.f5679s = 0;
        this.f5674c5 = 0;
    }

    public boolean y(tl tlVar, boolean z) throws IOException {
        n3();
        this.f5675f.j5(27);
        if (!xc.n3(tlVar, this.f5675f.v(), 0, 27, z) || this.f5675f.a8() != 1332176723) {
            return false;
        }
        int iEj = this.f5675f.ej();
        this.y = iEj;
        if (iEj != 0) {
            if (z) {
                return false;
            }
            throw q.f("unsupported bit stream revision");
        }
        this.n3 = this.f5675f.ej();
        this.zn = this.f5675f.x4();
        this.f5677gv = this.f5675f.f3();
        this.f5680v = this.f5675f.f3();
        this.f5673a = this.f5675f.f3();
        int iEj2 = this.f5675f.ej();
        this.f5676fb = iEj2;
        this.f5679s = iEj2 + 27;
        this.f5675f.j5(iEj2);
        if (!xc.n3(tlVar, this.f5675f.v(), 0, this.f5676fb, z)) {
            return false;
        }
        for (int i = 0; i < this.f5676fb; i++) {
            this.f5678i9[i] = this.f5675f.ej();
            this.f5674c5 += this.f5678i9[i];
        }
        return true;
    }

    public boolean zn(tl tlVar) throws IOException {
        return gv(tlVar, -1L);
    }
}

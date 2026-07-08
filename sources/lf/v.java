package lf;

import android.net.Uri;
import b1.fh;
import java.io.IOException;
import java.util.Map;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class v implements b1.t {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final b1.mt f6370gv = new b1.mt() { // from class: lf.gv
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return v.v();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };
    public boolean zn;
    public final a y = new a();
    public final v0.d n3 = new v0.d(16384);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] v() {
        return new b1.t[]{new v()};
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        int i = tlVar.read(this.n3.v(), 0, 16384);
        if (i == -1) {
            return -1;
        }
        this.n3.oz(0);
        this.n3.j(i);
        if (!this.zn) {
            this.y.a(0L, 4);
            this.zn = true;
        }
        this.y.y(this.n3);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r9.s();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return false;
     */
    @Override // b1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gv(b1.tl r9) throws java.io.IOException {
        /*
            r8 = this;
            v0.d r0 = new v0.d
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.v()
            r9.z(r4, r2, r1)
            r0.oz(r2)
            int r4 = r0.x()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.s()
            r9.tl(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.v()
            r6 = 7
            r9.z(r5, r2, r6)
            r0.oz(r2)
            int r5 = r0.yt()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.s()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.tl(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.v()
            int r5 = mn.zn.v(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.tl(r5)
            goto L24
        L65:
            r4 = 3
            r0.ut(r4)
            int r4 = r0.z6()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.tl(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.v.gv(b1.tl):boolean");
    }

    @Override // b1.t
    public void y(long j, long j4) {
        this.zn = false;
        this.y.zn();
    }

    @Override // b1.t
    public void zn(b1.wz wzVar) {
        this.y.v(wzVar, new ud.gv(0, 1));
        wzVar.p();
        wzVar.z(new fh.n3(-9223372036854775807L));
    }

    @Override // b1.t
    public void release() {
    }
}

package lf;

import android.net.Uri;
import b1.fh;
import java.io.IOException;
import java.util.Map;
import lf.ud;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements b1.t {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final b1.mt f6326gv = new b1.mt() { // from class: lf.y
        @Override // b1.mt
        public final b1.t[] createExtractors() {
            return n3.v();
        }

        @Override // b1.mt
        public /* synthetic */ b1.t[] y(Uri uri, Map map) {
            return b1.p.y(this, uri, map);
        }
    };
    public boolean zn;
    public final zn y = new zn();
    public final v0.d n3 = new v0.d(2786);

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b1.t[] v() {
        return new b1.t[]{new n3()};
    }

    @Override // b1.t
    public int fb(b1.tl tlVar, b1.d0 d0Var) throws IOException {
        int i = tlVar.read(this.n3.v(), 0, 2786);
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.s();
        r4 = r4 + 1;
     */
    @Override // b1.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean gv(b1.tl r8) throws java.io.IOException {
        /*
            r7 = this;
            v0.d r0 = new v0.d
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.v()
            r8.z(r4, r2, r1)
            r0.oz(r2)
            int r4 = r0.x()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.s()
            r8.tl(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.v()
            r6 = 6
            r8.z(r5, r2, r6)
            r0.oz(r2)
            int r5 = r0.yt()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.s()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.tl(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.v()
            int r5 = mn.n3.fb(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.tl(r5)
            goto L24
        L5f:
            r4 = 3
            r0.ut(r4)
            int r4 = r0.z6()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.tl(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.n3.gv(b1.tl):boolean");
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

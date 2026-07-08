package u4;

import android.net.Uri;
import b1.d0;
import b1.fh;
import b1.mt;
import b1.p;
import b1.t;
import b1.tl;
import b1.wz;
import java.io.IOException;
import java.util.Map;
import v0.d;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mt f8354p = new mt() { // from class: u4.n3
        @Override // b1.mt
        public final t[] createExtractors() {
            return zn.s();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wz f8355a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f8356c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8357f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f8360i9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8362t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public long f8363tl;
    public a w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f8365wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public y f8366xc;
    public final d y = new d(4);
    public final d n3 = new d(9);
    public final d zn = new d(11);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final d f8359gv = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final gv f8364v = new gv();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8358fb = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] s() {
        return new t[]{new zn()};
    }

    public final long a() {
        if (this.f8361s) {
            return this.f8356c5 + this.f8363tl;
        }
        if (this.f8364v.gv() == -9223372036854775807L) {
            return 0L;
        }
        return this.f8363tl;
    }

    public final d c5(tl tlVar) throws IOException {
        if (this.f8362t > this.f8359gv.n3()) {
            d dVar = this.f8359gv;
            dVar.o(new byte[Math.max(dVar.n3() * 2, this.f8362t)], 0);
        } else {
            this.f8359gv.oz(0);
        }
        this.f8359gv.j(this.f8362t);
        tlVar.readFully(this.f8359gv.v(), 0, this.f8362t);
        return this.f8359gv;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(b1.tl r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.a()
            int r2 = r9.f8357f
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            u4.y r3 = r9.f8366xc
            if (r3 == 0) goto L23
            r9.v()
            u4.y r2 = r9.f8366xc
            v0.d r10 = r9.c5(r10)
            boolean r10 = r2.y(r10, r0)
        L21:
            r0 = 1
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            u4.a r3 = r9.w
            if (r3 == 0) goto L39
            r9.v()
            u4.a r2 = r9.w
            v0.d r10 = r9.c5(r10)
            boolean r10 = r2.y(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f8365wz
            if (r2 != 0) goto L6e
            u4.gv r2 = r9.f8364v
            v0.d r10 = r9.c5(r10)
            boolean r10 = r2.y(r10, r0)
            u4.gv r0 = r9.f8364v
            long r0 = r0.gv()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            b1.wz r2 = r9.f8355a
            b1.c r3 = new b1.c
            u4.gv r7 = r9.f8364v
            long[] r7 = r7.v()
            u4.gv r8 = r9.f8364v
            long[] r8 = r8.a()
            r3.<init>(r7, r8, r0)
            r2.z(r3)
            r9.f8365wz = r6
            goto L21
        L6e:
            int r0 = r9.f8362t
            r10.w(r0)
            r10 = 0
            r0 = 0
        L75:
            boolean r1 = r9.f8361s
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f8361s = r6
            u4.gv r10 = r9.f8364v
            long r1 = r10.gv()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f8363tl
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f8356c5 = r1
        L8f:
            r10 = 4
            r9.f8360i9 = r10
            r10 = 2
            r9.f8358fb = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.zn.f(b1.tl):boolean");
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        v0.y.c5(this.f8355a);
        while (true) {
            int i = this.f8358fb;
            if (i != 1) {
                if (i == 2) {
                    tl(tlVar);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (f(tlVar)) {
                        return 0;
                    }
                } else if (!t(tlVar)) {
                    return -1;
                }
            } else if (!i9(tlVar)) {
                return -1;
            }
        }
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        tlVar.z(this.y.v(), 0, 3);
        this.y.oz(0);
        if (this.y.x() != 4607062) {
            return false;
        }
        tlVar.z(this.y.v(), 0, 2);
        this.y.oz(0);
        if ((this.y.yt() & 250) != 0) {
            return false;
        }
        tlVar.z(this.y.v(), 0, 4);
        this.y.oz(0);
        int iP = this.y.p();
        tlVar.s();
        tlVar.tl(iP);
        tlVar.z(this.y.v(), 0, 4);
        this.y.oz(0);
        return this.y.p() == 0;
    }

    public final boolean i9(tl tlVar) throws IOException {
        if (!tlVar.i9(this.n3.v(), 0, 9, true)) {
            return false;
        }
        this.n3.oz(0);
        this.n3.ut(4);
        int iEj = this.n3.ej();
        boolean z = (iEj & 4) != 0;
        boolean z5 = (iEj & 1) != 0;
        if (z && this.f8366xc == null) {
            this.f8366xc = new y(this.f8355a.a(8, 1));
        }
        if (z5 && this.w == null) {
            this.w = new a(this.f8355a.a(9, 2));
        }
        this.f8355a.p();
        this.f8360i9 = this.n3.p() - 5;
        this.f8358fb = 2;
        return true;
    }

    public final boolean t(tl tlVar) throws IOException {
        if (!tlVar.i9(this.zn.v(), 0, 11, true)) {
            return false;
        }
        this.zn.oz(0);
        this.f8357f = this.zn.ej();
        this.f8362t = this.zn.x();
        this.f8363tl = this.zn.x();
        this.f8363tl = (((long) (this.zn.ej() << 24)) | this.f8363tl) * 1000;
        this.zn.ut(3);
        this.f8358fb = 4;
        return true;
    }

    public final void tl(tl tlVar) throws IOException {
        tlVar.w(this.f8360i9);
        this.f8360i9 = 0;
        this.f8358fb = 3;
    }

    public final void v() {
        if (this.f8365wz) {
            return;
        }
        this.f8355a.z(new fh.n3(-9223372036854775807L));
        this.f8365wz = true;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        if (j == 0) {
            this.f8358fb = 1;
            this.f8361s = false;
        } else {
            this.f8358fb = 3;
        }
        this.f8360i9 = 0;
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.f8355a = wzVar;
    }

    @Override // b1.t
    public void release() {
    }
}

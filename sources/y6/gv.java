package y6;

import android.net.Uri;
import androidx.annotation.Nullable;
import b1.co;
import b1.d0;
import b1.fh;
import b1.mt;
import b1.p;
import b1.r;
import b1.t;
import b1.ta;
import b1.tl;
import b1.wz;
import b1.x4;
import b1.z;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.Map;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements t {

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final mt f9307xc = new mt() { // from class: y6.zn
        @Override // b1.mt
        public final t[] createExtractors() {
            return gv.i9();
        }

        @Override // b1.mt
        public /* synthetic */ t[] y(Uri uri, Map map) {
            return p.y(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ta f9308a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public x4 f9309c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9310f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9311fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final co.y f9312gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f9313i9;
    public final d n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Metadata f9314s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n3 f9315t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f9316tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public wz f9317v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f9318wz;
    public final byte[] y;
    public final boolean zn;

    public gv() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t[] i9() {
        return new t[]{new gv()};
    }

    public final void a(tl tlVar) throws IOException {
        this.f9310f = z.n3(tlVar);
        ((wz) ut.i9(this.f9317v)).z(s(tlVar.getPosition(), tlVar.getLength()));
        this.f9311fb = 5;
    }

    public final void c5(tl tlVar) throws IOException {
        byte[] bArr = this.y;
        tlVar.z(bArr, 0, bArr.length);
        tlVar.s();
        this.f9311fb = 2;
    }

    public final void f() {
        ((ta) ut.i9(this.f9308a)).a((this.f9318wz * 1000000) / ((long) ((x4) ut.i9(this.f9309c5)).f1292v), 1, this.f9316tl, 0, null);
    }

    @Override // b1.t
    public int fb(tl tlVar, d0 d0Var) throws IOException {
        int i = this.f9311fb;
        if (i == 0) {
            tl(tlVar);
            return 0;
        }
        if (i == 1) {
            c5(tlVar);
            return 0;
        }
        if (i == 2) {
            xc(tlVar);
            return 0;
        }
        if (i == 3) {
            wz(tlVar);
            return 0;
        }
        if (i == 4) {
            a(tlVar);
            return 0;
        }
        if (i == 5) {
            return t(tlVar, d0Var);
        }
        throw new IllegalStateException();
    }

    @Override // b1.t
    public boolean gv(tl tlVar) throws IOException {
        z.zn(tlVar, false);
        return z.y(tlVar);
    }

    public final fh s(long j, long j4) {
        v0.y.v(this.f9309c5);
        x4 x4Var = this.f9309c5;
        if (x4Var.f1286f != null) {
            return new r(x4Var, j);
        }
        if (j4 == -1 || x4Var.f1289i9 <= 0) {
            return new fh.n3(x4Var.a());
        }
        n3 n3Var = new n3(x4Var, this.f9310f, j, j4);
        this.f9315t = n3Var;
        return n3Var.n3();
    }

    public final int t(tl tlVar, d0 d0Var) throws IOException {
        boolean z;
        v0.y.v(this.f9308a);
        v0.y.v(this.f9309c5);
        n3 n3Var = this.f9315t;
        if (n3Var != null && n3Var.gv()) {
            return this.f9315t.zn(tlVar, d0Var);
        }
        if (this.f9318wz == -1) {
            this.f9318wz = co.c5(tlVar, this.f9309c5);
            return 0;
        }
        int iFb = this.n3.fb();
        if (iFb < 32768) {
            int i = tlVar.read(this.n3.v(), iFb, 32768 - iFb);
            z = i == -1;
            if (!z) {
                this.n3.j(iFb + i);
            } else if (this.n3.y() == 0) {
                f();
                return -1;
            }
        } else {
            z = false;
        }
        int iA = this.n3.a();
        int i5 = this.f9316tl;
        int i8 = this.f9313i9;
        if (i5 < i8) {
            d dVar = this.n3;
            dVar.ut(Math.min(i8 - i5, dVar.y()));
        }
        long jV = v(this.n3, z);
        int iA2 = this.n3.a() - iA;
        this.n3.oz(iA);
        this.f9308a.n3(this.n3, iA2);
        this.f9316tl += iA2;
        if (jV != -1) {
            f();
            this.f9316tl = 0;
            this.f9318wz = jV;
        }
        if (this.n3.y() < 16) {
            int iY = this.n3.y();
            System.arraycopy(this.n3.v(), this.n3.a(), this.n3.v(), 0, iY);
            this.n3.oz(0);
            this.n3.j(iY);
        }
        return 0;
    }

    public final void tl(tl tlVar) throws IOException {
        this.f9314s = z.gv(tlVar, !this.zn);
        this.f9311fb = 1;
    }

    public final long v(d dVar, boolean z) {
        boolean zGv;
        v0.y.v(this.f9309c5);
        int iA = dVar.a();
        while (iA <= dVar.fb() - 16) {
            dVar.oz(iA);
            if (co.gv(dVar, this.f9309c5, this.f9310f, this.f9312gv)) {
                dVar.oz(iA);
                return this.f9312gv.y;
            }
            iA++;
        }
        if (!z) {
            dVar.oz(iA);
            return -1L;
        }
        while (iA <= dVar.fb() - this.f9313i9) {
            dVar.oz(iA);
            try {
                zGv = co.gv(dVar, this.f9309c5, this.f9310f, this.f9312gv);
            } catch (IndexOutOfBoundsException unused) {
                zGv = false;
            }
            if (dVar.a() <= dVar.fb() ? zGv : false) {
                dVar.oz(iA);
                return this.f9312gv.y;
            }
            iA++;
        }
        dVar.oz(dVar.fb());
        return -1L;
    }

    public final void wz(tl tlVar) throws IOException {
        z.y yVar = new z.y(this.f9309c5);
        boolean zV = false;
        while (!zV) {
            zV = z.v(tlVar, yVar);
            this.f9309c5 = (x4) ut.i9(yVar.y);
        }
        v0.y.v(this.f9309c5);
        this.f9313i9 = Math.max(this.f9309c5.zn, 6);
        ((ta) ut.i9(this.f9308a)).y(this.f9309c5.fb(this.y, this.f9314s));
        this.f9311fb = 4;
    }

    public final void xc(tl tlVar) throws IOException {
        z.c5(tlVar);
        this.f9311fb = 3;
    }

    @Override // b1.t
    public void y(long j, long j4) {
        if (j == 0) {
            this.f9311fb = 0;
        } else {
            n3 n3Var = this.f9315t;
            if (n3Var != null) {
                n3Var.s(j4);
            }
        }
        this.f9318wz = j4 != 0 ? -1L : 0L;
        this.f9316tl = 0;
        this.n3.j5(0);
    }

    @Override // b1.t
    public void zn(wz wzVar) {
        this.f9317v = wzVar;
        this.f9308a = wzVar.a(0, 1);
        wzVar.p();
    }

    public gv(int i) {
        this.y = new byte[42];
        this.n3 = new d(new byte[32768], 0);
        this.zn = (i & 1) != 0;
        this.f9312gv = new co.y();
        this.f9311fb = 0;
    }

    @Override // b1.t
    public void release() {
    }
}

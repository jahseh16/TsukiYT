package ig;

import b1.d0;
import b1.fh;
import b1.ta;
import b1.tl;
import b1.wz;
import ft.g;
import java.io.IOException;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5681a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f5682c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5683f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5684fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public fb f5685gv;
    public ta n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5688t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f5689tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5690v;
    public wz zn;
    public final v y = new v();

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public n3 f5686i9 = new n3();

    public static class n3 {
        public fb n3;
        public g y;
    }

    public abstract long a(d dVar);

    public abstract boolean c5(d dVar, long j, n3 n3Var) throws IOException;

    public final int f(tl tlVar, d0 d0Var) throws IOException {
        long jN3 = this.f5685gv.n3(tlVar);
        if (jN3 >= 0) {
            d0Var.y = jN3;
            return 1;
        }
        if (jN3 < -1) {
            v(-(jN3 + 2));
        }
        if (!this.f5688t) {
            this.zn.z((fh) v0.y.c5(this.f5685gv.y()));
            this.f5688t = true;
        }
        if (this.f5683f <= 0 && !this.y.gv(tlVar)) {
            this.f5687s = 3;
            return -1;
        }
        this.f5683f = 0L;
        d dVarZn = this.y.zn();
        long jA = a(dVarZn);
        if (jA >= 0) {
            long j = this.f5684fb;
            if (j + jA >= this.f5690v) {
                long jN32 = n3(j);
                this.n3.n3(dVarZn, dVarZn.fb());
                this.n3.a(jN32, 1, dVarZn.fb(), 0, null);
                this.f5690v = -1L;
            }
        }
        this.f5684fb += jA;
        return 0;
    }

    public final int fb(tl tlVar, d0 d0Var) throws IOException {
        y();
        int i = this.f5687s;
        if (i == 0) {
            return i9(tlVar);
        }
        if (i == 1) {
            tlVar.w((int) this.f5681a);
            this.f5687s = 2;
            return 0;
        }
        if (i == 2) {
            ut.i9(this.f5685gv);
            return f(tlVar, d0Var);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public void gv(wz wzVar, ta taVar) {
        this.zn = wzVar;
        this.n3 = taVar;
        t(true);
    }

    public final int i9(tl tlVar) throws IOException {
        if (!s(tlVar)) {
            return -1;
        }
        g gVar = this.f5686i9.y;
        this.f5682c5 = gVar.oz;
        if (!this.f5689tl) {
            this.n3.y(gVar);
            this.f5689tl = true;
        }
        fb fbVar = this.f5686i9.n3;
        if (fbVar != null) {
            this.f5685gv = fbVar;
        } else if (tlVar.getLength() == -1) {
            this.f5685gv = new zn();
        } else {
            a aVarN3 = this.y.n3();
            this.f5685gv = new ig.y(this, this.f5681a, tlVar.getLength(), aVarN3.f5679s + aVarN3.f5674c5, aVarN3.zn, (aVarN3.n3 & 4) != 0);
        }
        this.f5687s = 2;
        this.y.a();
        return 0;
    }

    public long n3(long j) {
        return (j * 1000000) / ((long) this.f5682c5);
    }

    public final boolean s(tl tlVar) throws IOException {
        while (this.y.gv(tlVar)) {
            this.f5683f = tlVar.getPosition() - this.f5681a;
            if (!c5(this.y.zn(), this.f5681a, this.f5686i9)) {
                return true;
            }
            this.f5681a = tlVar.getPosition();
        }
        this.f5687s = 3;
        return false;
    }

    public void t(boolean z) {
        if (z) {
            this.f5686i9 = new n3();
            this.f5681a = 0L;
            this.f5687s = 0;
        } else {
            this.f5687s = 1;
        }
        this.f5690v = -1L;
        this.f5684fb = 0L;
    }

    public final void tl(long j, long j4) {
        this.y.v();
        if (j == 0) {
            t(!this.f5688t);
        } else if (this.f5687s != 0) {
            this.f5690v = zn(j4);
            ((fb) ut.i9(this.f5685gv)).zn(this.f5690v);
            this.f5687s = 2;
        }
    }

    public void v(long j) {
        this.f5684fb = j;
    }

    public final void y() {
        v0.y.c5(this.n3);
        ut.i9(this.zn);
    }

    public long zn(long j) {
        return (((long) this.f5682c5) * j) / 1000000;
    }

    public static final class zn implements fb {
        public zn() {
        }

        @Override // ig.fb
        public long n3(tl tlVar) {
            return -1L;
        }

        @Override // ig.fb
        public fh y() {
            return new fh.n3(-9223372036854775807L);
        }

        @Override // ig.fb
        public void zn(long j) {
        }
    }
}

package ig;

import androidx.annotation.Nullable;
import b1.fh;
import b1.rz;
import b1.tl;
import b1.xc;
import java.io.EOFException;
import java.io.IOException;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5705a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public long f5706c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5707f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public long f5708fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final c5 f5709gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public long f5710i9;
    public final long n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5712t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f5713v;
    public final a y;
    public final long zn;

    public final class n3 implements fh {
        public n3() {
        }

        @Override // b1.fh
        public long c5() {
            return y.this.f5709gv.n3(y.this.f5705a);
        }

        @Override // b1.fh
        public boolean s() {
            return true;
        }

        @Override // b1.fh
        public fh.y v(long j) {
            return new fh.y(new rz(j, ut.mt((y.this.n3 + ((y.this.f5709gv.zn(j) * (y.this.zn - y.this.n3)) / y.this.f5705a)) - 30000, y.this.n3, y.this.zn - 1)));
        }
    }

    public y(c5 c5Var, long j, long j4, long j7, long j8, boolean z) {
        v0.y.y(j >= 0 && j4 > j);
        this.f5709gv = c5Var;
        this.n3 = j;
        this.zn = j4;
        if (j7 == j4 - j || z) {
            this.f5705a = j8;
            this.f5713v = 4;
        } else {
            this.f5713v = 0;
        }
        this.y = new a();
    }

    public final long c5(tl tlVar) throws IOException {
        if (this.f5706c5 == this.f5710i9) {
            return -1L;
        }
        long position = tlVar.getPosition();
        if (!this.y.gv(tlVar, this.f5710i9)) {
            long j = this.f5706c5;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.y.y(tlVar, false);
        tlVar.s();
        long j4 = this.f5711s;
        a aVar = this.y;
        long j7 = aVar.zn;
        long j8 = j4 - j7;
        int i = aVar.f5679s + aVar.f5674c5;
        if (0 <= j8 && j8 < 72000) {
            return -1L;
        }
        if (j8 < 0) {
            this.f5710i9 = position;
            this.f5712t = j7;
        } else {
            this.f5706c5 = tlVar.getPosition() + ((long) i);
            this.f5707f = this.y.zn;
        }
        long j9 = this.f5710i9;
        long j10 = this.f5706c5;
        if (j9 - j10 < 100000) {
            this.f5710i9 = j10;
            return j10;
        }
        long position2 = tlVar.getPosition() - (((long) i) * (j8 <= 0 ? 2L : 1L));
        long j11 = this.f5710i9;
        long j12 = this.f5706c5;
        return ut.mt(position2 + ((j8 * (j11 - j12)) / (this.f5712t - this.f5707f)), j12, j11 - 1);
    }

    public final void f(tl tlVar) throws IOException {
        while (true) {
            this.y.zn(tlVar);
            this.y.y(tlVar, false);
            a aVar = this.y;
            if (aVar.zn > this.f5711s) {
                tlVar.s();
                return;
            } else {
                tlVar.w(aVar.f5679s + aVar.f5674c5);
                this.f5706c5 = tlVar.getPosition();
                this.f5707f = this.y.zn;
            }
        }
    }

    public long i9(tl tlVar) throws IOException {
        this.y.n3();
        if (!this.y.zn(tlVar)) {
            throw new EOFException();
        }
        this.y.y(tlVar, false);
        a aVar = this.y;
        tlVar.w(aVar.f5679s + aVar.f5674c5);
        long j = this.y.zn;
        while (true) {
            a aVar2 = this.y;
            if ((aVar2.n3 & 4) == 4 || !aVar2.zn(tlVar) || tlVar.getPosition() >= this.zn || !this.y.y(tlVar, true)) {
                break;
            }
            a aVar3 = this.y;
            if (!xc.v(tlVar, aVar3.f5679s + aVar3.f5674c5)) {
                break;
            }
            j = this.y.zn;
        }
        return j;
    }

    @Override // ig.fb
    public long n3(tl tlVar) throws IOException {
        int i = this.f5713v;
        if (i == 0) {
            long position = tlVar.getPosition();
            this.f5708fb = position;
            this.f5713v = 1;
            long j = this.zn - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jC5 = c5(tlVar);
                if (jC5 != -1) {
                    return jC5;
                }
                this.f5713v = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            f(tlVar);
            this.f5713v = 4;
            return -(this.f5707f + 2);
        }
        this.f5705a = i9(tlVar);
        this.f5713v = 4;
        return this.f5708fb;
    }

    @Override // ig.fb
    @Nullable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public n3 y() {
        if (this.f5705a != 0) {
            return new n3();
        }
        return null;
    }

    @Override // ig.fb
    public void zn(long j) {
        this.f5711s = ut.mt(j, 0L, this.f5705a - 1);
        this.f5713v = 2;
        this.f5706c5 = this.n3;
        this.f5710i9 = this.zn;
        this.f5707f = 0L;
        this.f5712t = this.f5705a;
    }
}

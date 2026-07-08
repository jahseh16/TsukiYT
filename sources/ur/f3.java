package ur;

import androidx.annotation.Nullable;
import ft.p1;
import java.io.IOException;
import ur.d0;
import ur.mg;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements d0, d0.y {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f8516co = -9223372036854775807L;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f8517f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final r0.n3 f8518fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8519p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public mg f8520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public d0.y f8521t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f8522v;

    @Nullable
    public y w;
    public final mg.n3 y;

    public interface y {
        void n3(mg.n3 n3Var, IOException iOException);

        void y(mg.n3 n3Var);
    }

    public f3(mg.n3 n3Var, r0.n3 n3Var2, long j) {
        this.y = n3Var;
        this.f8518fb = n3Var2;
        this.f8522v = j;
    }

    @Override // ur.d0
    public void c5(d0.y yVar, long j) {
        this.f8521t = yVar;
        d0 d0Var = this.f8517f;
        if (d0Var != null) {
            d0Var.c5(this, z(this.f8522v));
        }
    }

    @Override // ur.d0
    public void co(long j, boolean z) {
        ((d0) v0.ut.i9(this.f8517f)).co(j, z);
    }

    @Override // ur.d0
    public long f(n0.c[] cVarArr, boolean[] zArr, en[] enVarArr, boolean[] zArr2, long j) {
        long j4;
        long j7 = this.f8516co;
        if (j7 == -9223372036854775807L || j != this.f8522v) {
            j4 = j;
        } else {
            this.f8516co = -9223372036854775807L;
            j4 = j7;
        }
        return ((d0) v0.ut.i9(this.f8517f)).f(cVarArr, zArr, enVarArr, zArr2, j4);
    }

    public void f3(mg mgVar) {
        v0.y.fb(this.f8520s == null);
        this.f8520s = mgVar;
    }

    @Override // ur.d0, ur.jz
    public long fb() {
        return ((d0) v0.ut.i9(this.f8517f)).fb();
    }

    @Override // ur.d0
    public long gv(long j, p1 p1Var) {
        return ((d0) v0.ut.i9(this.f8517f)).gv(j, p1Var);
    }

    public void i4() {
        if (this.f8517f != null) {
            ((mg) v0.y.v(this.f8520s)).d(this.f8517f);
        }
    }

    @Override // ur.d0
    public long i9(long j) {
        return ((d0) v0.ut.i9(this.f8517f)).i9(j);
    }

    @Override // ur.d0
    public lc mt() {
        return ((d0) v0.ut.i9(this.f8517f)).mt();
    }

    public void n3(mg.n3 n3Var) {
        long jZ = z(this.f8522v);
        d0 d0VarZn = ((mg) v0.y.v(this.f8520s)).zn(n3Var, this.f8518fb, jZ);
        this.f8517f = d0VarZn;
        if (this.f8521t != null) {
            d0VarZn.c5(this, jZ);
        }
    }

    public long p() {
        return this.f8522v;
    }

    @Override // ur.jz.y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void a(d0 d0Var) {
        ((d0.y) v0.ut.i9(this.f8521t)).a(this);
    }

    @Override // ur.d0, ur.jz
    public void s(long j) {
        ((d0) v0.ut.i9(this.f8517f)).s(j);
    }

    @Override // ur.d0
    public long t() {
        return ((d0) v0.ut.i9(this.f8517f)).t();
    }

    @Override // ur.d0, ur.jz
    public boolean v(long j) {
        d0 d0Var = this.f8517f;
        return d0Var != null && d0Var.v(j);
    }

    public long w() {
        return this.f8516co;
    }

    @Override // ur.d0
    public void wz() throws IOException {
        try {
            d0 d0Var = this.f8517f;
            if (d0Var != null) {
                d0Var.wz();
            } else {
                mg mgVar = this.f8520s;
                if (mgVar != null) {
                    mgVar.oz();
                }
            }
        } catch (IOException e4) {
            y yVar = this.w;
            if (yVar == null) {
                throw e4;
            }
            if (this.f8519p) {
                return;
            }
            this.f8519p = true;
            yVar.n3(this.y, e4);
        }
    }

    public void x4(long j) {
        this.f8516co = j;
    }

    @Override // ur.d0.y
    public void xc(d0 d0Var) {
        ((d0.y) v0.ut.i9(this.f8521t)).xc(this);
        y yVar = this.w;
        if (yVar != null) {
            yVar.y(this.y);
        }
    }

    @Override // ur.d0, ur.jz
    public boolean y() {
        d0 d0Var = this.f8517f;
        return d0Var != null && d0Var.y();
    }

    public final long z(long j) {
        long j4 = this.f8516co;
        return j4 != -9223372036854775807L ? j4 : j;
    }

    @Override // ur.d0, ur.jz
    public long zn() {
        return ((d0) v0.ut.i9(this.f8517f)).zn();
    }
}

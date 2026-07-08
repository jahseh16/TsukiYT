package c0;

import androidx.annotation.Nullable;
import b0.c5;
import b0.f;
import b0.i9;
import b0.wz;
import b0.xc;
import c0.v;
import di.s;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public abstract class v implements i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1354a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public n3 f1355gv;
    public final ArrayDeque<xc> n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1356v;
    public final ArrayDeque<n3> y = new ArrayDeque<>();
    public final PriorityQueue<n3> zn;

    public static final class n3 extends wz implements Comparable<n3> {
        public long z;

        public n3() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
        public int compareTo(n3 n3Var) {
            if (t() != n3Var.t()) {
                return t() ? 1 : -1;
            }
            long j = this.f3178f - n3Var.f3178f;
            if (j == 0) {
                j = this.z - n3Var.z;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    public static final class zn extends xc {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public s.y<zn> f1357t;

        public zn(s.y<zn> yVar) {
            this.f1357t = yVar;
        }

        @Override // di.s
        public final void p() {
            this.f1357t.y(this);
        }
    }

    public v() {
        for (int i = 0; i < 10; i++) {
            this.y.add(new n3());
        }
        this.n3 = new ArrayDeque<>();
        for (int i5 = 0; i5 < 2; i5++) {
            this.n3.add(new zn(new s.y() { // from class: c0.gv
                @Override // di.s.y
                public final void y(s sVar) {
                    this.y.wz((v.zn) sVar);
                }
            }));
        }
        this.zn = new PriorityQueue<>();
    }

    public abstract void a(wz wzVar);

    @Nullable
    public final xc c5() {
        return this.n3.pollFirst();
    }

    public abstract boolean f();

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
    public wz gv() throws f {
        v0.y.fb(this.f1355gv == null);
        if (this.y.isEmpty()) {
            return null;
        }
        n3 n3VarPollFirst = this.y.pollFirst();
        this.f1355gv = n3VarPollFirst;
        return n3VarPollFirst;
    }

    @Override // di.gv
    public void flush() {
        this.f1354a = 0L;
        this.f1356v = 0L;
        while (!this.zn.isEmpty()) {
            tl((n3) ut.i9(this.zn.poll()));
        }
        n3 n3Var = this.f1355gv;
        if (n3Var != null) {
            tl(n3Var);
            this.f1355gv = null;
        }
    }

    public final long i9() {
        return this.f1356v;
    }

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public xc n3() throws f {
        if (this.n3.isEmpty()) {
            return null;
        }
        while (!this.zn.isEmpty() && ((n3) ut.i9(this.zn.peek())).f3178f <= this.f1356v) {
            n3 n3Var = (n3) ut.i9(this.zn.poll());
            if (n3Var.t()) {
                xc xcVar = (xc) ut.i9(this.n3.pollFirst());
                xcVar.v(4);
                tl(n3Var);
                return xcVar;
            }
            a(n3Var);
            if (f()) {
                c5 c5VarV = v();
                xc xcVar2 = (xc) ut.i9(this.n3.pollFirst());
                xcVar2.mt(n3Var.f3178f, c5VarV, Long.MAX_VALUE);
                tl(n3Var);
                return xcVar2;
            }
            tl(n3Var);
        }
        return null;
    }

    @Override // di.gv
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void zn(wz wzVar) throws f {
        v0.y.y(wzVar == this.f1355gv);
        n3 n3Var = (n3) wzVar;
        if (n3Var.i9()) {
            tl(n3Var);
        } else {
            long j = this.f1354a;
            this.f1354a = 1 + j;
            n3Var.z = j;
            this.zn.add(n3Var);
        }
        this.f1355gv = null;
    }

    public final void tl(n3 n3Var) {
        n3Var.a();
        this.y.add(n3Var);
    }

    public abstract c5 v();

    public void wz(xc xcVar) {
        xcVar.a();
        this.n3.add(xcVar);
    }

    @Override // b0.i9
    public void y(long j) {
        this.f1356v = j;
    }

    @Override // di.gv
    public void release() {
    }
}

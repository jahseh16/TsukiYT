package y6;

import b1.co;
import b1.tl;
import b1.x4;
import b1.y;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends b1.y {

    /* JADX INFO: renamed from: y6.n3$n3, reason: collision with other inner class name */
    public static final class C0197n3 implements y.a {
        public final int n3;
        public final x4 y;
        public final co.y zn;

        @Override // b1.y.a
        public /* synthetic */ void n3() {
            b1.n3.y(this);
        }

        @Override // b1.y.a
        public y.v y(tl tlVar, long j) throws IOException {
            long position = tlVar.getPosition();
            long jZn = zn(tlVar);
            long jF = tlVar.f();
            tlVar.tl(Math.max(6, this.y.zn));
            long jZn2 = zn(tlVar);
            return (jZn > j || jZn2 <= j) ? jZn2 <= j ? y.v.a(jZn2, tlVar.f()) : y.v.gv(jZn, position) : y.v.v(jF);
        }

        public final long zn(tl tlVar) throws IOException {
            while (tlVar.f() < tlVar.getLength() - 6 && !co.s(tlVar, this.y, this.n3, this.zn)) {
                tlVar.tl(1);
            }
            if (tlVar.f() < tlVar.getLength() - 6) {
                return this.zn.y;
            }
            tlVar.tl((int) (tlVar.getLength() - tlVar.f()));
            return this.y.f1289i9;
        }

        public C0197n3(x4 x4Var, int i) {
            this.y = x4Var;
            this.n3 = i;
            this.zn = new co.y();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(final x4 x4Var, int i, long j, long j4) {
        super(new y.gv() { // from class: y6.y
            @Override // b1.y.gv
            public final long timeUsToTargetTime(long j7) {
                return x4Var.c5(j7);
            }
        }, new C0197n3(x4Var, i), x4Var.a(), 0L, x4Var.f1289i9, j, j4, x4Var.gv(), Math.max(6, x4Var.zn));
        Objects.requireNonNull(x4Var);
    }
}

package oq;

import b1.fh;
import b1.rz;
import b1.ta;
import b1.wz;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements wz {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final wz f7184v;
    public final long y;

    public class y implements fh {
        public final /* synthetic */ fh y;

        public y(fh fhVar) {
            this.y = fhVar;
        }

        @Override // b1.fh
        public long c5() {
            return this.y.c5();
        }

        @Override // b1.fh
        public boolean s() {
            return this.y.s();
        }

        @Override // b1.fh
        public fh.y v(long j) {
            fh.y yVarV = this.y.v(j);
            rz rzVar = yVarV.y;
            rz rzVar2 = new rz(rzVar.y, rzVar.n3 + gv.this.y);
            rz rzVar3 = yVarV.n3;
            return new fh.y(rzVar2, new rz(rzVar3.y, rzVar3.n3 + gv.this.y));
        }
    }

    public gv(long j, wz wzVar) {
        this.y = j;
        this.f7184v = wzVar;
    }

    @Override // b1.wz
    public ta a(int i, int i5) {
        return this.f7184v.a(i, i5);
    }

    @Override // b1.wz
    public void p() {
        this.f7184v.p();
    }

    @Override // b1.wz
    public void z(fh fhVar) {
        this.f7184v.z(new y(fhVar));
    }
}

package b0;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import k4.r;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements i9 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f1189gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1190v;
    public final zn y = new zn();
    public final wz n3 = new wz();
    public final Deque<xc> zn = new ArrayDeque();

    public static final class n3 implements c5 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final r<b0.n3> f1191v;
        public final long y;

        public n3(long j, r<b0.n3> rVar) {
            this.y = j;
            this.f1191v = rVar;
        }

        @Override // b0.c5
        public int gv() {
            return 1;
        }

        @Override // b0.c5
        public List<b0.n3> n3(long j) {
            return j >= this.y ? this.f1191v : r.yt();
        }

        @Override // b0.c5
        public int y(long j) {
            return this.y > j ? 0 : -1;
        }

        @Override // b0.c5
        public long zn(int i) {
            v0.y.y(i == 0);
            return this.y;
        }
    }

    public class y extends xc {
        public y() {
        }

        @Override // di.s
        public void p() {
            fb.this.c5(this);
        }
    }

    public fb() {
        for (int i = 0; i < 2; i++) {
            this.zn.addFirst(new y());
        }
        this.f1189gv = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c5(xc xcVar) {
        v0.y.fb(this.zn.size() < 2);
        v0.y.y(!this.zn.contains(xcVar));
        xcVar.a();
        this.zn.addFirst(xcVar);
    }

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wz gv() throws f {
        v0.y.fb(!this.f1190v);
        if (this.f1189gv != 0) {
            return null;
        }
        this.f1189gv = 1;
        return this.n3;
    }

    @Override // di.gv
    @Nullable
    /* JADX INFO: renamed from: fb, reason: merged with bridge method [inline-methods] */
    public xc n3() throws f {
        v0.y.fb(!this.f1190v);
        if (this.f1189gv != 2 || this.zn.isEmpty()) {
            return null;
        }
        xc xcVarRemoveFirst = this.zn.removeFirst();
        if (this.n3.t()) {
            xcVarRemoveFirst.v(4);
        } else {
            wz wzVar = this.n3;
            xcVarRemoveFirst.mt(this.n3.f3178f, new n3(wzVar.f3178f, this.y.y(((ByteBuffer) v0.y.v(wzVar.f3179fb)).array())), 0L);
        }
        this.n3.a();
        this.f1189gv = 0;
        return xcVarRemoveFirst;
    }

    @Override // di.gv
    public void flush() {
        v0.y.fb(!this.f1190v);
        this.n3.a();
        this.f1189gv = 0;
    }

    @Override // di.gv
    public void release() {
        this.f1190v = true;
    }

    @Override // di.gv
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void zn(wz wzVar) throws f {
        v0.y.fb(!this.f1190v);
        v0.y.fb(this.f1189gv == 1);
        v0.y.y(this.n3 == wzVar);
        this.f1189gv = 2;
    }

    @Override // b0.i9
    public void y(long j) {
    }
}

package vj1;

import hk1.a;
import hk1.en;
import hk1.fb;
import hk1.jz;
import hk1.k;
import hk1.x;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.c;
import sj1.d0;
import sj1.mg;
import sj1.p;
import sj1.rz;
import sj1.x4;
import sj1.z;
import vj1.zn;
import yj1.s;

/* JADX INFO: loaded from: classes.dex */
public final class y implements x4 {
    public static final C0187y n3 = new C0187y(null);
    public final sj1.zn y;

    public static final class n3 implements en {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ vj1.n3 f8841fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f8842s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ fb f8843v;
        public boolean y;

        public n3(fb fbVar, vj1.n3 n3Var, a aVar) {
            this.f8843v = fbVar;
            this.f8841fb = n3Var;
            this.f8842s = aVar;
        }

        public void close() throws IOException {
            if (!this.y && !tj1.gv.co(this, 100, TimeUnit.MILLISECONDS)) {
                this.y = true;
                this.f8841fb.y();
            }
            this.f8843v.close();
        }

        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long j4 = this.f8843v.read(sink, j);
                if (j4 != -1) {
                    sink.f3(this.f8842s.zn(), sink.lc() - j4, j4);
                    this.f8842s.wz();
                    return j4;
                }
                if (!this.y) {
                    this.y = true;
                    this.f8842s.close();
                }
                return -1L;
            } catch (IOException e4) {
                if (!this.y) {
                    this.y = true;
                    this.f8841fb.y();
                }
                throw e4;
            }
        }

        public jz timeout() {
            return this.f8843v.timeout();
        }
    }

    /* JADX INFO: renamed from: vj1.y$y, reason: collision with other inner class name */
    public static final class C0187y {
        public /* synthetic */ C0187y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rz a(rz rzVar) {
            return (rzVar == null ? null : rzVar.y()) != null ? rzVar.ej().n3(null).zn() : rzVar;
        }

        public final boolean gv(String str) {
            return StringsKt.equals("Content-Length", str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals("Content-Type", str, true);
        }

        public final boolean v(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }

        public final z zn(z zVar, z zVar2) {
            z.y yVar = new z.y();
            int size = zVar.size();
            int i = 0;
            int i5 = 0;
            while (i5 < size) {
                int i8 = i5 + 1;
                String strZn = zVar.zn(i5);
                String strS = zVar.s(i5);
                if ((!StringsKt.equals("Warning", strZn, true) || !StringsKt.startsWith$default(strS, "1", false, 2, (Object) null)) && (gv(strZn) || !v(strZn) || zVar2.y(strZn) == null)) {
                    yVar.gv(strZn, strS);
                }
                i5 = i8;
            }
            int size2 = zVar2.size();
            while (i < size2) {
                int i10 = i + 1;
                String strZn2 = zVar2.zn(i);
                if (!gv(strZn2) && v(strZn2)) {
                    yVar.gv(strZn2, zVar2.s(i));
                }
                i = i10;
            }
            return yVar.a();
        }

        public C0187y() {
        }
    }

    public y(sj1.zn znVar) {
        this.y = znVar;
    }

    @Override // sj1.x4
    public rz intercept(x4.y chain) throws IOException {
        mg mgVarY;
        mg mgVarY2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        sj1.v vVarCall = chain.call();
        sj1.zn znVar = this.y;
        rz rzVarA = znVar == null ? null : znVar.a(chain.y());
        zn znVarN3 = new zn.n3(System.currentTimeMillis(), chain.y(), rzVarA).n3();
        d0 d0VarN3 = znVarN3.n3();
        rz rzVarY = znVarN3.y();
        sj1.zn znVar2 = this.y;
        if (znVar2 != null) {
            znVar2.c(znVarN3);
        }
        xj1.v vVar = vVarCall instanceof xj1.v ? (xj1.v) vVarCall : null;
        p pVarWz = vVar != null ? vVar.wz() : null;
        if (pVarWz == null) {
            pVarWz = p.n3;
        }
        if (rzVarA != null && rzVarY == null && (mgVarY2 = rzVarA.y()) != null) {
            tj1.gv.tl(mgVarY2);
        }
        if (d0VarN3 == null && rzVarY == null) {
            rz rzVarZn = new rz.y().z(chain.y()).p(c.HTTP_1_1).fb(504).wz("Unsatisfiable Request (only-if-cached)").n3(tj1.gv.zn).r(-1L).mt(System.currentTimeMillis()).zn();
            pVarWz.d0(vVarCall, rzVarZn);
            return rzVarZn;
        }
        if (d0VarN3 == null) {
            Intrinsics.checkNotNull(rzVarY);
            rz rzVarZn2 = rzVarY.ej().gv(n3.a(rzVarY)).zn();
            pVarWz.n3(vVarCall, rzVarZn2);
            return rzVarZn2;
        }
        if (rzVarY != null) {
            pVarWz.y(vVarCall, rzVarY);
        } else if (this.y != null) {
            pVarWz.zn(vVarCall);
        }
        try {
            rz rzVarN3 = chain.n3(d0VarN3);
            if (rzVarN3 == null && rzVarA != null && mgVarY != null) {
            }
            if (rzVarY != null) {
                if (rzVarN3 != null && rzVarN3.p() == 304) {
                    rz.y yVarEj = rzVarY.ej();
                    C0187y c0187y = n3;
                    rz rzVarZn3 = yVarEj.t(c0187y.zn(rzVarY.mg(), rzVarN3.mg())).r(rzVarN3.jz()).mt(rzVarN3.k()).gv(c0187y.a(rzVarY)).xc(c0187y.a(rzVarN3)).zn();
                    mg mgVarY3 = rzVarN3.y();
                    Intrinsics.checkNotNull(mgVarY3);
                    mgVarY3.close();
                    sj1.zn znVar3 = this.y;
                    Intrinsics.checkNotNull(znVar3);
                    znVar3.n();
                    this.y.rz(rzVarY, rzVarZn3);
                    pVarWz.n3(vVarCall, rzVarZn3);
                    return rzVarZn3;
                }
                mg mgVarY4 = rzVarY.y();
                if (mgVarY4 != null) {
                    tj1.gv.tl(mgVarY4);
                }
            }
            Intrinsics.checkNotNull(rzVarN3);
            rz.y yVarEj2 = rzVarN3.ej();
            C0187y c0187y2 = n3;
            rz rzVarZn4 = yVarEj2.gv(c0187y2.a(rzVarY)).xc(c0187y2.a(rzVarN3)).zn();
            if (this.y != null) {
                if (yj1.v.zn(rzVarZn4) && zn.zn.y(rzVarZn4, d0VarN3)) {
                    rz rzVarY2 = y(this.y.p(rzVarZn4), rzVarZn4);
                    if (rzVarY != null) {
                        pVarWz.zn(vVarCall);
                    }
                    return rzVarY2;
                }
                if (yj1.a.y.y(d0VarN3.s())) {
                    try {
                        this.y.co(d0VarN3);
                    } catch (IOException unused) {
                    }
                }
            }
            return rzVarZn4;
        } finally {
            if (rzVarA != null && (mgVarY = rzVarA.y()) != null) {
                tj1.gv.tl(mgVarY);
            }
        }
    }

    public final rz y(vj1.n3 n3Var, rz rzVar) throws IOException {
        if (n3Var == null) {
            return rzVar;
        }
        k kVarN3 = n3Var.n3();
        mg mgVarY = rzVar.y();
        Intrinsics.checkNotNull(mgVarY);
        n3 n3Var2 = new n3(mgVarY.source(), n3Var, x.zn(kVarN3));
        return rzVar.ej().n3(new s(rz.c(rzVar, "Content-Type", null, 2, null), rzVar.y().contentLength(), x.gv(n3Var2))).zn();
    }
}

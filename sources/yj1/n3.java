package yj1;

import hk1.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.d0;
import sj1.fh;
import sj1.mg;
import sj1.rz;
import sj1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements x4 {
    public final boolean y;

    public n3(boolean z) {
        this.y = z;
    }

    @Override // sj1.x4
    public rz intercept(x4.y chain) throws IOException {
        rz.y yVarW;
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        fb fbVar = (fb) chain;
        xj1.zn znVarS = fbVar.s();
        Intrinsics.checkNotNull(znVarS);
        d0 d0VarI9 = fbVar.i9();
        fh fhVarY = d0VarI9.y();
        long jCurrentTimeMillis = System.currentTimeMillis();
        znVarS.z(d0VarI9);
        if (!a.n3(d0VarI9.s()) || fhVarY == null) {
            znVarS.wz();
            yVarW = null;
            z = true;
        } else {
            if (StringsKt.equals("100-continue", d0VarI9.gv("Expect"), true)) {
                znVarS.a();
                yVarW = znVarS.w(true);
                znVarS.mt();
                z = false;
            } else {
                yVarW = null;
                z = true;
            }
            if (yVarW != null) {
                znVarS.wz();
                if (!znVarS.s().f3()) {
                    znVarS.tl();
                }
            } else if (fhVarY.isDuplex()) {
                znVarS.a();
                fhVarY.writeTo(x.zn(znVarS.zn(d0VarI9, true)));
            } else {
                hk1.a aVarZn = x.zn(znVarS.zn(d0VarI9, false));
                fhVarY.writeTo(aVarZn);
                aVarZn.close();
            }
        }
        if (fhVarY == null || !fhVarY.isDuplex()) {
            znVarS.v();
        }
        if (yVarW == null) {
            yVarW = znVarS.w(false);
            Intrinsics.checkNotNull(yVarW);
            if (z) {
                znVarS.mt();
                z = false;
            }
        }
        rz rzVarZn = yVarW.z(d0VarI9).i9(znVarS.s().zn()).r(jCurrentTimeMillis).mt(System.currentTimeMillis()).zn();
        int iP = rzVarZn.p();
        if (iP == 100) {
            rz.y yVarW2 = znVarS.w(false);
            Intrinsics.checkNotNull(yVarW2);
            if (z) {
                znVarS.mt();
            }
            rzVarZn = yVarW2.z(d0VarI9).i9(znVarS.s().zn()).r(jCurrentTimeMillis).mt(System.currentTimeMillis()).zn();
            iP = rzVarZn.p();
        }
        znVarS.p(rzVarZn);
        rz rzVarZn2 = (this.y && iP == 101) ? rzVarZn.ej().n3(tj1.gv.zn).zn() : rzVarZn.ej().n3(znVarS.xc(rzVarZn)).zn();
        if (StringsKt.equals("close", rzVarZn2.f7().gv("Connection"), true) || StringsKt.equals("close", rz.c(rzVarZn2, "Connection", null, 2, null), true)) {
            znVarS.tl();
        }
        if (iP == 204 || iP == 205) {
            mg mgVarY = rzVarZn2.y();
            if ((mgVarY == null ? -1L : mgVarY.contentLength()) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(iP);
                sb.append(" had non-zero Content-Length: ");
                mg mgVarY2 = rzVarZn2.y();
                sb.append(mgVarY2 != null ? Long.valueOf(mgVarY2.contentLength()) : null);
                throw new ProtocolException(sb.toString());
            }
        }
        return rzVarZn2;
    }
}

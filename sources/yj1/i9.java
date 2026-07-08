package yj1;

import com.google.protobuf.Reader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import sj1.d0;
import sj1.fh;
import sj1.mg;
import sj1.n;
import sj1.r;
import sj1.rz;
import sj1.ta;
import sj1.x4;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements x4 {
    public static final y n3 = new y(null);
    public final n y;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public i9(n client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.y = client;
    }

    public final int a(rz rzVar, int i) {
        String strC = rz.c(rzVar, "Retry-After", null, 2, null);
        if (strC == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(strC)) {
            return Reader.READ_DONE;
        }
        Integer numValueOf = Integer.valueOf(strC);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    public final boolean gv(IOException iOException, xj1.v vVar, d0 d0Var, boolean z) {
        if (this.y.ej()) {
            return !(z && v(iOException, d0Var)) && zn(iOException, z) && vVar.n();
        }
        return false;
    }

    @Override // sj1.x4
    public rz intercept(x4.y chain) throws IOException {
        xj1.zn znVarW;
        d0 d0VarN3;
        Intrinsics.checkNotNullParameter(chain, "chain");
        fb fbVar = (fb) chain;
        d0 d0VarI9 = fbVar.i9();
        xj1.v vVarA = fbVar.a();
        List listEmptyList = CollectionsKt.emptyList();
        rz rzVar = null;
        boolean z = true;
        int i = 0;
        while (true) {
            vVarA.i9(d0VarI9, z);
            try {
                if (vVarA.isCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    try {
                        rz rzVarN3 = fbVar.n3(d0VarI9);
                        if (rzVar != null) {
                            rzVarN3 = rzVarN3.ej().w(rzVar.ej().n3(null).zn()).zn();
                        }
                        rzVar = rzVarN3;
                        znVarW = vVarA.w();
                        d0VarN3 = n3(rzVar, znVarW);
                    } catch (xj1.c5 e4) {
                        if (!gv(e4.gv(), vVarA, d0VarI9, false)) {
                            throw tj1.gv.jz(e4.n3(), listEmptyList);
                        }
                        listEmptyList = CollectionsKt.plus(listEmptyList, e4.n3());
                        vVarA.f(true);
                        z = false;
                    }
                } catch (IOException e5) {
                    if (!gv(e5, vVarA, d0VarI9, !(e5 instanceof ak1.y))) {
                        throw tj1.gv.jz(e5, listEmptyList);
                    }
                    listEmptyList = CollectionsKt.plus(listEmptyList, e5);
                    vVarA.f(true);
                    z = false;
                }
                if (d0VarN3 == null) {
                    if (znVarW != null && znVarW.t()) {
                        vVarA.d0();
                    }
                    vVarA.f(false);
                    return rzVar;
                }
                fh fhVarY = d0VarN3.y();
                if (fhVarY != null && fhVarY.isOneShot()) {
                    vVarA.f(false);
                    return rzVar;
                }
                mg mgVarY = rzVar.y();
                if (mgVarY != null) {
                    tj1.gv.tl(mgVarY);
                }
                i++;
                if (i > 20) {
                    throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i)));
                }
                vVarA.f(true);
                d0VarI9 = d0VarN3;
                z = true;
            } catch (Throwable th) {
                vVarA.f(true);
                throw th;
            }
        }
    }

    public final d0 n3(rz rzVar, xj1.zn znVar) throws IOException {
        xj1.a aVarS;
        ta taVarN3 = (znVar == null || (aVarS = znVar.s()) == null) ? null : aVarS.n3();
        int iP = rzVar.p();
        String strS = rzVar.f7().s();
        if (iP != 307 && iP != 308) {
            if (iP == 401) {
                return this.y.fb().y(taVarN3, rzVar);
            }
            if (iP == 421) {
                fh fhVarY = rzVar.f7().y();
                if ((fhVarY != null && fhVarY.isOneShot()) || znVar == null || !znVar.f()) {
                    return null;
                }
                znVar.s().c();
                return rzVar.f7();
            }
            if (iP == 503) {
                rz rzVarJ = rzVar.j();
                if ((rzVarJ == null || rzVarJ.p() != 503) && a(rzVar, Reader.READ_DONE) == 0) {
                    return rzVar.f7();
                }
                return null;
            }
            if (iP == 407) {
                Intrinsics.checkNotNull(taVarN3);
                if (taVarN3.n3().type() == Proxy.Type.HTTP) {
                    return this.y.ta().y(taVarN3, rzVar);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iP == 408) {
                if (!this.y.ej()) {
                    return null;
                }
                fh fhVarY2 = rzVar.f7().y();
                if (fhVarY2 != null && fhVarY2.isOneShot()) {
                    return null;
                }
                rz rzVarJ2 = rzVar.j();
                if ((rzVarJ2 == null || rzVarJ2.p() != 408) && a(rzVar, 0) <= 0) {
                    return rzVar.f7();
                }
                return null;
            }
            switch (iP) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return y(rzVar, strS);
    }

    public final boolean v(IOException iOException, d0 d0Var) {
        fh fhVarY = d0Var.y();
        return (fhVarY != null && fhVarY.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    public final d0 y(rz rzVar, String str) {
        String strC;
        r rVarR;
        if (!this.y.co() || (strC = rz.c(rzVar, "Location", null, 2, null)) == null || (rVarR = rzVar.f7().t().r(strC)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(rVarR.x4(), rzVar.f7().t().x4()) && !this.y.z()) {
            return null;
        }
        d0.y yVarC5 = rzVar.f7().c5();
        if (a.n3(str)) {
            int iP = rzVar.p();
            a aVar = a.y;
            boolean z = aVar.gv(str) || iP == 308 || iP == 307;
            if (!aVar.zn(str) || iP == 308 || iP == 307) {
                yVarC5.f(str, z ? rzVar.f7().y() : null);
            } else {
                yVarC5.f("GET", null);
            }
            if (!z) {
                yVarC5.xc("Transfer-Encoding");
                yVarC5.xc("Content-Length");
                yVarC5.xc("Content-Type");
            }
        }
        if (!tj1.gv.i9(rzVar.f7().t(), rVarR)) {
            yVarC5.xc("Authorization");
        }
        return yVarC5.f3(rVarR).n3();
    }

    public final boolean zn(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }
}

package dk1;

import dk1.tl;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class t implements tl {
    public tl n3;
    public final y y;

    public interface y {
        tl n3(SSLSocket sSLSocket);

        boolean y(SSLSocket sSLSocket);
    }

    public t(y socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.y = socketAdapterFactory;
    }

    @Override // dk1.tl
    public void a(SSLSocket sslSocket, String str, List<? extends c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        tl tlVarFb = fb(sslSocket);
        if (tlVarFb == null) {
            return;
        }
        tlVarFb.a(sslSocket, str, protocols);
    }

    public final synchronized tl fb(SSLSocket sSLSocket) {
        try {
            if (this.n3 == null && this.y.y(sSLSocket)) {
                this.n3 = this.y.n3(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.n3;
    }

    @Override // dk1.tl
    public X509TrustManager gv(SSLSocketFactory sSLSocketFactory) {
        return tl.y.n3(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean n3() {
        return true;
    }

    @Override // dk1.tl
    public boolean v(SSLSocketFactory sSLSocketFactory) {
        return tl.y.y(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean y(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.y.y(sslSocket);
    }

    @Override // dk1.tl
    public String zn(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        tl tlVarFb = fb(sslSocket);
        if (tlVarFb == null) {
            return null;
        }
        return tlVarFb.zn(sslSocket);
    }
}

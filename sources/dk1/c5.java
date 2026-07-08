package dk1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dk1.t;
import dk1.tl;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class c5 implements tl {
    public static final n3 y = new n3(null);
    public static final t.y n3 = new y();

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t.y y() {
            return c5.n3;
        }

        public n3() {
        }
    }

    public static final class y implements t.y {
        @Override // dk1.t.y
        public tl n3(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new c5();
        }

        @Override // dk1.t.y
        public boolean y(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            ck1.zn.f1440v.n3();
            return false;
        }
    }

    @Override // dk1.tl
    public void a(SSLSocket sslSocket, String str, List<? extends c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (y(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            Object[] array = ck1.i9.y.n3(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // dk1.tl
    public X509TrustManager gv(SSLSocketFactory sSLSocketFactory) {
        return tl.y.n3(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean n3() {
        return ck1.zn.f1440v.n3();
    }

    @Override // dk1.tl
    public boolean v(SSLSocketFactory sSLSocketFactory) {
        return tl.y.y(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean y(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // dk1.tl
    public String zn(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING)) {
            return null;
        }
        return applicationProtocol;
    }
}

package ck1;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.net.ssl.OpenJSSE;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1418a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f1419v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Provider f1420gv;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return c5.f1418a;
        }

        public final c5 y() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (n3()) {
                return new c5(defaultConstructorMarker);
            }
            return null;
        }

        public y() {
        }
    }

    static {
        y yVar = new y(null);
        f1419v = yVar;
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, yVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f1418a = z;
    }

    public /* synthetic */ c5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with OpenJSSE");
    }

    @Override // ck1.i9
    public String s(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return super.s(sslSocket);
    }

    @Override // ck1.i9
    public void v(SSLSocket sslSocket, String str, List<c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        super.v(sslSocket, str, protocols);
    }

    @Override // ck1.i9
    public X509TrustManager w() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f1420gv);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
    }

    @Override // ck1.i9
    public SSLContext wz() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f1420gv);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    public c5() {
        this.f1420gv = new OpenJSSE();
    }
}

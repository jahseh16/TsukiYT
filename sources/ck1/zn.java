package ck1;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
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
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1439a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f1440v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Provider f1441gv;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return zn.f1439a;
        }

        public final zn y() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (n3()) {
                return new zn(defaultConstructorMarker);
            }
            return null;
        }

        public y() {
        }
    }

    static {
        y yVar = new y(null);
        f1440v = yVar;
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, yVar.getClass().getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f1439a = z;
    }

    public /* synthetic */ zn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
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
    public X509TrustManager w() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1441gv);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    public zn() {
        this.f1441gv = new BouncyCastleJsseProvider();
    }
}

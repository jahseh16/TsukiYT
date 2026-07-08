package ck1;

import java.security.KeyManagementException;
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
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1421a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f1422v;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Provider f1423gv;

    public static final class n3 implements ConscryptHostnameVerifier {
        public static final n3 y = new n3();
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv n3() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (zn()) {
                return new gv(defaultConstructorMarker);
            }
            return null;
        }

        public final boolean y(int i, int i5, int i8) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i ? version.major() > i : version.minor() != i5 ? version.minor() > i5 : version.patch() >= i8;
        }

        public final boolean zn() {
            return gv.f1421a;
        }

        public y() {
        }
    }

    static {
        y yVar = new y(null);
        f1422v = yVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, yVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (yVar.y(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1421a = z;
    }

    public /* synthetic */ gv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return null;
    }

    @Override // ck1.i9
    public String s(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.s(sslSocket);
    }

    @Override // ck1.i9
    public void v(SSLSocket sslSocket, String str, List<c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.v(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = i9.y.n3(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // ck1.i9
    public X509TrustManager w() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, n3.y);
                return x509TrustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
    }

    @Override // ck1.i9
    public SSLContext wz() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1423gv);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // ck1.i9
    public SSLSocketFactory xc(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextWz = wz();
        sSLContextWz.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextWz.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    public gv() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.f1423gv = providerNewProvider;
    }
}

package ck1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public class s extends i9 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f1428gv = new y(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f1429v;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return s.f1429v;
        }

        public final s y() {
            if (n3()) {
                return new s();
            }
            return null;
        }

        public y() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property == null ? null : StringsKt.toIntOrNull(property);
        boolean z = false;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (intOrNull.intValue() >= 9) {
            z = true;
        }
        f1429v = z;
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    @Override // ck1.i9
    public String s(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING)) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // ck1.i9
    public void v(SSLSocket sslSocket, String str, List<c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        Object[] array = i9.y.n3(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }
}

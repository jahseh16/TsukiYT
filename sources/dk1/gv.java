package dk1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gv extends fk1.zn {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f3212gv = new y(null);
    public final X509TrustManager n3;
    public final X509TrustManagerExtensions zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv y(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new gv(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }

        public y() {
        }
    }

    public gv(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.n3 = trustManager;
        this.zn = x509TrustManagerExtensions;
    }

    public boolean equals(Object obj) {
        return (obj instanceof gv) && ((gv) obj).n3 == this.n3;
    }

    public int hashCode() {
        return System.identityHashCode(this.n3);
    }

    @Override // fk1.zn
    public List<Certificate> y(List<? extends Certificate> chain, String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> listCheckServerTrusted = this.zn.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }
}

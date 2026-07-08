package dk1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public interface tl {

    public static final class y {
        public static X509TrustManager n3(tl tlVar, SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(tlVar, "this");
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            return null;
        }

        public static boolean y(tl tlVar, SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(tlVar, "this");
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            return false;
        }
    }

    void a(SSLSocket sSLSocket, String str, List<? extends c> list);

    X509TrustManager gv(SSLSocketFactory sSLSocketFactory);

    boolean n3();

    boolean v(SSLSocketFactory sSLSocketFactory);

    boolean y(SSLSocket sSLSocket);

    String zn(SSLSocket sSLSocket);
}

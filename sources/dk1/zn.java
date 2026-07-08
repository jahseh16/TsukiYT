package dk1;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dk1.tl;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public final class zn implements tl {
    public static final y y = new y(null);

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return ck1.i9.y.s() && Build.VERSION.SDK_INT >= 29;
        }

        public final tl y() {
            if (n3()) {
                return new zn();
            }
            return null;
        }

        public y() {
        }
    }

    @Override // dk1.tl
    @SuppressLint({"NewApi"})
    public void a(SSLSocket sslSocket, String str, List<? extends c> protocols) throws IOException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            Object[] array = ck1.i9.y.n3(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e4) {
            throw new IOException("Android internal error", e4);
        }
    }

    @Override // dk1.tl
    public X509TrustManager gv(SSLSocketFactory sSLSocketFactory) {
        return tl.y.n3(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean n3() {
        return y.n3();
    }

    @Override // dk1.tl
    public boolean v(SSLSocketFactory sSLSocketFactory) {
        return tl.y.y(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean y(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // dk1.tl
    @SuppressLint({"NewApi"})
    public String zn(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING)) {
            return null;
        }
        return applicationProtocol;
    }
}

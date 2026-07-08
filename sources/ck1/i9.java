package ck1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;
import sj1.n;

/* JADX INFO: loaded from: classes.dex */
public class i9 {
    public static volatile i9 n3;
    public static final y y;
    public static final Logger zn;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i9 a() {
            return s() ? gv() : v();
        }

        public final boolean c5() {
            return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
        }

        public final boolean f() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final i9 fb() {
            return i9.n3;
        }

        public final i9 gv() {
            dk1.v.y.n3();
            i9 i9VarY = ck1.y.f1437v.y();
            if (i9VarY != null) {
                return i9VarY;
            }
            i9 i9VarY2 = n3.f1424a.y();
            Intrinsics.checkNotNull(i9VarY2);
            return i9VarY2;
        }

        public final boolean i9() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        public final List<String> n3(List<? extends c> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((c) obj) != c.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c) it.next()).toString());
            }
            return arrayList2;
        }

        public final boolean s() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        public final i9 v() {
            c5 c5VarY;
            zn znVarY;
            gv gvVarN3;
            if (i9() && (gvVarN3 = gv.f1422v.n3()) != null) {
                return gvVarN3;
            }
            if (c5() && (znVarY = zn.f1440v.y()) != null) {
                return znVarY;
            }
            if (f() && (c5VarY = c5.f1419v.y()) != null) {
                return c5VarY;
            }
            s sVarY = s.f1428gv.y();
            if (sVarY != null) {
                return sVarY;
            }
            i9 i9VarY = v.f1430c5.y();
            return i9VarY != null ? i9VarY : new i9();
        }

        public final byte[] zn(List<? extends c> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            hk1.v vVar = new hk1.v();
            for (String str : n3(protocols)) {
                vVar.tg(str.length());
                vVar.vp(str);
            }
            return vVar.y5();
        }

        public y() {
        }
    }

    static {
        y yVar = new y(null);
        y = yVar;
        n3 = yVar.a();
        zn = Logger.getLogger(n.class.getName());
    }

    public static /* synthetic */ void t(i9 i9Var, String str, int i, Throwable th, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i5 & 2) != 0) {
            i = 4;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        i9Var.f(str, i, th);
    }

    public void a(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i);
    }

    public Object c5(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (zn.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public void f(String message, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        zn.log(i == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public final String fb() {
        return "OkHttp";
    }

    public fk1.v gv(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new fk1.n3((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public boolean i9(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    public void n3(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        try {
            Class<?> sslContextClass = Class.forName("sun.security.ssl.SSLContextImpl");
            Intrinsics.checkNotNullExpressionValue(sslContextClass, "sslContextClass");
            Object objX = tj1.gv.x(sslSocketFactory, sslContextClass, "context");
            if (objX == null) {
                return null;
            }
            return (X509TrustManager) tj1.gv.x(objX, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (RuntimeException e4) {
            if (Intrinsics.areEqual(e4.getClass().getName(), "java.lang.reflect.InaccessibleObjectException")) {
                return null;
            }
            throw e4;
        }
    }

    public String s(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    public void tl(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = Intrinsics.stringPlus(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        f(message, 5, (Throwable) obj);
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    public void v(SSLSocket sslSocket, String str, List<c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    public X509TrustManager w() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public SSLContext wz() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory xc(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextWz = wz();
            sSLContextWz.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextWz.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e4), e4);
        }
    }

    public fk1.zn zn(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new fk1.y(gv(trustManager));
    }
}

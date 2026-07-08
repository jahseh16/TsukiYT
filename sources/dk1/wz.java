package dk1;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wz extends s {

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final y f3218i9 = new y(null);

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final Class<?> f3219c5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class<? super SSLSocketFactory> f3220s;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ tl n3(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return yVar.y(str);
        }

        public final tl y(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(Intrinsics.stringPlus(packageName, ".OpenSSLSocketImpl"));
                Class<?> cls2 = Class.forName(Intrinsics.stringPlus(packageName, ".OpenSSLSocketFactoryImpl"));
                Class<?> paramsClass = Class.forName(Intrinsics.stringPlus(packageName, ".SSLParametersImpl"));
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new wz(cls, cls2, paramsClass);
            } catch (Exception e4) {
                ck1.i9.y.fb().f("unable to load android socket classes", 5, e4);
                return null;
            }
        }

        public y() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(Class<? super SSLSocket> sslSocketClass, Class<? super SSLSocketFactory> sslSocketFactoryClass, Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f3220s = sslSocketFactoryClass;
        this.f3219c5 = paramClass;
    }

    @Override // dk1.s, dk1.tl
    public X509TrustManager gv(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Object objX = tj1.gv.x(sslSocketFactory, this.f3219c5, "sslParameters");
        Intrinsics.checkNotNull(objX);
        X509TrustManager x509TrustManager = (X509TrustManager) tj1.gv.x(objX, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager == null ? (X509TrustManager) tj1.gv.x(objX, X509TrustManager.class, "trustManager") : x509TrustManager;
    }

    @Override // dk1.s, dk1.tl
    public boolean v(SSLSocketFactory sslSocketFactory) {
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        return this.f3220s.isInstance(sslSocketFactory);
    }
}

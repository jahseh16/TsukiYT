package dk1;

import dk1.t;
import dk1.tl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public class s implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f3214a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final t.y f3215fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Method f3216gv;
    public final Method n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f3217v;
    public final Class<? super SSLSocket> y;
    public final Method zn;

    public static final class y {

        /* JADX INFO: renamed from: dk1.s$y$y, reason: collision with other inner class name */
        public static final class C0079y implements t.y {
            public final /* synthetic */ String y;

            public C0079y(String str) {
                this.y = str;
            }

            @Override // dk1.t.y
            public tl n3(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return s.f3214a.n3(sslSocket.getClass());
            }

            @Override // dk1.t.y
            public boolean y(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.startsWith$default(name, Intrinsics.stringPlus(this.y, "."), false, 2, (Object) null);
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t.y gv() {
            return s.f3215fb;
        }

        public final s n3(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new s(superclass);
        }

        public final t.y zn(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C0079y(packageName);
        }

        public y() {
        }
    }

    static {
        y yVar = new y(null);
        f3214a = yVar;
        f3215fb = yVar.zn("com.google.android.gms.org.conscrypt");
    }

    public s(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.y = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.n3 = declaredMethod;
        this.zn = sslSocketClass.getMethod("setHostname", String.class);
        this.f3216gv = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f3217v = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // dk1.tl
    public void a(SSLSocket sslSocket, String str, List<? extends c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (y(sslSocket)) {
            try {
                this.n3.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.zn.invoke(sslSocket, str);
                }
                this.f3217v.invoke(sslSocket, ck1.i9.y.zn(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    @Override // dk1.tl
    public X509TrustManager gv(SSLSocketFactory sSLSocketFactory) {
        return tl.y.n3(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean n3() {
        return ck1.n3.f1424a.n3();
    }

    @Override // dk1.tl
    public boolean v(SSLSocketFactory sSLSocketFactory) {
        return tl.y.y(this, sSLSocketFactory);
    }

    @Override // dk1.tl
    public boolean y(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.y.isInstance(sslSocket);
    }

    @Override // dk1.tl
    public String zn(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!y(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3216gv.invoke(sslSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e5);
        }
    }
}

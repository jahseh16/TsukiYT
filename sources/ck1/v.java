package ck1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class v extends i9 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final n3 f1430c5 = new n3(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f1431a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Class<?> f1432fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Method f1433gv;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class<?> f1434s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Method f1435v;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i9 y() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> clientProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> serverProviderClass = Class.forName(Intrinsics.stringPlus("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new v(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public n3() {
        }
    }

    public static final class y implements InvocationHandler {
        public boolean n3;
        public final List<String> y;
        public String zn;

        public y(List<String> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.y = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.n3 = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols") && objArr.length == 0) {
                return this.y;
            }
            if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            int i5 = i + 1;
                            Object obj2 = list.get(i);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (this.y.contains(str)) {
                                this.zn = str;
                                return str;
                            }
                            if (i == size) {
                                break;
                            }
                            i = i5;
                        }
                    }
                    String str2 = this.y.get(0);
                    this.zn = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.zn = (String) obj3;
            return null;
        }

        public final boolean n3() {
            return this.n3;
        }

        public final String y() {
            return this.zn;
        }
    }

    public v(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f1433gv = putMethod;
        this.f1435v = getMethod;
        this.f1431a = removeMethod;
        this.f1432fb = clientProviderClass;
        this.f1434s = serverProviderClass;
    }

    @Override // ck1.i9
    public void n3(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f1431a.invoke(null, sslSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // ck1.i9
    public String s(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f1435v.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            y yVar = (y) invocationHandler;
            if (!yVar.n3() && yVar.y() == null) {
                i9.t(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (yVar.n3()) {
                return null;
            }
            return yVar.y();
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }

    @Override // ck1.i9
    public void v(SSLSocket sslSocket, String str, List<? extends c> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f1433gv.invoke(null, sslSocket, Proxy.newProxyInstance(i9.class.getClassLoader(), new Class[]{this.f1432fb, this.f1434s}, new y(i9.y.n3(protocols))));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }
}

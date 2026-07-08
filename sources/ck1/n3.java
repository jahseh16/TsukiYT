package ck1;

import android.os.Build;
import dk1.f;
import dk1.t;
import dk1.tl;
import dk1.wz;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.c;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f1424a = new y(null);

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final boolean f1425fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<tl> f1426gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final dk1.i9 f1427v;

    /* JADX INFO: renamed from: ck1.n3$n3, reason: collision with other inner class name */
    public static final class C0047n3 implements fk1.v {
        public final Method n3;
        public final X509TrustManager y;

        public C0047n3(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.y = trustManager;
            this.n3 = findByIssuerAndSignatureMethod;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0047n3)) {
                return false;
            }
            C0047n3 c0047n3 = (C0047n3) obj;
            return Intrinsics.areEqual(this.y, c0047n3.y) && Intrinsics.areEqual(this.n3, c0047n3.n3);
        }

        public int hashCode() {
            return (this.y.hashCode() * 31) + this.n3.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.y + ", findByIssuerAndSignatureMethod=" + this.n3 + ')';
        }

        @Override // fk1.v
        public X509Certificate y(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.n3.invoke(this.y, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e4) {
                throw new AssertionError("unable to get issues and signature", e4);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return n3.f1425fb;
        }

        public final i9 y() {
            if (n3()) {
                return new n3();
            }
            return null;
        }

        public y() {
        }
    }

    static {
        boolean z = false;
        if (i9.y.s() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f1425fb = z;
    }

    public n3() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new tl[]{wz.y.n3(wz.f3218i9, null, 1, null), new t(dk1.s.f3214a.gv()), new t(f.y.y()), new t(dk1.c5.y.y())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((tl) obj).n3()) {
                arrayList.add(obj);
            }
        }
        this.f1426gv = arrayList;
        this.f1427v = dk1.i9.f3213gv.y();
    }

    @Override // ck1.i9
    public void a(Socket socket, InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // ck1.i9
    public Object c5(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f1427v.y(closer);
    }

    @Override // ck1.i9
    public fk1.v gv(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new C0047n3(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.gv(trustManager);
        }
    }

    @Override // ck1.i9
    public boolean i9(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return l3.fb.y(l3.a.y(), hostname);
        }
        if (i >= 23) {
            return l3.s.y(l3.a.y());
        }
        return true;
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f1426gv.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((tl) next).v(sslSocketFactory)) {
                break;
            }
        }
        tl tlVar = (tl) next;
        if (tlVar == null) {
            return null;
        }
        return tlVar.gv(sslSocketFactory);
    }

    @Override // ck1.i9
    public String s(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.f1426gv.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((tl) next).y(sslSocket)) {
                break;
            }
        }
        tl tlVar = (tl) next;
        if (tlVar == null) {
            return null;
        }
        return tlVar.zn(sslSocket);
    }

    @Override // ck1.i9
    public void tl(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f1427v.n3(obj)) {
            return;
        }
        i9.t(this, message, 5, null, 4, null);
    }

    @Override // ck1.i9
    public void v(SSLSocket sslSocket, String str, List<c> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.f1426gv.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((tl) next).y(sslSocket)) {
                    break;
                }
            }
        }
        tl tlVar = (tl) next;
        if (tlVar == null) {
            return;
        }
        tlVar.a(sslSocket, str, protocols);
    }

    @Override // ck1.i9
    public fk1.zn zn(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        dk1.gv gvVarY = dk1.gv.f3212gv.y(trustManager);
        return gvVarY == null ? super.zn(trustManager) : gvVarY;
    }
}

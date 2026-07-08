package ck1;

import android.annotation.SuppressLint;
import android.os.Build;
import dk1.f;
import dk1.t;
import dk1.tl;
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
public final class y extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1436a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0048y f1437v = new C0048y(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<tl> f1438gv;

    /* JADX INFO: renamed from: ck1.y$y, reason: collision with other inner class name */
    public static final class C0048y {
        public /* synthetic */ C0048y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean n3() {
            return y.f1436a;
        }

        public final i9 y() {
            if (n3()) {
                return new y();
            }
            return null;
        }

        public C0048y() {
        }
    }

    static {
        f1436a = i9.y.s() && Build.VERSION.SDK_INT >= 29;
    }

    public y() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new tl[]{dk1.zn.y.y(), new t(dk1.s.f3214a.gv()), new t(f.y.y()), new t(dk1.c5.y.y())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((tl) obj).n3()) {
                arrayList.add(obj);
            }
        }
        this.f1438gv = arrayList;
    }

    @Override // ck1.i9
    @SuppressLint({"NewApi"})
    public boolean i9(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return l3.fb.y(l3.a.y(), hostname);
    }

    @Override // ck1.i9
    public X509TrustManager p(SSLSocketFactory sslSocketFactory) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
        Iterator<T> it = this.f1438gv.iterator();
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
        Iterator<T> it = this.f1438gv.iterator();
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
    public void v(SSLSocket sslSocket, String str, List<? extends c> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.f1438gv.iterator();
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

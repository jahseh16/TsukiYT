package xj1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.p;
import sj1.r;
import sj1.ta;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final y f9201c5 = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9202a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public List<? extends InetSocketAddress> f9203fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final p f9204gv;
    public final s n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<ta> f9205s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List<? extends Proxy> f9206v;
    public final sj1.y y;
    public final sj1.v zn;

    public static final class n3 {
        public int n3;
        public final List<ta> y;

        public n3(List<ta> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.y = routes;
        }

        public final boolean n3() {
            return this.n3 < this.y.size();
        }

        public final List<ta> y() {
            return this.y;
        }

        public final ta zn() {
            if (!n3()) {
                throw new NoSuchElementException();
            }
            List<ta> list = this.y;
            int i = this.n3;
            this.n3 = i + 1;
            return list.get(i);
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String y(InetSocketAddress inetSocketAddress) {
            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.checkNotNullExpressionValue(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.checkNotNullExpressionValue(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        public y() {
        }
    }

    public i9(sj1.y address, s routeDatabase, sj1.v call, p eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.y = address;
        this.n3 = routeDatabase;
        this.zn = call;
        this.f9204gv = eventListener;
        this.f9206v = CollectionsKt.emptyList();
        this.f9203fb = CollectionsKt.emptyList();
        this.f9205s = new ArrayList();
        a(address.t(), address.fb());
    }

    public static final List<Proxy> fb(Proxy proxy, r rVar, i9 i9Var) {
        if (proxy != null) {
            return CollectionsKt.listOf(proxy);
        }
        URI uriI4 = rVar.i4();
        if (uriI4.getHost() == null) {
            return tj1.gv.i4(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = i9Var.y.c5().select(uriI4);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return tj1.gv.i4(Proxy.NO_PROXY);
        }
        Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
        return tj1.gv.oz(proxiesOrNull);
    }

    public final void a(r rVar, Proxy proxy) {
        this.f9204gv.w(this.zn, rVar);
        List<Proxy> listFb = fb(proxy, rVar, this);
        this.f9206v = listFb;
        this.f9202a = 0;
        this.f9204gv.xc(this.zn, rVar, listFb);
    }

    public final Proxy gv() throws IOException {
        if (n3()) {
            List<? extends Proxy> list = this.f9206v;
            int i = this.f9202a;
            this.f9202a = i + 1;
            Proxy proxy = list.get(i);
            v(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.y.t().f() + "; exhausted proxy configurations: " + this.f9206v);
    }

    public final boolean n3() {
        return this.f9202a < this.f9206v.size();
    }

    public final void v(Proxy proxy) throws IOException {
        String strF;
        int iMt;
        ArrayList arrayList = new ArrayList();
        this.f9203fb = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strF = this.y.t().f();
            iMt = this.y.t().mt();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            y yVar = f9201c5;
            Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            strF = yVar.y(inetSocketAddress);
            iMt = inetSocketAddress.getPort();
        }
        if (1 > iMt || iMt >= 65536) {
            throw new SocketException("No route to " + strF + ':' + iMt + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strF, iMt));
            return;
        }
        this.f9204gv.wz(this.zn, strF);
        List<InetAddress> listLookup = this.y.zn().lookup(strF);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.y.zn() + " returned no addresses for " + strF);
        }
        this.f9204gv.tl(this.zn, strF, listLookup);
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), iMt));
        }
    }

    public final boolean y() {
        return n3() || !this.f9205s.isEmpty();
    }

    public final n3 zn() throws IOException {
        if (!y()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (n3()) {
            Proxy proxyGv = gv();
            Iterator<? extends InetSocketAddress> it = this.f9203fb.iterator();
            while (it.hasNext()) {
                ta taVar = new ta(this.y, proxyGv, it.next());
                if (this.n3.zn(taVar)) {
                    this.f9205s.add(taVar);
                } else {
                    arrayList.add(taVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            CollectionsKt.addAll(arrayList, this.f9205s);
            this.f9205s.clear();
        }
        return new n3(arrayList);
    }
}

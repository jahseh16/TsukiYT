package sj1;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import sj1.r;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3 f8048a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final r f8049c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<t> f8050f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Proxy f8051fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final HostnameVerifier f8052gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final List<c> f8053i9;
    public final SocketFactory n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ProxySelector f8054s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fb f8055v;
    public final Dns y;
    public final SSLSocketFactory zn;

    public y(String uriHost, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, fb fbVar, n3 proxyAuthenticator, Proxy proxy, List<? extends c> protocols, List<t> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.y = dns;
        this.n3 = socketFactory;
        this.zn = sSLSocketFactory;
        this.f8052gv = hostnameVerifier;
        this.f8055v = fbVar;
        this.f8048a = proxyAuthenticator;
        this.f8051fb = proxy;
        this.f8054s = proxySelector;
        this.f8049c5 = new r.y().fh(sSLSocketFactory != null ? "https" : "http").p(uriHost).i4(i).gv();
        this.f8053i9 = tj1.gv.oz(protocols);
        this.f8050f = tj1.gv.oz(connectionSpecs);
    }

    public final List<c> a() {
        return this.f8053i9;
    }

    public final ProxySelector c5() {
        return this.f8054s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (Intrinsics.areEqual(this.f8049c5, yVar.f8049c5) && gv(yVar)) {
                return true;
            }
        }
        return false;
    }

    public final SSLSocketFactory f() {
        return this.zn;
    }

    public final Proxy fb() {
        return this.f8051fb;
    }

    public final boolean gv(y that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.y, that.y) && Intrinsics.areEqual(this.f8048a, that.f8048a) && Intrinsics.areEqual(this.f8053i9, that.f8053i9) && Intrinsics.areEqual(this.f8050f, that.f8050f) && Intrinsics.areEqual(this.f8054s, that.f8054s) && Intrinsics.areEqual(this.f8051fb, that.f8051fb) && Intrinsics.areEqual(this.zn, that.zn) && Intrinsics.areEqual(this.f8052gv, that.f8052gv) && Intrinsics.areEqual(this.f8055v, that.f8055v) && this.f8049c5.mt() == that.f8049c5.mt();
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f8049c5.hashCode()) * 31) + this.y.hashCode()) * 31) + this.f8048a.hashCode()) * 31) + this.f8053i9.hashCode()) * 31) + this.f8050f.hashCode()) * 31) + this.f8054s.hashCode()) * 31) + Objects.hashCode(this.f8051fb)) * 31) + Objects.hashCode(this.zn)) * 31) + Objects.hashCode(this.f8052gv)) * 31) + Objects.hashCode(this.f8055v);
    }

    public final SocketFactory i9() {
        return this.n3;
    }

    public final List<t> n3() {
        return this.f8050f;
    }

    public final n3 s() {
        return this.f8048a;
    }

    public final r t() {
        return this.f8049c5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f8049c5.f());
        sb.append(':');
        sb.append(this.f8049c5.mt());
        sb.append(", ");
        Proxy proxy = this.f8051fb;
        sb.append(proxy != null ? Intrinsics.stringPlus("proxy=", proxy) : Intrinsics.stringPlus("proxySelector=", this.f8054s));
        sb.append('}');
        return sb.toString();
    }

    public final HostnameVerifier v() {
        return this.f8052gv;
    }

    public final fb y() {
        return this.f8055v;
    }

    public final Dns zn() {
        return this.y;
    }
}

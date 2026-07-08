package sj1;

import ck1.i9;
import fk1.zn;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dns;
import sj1.p;
import sj1.v;

/* JADX INFO: loaded from: classes.dex */
public class n implements Cloneable, v.y {
    public static final n3 en = new n3(null);
    public static final List<c> jz = tj1.gv.i4(c.HTTP_2, c.HTTP_1_1);
    public static final List<t> u = tj1.gv.i4(t.f8025c5, t.f8026f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f7957b;
    public final ProxySelector c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final boolean f7958co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SSLSocketFactory f7959d;
    public final sj1.n3 d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public final X509TrustManager f7960ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p.zn f7961f;
    public final Dns f3;
    public final xj1.s f7;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<x4> f7962fb;
    public final SocketFactory fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public final HostnameVerifier f7963hw;
    public final int j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public final fb f7964j5;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7965k;
    public final Proxy n;
    public final int o;
    public final int oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f7966p;
    public final int q9;
    public final fk1.zn qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zn f7967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<x4> f7968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f7969t;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final int f7970ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f7971v;
    public final sj1.n3 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<t> f7972x;
    public final w y;
    public final wz z;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<c> n3() {
            return n.jz;
        }

        public final List<t> y() {
            return n.u;
        }

        public n3() {
        }
    }

    public n(y builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorX;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.y = builder.f3();
        this.f7971v = builder.r();
        this.f7962fb = tj1.gv.oz(builder.mg());
        this.f7968s = tj1.gv.oz(builder.d());
        this.f7961f = builder.c();
        this.f7969t = builder.k5();
        this.w = builder.xc();
        this.f7966p = builder.d0();
        this.f7958co = builder.fh();
        this.z = builder.i4();
        this.f7967r = builder.w();
        this.f3 = builder.n();
        this.n = builder.ud();
        if (builder.ud() != null) {
            proxySelectorX = ek1.y.y;
        } else {
            proxySelectorX = builder.x();
            proxySelectorX = proxySelectorX == null ? ProxySelector.getDefault() : proxySelectorX;
            if (proxySelectorX == null) {
                proxySelectorX = ek1.y.y;
            }
        }
        this.c = proxySelectorX;
        this.d0 = builder.a8();
        this.fh = builder.vl();
        List<t> listX4 = builder.x4();
        this.f7972x = listX4;
        this.f7957b = builder.ej();
        this.f7963hw = builder.rz();
        this.o = builder.p();
        this.j = builder.z();
        this.oz = builder.b();
        this.f7970ut = builder.j5();
        this.q9 = builder.z6();
        this.f7965k = builder.ta();
        xj1.s sVarYt = builder.yt();
        this.f7 = sVarYt == null ? new xj1.s() : sVarYt;
        List<t> list = listX4;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.f7959d = null;
            this.qn = null;
            this.f7960ej = null;
            this.f7964j5 = fb.f7928gv;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((t) it.next()).a()) {
                    if (builder.hw() != null) {
                        this.f7959d = builder.hw();
                        fk1.zn znVarMt = builder.mt();
                        Intrinsics.checkNotNull(znVarMt);
                        this.qn = znVarMt;
                        X509TrustManager x509TrustManagerQn = builder.qn();
                        Intrinsics.checkNotNull(x509TrustManagerQn);
                        this.f7960ej = x509TrustManagerQn;
                        fb fbVarCo = builder.co();
                        Intrinsics.checkNotNull(znVarMt);
                        this.f7964j5 = fbVarCo.v(znVarMt);
                    } else {
                        i9.y yVar = ck1.i9.y;
                        X509TrustManager x509TrustManagerW = yVar.fb().w();
                        this.f7960ej = x509TrustManagerW;
                        ck1.i9 i9VarFb = yVar.fb();
                        Intrinsics.checkNotNull(x509TrustManagerW);
                        this.f7959d = i9VarFb.xc(x509TrustManagerW);
                        zn.y yVar2 = fk1.zn.y;
                        Intrinsics.checkNotNull(x509TrustManagerW);
                        fk1.zn znVarY = yVar2.y(x509TrustManagerW);
                        this.qn = znVarY;
                        fb fbVarCo2 = builder.co();
                        Intrinsics.checkNotNull(znVarY);
                        this.f7964j5 = fbVarCo2.v(znVarY);
                    }
                }
            }
            this.f7959d = null;
            this.qn = null;
            this.f7960ej = null;
            this.f7964j5 = fb.f7928gv;
        }
        x();
    }

    public final SSLSocketFactory a8() {
        SSLSocketFactory sSLSocketFactory = this.f7959d;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int b() {
        return this.f7970ut;
    }

    public final List<x4> c() {
        return this.f7968s;
    }

    public final int c5() {
        return this.o;
    }

    public Object clone() {
        return super.clone();
    }

    public final boolean co() {
        return this.f7966p;
    }

    public final ProxySelector d() {
        return this.c;
    }

    public y d0() {
        return new y(this);
    }

    public final boolean ej() {
        return this.f7969t;
    }

    public final fb f() {
        return this.f7964j5;
    }

    public final List<x4> f3() {
        return this.f7962fb;
    }

    public final sj1.n3 fb() {
        return this.w;
    }

    public final int fh() {
        return this.q9;
    }

    public final HostnameVerifier i4() {
        return this.f7963hw;
    }

    public final fk1.zn i9() {
        return this.qn;
    }

    public final X509TrustManager k5() {
        return this.f7960ej;
    }

    public final Proxy mg() {
        return this.n;
    }

    public final p.zn mt() {
        return this.f7961f;
    }

    public final long n() {
        return this.f7965k;
    }

    @Override // sj1.v.y
    public v n3(d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new xj1.v(this, request, false);
    }

    public final Dns p() {
        return this.f3;
    }

    public final List<c> rz() {
        return this.f7957b;
    }

    public final zn s() {
        return this.f7967r;
    }

    public final int t() {
        return this.j;
    }

    public final sj1.n3 ta() {
        return this.d0;
    }

    public final f tl() {
        return this.f7971v;
    }

    public final SocketFactory ud() {
        return this.fh;
    }

    public final w w() {
        return this.y;
    }

    public final List<t> wz() {
        return this.f7972x;
    }

    public final void x() {
        if (this.f7962fb.contains(null)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", f3()).toString());
        }
        if (this.f7968s.contains(null)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", c()).toString());
        }
        List<t> list = this.f7972x;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((t) it.next()).a()) {
                    if (this.f7959d == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.qn == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f7960ej == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f7959d != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.qn != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f7960ej != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.f7964j5, fb.f7928gv)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final xj1.s x4() {
        return this.f7;
    }

    public final wz xc() {
        return this.z;
    }

    public final boolean z() {
        return this.f7958co;
    }

    public final int z6() {
        return this.oz;
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7973a;
        public int c;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public boolean f7974c5;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public List<t> f7975co;
        public int d0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zn f7976f;
        public int f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public sj1.n3 f7977fb;
        public int fh;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<x4> f7978gv;

        /* JADX INFO: renamed from: i4, reason: collision with root package name */
        public fk1.zn f7979i4;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public wz f7980i9;
        public xj1.s mg;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public X509TrustManager f7981mt;
        public int n;
        public f n3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f7982p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public HostnameVerifier f7983r;
        public long rz;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f7984s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Dns f7985t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public Proxy f7986tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public p.zn f7987v;
        public SocketFactory w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public ProxySelector f7988wz;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        public fb f7989x4;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public sj1.n3 f7990xc;
        public w y;
        public List<? extends c> z;
        public final List<x4> zn;

        public y() {
            this.y = new w();
            this.n3 = new f();
            this.zn = new ArrayList();
            this.f7978gv = new ArrayList();
            this.f7987v = tj1.gv.fb(p.n3);
            this.f7973a = true;
            sj1.n3 n3Var = sj1.n3.n3;
            this.f7977fb = n3Var;
            this.f7984s = true;
            this.f7974c5 = true;
            this.f7980i9 = wz.n3;
            this.f7985t = Dns.SYSTEM;
            this.f7990xc = n3Var;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.w = socketFactory;
            n3 n3Var2 = n.en;
            this.f7975co = n3Var2.y();
            this.z = n3Var2.n3();
            this.f7983r = fk1.gv.y;
            this.f7989x4 = fb.f7928gv;
            this.n = 10000;
            this.c = 10000;
            this.d0 = 10000;
            this.rz = 1024L;
        }

        public final y a(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            y5(tj1.gv.f("timeout", j, unit));
            return this;
        }

        public final sj1.n3 a8() {
            return this.f7990xc;
        }

        public final void ap(int i) {
            this.c = i;
        }

        public final int b() {
            return this.c;
        }

        public final p.zn c() {
            return this.f7987v;
        }

        public final y c5(wz cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            ct(cookieJar);
            return this;
        }

        public final fb co() {
            return this.f7989x4;
        }

        public final void ct(wz wzVar) {
            Intrinsics.checkNotNullParameter(wzVar, "<set-?>");
            this.f7980i9 = wzVar;
        }

        public final List<x4> d() {
            return this.f7978gv;
        }

        public final boolean d0() {
            return this.f7984s;
        }

        public final void dm(List<t> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f7975co = list;
        }

        public final void e(Proxy proxy) {
            this.f7986tl = proxy;
        }

        public final void eb(p.zn znVar) {
            Intrinsics.checkNotNullParameter(znVar, "<set-?>");
            this.f7987v = znVar;
        }

        public final List<c> ej() {
            return this.z;
        }

        public final void en(zn znVar) {
            this.f7976f = znVar;
        }

        public final y f(Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            if (!Intrinsics.areEqual(dns, n())) {
                yc(null);
            }
            rs(dns);
            return this;
        }

        public final w f3() {
            return this.y;
        }

        public final y f7(boolean z) {
            yg(z);
            return this;
        }

        public final y fb(f connectionPool) {
            Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
            xg(connectionPool);
            return this;
        }

        public final boolean fh() {
            return this.f7974c5;
        }

        public final y g(SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            if (!Intrinsics.areEqual(sslSocketFactory, hw()) || !Intrinsics.areEqual(trustManager, qn())) {
                yc(null);
            }
            kp(sslSocketFactory);
            u(fk1.zn.y.y(trustManager));
            g3(trustManager);
            return this;
        }

        public final void g3(X509TrustManager x509TrustManager) {
            this.f7981mt = x509TrustManager;
        }

        public final y gv(zn znVar) {
            en(znVar);
            return this;
        }

        public final SSLSocketFactory hw() {
            return this.f7982p;
        }

        public final wz i4() {
            return this.f7980i9;
        }

        public final y i9(w dispatcher) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            o4(dispatcher);
            return this;
        }

        public final List<x4> j() {
            return this.zn;
        }

        public final int j5() {
            return this.d0;
        }

        public final void jz(int i) {
            this.f3 = i;
        }

        public final y k(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            ap(tj1.gv.f("timeout", j, unit));
            return this;
        }

        public final boolean k5() {
            return this.f7973a;
        }

        public final void kp(SSLSocketFactory sSLSocketFactory) {
            this.f7982p = sSLSocketFactory;
        }

        public final void lc(boolean z) {
            this.f7984s = z;
        }

        public final y m(SSLSocketFactory sslSocketFactory) {
            Intrinsics.checkNotNullParameter(sslSocketFactory, "sslSocketFactory");
            if (!Intrinsics.areEqual(sslSocketFactory, hw())) {
                yc(null);
            }
            kp(sslSocketFactory);
            i9.y yVar = ck1.i9.y;
            X509TrustManager x509TrustManagerP = yVar.fb().p(sslSocketFactory);
            if (x509TrustManagerP != null) {
                g3(x509TrustManagerP);
                ck1.i9 i9VarFb = yVar.fb();
                X509TrustManager x509TrustManagerQn = qn();
                Intrinsics.checkNotNull(x509TrustManagerQn);
                u(i9VarFb.zn(x509TrustManagerQn));
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + yVar.fb() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        public final List<x4> mg() {
            return this.zn;
        }

        public final fk1.zn mt() {
            return this.f7979i4;
        }

        public final Dns n() {
            return this.f7985t;
        }

        public final y n3(x4 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            d().add(interceptor);
            return this;
        }

        public final void nf(boolean z) {
            this.f7974c5 = z;
        }

        public final y o(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "hostnameVerifier");
            if (!Intrinsics.areEqual(hostnameVerifier, rz())) {
                yc(null);
            }
            ra(hostnameVerifier);
            return this;
        }

        public final void o4(w wVar) {
            Intrinsics.checkNotNullParameter(wVar, "<set-?>");
            this.y = wVar;
        }

        public final List<x4> oz() {
            return this.f7978gv;
        }

        public final int p() {
            return this.f3;
        }

        public final y q9(ProxySelector proxySelector) {
            Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
            if (!Intrinsics.areEqual(proxySelector, x())) {
                yc(null);
            }
            s8(proxySelector);
            return this;
        }

        public final X509TrustManager qn() {
            return this.f7981mt;
        }

        public final f r() {
            return this.n3;
        }

        public final void ra(HostnameVerifier hostnameVerifier) {
            Intrinsics.checkNotNullParameter(hostnameVerifier, "<set-?>");
            this.f7983r = hostnameVerifier;
        }

        public final void rb(int i) {
            this.d0 = i;
        }

        public final void rs(Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "<set-?>");
            this.f7985t = dns;
        }

        public final HostnameVerifier rz() {
            return this.f7983r;
        }

        public final y s(List<t> connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            if (!Intrinsics.areEqual(connectionSpecs, x4())) {
                yc(null);
            }
            dm(tj1.gv.oz(connectionSpecs));
            return this;
        }

        public final void s8(ProxySelector proxySelector) {
            this.f7988wz = proxySelector;
        }

        public final y t(p.zn eventListenerFactory) {
            Intrinsics.checkNotNullParameter(eventListenerFactory, "eventListenerFactory");
            eb(eventListenerFactory);
            return this;
        }

        public final long ta() {
            return this.rz;
        }

        public final y tl(boolean z) {
            lc(z);
            return this;
        }

        public final void u(fk1.zn znVar) {
            this.f7979i4 = znVar;
        }

        public final y u0(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            rb(tj1.gv.f("timeout", j, unit));
            return this;
        }

        public final Proxy ud() {
            return this.f7986tl;
        }

        public final y ut(Proxy proxy) {
            if (!Intrinsics.areEqual(proxy, ud())) {
                yc(null);
            }
            e(proxy);
            return this;
        }

        public final y v(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            jz(tj1.gv.f("timeout", j, unit));
            return this;
        }

        public final SocketFactory vl() {
            return this.w;
        }

        public final zn w() {
            return this.f7976f;
        }

        public final y wz(boolean z) {
            nf(z);
            return this;
        }

        public final ProxySelector x() {
            return this.f7988wz;
        }

        public final List<t> x4() {
            return this.f7975co;
        }

        public final sj1.n3 xc() {
            return this.f7977fb;
        }

        public final void xg(f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.n3 = fVar;
        }

        public final y y(x4 interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            mg().add(interceptor);
            return this;
        }

        public final void y5(int i) {
            this.n = i;
        }

        public final void yc(xj1.s sVar) {
            this.mg = sVar;
        }

        public final void yg(boolean z) {
            this.f7973a = z;
        }

        public final xj1.s yt() {
            return this.mg;
        }

        public final int z() {
            return this.n;
        }

        public final int z6() {
            return this.fh;
        }

        public final n zn() {
            return new n(this);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public y(n okHttpClient) {
            this();
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            this.y = okHttpClient.w();
            this.n3 = okHttpClient.tl();
            CollectionsKt.addAll(this.zn, okHttpClient.f3());
            CollectionsKt.addAll(this.f7978gv, okHttpClient.c());
            this.f7987v = okHttpClient.mt();
            this.f7973a = okHttpClient.ej();
            this.f7977fb = okHttpClient.fb();
            this.f7984s = okHttpClient.co();
            this.f7974c5 = okHttpClient.z();
            this.f7980i9 = okHttpClient.xc();
            this.f7976f = okHttpClient.s();
            this.f7985t = okHttpClient.p();
            this.f7986tl = okHttpClient.mg();
            this.f7988wz = okHttpClient.d();
            this.f7990xc = okHttpClient.ta();
            this.w = okHttpClient.ud();
            this.f7982p = okHttpClient.f7959d;
            this.f7981mt = okHttpClient.k5();
            this.f7975co = okHttpClient.wz();
            this.z = okHttpClient.rz();
            this.f7983r = okHttpClient.i4();
            this.f7989x4 = okHttpClient.f();
            this.f7979i4 = okHttpClient.i9();
            this.f3 = okHttpClient.c5();
            this.n = okHttpClient.t();
            this.c = okHttpClient.z6();
            this.d0 = okHttpClient.b();
            this.fh = okHttpClient.fh();
            this.rz = okHttpClient.n();
            this.mg = okHttpClient.x4();
        }
    }

    public n() {
        this(new y());
    }
}

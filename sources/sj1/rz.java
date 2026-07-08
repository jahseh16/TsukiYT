package sj1;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class rz implements Closeable {
    public gv c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final rz f8006co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final co f8007f;
    public final long f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final String f8008fb;
    public final xj1.zn n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rz f8009p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f8011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z f8012t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f8013v;
    public final mg w;
    public final d0 y;
    public final rz z;

    public rz(d0 request, c protocol, String message, int i, co coVar, z headers, mg mgVar, rz rzVar, rz rzVar2, rz rzVar3, long j, long j4, xj1.zn znVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.y = request;
        this.f8013v = protocol;
        this.f8008fb = message;
        this.f8011s = i;
        this.f8007f = coVar;
        this.f8012t = headers;
        this.w = mgVar;
        this.f8009p = rzVar;
        this.f8006co = rzVar2;
        this.z = rzVar3;
        this.f8010r = j;
        this.f3 = j4;
        this.n = znVar;
    }

    public static /* synthetic */ String c(rz rzVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return rzVar.n(str, str2);
    }

    public final gv a() {
        gv gvVar = this.c;
        if (gvVar != null) {
            return gvVar;
        }
        gv gvVarN3 = gv.f7930wz.n3(this.f8012t);
        this.c = gvVarN3;
        return gvVarN3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mg mgVar = this.w;
        if (mgVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        mgVar.close();
    }

    public final xj1.zn co() {
        return this.n;
    }

    public final rz d() {
        return this.f8009p;
    }

    public final y ej() {
        return new y(this);
    }

    public final String f3(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return c(this, name, null, 2, null);
    }

    public final d0 f7() {
        return this.y;
    }

    public final boolean isSuccessful() {
        int i = this.f8011s;
        return 200 <= i && i < 300;
    }

    public final rz j() {
        return this.z;
    }

    public final long jz() {
        return this.f8010r;
    }

    public final long k() {
        return this.f3;
    }

    public final z mg() {
        return this.f8012t;
    }

    public final String n(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strY = this.f8012t.y(name);
        return strY == null ? str : strY;
    }

    public final c oz() {
        return this.f8013v;
    }

    public final int p() {
        return this.f8011s;
    }

    public final co r() {
        return this.f8007f;
    }

    public final List<String> rz(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f8012t.c5(name);
    }

    public final rz t() {
        return this.f8006co;
    }

    public final String ta() {
        return this.f8008fb;
    }

    public String toString() {
        return "Response{protocol=" + this.f8013v + ", code=" + this.f8011s + ", message=" + this.f8008fb + ", url=" + this.y.t() + '}';
    }

    public final List<s> w() {
        String str;
        z zVar = this.f8012t;
        int i = this.f8011s;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return CollectionsKt.emptyList();
            }
            str = "Proxy-Authenticate";
        }
        return yj1.v.n3(zVar, str);
    }

    public final mg y() {
        return this.w;
    }

    public final mg yt(long j) throws IOException {
        mg mgVar = this.w;
        Intrinsics.checkNotNull(mgVar);
        hk1.fb fbVarPeek = mgVar.source().peek();
        hk1.fb vVar = new hk1.v();
        fbVarPeek.gv(j);
        vVar.g(fbVarPeek, Math.min(j, fbVarPeek.zn().lc()));
        return mg.Companion.y(vVar, this.w.contentType(), vVar.lc());
    }

    public static class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z.y f8014a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public rz f8015c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f8016f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public mg f8017fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public String f8018gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public rz f8019i9;
        public c n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public rz f8020s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f8021t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public xj1.zn f8022tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public co f8023v;
        public d0 y;
        public int zn;

        public y() {
            this.zn = -1;
            this.f8014a = new z.y();
        }

        public final void a(String str, rz rzVar) {
            if (rzVar == null) {
                return;
            }
            if (rzVar.y() != null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
            }
            if (rzVar.d() != null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
            }
            if (rzVar.t() != null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
            }
            if (rzVar.j() != null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
            }
        }

        public final void c(z.y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<set-?>");
            this.f8014a = yVar;
        }

        public final z.y c5() {
            return this.f8014a;
        }

        public y co(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            c5().c5(name);
            return this;
        }

        public final void d(d0 d0Var) {
            this.y = d0Var;
        }

        public final void d0(String str) {
            this.f8018gv = str;
        }

        public y f(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            c5().i9(name, value);
            return this;
        }

        public final void f3(int i) {
            this.zn = i;
        }

        public y fb(int i) {
            f3(i);
            return this;
        }

        public final void fh(rz rzVar) {
            this.f8020s = rzVar;
        }

        public y gv(rz rzVar) {
            a("cacheResponse", rzVar);
            i4(rzVar);
            return this;
        }

        public final void i4(rz rzVar) {
            this.f8015c5 = rzVar;
        }

        public y i9(co coVar) {
            n(coVar);
            return this;
        }

        public final void mg(c cVar) {
            this.n3 = cVar;
        }

        public y mt(long j) {
            ta(j);
            return this;
        }

        public final void n(co coVar) {
            this.f8023v = coVar;
        }

        public y n3(mg mgVar) {
            x4(mgVar);
            return this;
        }

        public y p(c protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            mg(protocol);
            return this;
        }

        public y r(long j) {
            z6(j);
            return this;
        }

        public final void rz(rz rzVar) {
            this.f8019i9 = rzVar;
        }

        public final int s() {
            return this.zn;
        }

        public y t(z headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            c(headers.v());
            return this;
        }

        public final void ta(long j) {
            this.f8021t = j;
        }

        public final void tl(xj1.zn deferredTrailers) {
            Intrinsics.checkNotNullParameter(deferredTrailers, "deferredTrailers");
            this.f8022tl = deferredTrailers;
        }

        public final void v(rz rzVar) {
            if (rzVar != null && rzVar.y() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public y w(rz rzVar) {
            v(rzVar);
            rz(rzVar);
            return this;
        }

        public y wz(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            d0(message);
            return this;
        }

        public final void x4(mg mgVar) {
            this.f8017fb = mgVar;
        }

        public y xc(rz rzVar) {
            a("networkResponse", rzVar);
            fh(rzVar);
            return this;
        }

        public y y(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            c5().y(name, value);
            return this;
        }

        public y z(d0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            d(request);
            return this;
        }

        public final void z6(long j) {
            this.f8016f = j;
        }

        public rz zn() {
            int i = this.zn;
            if (i < 0) {
                throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(s())).toString());
            }
            d0 d0Var = this.y;
            if (d0Var == null) {
                throw new IllegalStateException("request == null");
            }
            c cVar = this.n3;
            if (cVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f8018gv;
            if (str != null) {
                return new rz(d0Var, cVar, str, i, this.f8023v, this.f8014a.a(), this.f8017fb, this.f8020s, this.f8015c5, this.f8019i9, this.f8016f, this.f8021t, this.f8022tl);
            }
            throw new IllegalStateException("message == null");
        }

        public y(rz response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.zn = -1;
            this.y = response.f7();
            this.n3 = response.oz();
            this.zn = response.p();
            this.f8018gv = response.ta();
            this.f8023v = response.r();
            this.f8014a = response.mg().v();
            this.f8017fb = response.y();
            this.f8020s = response.d();
            this.f8015c5 = response.t();
            this.f8019i9 = response.j();
            this.f8016f = response.jz();
            this.f8021t = response.k();
            this.f8022tl = response.co();
        }
    }
}

package sj1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gv f7912a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final fh f7913gv;
    public final String n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<Class<?>, Object> f7914v;
    public final r y;
    public final z zn;

    public d0(r url, String method, z headers, fh fhVar, Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.y = url;
        this.n3 = method;
        this.zn = headers;
        this.f7913gv = fhVar;
        this.f7914v = tags;
    }

    public final z a() {
        return this.zn;
    }

    public final y c5() {
        return new y(this);
    }

    public final <T> T f(Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f7914v.get(type));
    }

    public final boolean fb() {
        return this.y.t();
    }

    public final String gv(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.zn.y(name);
    }

    public final Object i9() {
        return f(Object.class);
    }

    public final gv n3() {
        gv gvVar = this.f7912a;
        if (gvVar != null) {
            return gvVar;
        }
        gv gvVarN3 = gv.f7930wz.n3(this.zn);
        this.f7912a = gvVarN3;
        return gvVarN3;
    }

    public final String s() {
        return this.n3;
    }

    public final r t() {
        return this.y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(s());
        sb.append(", url=");
        sb.append(t());
        if (a().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : a()) {
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strComponent1 = pair2.component1();
                String strComponent2 = pair2.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(strComponent1);
                sb.append(':');
                sb.append(strComponent2);
                i = i5;
            }
            sb.append(']');
        }
        if (!zn().isEmpty()) {
            sb.append(", tags=");
            sb.append(zn());
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final List<String> v(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.zn.c5(name);
    }

    public final fh y() {
        return this.f7913gv;
    }

    public final Map<Class<?>, Object> zn() {
        return this.f7914v;
    }

    public static class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public fh f7915gv;
        public String n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Map<Class<?>, Object> f7916v;
        public r y;
        public z.y zn;

        public y() {
            this.f7916v = new LinkedHashMap();
            this.n3 = "GET";
            this.zn = new z.y();
        }

        public final z.y a() {
            return this.zn;
        }

        public y c5(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            a().i9(name, value);
            return this;
        }

        public final void co(Map<Class<?>, Object> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.f7916v = map;
        }

        public y f(String method, fh fhVar) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (fhVar == null) {
                if (yj1.a.v(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!yj1.a.n3(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            mt(method);
            w(fhVar);
            return this;
        }

        public y f3(r url) {
            Intrinsics.checkNotNullParameter(url, "url");
            z(url);
            return this;
        }

        public final Map<Class<?>, Object> fb() {
            return this.f7916v;
        }

        public y gv(fh fhVar) {
            return f("DELETE", fhVar);
        }

        public y i4(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.startsWith(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("http:", strSubstring);
            } else if (StringsKt.startsWith(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("https:", strSubstring2);
            }
            return f3(r.f7991f.gv(url));
        }

        public y i9(z headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            p(headers.v());
            return this;
        }

        public final void mt(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.n3 = str;
        }

        public d0 n3() {
            r rVar = this.y;
            if (rVar != null) {
                return new d0(rVar, this.n3, this.zn.a(), this.f7915gv, tj1.gv.ut(this.f7916v));
            }
            throw new IllegalStateException("url == null");
        }

        public final void p(z.y yVar) {
            Intrinsics.checkNotNullParameter(yVar, "<set-?>");
            this.zn = yVar;
        }

        public <T> y r(Class<? super T> type, T t3) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t3 == null) {
                fb().remove(type);
            } else {
                if (fb().isEmpty()) {
                    co(new LinkedHashMap());
                }
                Map<Class<?>, Object> mapFb = fb();
                T tCast = type.cast(t3);
                Intrinsics.checkNotNull(tCast);
                mapFb.put(type, tCast);
            }
            return this;
        }

        public y s() {
            return f("HEAD", null);
        }

        public y t(fh body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return f("PATCH", body);
        }

        public y tl(fh body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return f("POST", body);
        }

        public y v() {
            return f("GET", null);
        }

        public final void w(fh fhVar) {
            this.f7915gv = fhVar;
        }

        public y wz(fh body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return f("PUT", body);
        }

        public y x4(Object obj) {
            return r(Object.class, obj);
        }

        public y xc(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            a().c5(name);
            return this;
        }

        public y y(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            a().y(name, value);
            return this;
        }

        public final void z(r rVar) {
            this.y = rVar;
        }

        public y zn(gv cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? xc("Cache-Control") : c5("Cache-Control", string);
        }

        public y(d0 request) {
            Map<Class<?>, Object> mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f7916v = new LinkedHashMap();
            this.y = request.t();
            this.n3 = request.s();
            this.f7915gv = request.y();
            if (request.zn().isEmpty()) {
                mutableMap = new LinkedHashMap<>();
            } else {
                mutableMap = MapsKt.toMutableMap(request.zn());
            }
            this.f7916v = mutableMap;
            this.zn = request.a().v();
        }
    }
}

package sj1;

import ck1.i9;
import hk1.en;
import hk1.k;
import hk1.s;
import hk1.x;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import sj1.d0;
import sj1.rz;
import sj1.z;
import vj1.gv;

/* JADX INFO: loaded from: classes.dex */
public final class zn implements Closeable, Flushable {
    public static final n3 w = new n3(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8057f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f8058fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8060t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8061v;
    public final vj1.gv y;

    public final class gv implements vj1.n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public boolean f8062gv;
        public final k n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ zn f8063v;
        public final gv.n3 y;
        public final k zn;

        public static final class y extends hk1.tl {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ gv f8064v;
            public final /* synthetic */ zn y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(zn znVar, gv gvVar, k kVar) {
                super(kVar);
                this.y = znVar;
                this.f8064v = gvVar;
            }

            public void close() throws IOException {
                zn znVar = this.y;
                gv gvVar = this.f8064v;
                synchronized (znVar) {
                    if (gvVar.gv()) {
                        return;
                    }
                    gvVar.v(true);
                    znVar.f3(znVar.w() + 1);
                    super.close();
                    this.f8064v.y.n3();
                }
            }
        }

        public gv(zn this$0, gv.n3 editor) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f8063v = this$0;
            this.y = editor;
            k kVarA = editor.a(1);
            this.n3 = kVarA;
            this.zn = new y(this$0, this, kVarA);
        }

        public final boolean gv() {
            return this.f8062gv;
        }

        @Override // vj1.n3
        public k n3() {
            return this.zn;
        }

        public final void v(boolean z) {
            this.f8062gv = z;
        }

        @Override // vj1.n3
        public void y() {
            zn znVar = this.f8063v;
            synchronized (znVar) {
                if (gv()) {
                    return;
                }
                v(true);
                znVar.r(znVar.t() + 1);
                tj1.gv.tl(this.n3);
                try {
                    this.y.y();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(rz rzVar) {
            Intrinsics.checkNotNullParameter(rzVar, "<this>");
            rz rzVarD = rzVar.d();
            Intrinsics.checkNotNull(rzVarD);
            return v(rzVarD.f7().a(), rzVar.mg());
        }

        public final boolean fb(rz cachedResponse, z cachedRequest, d0 newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setGv = gv(cachedResponse.mg());
            if ((setGv instanceof Collection) && setGv.isEmpty()) {
                return true;
            }
            for (String str : setGv) {
                if (!Intrinsics.areEqual(cachedRequest.c5(str), newRequest.v(str))) {
                    return false;
                }
            }
            return true;
        }

        public final Set<String> gv(z zVar) {
            int size = zVar.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i5 = i + 1;
                if (StringsKt.equals("Vary", zVar.zn(i), true)) {
                    String strS = zVar.s(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    Iterator it = StringsKt.split$default((CharSequence) strS, new char[]{','}, false, 0, 6, (Object) null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.trim((String) it.next()).toString());
                    }
                }
                i = i5;
            }
            return treeSet == null ? SetsKt.emptySet() : treeSet;
        }

        public final String n3(r url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return hk1.s.fb.gv(url.toString()).yt().f3();
        }

        public final z v(z zVar, z zVar2) {
            Set<String> setGv = gv(zVar2);
            if (setGv.isEmpty()) {
                return tj1.gv.n3;
            }
            z.y yVar = new z.y();
            int size = zVar.size();
            int i = 0;
            while (i < size) {
                int i5 = i + 1;
                String strZn = zVar.zn(i);
                if (setGv.contains(strZn)) {
                    yVar.y(strZn, zVar.s(i));
                }
                i = i5;
            }
            return yVar.a();
        }

        public final boolean y(rz rzVar) {
            Intrinsics.checkNotNullParameter(rzVar, "<this>");
            return gv(rzVar.mg()).contains("*");
        }

        public final int zn(hk1.fb source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long jO4 = source.o4();
                String strZ6 = source.z6();
                if (jO4 >= 0 && jO4 <= 2147483647L && strZ6.length() <= 0) {
                    return (int) jO4;
                }
                throw new IOException("expected an int but was \"" + jO4 + strZ6 + '\"');
            } catch (NumberFormatException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public n3() {
        }
    }

    public static final class y extends mg {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final String f8065fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final hk1.fb f8066s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final String f8067v;
        public final gv.C0186gv y;

        /* JADX INFO: renamed from: sj1.zn$y$y, reason: collision with other inner class name */
        public static final class C0166y extends hk1.wz {

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ y f8068v;
            public final /* synthetic */ en y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0166y(en enVar, y yVar) {
                super(enVar);
                this.y = enVar;
                this.f8068v = yVar;
            }

            public void close() throws IOException {
                this.f8068v.y().close();
                super.close();
            }
        }

        public y(gv.C0186gv snapshot, String str, String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.y = snapshot;
            this.f8067v = str;
            this.f8065fb = str2;
            this.f8066s = x.gv(new C0166y(snapshot.a(1), this));
        }

        @Override // sj1.mg
        public long contentLength() {
            String str = this.f8065fb;
            if (str == null) {
                return -1L;
            }
            return tj1.gv.q9(str, -1L);
        }

        @Override // sj1.mg
        public i4 contentType() {
            String str = this.f8067v;
            if (str == null) {
                return null;
            }
            return i4.f7949v.n3(str);
        }

        @Override // sj1.mg
        public hk1.fb source() {
            return this.f8066s;
        }

        public final gv.C0186gv y() {
            return this.y;
        }
    }

    public zn(File directory, long j, bk1.y fileSystem) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.y = new vj1.gv(fileSystem, directory, 201105, 2, j, wj1.v.f9019c5);
    }

    public final rz a(d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            gv.C0186gv c0186gvD = this.y.d(w.n3(request.t()));
            if (c0186gvD == null) {
                return null;
            }
            try {
                C0167zn c0167zn = new C0167zn(c0186gvD.a(0));
                rz rzVarGv = c0167zn.gv(c0186gvD);
                if (c0167zn.n3(request, rzVarGv)) {
                    return rzVarGv;
                }
                mg mgVarY = rzVarGv.y();
                if (mgVarY != null) {
                    tj1.gv.tl(mgVarY);
                }
                return null;
            } catch (IOException unused) {
                tj1.gv.tl(c0186gvD);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final synchronized void c(vj1.zn cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.f8060t++;
            if (cacheStrategy.n3() != null) {
                this.f8059s++;
            } else if (cacheStrategy.y() != null) {
                this.f8057f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.y.close();
    }

    public final void co(d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.y.ap(w.n3(request.t()));
    }

    public final void f3(int i) {
        this.f8061v = i;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.y.flush();
    }

    public final synchronized void n() {
        this.f8057f++;
    }

    public final vj1.n3 p(rz response) {
        gv.n3 n3VarTa;
        Intrinsics.checkNotNullParameter(response, "response");
        String strS = response.f7().s();
        if (yj1.a.y.y(response.f7().s())) {
            try {
                co(response.f7());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.areEqual(strS, "GET")) {
            return null;
        }
        n3 n3Var = w;
        if (n3Var.y(response)) {
            return null;
        }
        C0167zn c0167zn = new C0167zn(response);
        try {
            n3VarTa = vj1.gv.ta(this.y, n3Var.n3(response.f7().t()), 0L, 2, null);
            if (n3VarTa == null) {
                return null;
            }
            try {
                c0167zn.a(n3VarTa);
                return new gv(this, n3VarTa);
            } catch (IOException unused2) {
                y(n3VarTa);
                return null;
            }
        } catch (IOException unused3) {
            n3VarTa = null;
        }
    }

    public final void r(int i) {
        this.f8058fb = i;
    }

    public final void rz(rz cached, rz network) {
        gv.n3 n3VarY;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C0167zn c0167zn = new C0167zn(network);
        mg mgVarY = cached.y();
        if (mgVarY == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        try {
            n3VarY = ((y) mgVarY).y().y();
            if (n3VarY == null) {
                return;
            }
            try {
                c0167zn.a(n3VarY);
                n3VarY.n3();
            } catch (IOException unused) {
                y(n3VarY);
            }
        } catch (IOException unused2) {
            n3VarY = null;
        }
    }

    public final int t() {
        return this.f8058fb;
    }

    public final int w() {
        return this.f8061v;
    }

    public final void y(gv.n3 n3Var) {
        if (n3Var == null) {
            return;
        }
        try {
            n3Var.y();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zn(File directory, long j) {
        this(directory, j, bk1.y.n3);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: renamed from: sj1.zn$zn, reason: collision with other inner class name */
    public static final class C0167zn {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final y f8069f = new y(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f8070t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public static final String f8071tl;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8072a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final long f8073c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final z f8074fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final c f8075gv;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final long f8076i9;
        public final z n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final co f8077s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int f8078v;
        public final r y;
        public final String zn;

        /* JADX INFO: renamed from: sj1.zn$zn$y */
        public static final class y {
            public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public y() {
            }
        }

        static {
            i9.y yVar = ck1.i9.y;
            f8070t = Intrinsics.stringPlus(yVar.fb().fb(), "-Sent-Millis");
            f8071tl = Intrinsics.stringPlus(yVar.fb().fb(), "-Received-Millis");
        }

        public C0167zn(en rawSource) throws IOException {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                hk1.fb fbVarGv = x.gv(rawSource);
                String strZ6 = fbVarGv.z6();
                r rVarA = r.f7991f.a(strZ6);
                if (rVarA == null) {
                    IOException iOException = new IOException(Intrinsics.stringPlus("Cache corruption for ", strZ6));
                    ck1.i9.y.fb().f("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.y = rVarA;
                this.zn = fbVarGv.z6();
                z.y yVar = new z.y();
                int iZn = zn.w.zn(fbVarGv);
                int i = 0;
                int i5 = 0;
                while (i5 < iZn) {
                    i5++;
                    yVar.zn(fbVarGv.z6());
                }
                this.n3 = yVar.a();
                yj1.f fVarY = yj1.f.f9321gv.y(fbVarGv.z6());
                this.f8075gv = fVarY.y;
                this.f8078v = fVarY.n3;
                this.f8072a = fVarY.zn;
                z.y yVar2 = new z.y();
                int iZn2 = zn.w.zn(fbVarGv);
                while (i < iZn2) {
                    i++;
                    yVar2.zn(fbVarGv.z6());
                }
                String str = f8070t;
                String strFb = yVar2.fb(str);
                String str2 = f8071tl;
                String strFb2 = yVar2.fb(str2);
                yVar2.c5(str);
                yVar2.c5(str2);
                long j = 0;
                this.f8073c5 = strFb == null ? 0L : Long.parseLong(strFb);
                if (strFb2 != null) {
                    j = Long.parseLong(strFb2);
                }
                this.f8076i9 = j;
                this.f8074fb = yVar2.a();
                if (y()) {
                    String strZ62 = fbVarGv.z6();
                    if (strZ62.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strZ62 + '\"');
                    }
                    this.f8077s = co.f7905v.n3(!fbVarGv.dm() ? d.y.y(fbVarGv.z6()) : d.SSL_3_0, c5.n3.n3(fbVarGv.z6()), zn(fbVarGv), zn(fbVarGv));
                } else {
                    this.f8077s = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(rawSource, th);
                    throw th2;
                }
            }
        }

        public final void a(gv.n3 editor) throws IOException {
            Intrinsics.checkNotNullParameter(editor, "editor");
            hk1.a aVarZn = x.zn(editor.a(0));
            try {
                aVarZn.z(this.y.toString()).writeByte(10);
                aVarZn.z(this.zn).writeByte(10);
                aVarZn.o(this.n3.size()).writeByte(10);
                int size = this.n3.size();
                int i = 0;
                while (i < size) {
                    int i5 = i + 1;
                    aVarZn.z(this.n3.zn(i)).z(": ").z(this.n3.s(i)).writeByte(10);
                    i = i5;
                }
                aVarZn.z(new yj1.f(this.f8075gv, this.f8078v, this.f8072a).toString()).writeByte(10);
                aVarZn.o(this.f8074fb.size() + 2).writeByte(10);
                int size2 = this.f8074fb.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    aVarZn.z(this.f8074fb.zn(i8)).z(": ").z(this.f8074fb.s(i8)).writeByte(10);
                }
                aVarZn.z(f8070t).z(": ").o(this.f8073c5).writeByte(10);
                aVarZn.z(f8071tl).z(": ").o(this.f8076i9).writeByte(10);
                if (y()) {
                    aVarZn.writeByte(10);
                    co coVar = this.f8077s;
                    Intrinsics.checkNotNull(coVar);
                    aVarZn.z(coVar.y().zn()).writeByte(10);
                    v(aVarZn, this.f8077s.v());
                    v(aVarZn, this.f8077s.zn());
                    aVarZn.z(this.f8077s.fb().n3()).writeByte(10);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(aVarZn, null);
            } finally {
            }
        }

        public final rz gv(gv.C0186gv snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strY = this.f8074fb.y("Content-Type");
            String strY2 = this.f8074fb.y("Content-Length");
            return new rz.y().z(new d0.y().f3(this.y).f(this.zn, null).i9(this.n3).n3()).p(this.f8075gv).fb(this.f8078v).wz(this.f8072a).t(this.f8074fb).n3(new y(snapshot, strY, strY2)).i9(this.f8077s).r(this.f8073c5).mt(this.f8076i9).zn();
        }

        public final boolean n3(d0 request, rz response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.areEqual(this.y, request.t()) && Intrinsics.areEqual(this.zn, request.s()) && zn.w.fb(response, this.n3, request);
        }

        public final void v(hk1.a aVar, List<? extends Certificate> list) throws IOException {
            try {
                aVar.o(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    s.y yVar = hk1.s.fb;
                    Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                    aVar.z(s.y.a(yVar, bytes, 0, 0, 3, (Object) null).y()).writeByte(10);
                }
            } catch (CertificateEncodingException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public final boolean y() {
            return Intrinsics.areEqual(this.y.x4(), "https");
        }

        public final List<Certificate> zn(hk1.fb fbVar) throws IOException {
            int iZn = zn.w.zn(fbVar);
            if (iZn == -1) {
                return CollectionsKt.emptyList();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iZn);
                int i = 0;
                while (i < iZn) {
                    i++;
                    String strZ6 = fbVar.z6();
                    hk1.v vVar = new hk1.v();
                    hk1.s sVarY = hk1.s.fb.y(strZ6);
                    Intrinsics.checkNotNull(sVarY);
                    vVar.m(sVarY);
                    arrayList.add(certificateFactory.generateCertificate(vVar.o0()));
                }
                return arrayList;
            } catch (CertificateException e4) {
                throw new IOException(e4.getMessage());
            }
        }

        public C0167zn(rz response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.y = response.f7().t();
            this.n3 = zn.w.a(response);
            this.zn = response.f7().s();
            this.f8075gv = response.oz();
            this.f8078v = response.p();
            this.f8072a = response.ta();
            this.f8074fb = response.mg();
            this.f8077s = response.r();
            this.f8073c5 = response.jz();
            this.f8076i9 = response.k();
        }
    }
}

package xj1;

import ak1.a;
import ak1.tl;
import ak1.wz;
import hk1.jz;
import hk1.x;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import sj1.c;
import sj1.co;
import sj1.d0;
import sj1.n;
import sj1.p;
import sj1.r;
import sj1.rz;
import sj1.t;
import sj1.ta;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a.zn implements sj1.i9 {
    public static final y z = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Socket f9175a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public ak1.a f9176c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f9177co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hk1.a f9178f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public co f9179fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ta f9180gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public hk1.fb f9181i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public final List<Reference<v>> f9182mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9183p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f9184s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9185t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f9186tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Socket f9187v;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f9188wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public int f9189xc;
    public final fb zn;

    public static final class gv extends Lambda implements Function0<List<? extends X509Certificate>> {
        public gv() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            co coVar = a.this.f9179fb;
            Intrinsics.checkNotNull(coVar);
            List<Certificate> listV = coVar.v();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listV, 10));
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public /* synthetic */ class n3 {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            y = iArr;
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public static final class zn extends Lambda implements Function0<List<? extends Certificate>> {
        final /* synthetic */ sj1.y $address;
        final /* synthetic */ sj1.fb $certificatePinner;
        final /* synthetic */ co $unverifiedHandshake;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(sj1.fb fbVar, co coVar, sj1.y yVar) {
            super(0);
            this.$certificatePinner = fbVar;
            this.$unverifiedHandshake = coVar;
            this.$address = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            fk1.zn znVarGv = this.$certificatePinner.gv();
            Intrinsics.checkNotNull(znVarGv);
            return znVarGv.y(this.$unverifiedHandshake.v(), this.$address.t().f());
        }
    }

    public a(fb connectionPool, ta route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.zn = connectionPool;
        this.f9180gv = route;
        this.f9183p = 1;
        this.f9182mt = new ArrayList();
        this.f9177co = Long.MAX_VALUE;
    }

    public final synchronized void c() {
        this.f9186tl = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c5(int r17, int r18, int r19, int r20, boolean r21, sj1.v r22, sj1.p r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.a.c5(int, int, int, int, boolean, sj1.v, sj1.p):void");
    }

    public final boolean co() {
        return this.f9185t;
    }

    public final void d(int i) throws IOException {
        Socket socket = this.f9175a;
        Intrinsics.checkNotNull(socket);
        hk1.fb fbVar = this.f9181i9;
        Intrinsics.checkNotNull(fbVar);
        hk1.a aVar = this.f9178f;
        Intrinsics.checkNotNull(aVar);
        socket.setSoTimeout(0);
        ak1.a aVarY = new a.y(true, wj1.v.f9019c5).co(socket, this.f9180gv.y().t().f(), fbVar, aVar).f(this).t(i).y();
        this.f9176c5 = aVarY;
        this.f9183p = ak1.a.f45k.y().gv();
        ak1.a.q5(aVarY, false, null, 3, null);
    }

    public final synchronized void d0() {
        this.f9185t = true;
    }

    public final synchronized void ej(v call, IOException iOException) {
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof wz) {
                if (((wz) iOException).errorCode == ak1.n3.REFUSED_STREAM) {
                    int i = this.w + 1;
                    this.w = i;
                    if (i > 1) {
                        this.f9185t = true;
                        this.f9188wz++;
                    }
                } else if (((wz) iOException).errorCode != ak1.n3.CANCEL || !call.isCanceled()) {
                    this.f9185t = true;
                    this.f9188wz++;
                }
            } else if (!f3() || (iOException instanceof ak1.y)) {
                this.f9185t = true;
                if (this.f9189xc == 0) {
                    if (iOException != null) {
                        i9(call.t(), this.f9180gv, iOException);
                    }
                    this.f9188wz++;
                }
            }
        } finally {
        }
    }

    public final void f(int i, int i5, sj1.v vVar, p pVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyN3 = this.f9180gv.n3();
        sj1.y yVarY = this.f9180gv.y();
        Proxy.Type type = proxyN3.type();
        int i8 = type == null ? -1 : n3.y[type.ordinal()];
        if (i8 == 1 || i8 == 2) {
            socketCreateSocket = yVarY.i9().createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxyN3);
        }
        this.f9187v = socketCreateSocket;
        pVar.i9(vVar, this.f9180gv.gv(), proxyN3);
        socketCreateSocket.setSoTimeout(i5);
        try {
            ck1.i9.y.fb().a(socketCreateSocket, this.f9180gv.gv(), i);
            try {
                this.f9181i9 = x.gv(x.t(socketCreateSocket));
                this.f9178f = x.zn(x.s(socketCreateSocket));
            } catch (NullPointerException e4) {
                if (Intrinsics.areEqual(e4.getMessage(), "throw with null exception")) {
                    throw new IOException(e4);
                }
            }
        } catch (ConnectException e5) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f9180gv.gv()));
            connectException.initCause(e5);
            throw connectException;
        }
    }

    public final boolean f3() {
        return this.f9176c5 != null;
    }

    public final void fb() {
        Socket socket = this.f9187v;
        if (socket == null) {
            return;
        }
        tj1.gv.wz(socket);
    }

    public final boolean fh(List<ta> list) {
        List<ta> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (ta taVar : list2) {
            Proxy.Type type = taVar.n3().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f9180gv.n3().type() == type2 && Intrinsics.areEqual(this.f9180gv.gv(), taVar.gv())) {
                return true;
            }
        }
        return false;
    }

    @Override // ak1.a.zn
    public synchronized void gv(ak1.a connection, tl settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f9183p = settings.gv();
    }

    public final boolean i4(boolean z5) {
        long jMt;
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f9187v;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f9175a;
        Intrinsics.checkNotNull(socket2);
        hk1.fb fbVar = this.f9181i9;
        Intrinsics.checkNotNull(fbVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        ak1.a aVar = this.f9176c5;
        if (aVar != null) {
            return aVar.tg(jNanoTime);
        }
        synchronized (this) {
            jMt = jNanoTime - mt();
        }
        if (jMt < 10000000000L || !z5) {
            return true;
        }
        return tj1.gv.z6(socket2, fbVar);
    }

    public final void i9(n client, ta failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.n3().type() != Proxy.Type.DIRECT) {
            sj1.y yVarY = failedRoute.y();
            yVarY.c5().connectFailed(yVarY.t().i4(), failedRoute.n3().address(), failure);
        }
        client.x4().n3(failedRoute);
    }

    public final void mg(boolean z5) {
        this.f9185t = z5;
    }

    public final long mt() {
        return this.f9177co;
    }

    public final yj1.gv n(n client, yj1.fb chain) throws SocketException {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f9175a;
        Intrinsics.checkNotNull(socket);
        hk1.fb fbVar = this.f9181i9;
        Intrinsics.checkNotNull(fbVar);
        hk1.a aVar = this.f9178f;
        Intrinsics.checkNotNull(aVar);
        ak1.a aVar2 = this.f9176c5;
        if (aVar2 != null) {
            return new ak1.fb(client, this, chain, aVar2);
        }
        socket.setSoTimeout(chain.t());
        jz jzVarTimeout = fbVar.timeout();
        long jC5 = chain.c5();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jzVarTimeout.s(jC5, timeUnit);
        aVar.timeout().s(chain.f(), timeUnit);
        return new zj1.n3(client, this, fbVar, aVar);
    }

    @Override // sj1.i9
    public ta n3() {
        return this.f9180gv;
    }

    public final List<Reference<v>> p() {
        return this.f9182mt;
    }

    public final synchronized void r() {
        this.f9189xc++;
    }

    public final void rz(long j) {
        this.f9177co = j;
    }

    public final boolean s(r rVar, co coVar) {
        List<Certificate> listV = coVar.v();
        return !listV.isEmpty() && fk1.gv.y.v(rVar.f(), (X509Certificate) listV.get(0));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t(xj1.n3 n3Var) throws Throwable {
        sj1.y yVarY = this.f9180gv.y();
        SSLSocketFactory sSLSocketFactoryF = yVarY.f();
        SSLSocket sSLSocket = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactoryF);
            Socket socketCreateSocket = sSLSocketFactoryF.createSocket(this.f9187v, yVarY.t().f(), yVarY.t().mt(), true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                t tVarY = n3Var.y(sSLSocket2);
                if (tVarY.s()) {
                    ck1.i9.y.fb().v(sSLSocket2, yVarY.t().f(), yVarY.a());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                co.y yVar = co.f7905v;
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                co coVarY = yVar.y(sslSocketSession);
                HostnameVerifier hostnameVerifierV = yVarY.v();
                Intrinsics.checkNotNull(hostnameVerifierV);
                if (hostnameVerifierV.verify(yVarY.t().f(), sslSocketSession)) {
                    sj1.fb fbVarY = yVarY.y();
                    Intrinsics.checkNotNull(fbVarY);
                    this.f9179fb = new co(coVarY.fb(), coVarY.y(), coVarY.zn(), new zn(fbVarY, coVarY, yVarY));
                    fbVarY.n3(yVarY.t().f(), new gv());
                    String strS = tVarY.s() ? ck1.i9.y.fb().s(sSLSocket2) : null;
                    this.f9175a = sSLSocket2;
                    this.f9181i9 = x.gv(x.t(sSLSocket2));
                    this.f9178f = x.zn(x.s(sSLSocket2));
                    this.f9184s = strS != null ? c.y.y(strS) : c.HTTP_1_1;
                    ck1.i9.y.fb().n3(sSLSocket2);
                    return;
                }
                List<Certificate> listV = coVarY.v();
                if (listV.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + yVarY.t().f() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listV.get(0);
                throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default("\n              |Hostname " + yVarY.t().f() + " not verified:\n              |    certificate: " + sj1.fb.zn.y(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + fk1.gv.y.y(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    ck1.i9.y.fb().n3(sSLSocket);
                }
                if (sSLSocket != null) {
                    tj1.gv.wz(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Socket ta() {
        Socket socket = this.f9175a;
        Intrinsics.checkNotNull(socket);
        return socket;
    }

    public final void tl(int i, int i5, int i8, sj1.v vVar, p pVar) throws IOException {
        d0 d0VarXc = xc();
        r rVarT = d0VarXc.t();
        int i10 = 0;
        while (i10 < 21) {
            i10++;
            f(i, i5, vVar, pVar);
            d0VarXc = wz(i5, i8, d0VarXc, rVarT);
            if (d0VarXc == null) {
                return;
            }
            Socket socket = this.f9187v;
            if (socket != null) {
                tj1.gv.wz(socket);
            }
            this.f9187v = null;
            this.f9178f = null;
            this.f9181i9 = null;
            pVar.s(vVar, this.f9180gv.gv(), this.f9180gv.n3(), null);
        }
    }

    public String toString() {
        sj1.c5 c5VarY;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f9180gv.y().t().f());
        sb.append(':');
        sb.append(this.f9180gv.y().t().mt());
        sb.append(", proxy=");
        sb.append(this.f9180gv.n3());
        sb.append(" hostAddress=");
        sb.append(this.f9180gv.gv());
        sb.append(" cipherSuite=");
        co coVar = this.f9179fb;
        Object obj = "none";
        if (coVar != null && (c5VarY = coVar.y()) != null) {
            obj = c5VarY;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f9184s);
        sb.append('}');
        return sb.toString();
    }

    @Override // ak1.a.zn
    public void v(ak1.c5 stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.gv(ak1.n3.REFUSED_STREAM, null);
    }

    public final void w(xj1.n3 n3Var, int i, sj1.v vVar, p pVar) throws Throwable {
        if (this.f9180gv.y().f() != null) {
            pVar.rz(vVar);
            t(n3Var);
            pVar.fh(vVar, this.f9179fb);
            if (this.f9184s == c.HTTP_2) {
                d(i);
                return;
            }
            return;
        }
        List<c> listA = this.f9180gv.y().a();
        c cVar = c.H2_PRIOR_KNOWLEDGE;
        if (!listA.contains(cVar)) {
            this.f9175a = this.f9187v;
            this.f9184s = c.HTTP_1_1;
        } else {
            this.f9175a = this.f9187v;
            this.f9184s = cVar;
            d(i);
        }
    }

    public final d0 wz(int i, int i5, d0 d0Var, r rVar) throws IOException {
        String str = "CONNECT " + tj1.gv.o(rVar, true) + " HTTP/1.1";
        while (true) {
            hk1.fb fbVar = this.f9181i9;
            Intrinsics.checkNotNull(fbVar);
            hk1.a aVar = this.f9178f;
            Intrinsics.checkNotNull(aVar);
            zj1.n3 n3Var = new zj1.n3(null, this, fbVar, aVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fbVar.timeout().s(i, timeUnit);
            aVar.timeout().s(i5, timeUnit);
            n3Var.d0(d0Var.a(), str);
            n3Var.y();
            rz.y yVarA = n3Var.a(false);
            Intrinsics.checkNotNull(yVarA);
            rz rzVarZn = yVarA.z(d0Var).zn();
            n3Var.c(rzVarZn);
            int iP = rzVarZn.p();
            if (iP == 200) {
                if (fbVar.zn().dm() && aVar.zn().dm()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iP != 407) {
                throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(rzVarZn.p())));
            }
            d0 d0VarY = this.f9180gv.y().s().y(this.f9180gv, rzVarZn);
            if (d0VarY == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (StringsKt.equals("close", rz.c(rzVarZn, "Connection", null, 2, null), true)) {
                return d0VarY;
            }
            d0Var = d0VarY;
        }
    }

    public final boolean x4(sj1.y address, List<ta> list) {
        Intrinsics.checkNotNullParameter(address, "address");
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f9182mt.size() >= this.f9183p || this.f9185t || !this.f9180gv.y().gv(address)) {
            return false;
        }
        if (Intrinsics.areEqual(address.t().f(), n3().y().t().f())) {
            return true;
        }
        if (this.f9176c5 == null || list == null || !fh(list) || address.v() != fk1.gv.y || !z6(address.t())) {
            return false;
        }
        try {
            sj1.fb fbVarY = address.y();
            Intrinsics.checkNotNull(fbVarY);
            String strF = address.t().f();
            co coVarZn = zn();
            Intrinsics.checkNotNull(coVarZn);
            fbVarY.y(strF, coVarZn.v());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final d0 xc() throws IOException {
        d0 d0VarN3 = new d0.y().f3(this.f9180gv.y().t()).f("CONNECT", null).c5("Host", tj1.gv.o(this.f9180gv.y().t(), true)).c5("Proxy-Connection", "Keep-Alive").c5("User-Agent", "okhttp/4.10.0").n3();
        d0 d0VarY = this.f9180gv.y().s().y(this.f9180gv, new rz.y().z(d0VarN3).p(c.HTTP_1_1).fb(407).wz("Preemptive Authenticate").n3(tj1.gv.zn).r(-1L).mt(-1L).f("Proxy-Authenticate", "OkHttp-Preemptive").zn());
        return d0VarY == null ? d0VarN3 : d0VarY;
    }

    @Override // sj1.i9
    public c y() {
        c cVar = this.f9184s;
        Intrinsics.checkNotNull(cVar);
        return cVar;
    }

    public final int z() {
        return this.f9188wz;
    }

    public final boolean z6(r rVar) {
        co coVar;
        if (tj1.gv.f8214s && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        r rVarT = this.f9180gv.y().t();
        if (rVar.mt() != rVarT.mt()) {
            return false;
        }
        if (Intrinsics.areEqual(rVar.f(), rVarT.f())) {
            return true;
        }
        if (this.f9186tl || (coVar = this.f9179fb) == null) {
            return false;
        }
        Intrinsics.checkNotNull(coVar);
        return s(rVar, coVar);
    }

    @Override // sj1.i9
    public co zn() {
        return this.f9179fb;
    }
}

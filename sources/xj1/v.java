package xj1;

import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sj1.d0;
import sj1.n;
import sj1.p;
import sj1.r;
import sj1.rz;
import sj1.w;

/* JADX INFO: loaded from: classes.dex */
public final class v implements sj1.v {
    public boolean c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public gv f9208co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile xj1.zn f9209d;
    public boolean d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public volatile a f9210ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f9211f;
    public xj1.zn f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f9212fb;
    public volatile boolean fh;
    public boolean n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f9213p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9214r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fb f9215s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zn f9216t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d0 f9217v;
    public final AtomicBoolean w;
    public final n y;
    public a z;

    public static final class n3 extends WeakReference<v> {
        public final Object y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(v referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.y = obj;
        }

        public final Object y() {
            return this.y;
        }
    }

    public final class y implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ v f9218fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public volatile AtomicInteger f9219v;
        public final sj1.a y;

        public y(v this$0, sj1.a responseCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f9218fb = this$0;
            this.y = responseCallback;
            this.f9219v = new AtomicInteger(0);
        }

        public final String gv() {
            return this.f9218fb.p().t().f();
        }

        public final v n3() {
            return this.f9218fb;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            boolean z;
            IOException e4;
            w wVarW;
            String strStringPlus = Intrinsics.stringPlus("OkHttp ", this.f9218fb.i4());
            v vVar = this.f9218fb;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strStringPlus);
            try {
                vVar.f9216t.i4();
                try {
                    try {
                        z = true;
                        try {
                            this.y.onResponse(vVar, vVar.mt());
                            wVarW = vVar.t().w();
                        } catch (IOException e5) {
                            e4 = e5;
                            if (z) {
                                ck1.i9.y.fb().f(Intrinsics.stringPlus("Callback failure for ", vVar.rz()), 4, e4);
                            } else {
                                this.y.onFailure(vVar, e4);
                            }
                            wVarW = vVar.t().w();
                        } catch (Throwable th2) {
                            th = th2;
                            vVar.cancel();
                            if (!z) {
                                IOException iOException = new IOException(Intrinsics.stringPlus("canceled due to ", th));
                                ExceptionsKt.addSuppressed(iOException, th);
                                this.y.onFailure(vVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        vVar.t().w().a(this);
                        throw th3;
                    }
                } catch (IOException e6) {
                    e4 = e6;
                    z = false;
                } catch (Throwable th4) {
                    th = th4;
                    z = false;
                }
                wVarW.a(this);
            } finally {
                threadCurrentThread.setName(name);
            }
        }

        public final void v(y other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f9219v = other.f9219v;
        }

        public final void y(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            w wVarW = this.f9218fb.t().w();
            if (tj1.gv.f8214s && Thread.holdsLock(wVarW)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + wVarW);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f9218fb.x4(interruptedIOException);
                    this.y.onFailure(this.f9218fb, interruptedIOException);
                    this.f9218fb.t().w().a(this);
                }
            } catch (Throwable th) {
                this.f9218fb.t().w().a(this);
                throw th;
            }
        }

        public final AtomicInteger zn() {
            return this.f9219v;
        }
    }

    public static final class zn extends hk1.zn {
        public zn() {
        }

        public void rz() {
            v.this.cancel();
        }
    }

    public v(n client, d0 originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.y = client;
        this.f9217v = originalRequest;
        this.f9212fb = z;
        this.f9215s = client.tl().y();
        this.f9211f = client.mt().y(this);
        zn znVar = new zn();
        znVar.s(t().c5(), TimeUnit.MILLISECONDS);
        this.f9216t = znVar;
        this.w = new AtomicBoolean();
        this.d0 = true;
    }

    public final void c(a aVar) {
        this.f9210ej = aVar;
    }

    public final sj1.y c5(r rVar) {
        SSLSocketFactory sSLSocketFactoryA8;
        HostnameVerifier hostnameVerifierI4;
        sj1.fb fbVarF;
        if (rVar.t()) {
            sSLSocketFactoryA8 = this.y.a8();
            hostnameVerifierI4 = this.y.i4();
            fbVarF = this.y.f();
        } else {
            sSLSocketFactoryA8 = null;
            hostnameVerifierI4 = null;
            fbVarF = null;
        }
        return new sj1.y(rVar.f(), rVar.mt(), this.y.p(), this.y.ud(), sSLSocketFactoryA8, hostnameVerifierI4, fbVarF, this.y.ta(), this.y.mg(), this.y.rz(), this.y.wz(), this.y.d());
    }

    @Override // sj1.v
    public void cancel() {
        if (this.fh) {
            return;
        }
        this.fh = true;
        xj1.zn znVar = this.f9209d;
        if (znVar != null) {
            znVar.n3();
        }
        a aVar = this.f9210ej;
        if (aVar != null) {
            aVar.fb();
        }
        this.f9211f.fb(this);
    }

    public final xj1.zn co(yj1.fb chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.d0) {
                throw new IllegalStateException("released");
            }
            if (this.c) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        gv gvVar = this.f9208co;
        Intrinsics.checkNotNull(gvVar);
        xj1.zn znVar = new xj1.zn(this, this.f9211f, gvVar, gvVar.y(this.y, chain));
        this.f3 = znVar;
        this.f9209d = znVar;
        synchronized (this) {
            this.n = true;
            this.c = true;
        }
        if (this.fh) {
            throw new IOException("Canceled");
        }
        return znVar;
    }

    public final void d0() {
        if (this.f9214r) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9214r = true;
        this.f9216t.f3();
    }

    @Override // sj1.v
    public rz execute() {
        if (!this.w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f9216t.i4();
        fb();
        try {
            this.y.w().n3(this);
            return mt();
        } finally {
            this.y.w().fb(this);
        }
    }

    public final void f(boolean z) {
        xj1.zn znVar;
        synchronized (this) {
            if (!this.d0) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z && (znVar = this.f9209d) != null) {
            znVar.gv();
        }
        this.f3 = null;
    }

    public final Socket f3() {
        a aVar = this.z;
        Intrinsics.checkNotNull(aVar);
        if (tj1.gv.f8214s && !Thread.holdsLock(aVar)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + aVar);
        }
        List<Reference<v>> listP = aVar.p();
        Iterator<Reference<v>> it = listP.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listP.remove(i);
        this.z = null;
        if (listP.isEmpty()) {
            aVar.rz(System.nanoTime());
            if (this.f9215s.zn(aVar)) {
                return aVar.ta();
            }
        }
        return null;
    }

    public final void fb() {
        this.f9213p = ck1.i9.y.fb().c5("response.body().close()");
        this.f9211f.a(this);
    }

    public final <E extends IOException> E fh(E e4) {
        if (this.f9214r || !this.f9216t.f3()) {
            return e4;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (e4 != null) {
            interruptedIOException.initCause(e4);
        }
        return interruptedIOException;
    }

    public final void gv(a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!tj1.gv.f8214s || Thread.holdsLock(connection)) {
            if (this.z != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.z = connection;
            connection.p().add(new n3(this, this.f9213p));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    public final String i4() {
        return this.f9217v.t().z();
    }

    public final void i9(d0 request, boolean z) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.c) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.n) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z) {
            this.f9208co = new gv(this.f9215s, c5(request.t()), this, this.f9211f);
        }
    }

    @Override // sj1.v
    public boolean isCanceled() {
        return this.fh;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sj1.rz mt() throws java.lang.Throwable {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            sj1.n r0 = r10.y
            java.util.List r0 = r0.f3()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            yj1.i9 r0 = new yj1.i9
            sj1.n r1 = r10.y
            r0.<init>(r1)
            r2.add(r0)
            yj1.y r0 = new yj1.y
            sj1.n r1 = r10.y
            sj1.wz r1 = r1.xc()
            r0.<init>(r1)
            r2.add(r0)
            vj1.y r0 = new vj1.y
            sj1.n r1 = r10.y
            sj1.zn r1 = r1.s()
            r0.<init>(r1)
            r2.add(r0)
            xj1.y r0 = xj1.y.y
            r2.add(r0)
            boolean r0 = r10.f9212fb
            if (r0 != 0) goto L4a
            sj1.n r0 = r10.y
            java.util.List r0 = r0.c()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L4a:
            yj1.n3 r0 = new yj1.n3
            boolean r1 = r10.f9212fb
            r0.<init>(r1)
            r2.add(r0)
            yj1.fb r9 = new yj1.fb
            sj1.d0 r5 = r10.f9217v
            sj1.n r0 = r10.y
            int r6 = r0.t()
            sj1.n r0 = r10.y
            int r7 = r0.z6()
            sj1.n r0 = r10.y
            int r8 = r0.b()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            sj1.d0 r2 = r10.f9217v     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            sj1.rz r2 = r9.n3(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            boolean r3 = r10.isCanceled()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            if (r3 != 0) goto L83
            r10.x4(r0)
            return r2
        L83:
            tj1.gv.tl(r2)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
            throw r2     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L90
        L8e:
            r2 = move-exception
            goto La5
        L90:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r10.x4(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto La4
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> La0
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> La0
            throw r1     // Catch: java.lang.Throwable -> La0
        La0:
            r1 = move-exception
            r2 = r1
            r1 = 1
            goto La5
        La4:
            throw r1     // Catch: java.lang.Throwable -> La0
        La5:
            if (r1 != 0) goto Laa
            r10.x4(r0)
        Laa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xj1.v.mt():sj1.rz");
    }

    public final boolean n() {
        gv gvVar = this.f9208co;
        Intrinsics.checkNotNull(gvVar);
        return gvVar.v();
    }

    public final d0 p() {
        return this.f9217v;
    }

    @Override // sj1.v
    public void r(sj1.a responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.w.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        fb();
        this.y.w().y(new y(this, responseCallback));
    }

    public final String rz() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        sb.append(this.f9212fb ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(i4());
        return sb.toString();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public v clone() {
        return new v(this.y, this.f9217v, this.f9212fb);
    }

    public final n t() {
        return this.y;
    }

    public final a tl() {
        return this.z;
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
    public final <E extends IOException> E v(E e4) {
        Socket socketF3;
        boolean z = tj1.gv.f8214s;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        a aVar = this.z;
        if (aVar != null) {
            if (z && Thread.holdsLock(aVar)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + aVar);
            }
            synchronized (aVar) {
                socketF3 = f3();
            }
            if (this.z == null) {
                if (socketF3 != null) {
                    tj1.gv.wz(socketF3);
                }
                this.f9211f.t(this, aVar);
            } else if (socketF3 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e5 = (E) fh(e4);
        if (e4 != null) {
            p pVar = this.f9211f;
            Intrinsics.checkNotNull(e5);
            pVar.v(this, e5);
        } else {
            this.f9211f.gv(this);
        }
        return e5;
    }

    public final xj1.zn w() {
        return this.f3;
    }

    public final p wz() {
        return this.f9211f;
    }

    public final IOException x4(IOException iOException) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.d0) {
                    this.d0 = false;
                    if (!this.n && !this.c) {
                        z = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? v(iOException) : iOException;
    }

    public final boolean xc() {
        return this.f9212fb;
    }

    @Override // sj1.v
    public d0 y() {
        return this.f9217v;
    }

    public final <E extends IOException> E z(xj1.zn exchange, boolean z, boolean z5, E e4) {
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (!Intrinsics.areEqual(exchange, this.f9209d)) {
            return e4;
        }
        synchronized (this) {
            z7 = false;
            if (z) {
                try {
                    if (!this.n) {
                        if (z5 || !this.c) {
                            z8 = false;
                        }
                    }
                    if (z) {
                        this.n = false;
                    }
                    if (z5) {
                        this.c = false;
                    }
                    boolean z9 = this.n;
                    boolean z10 = (z9 || this.c) ? false : true;
                    if (!z9 && !this.c && !this.d0) {
                        z7 = true;
                    }
                    z8 = z7;
                    z7 = z10;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z5) {
                }
                z8 = false;
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z7) {
            this.f9209d = null;
            a aVar = this.z;
            if (aVar != null) {
                aVar.r();
            }
        }
        return z8 ? (E) v(e4) : e4;
    }
}

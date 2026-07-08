package ak1;

import ak1.s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {
    public static final tl f7;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final n3 f45k = new n3(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tl f46b;
    public long c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public final wj1.gv f47co;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f48d;
    public long d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public long f49ej;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f50f;
    public final ak1.t f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Map<Integer, ak1.c5> f51fb;
    public long fh;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public long f52hw;
    public final Socket j;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public long f53j5;
    public long n;
    public long o;
    public final ak1.i9 oz;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj1.v f54p;
    public final Set<Integer> q9;
    public long qn;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj1.gv f55r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f56s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f57t;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public final gv f58ut;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zn f59v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tl f60x;
    public final boolean y;
    public final wj1.gv z;

    /* JADX INFO: renamed from: ak1.a$a, reason: collision with other inner class name */
    public static final class C0003a extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f61a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ List f62c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f63fb;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final /* synthetic */ boolean f64i9;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f65s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f66v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003a(String str, boolean z, a aVar, int i, List list, boolean z5) {
            super(str, z);
            this.f66v = str;
            this.f61a = z;
            this.f63fb = aVar;
            this.f65s = i;
            this.f62c5 = list;
            this.f64i9 = z5;
        }

        @Override // wj1.y
        public long a() {
            boolean zGv = this.f63fb.f3.gv(this.f65s, this.f62c5, this.f64i9);
            if (zGv) {
                try {
                    this.f63fb.y4().rz(this.f65s, ak1.n3.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zGv && !this.f64i9) {
                return -1L;
            }
            synchronized (this.f63fb) {
                this.f63fb.q9.remove(Integer.valueOf(this.f65s));
            }
            return -1L;
        }
    }

    public static final class c5 extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f67a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f68fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f69v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c5(String str, boolean z, a aVar) {
            super(str, z);
            this.f69v = str;
            this.f67a = z;
            this.f68fb = aVar;
        }

        @Override // wj1.y
        public long a() {
            this.f68fb.ro(false, 2, 0);
            return -1L;
        }
    }

    public static final class f extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f70a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ ak1.n3 f71c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f72fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f73s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f74v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z, a aVar, int i, ak1.n3 n3Var) {
            super(str, z);
            this.f74v = str;
            this.f70a = z;
            this.f72fb = aVar;
            this.f73s = i;
            this.f71c5 = n3Var;
        }

        @Override // wj1.y
        public long a() {
            try {
                this.f72fb.ix(this.f73s, this.f71c5);
                return -1L;
            } catch (IOException e4) {
                this.f72fb.f7(e4);
                return -1L;
            }
        }
    }

    public static final class fb extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f75a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ List f76c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f77fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f78s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f79v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fb(String str, boolean z, a aVar, int i, List list) {
            super(str, z);
            this.f79v = str;
            this.f75a = z;
            this.f77fb = aVar;
            this.f78s = i;
            this.f76c5 = list;
        }

        @Override // wj1.y
        public long a() {
            if (!this.f77fb.f3.zn(this.f78s, this.f76c5)) {
                return -1L;
            }
            try {
                this.f77fb.y4().rz(this.f78s, ak1.n3.CANCEL);
                synchronized (this.f77fb) {
                    this.f77fb.q9.remove(Integer.valueOf(this.f78s));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class i9 extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a f99a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ long f100fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f101v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i9(String str, a aVar, long j) {
            super(str, false, 2, null);
            this.f101v = str;
            this.f99a = aVar;
            this.f100fb = j;
        }

        @Override // wj1.y
        public long a() {
            boolean z;
            synchronized (this.f99a) {
                if (this.f99a.c < this.f99a.n) {
                    z = true;
                } else {
                    this.f99a.n++;
                    z = false;
                }
            }
            if (z) {
                this.f99a.f7(null);
                return -1L;
            }
            this.f99a.ro(false, 1, 0);
            return this.f100fb;
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final tl y() {
            return a.f7;
        }

        public n3() {
        }
    }

    public static final class s extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f102a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ ak1.n3 f103c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f104fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f105s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f106v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, boolean z, a aVar, int i, ak1.n3 n3Var) {
            super(str, z);
            this.f106v = str;
            this.f102a = z;
            this.f104fb = aVar;
            this.f105s = i;
            this.f103c5 = n3Var;
        }

        @Override // wj1.y
        public long a() {
            this.f104fb.f3.y(this.f105s, this.f103c5);
            synchronized (this.f104fb) {
                this.f104fb.q9.remove(Integer.valueOf(this.f105s));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    public static final class t extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f107a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ long f108c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f109fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f110s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f111v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, boolean z, a aVar, int i, long j) {
            super(str, z);
            this.f111v = str;
            this.f107a = z;
            this.f109fb = aVar;
            this.f110s = i;
            this.f108c5 = j;
        }

        @Override // wj1.y
        public long a() {
            try {
                this.f109fb.y4().ta(this.f110s, this.f108c5);
                return -1L;
            } catch (IOException e4) {
                this.f109fb.f7(e4);
                return -1L;
            }
        }
    }

    public static final class v extends wj1.y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f112a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final /* synthetic */ hk1.v f113c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f114f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ a f115fb;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public final /* synthetic */ int f116i9;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f117s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f118v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, boolean z, a aVar, int i, hk1.v vVar, int i5, boolean z5) {
            super(str, z);
            this.f118v = str;
            this.f112a = z;
            this.f115fb = aVar;
            this.f117s = i;
            this.f113c5 = vVar;
            this.f116i9 = i5;
            this.f114f = z5;
        }

        @Override // wj1.y
        public long a() {
            try {
                boolean zN3 = this.f115fb.f3.n3(this.f117s, this.f113c5, this.f116i9, this.f114f);
                if (zN3) {
                    this.f115fb.y4().rz(this.f117s, ak1.n3.CANCEL);
                }
                if (!zN3 && !this.f114f) {
                    return -1L;
                }
                synchronized (this.f115fb) {
                    this.f115fb.q9.remove(Integer.valueOf(this.f117s));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public hk1.a f119a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f120c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public zn f121fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public String f122gv;
        public final wj1.v n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public ak1.t f123s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public hk1.fb f124v;
        public boolean y;
        public Socket zn;

        public y(boolean z, wj1.v taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.y = z;
            this.n3 = taskRunner;
            this.f121fb = zn.n3;
            this.f123s = ak1.t.n3;
        }

        public final ak1.t a() {
            return this.f123s;
        }

        public final hk1.fb c5() {
            hk1.fb fbVar = this.f124v;
            if (fbVar != null) {
                return fbVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final y co(Socket socket, String peerName, hk1.fb source, hk1.a sink) throws IOException {
            String strStringPlus;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            p(socket);
            if (n3()) {
                strStringPlus = tj1.gv.f8211c5 + ' ' + peerName;
            } else {
                strStringPlus = Intrinsics.stringPlus("MockWebServer ", peerName);
            }
            tl(strStringPlus);
            mt(source);
            w(sink);
            return this;
        }

        public final y f(zn listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            wz(listener);
            return this;
        }

        public final hk1.a fb() {
            hk1.a aVar = this.f119a;
            if (aVar != null) {
                return aVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final zn gv() {
            return this.f121fb;
        }

        public final wj1.v i9() {
            return this.n3;
        }

        public final void mt(hk1.fb fbVar) {
            Intrinsics.checkNotNullParameter(fbVar, "<set-?>");
            this.f124v = fbVar;
        }

        public final boolean n3() {
            return this.y;
        }

        public final void p(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.zn = socket;
        }

        public final Socket s() {
            Socket socket = this.zn;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final y t(int i) {
            xc(i);
            return this;
        }

        public final void tl(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f122gv = str;
        }

        public final int v() {
            return this.f120c5;
        }

        public final void w(hk1.a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            this.f119a = aVar;
        }

        public final void wz(zn znVar) {
            Intrinsics.checkNotNullParameter(znVar, "<set-?>");
            this.f121fb = znVar;
        }

        public final void xc(int i) {
            this.f120c5 = i;
        }

        public final a y() {
            return new a(this);
        }

        public final String zn() {
            String str = this.f122gv;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }
    }

    public static abstract class zn {
        public static final n3 y = new n3(null);
        public static final zn n3 = new y();

        public static final class n3 {
            public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public n3() {
            }
        }

        public static final class y extends zn {
            @Override // ak1.a.zn
            public void v(ak1.c5 stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.gv(ak1.n3.REFUSED_STREAM, null);
            }
        }

        public void gv(a connection, tl settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void v(ak1.c5 c5Var) throws IOException;
    }

    static {
        tl tlVar = new tl();
        tlVar.s(7, 65535);
        tlVar.s(5, 16384);
        f7 = tlVar;
    }

    public a(y builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean zN3 = builder.n3();
        this.y = zN3;
        this.f59v = builder.gv();
        this.f51fb = new LinkedHashMap();
        String strZn = builder.zn();
        this.f56s = strZn;
        this.f57t = builder.n3() ? 3 : 2;
        wj1.v vVarI9 = builder.i9();
        this.f54p = vVarI9;
        wj1.gv gvVarC5 = vVarI9.c5();
        this.f47co = gvVarC5;
        this.z = vVarI9.c5();
        this.f55r = vVarI9.c5();
        this.f3 = builder.a();
        tl tlVar = new tl();
        if (builder.n3()) {
            tlVar.s(7, 16777216);
        }
        this.f60x = tlVar;
        this.f46b = f7;
        this.o = r2.zn();
        this.j = builder.s();
        this.oz = new ak1.i9(builder.fb(), zN3);
        this.f58ut = new gv(this, new ak1.s(builder.c5(), zN3));
        this.q9 = new LinkedHashSet();
        if (builder.v() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.v());
            gvVarC5.c5(new i9(Intrinsics.stringPlus(strZn, " ping"), this, nanos), nanos);
        }
    }

    public static /* synthetic */ void q5(a aVar, boolean z, wj1.v vVar, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            vVar = wj1.v.f9019c5;
        }
        aVar.x5(z, vVar);
    }

    public final void ad(int i, List<ak1.zn> requestHeaders, boolean z) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.z.c5(new C0003a(this.f56s + '[' + i + "] onHeaders", true, this, i, requestHeaders, z), 0L);
    }

    public final tl ap() {
        return this.f46b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k(ak1.n3.NO_ERROR, ak1.n3.CANCEL, null);
    }

    public final void cs(int i, boolean z, List<ak1.zn> alternating) throws IOException {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.oz.r(z, i, alternating);
    }

    public final int ct() {
        return this.f50f;
    }

    public final void cy(int i, List<ak1.zn> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.q9.contains(Integer.valueOf(i))) {
                yk(i, ak1.n3.PROTOCOL_ERROR);
                return;
            }
            this.q9.add(Integer.valueOf(i));
            this.z.c5(new fb(this.f56s + '[' + i + "] onRequest", true, this, i, requestHeaders), 0L);
        }
    }

    public final int eb() {
        return this.f57t;
    }

    public final void f7(IOException iOException) {
        ak1.n3 n3Var = ak1.n3.PROTOCOL_ERROR;
        k(n3Var, n3Var, iOException);
    }

    public final void flush() throws IOException {
        this.oz.flush();
    }

    public final long g() {
        return this.o;
    }

    public final void gq() {
        synchronized (this) {
            long j = this.fh;
            long j4 = this.d0;
            if (j < j4) {
                return;
            }
            this.d0 = j4 + 1;
            this.f49ej = System.nanoTime() + ((long) 1000000000);
            Unit unit = Unit.INSTANCE;
            this.f47co.c5(new c5(Intrinsics.stringPlus(this.f56s, " ping"), true, this), 0L);
        }
    }

    public final void i2(int i, long j) {
        this.f47co.c5(new t(this.f56s + '[' + i + "] windowUpdate", true, this, i, j), 0L);
    }

    public final void ix(int i, ak1.n3 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.oz.rz(i, statusCode);
    }

    public final boolean jz() {
        return this.y;
    }

    public final void k(ak1.n3 connectionCode, ak1.n3 streamCode, IOException iOException) {
        int i;
        Object[] array;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        try {
            w2(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (m().isEmpty()) {
                    array = null;
                } else {
                    array = m().values().toArray(new ak1.c5[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    m().clear();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        ak1.c5[] c5VarArr = (ak1.c5[]) array;
        if (c5VarArr != null) {
            for (ak1.c5 c5Var : c5VarArr) {
                try {
                    c5Var.gv(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            y4().close();
        } catch (IOException unused3) {
        }
        try {
            kp().close();
        } catch (IOException unused4) {
        }
        this.f47co.xc();
        this.z.xc();
        this.f55r.xc();
    }

    public final Socket kp() {
        return this.j;
    }

    public final synchronized ak1.c5 l(int i) {
        ak1.c5 c5VarRemove;
        c5VarRemove = this.f51fb.remove(Integer.valueOf(i));
        notifyAll();
        return c5VarRemove;
    }

    public final tl lc() {
        return this.f60x;
    }

    public final void le(int i, boolean z, hk1.v vVar, long j) throws IOException {
        int iMin;
        long j4;
        if (j == 0) {
            this.oz.t(z, i, vVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (u0() >= g()) {
                    try {
                        try {
                            if (!m().containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, g() - u0()), y4().f3());
                j4 = iMin;
                this.qn = u0() + j4;
                Unit unit = Unit.INSTANCE;
            }
            j -= j4;
            this.oz.t(z && j == 0, i, vVar, iMin);
        }
    }

    public final Map<Integer, ak1.c5> m() {
        return this.f51fb;
    }

    public final synchronized void mp(long j) {
        long j4 = this.f52hw + j;
        this.f52hw = j4;
        long j7 = j4 - this.f53j5;
        if (j7 >= this.f60x.zn() / 2) {
            i2(0, j7);
            this.f53j5 += j7;
        }
    }

    public final void oa(int i) {
        this.f57t = i;
    }

    public final ak1.c5 pz(int i, List<ak1.zn> list, boolean z) throws IOException {
        int iEb;
        ak1.c5 c5Var;
        boolean z5 = true;
        boolean z7 = !z;
        synchronized (this.oz) {
            try {
                synchronized (this) {
                    try {
                        if (eb() > 1073741823) {
                            w2(ak1.n3.REFUSED_STREAM);
                        }
                        if (this.w) {
                            throw new ak1.y();
                        }
                        iEb = eb();
                        oa(eb() + 2);
                        c5Var = new ak1.c5(iEb, this, z7, false, null);
                        if (z && u0() < g() && c5Var.mt() < c5Var.p()) {
                            z5 = false;
                        }
                        if (c5Var.r()) {
                            m().put(Integer.valueOf(iEb), c5Var);
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                if (i == 0) {
                    y4().r(z7, iEb, list);
                } else {
                    if (jz()) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    y4().c(i, iEb, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            this.oz.flush();
        }
        return c5Var;
    }

    public final boolean qj(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void qk(int i, ak1.n3 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.z.c5(new s(this.f56s + '[' + i + "] onReset", true, this, i, errorCode), 0L);
    }

    public final synchronized ak1.c5 rb(int i) {
        return this.f51fb.get(Integer.valueOf(i));
    }

    public final void ro(boolean z, int i, int i5) {
        try {
            this.oz.n(z, i, i5);
        } catch (IOException e4) {
            f7(e4);
        }
    }

    public final zn rs() {
        return this.f59v;
    }

    public final synchronized boolean tg(long j) {
        if (this.w) {
            return false;
        }
        if (this.fh < this.d0) {
            if (j >= this.f49ej) {
                return false;
            }
        }
        return true;
    }

    public final String u() {
        return this.f56s;
    }

    public final long u0() {
        return this.qn;
    }

    public final void vp(int i) {
        this.f50f = i;
    }

    public final void w2(ak1.n3 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.oz) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.w) {
                    return;
                }
                this.w = true;
                ref$IntRef.element = ct();
                Unit unit = Unit.INSTANCE;
                y4().co(ref$IntRef.element, statusCode, tj1.gv.y);
            }
        }
    }

    public final void w9(tl tlVar) {
        Intrinsics.checkNotNullParameter(tlVar, "<set-?>");
        this.f46b = tlVar;
    }

    public final void wf(int i, hk1.fb source, int i5, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        hk1.v vVar = new hk1.v();
        long j = i5;
        source.qn(j);
        source.read(vVar, j);
        this.z.c5(new v(this.f56s + '[' + i + "] onData", true, this, i, vVar, i5, z), 0L);
    }

    public final void x5(boolean z, wj1.v taskRunner) throws IOException {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z) {
            this.oz.a();
            this.oz.mg(this.f60x);
            if (this.f60x.zn() != 65535) {
                this.oz.ta(0, r5 - 65535);
            }
        }
        taskRunner.c5().c5(new wj1.zn(this.f56s, true, this.f58ut), 0L);
    }

    public final ak1.c5 xb(List<ak1.zn> requestHeaders, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return pz(0, requestHeaders, z);
    }

    public final ak1.i9 y4() {
        return this.oz;
    }

    public final void yk(int i, ak1.n3 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f47co.c5(new f(this.f56s + '[' + i + "] writeSynReset", true, this, i, errorCode), 0L);
    }

    public final class gv implements s.zn, Function0<Unit> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a f80v;
        public final ak1.s y;

        /* JADX INFO: renamed from: ak1.a$gv$gv, reason: collision with other inner class name */
        public static final class C0004gv extends wj1.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f81a;

            /* JADX INFO: renamed from: c5, reason: collision with root package name */
            public final /* synthetic */ tl f82c5;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ gv f83fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ boolean f84s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f85v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0004gv(String str, boolean z, gv gvVar, boolean z5, tl tlVar) {
                super(str, z);
                this.f85v = str;
                this.f81a = z;
                this.f83fb = gvVar;
                this.f84s = z5;
                this.f82c5 = tlVar;
            }

            @Override // wj1.y
            public long a() {
                this.f83fb.f(this.f84s, this.f82c5);
                return -1L;
            }
        }

        public static final class n3 extends wj1.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f86a;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ a f87fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ ak1.c5 f88s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f89v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n3(String str, boolean z, a aVar, ak1.c5 c5Var) {
                super(str, z);
                this.f89v = str;
                this.f86a = z;
                this.f87fb = aVar;
                this.f88s = c5Var;
            }

            @Override // wj1.y
            public long a() {
                try {
                    this.f87fb.rs().v(this.f88s);
                    return -1L;
                } catch (IOException e4) {
                    ck1.i9.y.fb().f(Intrinsics.stringPlus("Http2Connection.Listener failure for ", this.f87fb.u()), 4, e4);
                    try {
                        this.f88s.gv(ak1.n3.PROTOCOL_ERROR, e4);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class y extends wj1.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f90a;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ a f91fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef f92s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f93v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public y(String str, boolean z, a aVar, Ref$ObjectRef ref$ObjectRef) {
                super(str, z);
                this.f93v = str;
                this.f90a = z;
                this.f91fb = aVar;
                this.f92s = ref$ObjectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // wj1.y
            public long a() {
                this.f91fb.rs().gv(this.f91fb, (tl) this.f92s.element);
                return -1L;
            }
        }

        public static final class zn extends wj1.y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f94a;

            /* JADX INFO: renamed from: c5, reason: collision with root package name */
            public final /* synthetic */ int f95c5;

            /* JADX INFO: renamed from: fb, reason: collision with root package name */
            public final /* synthetic */ a f96fb;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f97s;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f98v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zn(String str, boolean z, a aVar, int i, int i5) {
                super(str, z);
                this.f98v = str;
                this.f94a = z;
                this.f96fb = aVar;
                this.f97s = i;
                this.f95c5 = i5;
            }

            @Override // wj1.y
            public long a() {
                this.f96fb.ro(true, this.f97s, this.f95c5);
                return -1L;
            }
        }

        public gv(a this$0, ak1.s reader) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f80v = this$0;
            this.y = reader;
        }

        @Override // ak1.s.zn
        public void a(int i, int i5, List<ak1.zn> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f80v.cy(i5, requestHeaders);
        }

        @Override // ak1.s.zn
        public void c5(boolean z, int i, int i5) {
            if (!z) {
                this.f80v.f47co.c5(new zn(Intrinsics.stringPlus(this.f80v.u(), " ping"), true, this.f80v, i, i5), 0L);
                return;
            }
            a aVar = this.f80v;
            synchronized (aVar) {
                try {
                    if (i == 1) {
                        aVar.c++;
                    } else if (i != 2) {
                        if (i == 3) {
                            aVar.f48d++;
                            aVar.notifyAll();
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        aVar.fh++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, ak1.tl] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void f(boolean z, tl settings) {
            ?? r13;
            long jZn;
            int i;
            ak1.c5[] c5VarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ak1.i9 i9VarY4 = this.f80v.y4();
            a aVar = this.f80v;
            synchronized (i9VarY4) {
                synchronized (aVar) {
                    try {
                        tl tlVarAp = aVar.ap();
                        if (z) {
                            r13 = settings;
                        } else {
                            tl tlVar = new tl();
                            tlVar.fb(tlVarAp);
                            tlVar.fb(settings);
                            r13 = tlVar;
                        }
                        ref$ObjectRef.element = r13;
                        jZn = ((long) r13.zn()) - ((long) tlVarAp.zn());
                        i = 0;
                        if (jZn == 0 || aVar.m().isEmpty()) {
                            c5VarArr = null;
                        } else {
                            Object[] array = aVar.m().values().toArray(new ak1.c5[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            c5VarArr = (ak1.c5[]) array;
                        }
                        aVar.w9((tl) ref$ObjectRef.element);
                        aVar.f55r.c5(new y(Intrinsics.stringPlus(aVar.u(), " onSettings"), true, aVar, ref$ObjectRef), 0L);
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    aVar.y4().y((tl) ref$ObjectRef.element);
                } catch (IOException e4) {
                    aVar.f7(e4);
                }
                Unit unit2 = Unit.INSTANCE;
            }
            if (c5VarArr != null) {
                int length = c5VarArr.length;
                while (i < length) {
                    ak1.c5 c5Var = c5VarArr[i];
                    i++;
                    synchronized (c5Var) {
                        c5Var.y(jZn);
                        Unit unit3 = Unit.INSTANCE;
                    }
                }
            }
        }

        @Override // ak1.s.zn
        public void gv(boolean z, int i, hk1.fb source, int i5) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f80v.qj(i)) {
                this.f80v.wf(i, source, i5, z);
                return;
            }
            ak1.c5 c5VarRb = this.f80v.rb(i);
            if (c5VarRb == null) {
                this.f80v.yk(i, ak1.n3.PROTOCOL_ERROR);
                long j = i5;
                this.f80v.mp(j);
                source.skip(j);
                return;
            }
            c5VarRb.i4(source, i5);
            if (z) {
                c5VarRb.f3(tj1.gv.n3, true);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
            t();
            return Unit.INSTANCE;
        }

        @Override // ak1.s.zn
        public void n3(int i, long j) {
            if (i == 0) {
                a aVar = this.f80v;
                synchronized (aVar) {
                    aVar.o = aVar.g() + j;
                    aVar.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            ak1.c5 c5VarRb = this.f80v.rb(i);
            if (c5VarRb != null) {
                synchronized (c5VarRb) {
                    c5VarRb.y(j);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // ak1.s.zn
        public void s(int i, ak1.n3 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f80v.qj(i)) {
                this.f80v.qk(i, errorCode);
                return;
            }
            ak1.c5 c5VarL = this.f80v.l(i);
            if (c5VarL == null) {
                return;
            }
            c5VarL.n(errorCode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [ak1.n3] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [ak1.s, java.io.Closeable] */
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
        public void t() throws Throwable {
            ak1.n3 n3Var;
            ak1.n3 n3Var2 = ak1.n3.INTERNAL_ERROR;
            IOException e4 = null;
            try {
                try {
                    this.y.t(this);
                    while (this.y.a(false, this)) {
                    }
                    ak1.n3 n3Var3 = ak1.n3.NO_ERROR;
                    try {
                        this.f80v.k(n3Var3, ak1.n3.CANCEL, null);
                        n3Var = n3Var3;
                    } catch (IOException e5) {
                        e4 = e5;
                        ak1.n3 n3Var4 = ak1.n3.PROTOCOL_ERROR;
                        a aVar = this.f80v;
                        aVar.k(n3Var4, n3Var4, e4);
                        n3Var = aVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f80v.k(n3Var, n3Var2, e4);
                    tj1.gv.tl(this.y);
                    throw th;
                }
            } catch (IOException e6) {
                e4 = e6;
            } catch (Throwable th2) {
                th = th2;
                n3Var = n3Var2;
                this.f80v.k(n3Var, n3Var2, e4);
                tj1.gv.tl(this.y);
                throw th;
            }
            n3Var2 = this.y;
            tj1.gv.tl(n3Var2);
        }

        @Override // ak1.s.zn
        public void v(int i, ak1.n3 errorCode, hk1.s debugData) {
            int i5;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.ct();
            a aVar = this.f80v;
            synchronized (aVar) {
                i5 = 0;
                array = aVar.m().values().toArray(new ak1.c5[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                aVar.w = true;
                Unit unit = Unit.INSTANCE;
            }
            ak1.c5[] c5VarArr = (ak1.c5[]) array;
            int length = c5VarArr.length;
            while (i5 < length) {
                ak1.c5 c5Var = c5VarArr[i5];
                i5++;
                if (c5Var.i9() > i && c5Var.z()) {
                    c5Var.n(ak1.n3.REFUSED_STREAM);
                    this.f80v.l(c5Var.i9());
                }
            }
        }

        @Override // ak1.s.zn
        public void y(boolean z, int i, int i5, List<ak1.zn> headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f80v.qj(i)) {
                this.f80v.ad(i, headerBlock, z);
                return;
            }
            a aVar = this.f80v;
            synchronized (aVar) {
                ak1.c5 c5VarRb = aVar.rb(i);
                if (c5VarRb != null) {
                    Unit unit = Unit.INSTANCE;
                    c5VarRb.f3(tj1.gv.qn(headerBlock), z);
                    return;
                }
                if (aVar.w) {
                    return;
                }
                if (i <= aVar.ct()) {
                    return;
                }
                if (i % 2 == aVar.eb() % 2) {
                    return;
                }
                ak1.c5 c5Var = new ak1.c5(i, aVar, false, z, tj1.gv.qn(headerBlock));
                aVar.vp(i);
                aVar.m().put(Integer.valueOf(i), c5Var);
                aVar.f54p.c5().c5(new n3(aVar.u() + '[' + i + "] onStream", true, aVar, c5Var), 0L);
            }
        }

        @Override // ak1.s.zn
        public void zn(boolean z, tl settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f80v.f47co.c5(new C0004gv(Intrinsics.stringPlus(this.f80v.u(), " applyAndAckSettings"), true, this, z, settings), 0L);
        }

        @Override // ak1.s.zn
        public void fb() {
        }

        @Override // ak1.s.zn
        public void i9(int i, int i5, int i8, boolean z) {
        }
    }
}

package ak1;

import hk1.en;
import hk1.jz;
import hk1.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sj1.z;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final y f125xc = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f126a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final zn f127c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gv f128f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ArrayDeque<z> f129fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public long f130gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final n3 f131i9;
    public final a n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gv f133t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public ak1.n3 f134tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f135v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public IOException f136wz;
    public final int y;
    public long zn;

    public final class gv extends hk1.zn {
        public final /* synthetic */ c5 w;

        public gv(c5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.w = this$0;
        }

        public final void mg() throws IOException {
            if (f3()) {
                throw n(null);
            }
        }

        public IOException n(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void rz() {
            this.w.a(ak1.n3.CANCEL);
            this.w.fb().gq();
        }
    }

    public final class n3 implements k {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c5 f137f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public z f138fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f139s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final hk1.v f140v;
        public boolean y;

        public n3(c5 this$0, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f137f = this$0;
            this.y = z;
            this.f140v = new hk1.v();
        }

        public final boolean a() {
            return this.f139s;
        }

        public void close() throws IOException {
            c5 c5Var = this.f137f;
            if (tj1.gv.f8214s && Thread.holdsLock(c5Var)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c5Var);
            }
            c5 c5Var2 = this.f137f;
            synchronized (c5Var2) {
                if (a()) {
                    return;
                }
                boolean z = c5Var2.s() == null;
                Unit unit = Unit.INSTANCE;
                if (!this.f137f.xc().y) {
                    boolean z5 = this.f140v.lc() > 0;
                    if (this.f138fb != null) {
                        while (this.f140v.lc() > 0) {
                            y(false);
                        }
                        a aVarFb = this.f137f.fb();
                        int iI9 = this.f137f.i9();
                        z zVar = this.f138fb;
                        Intrinsics.checkNotNull(zVar);
                        aVarFb.cs(iI9, z, tj1.gv.j5(zVar));
                    } else if (z5) {
                        while (this.f140v.lc() > 0) {
                            y(true);
                        }
                    } else if (z) {
                        this.f137f.fb().le(this.f137f.i9(), true, null, 0L);
                    }
                }
                synchronized (this.f137f) {
                    w(true);
                    Unit unit2 = Unit.INSTANCE;
                }
                this.f137f.fb().flush();
                this.f137f.n3();
            }
        }

        public void flush() throws IOException {
            c5 c5Var = this.f137f;
            if (tj1.gv.f8214s && Thread.holdsLock(c5Var)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c5Var);
            }
            c5 c5Var2 = this.f137f;
            synchronized (c5Var2) {
                c5Var2.zn();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f140v.lc() > 0) {
                y(false);
                this.f137f.fb().flush();
            }
        }

        public final boolean t() {
            return this.y;
        }

        public jz timeout() {
            return this.f137f.co();
        }

        public final void w(boolean z) {
            this.f139s = z;
        }

        public void write(hk1.v source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            c5 c5Var = this.f137f;
            if (!tj1.gv.f8214s || !Thread.holdsLock(c5Var)) {
                this.f140v.write(source, j);
                while (this.f140v.lc() >= 16384) {
                    y(false);
                }
            } else {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c5Var);
            }
        }

        public final void y(boolean z) throws IOException {
            long jMin;
            boolean z5;
            c5 c5Var = this.f137f;
            synchronized (c5Var) {
                try {
                    c5Var.co().i4();
                    while (c5Var.mt() >= c5Var.p() && !t() && !a() && c5Var.s() == null) {
                        try {
                            c5Var.d();
                        } finally {
                            c5Var.co().mg();
                        }
                    }
                    c5Var.co().mg();
                    c5Var.zn();
                    jMin = Math.min(c5Var.p() - c5Var.mt(), this.f140v.lc());
                    c5Var.mg(c5Var.mt() + jMin);
                    z5 = z && jMin == this.f140v.lc();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f137f.co().i4();
            try {
                this.f137f.fb().le(this.f137f.i9(), z5, this.f140v, jMin);
            } finally {
                c5Var = this.f137f;
            }
        }
    }

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public final class zn implements en {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public z f141f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final hk1.v f142fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final hk1.v f143s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f144t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f145v;
        public final /* synthetic */ c5 w;
        public final long y;

        public zn(c5 this$0, long j, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.w = this$0;
            this.y = j;
            this.f145v = z;
            this.f142fb = new hk1.v();
            this.f143s = new hk1.v();
        }

        public final boolean a() {
            return this.f145v;
        }

        public void close() throws IOException {
            long jLc;
            c5 c5Var = this.w;
            synchronized (c5Var) {
                co(true);
                jLc = t().lc();
                t().t();
                c5Var.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (jLc > 0) {
                n(jLc);
            }
            this.w.n3();
        }

        public final void co(boolean z) {
            this.f144t = z;
        }

        public final void f3(z zVar) {
            this.f141f = zVar;
        }

        public final void n(long j) {
            c5 c5Var = this.w;
            if (!tj1.gv.f8214s || !Thread.holdsLock(c5Var)) {
                this.w.fb().mp(j);
                return;
            }
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c5Var);
        }

        public final void p(hk1.fb source, long j) throws IOException {
            boolean zA;
            boolean z;
            long jLc;
            Intrinsics.checkNotNullParameter(source, "source");
            c5 c5Var = this.w;
            if (tj1.gv.f8214s && Thread.holdsLock(c5Var)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + c5Var);
            }
            while (j > 0) {
                synchronized (this.w) {
                    zA = a();
                    z = t().lc() + j > this.y;
                    Unit unit = Unit.INSTANCE;
                }
                if (z) {
                    source.skip(j);
                    this.w.a(ak1.n3.FLOW_CONTROL_ERROR);
                    return;
                }
                if (zA) {
                    source.skip(j);
                    return;
                }
                long j4 = source.read(this.f142fb, j);
                if (j4 == -1) {
                    throw new EOFException();
                }
                j -= j4;
                c5 c5Var2 = this.w;
                synchronized (c5Var2) {
                    try {
                        if (y()) {
                            jLc = w().lc();
                            w().t();
                        } else {
                            boolean z5 = t().lc() == 0;
                            t().b(w());
                            if (z5) {
                                c5Var2.notifyAll();
                            }
                            jLc = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (jLc > 0) {
                    n(jLc);
                }
            }
        }

        public final void r(boolean z) {
            this.f145v = z;
        }

        public long read(hk1.v sink, long j) throws IOException {
            IOException iOExceptionC5;
            boolean z;
            long j4;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j7 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            while (true) {
                c5 c5Var = this.w;
                synchronized (c5Var) {
                    c5Var.tl().i4();
                    try {
                        if (c5Var.s() != null) {
                            iOExceptionC5 = c5Var.c5();
                            if (iOExceptionC5 == null) {
                                ak1.n3 n3VarS = c5Var.s();
                                Intrinsics.checkNotNull(n3VarS);
                                iOExceptionC5 = new wz(n3VarS);
                            }
                        } else {
                            iOExceptionC5 = null;
                        }
                        if (y()) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (t().lc() > j7) {
                            j4 = t().read(sink, Math.min(j, t().lc()));
                            c5Var.rz(c5Var.t() + j4);
                            long jT = c5Var.t() - c5Var.f();
                            if (iOExceptionC5 == null && jT >= c5Var.fb().lc().zn() / 2) {
                                c5Var.fb().i2(c5Var.i9(), jT);
                                c5Var.fh(c5Var.t());
                            }
                        } else {
                            if (!a() && iOExceptionC5 == null) {
                                c5Var.d();
                                z = true;
                            }
                            j4 = -1;
                        }
                        c5Var.tl().mg();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        c5Var.tl().mg();
                        throw th;
                    }
                }
                if (!z) {
                    if (j4 != -1) {
                        n(j4);
                        return j4;
                    }
                    if (iOExceptionC5 == null) {
                        return -1L;
                    }
                    throw iOExceptionC5;
                }
                j7 = 0;
            }
        }

        public final hk1.v t() {
            return this.f143s;
        }

        public jz timeout() {
            return this.w.tl();
        }

        public final hk1.v w() {
            return this.f142fb;
        }

        public final boolean y() {
            return this.f144t;
        }
    }

    public c5(int i, a connection, boolean z, boolean z5, z zVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.y = i;
        this.n3 = connection;
        this.f126a = connection.ap().zn();
        ArrayDeque<z> arrayDeque = new ArrayDeque<>();
        this.f129fb = arrayDeque;
        this.f127c5 = new zn(this, connection.lc().zn(), z5);
        this.f131i9 = new n3(this, z);
        this.f128f = new gv(this);
        this.f133t = new gv(this);
        if (zVar == null) {
            if (!z()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (z()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(zVar);
        }
    }

    public final void a(ak1.n3 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (v(errorCode, null)) {
            this.n3.yk(this.y, errorCode);
        }
    }

    public final void c(ak1.n3 n3Var) {
        this.f134tl = n3Var;
    }

    public final IOException c5() {
        return this.f136wz;
    }

    public final gv co() {
        return this.f133t;
    }

    public final void d() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void d0(IOException iOException) {
        this.f136wz = iOException;
    }

    public final long f() {
        return this.f130gv;
    }

    public final void f3(z headers, boolean z) {
        boolean zR;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f132s && z) {
                    w().f3(headers);
                } else {
                    this.f132s = true;
                    this.f129fb.add(headers);
                }
                if (z) {
                    w().r(true);
                }
                zR = r();
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zR) {
            return;
        }
        this.n3.l(this.y);
    }

    public final a fb() {
        return this.n3;
    }

    public final void fh(long j) {
        this.f130gv = j;
    }

    public final void gv(ak1.n3 rstStatusCode, IOException iOException) throws IOException {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (v(rstStatusCode, iOException)) {
            this.n3.ix(this.y, rstStatusCode);
        }
    }

    public final void i4(hk1.fb source, int i) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!tj1.gv.f8214s || !Thread.holdsLock(this)) {
            this.f127c5.p(source, i);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
    }

    public final int i9() {
        return this.y;
    }

    public final void mg(long j) {
        this.f135v = j;
    }

    public final long mt() {
        return this.f135v;
    }

    public final synchronized void n(ak1.n3 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f134tl == null) {
            this.f134tl = errorCode;
            notifyAll();
        }
    }

    public final void n3() throws IOException {
        boolean z;
        boolean zR;
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z = !w().a() && w().y() && (xc().t() || xc().a());
                zR = r();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            gv(ak1.n3.CANCEL, null);
        } else {
            if (zR) {
                return;
            }
            this.n3.l(this.y);
        }
    }

    public final long p() {
        return this.f126a;
    }

    public final synchronized boolean r() {
        try {
            if (this.f134tl != null) {
                return false;
            }
            if (this.f127c5.a() || this.f127c5.y()) {
                if (this.f131i9.t() || this.f131i9.a()) {
                    if (this.f132s) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void rz(long j) {
        this.zn = j;
    }

    public final synchronized ak1.n3 s() {
        return this.f134tl;
    }

    public final long t() {
        return this.zn;
    }

    public final synchronized z ta() throws IOException {
        z zVarRemoveFirst;
        this.f128f.i4();
        while (this.f129fb.isEmpty() && this.f134tl == null) {
            try {
                d();
            } catch (Throwable th) {
                this.f128f.mg();
                throw th;
            }
        }
        this.f128f.mg();
        if (this.f129fb.isEmpty()) {
            IOException iOException = this.f136wz;
            if (iOException != null) {
                throw iOException;
            }
            ak1.n3 n3Var = this.f134tl;
            Intrinsics.checkNotNull(n3Var);
            throw new wz(n3Var);
        }
        zVarRemoveFirst = this.f129fb.removeFirst();
        Intrinsics.checkNotNullExpressionValue(zVarRemoveFirst, "headersQueue.removeFirst()");
        return zVarRemoveFirst;
    }

    public final gv tl() {
        return this.f128f;
    }

    public final boolean v(ak1.n3 n3Var, IOException iOException) {
        if (tj1.gv.f8214s && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (s() != null) {
                return false;
            }
            if (w().a() && xc().t()) {
                return false;
            }
            c(n3Var);
            d0(iOException);
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.n3.l(this.y);
            return true;
        }
    }

    public final zn w() {
        return this.f127c5;
    }

    public final k wz() {
        synchronized (this) {
            try {
                if (!this.f132s && !z()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f131i9;
    }

    public final jz x4() {
        return this.f128f;
    }

    public final n3 xc() {
        return this.f131i9;
    }

    public final void y(long j) {
        this.f126a += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final boolean z() {
        return this.n3.jz() == ((this.y & 1) == 1);
    }

    public final jz z6() {
        return this.f133t;
    }

    public final void zn() throws IOException {
        if (this.f131i9.a()) {
            throw new IOException("stream closed");
        }
        if (this.f131i9.t()) {
            throw new IOException("stream finished");
        }
        if (this.f134tl != null) {
            IOException iOException = this.f136wz;
            if (iOException != null) {
                throw iOException;
            }
            ak1.n3 n3Var = this.f134tl;
            Intrinsics.checkNotNull(n3Var);
            throw new wz(n3Var);
        }
    }
}

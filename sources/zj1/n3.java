package zj1;

import com.google.protobuf.Reader;
import hk1.en;
import hk1.jz;
import hk1.k;
import hk1.xc;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import sj1.d0;
import sj1.n;
import sj1.r;
import sj1.rz;
import sj1.wz;
import sj1.z;
import yj1.c5;
import yj1.f;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements yj1.gv {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final gv f9455s = new gv(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zj1.y f9456a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public z f9457fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final hk1.a f9458gv;
    public final xj1.a n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9459v;
    public final n y;
    public final hk1.fb zn;

    public final class a implements k {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ n3 f9460fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9461v;
        public final xc y;

        public a(n3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f9460fb = this$0;
            this.y = new xc(this$0.f9458gv.timeout());
        }

        public void close() {
            if (this.f9461v) {
                return;
            }
            this.f9461v = true;
            this.f9460fb.mt(this.y);
            this.f9460fb.f9459v = 3;
        }

        public void flush() {
            if (this.f9461v) {
                return;
            }
            this.f9460fb.f9458gv.flush();
        }

        public jz timeout() {
            return this.y;
        }

        public void write(hk1.v source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9461v) {
                throw new IllegalStateException("closed");
            }
            tj1.gv.t(source.lc(), 0L, j);
            this.f9460fb.f9458gv.write(source, j);
        }
    }

    public final class fb extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n3 f9462f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9463s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fb(n3 this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f9462f = this$0;
        }

        public void close() {
            if (y()) {
                return;
            }
            if (!this.f9463s) {
                a();
            }
            t(true);
        }

        @Override // zj1.n3.y
        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            if (this.f9463s) {
                return -1L;
            }
            long j4 = super.read(sink, j);
            if (j4 != -1) {
                return j4;
            }
            this.f9463s = true;
            a();
            return -1L;
        }
    }

    public static final class gv {
        public /* synthetic */ gv(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public gv() {
        }
    }

    /* JADX INFO: renamed from: zj1.n3$n3, reason: collision with other inner class name */
    public final class C0202n3 implements k {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ n3 f9464fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9465v;
        public final xc y;

        public C0202n3(n3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f9464fb = this$0;
            this.y = new xc(this$0.f9458gv.timeout());
        }

        public synchronized void close() {
            if (this.f9465v) {
                return;
            }
            this.f9465v = true;
            this.f9464fb.f9458gv.z("0\r\n\r\n");
            this.f9464fb.mt(this.y);
            this.f9464fb.f9459v = 3;
        }

        public synchronized void flush() {
            if (this.f9465v) {
                return;
            }
            this.f9464fb.f9458gv.flush();
        }

        public jz timeout() {
            return this.y;
        }

        public void write(hk1.v source, long j) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9465v) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            this.f9464fb.f9458gv.e(j);
            this.f9464fb.f9458gv.z("\r\n");
            this.f9464fb.f9458gv.write(source, j);
            this.f9464fb.f9458gv.z("\r\n");
        }
    }

    public final class v extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n3 f9466f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f9467s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(n3 this$0, long j) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f9466f = this$0;
            this.f9467s = j;
            if (j == 0) {
                a();
            }
        }

        public void close() {
            if (y()) {
                return;
            }
            if (this.f9467s != 0 && !tj1.gv.co(this, 100, TimeUnit.MILLISECONDS)) {
                this.f9466f.gv().d0();
                a();
            }
            t(true);
        }

        @Override // zj1.n3.y
        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.f9467s;
            if (j4 == 0) {
                return -1L;
            }
            long j7 = super.read(sink, Math.min(j4, j));
            if (j7 == -1) {
                this.f9466f.gv().d0();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            long j8 = this.f9467s - j7;
            this.f9467s = j8;
            if (j8 == 0) {
                a();
            }
            return j7;
        }
    }

    public abstract class y implements en {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ n3 f9468fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9469v;
        public final xc y;

        public y(n3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f9468fb = this$0;
            this.y = new xc(this$0.zn.timeout());
        }

        public final void a() {
            if (this.f9468fb.f9459v == 6) {
                return;
            }
            if (this.f9468fb.f9459v != 5) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(this.f9468fb.f9459v)));
            }
            this.f9468fb.mt(this.y);
            this.f9468fb.f9459v = 6;
        }

        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return this.f9468fb.zn.read(sink, j);
            } catch (IOException e4) {
                this.f9468fb.gv().d0();
                a();
                throw e4;
            }
        }

        public final void t(boolean z) {
            this.f9469v = z;
        }

        public jz timeout() {
            return this.y;
        }

        public final boolean y() {
            return this.f9469v;
        }
    }

    public final class zn extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f9470f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final r f9471s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f9472t;
        public final /* synthetic */ n3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(n3 this$0, r url) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(url, "url");
            this.w = this$0;
            this.f9471s = url;
            this.f9470f = -1L;
            this.f9472t = true;
        }

        public void close() {
            if (y()) {
                return;
            }
            if (this.f9472t && !tj1.gv.co(this, 100, TimeUnit.MILLISECONDS)) {
                this.w.gv().d0();
                a();
            }
            t(true);
        }

        @Override // zj1.n3.y
        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (y()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f9472t) {
                return -1L;
            }
            long j4 = this.f9470f;
            if (j4 == 0 || j4 == -1) {
                w();
                if (!this.f9472t) {
                    return -1L;
                }
            }
            long j7 = super.read(sink, Math.min(j, this.f9470f));
            if (j7 != -1) {
                this.f9470f -= j7;
                return j7;
            }
            this.w.gv().d0();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }

        public final void w() throws ProtocolException {
            if (this.f9470f != -1) {
                this.w.zn.z6();
            }
            try {
                this.f9470f = this.w.zn.cr();
                String string = StringsKt.trim(this.w.zn.z6()).toString();
                if (this.f9470f < 0 || (string.length() > 0 && !StringsKt.startsWith$default(string, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f9470f + string + '\"');
                }
                if (this.f9470f == 0) {
                    this.f9472t = false;
                    n3 n3Var = this.w;
                    n3Var.f9457fb = n3Var.f9456a.y();
                    n nVar = this.w.y;
                    Intrinsics.checkNotNull(nVar);
                    wz wzVarXc = nVar.xc();
                    r rVar = this.f9471s;
                    z zVar = this.w.f9457fb;
                    Intrinsics.checkNotNull(zVar);
                    yj1.v.fb(wzVarXc, rVar, zVar);
                    a();
                }
            } catch (NumberFormatException e4) {
                throw new ProtocolException(e4.getMessage());
            }
        }
    }

    public n3(n nVar, xj1.a connection, hk1.fb source, hk1.a sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.y = nVar;
        this.n3 = connection;
        this.zn = source;
        this.f9458gv = sink;
        this.f9456a = new zj1.y(source);
    }

    @Override // yj1.gv
    public rz.y a(boolean z) {
        int i = this.f9459v;
        if (i != 1 && i != 3) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        try {
            f fVarY = f.f9321gv.y(this.f9456a.n3());
            rz.y yVarT = new rz.y().p(fVarY.y).fb(fVarY.n3).wz(fVarY.zn).t(this.f9456a.y());
            if (z && fVarY.n3 == 100) {
                return null;
            }
            if (fVarY.n3 == 100) {
                this.f9459v = 3;
                return yVarT;
            }
            this.f9459v = 4;
            return yVarT;
        } catch (EOFException e4) {
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", gv().n3().y().t().z()), e4);
        }
    }

    public final void c(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jX4 = tj1.gv.x4(response);
        if (jX4 == -1) {
            return;
        }
        en enVarI4 = i4(jX4);
        tj1.gv.yt(enVarI4, Reader.READ_DONE, TimeUnit.MILLISECONDS);
        enVarI4.close();
    }

    @Override // yj1.gv
    public void cancel() {
        gv().fb();
    }

    public final boolean co(d0 d0Var) {
        return StringsKt.equals("chunked", d0Var.gv("Transfer-Encoding"), true);
    }

    public final void d0(z headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i = this.f9459v;
        if (i != 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9458gv.z(requestLine).z("\r\n");
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f9458gv.z(headers.zn(i5)).z(": ").z(headers.s(i5)).z("\r\n");
        }
        this.f9458gv.z("\r\n");
        this.f9459v = 1;
    }

    public final k f3() {
        int i = this.f9459v;
        if (i != 1) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9459v = 2;
        return new a(this);
    }

    @Override // yj1.gv
    public void fb() {
        this.f9458gv.flush();
    }

    @Override // yj1.gv
    public xj1.a gv() {
        return this.n3;
    }

    public final en i4(long j) {
        int i = this.f9459v;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9459v = 5;
        return new v(this, j);
    }

    public final void mt(xc xcVar) {
        jz jzVarI9 = xcVar.i9();
        xcVar.f(jz.a);
        jzVarI9.n3();
        jzVarI9.zn();
    }

    public final en n() {
        int i = this.f9459v;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9459v = 5;
        gv().d0();
        return new fb(this);
    }

    @Override // yj1.gv
    public k n3(d0 request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.y() != null && request.y().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (co(request)) {
            return r();
        }
        if (j != -1) {
            return f3();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final k r() {
        int i = this.f9459v;
        if (i != 1) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9459v = 2;
        return new C0202n3(this);
    }

    @Override // yj1.gv
    public en s(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!yj1.v.zn(response)) {
            return i4(0L);
        }
        if (z(response)) {
            return x4(response.f7().t());
        }
        long jX4 = tj1.gv.x4(response);
        return jX4 != -1 ? i4(jX4) : n();
    }

    @Override // yj1.gv
    public long v(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!yj1.v.zn(response)) {
            return 0L;
        }
        if (z(response)) {
            return -1L;
        }
        return tj1.gv.x4(response);
    }

    public final en x4(r rVar) {
        int i = this.f9459v;
        if (i != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i)).toString());
        }
        this.f9459v = 5;
        return new zn(this, rVar);
    }

    @Override // yj1.gv
    public void y() {
        this.f9458gv.flush();
    }

    public final boolean z(rz rzVar) {
        return StringsKt.equals("chunked", rz.c(rzVar, "Transfer-Encoding", null, 2, null), true);
    }

    @Override // yj1.gv
    public void zn(d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c5 c5Var = c5.y;
        Proxy.Type type = gv().n3().n3().type();
        Intrinsics.checkNotNullExpressionValue(type, "connection.route().proxy.type()");
        d0(request.a(), c5Var.y(request, type));
    }
}

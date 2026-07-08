package xj1;

import hk1.en;
import hk1.k;
import hk1.tl;
import hk1.wz;
import hk1.x;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import sj1.d0;
import sj1.fh;
import sj1.mg;
import sj1.p;
import sj1.rz;

/* JADX INFO: loaded from: classes.dex */
public final class zn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9220a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final yj1.gv f9221gv;
    public final p n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9222v;
    public final v y;
    public final gv zn;

    public final class n3 extends wz {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9223f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public boolean f9224fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9225s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ zn f9226t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f9227v;
        public final long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(zn this$0, en delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f9226t = this$0;
            this.y = j;
            this.f9224fb = true;
            if (j == 0) {
                y(null);
            }
        }

        public void close() throws IOException {
            if (this.f9223f) {
                return;
            }
            this.f9223f = true;
            try {
                super.close();
                y(null);
            } catch (IOException e4) {
                throw y(e4);
            }
        }

        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (this.f9223f) {
                throw new IllegalStateException("closed");
            }
            try {
                long j4 = delegate().read(sink, j);
                if (this.f9224fb) {
                    this.f9224fb = false;
                    this.f9226t.c5().i4(this.f9226t.fb());
                }
                if (j4 == -1) {
                    y(null);
                    return -1L;
                }
                long j7 = this.f9227v + j4;
                long j8 = this.y;
                if (j8 != -1 && j7 > j8) {
                    throw new ProtocolException("expected " + this.y + " bytes but received " + j7);
                }
                this.f9227v = j7;
                if (j7 == j8) {
                    y(null);
                }
                return j4;
            } catch (IOException e4) {
                throw y(e4);
            }
        }

        public final <E extends IOException> E y(E e4) {
            if (this.f9225s) {
                return e4;
            }
            this.f9225s = true;
            if (e4 == null && this.f9224fb) {
                this.f9224fb = false;
                this.f9226t.c5().i4(this.f9226t.fb());
            }
            return (E) this.f9226t.y(this.f9227v, true, false, e4);
        }
    }

    public final class y extends tl {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ zn f9228f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public long f9229fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f9230s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9231v;
        public final long y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(zn this$0, k delegate, long j) {
            super(delegate);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f9228f = this$0;
            this.y = j;
        }

        private final <E extends IOException> E y(E e4) {
            if (this.f9231v) {
                return e4;
            }
            this.f9231v = true;
            return (E) this.f9228f.y(this.f9229fb, false, true, e4);
        }

        public void close() throws IOException {
            if (this.f9230s) {
                return;
            }
            this.f9230s = true;
            long j = this.y;
            if (j != -1 && this.f9229fb != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                y(null);
            } catch (IOException e4) {
                throw y(e4);
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e4) {
                throw y(e4);
            }
        }

        public void write(hk1.v source, long j) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f9230s) {
                throw new IllegalStateException("closed");
            }
            long j4 = this.y;
            if (j4 == -1 || this.f9229fb + j <= j4) {
                try {
                    super.write(source, j);
                    this.f9229fb += j;
                    return;
                } catch (IOException e4) {
                    throw y(e4);
                }
            }
            throw new ProtocolException("expected " + this.y + " bytes but received " + (this.f9229fb + j));
        }
    }

    public zn(v call, p eventListener, gv finder, yj1.gv codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.y = call;
        this.n3 = eventListener;
        this.zn = finder;
        this.f9221gv = codec;
        this.f9220a = codec.gv();
    }

    public final void a() throws IOException {
        try {
            this.f9221gv.fb();
        } catch (IOException e4) {
            this.n3.co(this.y, e4);
            co(e4);
            throw e4;
        }
    }

    public final p c5() {
        return this.n3;
    }

    public final void co(IOException iOException) {
        this.zn.s(iOException);
        this.f9221gv.gv().ej(this.y, iOException);
    }

    public final boolean f() {
        return !Intrinsics.areEqual(this.zn.gv().t().f(), this.f9220a.n3().y().t().f());
    }

    public final v fb() {
        return this.y;
    }

    public final void gv() {
        this.f9221gv.cancel();
        this.y.z(this, true, true, null);
    }

    public final gv i9() {
        return this.zn;
    }

    public final void mt() {
        this.n3.c(this.y);
    }

    public final void n3() {
        this.f9221gv.cancel();
    }

    public final void p(rz response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.n3.n(this.y, response);
    }

    public final a s() {
        return this.f9220a;
    }

    public final boolean t() {
        return this.f9222v;
    }

    public final void tl() {
        this.f9221gv.gv().d0();
    }

    public final void v() throws IOException {
        try {
            this.f9221gv.y();
        } catch (IOException e4) {
            this.n3.co(this.y, e4);
            co(e4);
            throw e4;
        }
    }

    public final rz.y w(boolean z) throws IOException {
        try {
            rz.y yVarA = this.f9221gv.a(z);
            if (yVarA != null) {
                yVarA.tl(this);
            }
            return yVarA;
        } catch (IOException e4) {
            this.n3.f3(this.y, e4);
            co(e4);
            throw e4;
        }
    }

    public final void wz() {
        this.y.z(this, true, false, null);
    }

    public final mg xc(rz response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strC = rz.c(response, "Content-Type", null, 2, null);
            long jV = this.f9221gv.v(response);
            return new yj1.s(strC, jV, x.gv(new n3(this, this.f9221gv.s(response), jV)));
        } catch (IOException e4) {
            this.n3.f3(this.y, e4);
            co(e4);
            throw e4;
        }
    }

    public final <E extends IOException> E y(long j, boolean z, boolean z5, E e4) {
        if (e4 != null) {
            co(e4);
        }
        if (z5) {
            if (e4 != null) {
                this.n3.co(this.y, e4);
            } else {
                this.n3.p(this.y, j);
            }
        }
        if (z) {
            if (e4 != null) {
                this.n3.f3(this.y, e4);
            } else {
                this.n3.x4(this.y, j);
            }
        }
        return (E) this.y.z(this, z5, z, e4);
    }

    public final void z(d0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            this.n3.r(this.y);
            this.f9221gv.zn(request);
            this.n3.z(this.y, request);
        } catch (IOException e4) {
            this.n3.co(this.y, e4);
            co(e4);
            throw e4;
        }
    }

    public final k zn(d0 request, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f9222v = z;
        fh fhVarY = request.y();
        Intrinsics.checkNotNull(fhVarY);
        long jContentLength = fhVarY.contentLength();
        this.n3.mt(this.y);
        return new y(this, this.f9221gv.n3(request, jContentLength), jContentLength);
    }
}

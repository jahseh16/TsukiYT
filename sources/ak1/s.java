package ak1;

import ak1.gv;
import com.google.protobuf.Reader;
import hk1.en;
import hk1.jz;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f179f = new y(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Logger f180t;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final n3 f181fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gv.y f182s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f183v;
    public final hk1.fb y;

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int n3(int i, int i5, int i8) throws IOException {
            if ((i5 & 8) != 0) {
                i--;
            }
            if (i8 <= i) {
                return i - i8;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i8 + " > remaining length " + i);
        }

        public final Logger y() {
            return s.f180t;
        }

        public y() {
        }
    }

    public interface zn {
        void a(int i, int i5, List<ak1.zn> list) throws IOException;

        void c5(boolean z, int i, int i5);

        void fb();

        void gv(boolean z, int i, hk1.fb fbVar, int i5) throws IOException;

        void i9(int i, int i5, int i8, boolean z);

        void n3(int i, long j);

        void s(int i, ak1.n3 n3Var);

        void v(int i, ak1.n3 n3Var, hk1.s sVar);

        void y(boolean z, int i, int i5, List<ak1.zn> list);

        void zn(boolean z, tl tlVar);
    }

    static {
        Logger logger = Logger.getLogger(v.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f180t = logger;
    }

    public s(hk1.fb source, boolean z) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.y = source;
        this.f183v = z;
        n3 n3Var = new n3(source);
        this.f181fb = n3Var;
        this.f182s = new gv.y(n3Var, 4096, 0, 4, null);
    }

    public final boolean a(boolean z, zn handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            this.y.qn(9L);
            int iB = tj1.gv.b(this.y);
            if (iB > 16384) {
                throw new IOException(Intrinsics.stringPlus("FRAME_SIZE_ERROR: ", Integer.valueOf(iB)));
            }
            int iGv = tj1.gv.gv(this.y.readByte(), 255);
            int iGv2 = tj1.gv.gv(this.y.readByte(), 255);
            int i = this.y.readInt() & Reader.READ_DONE;
            Logger logger = f180t;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(v.y.zn(true, i, iB, iGv, iGv2));
            }
            if (z && iGv != 4) {
                throw new IOException(Intrinsics.stringPlus("Expected a SETTINGS frame but was ", v.y.n3(iGv)));
            }
            switch (iGv) {
                case 0:
                    w(handler, iB, iGv2, i);
                    return true;
                case 1:
                    r(handler, iB, iGv2, i);
                    return true;
                case 2:
                    c(handler, iB, iGv2, i);
                    return true;
                case 3:
                    mg(handler, iB, iGv2, i);
                    return true;
                case 4:
                    ta(handler, iB, iGv2, i);
                    return true;
                case 5:
                    rz(handler, iB, iGv2, i);
                    return true;
                case 6:
                    f3(handler, iB, iGv2, i);
                    return true;
                case 7:
                    p(handler, iB, iGv2, i);
                    return true;
                case 8:
                    d(handler, iB, iGv2, i);
                    return true;
                default:
                    this.y.skip(iB);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(zn znVar, int i, int i5, int i8) throws IOException {
        if (i == 5) {
            if (i8 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            n(znVar, i8);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.y.close();
    }

    public final List<ak1.zn> co(int i, int i5, int i8, int i10) throws IOException {
        this.f181fb.w(i);
        n3 n3Var = this.f181fb;
        n3Var.p(n3Var.y());
        this.f181fb.co(i5);
        this.f181fb.t(i8);
        this.f181fb.r(i10);
        this.f182s.f();
        return this.f182s.v();
    }

    public final void d(zn znVar, int i, int i5, int i8) throws IOException {
        if (i != 4) {
            throw new IOException(Intrinsics.stringPlus("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
        }
        long jA = tj1.gv.a(this.y.readInt(), 2147483647L);
        if (jA == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        znVar.n3(i8, jA);
    }

    public final void f3(zn znVar, int i, int i5, int i8) throws IOException {
        if (i != 8) {
            throw new IOException(Intrinsics.stringPlus("TYPE_PING length != 8: ", Integer.valueOf(i)));
        }
        if (i8 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        znVar.c5((i5 & 1) != 0, this.y.readInt(), this.y.readInt());
    }

    public final void mg(zn znVar, int i, int i5, int i8) throws IOException {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        }
        if (i8 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.y.readInt();
        ak1.n3 n3VarY = ak1.n3.y.y(i10);
        if (n3VarY == null) {
            throw new IOException(Intrinsics.stringPlus("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(i10)));
        }
        znVar.s(i8, n3VarY);
    }

    public final void n(zn znVar, int i) throws IOException {
        int i5 = this.y.readInt();
        znVar.i9(i, i5 & Reader.READ_DONE, tj1.gv.gv(this.y.readByte(), 255) + 1, (Integer.MIN_VALUE & i5) != 0);
    }

    public final void p(zn znVar, int i, int i5, int i8) throws IOException {
        if (i < 8) {
            throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        }
        if (i8 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.y.readInt();
        int i11 = this.y.readInt();
        int i12 = i - 8;
        ak1.n3 n3VarY = ak1.n3.y.y(i11);
        if (n3VarY == null) {
            throw new IOException(Intrinsics.stringPlus("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(i11)));
        }
        hk1.s sVarQ9 = hk1.s.s;
        if (i12 > 0) {
            sVarQ9 = this.y.q9(i12);
        }
        znVar.v(i10, n3VarY, sVarQ9);
    }

    public final void r(zn znVar, int i, int i5, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i5 & 1) != 0;
        int iGv = (i5 & 8) != 0 ? tj1.gv.gv(this.y.readByte(), 255) : 0;
        if ((i5 & 32) != 0) {
            n(znVar, i8);
            i -= 5;
        }
        znVar.y(z, i8, -1, co(f179f.n3(i, i5, iGv), iGv, i5, i8));
    }

    public final void rz(zn znVar, int i, int i5, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iGv = (i5 & 8) != 0 ? tj1.gv.gv(this.y.readByte(), 255) : 0;
        znVar.a(i8, this.y.readInt() & Reader.READ_DONE, co(f179f.n3(i - 4, i5, iGv), iGv, i5, i8));
    }

    public final void t(zn handler) throws IOException {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f183v) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        hk1.fb fbVar = this.y;
        hk1.s sVar = v.n3;
        hk1.s sVarQ9 = fbVar.q9(sVar.ct());
        Logger logger = f180t;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(tj1.gv.z(Intrinsics.stringPlus("<< CONNECTION ", sVarQ9.f3()), new Object[0]));
        }
        if (!Intrinsics.areEqual(sVar, sVarQ9)) {
            throw new IOException(Intrinsics.stringPlus("Expected a connection header but was ", sVarQ9.yg()));
        }
    }

    public final void ta(zn znVar, int i, int i5, int i8) throws IOException {
        int i10;
        if (i8 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i5 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            znVar.fb();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(Intrinsics.stringPlus("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
        tl tlVar = new tl();
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, i), 6);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int i11 = first + step;
                int iV = tj1.gv.v(this.y.readShort(), 65535);
                i10 = this.y.readInt();
                if (iV != 2) {
                    if (iV == 3) {
                        iV = 4;
                    } else if (iV != 4) {
                        if (iV == 5 && (i10 < 16384 || i10 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iV = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                tlVar.s(iV, i10);
                if (first == last) {
                    break;
                } else {
                    first = i11;
                }
            }
            throw new IOException(Intrinsics.stringPlus("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(i10)));
        }
        znVar.zn(false, tlVar);
    }

    public final void w(zn znVar, int i, int i5, int i8) throws IOException {
        if (i8 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i5 & 1) != 0;
        if ((i5 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iGv = (i5 & 8) != 0 ? tj1.gv.gv(this.y.readByte(), 255) : 0;
        znVar.gv(z, i8, this.y, f179f.n3(i, i5, iGv));
        this.y.skip(iGv);
    }

    public static final class n3 implements en {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f184f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f185fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f186s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f187t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f188v;
        public final hk1.fb y;

        public n3(hk1.fb source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.y = source;
        }

        public final void a() throws IOException {
            int i = this.f186s;
            int iB = tj1.gv.b(this.y);
            this.f184f = iB;
            this.f188v = iB;
            int iGv = tj1.gv.gv(this.y.readByte(), 255);
            this.f185fb = tj1.gv.gv(this.y.readByte(), 255);
            y yVar = s.f179f;
            if (yVar.y().isLoggable(Level.FINE)) {
                yVar.y().fine(v.y.zn(true, this.f186s, this.f188v, iGv, this.f185fb));
            }
            int i5 = this.y.readInt() & Reader.READ_DONE;
            this.f186s = i5;
            if (iGv == 9) {
                if (i5 != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iGv + " != TYPE_CONTINUATION");
            }
        }

        public final void co(int i) {
            this.f187t = i;
        }

        public final void p(int i) {
            this.f188v = i;
        }

        public final void r(int i) {
            this.f186s = i;
        }

        public long read(hk1.v sink, long j) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (true) {
                int i = this.f184f;
                if (i != 0) {
                    long j4 = this.y.read(sink, Math.min(j, i));
                    if (j4 == -1) {
                        return -1L;
                    }
                    this.f184f -= (int) j4;
                    return j4;
                }
                this.y.skip(this.f187t);
                this.f187t = 0;
                if ((this.f185fb & 4) != 0) {
                    return -1L;
                }
                a();
            }
        }

        public final void t(int i) {
            this.f185fb = i;
        }

        public jz timeout() {
            return this.y.timeout();
        }

        public final void w(int i) {
            this.f184f = i;
        }

        public final int y() {
            return this.f184f;
        }

        public void close() throws IOException {
        }
    }
}

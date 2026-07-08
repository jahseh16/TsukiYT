package ak1;

import ak1.gv;
import com.google.protobuf.Reader;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f166f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final hk1.v f167fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gv.n3 f169t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f170v;
    public final hk1.a y;
    public static final y w = new y(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f165p = Logger.getLogger(v.class.getName());

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public y() {
        }
    }

    public i9(hk1.a sink, boolean z) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.y = sink;
        this.f170v = z;
        hk1.v vVar = new hk1.v();
        this.f167fb = vVar;
        this.f168s = 16384;
        this.f169t = new gv.n3(0, false, vVar, 3, null);
    }

    public final synchronized void a() throws IOException {
        try {
            if (this.f166f) {
                throw new IOException("closed");
            }
            if (this.f170v) {
                Logger logger = f165p;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(tj1.gv.z(Intrinsics.stringPlus(">> CONNECTION ", v.n3.f3()), new Object[0]));
                }
                this.y.ud(v.n3);
                this.y.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(int i, int i5, List<zn> requestHeaders) throws IOException {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f166f) {
            throw new IOException("closed");
        }
        this.f169t.fb(requestHeaders);
        long jLc = this.f167fb.lc();
        int iMin = (int) Math.min(((long) this.f168s) - 4, jLc);
        long j = iMin;
        p(i, iMin + 4, 5, jLc == j ? 4 : 0);
        this.y.writeInt(i5 & Reader.READ_DONE);
        this.y.write(this.f167fb, j);
        if (jLc > j) {
            d(i, jLc - j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f166f = true;
        this.y.close();
    }

    public final synchronized void co(int i, n3 errorCode, byte[] debugData) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f166f) {
                throw new IOException("closed");
            }
            if (errorCode.n3() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            p(0, debugData.length + 8, 7, 0);
            this.y.writeInt(i);
            this.y.writeInt(errorCode.n3());
            if (!(debugData.length == 0)) {
                this.y.write(debugData);
            }
            this.y.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d(int i, long j) throws IOException {
        while (j > 0) {
            long jMin = Math.min(this.f168s, j);
            j -= jMin;
            p(i, (int) jMin, 9, j == 0 ? 4 : 0);
            this.y.write(this.f167fb, jMin);
        }
    }

    public final int f3() {
        return this.f168s;
    }

    public final synchronized void flush() throws IOException {
        if (this.f166f) {
            throw new IOException("closed");
        }
        this.y.flush();
    }

    public final synchronized void mg(tl settings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f166f) {
                throw new IOException("closed");
            }
            int i = 0;
            p(0, settings.c5() * 6, 4, 0);
            while (i < 10) {
                int i5 = i + 1;
                if (settings.a(i)) {
                    this.y.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.y.writeInt(settings.y(i));
                }
                i = i5;
            }
            this.y.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n(boolean z, int i, int i5) throws IOException {
        if (this.f166f) {
            throw new IOException("closed");
        }
        p(0, 8, 6, z ? 1 : 0);
        this.y.writeInt(i);
        this.y.writeInt(i5);
        this.y.flush();
    }

    public final void p(int i, int i5, int i8, int i10) throws IOException {
        Logger logger = f165p;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(v.y.zn(false, i, i5, i8, i10));
        }
        if (i5 > this.f168s) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f168s + ": " + i5).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        tj1.gv.u(this.y, i5);
        this.y.writeByte(i8 & 255);
        this.y.writeByte(i10 & 255);
        this.y.writeInt(i & Reader.READ_DONE);
    }

    public final synchronized void r(boolean z, int i, List<zn> headerBlock) throws IOException {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f166f) {
            throw new IOException("closed");
        }
        this.f169t.fb(headerBlock);
        long jLc = this.f167fb.lc();
        long jMin = Math.min(this.f168s, jLc);
        int i5 = jLc == jMin ? 4 : 0;
        if (z) {
            i5 |= 1;
        }
        p(i, (int) jMin, 1, i5);
        this.y.write(this.f167fb, jMin);
        if (jLc > jMin) {
            d(i, jLc - jMin);
        }
    }

    public final synchronized void rz(int i, n3 errorCode) throws IOException {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f166f) {
            throw new IOException("closed");
        }
        if (errorCode.n3() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(i, 4, 3, 0);
        this.y.writeInt(errorCode.n3());
        this.y.flush();
    }

    public final synchronized void t(boolean z, int i, hk1.v vVar, int i5) throws IOException {
        if (this.f166f) {
            throw new IOException("closed");
        }
        w(i, z ? 1 : 0, vVar, i5);
    }

    public final synchronized void ta(int i, long j) throws IOException {
        if (this.f166f) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
        p(i, 4, 8, 0);
        this.y.writeInt((int) j);
        this.y.flush();
    }

    public final void w(int i, int i5, hk1.v vVar, int i8) throws IOException {
        p(i, i8, 0, i5);
        if (i8 > 0) {
            hk1.a aVar = this.y;
            Intrinsics.checkNotNull(vVar);
            aVar.write(vVar, i8);
        }
    }

    public final synchronized void y(tl peerSettings) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f166f) {
                throw new IOException("closed");
            }
            this.f168s = peerSettings.v(this.f168s);
            if (peerSettings.n3() != -1) {
                this.f169t.v(peerSettings.n3());
            }
            p(0, 0, 4, 1);
            this.y.flush();
        } catch (Throwable th) {
            throw th;
        }
    }
}

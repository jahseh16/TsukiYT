package i7;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final ArrayDeque<n3> f5513fb = new ArrayDeque<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f5514s = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5515a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f5516gv;
    public final HandlerThread n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v0.s f5517v;
    public final MediaCodec y;
    public Handler zn;

    public static class n3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5518a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f5519gv = new MediaCodec.CryptoInfo();
        public int n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public long f5520v;
        public int y;
        public int zn;

        public void y(int i, int i5, int i8, long j, int i10) {
            this.y = i;
            this.n3 = i5;
            this.zn = i8;
            this.f5520v = j;
            this.f5518a = i10;
        }
    }

    public class y extends Handler {
        public y(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            v.this.a(message);
        }
    }

    public v(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new v0.s());
    }

    public static n3 f() {
        ArrayDeque<n3> arrayDeque = f5513fb;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new n3();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static byte[] gv(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    @Nullable
    public static int[] v(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static void xc(n3 n3Var) {
        ArrayDeque<n3> arrayDeque = f5513fb;
        synchronized (arrayDeque) {
            arrayDeque.add(n3Var);
        }
    }

    public static void zn(di.zn znVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = znVar.f3205a;
        cryptoInfo.numBytesOfClearData = v(znVar.f3208gv, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = v(znVar.f3211v, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) v0.y.v(gv(znVar.n3, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) v0.y.v(gv(znVar.y, cryptoInfo.iv));
        cryptoInfo.mode = znVar.zn;
        if (ut.y >= 24) {
            ob.a.y();
            vh.n3.y(cryptoInfo, vh.zn.y(znVar.f3207fb, znVar.f3210s));
        }
    }

    public final void a(Message message) {
        n3 n3Var;
        int i = message.what;
        if (i == 0) {
            n3Var = (n3) message.obj;
            fb(n3Var.y, n3Var.n3, n3Var.zn, n3Var.f5520v, n3Var.f5518a);
        } else if (i != 1) {
            n3Var = null;
            if (i != 2) {
                ap.w.y(this.f5516gv, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f5517v.a();
            }
        } else {
            n3Var = (n3) message.obj;
            s(n3Var.y, n3Var.n3, n3Var.f5519gv, n3Var.f5520v, n3Var.f5518a);
        }
        if (n3Var != null) {
            xc(n3Var);
        }
    }

    public void c5() {
        if (this.f5515a) {
            try {
                i9();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    public final void fb(int i, int i5, int i8, long j, int i10) {
        try {
            this.y.queueInputBuffer(i, i5, i8, j, i10);
        } catch (RuntimeException e4) {
            ap.w.y(this.f5516gv, null, e4);
        }
    }

    public final void i9() throws InterruptedException {
        ((Handler) v0.y.v(this.zn)).removeCallbacksAndMessages(null);
        n3();
    }

    public void mt() throws InterruptedException {
        n3();
    }

    public final void n3() throws InterruptedException {
        this.f5517v.gv();
        ((Handler) v0.y.v(this.zn)).obtainMessage(2).sendToTarget();
        this.f5517v.y();
    }

    public void p() {
        if (this.f5515a) {
            return;
        }
        this.n3.start();
        this.zn = new y(this.n3.getLooper());
        this.f5515a = true;
    }

    public final void s(int i, int i5, MediaCodec.CryptoInfo cryptoInfo, long j, int i8) {
        try {
            synchronized (f5514s) {
                this.y.queueSecureInputBuffer(i, i5, cryptoInfo, j, i8);
            }
        } catch (RuntimeException e4) {
            ap.w.y(this.f5516gv, null, e4);
        }
    }

    public void t() {
        RuntimeException andSet = this.f5516gv.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void tl(int i, int i5, int i8, long j, int i10) {
        t();
        n3 n3VarF = f();
        n3VarF.y(i, i5, i8, j, i10);
        ((Handler) ut.i9(this.zn)).obtainMessage(0, n3VarF).sendToTarget();
    }

    public void w() {
        if (this.f5515a) {
            c5();
            this.n3.quit();
        }
        this.f5515a = false;
    }

    public void wz(int i, int i5, di.zn znVar, long j, int i8) {
        t();
        n3 n3VarF = f();
        n3VarF.y(i, i5, 0, j, i8);
        zn(znVar, n3VarF.f5519gv);
        ((Handler) ut.i9(this.zn)).obtainMessage(1, n3VarF).sendToTarget();
    }

    public v(MediaCodec mediaCodec, HandlerThread handlerThread, v0.s sVar) {
        this.y = mediaCodec;
        this.n3 = handlerThread;
        this.f5517v = sVar;
        this.f5516gv = new AtomicReference<>();
    }
}

package i7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends MediaCodec.Callback {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public MediaFormat f5495c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5496f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public MediaCodec.CodecException f5499i9;
    public final HandlerThread n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public MediaFormat f5500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5501t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public IllegalStateException f5502tl;
    public Handler zn;
    public final Object y = new Object();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final f f5498gv = new f();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f f5503v = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f5494a = new ArrayDeque<>();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f5497fb = new ArrayDeque<>();

    public fb(HandlerThread handlerThread) {
        this.n3 = handlerThread;
    }

    public final void a() {
        if (!this.f5497fb.isEmpty()) {
            this.f5495c5 = this.f5497fb.getLast();
        }
        this.f5498gv.n3();
        this.f5503v.n3();
        this.f5494a.clear();
        this.f5497fb.clear();
    }

    public final boolean c5() {
        return this.f5496f > 0 || this.f5501t;
    }

    public final void f() {
        IllegalStateException illegalStateException = this.f5502tl;
        if (illegalStateException == null) {
            return;
        }
        this.f5502tl = null;
        throw illegalStateException;
    }

    public MediaFormat fb() {
        MediaFormat mediaFormat;
        synchronized (this.y) {
            try {
                mediaFormat = this.f5500s;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public int gv(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.y) {
            try {
                if (c5()) {
                    return -1;
                }
                i9();
                if (this.f5503v.gv()) {
                    return -1;
                }
                int iV = this.f5503v.v();
                if (iV >= 0) {
                    v0.y.c5(this.f5500s);
                    MediaCodec.BufferInfo bufferInfoRemove = this.f5494a.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iV == -2) {
                    this.f5500s = this.f5497fb.remove();
                }
                return iV;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i9() {
        f();
        t();
    }

    public final void n3(MediaFormat mediaFormat) {
        this.f5503v.y(-2);
        this.f5497fb.add(mediaFormat);
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.y) {
            this.f5499i9 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.y) {
            this.f5498gv.y(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.y) {
            try {
                MediaFormat mediaFormat = this.f5495c5;
                if (mediaFormat != null) {
                    n3(mediaFormat);
                    this.f5495c5 = null;
                }
                this.f5503v.y(i);
                this.f5494a.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.y) {
            n3(mediaFormat);
            this.f5495c5 = null;
        }
    }

    public void s(MediaCodec mediaCodec) {
        v0.y.fb(this.zn == null);
        this.n3.start();
        Handler handler = new Handler(this.n3.getLooper());
        ob.fb.y(mediaCodec, this, handler);
        this.zn = handler;
    }

    public final void t() {
        MediaCodec.CodecException codecException = this.f5499i9;
        if (codecException == null) {
            return;
        }
        this.f5499i9 = null;
        throw codecException;
    }

    public final void tl() {
        synchronized (this.y) {
            try {
                if (this.f5501t) {
                    return;
                }
                long j = this.f5496f - 1;
                this.f5496f = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    wz(new IllegalStateException());
                } else {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void v() {
        synchronized (this.y) {
            this.f5496f++;
            ((Handler) ut.i9(this.zn)).post(new Runnable() { // from class: i7.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.y.tl();
                }
            });
        }
    }

    public final void wz(IllegalStateException illegalStateException) {
        synchronized (this.y) {
            this.f5502tl = illegalStateException;
        }
    }

    public void xc() {
        synchronized (this.y) {
            this.f5501t = true;
            this.n3.quit();
            a();
        }
    }

    public int zn() {
        synchronized (this.y) {
            try {
                int iV = -1;
                if (c5()) {
                    return -1;
                }
                i9();
                if (!this.f5498gv.gv()) {
                    iV = this.f5498gv.v();
                }
                return iV;
            } finally {
            }
        }
    }
}

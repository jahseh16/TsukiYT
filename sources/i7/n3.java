package i7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import i7.n3;
import i7.t;
import java.nio.ByteBuffer;
import v0.j5;

/* JADX INFO: loaded from: classes.dex */
public final class n3 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5504a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f5505gv;
    public final fb n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5506v;
    public final MediaCodec y;
    public final v zn;

    /* JADX INFO: renamed from: i7.n3$n3, reason: collision with other inner class name */
    public static final class C0103n3 implements t.n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final boolean f5507gv;
        public final g4.r<HandlerThread> n3;
        public final g4.r<HandlerThread> zn;

        public C0103n3(final int i, boolean z) {
            this(new g4.r() { // from class: i7.zn
                @Override // g4.r
                public final Object get() {
                    return n3.C0103n3.v(i);
                }
            }, new g4.r() { // from class: i7.gv
                @Override // g4.r
                public final Object get() {
                    return n3.C0103n3.a(i);
                }
            }, z);
        }

        public static /* synthetic */ HandlerThread a(int i) {
            return new HandlerThread(n3.z(i));
        }

        public static /* synthetic */ HandlerThread v(int i) {
            return new HandlerThread(n3.co(i));
        }

        @Override // i7.t.n3
        /* JADX INFO: renamed from: gv, reason: merged with bridge method [inline-methods] */
        public n3 y(t.y yVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            n3 n3Var;
            String str = yVar.y.y;
            n3 n3Var2 = null;
            try {
                j5.y("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    n3Var = new n3(mediaCodecCreateByCodecName, this.n3.get(), this.zn.get(), this.f5507gv);
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Exception e5) {
                e = e5;
                mediaCodecCreateByCodecName = null;
            }
            try {
                j5.zn();
                n3Var.x4(yVar.n3, yVar.f5511gv, yVar.f5512v, yVar.f5510a);
                return n3Var;
            } catch (Exception e6) {
                e = e6;
                n3Var2 = n3Var;
                if (n3Var2 != null) {
                    n3Var2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }

        public C0103n3(g4.r<HandlerThread> rVar, g4.r<HandlerThread> rVar2, boolean z) {
            this.n3 = rVar;
            this.zn = rVar2;
            this.f5507gv = z;
        }
    }

    public static String co(int i) {
        return r(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String r(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public static String z(int i) {
        return r(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    @Override // i7.t
    public void a(int i, int i5, int i8, long j, int i10) {
        this.zn.tl(i, i5, i8, j, i10);
    }

    @Override // i7.t
    public void c5(Bundle bundle) {
        f3();
        this.y.setParameters(bundle);
    }

    @Override // i7.t
    public int f() {
        this.zn.t();
        return this.n3.zn();
    }

    public final void f3() {
        if (this.f5505gv) {
            try {
                this.zn.mt();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // i7.t
    public void fb(final t.zn znVar, Handler handler) {
        f3();
        ob.n3.y(this.y, new MediaCodec.OnFrameRenderedListener() { // from class: i7.y
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j4) {
                this.y.i4(znVar, mediaCodec, j, j4);
            }
        }, handler);
    }

    @Override // i7.t
    public void flush() {
        this.zn.c5();
        this.y.flush();
        this.n3.v();
        this.y.start();
    }

    @Override // i7.t
    @Nullable
    public ByteBuffer gv(int i) {
        return this.y.getInputBuffer(i);
    }

    public final /* synthetic */ void i4(t.zn znVar, MediaCodec mediaCodec, long j, long j4) {
        znVar.y(this, j, j4);
    }

    @Override // i7.t
    public void i9(int i, long j) {
        this.y.releaseOutputBuffer(i, j);
    }

    @Override // i7.t
    public MediaFormat n3() {
        return this.n3.fb();
    }

    @Override // i7.t
    public void release() {
        try {
            if (this.f5504a == 1) {
                this.zn.w();
                this.n3.xc();
            }
            this.f5504a = 2;
            if (this.f5506v) {
                return;
            }
            this.y.release();
            this.f5506v = true;
        } catch (Throwable th) {
            if (!this.f5506v) {
                this.y.release();
                this.f5506v = true;
            }
            throw th;
        }
    }

    @Override // i7.t
    public boolean s() {
        return false;
    }

    @Override // i7.t
    public int t(MediaCodec.BufferInfo bufferInfo) {
        this.zn.t();
        return this.n3.gv(bufferInfo);
    }

    @Override // i7.t
    public void tl(int i, boolean z) {
        this.y.releaseOutputBuffer(i, z);
    }

    @Override // i7.t
    public void v(Surface surface) {
        f3();
        ob.y.y(this.y, surface);
    }

    @Override // i7.t
    @Nullable
    public ByteBuffer wz(int i) {
        return this.y.getOutputBuffer(i);
    }

    public final void x4(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.n3.s(this.y);
        j5.y("configureCodec");
        this.y.configure(mediaFormat, surface, mediaCrypto, i);
        j5.zn();
        this.zn.p();
        j5.y("startCodec");
        this.y.start();
        j5.zn();
        this.f5504a = 1;
    }

    @Override // i7.t
    public void y(int i, int i5, di.zn znVar, long j, int i8) {
        this.zn.wz(i, i5, znVar, j, i8);
    }

    @Override // i7.t
    public void zn(int i) {
        f3();
        this.y.setVideoScalingMode(i);
    }

    public n3(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.y = mediaCodec;
        this.n3 = new fb(handlerThread);
        this.zn = new v(mediaCodec, handlerThread2);
        this.f5505gv = z;
        this.f5504a = 0;
    }
}

package i7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import i7.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import v0.j5;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class ta implements t {

    @Nullable
    public ByteBuffer[] n3;
    public final MediaCodec y;

    @Nullable
    public ByteBuffer[] zn;

    public static class n3 implements t.n3 {
        public MediaCodec n3(t.y yVar) throws IOException {
            v0.y.v(yVar.y);
            String str = yVar.y.y;
            j5.y("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            j5.zn();
            return mediaCodecCreateByCodecName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [i7.ta$y] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // i7.t.n3
        public t y(t.y yVar) throws Throwable {
            MediaCodec mediaCodecN3;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                mediaCodecN3 = n3(yVar);
            } catch (IOException e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
            try {
                j5.y("configureCodec");
                mediaCodecN3.configure(yVar.n3, yVar.f5511gv, yVar.f5512v, yVar.f5510a);
                j5.zn();
                j5.y("startCodec");
                mediaCodecN3.start();
                j5.zn();
                return new ta(mediaCodecN3);
            } catch (IOException | RuntimeException e6) {
                e = e6;
                mediaCodec = mediaCodecN3;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(t.zn znVar, MediaCodec mediaCodec, long j, long j4) {
        znVar.y(this, j, j4);
    }

    @Override // i7.t
    public void a(int i, int i5, int i8, long j, int i10) {
        this.y.queueInputBuffer(i, i5, i8, j, i10);
    }

    @Override // i7.t
    public void c5(Bundle bundle) {
        this.y.setParameters(bundle);
    }

    @Override // i7.t
    public int f() {
        return this.y.dequeueInputBuffer(0L);
    }

    @Override // i7.t
    public void fb(final t.zn znVar, Handler handler) {
        ob.n3.y(this.y, new MediaCodec.OnFrameRenderedListener() { // from class: i7.mg
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j4) {
                this.y.w(znVar, mediaCodec, j, j4);
            }
        }, handler);
    }

    @Override // i7.t
    public void flush() {
        this.y.flush();
    }

    @Override // i7.t
    @Nullable
    public ByteBuffer gv(int i) {
        return ut.y >= 21 ? this.y.getInputBuffer(i) : ((ByteBuffer[]) ut.i9(this.n3))[i];
    }

    @Override // i7.t
    public void i9(int i, long j) {
        this.y.releaseOutputBuffer(i, j);
    }

    @Override // i7.t
    public MediaFormat n3() {
        return this.y.getOutputFormat();
    }

    @Override // i7.t
    public void release() {
        this.n3 = null;
        this.zn = null;
        this.y.release();
    }

    @Override // i7.t
    public boolean s() {
        return false;
    }

    @Override // i7.t
    public int t(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.y.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && ut.y < 21) {
                this.zn = this.y.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // i7.t
    public void tl(int i, boolean z) {
        this.y.releaseOutputBuffer(i, z);
    }

    @Override // i7.t
    public void v(Surface surface) {
        ob.y.y(this.y, surface);
    }

    @Override // i7.t
    @Nullable
    public ByteBuffer wz(int i) {
        return ut.y >= 21 ? this.y.getOutputBuffer(i) : ((ByteBuffer[]) ut.i9(this.zn))[i];
    }

    @Override // i7.t
    public void y(int i, int i5, di.zn znVar, long j, int i8) {
        this.y.queueSecureInputBuffer(i, i5, znVar.y(), j, i8);
    }

    @Override // i7.t
    public void zn(int i) {
        this.y.setVideoScalingMode(i);
    }

    public ta(MediaCodec mediaCodec) {
        this.y = mediaCodec;
        if (ut.y < 21) {
            this.n3 = mediaCodec.getInputBuffers();
            this.zn = mediaCodec.getOutputBuffers();
        }
    }
}

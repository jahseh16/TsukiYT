package i7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import ft.g;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    public interface n3 {
        public static final n3 y = new i9();

        t y(y yVar) throws IOException;
    }

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5510a;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final Surface f5511gv;
        public final MediaFormat n3;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Nullable
        public final MediaCrypto f5512v;
        public final z y;
        public final g zn;

        public y(z zVar, MediaFormat mediaFormat, g gVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
            this.y = zVar;
            this.n3 = mediaFormat;
            this.zn = gVar;
            this.f5511gv = surface;
            this.f5512v = mediaCrypto;
            this.f5510a = i;
        }

        public static y n3(z zVar, MediaFormat mediaFormat, g gVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new y(zVar, mediaFormat, gVar, surface, mediaCrypto, 0);
        }

        public static y y(z zVar, MediaFormat mediaFormat, g gVar, @Nullable MediaCrypto mediaCrypto) {
            return new y(zVar, mediaFormat, gVar, null, mediaCrypto, 0);
        }
    }

    public interface zn {
        void y(t tVar, long j, long j4);
    }

    void a(int i, int i5, int i8, long j, int i10);

    void c5(Bundle bundle);

    int f();

    void fb(zn znVar, Handler handler);

    void flush();

    @Nullable
    ByteBuffer gv(int i);

    void i9(int i, long j);

    MediaFormat n3();

    void release();

    boolean s();

    int t(MediaCodec.BufferInfo bufferInfo);

    void tl(int i, boolean z);

    void v(Surface surface);

    @Nullable
    ByteBuffer wz(int i);

    void y(int i, int i5, di.zn znVar, long j, int i8);

    void zn(int i);
}

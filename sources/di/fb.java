package di;

import androidx.annotation.Nullable;
import ft.rb;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class fb extends di.y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3178f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public ByteBuffer f3179fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3180p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3181s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ByteBuffer f3182t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final zn f3183v;
    public final int w;

    public static final class y extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public y(int i, int i5) {
            super("Buffer too small (" + i + " < " + i5 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i5;
        }
    }

    static {
        rb.y("goog.exo.decoder");
    }

    public fb(int i) {
        this(i, 0);
    }

    public static fb r() {
        return new fb(0);
    }

    @Override // di.y
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f3179fb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f3182t;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f3181s = false;
    }

    public final void co() {
        ByteBuffer byteBuffer = this.f3179fb;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f3182t;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public void mt(int i) {
        int i5 = i + this.f3180p;
        ByteBuffer byteBuffer = this.f3179fb;
        if (byteBuffer == null) {
            this.f3179fb = p(i5);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i8 = i5 + iPosition;
        if (iCapacity >= i8) {
            this.f3179fb = byteBuffer;
            return;
        }
        ByteBuffer byteBufferP = p(i8);
        byteBufferP.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferP.put(byteBuffer);
        }
        this.f3179fb = byteBufferP;
    }

    public final ByteBuffer p(int i) {
        int i5 = this.w;
        if (i5 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i5 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f3179fb;
        throw new y(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void x4(int i) {
        ByteBuffer byteBuffer = this.f3182t;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f3182t = ByteBuffer.allocate(i);
        } else {
            this.f3182t.clear();
        }
    }

    public final boolean z() {
        return s(1073741824);
    }

    public fb(int i, int i5) {
        this.f3183v = new zn();
        this.w = i;
        this.f3180p = i5;
    }
}

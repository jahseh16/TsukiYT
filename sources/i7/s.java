package i7;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s extends di.fb {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public long f5508co;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5509r;
    public int z;

    public s() {
        super(2);
        this.f5509r = 32;
    }

    @Override // di.fb, di.y
    public void a() {
        super.a();
        this.z = 0;
    }

    public long c() {
        return this.f5508co;
    }

    public int d0() {
        return this.z;
    }

    public final boolean f3(di.fb fbVar) {
        ByteBuffer byteBuffer;
        if (!fh()) {
            return true;
        }
        if (this.z >= this.f5509r || fbVar.i9() != i9()) {
            return false;
        }
        ByteBuffer byteBuffer2 = fbVar.f3179fb;
        return byteBuffer2 == null || (byteBuffer = this.f3179fb) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean fh() {
        return this.z > 0;
    }

    public boolean i4(di.fb fbVar) {
        v0.y.y(!fbVar.z());
        v0.y.y(!fbVar.c5());
        v0.y.y(!fbVar.t());
        if (!f3(fbVar)) {
            return false;
        }
        int i = this.z;
        this.z = i + 1;
        if (i == 0) {
            this.f3178f = fbVar.f3178f;
            if (fbVar.wz()) {
                w(1);
            }
        }
        if (fbVar.i9()) {
            w(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = fbVar.f3179fb;
        if (byteBuffer != null) {
            mt(byteBuffer.remaining());
            this.f3179fb.put(byteBuffer);
        }
        this.f5508co = fbVar.f3178f;
        return true;
    }

    public long n() {
        return this.f3178f;
    }

    public void rz(int i) {
        v0.y.y(i > 0);
        this.f5509r = i;
    }
}

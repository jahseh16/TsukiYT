package z0;

import androidx.annotation.Nullable;
import ft.g;
import ft.k3;
import ft.p;
import java.nio.ByteBuffer;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class n3 extends ft.a {
    public final di.fb c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public y f9394d;
    public final d d0;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public long f9395ej;
    public long fh;

    public n3() {
        super(6);
        this.c = new di.fb(1);
        this.d0 = new d();
    }

    @Override // ft.hk
    public boolean a() {
        return c5();
    }

    @Override // ft.a
    public void b(g[] gVarArr, long j, long j4) {
        this.fh = j4;
    }

    @Override // ft.hk
    public void co(long j, long j4) {
        while (!c5() && this.f9395ej < 100000 + j) {
            this.c.a();
            if (k5(d0(), this.c, 0) != -4 || this.c.t()) {
                return;
            }
            di.fb fbVar = this.c;
            this.f9395ej = fbVar.f3178f;
            if (this.f9394d != null && !fbVar.i9()) {
                this.c.co();
                float[] fArrHw = hw((ByteBuffer) ut.i9(this.c.f3179fb));
                if (fArrHw != null) {
                    ((y) ut.i9(this.f9394d)).zn(this.f9395ej - this.fh, fArrHw);
                }
            }
        }
    }

    @Override // ft.a
    public void d() {
        j5();
    }

    @Override // ft.a
    public void ej(long j, boolean z) {
        this.f9395ej = Long.MIN_VALUE;
        j5();
    }

    @Override // ft.a, ft.h.n3
    public void f(int i, @Nullable Object obj) throws p {
        if (i == 8) {
            this.f9394d = (y) obj;
        } else {
            super.f(i, obj);
        }
    }

    @Override // ft.hk, ft.ic
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Nullable
    public final float[] hw(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.d0.o(byteBuffer.array(), byteBuffer.limit());
        this.d0.oz(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.d0.r());
        }
        return fArr;
    }

    @Override // ft.hk
    public boolean isReady() {
        return true;
    }

    public final void j5() {
        y yVar = this.f9394d;
        if (yVar != null) {
            yVar.v();
        }
    }

    @Override // ft.ic
    public int n3(g gVar) {
        return "application/x-camera-motion".equals(gVar.f3) ? k3.y(4) : k3.y(0);
    }
}

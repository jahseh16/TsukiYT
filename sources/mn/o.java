package mn;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import mn.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s.y f6647a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f6648c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f6649f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public s.y f6650fb;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public qn f6652i9;
    public int n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s.y f6653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ShortBuffer f6654t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public ByteBuffer f6655tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s.y f6656v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public long f6657wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f6658xc;
    public float zn = 1.0f;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f6651gv = 1.0f;

    public o() {
        s.y yVar = s.y.f6679v;
        this.f6656v = yVar;
        this.f6647a = yVar;
        this.f6650fb = yVar;
        this.f6653s = yVar;
        ByteBuffer byteBuffer = s.y;
        this.f6649f = byteBuffer;
        this.f6654t = byteBuffer.asShortBuffer();
        this.f6655tl = byteBuffer;
        this.n3 = -1;
    }

    @Override // mn.s
    public boolean a() {
        qn qnVar;
        return this.w && ((qnVar = this.f6652i9) == null || qnVar.f() == 0);
    }

    public void c5(float f3) {
        if (this.zn != f3) {
            this.zn = f3;
            this.f6648c5 = true;
        }
    }

    public long fb(long j) {
        if (this.f6658xc < 1024) {
            return (long) (((double) this.zn) * j);
        }
        long jT = this.f6657wz - ((long) ((qn) v0.y.v(this.f6652i9)).t());
        int i = this.f6653s.y;
        int i5 = this.f6650fb.y;
        return i == i5 ? ut.x5(j, jT, this.f6658xc) : ut.x5(j, jT * ((long) i), this.f6658xc * ((long) i5));
    }

    @Override // mn.s
    public void flush() {
        if (isActive()) {
            s.y yVar = this.f6656v;
            this.f6650fb = yVar;
            s.y yVar2 = this.f6647a;
            this.f6653s = yVar2;
            if (this.f6648c5) {
                this.f6652i9 = new qn(yVar.y, yVar.n3, this.zn, this.f6651gv, yVar2.y);
            } else {
                qn qnVar = this.f6652i9;
                if (qnVar != null) {
                    qnVar.c5();
                }
            }
        }
        this.f6655tl = s.y;
        this.f6657wz = 0L;
        this.f6658xc = 0L;
        this.w = false;
    }

    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            qn qnVar = (qn) v0.y.v(this.f6652i9);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f6657wz += (long) iRemaining;
            qnVar.z(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // mn.s
    public boolean isActive() {
        return this.f6647a.y != -1 && (Math.abs(this.zn - 1.0f) >= 1.0E-4f || Math.abs(this.f6651gv - 1.0f) >= 1.0E-4f || this.f6647a.y != this.f6656v.y);
    }

    @Override // mn.s
    public ByteBuffer n3() {
        int iF;
        qn qnVar = this.f6652i9;
        if (qnVar != null && (iF = qnVar.f()) > 0) {
            if (this.f6649f.capacity() < iF) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iF).order(ByteOrder.nativeOrder());
                this.f6649f = byteBufferOrder;
                this.f6654t = byteBufferOrder.asShortBuffer();
            } else {
                this.f6649f.clear();
                this.f6654t.clear();
            }
            qnVar.i9(this.f6654t);
            this.f6658xc += (long) iF;
            this.f6649f.limit(iF);
            this.f6655tl = this.f6649f;
        }
        ByteBuffer byteBuffer = this.f6655tl;
        this.f6655tl = s.y;
        return byteBuffer;
    }

    public void s(float f3) {
        if (this.f6651gv != f3) {
            this.f6651gv = f3;
            this.f6648c5 = true;
        }
    }

    @Override // mn.s
    public void v() {
        qn qnVar = this.f6652i9;
        if (qnVar != null) {
            qnVar.co();
        }
        this.w = true;
    }

    @Override // mn.s
    public void y() {
        this.zn = 1.0f;
        this.f6651gv = 1.0f;
        s.y yVar = s.y.f6679v;
        this.f6656v = yVar;
        this.f6647a = yVar;
        this.f6650fb = yVar;
        this.f6653s = yVar;
        ByteBuffer byteBuffer = s.y;
        this.f6649f = byteBuffer;
        this.f6654t = byteBuffer.asShortBuffer();
        this.f6655tl = byteBuffer;
        this.n3 = -1;
        this.f6648c5 = false;
        this.f6652i9 = null;
        this.f6657wz = 0L;
        this.f6658xc = 0L;
        this.w = false;
    }

    @Override // mn.s
    public s.y zn(s.y yVar) throws s.n3 {
        if (yVar.zn != 2) {
            throw new s.n3(yVar);
        }
        int i = this.n3;
        if (i == -1) {
            i = yVar.y;
        }
        this.f6656v = yVar;
        s.y yVar2 = new s.y(i, yVar.n3, 2);
        this.f6647a = yVar2;
        this.f6648c5 = true;
        return yVar2;
    }
}

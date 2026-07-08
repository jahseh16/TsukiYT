package mn;

import java.nio.ByteBuffer;
import mn.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class j extends d0 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6558c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6559f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6560i9;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6561t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public byte[] f6562tl = ut.f8757a;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public int f6563wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public long f6564xc;

    @Override // mn.d0, mn.s
    public boolean a() {
        return super.a() && this.f6563wz == 0;
    }

    @Override // mn.d0
    public void c5() {
        if (this.f6559f) {
            this.f6559f = false;
            int i = this.f6560i9;
            int i5 = this.n3.f6680gv;
            this.f6562tl = new byte[i * i5];
            this.f6561t = this.f6558c5 * i5;
        }
        this.f6563wz = 0;
    }

    @Override // mn.d0
    public void f() {
        this.f6562tl = ut.f8757a;
    }

    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f6561t);
        this.f6564xc += (long) (iMin / this.n3.f6680gv);
        this.f6561t -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f6561t > 0) {
            return;
        }
        int i5 = i - iMin;
        int length = (this.f6563wz + i5) - this.f6562tl.length;
        ByteBuffer byteBufferT = t(length);
        int iP = ut.p(length, 0, this.f6563wz);
        byteBufferT.put(this.f6562tl, 0, iP);
        int iP2 = ut.p(length - iP, 0, i5);
        byteBuffer.limit(byteBuffer.position() + iP2);
        byteBufferT.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i8 = i5 - iP2;
        int i10 = this.f6563wz - iP;
        this.f6563wz = i10;
        byte[] bArr = this.f6562tl;
        System.arraycopy(bArr, iP, bArr, 0, i10);
        byteBuffer.get(this.f6562tl, this.f6563wz, i8);
        this.f6563wz += i8;
        byteBufferT.flip();
    }

    @Override // mn.d0
    public void i9() {
        if (this.f6559f) {
            int i = this.f6563wz;
            if (i > 0) {
                this.f6564xc += (long) (i / this.n3.f6680gv);
            }
            this.f6563wz = 0;
        }
    }

    @Override // mn.d0, mn.s
    public ByteBuffer n3() {
        int i;
        if (super.a() && (i = this.f6563wz) > 0) {
            t(i).put(this.f6562tl, 0, this.f6563wz).flip();
            this.f6563wz = 0;
        }
        return super.n3();
    }

    @Override // mn.d0
    public s.y s(s.y yVar) throws s.n3 {
        if (yVar.zn != 2) {
            throw new s.n3(yVar);
        }
        this.f6559f = true;
        return (this.f6558c5 == 0 && this.f6560i9 == 0) ? s.y.f6679v : yVar;
    }

    public long tl() {
        return this.f6564xc;
    }

    public void wz() {
        this.f6564xc = 0L;
    }

    public void xc(int i, int i5) {
        this.f6558c5 = i;
        this.f6560i9 = i5;
    }
}

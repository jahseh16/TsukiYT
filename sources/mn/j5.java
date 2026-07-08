package mn;

import java.nio.ByteBuffer;
import mn.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends d0 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final long f6565c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public boolean f6566co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short f6567f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final long f6568i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public int f6569mt;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6570p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6571t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public boolean f6572tl;
    public int w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public byte[] f6573wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public byte[] f6574xc;
    public long z;

    public j5() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override // mn.d0
    public void c5() {
        if (this.f6572tl) {
            this.f6571t = this.n3.f6680gv;
            int iTl = tl(this.f6565c5) * this.f6571t;
            if (this.f6573wz.length != iTl) {
                this.f6573wz = new byte[iTl];
            }
            int iTl2 = tl(this.f6568i9) * this.f6571t;
            this.f6569mt = iTl2;
            if (this.f6574xc.length != iTl2) {
                this.f6574xc = new byte[iTl2];
            }
        }
        this.w = 0;
        this.z = 0L;
        this.f6570p = 0;
        this.f6566co = false;
    }

    public final void co(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iXc = xc(byteBuffer);
        int iPosition = iXc - byteBuffer.position();
        byte[] bArr = this.f6573wz;
        int length = bArr.length;
        int i = this.f6570p;
        int i5 = length - i;
        if (iXc < iLimit && iPosition < i5) {
            mt(bArr, i);
            this.f6570p = 0;
            this.w = 0;
            return;
        }
        int iMin = Math.min(iPosition, i5);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f6573wz, this.f6570p, iMin);
        int i8 = this.f6570p + iMin;
        this.f6570p = i8;
        byte[] bArr2 = this.f6573wz;
        if (i8 == bArr2.length) {
            if (this.f6566co) {
                mt(bArr2, this.f6569mt);
                this.z += (long) ((this.f6570p - (this.f6569mt * 2)) / this.f6571t);
            } else {
                this.z += (long) ((i8 - this.f6569mt) / this.f6571t);
            }
            i4(byteBuffer, this.f6573wz, this.f6570p);
            this.f6570p = 0;
            this.w = 2;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // mn.d0
    public void f() {
        this.f6572tl = false;
        this.f6569mt = 0;
        byte[] bArr = ut.f8757a;
        this.f6573wz = bArr;
        this.f6574xc = bArr;
    }

    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !fb()) {
            int i = this.w;
            if (i == 0) {
                z(byteBuffer);
            } else if (i == 1) {
                co(byteBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                r(byteBuffer);
            }
        }
    }

    public final void i4(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.f6569mt);
        int i5 = this.f6569mt - iMin;
        System.arraycopy(bArr, i - i5, this.f6574xc, 0, i5);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f6574xc, i5, iMin);
    }

    @Override // mn.d0
    public void i9() {
        int i = this.f6570p;
        if (i > 0) {
            mt(this.f6573wz, i);
        }
        if (this.f6566co) {
            return;
        }
        this.z += (long) (this.f6569mt / this.f6571t);
    }

    @Override // mn.d0, mn.s
    public boolean isActive() {
        return this.f6572tl;
    }

    public final void mt(byte[] bArr, int i) {
        t(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f6566co = true;
        }
    }

    public final void p(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        t(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f6566co = true;
        }
    }

    public final void r(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iXc = xc(byteBuffer);
        byteBuffer.limit(iXc);
        this.z += (long) (byteBuffer.remaining() / this.f6571t);
        i4(byteBuffer, this.f6574xc, this.f6569mt);
        if (iXc < iLimit) {
            mt(this.f6574xc, this.f6569mt);
            this.w = 0;
            byteBuffer.limit(iLimit);
        }
    }

    @Override // mn.d0
    public s.y s(s.y yVar) throws s.n3 {
        if (yVar.zn == 2) {
            return this.f6572tl ? yVar : s.y.f6679v;
        }
        throw new s.n3(yVar);
    }

    public final int tl(long j) {
        return (int) ((j * ((long) this.n3.y)) / 1000000);
    }

    public long w() {
        return this.z;
    }

    public final int wz(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f6567f);
        int i = this.f6571t;
        return ((iLimit / i) * i) + i;
    }

    public void x4(boolean z) {
        this.f6572tl = z;
    }

    public final int xc(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f6567f) {
                int i = this.f6571t;
                return i * (iPosition / i);
            }
        }
        return byteBuffer.limit();
    }

    public final void z(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f6573wz.length));
        int iWz = wz(byteBuffer);
        if (iWz == byteBuffer.position()) {
            this.w = 1;
        } else {
            byteBuffer.limit(iWz);
            p(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public j5(long j, long j4, short s3) {
        v0.y.y(j4 <= j);
        this.f6565c5 = j;
        this.f6568i9 = j4;
        this.f6567f = s3;
        byte[] bArr = ut.f8757a;
        this.f6573wz = bArr;
        this.f6574xc = bArr;
    }
}

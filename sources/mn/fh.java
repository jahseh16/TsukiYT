package mn;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import mn.s;

/* JADX INFO: loaded from: classes.dex */
public final class fh extends d0 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public int[] f6556c5;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public int[] f6557i9;

    @Override // mn.d0
    public void c5() {
        this.f6557i9 = this.f6556c5;
    }

    @Override // mn.d0
    public void f() {
        this.f6557i9 = null;
        this.f6556c5 = null;
    }

    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) v0.y.v(this.f6557i9);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferT = t(((iLimit - iPosition) / this.n3.f6680gv) * this.zn.f6680gv);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferT.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.n3.f6680gv;
        }
        byteBuffer.position(iLimit);
        byteBufferT.flip();
    }

    @Override // mn.d0
    public s.y s(s.y yVar) throws s.n3 {
        int[] iArr = this.f6556c5;
        if (iArr == null) {
            return s.y.f6679v;
        }
        if (yVar.zn != 2) {
            throw new s.n3(yVar);
        }
        boolean z = yVar.n3 != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i5 = iArr[i];
            if (i5 >= yVar.n3) {
                throw new s.n3(yVar);
            }
            z |= i5 != i;
            i++;
        }
        return z ? new s.y(yVar.y, iArr.length, 2) : s.y.f6679v;
    }

    public void tl(@Nullable int[] iArr) {
        this.f6556c5 = iArr;
    }
}

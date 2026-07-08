package mn;

import java.nio.ByteBuffer;
import mn.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a8 extends d0 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int f6519c5 = Float.floatToIntBits(Float.NaN);

    public static void tl(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f6519c5) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferT;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i5 = this.n3.zn;
        if (i5 == 536870912) {
            byteBufferT = t((i / 3) * 4);
            while (iPosition < iLimit) {
                tl(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferT);
                iPosition += 3;
            }
        } else {
            if (i5 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferT = t(i);
            while (iPosition < iLimit) {
                tl((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferT);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferT.flip();
    }

    @Override // mn.d0
    public s.y s(s.y yVar) throws s.n3 {
        int i = yVar.zn;
        if (ut.g(i)) {
            return i != 4 ? new s.y(yVar.y, yVar.n3, 4) : s.y.f6679v;
        }
        throw new s.n3(yVar);
    }
}

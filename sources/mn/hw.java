package mn;

import java.nio.ByteBuffer;
import mn.s;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends d0 {
    @Override // mn.s
    public void gv(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i5 = this.n3.zn;
        if (i5 == 3) {
            i *= 2;
        } else if (i5 == 4) {
            i /= 2;
        } else if (i5 != 268435456) {
            if (i5 != 536870912) {
                if (i5 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferT = t(i);
        int i8 = this.n3.zn;
        if (i8 == 3) {
            while (iPosition < iLimit) {
                byteBufferT.put((byte) 0);
                byteBufferT.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i8 == 4) {
            while (iPosition < iLimit) {
                short sW = (short) (ut.w(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferT.put((byte) (sW & 255));
                byteBufferT.put((byte) ((sW >> 8) & 255));
                iPosition += 4;
            }
        } else if (i8 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferT.put(byteBuffer.get(iPosition + 1));
                byteBufferT.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i8 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferT.put(byteBuffer.get(iPosition + 1));
                byteBufferT.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i8 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferT.put(byteBuffer.get(iPosition + 2));
                byteBufferT.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferT.flip();
    }

    @Override // mn.d0
    public s.y s(s.y yVar) throws s.n3 {
        int i = yVar.zn;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new s.y(yVar.y, yVar.n3, 2) : s.y.f6679v;
        }
        throw new s.n3(yVar);
    }
}

package mn;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class vl {
    public static int a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int fb(ByteBuffer byteBuffer) {
        return (int) ((gv(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long gv(byte b4, byte b6) {
        int i;
        int i5 = b4 & 255;
        int i8 = b4 & 3;
        if (i8 != 0) {
            i = 2;
            if (i8 != 1 && i8 != 2) {
                i = b6 & 63;
            }
        } else {
            i = 1;
        }
        int i10 = i5 >> 3;
        int i11 = i10 & 3;
        return ((long) i) * ((long) (i10 >= 16 ? 2500 << i11 : i10 >= 12 ? 10000 << (i10 & 1) : i11 == 3 ? 60000 : 10000 << i11));
    }

    public static byte[] n3(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    public static long s(long j) {
        return (j * 1000000000) / 48000;
    }

    public static long v(byte[] bArr) {
        return gv(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List<byte[]> y(byte[] bArr) {
        long jS = s(a(bArr));
        long jS2 = s(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(n3(jS));
        arrayList.add(n3(jS2));
        return arrayList;
    }

    public static int zn(byte[] bArr) {
        return bArr[9] & 255;
    }
}

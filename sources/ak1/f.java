package ak1;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final byte[] zn;
    public static final f y = new f();
    public static final int[] n3 = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final y f146gv = new y();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        zn = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            y.y(i, n3[i], zn[i]);
        }
    }

    public final int gv(hk1.s bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int iCt = bytes.ct();
        long j = 0;
        int i = 0;
        while (i < iCt) {
            int i5 = i + 1;
            j += (long) zn[tj1.gv.gv(bytes.w(i), 255)];
            i = i5;
        }
        return (int) ((j + ((long) 7)) >> 3);
    }

    public final void n3(hk1.fb source, long j, hk1.a sink) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        y yVar = f146gv;
        int iGv = 0;
        long j4 = 0;
        int iZn = 0;
        while (j4 < j) {
            j4++;
            iGv = (iGv << 8) | tj1.gv.gv(source.readByte(), 255);
            iZn += 8;
            while (iZn >= 8) {
                y[] yVarArrY = yVar.y();
                Intrinsics.checkNotNull(yVarArrY);
                yVar = yVarArrY[(iGv >>> (iZn - 8)) & 255];
                Intrinsics.checkNotNull(yVar);
                if (yVar.y() == null) {
                    sink.writeByte(yVar.n3());
                    iZn -= yVar.zn();
                    yVar = f146gv;
                } else {
                    iZn -= 8;
                }
            }
        }
        while (iZn > 0) {
            y[] yVarArrY2 = yVar.y();
            Intrinsics.checkNotNull(yVarArrY2);
            y yVar2 = yVarArrY2[(iGv << (8 - iZn)) & 255];
            Intrinsics.checkNotNull(yVar2);
            if (yVar2.y() != null || yVar2.zn() > iZn) {
                return;
            }
            sink.writeByte(yVar2.n3());
            iZn -= yVar2.zn();
            yVar = f146gv;
        }
    }

    public final void y(int i, int i5, int i8) {
        y yVar = new y(i, i8);
        y yVar2 = f146gv;
        while (i8 > 8) {
            i8 -= 8;
            int i10 = (i5 >>> i8) & 255;
            y[] yVarArrY = yVar2.y();
            Intrinsics.checkNotNull(yVarArrY);
            y yVar3 = yVarArrY[i10];
            if (yVar3 == null) {
                yVar3 = new y();
                yVarArrY[i10] = yVar3;
            }
            yVar2 = yVar3;
        }
        int i11 = 8 - i8;
        int i12 = (i5 << i11) & 255;
        y[] yVarArrY2 = yVar2.y();
        Intrinsics.checkNotNull(yVarArrY2);
        ArraysKt.fill(yVarArrY2, yVar, i12, (1 << i11) + i12);
    }

    public final void zn(hk1.s source, hk1.a sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int iCt = source.ct();
        long j = 0;
        int i = 0;
        int i5 = 0;
        while (i < iCt) {
            int i8 = i + 1;
            int iGv = tj1.gv.gv(source.w(i), 255);
            int i10 = n3[iGv];
            byte b4 = zn[iGv];
            j = (j << b4) | ((long) i10);
            i5 += b4;
            while (i5 >= 8) {
                i5 -= 8;
                sink.writeByte((int) (j >> i5));
            }
            i = i8;
        }
        if (i5 > 0) {
            sink.writeByte((int) ((j << (8 - i5)) | (255 >>> i5)));
        }
    }

    public static final class y {
        public final int n3;
        public final y[] y;
        public final int zn;

        public y() {
            this.y = new y[NotificationCompat.FLAG_LOCAL_ONLY];
            this.n3 = 0;
            this.zn = 0;
        }

        public final int n3() {
            return this.n3;
        }

        public final y[] y() {
            return this.y;
        }

        public final int zn() {
            return this.zn;
        }

        public y(int i, int i5) {
            this.y = null;
            this.n3 = i;
            int i8 = i5 & 7;
            this.zn = i8 == 0 ? 8 : i8;
        }
    }
}

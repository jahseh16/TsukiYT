package mn;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ft.g;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ud {
    public static final int[] y = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] n3 = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] zn = {64, 112, 128, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 640, 768, 896, UserMetadata.MAX_ATTRIBUTE_SIZE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(byte[] bArr) {
        int i;
        byte b4;
        int i5;
        byte b6;
        byte b7 = bArr[0];
        if (b7 != -2) {
            if (b7 == -1) {
                i = (bArr[4] & 7) << 4;
                b6 = bArr[7];
            } else if (b7 != 31) {
                i = (bArr[4] & 1) << 6;
                b4 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b6 = bArr[6];
            }
            i5 = b6 & 60;
            return (((i5 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b4 = bArr[4];
        i5 = b4 & 252;
        return (((i5 >> 2) | i) + 1) * 32;
    }

    public static g fb(byte[] bArr, @Nullable String str, @Nullable String str2, @Nullable DrmInitData drmInitData) {
        v0.ta taVarN3 = n3(bArr);
        taVarN3.mt(60);
        int i = y[taVarN3.s(6)];
        int i5 = n3[taVarN3.s(4)];
        int iS = taVarN3.s(5);
        int[] iArr = zn;
        int i8 = iS >= iArr.length ? -1 : (iArr[iS] * 1000) / 2;
        taVarN3.mt(10);
        return new g.n3().oz(str).o4("audio/vnd.dts").ud(i8).a8(i + (taVarN3.s(2) > 0 ? 1 : 0)).rs(i5).vl(drmInitData).k(str2).z6();
    }

    public static boolean gv(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static v0.ta n3(byte[] bArr) {
        if (bArr[0] == 127) {
            return new v0.ta(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (zn(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b4 = bArrCopyOf[i];
                int i5 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i5];
                bArrCopyOf[i5] = b4;
            }
        }
        v0.ta taVar = new v0.ta(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            v0.ta taVar2 = new v0.ta(bArrCopyOf);
            while (taVar2.n3() >= 16) {
                taVar2.mt(2);
                taVar.a(taVar2.s(14), 14);
            }
        }
        taVar.wz(bArrCopyOf);
        return taVar;
    }

    public static int v(ByteBuffer byteBuffer) {
        int i;
        byte b4;
        int i5;
        byte b6;
        int iPosition = byteBuffer.position();
        byte b7 = byteBuffer.get(iPosition);
        if (b7 != -2) {
            if (b7 == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b6 = byteBuffer.get(iPosition + 7);
            } else if (b7 != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b4 = byteBuffer.get(iPosition + 5);
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b6 = byteBuffer.get(iPosition + 6);
            }
            i5 = b6 & 60;
            return (((i5 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b4 = byteBuffer.get(iPosition + 4);
        i5 = b4 & 252;
        return (((i5 >> 2) | i) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.ud.y(byte[]):int");
    }

    public static boolean zn(byte[] bArr) {
        byte b4 = bArr[0];
        return b4 == -2 || b4 == -1;
    }
}

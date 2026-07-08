package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AQ {
    public static byte[] A00;
    public static String[] A01 = {"sCxx5L5gWudXPe4xp1ThsNryHSmynjHF", "9Nf9uybzHO2S6jQpjiGasa9ZwcLHyUhN", "2aneS77IEDbgq", "fX6HyBPcmxgssJA51nXZ3qA", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "AlikR2RGcjs8IOnjMv6bsO9qZZebDHqD", "DHEXyDlkH8L0aTNQHdBgfWGXbAOYtdTx", "PJLs5pK7Ccf4tt9LWMwQ38VoV6l96kFD"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A07(C0645Hz c0645Hz, String str, String str2, DrmInitData drmInitData) {
        int i = A05[(c0645Hz.A0E() & 192) >> 6];
        int iA0E = c0645Hz.A0E();
        int i5 = A04[(iA0E & 56) >> 3];
        if ((iA0E & 4) != 0) {
            i5++;
        }
        return Format.A07(str, A0A(0, 9, 26), null, -1, -1, i5, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A08(C0645Hz c0645Hz, String str, String str2, DrmInitData drmInitData) {
        c0645Hz.A0Z(2);
        int i = A05[(c0645Hz.A0E() & 192) >> 6];
        int iA0E = c0645Hz.A0E();
        int i5 = A04[(iA0E & 14) >> 1];
        if ((iA0E & 1) != 0) {
            i5++;
        }
        if (((c0645Hz.A0E() & 30) >> 1) > 0 && (c0645Hz.A0E() & 2) != 0) {
            i5 += 2;
        }
        String strA0A = A0A(9, 10, 48);
        if (c0645Hz.A04() > 0 && (c0645Hz.A0E() & 1) != 0) {
            strA0A = A0A(19, 14, 124);
        }
        return Format.A07(str, strA0A, null, -1, -1, i5, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meta.analytics.dsp.uinode.AP A09(com.meta.analytics.dsp.uinode.C0644Hy r18) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AQ.A09(com.facebook.ads.redexgen.X.Hy):com.facebook.ads.redexgen.X.AP");
    }

    public static String A0A(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-69, -49, -66, -61, -55, -119, -69, -67, -115, -47, -27, -44, -39, -33, -97, -43, -47, -45, -93, 29, 49, 32, 37, 43, -21, 33, 29, 31, -17, -23, 38, 43, 31};
    }

    static {
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 576, 640};
        A07 = new int[]{69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    public static int A01(int i, int i5) {
        int i8 = i5 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = A05;
        int halfFrmsizecod = iArr.length;
        if (i >= halfFrmsizecod || i5 < 0) {
            return -1;
        }
        int[] iArr2 = A07;
        int halfFrmsizecod2 = iArr2.length;
        if (i8 >= halfFrmsizecod2) {
            return -1;
        }
        int bitrate = iArr[i];
        if (bitrate == 44100) {
            int halfFrmsizecod3 = i5 % 2;
            return (iArr2[i8] + halfFrmsizecod3) * 2;
        }
        int sampleRate = A02[i8];
        if (bitrate == 32000) {
            int i10 = sampleRate * 6;
            if (A01[6].charAt(31) == 81) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "qimZQilZsB2lt3Dt1pYE9Xl";
            strArr[4] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            return i10;
        }
        int halfFrmsizecod4 = sampleRate * 4;
        return halfFrmsizecod4;
    }

    public static int A02(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int startIndex = byteBuffer.limit();
        int i = startIndex - 10;
        for (int i5 = iPosition; i5 <= i; i5++) {
            int startIndex2 = i5 + 4;
            int endIndex = byteBuffer.getInt(startIndex2);
            if ((endIndex & (-16777217)) == -1167101192) {
                return i5 - iPosition;
            }
        }
        String[] strArr = A01;
        String str = strArr[7];
        String str2 = strArr[5];
        int endIndex2 = str.charAt(29);
        int startIndex3 = str2.charAt(29);
        if (endIndex2 == startIndex3) {
            throw new RuntimeException();
        }
        A01[2] = "FkGXqBuH9rf";
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            int[] iArr = A03;
            int fscod = byteBuffer.position();
            i = iArr[(byteBuffer.get(fscod + 4) & 48) >> 4];
        }
        int fscod2 = i * NotificationCompat.FLAG_LOCAL_ONLY;
        return fscod2;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        boolean isMlp = (byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187;
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (isMlp ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        int fscod = (bArr[4] & 192) >> 6;
        int frmsizecod = bArr[4] & 63;
        return A01(fscod, frmsizecod);
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        boolean isMlp = (bArr[7] & 255) == 187;
        byte b4 = bArr[isMlp ? '\t' : '\b'];
        String[] strArr = A01;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "Qkic1459317rghhXW1uTsPZAwlwTKIiV";
        strArr2[0] = "TPYz26W0Cq4ZALktt0QhsmVlkvC9xybr";
        return 40 << ((b4 >> 4) & 7);
    }
}

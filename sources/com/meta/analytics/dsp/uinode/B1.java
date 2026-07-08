package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class B1 {
    public static byte[] A00;
    public static String[] A01 = {"LgmYw98W3bgowMYQY6Q3BawqAxXNUuUl", "GpzgTRDYOaIyAt6xSJRYAk3b6rAdzkZ0", "RtCZFOI40BGARGfB2sOg6MLybkAs9Fzf", "Gx3YqKVlWhsXJsTGKtjglmBlxW0pOlYg", "tq174XAFZe", "aVWuh4A2S2MgQagwT", "vwD2gnTxyUihDEDfn", "xhuYGO7iBGvSpDZMcS9LxFC"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Format A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C0644Hy c0644HyA04 = A04(bArr);
        c0644HyA04.A08(60);
        int i = A02[c0644HyA04.A04(6)];
        int i5 = A03[c0644HyA04.A04(4)];
        int iA04 = c0644HyA04.A04(5);
        int[] iArr = A04;
        int i8 = iA04 >= iArr.length ? -1 : (iArr[iA04] * 1000) / 2;
        c0644HyA04.A08(10);
        return Format.A07(str, A05(0, 13, 102), null, i8, -1, i + (c0644HyA04.A04(2) > 0 ? 1 : 0), i5, null, drmInitData, 0, str2);
    }

    public static String A05(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{65, 85, 68, 73, 79, 15, 86, 78, 68, 14, 68, 84, 83};
    }

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, NotificationCompat.FLAG_GROUP_SUMMARY, 640, 768, 896, UserMetadata.MAX_ATTRIBUTE_SIZE, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int nblks;
        int iPosition = byteBuffer.position();
        int position = byteBuffer.get(iPosition);
        switch (position) {
            case -2:
                int position2 = iPosition + 5;
                int i = (byteBuffer.get(position2) & 1) << 6;
                int position3 = iPosition + 4;
                nblks = i | ((byteBuffer.get(position3) & 252) >> 2);
                break;
            case -1:
                int position4 = iPosition + 4;
                int i5 = (byteBuffer.get(position4) & 7) << 4;
                int position5 = iPosition + 7;
                nblks = i5 | ((byteBuffer.get(position5) & 60) >> 2);
                break;
            case 31:
                int position6 = iPosition + 5;
                int i8 = (byteBuffer.get(position6) & 7) << 4;
                int position7 = iPosition + 6;
                nblks = i8 | ((byteBuffer.get(position7) & 60) >> 2);
                break;
            default:
                int position8 = iPosition + 4;
                int i10 = (byteBuffer.get(position8) & 1) << 6;
                int position9 = iPosition + 5;
                nblks = i10 | ((byteBuffer.get(position9) & 252) >> 2);
                break;
        }
        int position10 = nblks + 1;
        return position10 * 32;
    }

    public static int A01(byte[] bArr) {
        int i;
        boolean z = false;
        switch (bArr[0]) {
            case -2:
                i = (((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
            case -1:
                int i5 = (bArr[7] & 3) << 12;
                int i8 = (bArr[6] & 255) << 4;
                if (A01[1].charAt(17) != 'C') {
                    A01[2] = "MBjMF3o66WyYJ7fC9eQP49KWn3JCWQGt";
                    i = (i5 | i8 | ((bArr[9] & 60) >> 2)) + 1;
                    z = true;
                } else {
                    i = (i5 | i8 | ((bArr[9] & 60) >> 2)) + 1;
                    z = true;
                }
                break;
            case 31:
                int i10 = (bArr[6] & 3) << 12;
                byte b4 = bArr[7];
                String[] strArr = A01;
                if (strArr[5].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "meKDaeVMRSRS1vVcwwYXxolxpiaSquNW";
                i = (i10 | ((b4 & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z = true;
                break;
            default:
                i = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z ? (i * 16) / 14 : i;
    }

    public static int A02(byte[] bArr) {
        int i;
        switch (bArr[0]) {
            case -2:
                i = ((bArr[5] & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                byte b4 = bArr[4];
                String[] strArr = A01;
                if (strArr[5].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "0rS52mmndmktv37b0";
                strArr2[6] = "cQepkBNQqnKQzzIfS";
                i = ((b4 & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        int nblks = i + 1;
        return nblks * 32;
    }

    public static C0644Hy A04(byte[] bArr) {
        if (bArr[0] == 127) {
            return new C0644Hy(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(bArrCopyOf)) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b4 = bArrCopyOf[i];
                bArrCopyOf[i] = bArrCopyOf[i + 1];
                bArrCopyOf[i + 1] = b4;
            }
        }
        C0644Hy c0644Hy = new C0644Hy(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C0644Hy c0644Hy2 = new C0644Hy(bArrCopyOf);
            while (c0644Hy2.A01() >= 16) {
                c0644Hy2.A08(2);
                c0644Hy.A0A(c0644Hy2.A04(14), 14);
            }
        }
        c0644Hy.A0B(bArrCopyOf);
        return c0644Hy;
    }

    public static boolean A07(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}

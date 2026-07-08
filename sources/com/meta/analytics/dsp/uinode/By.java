package com.meta.analytics.dsp.uinode;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class By {
    public static byte[] A07;
    public static String[] A08 = {"FJwhSbR0Dqb1wEJXVBdpfUEyE2PwmXT5", "QXyUQtNV4ztNvs", "u680PItdmSCtrwUArgQMKOt5dGhFKyFy", "M6QX6bpZXsa0EpVfLqUIYL0ok3oIyD", "4ddrBoC1HSiu89JLzfXMV59B74qIm2xJ", "MUUz2dKYtP7sZF6Tuk5kEGRgHEx452fJ", "i1sqGOju2LE8Q92QQNgFTaNu0rUo1z4f", "5HWyWxmgcaxBLo1LpD3PpaOIjtbRMHJC"};
    public static final int[] A09;
    public static final int[] A0A;
    public static final int[] A0B;
    public static final int[] A0C;
    public static final int[] A0D;
    public static final int[] A0E;
    public static final String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = bArrCopyOfRange[i10] - i8;
            String[] strArr = A08;
            if (strArr[6].charAt(26) == strArr[2].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "mZfo4fIlXHQscYR0BkWPKUfaL8c0bByk";
            strArr2[2] = "AkiufmiMzZJvhyS77AiglOXb5e3YRP2V";
            bArrCopyOfRange[i10] = (byte) (i11 - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A07 = new byte[]{-64, -44, -61, -56, -50, -114, -52, -49, -60, -58, 29, 49, 32, 37, 43, -21, 41, 44, 33, 35, -23, 8, -19, 50, 70, 53, 58, 64, 0, 62, 65, 54, 56, -2, 29, 3};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A04(int i, By by) {
        int i5;
        int i8;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i & (-2097152)) != -2097152 || (i5 = (i >>> 19) & 3) == 1 || (i8 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = A0E[i11];
        if (i5 == 2) {
            i15 /= 2;
        } else if (i5 == 0) {
            i15 /= 4;
        }
        int i16 = (i >>> 9) & 1;
        if (i8 == 3) {
            i12 = i5 == 3 ? A09[i10 - 1] : A0D[i10 - 1];
            i14 = (((i12 * 12000) / i15) + i16) * 4;
            i13 = 384;
        } else {
            if (i5 == 3) {
                i12 = i8 == 2 ? A0A[i10 - 1] : A0B[i10 - 1];
                i13 = 1152;
                i14 = ((144000 * i12) / i15) + i16;
            } else {
                i12 = A0C[i10 - 1];
                i13 = i8 == 1 ? 576 : 1152;
                i14 = (((i8 == 1 ? 72000 : 144000) * i12) / i15) + i16;
            }
        }
        by.A03(i5, A0F[3 - i8], i14, i15, ((i >> 6) & 3) == 3 ? 1 : 2, i12 * 1000, i13);
        return true;
    }

    static {
        A02();
        A0F = new String[]{A01(10, 13, 94), A01(23, 13, 115), A01(0, 10, 1)};
        A0E = new int[]{44100, 48000, 32000};
        A09 = new int[]{32, 64, 96, 128, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 288, 320, 352, 384, 416, 448};
        A0D = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY};
        A0A = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384};
        A0B = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320};
        A0C = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    }

    public static int A00(int i) {
        int i5;
        int layer;
        int padding;
        int i8;
        int i10;
        int version;
        if ((i & (-2097152)) != -2097152 || (i5 = (i >>> 19) & 3) == 1 || (layer = (i >>> 17) & 3) == 0 || (padding = (i >>> 12) & 15) == 0 || padding == 15 || (i8 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = A0E[i8];
        if (i5 == 2) {
            i11 /= 2;
        } else if (i5 == 0) {
            i11 /= 4;
        }
        int i12 = (i >>> 9) & 1;
        String[] strArr = A08;
        String str = strArr[5];
        String str2 = strArr[4];
        int iCharAt = str.charAt(20);
        int version2 = str2.charAt(20);
        if (iCharAt == version2) {
            throw new RuntimeException();
        }
        A08[0] = "wCPzQVRdLc9fuoZbbzdyTQMs65DUcW8k";
        if (layer == 3) {
            if (i5 == 3) {
                int version3 = padding - 1;
                version = A09[version3];
            } else {
                int version4 = padding - 1;
                version = A0D[version4];
            }
            return (((version * 12000) / i11) + i12) * 4;
        }
        if (i5 == 3) {
            if (layer == 2) {
                int version5 = padding - 1;
                i10 = A0A[version5];
            } else {
                int version6 = padding - 1;
                i10 = A0B[version6];
            }
        } else {
            int version7 = padding - 1;
            i10 = A0C[version7];
        }
        if (i5 == 3) {
            int version8 = 144000 * i10;
            return (version8 / i11) + i12;
        }
        int version9 = layer == 1 ? 72000 : 144000;
        return ((version9 * i10) / i11) + i12;
    }

    private void A03(int i, String str, int i5, int i8, int i10, int i11, int i12) {
        this.A05 = i;
        this.A06 = str;
        this.A02 = i5;
        this.A03 = i8;
        this.A01 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }
}

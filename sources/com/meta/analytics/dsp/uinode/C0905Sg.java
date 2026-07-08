package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0905Sg extends KT {
    public static byte[] A01;
    public static String[] A02 = {"aQtlI1Us5cYHMsIV", "ql6TdDFLVKaOF", "ILd0cBh", "B0sTrIURZDTgtQOqZ9wP44Me", "PUGSIMdaF2lm0BEktB", "ig45kctSq2tkP", "eb7l2wEenDPHh06UHeaR81tCSX", "F61vU5UciYvMkd8uRJU0Fm"};
    public final /* synthetic */ C9Q A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        int i10 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A02[7] = "csAIefbP6dEHufce3C5MSz";
            if (i10 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 117);
            i10++;
        }
    }

    public static void A02() {
        A01 = new byte[]{67, 86, 81, 82, 92, 13, 91, 82, 99, 82, 95, 13, 96, 97, 78, 95, 97, 82, 81, 13, 93, 89, 78, 102, 86, 91, 84};
    }

    static {
        A02();
    }

    public C0905Sg(C9Q c9q) {
        this.A00 = c9q;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        if (!this.A00.A08) {
            this.A00.A0G(A00(0, 27, 120));
        }
    }
}

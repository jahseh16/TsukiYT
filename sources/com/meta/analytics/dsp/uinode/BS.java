package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BS extends AbstractC0841Pu {
    public static byte[] A01;
    public static String[] A02 = {"OtZHHid0c6Ryk9CDDBq47ngXcNldIUWH", "JwrlVwQ54E2WwwQvkywQUOYHwL6g1bho", "WFiM5IPZvaQ4xMZm5xgvQ3FNROoMY2Kr", "al6ZIECO6LO12zMiuvYELaWNpYKDhozx", "wYAPbQwhGVteNN6MGdL8gA6824n9AnKf", "jTihIhEYsz4XSFMEjn7OlZEBUOzI3KNS", "mXaQIkSzTCVxPQuz9HLogqhmhIjgMyMR", "pEgzTi4rZbqmTwficQat67UuNHBZNbaD"};
    public final /* synthetic */ UA A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {17, 4, -1, 0, 10, -28, 9, 15, 0, 13, 14, 15, 4, 15, -4, 7, -32, 17, 0, 9, 15};
        String[] strArr = A02;
        if (strArr[6].charAt(4) != strArr[3].charAt(4)) {
            throw new RuntimeException();
        }
        A02[2] = "e0kN46odqljBIthjpUkTXG9hdDsWHsKW";
        A01 = bArr;
    }

    static {
        A01();
    }

    public BS(UA ua2) {
        this.A00 = ua2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04268s
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C9H c9h) {
        this.A00.A06.A44(A00(0, 21, 69), c9h);
    }
}

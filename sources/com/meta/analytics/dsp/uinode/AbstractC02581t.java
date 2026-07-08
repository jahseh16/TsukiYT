package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC02581t {
    public static byte[] A00;
    public static String[] A01 = {"SZD1gnuwYC0ZDT5XCpN5wGg04vpvlXtv", "38Pkme0hctlwOycqXgIFmSt4EwGMsPu", "PZ5YSJhnqoOlFoXIJ", "MKZOkal4amZt32sY0duMnYWyMVrdvNv7", "PmMqC", "MtvBWYcgrX5nN2Ecp9gb0xGXALHF8kJ8", "836OSMulKGxVhnpon", "Ud77gBKi5ZcurXFgX0oEk2YfAMQgAhDP"};

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{25, 95, 67, 90, 91, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 3, 20, 6, 16, 3, 21, 20, 21, 46, 7, 24, 21, 20, 30};
    }

    static {
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(com.meta.analytics.dsp.uinode.C1064Yn r12, com.meta.analytics.dsp.uinode.C03696c r13, com.meta.analytics.dsp.uinode.FS r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC02581t.A02(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.6c, com.facebook.ads.redexgen.X.FS):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        new com.meta.analytics.dsp.uinode.C6Y(r0.A0D().A08(), r15.A0S(), A00(5, 12, 28), r0.A0D().A05()).A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00cb, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(com.meta.analytics.dsp.uinode.C1064Yn r13, com.meta.analytics.dsp.uinode.C03696c r14, com.meta.analytics.dsp.uinode.FS r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.AbstractC02581t.A03(com.facebook.ads.redexgen.X.Yn, com.facebook.ads.redexgen.X.6c, com.facebook.ads.redexgen.X.FS):void");
    }
}

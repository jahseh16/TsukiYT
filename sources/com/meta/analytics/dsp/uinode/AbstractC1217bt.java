package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1217bt {
    public static byte[] A00;
    public static final C1216bs A01;
    public static final GK[] A02;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-2, 2, 7, -1, -4, 1, -63, 5, -8, -7, -1, -8, -10, 7, -63, -3, 9, 0, -63, -4, 1, 7, -8, 5, 1, -12, -1, -63, -27, -8, -7, -1, -8, -10, 7, -4, 2, 1, -39, -12, -10, 7, 2, 5, 12, -36, 0, 3, -1};
    }

    static {
        C1216bs impl;
        try {
            A02();
            Class<?> implClass = Class.forName(A00(0, 49, 52));
            impl = (C1216bs) implClass.newInstance();
        } catch (ClassCastException unused) {
            impl = null;
        } catch (ClassNotFoundException unused2) {
            impl = null;
        } catch (IllegalAccessException unused3) {
            impl = null;
        } catch (InstantiationException unused4) {
            impl = null;
        }
        if (impl == null) {
            impl = new C1216bs();
        }
        A01 = impl;
        A02 = new GK[0];
    }

    public static String A01(AbstractC03796o abstractC03796o) {
        return A01.A03(abstractC03796o);
    }
}

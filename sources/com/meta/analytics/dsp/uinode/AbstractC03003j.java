package com.meta.analytics.dsp.uinode;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC03003j {
    public static byte[] A00;
    public static final C02993i A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{115, 114, 82, 121, 111, 104, 121, 120, 76, 110, 121, 79, 127, 110, 115, 112, 112, 6, 7, 39, 12, 26, 29, 12, 13, 58, 10, 27, 6, 5, 5, 119, 118, 86, 125, 107, 108, 125, 124, 75, 123, 106, 119, 116, 116, 89, 123, 123, 125, 104, 108, 125, 124, 126, 127, 66, 101, 112, 99, 101, 95, 116, 98, 101, 116, 117, 66, 114, 99, 126, 125, 125, 85, 84, 105, 78, 85, 74, 116, 95, 73, 78, 95, 94, 105, 89, 72, 85, 86, 86};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A01 = new C0570Ey();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C1099Zx();
        } else {
            A01 = new C02993i();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i) {
        if (0 != 0) {
            throw new NullPointerException(A00(72, 18, 122));
        }
        if (i == 0) {
            A01.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i, int i5, int i8, int i10, int i11) {
        if (0 != 0) {
            throw new NullPointerException(A00(17, 14, 41));
        }
        if (i11 == 0) {
            A01.A04(viewParent, view, i, i5, i8, i10);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i, int i5, int[] iArr, int i8) {
        if (0 != 0) {
            throw new NullPointerException(A00(0, 17, 92));
        }
        if (i8 == 0) {
            A01.A05(viewParent, view, i, i5, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i, int i5) {
        if (0 != 0) {
            throw new NullPointerException(A00(31, 22, 88));
        }
        if (i5 == 0) {
            A01.A06(viewParent, view, view2, i);
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f3, float f4) {
        return A01.A07(viewParent, view, f3, f4);
    }

    public static boolean A07(ViewParent viewParent, View view, float f3, float f4, boolean z) {
        return A01.A08(viewParent, view, f3, f4, z);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i, int i5) {
        if (0 != 0) {
            throw new NullPointerException(A00(53, 19, 81));
        }
        if (i5 == 0) {
            return A01.A09(viewParent, view, view2, i);
        }
        return false;
    }
}

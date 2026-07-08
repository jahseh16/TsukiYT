package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1195bX extends AbstractC02210h {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 115, 123, 126, 119, 118, 50, -122, -127, 50, -127, -126, 119, -128, 50, 126, 123, -128, 125, 50, -121, -124, 126, 76, 50};
    }

    static {
        A01();
        A02 = C1195bX.class.getSimpleName();
    }

    public C1195bX(C1064Yn c1064Yn, J2 j22, String str, Uri uri) {
        super(c1064Yn, j22, str);
        this.A00 = uri;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02210h
    public final EnumC02200g A0C() {
        try {
            C0712Kv.A0D(new C0712Kv(), super.A00, this.A00, this.A02);
        } catch (Exception unused) {
            String str = A00(0, 25, 17) + this.A00.toString();
        }
        return EnumC02200g.A08;
    }
}

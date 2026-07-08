package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0Y, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0Y {
    public static byte[] A02;
    public final C0Z A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -41, -48, -48, -57, -50, -63};
    }

    public C0Y(C0Z c0z, String str) {
        this.A00 = c0z;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 21) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}

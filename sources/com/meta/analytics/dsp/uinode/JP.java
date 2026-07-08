package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.api.NativeAdImageApi;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JP implements NativeAdImageApi {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final String A02;

    static {
        A02();
    }

    public static String A01(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{85, 88, 84, 90, 85, 73, 92, 91, 69, 12, 18, 31, 15, 19};
    }

    public JP(String str, int i, int i5) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i5;
    }

    public static JP A00(JSONObject jSONObject) {
        String strOptString;
        if (jSONObject == null || (strOptString = jSONObject.optString(A01(6, 3, 51))) == null) {
            return null;
        }
        return new JP(strOptString, jSONObject.optInt(A01(9, 5, 97), 0), jSONObject.optInt(A01(0, 6, 39), 0));
    }

    public final int getHeight() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int getWidth() {
        return this.A01;
    }
}

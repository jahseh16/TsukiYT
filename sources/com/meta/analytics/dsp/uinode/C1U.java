package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1U, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1U implements Serializable {
    public static byte[] A05 = null;
    public static String[] A06 = {"d", "N8LJkoTRbuRbC1tJ", "jfJOiGRwPDVL1NrTNwB42KXE8H2UBngU", "vBF5X8psVmC8vN2i9Fb6pwYPcFw8P16Y", "MnzIPqWVO6BB6yg7oNwcPff6zueAQoos", "vMZUyoTb2kOawbdq3lii4zyBkGUB4gvd", "5yRYj6PaRtwfaNlpyi5ySSeMn9NdrDw4", "Ti3I"};
    public static final long serialVersionUID = 238472947123L;
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1U A00(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(A04(0, 6, 35));
        String strOptString2 = jSONObject.optString(A04(36, 8, 108));
        String strOptString3 = jSONObject.optString(A04(24, 12, 29));
        int iOptInt = jSONObject.optInt(A04(44, 14, 36), -1);
        boolean zOptBoolean = jSONObject.optBoolean(A04(6, 18, 62), false);
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3) || iOptInt == -1) {
            return null;
        }
        return new C1U(strOptString, strOptString2, strOptString3, iOptInt, zOptBoolean);
    }

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] ^ i8) ^ 96;
            String[] strArr = A06;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "o";
            strArr2[1] = "Fs5WcDJhxaD3DdRX";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{34, 51, 51, 28, 42, 39, 56, 63, 50, 50, 60, 63, 61, 53, 1, 55, 48, 45, 42, 63, 57, 44, 63, 51, 13, 28, 30, 22, 28, 26, 24, 34, 19, 28, 16, 24, 126, 105, 106, 105, 126, 126, 105, 126, 54, 33, 52, 43, 54, 48, 45, 42, 35, 27, 41, 43, 32, 33};
    }

    static {
        A05();
    }

    public C1U(String str, String str2, String str3, int i, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = i;
        this.A04 = z;
    }

    private final String A01() {
        return this.A01;
    }

    private final String A02() {
        return this.A02;
    }

    private final String A03() {
        return this.A03;
    }

    public static void A06(C1U c1u, C1064Yn c1064Yn) {
        if (c1u != null && c1u.A09()) {
            new VL(c1064Yn).A04(true, c1u.A01(), c1u.A03(), c1u.A02(), System.currentTimeMillis(), c1u.A08());
        }
    }

    public static void A07(C1U c1u, C1064Yn c1064Yn) {
        if (c1u != null && c1u.A0A()) {
            new VL(c1064Yn).A04(false, c1u.A01(), c1u.A03(), c1u.A02(), System.currentTimeMillis(), c1u.A08());
        }
    }

    private final boolean A08() {
        return this.A04;
    }

    private final boolean A09() {
        return (this.A00 & 2) != 0;
    }

    private final boolean A0A() {
        return (this.A00 & 1) != 0;
    }
}

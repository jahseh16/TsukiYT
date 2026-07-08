package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class EnumC0880Rh {
    public static byte[] A00;
    public static String[] A01 = {"nA8fLeyOwVmNwvq6aIqKxCaagHA5eYr", "8Z3ODqLNUnEAqB2P3Amw9Ur1PSsugik5", "YRmdf", "zIg3Ob9eurpeZ06C2uEHUxbrUPW1iO5", "DwODnBhAs5I9lGAPLwBjllp42Gjp41Mv", "6IL6kP5nz", "IHg6IZuYXxuMxytmBHiV", "YXmTZGEBqQ8NuPQvZDB03"};
    public static final /* synthetic */ EnumC0880Rh[] A02;
    public static final EnumC0880Rh A03;
    public static final EnumC0880Rh A04;
    public static final EnumC0880Rh A05;
    public static final EnumC0880Rh A06;
    public static final EnumC0880Rh A07;
    public static final EnumC0880Rh A08;

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-82, -33, -33, -50, -26, 110, -101, -101, -104, -111, -115, -102, -103, -60, -54, -73, -63, -70, 127, -92, -86, 101, 120, -128, 123, 121, -118, 123, -100, -102, -111, -106, -113, -99, -74, -77, -74, -73, -65, -74, 104, -68, -63, -72, -83, 104, -73, -82, 104, -78, -69, -73, -74, 104, -73, -86, -78, -83, -85, -68, 104, -77, -83, -63};
    }

    public abstract boolean A04(JSONArray jSONArray, int i);

    public abstract boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i);

    public abstract boolean A06(JSONObject jSONObject, String str);

    public abstract boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str);

    static {
        A03();
        final String strA02 = A02(0, 5, 105);
        final int i = 0;
        EnumC0880Rh enumC0880Rh = new EnumC0880Rh(strA02, i) { // from class: com.facebook.ads.redexgen.X.J6
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i5) {
                return jSONArray.optJSONArray(i5) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i5) {
                return AbstractC0881Ri.A00(jSONArray.optJSONArray(i5), jSONArray2.optJSONArray(i5));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONArray(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0881Ri.A00(jSONObject.optJSONArray(str), jSONObject2.optJSONArray(str));
            }
        };
        A03 = enumC0880Rh;
        final String strA022 = A02(5, 7, 40);
        final int i5 = 1;
        EnumC0880Rh enumC0880Rh2 = new EnumC0880Rh(strA022, i5) { // from class: com.facebook.ads.redexgen.X.In
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i8) {
                return jSONArray.optBoolean(i8, true) == jSONArray.optBoolean(i8, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i8) {
                return jSONArray.optBoolean(i8) == jSONArray2.optBoolean(i8);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optBoolean(str, true) == jSONObject.optBoolean(str, false);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optBoolean(str) == jSONObject2.optBoolean(str);
            }
        };
        A04 = enumC0880Rh2;
        final String strA023 = A02(12, 6, 81);
        final int i8 = 2;
        EnumC0880Rh enumC0880Rh3 = new EnumC0880Rh(strA023, i8) { // from class: com.facebook.ads.redexgen.X.ID
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i10) {
                return jSONArray.optInt(i10, 0) == jSONArray.optInt(i10, 1) && jSONArray.optDouble(i10, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONArray.optDouble(i10, 1.0d) && ((double) jSONArray.optInt(i10, 0)) != jSONArray.optDouble(i10, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i10) {
                return jSONArray.optDouble(i10) == jSONArray2.optDouble(i10);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) != jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optDouble(str) == jSONObject2.optDouble(str);
            }
        };
        A05 = enumC0880Rh3;
        final String strA024 = A02(18, 3, 50);
        final int i10 = 3;
        EnumC0880Rh enumC0880Rh4 = new EnumC0880Rh(strA024, i10) { // from class: com.facebook.ads.redexgen.X.I5
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i11) {
                return jSONArray.optInt(i11, 0) == jSONArray.optInt(i11, 1) && jSONArray.optDouble(i11, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONArray.optDouble(i11, 1.0d) && ((double) jSONArray.optInt(i11, 0)) == jSONArray.optDouble(i11, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i11) {
                return jSONArray.optInt(i11) == jSONArray2.optInt(i11);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optInt(str, 0) == jSONObject.optInt(str, 1) && jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) == jSONObject.optDouble(str, 1.0d) && ((double) jSONObject.optInt(str, 0)) == jSONObject.optDouble(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optInt(str) == jSONObject2.optInt(str);
            }
        };
        A06 = enumC0880Rh4;
        final String strA025 = A02(21, 6, 18);
        final int i11 = 4;
        EnumC0880Rh enumC0880Rh5 = new EnumC0880Rh(strA025, i11) { // from class: com.facebook.ads.redexgen.X.I4
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i12) {
                return jSONArray.optJSONObject(i12) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i12) {
                return AbstractC0881Ri.A02(jSONArray.optJSONObject(i12), jSONArray2.optJSONObject(i12));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optJSONObject(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return AbstractC0881Ri.A02(jSONObject.optJSONObject(str), jSONObject2.optJSONObject(str));
            }
        };
        A07 = enumC0880Rh5;
        final String strA026 = A02(27, 6, 36);
        final int i12 = 5;
        EnumC0880Rh enumC0880Rh6 = new EnumC0880Rh(strA026, i12) { // from class: com.facebook.ads.redexgen.X.Hx
            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A04(JSONArray jSONArray, int i13) {
                return jSONArray.optString(i13) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A05(JSONArray jSONArray, JSONArray jSONArray2, int i13) {
                return jSONArray.optString(i13).equals(jSONArray2.optString(i13));
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A06(JSONObject jSONObject, String str) {
                return jSONObject.optString(str) != null;
            }

            @Override // com.meta.analytics.dsp.uinode.EnumC0880Rh
            public final boolean A07(JSONObject jSONObject, JSONObject jSONObject2, String str) {
                return jSONObject.optString(str).equals(jSONObject2.optString(str));
            }
        };
        A08 = enumC0880Rh6;
        A02 = new EnumC0880Rh[]{enumC0880Rh, enumC0880Rh2, enumC0880Rh3, enumC0880Rh4, enumC0880Rh5, enumC0880Rh6};
    }

    public EnumC0880Rh(String str, int i) {
    }

    public static EnumC0880Rh A00(JSONArray jSONArray, int i) {
        for (EnumC0880Rh type : values()) {
            if (A01[1].charAt(14) != '2') {
                throw new RuntimeException();
            }
            A01[4] = "PUsgFaltT51mxPXWqnHKjq6lqfkoVDea";
            if (type.A04(jSONArray, i)) {
                return type;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0880Rh A01(JSONObject jSONObject, String str) {
        for (EnumC0880Rh enumC0880Rh : values()) {
            boolean zA06 = enumC0880Rh.A06(jSONObject, str);
            if (A01[5].length() != 9) {
                throw new RuntimeException();
            }
            A01[6] = "GmRRmI3tzaTgoS0GQtjO0";
            if (zA06) {
                return enumC0880Rh;
            }
        }
        throw new AssertionError(A02(33, 31, 68));
    }

    public static EnumC0880Rh valueOf(String str) {
        return (EnumC0880Rh) Enum.valueOf(EnumC0880Rh.class, str);
    }

    public static EnumC0880Rh[] values() {
        return (EnumC0880Rh[]) A02.clone();
    }
}

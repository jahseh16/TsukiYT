package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AnonymousClass17 {
    public static byte[] A00;
    public static String[] A01 = {"qHmRz", "buvn2cesYrN8zmkoMAJdpkbnyQRY3iAF", "x7vS8I9TWcDRkC3QyQGWlMzhObF4g2wW", "AIjy2jeTbkREqnWnmOA9dVfWABJZ", "IfUpOWHYsX9n2UOxpamTmBNI3XVXxi7a", "s9Ktc", "3piv7SWQV7vtTtwTZRFeo4G9v1NaSSob", "iW7v8IxehIW1LC67DBoujqNPrB3dw9pM"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static AnonymousClass14 A01(C1064Yn c1064Yn, JSONObject jSONObject, String str, boolean z, int i, int i5) {
        if (jSONObject == null) {
            return new AnonymousClass14();
        }
        L4.A02(c1064Yn, A02(0, 23, 77));
        String strOptString = jSONObject.optString(A02(371, 10, 84));
        int iOptInt = jSONObject.optInt(A02(116, 12, 73), 0);
        String strOptString2 = jSONObject.optString(A02(253, 13, 84));
        String strA02 = LJ.A02(jSONObject, A02(266, 12, 117));
        Uri uriA00 = TextUtils.isEmpty(strA02) ? null : AbstractC0715Ky.A00(strA02);
        String strA022 = LJ.A02(jSONObject, A02(128, 4, 27));
        String strA01 = LY.A01(strA022);
        String strA023 = LJ.A02(jSONObject, A02(101, 15, 115));
        String strA024 = LJ.A02(jSONObject, A02(485, 5, 93));
        String strA025 = LJ.A02(jSONObject, A02(477, 8, 5));
        String strA026 = LJ.A02(jSONObject, A02(278, 8, 19));
        String strA027 = LJ.A02(jSONObject, A02(431, 14, 38));
        String strA028 = LJ.A02(jSONObject, A02(295, 16, 116));
        String strA029 = LJ.A02(jSONObject, A02(445, 21, 93));
        String strA0210 = LJ.A02(jSONObject, A02(87, 14, 42));
        String strA0211 = LJ.A02(jSONObject, A02(351, 20, 77));
        String strA0212 = LJ.A02(jSONObject, A02(335, 16, 70));
        String strA0213 = LJ.A02(jSONObject, A02(318, 17, 98));
        String strA0214 = LJ.A02(jSONObject, A02(132, 14, 22));
        FT ftA02 = FT.A02(jSONObject, c1064Yn);
        JP jpA00 = JP.A00(jSONObject.optJSONObject(A02(286, 4, 64)));
        JP jpA002 = JP.A00(jSONObject.optJSONObject(A02(290, 5, 93)));
        JQ jqA00 = JQ.A00(jSONObject.optJSONObject(A02(466, 11, 125)));
        String strA0215 = LJ.A02(jSONObject, A02(490, 15, 84));
        boolean zOptBoolean = jSONObject.optBoolean(A02(238, 15, 6));
        boolean zOptBoolean2 = jSONObject.optBoolean(A02(219, 19, 21));
        int iOptInt2 = jSONObject.optInt(A02(406, 25, 21), 4);
        int iOptInt3 = jSONObject.optInt(A02(381, 25, 112), 0);
        int iOptInt4 = jSONObject.optInt(A02(569, 31, 30), 0);
        int iOptInt5 = jSONObject.optInt(A02(600, 26, 108), 1000);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(A02(53, 15, 6));
        JP jpA003 = jSONObjectOptJSONObject != null ? JP.A00(jSONObjectOptJSONObject) : null;
        String strA0216 = LJ.A02(jSONObject, A02(68, 19, 17));
        EnumC02230j enumC02230jA00 = AbstractC02250l.A00(jSONObject);
        Collection<String> collectionA03 = AbstractC02250l.A03(c1064Yn, jSONObject);
        String strA0217 = LJ.A02(jSONObject, A02(560, 9, 56));
        long jOptLong = jSONObject.optLong(A02(536, 24, 95), -1L);
        String strA0218 = LJ.A02(jSONObject, A02(527, 9, 77));
        String strA0219 = A02(505, 22, 61);
        JU ju = !jSONObject.has(strA0219) ? JU.A03 : jSONObject.optBoolean(strA0219) ? JU.A05 : JU.A04;
        boolean zOptBoolean3 = jSONObject.optBoolean(A02(190, 29, 72));
        int iOptInt6 = jSONObject.optInt(A02(154, 36, 110), 100);
        ArrayList arrayList = null;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A02(146, 8, 0));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                int length = jSONArrayOptJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                for (int i8 = 0; i8 < length; i8++) {
                    try {
                        arrayList2.add(A01(c1064Yn, jSONArrayOptJSONArray.getJSONObject(i8), str, true, i8, length));
                    } catch (JSONException e4) {
                        e = e4;
                        if (A01[6].charAt(19) != 'e') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A01;
                        strArr[0] = "nA4Cb";
                        strArr[5] = "npWbY";
                        arrayList = arrayList2;
                        c1064Yn.A07().A9a(A02(311, 7, 91), C8A.A2A, new C8B(e));
                        Log.e(C1182bK.A0E, A02(23, 30, 50), e);
                        return new AnonymousClass14(strA0216, strA01, strA022, strA023, strA024, strA025, strA026, strA027, strA028, strA029, strA0210, strA0211, strA0212, strA0213, strA0214, jpA003, ftA02, jpA00, jpA002, jqA00, strA0217, strA0218, jOptLong, ju, z, i, i5, arrayList, str, strOptString, iOptInt, strOptString2, uriA00, strA0215, zOptBoolean, zOptBoolean2, iOptInt3, iOptInt2, iOptInt4, iOptInt5, enumC02230jA00, collectionA03, iOptInt6, zOptBoolean3);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (JSONException e5) {
            e = e5;
        }
        return new AnonymousClass14(strA0216, strA01, strA022, strA023, strA024, strA025, strA026, strA027, strA028, strA029, strA0210, strA0211, strA0212, strA0213, strA0214, jpA003, ftA02, jpA00, jpA002, jqA00, strA0217, strA0218, jOptLong, ju, z, i, i5, arrayList, str, strOptString, iOptInt, strOptString2, uriA00, strA0215, zOptBoolean, zOptBoolean2, iOptInt3, iOptInt2, iOptInt4, iOptInt5, enumC02230jA00, collectionA03, iOptInt6, zOptBoolean3);
    }

    public static String A02(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, 50, 33, 38, 34, 43, 32, 34, -35, 11, 34, 49, 52, 44, 47, 40, -35, 9, 44, 30, 33, 34, 33, -9, 16, 3, 4, 14, 7, -62, 22, 17, -62, 18, 3, 20, 21, 7, -62, 5, 3, 20, 17, 23, 21, 7, 14, -62, 6, 3, 22, 3, -48, -41, -38, -43, -39, -34, -27, -33, -39, -37, -23, -43, -33, -39, -27, -28, -30, -27, -32, -28, -23, -16, -22, -28, -26, -12, -32, -19, -22, -17, -20, -32, -10, -13, -19, -5, -2, -7, 14, 12, -5, 8, 13, 6, -5, 14, 3, 9, 8, 68, 71, 89, 72, 85, 87, 76, 86, 72, 85, 66, 81, 68, 80, 72, 26, 39, 24, 37, 40, 32, 40, 24, 45, 50, 41, 30, -19, -6, -17, 4, -23, -25, -14, -14, -27, -6, -11, -27, -25, -23, -6, -17, -11, -12, -45, -47, -30, -33, -27, -29, -43, -36, 65, 77, 76, 82, 63, 71, 76, 67, 80, 61, 84, 71, 67, 85, 63, 64, 71, 74, 71, 82, 87, 61, 65, 70, 67, 65, 73, 61, 71, 76, 82, 67, 80, 84, 63, 74, 27, 39, 38, 44, 25, 33, 38, 29, 42, 23, 46, 33, 29, 47, 25, 26, 33, 36, 33, 44, 49, 23, 29, 38, 25, 26, 36, 29, 28, -22, -13, -26, -25, -15, -22, -28, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -37, -28, -41, -40, -30, -37, -43, -20, -33, -37, -19, -43, -30, -27, -35, 41, 50, 39, 54, 61, 52, 56, 41, 40, 35, 39, 52, 49, 75, 71, 70, 73, 68, 72, 84, 82, 82, 70, 83, 73, -21, -24, -28, -25, -17, -20, -15, -24, 25, 19, 31, 30, 54, 58, 46, 52, 50, 80, 77, 82, 79, 67, 72, 73, 87, 71, 86, 77, 84, 88, 77, 83, 82, 59, 44, 61, 62, 52, 57, 50, 66, 51, 71, 69, 55, 49, 70, 68, 51, 64, 69, 62, 51, 70, 59, 65, 64, 38, 34, 23, 47, 21, 42, 40, 23, 36, 41, 34, 23, 42, 31, 37, 36, 45, 47, 44, 42, 44, 49, 34, 33, 28, 49, 47, 30, 43, 48, 41, 30, 49, 38, 44, 43, 54, 41, 53, 57, 41, 55, 56, 35, 45, 40, 83, 78, 65, 80, 83, 72, 79, 84, 63, 67, 79, 77, 80, 82, 69, 83, 83, 63, 81, 85, 65, 76, 73, 84, 89, -8, -13, -26, -11, -8, -19, -12, -7, -28, -15, -12, -20, -28, -23, -22, -15, -26, -2, -28, -8, -22, -24, -12, -13, -23, 9, 5, -7, -1, -9, 2, -11, -7, 5, 4, 10, -5, 14, 10, 64, 61, 60, 59, 64, 60, 63, 50, 49, 44, 65, 63, 46, 59, 64, 57, 46, 65, 54, 60, 59, 96, 97, 78, 95, 76, 95, 78, 97, 86, 91, 84, -24, -22, -41, -23, -34, -23, -31, -38, 65, 54, 65, 57, 50, 57, 55, 41, 40, 35, 54, 41, 52, 51, 54, 56, 35, 57, 54, 48, 35, 22, 17, 18, 28, 12, 14, 34, 33, 28, 29, 25, 14, 38, 12, 18, 27, 14, 15, 25, 18, 17, 51, 38, 33, 34, 44, 28, 42, 45, 33, 69, 56, 51, 52, 62, 46, 63, 65, 52, 59, 62, 48, 51, 46, 66, 56, 73, 52, 46, 49, 72, 67, 52, 66, 30, 17, 12, 13, 23, 7, 29, 26, 20, 4, -9, -13, 5, -17, -16, -9, -6, -9, 2, 7, -19, -15, -10, -13, -15, -7, -19, -9, -4, -9, 2, -9, -17, -6, -19, -14, -13, -6, -17, 7, 82, 69, 65, 83, 61, 62, 69, 72, 69, 80, 85, 59, 63, 68, 65, 63, 71, 59, 69, 74, 80, 65, 78, 82, 61, 72};
        String[] strArr = A01;
        if (strArr[1].charAt(29) != strArr[4].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aYUm7";
        strArr2[5] = "aSssW";
    }

    static {
        A03();
    }

    public static AnonymousClass14 A00(C1064Yn c1064Yn, JSONObject jSONObject, String str) {
        return A01(c1064Yn, jSONObject, str, false, -1, 0);
    }
}

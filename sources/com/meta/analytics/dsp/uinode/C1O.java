package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C1O {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{43, 41, 58, 55, 61, 59, 45, 52, -39, -54, -37, -36, -46, -41, -48, 46, 33, 28, 29, 39, 23, 45, 42, 36};
    }

    public static List<C1G> A01(JSONArray jSONArray, JSONObject jSONObject, C1064Yn c1064Yn, C1S c1s) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (i == 0) {
                    A03(jSONObject2, jSONObject);
                }
                C1G c1gA00 = C1G.A00(jSONObject2);
                c1s.A3N(c1gA00, jSONObject2);
                arrayList.add(c1gA00);
            } catch (JSONException e4) {
                c1064Yn.A07().A9a(A00(8, 7, 31), C8A.A2B, new C8B(e4));
            }
        }
        return arrayList;
    }

    public static void A03(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals(A00(15, 9, 110)) && !next.equals(A00(0, 8, 126)) && !jSONObject.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
    }
}

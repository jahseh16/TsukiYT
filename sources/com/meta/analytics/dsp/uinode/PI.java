package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PI implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ PM A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{108, 64, 90, 67, 75, 15, 65, 64, 91, 15, 95, 78, 93, 92, 74, 15, 92, 74, 93, 89, 74, 93, 15, 66, 74, 92, 92, 78, 72, 74, 123, 76, 76, 81, 76, 30, 78, 95, 76, 77, 87, 80, 89, 30, 116, 109, 113, 112, 30, 87, 80, 30, 78, 81, 77, 74, 115, 91, 77, 77, 95, 89, 91, 30, 103, 115, 114, 110, 77, 99, 127, 32, 61, 49, 55, 36, 26, 33, 36, 49, 36, 108, 97, 104, 125, 28, 26};
    }

    public PI(PM pm2, String str) {
        this.A00 = pm2;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(this.A01);
                if (this.A00.A05.equals(jSONObject.optString(A00(64, 7, 47)))) {
                    this.A00.A0C(PK.A00(jSONObject.optString(A00(81, 4, 49))), jSONObject.optString(A00(71, 10, 108), A00(85, 2, 78)));
                } else {
                    this.A00.A04.A04(C8A.A11, A00(0, 30, 6));
                }
            } catch (JSONException e4) {
                this.A00.A04.A04(C8A.A15, A00(30, 34, 23) + e4.getMessage());
            }
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}

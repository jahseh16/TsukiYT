package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z5 extends KT {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass62 A00;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{62, 44, 44, 58, 43, 44};
    }

    public Z5(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        try {
            JSONArray jSONArray = this.A00.A05.getJSONArray(A00(0, 6, 77));
            for (int i = 0; i < jSONArray.length(); i++) {
                AnonymousClass60 assetData = AnonymousClass60.A00(jSONArray.getJSONObject(i));
                this.A00.A09(assetData.A04, assetData);
            }
            this.A00.A02.A0W(new Z7(this), new C6V(this.A00.A04, this.A00.A03));
        } catch (JSONException unused) {
            this.A00.A00.post(new Z6(this));
        }
    }
}

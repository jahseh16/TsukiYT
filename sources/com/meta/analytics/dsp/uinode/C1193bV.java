package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1193bV extends KT {
    public static byte[] A02;
    public final /* synthetic */ C02350w A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C1193bV(C02350w c02350w, JSONObject jSONObject) {
        this.A00 = c02350w;
        this.A01 = jSONObject;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        try {
            this.A00.A05.await();
            synchronized (this.A00.A02) {
                this.A00.A02.A0B(this.A01);
                this.A00.A06.countDown();
            }
        } catch (InterruptedException e4) {
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1B, new C8B(e4));
        } catch (JSONException e5) {
            this.A00.A0M();
            this.A00.A03.A07().A9a(A00(0, 17, 116), C8A.A1A, new C8B(e5));
        }
    }
}

package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0977Vb implements InterfaceC0884Rl {
    public static byte[] A02;
    public final /* synthetic */ C1063Ym A00;
    public final /* synthetic */ InterfaceC0882Rj A01;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0977Vb(InterfaceC0882Rj interfaceC0882Rj, C1063Ym c1063Ym) {
        this.A01 = interfaceC0882Rj;
        this.A00 = c1063Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0884Rl
    public final void A45() {
        try {
            C0653Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e4) {
            this.A00.A07().A3c(e4);
        }
    }
}

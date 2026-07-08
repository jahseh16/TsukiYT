package com.meta.analytics.dsp.uinode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FU extends AbstractC1167b5 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public FU(List<C1G> list) {
        super(list);
    }

    public static FU A02(JSONObject jSONObject, C1064Yn c1064Yn) {
        FU fu = new FU(AbstractC1167b5.A08(jSONObject, c1064Yn, new C1164b2()));
        fu.A16(jSONObject);
        fu.A0b(A03(0, 12, 67));
        return fu;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0F() {
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0G() {
        return 0;
    }
}

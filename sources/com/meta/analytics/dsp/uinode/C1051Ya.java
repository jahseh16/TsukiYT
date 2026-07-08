package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1051Ya extends KT {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ C1063Ym A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{91, 108, 99, 40, 123, 125, 107, 107, 109, 123, 123, 110, 125, 100, 100, 113, 40, 97, 102, 97, 124, 97, 105, 100, 97, 114, 109, 108, 41};
    }

    public C1051Ya(C1063Ym c1063Ym, AudienceNetworkAds.InitListener initListener) {
        this.A01 = c1063Ym;
        this.A00 = initListener;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        try {
            YL.A02().A0C(this.A01);
        } catch (Throwable th) {
            this.A01.A07().A3c(th);
        }
        C8Y.A0C(this.A01);
        AudienceNetworkAds.InitListener initListener = this.A00;
        if (initListener != null) {
            C8Y.A04(initListener, new C8X(true, A00(0, 29, 0)));
        }
    }
}

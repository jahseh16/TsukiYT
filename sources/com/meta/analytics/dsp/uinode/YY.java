package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AudienceNetworkAds;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YY extends KT {
    public static byte[] A02;
    public final /* synthetic */ AudienceNetworkAds.InitListener A00;
    public final /* synthetic */ AudienceNetworkAds.InitResult A01;

    static {
        A02();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{22, 22, 70, 65, 21, 71, 20, 23, 94, 73, 70, 45, 100, 99, 100, 121, 100, 108, 97, 100, 119, 108, 121, 100, 98, 99, 45, 110, 98, 96, 125, 97, 104, 121, 104, 69, 66, 89, 100, 86, 81, 82};
    }

    public YY(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        this.A00 = initListener;
        this.A01 = initResult;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AbstractC0683Jp.A05(A00(35, 7, 113), A00(8, 27, 75), A00(0, 8, 100));
        this.A00.onInitialized(this.A01);
    }
}

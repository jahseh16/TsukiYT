package com.meta.analytics.dsp.uinode;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1128aS extends AbstractC02290q {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C1126aQ A00;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C1128aS(C1126aQ c1126aQ) {
        this.A00 = c1126aQ;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A06() {
        this.A00.A08.onRewardServerFailed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A07() {
        this.A00.A08.onRewardServerSuccess();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A08() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoCompleted();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A09() {
        if (this.A00.A03 == null) {
            this.A00.A08.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0A() {
        if (this.A00.A03 != null) {
            C03665z c03665z = (C03665z) this.A00.A03.buildShowAdConfig();
            c03665z.A02(System.currentTimeMillis() - this.A00.A02);
            this.A00.A03.show(c03665z.build());
            return;
        }
        this.A00.A08.onRewardedVideoClosed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0C() {
        this.A00.A07.A0E().A2j();
        this.A00.A08.onAdClicked(this.A00.A09.A00());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0D() {
        this.A00.A08.onLoggingImpression(this.A00.A09.A00());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0F(InterfaceC02280p interfaceC02280p) {
        if (this.A00.A05 == null) {
            this.A00.A07.A07().A9a(A00(0, 3, 70), C8A.A0N, new C8B(A00(3, 18, 43)));
            return;
        }
        AbstractC1171b9 abstractC1171b9 = (AbstractC1171b9) interfaceC02280p;
        if (this.A00.A09.A03 != null) {
            abstractC1171b9.A02(this.A00.A09.A03);
        }
        C2F c2f = this.A00.A09;
        int iA0G = abstractC1171b9.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        c2f.A00 = iA0G;
        this.A00.A06 = true;
        C1126aQ c1126aQ = this.A00;
        c1126aQ.A04 = c1126aQ.A05.A0G();
        if (this.A00.A04 != null) {
            int iA0v = 0;
            if (!this.A00.A04.A0j()) {
                iA0v = ((AbstractC1167b5) this.A00.A04).A0v();
            }
            if (iA0v > 0) {
                C0716Kz c0716Kz = new C0716Kz();
                if (c0716Kz.A09(this.A00.A07, this.A00.A09.A06, iA0v)) {
                    c0716Kz.A08(this.A00.A07, true);
                    C1126aQ c1126aQ2 = this.A00;
                    c1126aQ2.A03 = c0716Kz.A07(c1126aQ2.A07, this.A00.A09.A0D, this.A00.A09.A06);
                } else {
                    C1126aQ c1126aQ3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        c0716Kz.A08(c1126aQ3.A07, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        c0716Kz.A08(c1126aQ3.A07, false);
                    }
                }
            }
        }
        if (this.A00.A03 != null) {
            ((AbstractC1167b5) this.A00.A04).A17(true);
            RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = this.A00.A03.buildLoadAdConfig().withFailOnCacheFailureEnabled(true).withRewardData(this.A00.A04.A0J()).withAdExperience(this.A00.A09.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.25
                public final void onAdClicked(Ad ad2) {
                }

                public final void onAdLoaded(Ad ad2) {
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A00());
                }

                public final void onError(Ad ad2, AdError adError) {
                    this.A00.A00.A03 = null;
                    ((AbstractC1167b5) this.A00.A00.A04).A17(false);
                    this.A00.A00.A08.onAdLoaded(this.A00.A00.A09.A00());
                }

                public final void onLoggingImpression(Ad ad2) {
                }

                public final void onRewardedVideoClosed() {
                    this.A00.A00.A08.onRewardedVideoClosed();
                }

                public final void onRewardedVideoCompleted() {
                    this.A00.A00.A08.onRewardedVideoCompleted();
                }
            }).build();
            this.A00.A03.loadAd(loadAdConfig);
            return;
        }
        this.A00.A08.onAdLoaded(this.A00.A09.A00());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC02290q
    public final void A0G(C0670Jb c0670Jb) {
        this.A00.A0D(true);
        this.A00.A09.A0B.A0E().A2m(C0722Lf.A01(this.A00.A01), c0670Jb.A03().getErrorCode(), c0670Jb.A04());
        this.A00.A08.onError(this.A00.A09.A00(), L1.A00(c0670Jb));
    }
}

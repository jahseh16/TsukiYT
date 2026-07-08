package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03645x implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"q8F3UYcndC8Ej6EzPObAfC2CDIoe743", "WHSSbjkejcnDJnmz9i28DmVQ7s5doV", "7Ae3C11G9ZnRQnjC1YEsbkjNlyvjMOhJ", "xIErM25UzhDXOZX5lXVK71ghnZu2uIsx", "TpWxEHvEZyAqJcOvGEooXr2tQ3t7MLKT", "CpjtrdZmrEbCE1OZgZlStH8uGVShpb", "AnU5GMoet7ZaRK4jG6aRRqRoHnPXG1EV", "P"};
    public final Ad A00;
    public final C2F A01;
    public final FE A02;
    public final C1064Yn A03;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{118, 114, 114, -92, -89, 114, 118, 117, -92, -89, -94, -42, -93, -42, -47, -46, -123, -127, -121, -124, -78, -126, 126, -123, 76, 77, 73, 122, 76, 123, 73, 78, 82, 119, 125, 110, 123, 119, 106, 117, 41, 110, 123, 123, 120, 123, 55, 19, -51, -32, -14, -36, -19, -33, -32, -33, -101, -15, -28, -33, -32, -22, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -81, -62, -44, -66, -49, -63, -62, -63, 125, -45, -58, -63, -62, -52, 125, -66, -63, 125, -55, -52, -66, -63, 125, -49, -62, -50, -46, -62, -48, -47, -62, -63, -63, -44, -26, -48, -31, -45, -44, -45, -113, -27, -40, -45, -44, -34, -113, -48, -45, -113, -30, -41, -34, -26, -113, -46, -48, -37, -37, -44, -45, -86, -85, -71, -70, -72, -75, -65, -84, -81, -95, -92, -127, -92, -43, -54, -47, -39};
    }

    static {
        A01();
    }

    public C03645x(Context context, String str, Ad ad2) {
        this.A00 = ad2;
        String string = UUID.randomUUID().toString();
        C1064Yn c1064YnA07 = C03435c.A07(context, string);
        this.A03 = c1064YnA07;
        C0S c0sA0E = c1064YnA07.A0E();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        c0sA0E.A2s(adId, str);
        C2F c2f = new C2F(c1064YnA07, str, ad2, new C1135aZ());
        this.A01 = c2f;
        c1064YnA07.A0L(this);
        this.A02 = new FE(c2f, string);
    }

    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C03655y m17buildLoadAdConfig() {
        return new C03655y(this);
    }

    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C03665z m18buildShowAdConfig() {
        return new C03665z();
    }

    public final void A04() {
        if (C0653Ih.A1s(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A2t();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0E().A2l(rewardedVideoAdListener != null);
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0E().A2p();
        } else {
            C1064Yn c1064Yn = this.A03;
            if (A05[1].length() != 30) {
                throw new RuntimeException();
            }
            A05[1] = "VbNMcinO8suVZXvBDeNnaTURWjAwCx";
            c1064Yn.A0E().A2o();
        }
        this.A02.A0D(this.A00, str, adExperienceType, z);
        this.A03.A0E().A2n();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0E().A2y();
        boolean zA0H = this.A02.A0H(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0E().A2x(zA0H);
        return zA0H;
    }

    public final void destroy() {
        AbstractC0683Jp.A05(A00(136, 7, 66), A00(48, 27, 119), A00(16, 8, 74));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    public final String getPlacementId() {
        return this.A01.A0D;
    }

    public final int getVideoDuration() {
        return this.A01.A00;
    }

    public final boolean isAdInvalidated() {
        boolean zA0F = this.A02.A0F();
        this.A03.A0E().A4s(zA0F);
        return zA0F;
    }

    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    public final void loadAd() {
        AbstractC0683Jp.A05(A00(143, 6, 60), A00(75, 32, 89), A00(24, 8, 17));
        A07(null, null, true);
    }

    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C03655y) rewardedVideoLoadAdConfig).A00();
    }

    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(2001, A00(32, 16, 5) + LW.A03(this.A01.A0B, th)));
        }
    }

    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    public final boolean show() {
        AbstractC0683Jp.A05(A00(149, 4, 94), A00(107, 29, 107), A00(0, 8, 62));
        return A08(new C03665z().withAppOrientation(-1).build());
    }

    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC0683Jp.A05(A00(149, 4, 94), A00(107, 29, 107), A00(8, 8, 108));
        return A08(rewardedVideoShowAdConfig);
    }
}

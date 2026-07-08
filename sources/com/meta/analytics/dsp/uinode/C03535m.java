package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03535m implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C1142ag A02;
    public String A03;
    public final int A06;
    public final C1064Yn A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C03535m(Context context, String str, int i) {
        this.A07 = C03435c.A03(context);
        this.A08 = str;
        this.A06 = Math.max(i, 0);
        this.A09 = new ArrayList(i);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C1142ag A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A04 = z;
    }

    public final void disableAutoRefresh() {
        this.A05 = true;
        C1142ag c1142ag = this.A02;
        if (c1142ag != null) {
            c1142ag.A06();
        }
    }

    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    public final boolean isLoaded() {
        return this.A04;
    }

    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC0674Jg enumC0674Jg = EnumC0674Jg.A05;
        int i = this.A06;
        C1142ag c1142ag = this.A02;
        C1142ag c1142ag2 = new C1142ag(this.A07, this.A08, enumC0674Jg, null, i);
        this.A02 = c1142ag2;
        if (this.A05) {
            c1142ag2.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new ZA(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        List<NativeAd> list = this.A09;
        int pos = list.size();
        NativeAdBase nativeAdBase = (NativeAd) list.get(i % pos);
        if (nativeAdListener != null) {
            ((V2) nativeAdBase.getInternalNativeAd()).A1R(nativeAdBase, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i >= pos2) {
            return new NativeAd(this.A07, nativeAdBase);
        }
        return nativeAdBase;
    }

    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}

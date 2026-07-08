package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0758Mp {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (LD.A02 * 200.0f);
    public static final int A03 = (int) (LD.A02 * 200.0f);
    public static final int A02 = (int) (LD.A02 * 50.0f);

    public static AnonymousClass13 A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return AnonymousClass13.A05;
        }
        if (A03(nativeAdLayout)) {
            return AnonymousClass13.A06;
        }
        return AnonymousClass13.A04;
    }

    public static AbstractC0757Mo A01(C1064Yn c1064Yn, J2 j22, String str, NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int h3 = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h3 >= i && w >= i) {
            return new U4(c1064Yn, j22, str);
        }
        if (h3 < A03 || w < A02) {
            return null;
        }
        return new U5(c1064Yn, j22, str);
    }

    public static U6 A02(C1064Yn c1064Yn, J2 j22, String str, C02391a c02391a, MD md, MC mc) {
        return new U6(c1064Yn, j22, str, c02391a, md, mc);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h3 = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w = A01;
        if (h3 < w || height < w) {
            if (h3 >= A03) {
                int i = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (height < i) {
                }
            }
            return true;
        }
        return false;
    }
}

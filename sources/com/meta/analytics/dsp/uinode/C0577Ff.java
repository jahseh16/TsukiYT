package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0577Ff extends AbstractC1197bZ {
    public static byte[] A03;
    public static String[] A04 = {"OXbCEMjwdPN5xvU2NT0kKgep5UeL1Sqr", "SX0ygsPxRN6KiRybC8JMsMv996SDI", "L77PzfY5dGd9ppcaJeqEYdg5mL", "qaE4mxmFDXDzve4pMTR5s0xQhV", "rrEUCxltihDw1phZ7LTyezPpJ6vgfWBl", "FdpTQfSalwXKw6iuOYHl49ZbqEAaQDuv", "IFg4N7XoM6S2Rxr", "IzcF2xeWDVSzXIhxKqlgaOjlVHZ1W1Z3"};
    public Map<String, String> A00;
    public boolean A01;
    public final Uri A02;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {104, 109, 106, 111, 37, 34, 57, 36, 51, 9, 35, 36, 58, 9, 33, 51, 52, 9, 48, 55, 58, 58, 52, 55, 53, 61};
        if (A04[5].charAt(30) != 'u') {
            throw new RuntimeException();
        }
        A04[5] = "82m81CO1d0OwjHPL38rD7xdABiLQ6kup";
        A03 = bArr;
    }

    static {
        A01();
    }

    public C0577Ff(C1064Yn c1064Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1064Yn, j22, str, null, true, true);
        this.A02 = uri;
        this.A00 = mExtraData;
    }

    public C0577Ff(C1064Yn c1064Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, boolean z) {
        this(c1064Yn, j22, str, uri, mExtraData);
        this.A01 = z;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1197bZ
    public final EnumC02200g A0D() {
        A0E(this.A00, null);
        return EnumC02200g.A08;
    }

    public final Uri A0G() {
        String queryParameter = this.A02.getQueryParameter(A00(4, 22, 70));
        if (this.A01 && !TextUtils.isEmpty(queryParameter)) {
            return AbstractC0715Ky.A00(queryParameter);
        }
        Uri uri = this.A02;
        String url = A00(0, 4, 20);
        return AbstractC0715Ky.A00(uri.getQueryParameter(url));
    }
}

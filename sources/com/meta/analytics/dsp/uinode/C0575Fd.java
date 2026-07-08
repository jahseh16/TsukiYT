package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0575Fd extends AbstractC1197bZ {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{122, 93, 85, 80, 89, 88, 28, 72, 83, 28, 83, 76, 89, 82, 28, 80, 85, 82, 87, 28, 73, 78, 80, 6, 28, 43, 46, 41, 44};
    }

    static {
        A01();
        A03 = C0575Fd.class.getSimpleName();
    }

    public C0575Fd(C1064Yn c1064Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02270o c02270o, boolean z) {
        super(c1064Yn, j22, str, c02270o, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1197bZ
    public final EnumC02200g A0D() {
        EnumC02200g enumC02200gA0G = EnumC02200g.A08;
        if (((AbstractC1197bZ) this).A02) {
            enumC02200gA0G = A0G();
        }
        A0E(this.A01, enumC02200gA0G);
        return enumC02200gA0G;
    }

    public final EnumC02200g A0G() {
        EnumC02200g enumC02200g = EnumC02200g.A08;
        try {
            C0712Kv.A0C(new C0712Kv(), ((AbstractC02210h) this).A00, AbstractC0715Ky.A00(this.A00.getQueryParameter(A00(25, 4, 8))), ((AbstractC02210h) this).A02);
            return enumC02200g;
        } catch (Exception unused) {
            String str = A00(0, 25, 115) + this.A00.toString();
            return EnumC02200g.A03;
        }
    }
}

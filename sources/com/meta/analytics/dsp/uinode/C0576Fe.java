package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0576Fe extends AbstractC1197bZ {
    public static byte[] A02;
    public static String[] A03 = {"EO73VH", "Qgz5bq7vpM6wgaeZrwJ0N", "K0RixItTLV229tIQ9volfY9Fr2yfBG4Z", "0XJd0xzB9RaoqzSBbOWrwbmO5Qd7B1Hm", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "cDFQfUnzrKwrnb1BC8KnyL9IHyRAK9fC", "Q7Q0M0vYffDRrtcuJmKxnq", "hygqtGcON2Cep"};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {14, 41, 49, 52, 45, 44, -24, 60, 55, -24, 55, 56, 45, 54, -24, 52, 49, 54, 51, -24, 61, 58, 52, 2, -24, -14, -17, -12, -15};
        if (A03[0].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[3] = "z2LBMWL3UZ6mgEOfq1wT6wdWGhdUBaxY";
        strArr[2] = "LNV6u0tAGiEAXpu6l5ZCQkq7c5KJBKxy";
        A02 = bArr;
    }

    static {
        A01();
        A04 = C0576Fe.class.getSimpleName();
    }

    public C0576Fe(C1064Yn c1064Yn, J2 j22, String str, Uri uri, Map<String, String> mExtraData, C02270o c02270o, boolean z) {
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
        if (!AbstractC0731Lo.A0e(((AbstractC02210h) this).A00, enumC02200gA0G, this.A01)) {
            A0E(this.A01, enumC02200gA0G);
        }
        return enumC02200gA0G;
    }

    public final EnumC02200g A0G() {
        if (A0F(this.A00)) {
            EnumC02200g actionOutcome = EnumC02200g.A09;
            return actionOutcome;
        }
        try {
            EnumC02200g actionOutcome2 = C0712Kv.A05(new C0712Kv(), ((AbstractC02210h) this).A00, AbstractC0715Ky.A00(this.A00.getQueryParameter(A00(25, 4, 35))), ((AbstractC02210h) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 101) + this.A00.toString();
            EnumC02200g actionOutcome3 = EnumC02200g.A03;
            return actionOutcome3;
        }
    }
}

package com.meta.analytics.dsp.uinode;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0578Fg extends AbstractC1197bZ {
    public static byte[] A04;
    public static String[] A05 = {"eZwrQOnpnpQE2xbRo0zNjy7tlobdqdqH", "SFt7WwZUn", "NjRPf9lXQVcUlHZaPZ2tHyzwDKEOZm5m", "vsw9aGbGyLBdbL44W3z8tEYPUFR7w9", "bZApvv", "GYK1wV", "jBSwIULngy0dc0IzE6SbgF9ev3BAFzHy", "9HFC3JFq8"};
    public static final String A06;
    public OG A00;
    public final Uri A01;
    public final C1U A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            int i11 = (bArrCopyOfRange[i10] - i8) - 27;
            String[] strArr = A05;
            if (strArr[6].charAt(23) == strArr[0].charAt(23)) {
                throw new RuntimeException();
            }
            A05[3] = "uqLwDcTKX4SWJds2FMBMp5QNw2MnWtU";
            bArrCopyOfRange[i10] = (byte) i11;
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<C02260m> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<C02260m> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{106, -105, -105, -108, -105, 69, -107, -122, -105, -104, -114, -109, -116, 69, -122, -107, -107, -104, -114, -103, -118, -124, -119, -122, -103, -122, -124, -97, -89, -86, -93, -94, 94, -78, -83, 94, -83, -82, -93, -84, 94, -85, -97, -80, -87, -93, -78, 94, -77, -80, -86, 120, 94, -29, -27, -5, 8, -2, 12, 9, 3, -2, -108, -95, -105, -91, -94, -100, -105, 97, -100, -95, -89, -104, -95, -89, 97, -108, -106, -89, -100, -94, -95, 97, 119, 124, 116, 127, -94, -81, -91, -77, -80, -86, -91, 111, -86, -81, -75, -90, -81, -75, 111, -94, -92, -75, -86, -80, -81, 111, -105, -118, -122, -104, -8, 7, 7, 10, 0, 11, -4, -10, -5, -8, 11, -8, -3, -15, 2, -5, -11, 4, -54, -65, -65, -12, -11, 4, -15, -7, -4, 3, -49, -7, -12, -51, -75, 3, -26, -25, -36, -27, -36, -37, -42, -37, -36, -36, -25, -29, -32, -27, -30, -108, -107, -118, -109, -118, -119, -124, -104, -103, -108, -105, -118, -124, -117, -122, -111, -111, -121, -122, -120, -112, -124, -102, -105, -111, -38, -37, -48, -39, -48, -49, -54, -34, -33, -38, -35, -48, -54, -32, -35, -41, -70, -85, -68, -67, -77, -72, -79, -51, -50, -55, -52, -65, -71, -61, -66, -10, -9, -14, -11, -24, -30, -8, -11, -17, -96, -95, -100, -97, -110, -116, -94, -97, -103, -116, -92, -110, -113, -116, -109, -114, -103, -103, -113, -114, -112, -104, -90, -105, -98, 108, -72, -87, -80, -76, -74, -77, -79, -76, -72, 126, -61, -63, -77, -64, -83, -80, -61, -76, -76, -77, -64, -77, -78, -83, -60, -73, -78, -77, -67, -83, -79, -70, -73, -79, -71};
    }

    static {
        A07();
        A06 = C0578Fg.class.getSimpleName();
    }

    public C0578Fg(C1064Yn c1064Yn, J2 j22, String str, Uri uri, Map<String, String> extraData, C02270o c02270o, boolean z, C1U c1u) {
        super(c1064Yn, j22, str, c02270o, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c1u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r4.startsWith(r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(com.meta.analytics.dsp.uinode.C02260m r10) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C0578Fg.A00(com.facebook.ads.redexgen.X.0m):android.content.Intent");
    }

    private Intent A01(C02260m c02260m) {
        Intent intent = new Intent(A04(88, 26, 38));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c02260m.A05()) && !TextUtils.isEmpty(c02260m.A04())) {
            intent.setComponent(new ComponentName(c02260m.A05(), c02260m.A04()));
        }
        if (!TextUtils.isEmpty(c02260m.A03())) {
            intent.setData(AbstractC0715Ky.A00(c02260m.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(219, 9, 104));
        if (!TextUtils.isEmpty(queryParameter)) {
            return AbstractC0715Ky.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(211, 8, 63);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 117);
        return AbstractC0715Ky.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC02200g A03() throws C0700Kh {
        C0712Kv c0712Kv = new C0712Kv();
        try {
            return C0712Kv.A05(c0712Kv, ((AbstractC02210h) this).A00, A02(), ((AbstractC02210h) this).A02, this.A03);
        } catch (C0700Kh unused) {
            String str = A04(26, 27, 35) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 18));
            if (queryParameter != null && queryParameter.length() > 0) {
                C0712Kv.A0D(c0712Kv, ((AbstractC02210h) this).A00, AbstractC0715Ky.A00(queryParameter), ((AbstractC02210h) this).A02);
            }
            return EnumC02200g.A08;
        }
    }

    private List<C02260m> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 124));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 109);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 127);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    C02260m c02260mA00 = C02260m.A00(jSONArrayOptJSONArray.optJSONObject(i));
                    if (c02260mA00 != null) {
                        arrayList.add(c02260mA00);
                    }
                }
            }
        } catch (JSONException e4) {
            AnonymousClass89 anonymousClass89A07 = ((AbstractC02210h) this).A00.A07();
            int i5 = C8A.A24;
            C8B c8b = new C8B(e4);
            String appsiteDataString3 = A04(204, 7, 47);
            anonymousClass89A07.A9a(appsiteDataString3, i5, c8b);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 10);
            Log.w(str, appsiteDataString4, e4);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (C0702Kj.A0C(((AbstractC02210h) this).A00, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C1064Yn c1064Yn, String str) {
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            boolean zA1g = C0653Ih.A1g(c1064Yn);
            if (A05[3].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "1LqNNd92i";
            strArr[1] = "QkgxMECyk";
            if (zA1g) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1197bZ
    public final EnumC02200g A0D() {
        OG og;
        EnumC02200g enumC02200gA0G = EnumC02200g.A08;
        if (((AbstractC1197bZ) this).A02) {
            enumC02200gA0G = A0G();
        } else {
            this.A03.put(A04(188, 16, 80), String.valueOf(true));
        }
        if (!AbstractC0731Lo.A0e(((AbstractC02210h) this).A00, enumC02200gA0G, this.A03)) {
            A0E(this.A03, enumC02200gA0G);
            C1U.A06(this.A02, ((AbstractC02210h) this).A00);
        } else {
            EnumC02200g enumC02200g = EnumC02200g.A07;
            if (A05[2].charAt(11) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "cFM2nXNzq";
            strArr[1] = "5qRqyCpR9";
            if (enumC02200gA0G != enumC02200g && (og = this.A00) != null) {
                og.A0B(A04(264, 25, 51), this.A02, ((AbstractC02210h) this).A02);
            }
        }
        return enumC02200gA0G;
    }

    public final EnumC02200g A0G() {
        EnumC02200g enumC02200gA03 = EnumC02200g.A08;
        String strA04 = A04(148, 15, 92);
        boolean zA0F = A0F(this.A01);
        if (!zA0F) {
            zA0F = A08();
        }
        if (!zA0F) {
            try {
                enumC02200gA03 = A03();
                if (enumC02200gA03 != EnumC02200g.A08) {
                    strA04 = A04(188, 16, 80);
                } else {
                    strA04 = A04(163, 25, 10);
                }
            } catch (Exception unused) {
                enumC02200gA03 = EnumC02200g.A03;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(strA04, redirectionAction);
        return enumC02200gA03;
    }

    public final void A0H(OG og) {
        this.A00 = og;
    }
}

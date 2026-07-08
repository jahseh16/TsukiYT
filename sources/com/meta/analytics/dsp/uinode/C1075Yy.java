package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1075Yy implements AnonymousClass66 {
    public static byte[] A03;
    public static String[] A04 = {"Yyt8Jrp", "FvQHlihhdkZe9tXm7YLHdG4gIBqm", "h7ITXytSbKbsxwMfZDKdUPEvMsTrizAq", "0TuNzKSIMRKA8K3EzRQL94hbriXTa7QT", "ySuQOOQJHVodSpCznPaDLfXVVxuxvbGA", "XYB8XYCfCTfWBGtKG07Wi1HuHmIQx2qC", "71D0xe3tljOi7f3b0iOVOXaXnoSWhNo4", "dwdYeokke3ChTNA3vTF4hdqHGwVronGN"};
    public final InterfaceC0882Rj A01;
    public Set<AnonymousClass69> A00 = new HashSet();
    public final List<AnonymousClass68> A02 = new ArrayList();

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] - i8) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-72, -72, -67, 11, -46, -72, -67, 11, 41, 59, 59, 45, 60, 59};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.A9C()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<AnonymousClass69> setA01 = A01(this.A01.A6h());
        if (!this.A00.equals(setA01) && setA01 != null) {
            this.A00 = setA01;
            Iterator<AnonymousClass68> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A3d();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (AnonymousClass69 anonymousClass69 : this.A00) {
                String.format(Locale.US, A00(0, 8, 45), anonymousClass69.A8D(), anonymousClass69.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1075Yy(InterfaceC0629Hj interfaceC0629Hj) {
        InterfaceC0882Rj interfaceC0882RjA4i = interfaceC0629Hj.A4i(EnumC0883Rk.A0B);
        this.A01 = interfaceC0882RjA4i;
        interfaceC0882RjA4i.A3R(new C1076Yz(this));
        A03();
    }

    public static Set<AnonymousClass69> A01(JSONObject jSONObject) {
        C1074Yx c1074YxA00;
        HashSet hashSet = new HashSet();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(A00(8, 6, 93));
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null || (c1074YxA00 = C1074Yx.A00(jSONObjectOptJSONObject)) == null) {
                return null;
            }
            hashSet.add(c1074YxA00);
            if (A04[1].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "2zeGpFgTpOohtr7xv9EhLTO87hKhrQIZ";
            strArr[3] = "Z45Lb0RXWpRaUi2IX7mXCACeVe5qt7dU";
        }
        return hashSet;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass66
    public final void A3P(AnonymousClass68 anonymousClass68) {
        this.A02.add(anonymousClass68);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass66
    public final synchronized Set<AnonymousClass69> A62() {
        return new HashSet(this.A00);
    }
}

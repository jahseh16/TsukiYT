package com.meta.analytics.dsp.uinode;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03435c {
    public static C0S A00(Context context, InterfaceC03937h interfaceC03937h) {
        return A01(context, interfaceC03937h, null);
    }

    public static C0S A01(Context context, InterfaceC03937h interfaceC03937h, String str) {
        C1063Ym sdkContext = A09(context);
        C0W c0wA77 = interfaceC03937h.A77(sdkContext);
        if (c0wA77 != null) {
            return str != null ? c0wA77.AAJ(str) : c0wA77.AAI();
        }
        return new C1199bb();
    }

    public static C1064Yn A02(Activity activity) {
        return new C1064Yn(activity, (InterfaceC03937h) A0A(), A00(activity, A0A()));
    }

    public static C1064Yn A03(Context context) {
        return new C1064Yn(context, A0A(), new C1199bb());
    }

    public static C1064Yn A04(Context context) {
        if (C0653Ih.A0r(context)) {
            return new C1064Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C1064Yn A05(Context context, String str) {
        return new C1064Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1064Yn A06(Context context, String str) {
        return new C1064Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1064Yn A07(Context context, String str) {
        return new C1064Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C1063Ym A09(Context context) {
        return new C1063Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        return YL.A02();
    }
}

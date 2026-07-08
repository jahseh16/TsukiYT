package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5C {
    public static InterfaceC02902z<C5C> A03 = new C1104a4(20);
    public int A00;
    public C03254j A01;
    public C03254j A02;

    public static C5C A00() {
        C5C record = A03.A2b();
        return record == null ? new C5C() : record;
    }

    public static void A01() {
        while (A03.A2b() != null) {
        }
    }

    public static void A02(C5C c5c) {
        c5c.A00 = 0;
        c5c.A02 = null;
        c5c.A01 = null;
        A03.AEY(c5c);
    }
}

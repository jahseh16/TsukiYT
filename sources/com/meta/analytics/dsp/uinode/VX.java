package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VX {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private boolean A01(C1247ca<C0658Io, C0663It> c1247ca, InterfaceC1237cP interfaceC1237cP) {
        float fA8M = -1.0f;
        try {
            fA8M = interfaceC1237cP.A8M(c1247ca);
        } catch (IllegalStateException unused) {
        }
        if (fA8M > 0.0f && A00(c1247ca)) {
            return true;
        }
        if (c1247ca.A02.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1247ca)) {
            return true;
        }
        interfaceC1237cP.A8L(this.A00);
        interfaceC1237cP.A78(c1247ca, this.A01);
        return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1247ca);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1247ca<C0658Io, C0663It> c1247ca) {
        if (c1247ca.A02.A05()) {
            return c1247ca.A03.A07();
        }
        if (!c1247ca.A02.A06()) {
            return true;
        }
        C0663It c0663It = c1247ca.A03;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return c0663It.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1247ca<C0658Io, C0663It> c1247ca, InterfaceC1237cP interfaceC1237cP) {
        if (c1247ca.A03.A04() && A01(c1247ca, interfaceC1237cP)) {
            c1247ca.A03.A01();
            c1247ca.A02.A02().AA0(c1247ca.A02.A03(), c1247ca.A02.A04());
        }
        if (c1247ca.A03.A05() && C0653Ih.A1J(c1247ca.A02.A01())) {
            c1247ca.A03.A02();
            c1247ca.A02.A02().A9i(c1247ca.A02.A03(), c1247ca.A02.A04());
        }
    }
}

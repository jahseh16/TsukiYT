package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1229cH {
    public static C1229cH A02 = null;
    public final C1241cT A00;
    public final C1239cR A01;

    public C1229cH(AbstractC1245cY abstractC1245cY, C1239cR c1239cR, C1241cT c1241cT) {
        this.A00 = c1241cT;
        this.A01 = c1239cR;
        abstractC1245cY.A02(new H2(c1239cR));
    }

    public static C1229cH A00(AbstractC1245cY abstractC1245cY, InterfaceC1249cc interfaceC1249cc, HB hb) {
        C1229cH localsTestInstance = A02;
        if (localsTestInstance != null) {
            return localsTestInstance;
        }
        C1241cT c1241cT = new C1241cT();
        return new C1229cH(abstractC1245cY, new C1239cR(interfaceC1249cc, new HL(), hb, c1241cT, new Handler(Looper.getMainLooper())), c1241cT);
    }

    public final void A01(cX cXVar) {
        this.A01.A09(cXVar);
    }

    public final void A02(InterfaceC1243cV interfaceC1243cV) {
        this.A01.A0A(interfaceC1243cV);
    }

    public final void A03(DspViewableNode dspViewableNode) {
        this.A00.A01(dspViewableNode);
    }

    public final void A04(DspViewableNode dspViewableNode, C1247ca c1247ca) {
        this.A00.A02(dspViewableNode, c1247ca);
    }
}

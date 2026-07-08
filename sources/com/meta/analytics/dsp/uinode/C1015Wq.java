package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1015Wq implements D6 {
    public static String[] A02 = {"KDcVXuz53RpoF9UEOZ96l2VZuhVX9ip0", "CKRJ1Pqx0SMvAzHTc14bPVY1Im6KLWKe", "CZRg2SIX1VWZgfyXTOdEl1", "FcRR7mDk42dnDG0ym1pZJ2", "QPo", "3iSkzhZlTwG2jcdx249ci8whKDsXKTKF", "nuc6nRuUqT3GqwIih", "HhkYvD09GQfRAuSaGWngxJEfFHmtitdD"};
    public final C0644Hy A00 = new C0644Hy(new byte[4]);
    public final /* synthetic */ C1013Wo A01;

    public C1015Wq(C1013Wo c1013Wo) {
        this.A01 = c1013Wo;
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A4R(C0645Hz c0645Hz) {
        int tableId = c0645Hz.A0E();
        if (tableId != 0) {
            return;
        }
        c0645Hz.A0Z(7);
        int iA04 = c0645Hz.A04() / 4;
        for (int programNumber = 0; programNumber < iA04; programNumber++) {
            c0645Hz.A0a(this.A00, 4);
            int iA042 = this.A00.A04(16);
            this.A00.A08(3);
            if (iA042 == 0) {
                this.A00.A08(13);
            } else {
                int i = this.A00.A04(13);
                this.A01.A06.put(i, new C1018Wt(new C1014Wp(this.A01, i)));
                C1013Wo.A01(this.A01);
            }
        }
        int i5 = this.A01.A05;
        int programCount = A02[4].length();
        if (programCount == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[3] = "4awIAPS5zJKVkKN48BLjJX";
        strArr[2] = "yyhTqQNSKamLuuIUjTGErW";
        if (i5 != 2) {
            this.A01.A06.remove(0);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.D6
    public final void A8q(IB ib, InterfaceC0504Bu interfaceC0504Bu, DC dc) {
    }
}

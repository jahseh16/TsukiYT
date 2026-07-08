package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1159ax implements AnonymousClass61 {
    public static String[] A05 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ AbstractC1167b5 A00;
    public final /* synthetic */ InterfaceC02461h A01;
    public final /* synthetic */ C02471i A02;
    public final /* synthetic */ C1064Yn A03;
    public final /* synthetic */ boolean A04;

    public C1159ax(C02471i c02471i, C1064Yn c1064Yn, boolean z, AbstractC1167b5 abstractC1167b5, InterfaceC02461h interfaceC02461h) {
        this.A02 = c02471i;
        this.A03 = c1064Yn;
        this.A04 = z;
        this.A00 = abstractC1167b5;
        this.A01 = interfaceC02461h;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        if (C0653Ih.A1O(this.A03) && this.A04) {
            this.A02.A02.add(PC.A01(this.A03, this.A00, 1, new C1160ay(this)));
            return;
        }
        InterfaceC02461h interfaceC02461h = this.A01;
        if (A05[2].length() != 19) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[5] = "X6BBoGIR5wPjpoFUlFYz";
        strArr[3] = "SlUPa0nBeexeGnx3tyWk";
        interfaceC02461h.AAf();
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        this.A01.AAe(AdError.CACHE_ERROR);
    }
}

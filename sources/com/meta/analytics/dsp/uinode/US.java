package com.meta.analytics.dsp.uinode;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class US extends AbstractC03354t {
    public static String[] A01 = {"8Yn2PgyedH1iX", "R67HljoZMbsPm0e6EtybvG", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "R8Pp2uuVTku92bGxcvFWCvwfHASfPd1y", "2y5E80sPhAjkTDK", "Itturke", "abRBLy2wdT4xlnoMDCf2vtSzdY3x1mV2", "QG421Xj1ReSIzqeVHucrcoJTP843GzsJ"};
    public final /* synthetic */ C03083r A00;

    public US(C03083r c03083r) {
        this.A00 = c03083r;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03354t
    public final void A0L(C0547Eb c0547Eb, int i) {
        int scrollPosition;
        super.A0L(c0547Eb, i);
        C1090Zo linearLayoutManager = this.A00.getLayoutManager();
        if (linearLayoutManager == null || (scrollPosition = linearLayoutManager.A23()) < 0 || this.A00.getAdapter() == null || scrollPosition >= this.A00.getAdapter().A0E()) {
            return;
        }
        MJ mj = (MJ) c0547Eb.A1F(scrollPosition);
        if (A01[1].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "EBOsosi";
        strArr[2] = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if (mj == null) {
            return;
        }
        mj.AFr();
    }
}

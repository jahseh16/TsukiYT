package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1096Zu implements InterfaceC03133w {
    public final /* synthetic */ C0552Eg A00;
    public final /* synthetic */ C03113u A01;

    public C1096Zu(C0552Eg c0552Eg, C03113u c03113u) {
        this.A00 = c0552Eg;
        this.A01 = c03113u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03133w
    public final Object A4W(int i) {
        C03093s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03133w
    public final List<Object> A5h(String str, int i) {
        List<C03093s> listA03 = this.A01.A03(str, i);
        if (listA03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int infoCount = listA03.size();
        for (int i5 = 0; i5 < infoCount; i5++) {
            arrayList.add(listA03.get(i5).A0M());
        }
        return arrayList;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03133w
    public final boolean ADx(int i, int i5, Bundle bundle) {
        return this.A01.A04(i, i5, bundle);
    }
}

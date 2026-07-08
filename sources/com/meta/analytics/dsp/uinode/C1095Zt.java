package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1095Zt implements InterfaceC03153z {
    public final /* synthetic */ C0551Ef A00;
    public final /* synthetic */ C03113u A01;

    public C1095Zt(C0551Ef c0551Ef, C03113u c03113u) {
        this.A00 = c0551Ef;
        this.A01 = c03113u;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03153z
    public final Object A4W(int i) {
        C03093s compatInfo = this.A01.A00(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03153z
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

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03153z
    public final Object A5i(int i) {
        C03093s compatInfo = this.A01.A01(i);
        if (compatInfo == null) {
            return null;
        }
        return compatInfo.A0M();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC03153z
    public final boolean ADx(int i, int i5, Bundle bundle) {
        return this.A01.A04(i, i5, bundle);
    }
}

package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UE implements InterfaceC0845Py {
    public static byte[] A01;
    public final /* synthetic */ UD A00;

    static {
        A01();
    }

    public static String A00(int i, int i5, int i8) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i5);
        for (int i10 = 0; i10 < bArrCopyOfRange.length; i10++) {
            bArrCopyOfRange[i10] = (byte) ((bArrCopyOfRange[i10] ^ i8) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{29, 27, 13, 26, 11, 4, 1, 11, 3};
    }

    public UE(UD ud2) {
        this.A00 = ud2;
    }

    public /* synthetic */ UE(UD ud2, UK uk) {
        this(ud2);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0845Py
    public final void ABD() {
        this.A00.A0U(true, A00(0, 9, 55));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0845Py
    public final void ABj() {
        if (!TextUtils.isEmpty(this.A00.A0F.A12())) {
            this.A00.A0J.A9g(this.A00.A0F.A12(), new C0777Ni().A03(this.A00.A07.getViewabilityChecker()).A02(this.A00.A07.getTouchDataRecorder()).A05());
            C1U.A07(this.A00.A0F.A0y(), this.A00.A0I);
            C2O.A00(this.A00.A0F.A0N());
            this.A00.A0I.A0E().A2k();
        }
        this.A00.A0N.A43(this.A00.A0O.A7B());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0845Py
    public final void AC4() {
        this.A00.A0N.A43(this.A00.A0O.A6y());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0845Py
    public final void ADj() {
        this.A00.A0N.AB0(15);
    }
}

package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Y0 implements InterfaceC0481Ax {
    public final C1045Xu A00;
    public final C1044Xt A01;
    public final InterfaceC0459Ab[] A02;

    public Y0(InterfaceC0459Ab... interfaceC0459AbArr) {
        InterfaceC0459Ab[] interfaceC0459AbArr2 = (InterfaceC0459Ab[]) Arrays.copyOf(interfaceC0459AbArr, interfaceC0459AbArr.length + 2);
        this.A02 = interfaceC0459AbArr2;
        C1045Xu c1045Xu = new C1045Xu();
        this.A00 = c1045Xu;
        C1044Xt c1044Xt = new C1044Xt();
        this.A01 = c1044Xt;
        interfaceC0459AbArr2[interfaceC0459AbArr.length] = c1045Xu;
        interfaceC0459AbArr2[interfaceC0459AbArr.length + 1] = c1044Xt;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ax
    public final C04559x A3b(C04559x c04559x) {
        this.A00.A0B(c04559x.A02);
        return new C04559x(this.A01.A01(c04559x.A01), this.A01.A00(c04559x.A00), c04559x.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ax
    public final InterfaceC0459Ab[] A64() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ax
    public final long A7O(long j) {
        return this.A01.A02(j);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ax
    public final long A80() {
        return this.A00.A0A();
    }
}

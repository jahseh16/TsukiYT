package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0602Gh {
    public int A00;
    public final int A01;
    public final InterfaceC0601Gg[] A02;

    public C0602Gh(InterfaceC0601Gg... interfaceC0601GgArr) {
        this.A02 = interfaceC0601GgArr;
        this.A01 = interfaceC0601GgArr.length;
    }

    public final InterfaceC0601Gg A00(int i) {
        return this.A02[i];
    }

    public final InterfaceC0601Gg[] A01() {
        return (InterfaceC0601Gg[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C0602Gh) obj).A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = Arrays.hashCode(this.A02);
            this.A00 = (17 * 31) + result;
        }
        return this.A00;
    }
}

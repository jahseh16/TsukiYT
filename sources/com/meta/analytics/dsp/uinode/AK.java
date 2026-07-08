package com.meta.analytics.dsp.uinode;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AK {
    public final int A00;
    public final C0560Eo A01;

    public AK(int i, C0560Eo c0560Eo) {
        this.A00 = i;
        this.A01 = c0560Eo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AK ak = (AK) obj;
        return this.A00 == ak.A00 && this.A01.equals(ak.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}

package com.meta.analytics.dsp.uinode;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04559x {
    public static final C04559x A04 = new C04559x(1.0f);
    public final float A00;
    public final float A01;
    public final boolean A02;
    public final int A03;

    public C04559x(float f3) {
        this(f3, 1.0f, false);
    }

    public C04559x(float f3, float f4, boolean z) {
        AbstractC0620Ha.A03(f3 > 0.0f);
        AbstractC0620Ha.A03(f4 > 0.0f);
        this.A01 = f3;
        this.A00 = f4;
        this.A02 = z;
        this.A03 = Math.round(1000.0f * f3);
    }

    public final long A00(long j) {
        return ((long) this.A03) * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C04559x c04559x = (C04559x) obj;
        return this.A01 == c04559x.A01 && this.A00 == c04559x.A00 && this.A02 == c04559x.A02;
    }

    public final int hashCode() {
        return (((((17 * 31) + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A02 ? 1 : 0);
    }
}

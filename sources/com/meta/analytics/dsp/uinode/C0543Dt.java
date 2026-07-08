package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0543Dt {
    public final int A00;
    public final long A01;

    public C0543Dt(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0543Dt(int i, long j, C0542Ds c0542Ds) {
        this(i, j);
    }

    public static C0543Dt A00(Parcel parcel) {
        return new C0543Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}

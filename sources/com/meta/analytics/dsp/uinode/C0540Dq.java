package com.meta.analytics.dsp.uinode;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0540Dq {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0540Dq(int i, long j, long j4) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j4;
    }

    public /* synthetic */ C0540Dq(int i, long j, long j4, C0539Dp c0539Dp) {
        this(i, j, j4);
    }

    public static C0540Dq A00(Parcel parcel) {
        return new C0540Dq(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}

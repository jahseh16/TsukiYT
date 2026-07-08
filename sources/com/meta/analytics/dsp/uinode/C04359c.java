package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04359c extends Exception {
    public final int A00;
    public final int A01;

    public C04359c(int i, String str, Throwable th, int i5) {
        super(str, th);
        this.A01 = i;
        this.A00 = i5;
    }

    public static C04359c A00(IOException iOException) {
        return new C04359c(0, null, iOException, -1);
    }

    public static C04359c A01(Exception exc, int i) {
        return new C04359c(1, null, exc, i);
    }

    public static C04359c A02(RuntimeException runtimeException) {
        return new C04359c(2, null, runtimeException, -1);
    }
}

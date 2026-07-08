package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0952Ub<T> extends KT {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ub != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC0952Ub(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ub != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}

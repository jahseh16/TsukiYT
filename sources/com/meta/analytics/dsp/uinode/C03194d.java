package com.meta.analytics.dsp.uinode;

import android.database.Observable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C03194d extends Observable<AbstractC03204e> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AbstractC03204e) this.mObservers.get(size)).A00();
        }
    }
}

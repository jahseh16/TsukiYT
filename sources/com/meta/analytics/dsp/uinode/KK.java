package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class KK {
    public static void A00(KG kg) {
        new Handler(Looper.getMainLooper()).post(kg);
    }
}

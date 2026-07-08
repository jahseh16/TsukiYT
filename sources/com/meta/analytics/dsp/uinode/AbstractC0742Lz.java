package com.meta.analytics.dsp.uinode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0742Lz {
    public static final int A00;
    public static final ExecutorService A01;
    public static volatile boolean A02;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        A00 = iAvailableProcessors;
        A01 = Executors.newFixedThreadPool(iAvailableProcessors);
        A02 = true;
    }
}

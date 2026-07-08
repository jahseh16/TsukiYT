package com.meta.analytics.dsp.uinode;

import android.graphics.Rect;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface QE {
    boolean A92();

    boolean A95();

    int getCurrentPositionInMillis();

    boolean getGlobalVisibleRect(Rect rect);

    long getInitialBufferTime();

    int getMeasuredHeight();

    int getMeasuredWidth();

    QM getVideoStartReason();

    float getVolume();
}

package com.meta.analytics.dsp.uinode;

import android.os.SystemClock;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/instagram/common/time/IntervalClock;", "Lcom/facebook/common/time/MonotonicClock;", "()V", "now", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, "nowNanos", "fbandroid.java.com.instagram.common.time.time_AN"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HL implements SU {
    @Override // com.meta.analytics.dsp.uinode.SU
    public final long AAY() {
        return SystemClock.elapsedRealtime();
    }
}

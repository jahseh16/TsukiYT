package com.google.firebase;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class StartupTime {
    @NonNull
    public static StartupTime create(long j, long j4, long j7) {
        return new AutoValue_StartupTime(j, j4, j7);
    }

    @NonNull
    public static StartupTime now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}

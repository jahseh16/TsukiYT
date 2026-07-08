package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.installations.AutoValue_InstallationTokenResult;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class InstallationTokenResult {
    @NonNull
    public static Builder builder() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @NonNull
    public abstract String getToken();

    @NonNull
    public abstract long getTokenCreationTimestamp();

    @NonNull
    public abstract long getTokenExpirationTimestamp();

    @NonNull
    public abstract Builder toBuilder();
}

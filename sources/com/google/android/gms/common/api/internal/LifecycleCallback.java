package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class LifecycleCallback {

    @NonNull
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    public LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @KeepForSdk
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @NonNull
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @KeepForSdk
    public void onActivityResult(int i, int i5, @Nullable Intent intent) {
    }

    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle) {
    }

    @KeepForSdk
    public void onDestroy() {
    }

    @KeepForSdk
    public void onResume() {
    }

    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    public void onStart() {
    }

    @KeepForSdk
    public void onStop() {
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zzd()) {
            return zzd.zza(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zza.zza(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}

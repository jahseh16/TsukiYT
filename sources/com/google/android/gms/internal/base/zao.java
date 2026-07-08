package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import d.y;

/* JADX INFO: loaded from: classes.dex */
public final class zao extends y {
    @Nullable
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (zan.zaa()) {
            return yz.y.y(context, broadcastReceiver, intentFilter, true != zan.zaa() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}

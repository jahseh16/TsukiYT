package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    public CustomKeysAndValues(@NonNull Builder builder) {
        this.keysAndValues = Builder.access$000(builder);
    }
}

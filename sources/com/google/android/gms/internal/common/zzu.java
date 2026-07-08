package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzu extends zzs {
    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}

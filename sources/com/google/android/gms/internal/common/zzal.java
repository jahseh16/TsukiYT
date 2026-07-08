package com.google.android.gms.internal.common;

import org.jspecify.annotations.NullMarked;

/* JADX INFO: loaded from: classes.dex */
@NullMarked
public final class zzal {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i5 = 0; i5 < i; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException("at index " + i5);
            }
        }
        return objArr;
    }
}

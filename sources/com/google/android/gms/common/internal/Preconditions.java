package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzd;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d4, double d5, double d6, @NonNull String str) {
        if (d4 < d5) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d5), Double.valueOf(d6)));
        }
        if (d4 <= d6) {
            return d4;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d5), Double.valueOf(d6)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@Nullable T t3) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException("null reference");
    }

    @KeepForSdk
    public static int checkNotZero(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i = 0;
        int i5 = 0;
        while (i < 3 && (iIndexOf = str.indexOf("%s", i5)) != -1) {
            sb.append(str.substring(i5, iIndexOf));
            sb.append(objArr[i]);
            i5 = iIndexOf + 2;
            i++;
        }
        sb.append(str.substring(i5));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i8 = i + 1; i8 < 3; i8++) {
                sb.append(", ");
                sb.append(objArr[i8]);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkMainThread(@NonNull String str) {
        if (!zzd.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(@NonNull String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && java.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static void checkNotMainThread(@NonNull String str) {
        if (zzd.zza()) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    @KeepForSdk
    public static <T> T checkNotNull(@NonNull T t3, @NonNull Object obj) {
        if (t3 != null) {
            return t3;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkNotZero(int i, @NonNull Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @KeepForSdk
    public static void checkArgument(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @NonNull
    @KeepForSdk
    public static String checkNotEmpty(@Nullable String str, @NonNull Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @KeepForSdk
    public static long checkNotZero(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk
    public static void checkState(boolean z, @NonNull String str, @NonNull Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f3, float f4, float f5, @NonNull String str) {
        if (f3 < f4) {
            throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f4), Float.valueOf(f5)));
        }
        if (f3 <= f5) {
            return f3;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f4), Float.valueOf(f5)));
    }

    @KeepForSdk
    public static long checkNotZero(long j, @NonNull Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i, int i5, int i8, @NonNull String str) {
        if (i < i5) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i8)));
        }
        if (i <= i8) {
            return i;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i8)));
    }

    @KeepForSdk
    public static void checkHandlerThread(@NonNull Handler handler, @NonNull String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j, long j4, long j7, @NonNull String str) {
        if (j < j4) {
            throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j4), Long.valueOf(j7)));
        }
        if (j <= j7) {
            return j;
        }
        throw new IllegalArgumentException(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j4), Long.valueOf(j7)));
    }
}

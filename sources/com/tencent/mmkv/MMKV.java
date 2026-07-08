package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dalvik.annotation.optimization.FastNative;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import pb.zn;

/* JADX INFO: loaded from: classes.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f3121a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final HashMap<String, Parcelable.Creator<?>> f3122fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Set<Long> f3123gv;
    public static final EnumMap<pb.n3, Integer> n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f3124s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static String f3125v;
    public static final EnumMap<zn, Integer> y;
    public static final pb.n3[] zn;
    private final long nativeHandle;

    public interface n3 {
        void y(String str);
    }

    public static /* synthetic */ class y {
        public static final /* synthetic */ int[] y;

        static {
            int[] iArr = new int[pb.n3.values().length];
            y = iArr;
            try {
                iArr[pb.n3.LevelDebug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                y[pb.n3.LevelWarning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                y[pb.n3.LevelError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                y[pb.n3.LevelNone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                y[pb.n3.LevelInfo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        EnumMap<zn, Integer> enumMap = new EnumMap<>(zn.class);
        y = enumMap;
        enumMap.put(zn.OnErrorDiscard, 0);
        enumMap.put(zn.OnErrorRecover, 1);
        EnumMap<pb.n3, Integer> enumMap2 = new EnumMap<>(pb.n3.class);
        n3 = enumMap2;
        pb.n3 n3Var = pb.n3.LevelDebug;
        enumMap2.put(n3Var, 0);
        pb.n3 n3Var2 = pb.n3.LevelInfo;
        enumMap2.put(n3Var2, 1);
        pb.n3 n3Var3 = pb.n3.LevelWarning;
        enumMap2.put(n3Var3, 2);
        pb.n3 n3Var4 = pb.n3.LevelError;
        enumMap2.put(n3Var4, 3);
        pb.n3 n3Var5 = pb.n3.LevelNone;
        enumMap2.put(n3Var5, 4);
        zn = new pb.n3[]{n3Var, n3Var2, n3Var3, n3Var4, n3Var5};
        f3123gv = new HashSet();
        f3125v = null;
        f3121a = true;
        f3122fb = new HashMap<>();
        f3124s = false;
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    private native long actualSize(long j);

    private native String[] allKeys(long j, boolean z);

    public static native long backupAllToDirectory(String str);

    public static native boolean backupOneToDirectory(String str, String str2, @Nullable String str3);

    private static native boolean checkProcessMode(long j);

    private native boolean containsKey(long j, String str);

    private native long count(long j, boolean z);

    private static native long createNB(int i);

    private native boolean decodeBool(long j, String str, boolean z);

    @Nullable
    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d4);

    private native float decodeFloat(long j, String str, float f3);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j4);

    @Nullable
    private native String decodeString(long j, String str, @Nullable String str2);

    @Nullable
    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBool_2(long j, String str, boolean z, int i);

    private native boolean encodeBytes(long j, String str, @Nullable byte[] bArr);

    private native boolean encodeBytes_2(long j, String str, @Nullable byte[] bArr, int i);

    private native boolean encodeDouble(long j, String str, double d4);

    private native boolean encodeDouble_2(long j, String str, double d4, int i);

    private native boolean encodeFloat(long j, String str, float f3);

    private native boolean encodeFloat_2(long j, String str, float f3, int i);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeInt_2(long j, String str, int i, int i5);

    private native boolean encodeLong(long j, String str, long j4);

    private native boolean encodeLong_2(long j, String str, long j4, int i);

    private native boolean encodeSet(long j, String str, @Nullable String[] strArr);

    private native boolean encodeSet_2(long j, String str, @Nullable String[] strArr, int i);

    private native boolean encodeString(long j, String str, @Nullable String str2);

    private native boolean encodeString_2(long j, String str, @Nullable String str2, int i);

    public static String f(String str, String str2, n3 n3Var, pb.n3 n3Var2, boolean z) {
        if (n3Var != null) {
            n3Var.y("mmkv");
        } else {
            System.loadLibrary("mmkv");
        }
        jniInitialize(str, str2, x4(n3Var2), z);
        f3125v = str;
        return str;
    }

    private static native long getDefaultMMKV(int i, @Nullable String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i5, @Nullable String str2);

    private static native long getMMKVWithID(String str, int i, @Nullable String str2, @Nullable String str3, long j);

    private static native long getMMKVWithIDAndSize(String str, int i, int i5, @Nullable String str2);

    @NonNull
    public static MMKV i4(String str) throws RuntimeException {
        if (f3125v != null) {
            return y(getMMKVWithID(str, 1, null, null, 0L), str, 1);
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    public static void i9() {
        synchronized (f3123gv) {
            f3121a = false;
        }
        Log.i("MMKV", "Disable checkProcessMode()");
    }

    private native boolean isCompareBeforeSetEnabled();

    @FastNative
    private native boolean isEncryptionEnabled();

    @FastNative
    private native boolean isExpirationEnabled();

    public static native boolean isFileValid(String str, @Nullable String str2);

    private static native void jniInitialize(String str, String str2, int i, boolean z);

    private static void mmkvLogImp(int i, String str, int i5, String str2, String str3) {
        int i8 = y.y[zn[i].ordinal()];
        if (i8 == 1) {
            Log.d("MMKV", str3);
            return;
        }
        if (i8 == 2) {
            Log.w("MMKV", str3);
        } else if (i8 == 3) {
            Log.e("MMKV", str3);
        } else {
            if (i8 != 5) {
                return;
            }
            Log.i("MMKV", str3);
        }
    }

    public static void n(pb.n3 n3Var, String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[r0.length - 1];
        Integer num = n3.get(n3Var);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    @FastNative
    private native void nativeEnableCompareBeforeSet();

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        zn znVar = zn.OnErrorDiscard;
        n(pb.n3.LevelInfo, "Recover strategic for " + str + " is " + znVar);
        Integer num = y.get(znVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        zn znVar = zn.OnErrorDiscard;
        n(pb.n3.LevelInfo, "Recover strategic for " + str + " is " + znVar);
        Integer num = y.get(znVar);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    public static String r(@NonNull Context context, String str, n3 n3Var, pb.n3 n3Var2, pb.y yVar) {
        if ((context.getApplicationInfo().flags & 2) == 0) {
            i9();
        } else {
            t();
        }
        return f(str, context.getCacheDir().getAbsolutePath(), n3Var, n3Var2, f3124s);
    }

    public static native boolean removeStorage(String str, @Nullable String str2);

    private native void removeValueForKey(long j, String str);

    public static native long restoreAllFromDirectory(String str);

    public static native boolean restoreOneMMKVFromDirectory(String str, String str2, @Nullable String str3);

    private static native void setCallbackHandler(boolean z, boolean z5);

    private static native void setLogLevel(int i);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    public static void t() {
        synchronized (f3123gv) {
            f3121a = true;
        }
        Log.i("MMKV", "Enable checkProcessMode()");
    }

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    public static native String version();

    private native int writeValueToNB(long j, String str, long j4, int i);

    public static int x4(@NonNull pb.n3 n3Var) {
        int i = y.y[n3Var.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 1 : 4;
        }
        return 3;
    }

    @NonNull
    public static MMKV y(long j, String str, int i) throws RuntimeException {
        String str2;
        if (j == 0) {
            throw new RuntimeException("Fail to create an MMKV instance [" + str + "] in JNI");
        }
        if (!f3121a) {
            return new MMKV(j);
        }
        Set<Long> set = f3123gv;
        synchronized (set) {
            try {
                if (!set.contains(Long.valueOf(j))) {
                    if (!checkProcessMode(j)) {
                        if (i == 1) {
                            str2 = "Opening a multi-process MMKV instance [" + str + "] with SINGLE_PROCESS_MODE!";
                        } else {
                            str2 = ("Opening an MMKV instance [" + str + "] with MULTI_PROCESS_MODE, ") + "while it's already been opened with SINGLE_PROCESS_MODE by someone somewhere else!";
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    set.add(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new MMKV(j);
    }

    public static String z(Context context, String str) {
        return r(context, str, null, pb.n3.LevelInfo, null);
    }

    public long a(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    @Nullable
    public Set<String> c5(String str, @Nullable Set<String> set, Class<? extends Set> cls) {
        String[] strArrDecodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (strArrDecodeStringSet == null) {
            return set;
        }
        try {
            Set<String> setNewInstance = cls.newInstance();
            setNewInstance.addAll(Arrays.asList(strArrDecodeStringSet));
            return setNewInstance;
        } catch (IllegalAccessException | InstantiationException unused) {
            return set;
        }
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(@Nullable String str);

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearAllWithKeepingSpace();

    public native void clearMemoryCache();

    public native void close();

    public int co(@NonNull SharedPreferences sharedPreferences) {
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.size() <= 0) {
            return 0;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                if (value instanceof Boolean) {
                    encodeBool(this.nativeHandle, key, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    encodeInt(this.nativeHandle, key, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    encodeLong(this.nativeHandle, key, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    encodeFloat(this.nativeHandle, key, ((Float) value).floatValue());
                } else if (value instanceof Double) {
                    encodeDouble(this.nativeHandle, key, ((Double) value).doubleValue());
                } else if (value instanceof String) {
                    encodeString(this.nativeHandle, key, (String) value);
                } else if (value instanceof Set) {
                    p(key, (Set) value);
                } else {
                    n(pb.n3.LevelError, "unknown type: " + value.getClass());
                }
            }
        }
        return all.size();
    }

    @Override // android.content.SharedPreferences.Editor
    @Deprecated
    public boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return n3(str);
    }

    @Nullable
    public native String cryptKey();

    public native boolean disableAutoKeyExpire();

    public native void disableCompareBeforeSet();

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this;
    }

    public native boolean enableAutoKeyExpire(int i);

    public void f3(String str) {
        removeValueForKey(this.nativeHandle, str);
    }

    @Nullable
    public String fb(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        throw new UnsupportedOperationException("Intentionally Not Supported. Use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f3) {
        return decodeFloat(this.nativeHandle, str, f3);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return s(str, set);
    }

    public float gv(String str, float f3) {
        return decodeFloat(this.nativeHandle, str, f3);
    }

    public native void lock();

    public native String mmapID();

    public boolean mt(String str, boolean z) {
        return encodeBool(this.nativeHandle, str, z);
    }

    public boolean n3(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public boolean p(String str, @Nullable Set<String> set) {
        return encodeSet(this.nativeHandle, str, set == null ? null : (String[]) set.toArray(new String[0]));
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putFloat(String str, float f3) {
        encodeFloat(this.nativeHandle, str, f3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        p(str, set);
        return this;
    }

    public native boolean reKey(@Nullable String str);

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public SharedPreferences.Editor remove(String str) {
        f3(str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    @Nullable
    public Set<String> s(String str, @Nullable Set<String> set) {
        return c5(str, set, HashSet.class);
    }

    public boolean tl(String str, float f3) {
        return encodeFloat(this.nativeHandle, str, f3);
    }

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Intentionally Not implement in MMKV");
    }

    public int v(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    public boolean w(String str, @Nullable String str2) {
        return encodeString(this.nativeHandle, str, str2);
    }

    public boolean wz(String str, int i) {
        return encodeInt(this.nativeHandle, str, i);
    }

    public boolean xc(String str, long j) {
        return encodeLong(this.nativeHandle, str, j);
    }

    public boolean zn(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }
}

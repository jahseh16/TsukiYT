package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzp zzk;
    private static zzq zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzo zzoVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzo zzoVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:551), block:B:116:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0284  */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r19, @androidx.annotation.NonNull java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0177 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00eb, blocks: (B:3:0x0002, B:64:0x00e0, B:66:0x00e6, B:73:0x010a, B:101:0x0169, B:105:0x0177, B:123:0x01c9, B:124:0x01cc, B:118:0x01c1, B:71:0x00ef, B:126:0x01ce, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00dd, B:21:0x0049, B:45:0x00a0, B:48:0x00a3, B:55:0x00bb, B:63:0x00df, B:61:0x00c1), top: B:136:0x0002, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b8, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0097, B:44:0x009f, B:39:0x0072, B:41:0x0078, B:42:0x0089, B:47:0x00a2, B:50:0x00a5, B:51:0x00af, B:17:0x003e), top: B:142:0x0026, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x01bf -> B:132:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c1 -> B:132:0x01c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(@androidx.annotation.NonNull android.content.Context r10, @androidx.annotation.NonNull java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x013d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:318), block:B:92:0x013d */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzb(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        zzo zzoVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzl = zzqVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (InstantiationException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (NoSuchMethodException e8) {
            e = e8;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzoVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzm zzmVar = (zzm) zzg.get();
        if (zzmVar == null || zzmVar.zza != null) {
            return false;
        }
        zzmVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = zzk;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    zzk = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e4, null);
        }
    }
}

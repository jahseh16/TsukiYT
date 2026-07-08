package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import j5.gv;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class PackageManagerWrapper {

    @NonNull
    protected final Context zza;

    public PackageManagerWrapper(@NonNull Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(@NonNull String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @NonNull
    @KeepForSdk
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getApplicationInfo(str, i);
    }

    @NonNull
    @KeepForSdk
    public CharSequence getApplicationLabel(@NonNull String str) throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @NonNull
    @KeepForSdk
    public gv<CharSequence, Drawable> getApplicationLabelAndIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return gv.y(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @NonNull
    @KeepForSdk
    public PackageInfo getPackageInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.zza.getPackageManager().getPackageInfo(str, i);
    }

    @NonNull
    @KeepForSdk
    public String[] getPackagesForUid(int i) {
        return this.zza.getPackageManager().getPackagesForUid(i);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(ConnectionResult.SERVICE_MISSING_PERMISSION)
    public final boolean zza(int i, @NonNull String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}

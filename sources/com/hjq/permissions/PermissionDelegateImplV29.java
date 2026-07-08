package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import t7.v;

/* JADX INFO: loaded from: classes.dex */
class PermissionDelegateImplV29 extends PermissionDelegateImplV28 {
    private boolean hasReadStoragePermission(@NonNull Context context) {
        return (!AndroidVersion.isAndroid13() || AndroidVersion.getTargetSdkVersionCode(context) < 33) ? (!AndroidVersion.isAndroid11() || AndroidVersion.getTargetSdkVersionCode(context) < 30) ? PermissionUtils.checkSelfPermission(context, Permission.READ_EXTERNAL_STORAGE) : PermissionUtils.checkSelfPermission(context, Permission.READ_EXTERNAL_STORAGE) || isGrantedPermission(context, Permission.MANAGE_EXTERNAL_STORAGE) : PermissionUtils.checkSelfPermission(context, Permission.READ_MEDIA_IMAGES) || isGrantedPermission(context, Permission.MANAGE_EXTERNAL_STORAGE);
    }

    private static boolean isUseDeprecationExternalStorage() {
        return v.y();
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION)) {
            return hasReadStoragePermission(context) && PermissionUtils.checkSelfPermission(context, Permission.ACCESS_MEDIA_LOCATION);
        }
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION) || PermissionUtils.equalsPermission(str, Permission.ACTIVITY_RECOGNITION)) {
            return PermissionUtils.checkSelfPermission(context, str);
        }
        if (AndroidVersion.isAndroid11() || !PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE) || isUseDeprecationExternalStorage()) {
            return super.isGrantedPermission(context, str);
        }
        return false;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
            return !PermissionUtils.checkSelfPermission(activity, Permission.ACCESS_FINE_LOCATION) ? !PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.ACCESS_FINE_LOCATION) : (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION)) {
            return (!hasReadStoragePermission(activity) || PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (PermissionUtils.equalsPermission(str, Permission.ACTIVITY_RECOGNITION)) {
            return (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true;
        }
        if (AndroidVersion.isAndroid11() || !PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE) || isUseDeprecationExternalStorage()) {
            return super.isPermissionPermanentDenied(activity, str);
        }
        return true;
    }
}

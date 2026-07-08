package com.hjq.permissions;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class PermissionDelegateImplV26 extends PermissionDelegateImplV23 {
    private static Intent getInstallPermissionIntent(@NonNull Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(PermissionUtils.getPackageNameUri(context));
        return !PermissionUtils.areActivityIntent(context, intent) ? PermissionUtils.getApplicationDetailsIntent(context) : intent;
    }

    private static Intent getPictureInPicturePermissionIntent(@NonNull Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(PermissionUtils.getPackageNameUri(context));
        return !PermissionUtils.areActivityIntent(context, intent) ? PermissionUtils.getApplicationDetailsIntent(context) : intent;
    }

    private static boolean isGrantedInstallPermission(@NonNull Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    private static boolean isGrantedPictureInPicturePermission(@NonNull Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return (AndroidVersion.isAndroid10() ? appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName()) : appOpsManager.checkOpNoThrow("android:picture_in_picture", context.getApplicationInfo().uid, context.getPackageName())) == 0;
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public Intent getPermissionIntent(@NonNull Context context, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.REQUEST_INSTALL_PACKAGES) ? getInstallPermissionIntent(context) : PermissionUtils.equalsPermission(str, Permission.PICTURE_IN_PICTURE) ? getPictureInPicturePermissionIntent(context) : super.getPermissionIntent(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.REQUEST_INSTALL_PACKAGES) ? isGrantedInstallPermission(context) : PermissionUtils.equalsPermission(str, Permission.PICTURE_IN_PICTURE) ? isGrantedPictureInPicturePermission(context) : (PermissionUtils.equalsPermission(str, Permission.READ_PHONE_NUMBERS) || PermissionUtils.equalsPermission(str, Permission.ANSWER_PHONE_CALLS)) ? PermissionUtils.checkSelfPermission(context, str) : super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        if (PermissionUtils.equalsPermission(str, Permission.REQUEST_INSTALL_PACKAGES) || PermissionUtils.equalsPermission(str, Permission.PICTURE_IN_PICTURE)) {
            return false;
        }
        return (PermissionUtils.equalsPermission(str, Permission.READ_PHONE_NUMBERS) || PermissionUtils.equalsPermission(str, Permission.ANSWER_PHONE_CALLS)) ? (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true : super.isPermissionPermanentDenied(activity, str);
    }
}

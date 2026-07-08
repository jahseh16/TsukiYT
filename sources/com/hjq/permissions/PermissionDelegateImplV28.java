package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class PermissionDelegateImplV28 extends PermissionDelegateImplV26 {
    @Override // com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.ACCEPT_HANDOVER) ? PermissionUtils.checkSelfPermission(context, str) : super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.ACCEPT_HANDOVER) ? (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true : super.isPermissionPermanentDenied(activity, str);
    }
}

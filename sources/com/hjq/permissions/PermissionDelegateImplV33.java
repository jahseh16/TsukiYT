package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class PermissionDelegateImplV33 extends PermissionDelegateImplV31 {
    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isGrantedPermission(@NonNull Context context, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND) ? PermissionUtils.checkSelfPermission(context, Permission.BODY_SENSORS) && PermissionUtils.checkSelfPermission(context, Permission.BODY_SENSORS_BACKGROUND) : (PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS) || PermissionUtils.equalsPermission(str, Permission.NEARBY_WIFI_DEVICES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_VIDEO) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_AUDIO)) ? PermissionUtils.checkSelfPermission(context, str) : super.isGrantedPermission(context, str);
    }

    @Override // com.hjq.permissions.PermissionDelegateImplV31, com.hjq.permissions.PermissionDelegateImplV30, com.hjq.permissions.PermissionDelegateImplV29, com.hjq.permissions.PermissionDelegateImplV28, com.hjq.permissions.PermissionDelegateImplV26, com.hjq.permissions.PermissionDelegateImplV23, com.hjq.permissions.PermissionDelegateImplV14, com.hjq.permissions.PermissionDelegate
    public boolean isPermissionPermanentDenied(@NonNull Activity activity, @NonNull String str) {
        return PermissionUtils.equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND) ? !PermissionUtils.checkSelfPermission(activity, Permission.BODY_SENSORS) ? !PermissionUtils.shouldShowRequestPermissionRationale(activity, Permission.BODY_SENSORS) : (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true : (PermissionUtils.equalsPermission(str, Permission.POST_NOTIFICATIONS) || PermissionUtils.equalsPermission(str, Permission.NEARBY_WIFI_DEVICES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_VIDEO) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_AUDIO)) ? (PermissionUtils.checkSelfPermission(activity, str) || PermissionUtils.shouldShowRequestPermissionRationale(activity, str)) ? false : true : super.isPermissionPermanentDenied(activity, str);
    }
}

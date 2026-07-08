package com.hjq.permissions;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import com.hjq.permissions.AndroidManifestInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xd.n3;

/* JADX INFO: loaded from: classes.dex */
final class PermissionChecker {
    public static boolean checkActivityStatus(@Nullable Activity activity, boolean z) {
        if (activity == null) {
            if (z) {
                throw new IllegalArgumentException("The instance of the context must be an activity object");
            }
            return false;
        }
        if (activity.isFinishing()) {
            if (z) {
                throw new IllegalStateException("The activity has been finishing, please manually determine the status of the activity");
            }
            return false;
        }
        if (!AndroidVersion.isAndroid4_2() || !activity.isDestroyed()) {
            return true;
        }
        if (z) {
            throw new IllegalStateException("The activity has been destroyed, please manually determine the status of the activity");
        }
        return false;
    }

    public static void checkBodySensorsPermission(@NonNull List<String> list) {
        if (PermissionUtils.containsPermission(list, Permission.BODY_SENSORS_BACKGROUND)) {
            if (PermissionUtils.containsPermission(list, Permission.BODY_SENSORS_BACKGROUND) && !PermissionUtils.containsPermission(list, Permission.BODY_SENSORS)) {
                throw new IllegalArgumentException("Applying for background sensor permissions must contain android.permission.BODY_SENSORS");
            }
            for (String str : list) {
                if (PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_BACKGROUND_LOCATION at the same time is not supported");
                }
                if (PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION)) {
                    throw new IllegalArgumentException("Applying for permissions android.permission.BODY_SENSORS_BACKGROUND and android.permission.ACCESS_MEDIA_LOCATION at the same time is not supported");
                }
            }
        }
    }

    public static void checkLocationPermission(@NonNull List<String> list) {
        if (PermissionUtils.containsPermission(list, Permission.ACCESS_BACKGROUND_LOCATION)) {
            if (PermissionUtils.containsPermission(list, Permission.ACCESS_COARSE_LOCATION) && !PermissionUtils.containsPermission(list, Permission.ACCESS_FINE_LOCATION)) {
                throw new IllegalArgumentException("Applying for background positioning permissions must include android.permission.ACCESS_FINE_LOCATION");
            }
            for (String str : list) {
                if (!PermissionUtils.equalsPermission(str, Permission.ACCESS_FINE_LOCATION) && !PermissionUtils.equalsPermission(str, Permission.ACCESS_COARSE_LOCATION) && !PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
                    throw new IllegalArgumentException("Because it includes background location permissions, do not apply for permissions unrelated to location");
                }
            }
        }
    }

    public static void checkManifestPermission(@NonNull List<AndroidManifestInfo.PermissionInfo> list, String str) {
        checkManifestPermission(list, str, Reader.READ_DONE);
    }

    public static void checkManifestPermissions(@NonNull Context context, @NonNull List<String> list, @Nullable AndroidManifestInfo androidManifestInfo) {
        int iY;
        if (androidManifestInfo == null) {
            return;
        }
        List<AndroidManifestInfo.PermissionInfo> list2 = androidManifestInfo.permissionInfoList;
        if (list2.isEmpty()) {
            throw new IllegalStateException("No permissions are registered in the AndroidManifest.xml file");
        }
        if (AndroidVersion.isAndroid7()) {
            iY = n3.y(context.getApplicationInfo());
        } else {
            AndroidManifestInfo.UsesSdkInfo usesSdkInfo = androidManifestInfo.usesSdkInfo;
            iY = usesSdkInfo != null ? usesSdkInfo.minSdkVersion : 23;
        }
        for (String str : list) {
            if (!PermissionUtils.equalsPermission(str, Permission.NOTIFICATION_SERVICE) && !PermissionUtils.equalsPermission(str, Permission.BIND_NOTIFICATION_LISTENER_SERVICE) && !PermissionUtils.equalsPermission(str, Permission.BIND_VPN_SERVICE) && !PermissionUtils.equalsPermission(str, Permission.PICTURE_IN_PICTURE)) {
                if (PermissionUtils.equalsPermission(str, Permission.BODY_SENSORS_BACKGROUND)) {
                    checkManifestPermission(list2, Permission.BODY_SENSORS);
                } else if (!PermissionUtils.equalsPermission(str, Permission.ACCESS_BACKGROUND_LOCATION)) {
                    if (iY < 33) {
                        if (PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_VIDEO) || PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_AUDIO)) {
                            checkManifestPermission(list2, Permission.READ_EXTERNAL_STORAGE, 32);
                            checkManifestPermission(list2, Permission.WRITE_EXTERNAL_STORAGE, 32);
                        } else if (PermissionUtils.equalsPermission(str, Permission.NEARBY_WIFI_DEVICES)) {
                            checkManifestPermission(list2, Permission.ACCESS_FINE_LOCATION, 32);
                        }
                    }
                    if (iY < 31) {
                        if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_SCAN)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                            checkManifestPermission(list2, Permission.ACCESS_FINE_LOCATION, 30);
                        } else if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_CONNECT)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH", 30);
                        } else if (PermissionUtils.equalsPermission(str, Permission.BLUETOOTH_ADVERTISE)) {
                            checkManifestPermission(list2, "android.permission.BLUETOOTH_ADMIN", 30);
                        }
                    }
                    if (iY < 30 && PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE)) {
                        checkManifestPermission(list2, Permission.READ_EXTERNAL_STORAGE, 29);
                        checkManifestPermission(list2, Permission.WRITE_EXTERNAL_STORAGE, 29);
                    } else if (iY >= 26 || !PermissionUtils.equalsPermission(str, Permission.READ_PHONE_NUMBERS)) {
                        if (PermissionUtils.equalsPermission(str, Permission.GET_INSTALLED_APPS)) {
                            checkManifestPermission(list2, "android.permission.QUERY_ALL_PACKAGES");
                        }
                        checkManifestPermission(list2, str);
                    } else {
                        checkManifestPermission(list2, Permission.READ_PHONE_STATE, 25);
                    }
                } else if (AndroidVersion.getTargetSdkVersionCode(context) >= 31) {
                    checkManifestPermission(list2, Permission.ACCESS_FINE_LOCATION, 30);
                    checkManifestPermission(list2, Permission.ACCESS_COARSE_LOCATION);
                } else {
                    checkManifestPermission(list2, Permission.ACCESS_FINE_LOCATION);
                }
            }
        }
    }

    public static void checkMediaLocationPermission(@NonNull Context context, @NonNull List<String> list) {
        if (PermissionUtils.containsPermission(list, Permission.ACCESS_MEDIA_LOCATION)) {
            for (String str : list) {
                if (!PermissionUtils.equalsPermission(str, Permission.ACCESS_MEDIA_LOCATION) && !PermissionUtils.equalsPermission(str, Permission.READ_MEDIA_IMAGES) && !PermissionUtils.equalsPermission(str, Permission.READ_EXTERNAL_STORAGE) && !PermissionUtils.equalsPermission(str, Permission.WRITE_EXTERNAL_STORAGE) && !PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE)) {
                    throw new IllegalArgumentException("Because it includes access media location permissions, do not apply for permissions unrelated to access media location");
                }
            }
            if (AndroidVersion.getTargetSdkVersionCode(context) >= 33) {
                if (!PermissionUtils.containsPermission(list, Permission.READ_MEDIA_IMAGES) && !PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE)) {
                    throw new IllegalArgumentException("You must add android.permission.READ_MEDIA_IMAGES or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
                }
            } else if (!PermissionUtils.containsPermission(list, Permission.READ_EXTERNAL_STORAGE) && !PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE)) {
                throw new IllegalArgumentException("You must add android.permission.READ_EXTERNAL_STORAGE or android.permission.MANAGE_EXTERNAL_STORAGE rights to apply for android.permission.ACCESS_MEDIA_LOCATION rights");
            }
        }
    }

    public static void checkNearbyDevicesPermission(@NonNull List<String> list, @Nullable AndroidManifestInfo androidManifestInfo) {
        if ((!PermissionUtils.containsPermission(list, Permission.BLUETOOTH_SCAN) && !PermissionUtils.containsPermission(list, Permission.NEARBY_WIFI_DEVICES)) || PermissionUtils.containsPermission(list, Permission.ACCESS_FINE_LOCATION) || androidManifestInfo == null) {
            return;
        }
        for (AndroidManifestInfo.PermissionInfo permissionInfo : androidManifestInfo.permissionInfoList) {
            if (PermissionUtils.equalsPermission(permissionInfo.name, Permission.BLUETOOTH_SCAN) || PermissionUtils.equalsPermission(permissionInfo.name, Permission.NEARBY_WIFI_DEVICES)) {
                if (!permissionInfo.neverForLocation()) {
                    String str = permissionInfo.maxSdkVersion != Integer.MAX_VALUE ? "android:maxSdkVersion=\"" + permissionInfo.maxSdkVersion + "\" " : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                    throw new IllegalArgumentException("If your app doesn't use " + permissionInfo.name + " to get physical location, please change the <uses-permission android:name=\"" + permissionInfo.name + "\" " + str + "/> node in the manifest file to <uses-permission android:name=\"" + permissionInfo.name + "\" android:usesPermissionFlags=\"neverForLocation\" " + str + "/> node, if your app need use " + permissionInfo.name + " to get physical location, also need to add " + Permission.ACCESS_FINE_LOCATION + " permissions");
                }
            }
        }
    }

    public static void checkNotificationListenerPermission(@NonNull List<String> list, @Nullable AndroidManifestInfo androidManifestInfo) {
        if (PermissionUtils.containsPermission(list, Permission.BIND_NOTIFICATION_LISTENER_SERVICE) && androidManifestInfo != null) {
            List<AndroidManifestInfo.ServiceInfo> list2 = androidManifestInfo.serviceInfoList;
            for (int i = 0; i < list2.size(); i++) {
                if (TextUtils.equals(list2.get(i).permission, Permission.BIND_NOTIFICATION_LISTENER_SERVICE)) {
                    return;
                }
            }
            throw new IllegalArgumentException("No service registered permission attribute, please register <service android:permission=\"android.permission.BIND_NOTIFICATION_LISTENER_SERVICE\" > in AndroidManifest.xml");
        }
    }

    public static boolean checkPermissionArgument(@Nullable List<String> list, boolean z) {
        if (list == null || list.isEmpty()) {
            if (z) {
                throw new IllegalArgumentException("The requested permission cannot be empty");
            }
            return false;
        }
        if (AndroidVersion.getAndroidVersionCode() <= 33 && z) {
            ArrayList arrayList = new ArrayList();
            Field[] declaredFields = Permission.class.getDeclaredFields();
            if (declaredFields.length == 0) {
                return true;
            }
            for (Field field : declaredFields) {
                if (String.class.equals(field.getType())) {
                    try {
                        arrayList.add((String) field.get(null));
                    } catch (IllegalAccessException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            for (String str : list) {
                if (!PermissionUtils.containsPermission(arrayList, str)) {
                    throw new IllegalArgumentException("The " + str + " is not a dangerous permission or special permission, please do not request dynamically");
                }
            }
        }
        return true;
    }

    public static void checkPictureInPicturePermission(@NonNull Activity activity, @NonNull List<String> list, @Nullable AndroidManifestInfo androidManifestInfo) {
        if (PermissionUtils.containsPermission(list, Permission.PICTURE_IN_PICTURE) && androidManifestInfo != null) {
            List<AndroidManifestInfo.ActivityInfo> list2 = androidManifestInfo.activityInfoList;
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).supportsPictureInPicture) {
                    return;
                }
            }
            throw new IllegalArgumentException("No activity registered supportsPictureInPicture attribute, please register \n<activity android:name=\"" + activity.getClass().getName().replace(activity.getPackageName(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING) + "\" android:supportsPictureInPicture=\"true\" > in AndroidManifest.xml");
        }
    }

    public static void checkStoragePermission(@NonNull Context context, @NonNull List<String> list, @Nullable AndroidManifestInfo androidManifestInfo) {
        AndroidManifestInfo.ApplicationInfo applicationInfo;
        if (PermissionUtils.containsPermission(list, Permission.READ_MEDIA_IMAGES) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_VIDEO) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_AUDIO) || PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE) || PermissionUtils.containsPermission(list, Permission.READ_EXTERNAL_STORAGE) || PermissionUtils.containsPermission(list, Permission.WRITE_EXTERNAL_STORAGE)) {
            if (AndroidVersion.getTargetSdkVersionCode(context) >= 33 && (PermissionUtils.containsPermission(list, Permission.READ_EXTERNAL_STORAGE) || PermissionUtils.containsPermission(list, Permission.WRITE_EXTERNAL_STORAGE))) {
                throw new IllegalArgumentException("When targetSdkVersion >= 33 should use android.permission.READ_MEDIA_IMAGES, android.permission.READ_MEDIA_VIDEO, android.permission.READ_MEDIA_AUDIO instead of android.permission.READ_EXTERNAL_STORAGE, android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (PermissionUtils.containsPermission(list, Permission.READ_MEDIA_IMAGES) || PermissionUtils.containsPermission(list, Permission.ACCESS_MEDIA_LOCATION) || androidManifestInfo == null || (applicationInfo = androidManifestInfo.applicationInfo) == null) {
                return;
            }
            boolean zIsScopedStorage = PermissionUtils.isScopedStorage(context);
            int targetSdkVersionCode = AndroidVersion.getTargetSdkVersionCode(context);
            boolean z = applicationInfo.requestLegacyExternalStorage;
            if (targetSdkVersionCode >= 29 && !z && (PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE) || !zIsScopedStorage)) {
                throw new IllegalStateException("Please register the android:requestLegacyExternalStorage=\"true\" attribute in the AndroidManifest.xml file, otherwise it will cause incompatibility with the old version");
            }
            if (targetSdkVersionCode >= 30 && !PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE) && !zIsScopedStorage) {
                throw new IllegalArgumentException("The storage permission application is abnormal. If you have adapted the scope storage, please register the <meta-data android:name=\"ScopedStorage\" android:value=\"true\" /> attribute in the AndroidManifest.xml file. If there is no adaptation scope storage, please use android.permission.MANAGE_EXTERNAL_STORAGE to apply for permission");
            }
        }
    }

    public static void checkTargetSdkVersion(@NonNull Context context, @NonNull List<String> list) {
        int i = (PermissionUtils.containsPermission(list, Permission.POST_NOTIFICATIONS) || PermissionUtils.containsPermission(list, Permission.NEARBY_WIFI_DEVICES) || PermissionUtils.containsPermission(list, Permission.BODY_SENSORS_BACKGROUND) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_IMAGES) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_VIDEO) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_AUDIO)) ? 33 : (PermissionUtils.containsPermission(list, Permission.BLUETOOTH_SCAN) || PermissionUtils.containsPermission(list, Permission.BLUETOOTH_CONNECT) || PermissionUtils.containsPermission(list, Permission.BLUETOOTH_ADVERTISE) || PermissionUtils.containsPermission(list, Permission.SCHEDULE_EXACT_ALARM)) ? 31 : PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE) ? 30 : (PermissionUtils.containsPermission(list, Permission.ACCESS_BACKGROUND_LOCATION) || PermissionUtils.containsPermission(list, Permission.ACTIVITY_RECOGNITION) || PermissionUtils.containsPermission(list, Permission.ACCESS_MEDIA_LOCATION)) ? 29 : PermissionUtils.containsPermission(list, Permission.ACCEPT_HANDOVER) ? 28 : (PermissionUtils.containsPermission(list, Permission.REQUEST_INSTALL_PACKAGES) || PermissionUtils.containsPermission(list, Permission.ANSWER_PHONE_CALLS) || PermissionUtils.containsPermission(list, Permission.READ_PHONE_NUMBERS) || PermissionUtils.containsPermission(list, Permission.PICTURE_IN_PICTURE)) ? 26 : 23;
        if (AndroidVersion.getTargetSdkVersionCode(context) >= i) {
            return;
        }
        throw new RuntimeException("The targetSdkVersion SDK must be " + i + " or more, if you do not want to upgrade targetSdkVersion, please apply with the old permissions");
    }

    public static void optimizeDeprecatedPermission(@NonNull List<String> list) {
        if (!AndroidVersion.isAndroid13()) {
            if (PermissionUtils.containsPermission(list, Permission.POST_NOTIFICATIONS) && !PermissionUtils.containsPermission(list, Permission.NOTIFICATION_SERVICE)) {
                list.add(Permission.NOTIFICATION_SERVICE);
            }
            if (PermissionUtils.containsPermission(list, Permission.NEARBY_WIFI_DEVICES) && !PermissionUtils.containsPermission(list, Permission.ACCESS_FINE_LOCATION)) {
                list.add(Permission.ACCESS_FINE_LOCATION);
            }
            if (PermissionUtils.containsPermission(list, Permission.READ_MEDIA_IMAGES) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_VIDEO) || PermissionUtils.containsPermission(list, Permission.READ_MEDIA_AUDIO)) {
                if (!PermissionUtils.containsPermission(list, Permission.READ_EXTERNAL_STORAGE)) {
                    list.add(Permission.READ_EXTERNAL_STORAGE);
                }
                if (!PermissionUtils.containsPermission(list, Permission.WRITE_EXTERNAL_STORAGE)) {
                    list.add(Permission.WRITE_EXTERNAL_STORAGE);
                }
            }
        }
        if (!AndroidVersion.isAndroid12() && PermissionUtils.containsPermission(list, Permission.BLUETOOTH_SCAN) && !PermissionUtils.containsPermission(list, Permission.ACCESS_FINE_LOCATION)) {
            list.add(Permission.ACCESS_FINE_LOCATION);
        }
        if (PermissionUtils.containsPermission(list, Permission.MANAGE_EXTERNAL_STORAGE)) {
            if (PermissionUtils.containsPermission(list, Permission.READ_EXTERNAL_STORAGE) || PermissionUtils.containsPermission(list, Permission.WRITE_EXTERNAL_STORAGE)) {
                throw new IllegalArgumentException("If you have applied for MANAGE_EXTERNAL_STORAGE permissions, do not apply for the READ_EXTERNAL_STORAGE and WRITE_EXTERNAL_STORAGE permissions");
            }
            if (!AndroidVersion.isAndroid11()) {
                list.add(Permission.READ_EXTERNAL_STORAGE);
                list.add(Permission.WRITE_EXTERNAL_STORAGE);
            }
        }
        if (!AndroidVersion.isAndroid10() && PermissionUtils.containsPermission(list, Permission.ACTIVITY_RECOGNITION) && !PermissionUtils.containsPermission(list, Permission.BODY_SENSORS)) {
            list.add(Permission.BODY_SENSORS);
        }
        if (AndroidVersion.isAndroid8() || !PermissionUtils.containsPermission(list, Permission.READ_PHONE_NUMBERS) || PermissionUtils.containsPermission(list, Permission.READ_PHONE_STATE)) {
            return;
        }
        list.add(Permission.READ_PHONE_STATE);
    }

    public static void checkManifestPermission(@NonNull List<AndroidManifestInfo.PermissionInfo> list, String str, int i) {
        AndroidManifestInfo.PermissionInfo next;
        String str2;
        Iterator<AndroidManifestInfo.PermissionInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (TextUtils.equals(next.name, str)) {
                    break;
                }
            }
        }
        if (next == null) {
            throw new IllegalStateException("Please register permissions in the AndroidManifest.xml file <uses-permission android:name=\"" + str + "\" />");
        }
        int i5 = next.maxSdkVersion;
        if (i5 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("The AndroidManifest.xml file <uses-permission android:name=\"");
            sb.append(str);
            sb.append("\" android:maxSdkVersion=\"");
            sb.append(i5);
            sb.append("\" /> does not meet the requirements, ");
            if (i != Integer.MAX_VALUE) {
                str2 = "the minimum requirement for maxSdkVersion is " + i;
            } else {
                str2 = "please delete the android:maxSdkVersion=\"" + i5 + "\" attribute";
            }
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}

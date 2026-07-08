package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i, @NonNull Activity activity, int i5) {
        return getErrorDialog(i, activity, i5, null);
    }

    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, @NonNull Context context, int i5) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i5);
    }

    @NonNull
    @Deprecated
    public static String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @NonNull
    public static Context getRemoteContext(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @NonNull
    public static Resources getRemoteResource(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, int i5) {
        return showErrorDialogFragment(i, activity, i5, null);
    }

    @Deprecated
    public static void showErrorNotification(int i, @NonNull Context context) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i)) {
            googleApiAvailability.zaf(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i);
        }
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i, @NonNull Activity activity, int i5, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i, i5, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, int i5, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i5, onCancelListener);
    }

    @ResultIgnorabilityUnspecified
    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, @Nullable Fragment fragment, int i5, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        int i8 = true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i) ? 18 : i;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i8, i5, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i8, zag.zac(fragment, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i8, "d"), i5), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zad(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}

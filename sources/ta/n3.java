package ta;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.hjq.permissions.Permission;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends d.y {

    public static class a {
        @SuppressLint({"BanUncheckedReflection"})
        public static boolean n3(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }

        public static boolean y(@NonNull Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    public interface c5 {
        void validateRequestPermissionsRequestCode(int i);
    }

    public static class fb {
        public static boolean y(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class gv {
        public static void n3(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static void y(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static boolean zn(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static class i9 extends SharedElementCallback {
        public final i4 y;

        public i9(i4 i4Var) {
            this.y = i4Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.y.n3(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.y.zn(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.y.gv(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.y.v(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.y.a(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.y.fb(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.y.s(list, list2, new ta.zn(onSharedElementsReadyListener));
        }
    }

    /* JADX INFO: renamed from: ta.n3$n3, reason: collision with other inner class name */
    public static class C0177n3 {
        public static void n3(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        public static void y(Activity activity) {
            activity.finishAffinity();
        }

        public static void zn(Activity activity, IntentSender intentSender, int i, Intent intent, int i5, int i8, int i10, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i5, i8, i10, bundle);
        }
    }

    public interface s {
        void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr);
    }

    public static class v {
        public static <T> T y(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    public class y implements Runnable {

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final /* synthetic */ int f8196fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Activity f8197v;
        public final /* synthetic */ String[] y;

        public y(String[] strArr, Activity activity, int i) {
            this.y = strArr;
            this.f8197v = activity;
            this.f8196fb = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.y.length];
            PackageManager packageManager = this.f8197v.getPackageManager();
            String packageName = this.f8197v.getPackageName();
            int length = this.y.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.y[i], packageName);
            }
            ((s) this.f8197v).onRequestPermissionsResult(this.f8196fb, this.y, iArr);
        }
    }

    public static class zn {
        public static void gv(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void n3(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void v(Activity activity) {
            activity.startPostponedEnterTransition();
        }

        public static void y(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void zn(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }
    }

    public static void a(@NonNull final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: ta.y
                @Override // java.lang.Runnable
                public final void run() {
                    n3.gv(activity);
                }
            });
        }
    }

    public static void c5(@NonNull Activity activity, @Nullable i4 i4Var) {
        zn.zn(activity, i4Var != null ? new i9(i4Var) : null);
    }

    public static boolean f(@NonNull Activity activity, @NonNull String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals(Permission.POST_NOTIFICATIONS, str)) {
            return false;
        }
        if (i >= 32) {
            return fb.y(activity, str);
        }
        if (i == 31) {
            return a.n3(activity, str);
        }
        if (i >= 23) {
            return gv.zn(activity, str);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void fb(@NonNull Activity activity, @NonNull String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (TextUtils.isEmpty(strArr[i5])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i5], Permission.POST_NOTIFICATIONS)) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i8 = 0;
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (!hashSet.contains(Integer.valueOf(i10))) {
                    strArr2[i8] = strArr[i10];
                    i8++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c5) {
                ((c5) activity).validateRequestPermissionsRequestCode(i);
            }
            gv.n3(activity, strArr, i);
        } else if (activity instanceof s) {
            new Handler(Looper.getMainLooper()).post(new y(strArr2, activity, i));
        }
    }

    public static /* synthetic */ void gv(Activity activity) {
        if (activity.isFinishing() || ta.v.c5(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void i9(@NonNull Activity activity, @Nullable i4 i4Var) {
        zn.gv(activity, i4Var != null ? new i9(i4Var) : null);
    }

    public static void n3(@NonNull Activity activity) {
        C0177n3.y(activity);
    }

    @NonNull
    public static <T extends View> T s(@NonNull Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) v.y(activity, i);
        }
        T t3 = (T) activity.findViewById(i);
        if (t3 != null) {
            return t3;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void t(@NonNull Activity activity, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        C0177n3.n3(activity, intent, i, bundle);
    }

    public static void tl(@NonNull Activity activity, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i5, int i8, int i10, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        C0177n3.zn(activity, intentSender, i, intent, i5, i8, i10, bundle);
    }

    public static void v(@NonNull Activity activity) {
        zn.n3(activity);
    }

    public static void wz(@NonNull Activity activity) {
        zn.v(activity);
    }

    public static void zn(@NonNull Activity activity) {
        zn.y(activity);
    }
}

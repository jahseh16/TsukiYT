package com.hjq.permissions;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import s7.y;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionFragment extends Fragment implements Runnable {
    private static final String REQUEST_CODE = "request_code";
    private static final List<Integer> REQUEST_CODE_ARRAY = new ArrayList();
    private static final String REQUEST_PERMISSIONS = "request_permissions";

    @Nullable
    private OnPermissionCallback mCallBack;
    private boolean mDangerousRequest;

    @Nullable
    private IPermissionInterceptor mInterceptor;
    private boolean mRequestFlag;
    private int mScreenOrientation;
    private boolean mSpecialRequest;

    public static void launch(@NonNull Activity activity, @NonNull ArrayList<String> arrayList, @NonNull IPermissionInterceptor iPermissionInterceptor, @Nullable OnPermissionCallback onPermissionCallback) {
        int iNextInt;
        List<Integer> list;
        PermissionFragment permissionFragment = new PermissionFragment();
        Bundle bundle = new Bundle();
        do {
            iNextInt = new Random().nextInt((int) Math.pow(2.0d, 8.0d));
            list = REQUEST_CODE_ARRAY;
        } while (list.contains(Integer.valueOf(iNextInt)));
        list.add(Integer.valueOf(iNextInt));
        bundle.putInt(REQUEST_CODE, iNextInt);
        bundle.putStringArrayList(REQUEST_PERMISSIONS, arrayList);
        permissionFragment.setArguments(bundle);
        permissionFragment.setRetainInstance(true);
        permissionFragment.setRequestFlag(true);
        permissionFragment.setCallBack(onPermissionCallback);
        permissionFragment.setInterceptor(iPermissionInterceptor);
        permissionFragment.attachActivity(activity);
    }

    public void attachActivity(@NonNull Activity activity) {
        activity.getFragmentManager().beginTransaction().add(this, toString()).commitAllowingStateLoss();
    }

    public void detachActivity(@NonNull Activity activity) {
        activity.getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i5, @Nullable Intent intent) {
        ArrayList<String> stringArrayList;
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null || this.mDangerousRequest || i != arguments.getInt(REQUEST_CODE) || (stringArrayList = arguments.getStringArrayList(REQUEST_PERMISSIONS)) == null || stringArrayList.isEmpty()) {
            return;
        }
        this.mDangerousRequest = true;
        PermissionUtils.postActivityResult(stringArrayList, this);
    }

    @Override // android.app.Fragment
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        int requestedOrientation = activity.getRequestedOrientation();
        this.mScreenOrientation = requestedOrientation;
        if (requestedOrientation != -1) {
            return;
        }
        PermissionUtils.lockActivityOrientation(activity);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallBack = null;
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        Activity activity = getActivity();
        if (activity == null || this.mScreenOrientation != -1 || activity.getRequestedOrientation() == -1) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (activity == null || arguments == null || this.mInterceptor == null || i != arguments.getInt(REQUEST_CODE)) {
            return;
        }
        OnPermissionCallback onPermissionCallback = this.mCallBack;
        this.mCallBack = null;
        IPermissionInterceptor iPermissionInterceptor = this.mInterceptor;
        this.mInterceptor = null;
        PermissionUtils.optimizePermissionResults(activity, strArr, iArr);
        ArrayList arrayListAsArrayList = PermissionUtils.asArrayList(strArr);
        REQUEST_CODE_ARRAY.remove(Integer.valueOf(i));
        detachActivity(activity);
        List<String> grantedPermissions = PermissionApi.getGrantedPermissions(arrayListAsArrayList, iArr);
        if (grantedPermissions.size() == arrayListAsArrayList.size()) {
            iPermissionInterceptor.grantedPermissionRequest(activity, arrayListAsArrayList, grantedPermissions, true, onPermissionCallback);
            iPermissionInterceptor.finishPermissionRequest(activity, arrayListAsArrayList, false, onPermissionCallback);
            return;
        }
        List<String> deniedPermissions = PermissionApi.getDeniedPermissions(arrayListAsArrayList, iArr);
        iPermissionInterceptor.deniedPermissionRequest(activity, arrayListAsArrayList, deniedPermissions, PermissionApi.isPermissionPermanentDenied(activity, deniedPermissions), onPermissionCallback);
        if (!grantedPermissions.isEmpty()) {
            iPermissionInterceptor.grantedPermissionRequest(activity, arrayListAsArrayList, grantedPermissions, false, onPermissionCallback);
        }
        iPermissionInterceptor.finishPermissionRequest(activity, arrayListAsArrayList, false, onPermissionCallback);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.mRequestFlag) {
            detachActivity(getActivity());
        } else {
            if (this.mSpecialRequest) {
                return;
            }
            this.mSpecialRequest = true;
            requestSpecialPermission();
        }
    }

    public void requestDangerousPermission() {
        Activity activity = getActivity();
        Bundle arguments = getArguments();
        if (activity == null || arguments == null) {
            return;
        }
        int i = arguments.getInt(REQUEST_CODE);
        ArrayList<String> stringArrayList = arguments.getStringArrayList(REQUEST_PERMISSIONS);
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return;
        }
        if (!AndroidVersion.isAndroid6()) {
            int size = stringArrayList.size();
            int[] iArr = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = PermissionApi.isGrantedPermission(activity, stringArrayList.get(i5)) ? 0 : -1;
            }
            onRequestPermissionsResult(i, (String[]) stringArrayList.toArray(new String[0]), iArr);
            return;
        }
        if (AndroidVersion.isAndroid13() && stringArrayList.size() >= 2 && PermissionUtils.containsPermission(stringArrayList, Permission.BODY_SENSORS_BACKGROUND)) {
            ArrayList<String> arrayList = new ArrayList<>(stringArrayList);
            arrayList.remove(Permission.BODY_SENSORS_BACKGROUND);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList, i);
            return;
        }
        if (AndroidVersion.isAndroid10() && stringArrayList.size() >= 2 && PermissionUtils.containsPermission(stringArrayList, Permission.ACCESS_BACKGROUND_LOCATION)) {
            ArrayList<String> arrayList2 = new ArrayList<>(stringArrayList);
            arrayList2.remove(Permission.ACCESS_BACKGROUND_LOCATION);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList2, i);
        } else {
            if (!AndroidVersion.isAndroid10() || !PermissionUtils.containsPermission(stringArrayList, Permission.ACCESS_MEDIA_LOCATION) || !PermissionUtils.containsPermission(stringArrayList, Permission.READ_EXTERNAL_STORAGE)) {
                requestPermissions((String[]) stringArrayList.toArray(new String[stringArrayList.size() - 1]), i);
                return;
            }
            ArrayList<String> arrayList3 = new ArrayList<>(stringArrayList);
            arrayList3.remove(Permission.ACCESS_MEDIA_LOCATION);
            splitTwiceRequestPermission(activity, stringArrayList, arrayList3, i);
        }
    }

    public void requestSpecialPermission() {
        Bundle arguments = getArguments();
        Activity activity = getActivity();
        if (arguments == null || activity == null) {
            return;
        }
        boolean z = false;
        for (String str : arguments.getStringArrayList(REQUEST_PERMISSIONS)) {
            if (PermissionApi.isSpecialPermission(str) && !PermissionApi.isGrantedPermission(activity, str) && (AndroidVersion.isAndroid11() || !PermissionUtils.equalsPermission(str, Permission.MANAGE_EXTERNAL_STORAGE))) {
                startActivityForResult(PermissionUtils.getSmartPermissionIntent(activity, PermissionUtils.asArrayList(str)), getArguments().getInt(REQUEST_CODE));
                z = true;
            }
        }
        if (z) {
            return;
        }
        requestDangerousPermission();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isAdded()) {
            requestDangerousPermission();
        }
    }

    public void setCallBack(@Nullable OnPermissionCallback onPermissionCallback) {
        this.mCallBack = onPermissionCallback;
    }

    public void setInterceptor(IPermissionInterceptor iPermissionInterceptor) {
        this.mInterceptor = iPermissionInterceptor;
    }

    public void setRequestFlag(boolean z) {
        this.mRequestFlag = z;
    }

    public void splitTwiceRequestPermission(@NonNull final Activity activity, @NonNull final ArrayList<String> arrayList, @NonNull ArrayList<String> arrayList2, final int i) {
        final ArrayList arrayList3 = new ArrayList(arrayList);
        Iterator<String> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.remove(it.next());
        }
        launch(activity, arrayList2, new IPermissionInterceptor() { // from class: com.hjq.permissions.PermissionFragment.1
            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void deniedPermissionRequest(Activity activity2, List list, List list2, boolean z, OnPermissionCallback onPermissionCallback) {
                y.y(this, activity2, list, list2, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void finishPermissionRequest(Activity activity2, List list, boolean z, OnPermissionCallback onPermissionCallback) {
                y.n3(this, activity2, list, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void grantedPermissionRequest(Activity activity2, List list, List list2, boolean z, OnPermissionCallback onPermissionCallback) {
                y.zn(this, activity2, list, list2, z, onPermissionCallback);
            }

            @Override // com.hjq.permissions.IPermissionInterceptor
            public /* synthetic */ void launchPermissionRequest(Activity activity2, List list, OnPermissionCallback onPermissionCallback) {
                y.gv(this, activity2, list, onPermissionCallback);
            }
        }, new OnPermissionCallback() { // from class: com.hjq.permissions.PermissionFragment.2
            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onGranted$0(Activity activity2, ArrayList arrayList4, ArrayList arrayList5, int i5) {
                PermissionFragment.launch(activity2, arrayList4, new 1(this), new 2(this, arrayList5, i5, arrayList4));
            }

            @Override // com.hjq.permissions.OnPermissionCallback
            public void onDenied(@NonNull List<String> list, boolean z) {
                if (PermissionFragment.this.isAdded()) {
                    int[] iArr = new int[arrayList.size()];
                    Arrays.fill(iArr, -1);
                    PermissionFragment.this.onRequestPermissionsResult(i, (String[]) arrayList.toArray(new String[0]), iArr);
                }
            }

            @Override // com.hjq.permissions.OnPermissionCallback
            public void onGranted(@NonNull List<String> list, boolean z) {
                if (z && PermissionFragment.this.isAdded()) {
                    PermissionUtils.postDelayed(new y(this, activity, arrayList3, arrayList, i), AndroidVersion.isAndroid13() ? 150L : 0L);
                }
            }
        });
    }
}

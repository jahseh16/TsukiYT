package a4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import v3.zn;

/* JADX INFO: loaded from: classes.dex */
public final class oz {
    public static final zn zn = new zn("SplitInstallInfoProvider");
    public final String n3;
    public final Context y;

    public oz(Context context) {
        this.y = context;
        this.n3 = context.getPackageName();
    }

    public static boolean a(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static String n3(String str) {
        return str.startsWith("config.") ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str.split("\\.config\\.", 2)[0];
    }

    public static boolean v(String str) {
        return str.startsWith("config.");
    }

    @Nullable
    public final Bundle fb() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.y.getPackageManager().getApplicationInfo(this.n3, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
            zn.y("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zn.v("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    @Nullable
    public final Set gv() {
        k5 k5VarY = y();
        if (k5VarY == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set setS = s();
        setS.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        Set setZn = zn();
        setZn.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        for (Map.Entry entry : k5VarY.y(setZn).entrySet()) {
            if (setS.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }

    public final Set s() {
        HashSet hashSet = new HashSet();
        Bundle bundleFb = fb();
        if (bundleFb != null) {
            String string = bundleFb.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zn.y("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                hashSet.remove("base");
            }
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.y.getPackageManager().getPackageInfo(this.n3, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zn.v("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            zn.y("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zn.y("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        o oVarY = j.y();
        if (oVarY != null) {
            hashSet.addAll(oVarY.zza());
        }
        return hashSet;
    }

    @Nullable
    public final k5 y() {
        Bundle bundleFb = fb();
        if (bundleFb == null) {
            zn.v("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundleFb.getInt("com.android.vending.splits");
        if (i == 0) {
            zn.v("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            k5 k5VarY = mg.y(this.y.getResources().getXml(i), new x());
            if (k5VarY == null) {
                zn.v("Can't parse languages metadata.", new Object[0]);
            }
            return k5VarY;
        } catch (Resources.NotFoundException unused) {
            zn.v("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set zn() {
        HashSet hashSet = new HashSet();
        for (String str : s()) {
            if (!a(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}

package bv;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class fb {
    public static final String y = yk.f.a("PackageManagerHelper");

    public static void y(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            yk.f.zn().y(y, String.format("%s %s", cls.getName(), z ? "enabled" : "disabled"), new Throwable[0]);
        } catch (Exception e4) {
            yk.f.zn().y(y, String.format("%s could not be %s", cls.getName(), z ? "enabled" : "disabled"), e4);
        }
    }
}

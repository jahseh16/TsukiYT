package yt;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int f9366gv;
    public static final int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f9367v;
    public static final y y = new y();
    public static final int zn;

    static {
        int i = Build.VERSION.SDK_INT;
        n3 = i >= 30 ? y.y.y(30) : 0;
        zn = i >= 30 ? y.y.y(31) : 0;
        f9366gv = i >= 30 ? y.y.y(33) : 0;
        f9367v = i >= 30 ? y.y.y(1000000) : 0;
    }

    public static final boolean gv() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (y("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n3() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (y("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean y(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean zn() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (y("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}

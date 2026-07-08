package lh1;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static final y y = new y();

    public static final int n3() {
        return n3.y();
    }

    public static final Application y() {
        Application applicationZn = n3.zn();
        if (applicationZn != null) {
            return applicationZn;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
        return null;
    }

    public static final String zn() {
        String strN3 = n3.n3();
        if (strN3 != null) {
            return strN3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appVersionNameHolder");
        return null;
    }
}

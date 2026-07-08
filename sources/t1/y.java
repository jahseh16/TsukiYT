package t1;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final TimeInterpolator y = new LinearInterpolator();
    public static final TimeInterpolator n3 = new e.n3();
    public static final TimeInterpolator zn = new e.y();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final TimeInterpolator f8180gv = new e.zn();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final TimeInterpolator f8181v = new DecelerateInterpolator();

    public static float n3(float f3, float f4, float f5, float f7, float f8) {
        return f8 < f5 ? f3 : f8 > f7 ? f4 : y(f3, f4, (f8 - f5) / (f7 - f5));
    }

    public static float y(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    public static int zn(int i, int i5, float f3) {
        return i + Math.round(f3 * (i5 - i));
    }
}

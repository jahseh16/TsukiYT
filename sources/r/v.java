package r;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class v extends Drawable {
    public static final double y = Math.cos(Math.toRadians(45.0d));

    public static float n3(float f3, float f4, boolean z) {
        return z ? (float) (((double) (f3 * 1.5f)) + ((1.0d - y) * ((double) f4))) : f3 * 1.5f;
    }

    public static float y(float f3, float f4, boolean z) {
        return z ? (float) (((double) f3) + ((1.0d - y) * ((double) f4))) : f3;
    }
}

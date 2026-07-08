package ut;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    public static class n3 {
        public static float n3(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static EdgeEffect y(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float zn(EdgeEffect edgeEffect, float f3, float f4) {
            try {
                return edgeEffect.onPullDistance(f3, f4);
            } catch (Throwable unused) {
                edgeEffect.onPull(f3, f4);
                return 0.0f;
            }
        }
    }

    public static class y {
        public static void y(EdgeEffect edgeEffect, float f3, float f4) {
            edgeEffect.onPull(f3, f4);
        }
    }

    public static float gv(@NonNull EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n3.zn(edgeEffect, f3, f4);
        }
        zn(edgeEffect, f3, f4);
        return f3;
    }

    public static float n3(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return n3.n3(edgeEffect);
        }
        return 0.0f;
    }

    @NonNull
    public static EdgeEffect y(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? n3.y(context, attributeSet) : new EdgeEffect(context);
    }

    public static void zn(@NonNull EdgeEffect edgeEffect, float f3, float f4) {
        y.y(edgeEffect, f3, f4);
    }
}

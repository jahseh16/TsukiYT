package u2;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    public static final boolean y = true;
    public static final int[] n3 = {R.attr.state_pressed};
    public static final int[] zn = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final int[] f8342gv = {R.attr.state_focused};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f8346v = {R.attr.state_hovered};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8338a = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final int[] f8341fb = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f8344s = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int[] f8339c5 = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final int[] f8343i9 = {R.attr.state_selected};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8340f = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f8345t = n3.class.getSimpleName();

    @NonNull
    public static ColorStateList gv(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f8340f, 0)) != 0) {
            Log.w(f8345t, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    @TargetApi(21)
    public static int n3(int i) {
        return ud.y.i9(i, Math.min(Color.alpha(i) * 2, 255));
    }

    public static boolean v(@NonNull int[] iArr) {
        boolean z = false;
        boolean z5 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z5 = true;
            }
        }
        return z && z5;
    }

    @NonNull
    public static ColorStateList y(@Nullable ColorStateList colorStateList) {
        if (y) {
            return new ColorStateList(new int[][]{f8343i9, StateSet.NOTHING}, new int[]{zn(colorStateList, f8338a), zn(colorStateList, n3)});
        }
        int[] iArr = f8338a;
        int[] iArr2 = f8341fb;
        int[] iArr3 = f8344s;
        int[] iArr4 = f8339c5;
        int[] iArr5 = n3;
        int[] iArr6 = zn;
        int[] iArr7 = f8342gv;
        int[] iArr8 = f8346v;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f8343i9, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{zn(colorStateList, iArr), zn(colorStateList, iArr2), zn(colorStateList, iArr3), zn(colorStateList, iArr4), 0, zn(colorStateList, iArr5), zn(colorStateList, iArr6), zn(colorStateList, iArr7), zn(colorStateList, iArr8), 0});
    }

    public static int zn(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return y ? n3(colorForState) : colorForState;
    }
}

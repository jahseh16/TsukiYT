package o2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import w.ad;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final int[] y = {R$attr.f2176t};
    public static final int[] n3 = {R$attr.f2178tl};

    public static boolean a(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i5, @NonNull int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i5);
        for (int i8 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i8, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static ad c5(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i5, int... iArr2) {
        n3(context, attributeSet, i, i5);
        gv(context, attributeSet, iArr, i, i5, iArr2);
        return ad.x4(context, attributeSet, iArr, i, i5);
    }

    public static boolean fb(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static void gv(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i5, @Nullable int... iArr2) {
        boolean zA;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2409q1, i, i5);
        if (!typedArrayObtainStyledAttributes.getBoolean(R$styleable.f2427t1, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zA = typedArrayObtainStyledAttributes.getResourceId(R$styleable.r1, -1) != -1;
        } else {
            zA = a(context, attributeSet, iArr, i, i5, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zA) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void n3(@NonNull Context context, AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f2409q1, i, i5);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.s1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R$attr.z, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                zn(context);
            }
        }
        y(context);
    }

    @NonNull
    public static TypedArray s(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i, int i5, int... iArr2) {
        n3(context, attributeSet, i, i5);
        gv(context, attributeSet, iArr, i, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i5);
    }

    public static void v(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (fb(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static void y(@NonNull Context context) {
        v(context, y, "Theme.AppCompat");
    }

    public static void zn(@NonNull Context context) {
        v(context, n3, "Theme.MaterialComponents");
    }
}

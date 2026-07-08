package e3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import wz.gv;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final int[] y = {R.attr.theme, R$attr.f2171k5};
    public static final int[] n3 = {R$attr.n};

    public static int n3(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n3, i, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int y(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @NonNull
    public static Context zn(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        int iN3 = n3(context, attributeSet, i, i5);
        boolean z = (context instanceof gv) && ((gv) context).zn() == iN3;
        if (iN3 == 0 || z) {
            return context;
        }
        gv gvVar = new gv(context, iN3);
        int iY = y(context, attributeSet);
        if (iY != 0) {
            gvVar.getTheme().applyStyle(iY, true);
        }
        return gvVar;
    }
}

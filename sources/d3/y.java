package d3;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import t2.n3;
import t2.zn;

/* JADX INFO: loaded from: classes.dex */
public class y extends AppCompatTextView {
    public y(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static int c5(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int iZn = -1;
        for (int i = 0; i < iArr.length && iZn < 0; i++) {
            iZn = zn.zn(context, typedArray, iArr[i], -1);
        }
        return iZn;
    }

    public static boolean fb(Context context) {
        return n3.n3(context, R$attr.f2182x, true);
    }

    public static boolean i9(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.ns, i, i5);
        int iC5 = c5(context, typedArrayObtainStyledAttributes, R$styleable.bu, R$styleable.jg);
        typedArrayObtainStyledAttributes.recycle();
        return iC5 != -1;
    }

    public static int s(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.ns, i, i5);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.nb, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NonNull Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, R$styleable.yb);
        int iC5 = c5(getContext(), typedArrayObtainStyledAttributes, R$styleable.lq, R$styleable.ki);
        typedArrayObtainStyledAttributes.recycle();
        if (iC5 >= 0) {
            setLineHeight(iC5);
        }
    }

    public void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (fb(context)) {
            a(context.getTheme(), i);
        }
    }

    public y(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        int iS;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        Context context2 = getContext();
        if (fb(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (i9(context2, theme, attributeSet, i, i5) || (iS = s(theme, attributeSet, i, i5)) == -1) {
                return;
            }
            a(theme, iS);
        }
    }
}

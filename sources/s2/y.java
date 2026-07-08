package s2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import o2.f;
import ut.zn;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class y extends p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f7769t = R$style.z;
    public static final int[][] w = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7770f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ColorStateList f7771s;

    public y(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7771s == null) {
            int iGv = g2.y.gv(this, R$attr.f2162c5);
            int iGv2 = g2.y.gv(this, R$attr.f2166f);
            int iGv3 = g2.y.gv(this, R$attr.f2181wz);
            int[][] iArr = w;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = g2.y.s(iGv3, iGv, 1.0f);
            iArr2[1] = g2.y.s(iGv3, iGv2, 0.54f);
            iArr2[2] = g2.y.s(iGv3, iGv2, 0.38f);
            iArr2[3] = g2.y.s(iGv3, iGv2, 0.38f);
            this.f7771s = new ColorStateList(iArr, iArr2);
        }
        return this.f7771s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.RadioButton*/.onAttachedToWindow();
        if (this.f7770f && zn.n3(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUseMaterialThemeColors(boolean z) {
        this.f7770f = z;
        if (z) {
            zn.zn(this, getMaterialThemeColorsTintList());
        } else {
            zn.zn(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public y(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f7769t;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayS = f.s(context2, attributeSet, R$styleable.q4, i, i5, new int[0]);
        if (typedArrayS.hasValue(R$styleable.or)) {
            zn.zn(this, t2.zn.y(context2, typedArrayS, R$styleable.or));
        }
        this.f7770f = typedArrayS.getBoolean(R$styleable.i5, false);
        typedArrayS.recycle();
    }
}

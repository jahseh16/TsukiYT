package c2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import o2.f;
import ut.zn;
import w.s;

/* JADX INFO: loaded from: classes.dex */
public class y extends s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f1412t = R$style.f2294co;
    public static final int[][] w = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1413f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ColorStateList f1414s;

    public y(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2159a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f1414s == null) {
            int[][] iArr = w;
            int[] iArr2 = new int[iArr.length];
            int iGv = g2.y.gv(this, R$attr.f2162c5);
            int iGv2 = g2.y.gv(this, R$attr.f2181wz);
            int iGv3 = g2.y.gv(this, R$attr.f2166f);
            iArr2[0] = g2.y.s(iGv2, iGv, 1.0f);
            iArr2[1] = g2.y.s(iGv2, iGv3, 0.54f);
            iArr2[2] = g2.y.s(iGv2, iGv3, 0.38f);
            iArr2[3] = g2.y.s(iGv2, iGv3, 0.38f);
            this.f1414s = new ColorStateList(iArr, iArr2);
        }
        return this.f1414s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.widget.CheckBox*/.onAttachedToWindow();
        if (this.f1413f && zn.n3(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUseMaterialThemeColors(boolean z) {
        this.f1413f = z;
        if (z) {
            zn.zn(this, getMaterialThemeColorsTintList());
        } else {
            zn.zn(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public y(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i5 = f1412t;
        super(e3.y.zn(context, attributeSet, i, i5), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayS = f.s(context2, attributeSet, R$styleable.ex, i, i5, new int[0]);
        if (typedArrayS.hasValue(R$styleable.f2424sg)) {
            zn.zn(this, t2.zn.y(context2, typedArrayS, R$styleable.f2424sg));
        }
        this.f1413f = typedArrayS.getBoolean(R$styleable.lm, false);
        typedArrayS.recycle();
    }
}

package r2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import o2.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7646a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7647gv;
    public int n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7648v;
    public int y;

    @NonNull
    public int[] zn = new int[0];

    public n3(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.f7);
        TypedArray typedArrayS = f.s(context, attributeSet, R$styleable.f2452x, i, i5, new int[0]);
        this.y = t2.zn.zn(context, typedArrayS, R$styleable.o, dimensionPixelSize);
        this.n3 = Math.min(t2.zn.zn(context, typedArrayS, R$styleable.qn, 0), this.y / 2);
        this.f7648v = typedArrayS.getInt(R$styleable.vl, 0);
        this.f7646a = typedArrayS.getInt(R$styleable.f2315b, 0);
        zn(context, typedArrayS);
        gv(context, typedArrayS);
        typedArrayS.recycle();
    }

    public final void gv(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (typedArray.hasValue(R$styleable.f2370j5)) {
            this.f7647gv = typedArray.getColor(R$styleable.f2370j5, -1);
            return;
        }
        this.f7647gv = this.zn[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f3 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.f7647gv = g2.y.y(this.f7647gv, (int) (f3 * 255.0f));
    }

    public boolean n3() {
        return this.f7648v != 0;
    }

    public abstract void v();

    public boolean y() {
        return this.f7646a != 0;
    }

    public final void zn(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(R$styleable.f2377k5)) {
            this.zn = new int[]{g2.y.n3(context, R$attr.f2176t, -1)};
            return;
        }
        if (typedArray.peekValue(R$styleable.f2377k5).type != 1) {
            this.zn = new int[]{typedArray.getColor(R$styleable.f2377k5, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(R$styleable.f2377k5, -1));
        this.zn = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }
}

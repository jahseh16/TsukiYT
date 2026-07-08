package r2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import o2.f;

/* JADX INFO: loaded from: classes.dex */
public final class v extends n3 {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f7649c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f7650fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7651s;

    public v(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.f2175s);
    }

    public v(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.fh);
    }

    public v(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        super(context, attributeSet, i, i5);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.f2207k);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.q9);
        TypedArray typedArrayS = f.s(context, attributeSet, R$styleable.f2346gf, i, i5, new int[0]);
        this.f7650fb = Math.max(t2.zn.zn(context, typedArrayS, R$styleable.f2321br, dimensionPixelSize), this.y * 2);
        this.f7651s = t2.zn.zn(context, typedArrayS, R$styleable.f2341fc, dimensionPixelSize2);
        this.f7649c5 = typedArrayS.getInt(R$styleable.f2322bv, 0);
        typedArrayS.recycle();
        v();
    }

    @Override // r2.n3
    public void v() {
    }
}

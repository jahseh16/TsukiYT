package h2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final y f5274a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final y f5275fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @NonNull
    public final y f5276gv;

    @NonNull
    public final y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final Paint f5277s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final y f5278v;

    @NonNull
    public final y y;

    @NonNull
    public final y zn;

    public n3(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t2.n3.zn(context, R$attr.f2169i4, com.google.android.material.datepicker.y.class.getCanonicalName()), R$styleable.w5);
        this.y = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.ni, 0));
        this.f5275fb = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.p4, 0));
        this.n3 = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.ik, 0));
        this.zn = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.r3, 0));
        ColorStateList colorStateListY = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.st);
        this.f5276gv = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.g6, 0));
        this.f5278v = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.el, 0));
        this.f5274a = y.y(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.ky, 0));
        Paint paint = new Paint();
        this.f5277s = paint;
        paint.setColor(colorStateListY.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}

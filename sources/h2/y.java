package h2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.R$styleable;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2.f f5282a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final ColorStateList f5283gv;
    public final ColorStateList n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f5284v;

    @NonNull
    public final Rect y;
    public final ColorStateList zn;

    public y(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, y2.f fVar, @NonNull Rect rect) {
        j5.s.gv(rect.left);
        j5.s.gv(rect.top);
        j5.s.gv(rect.right);
        j5.s.gv(rect.bottom);
        this.y = rect;
        this.n3 = colorStateList2;
        this.zn = colorStateList;
        this.f5283gv = colorStateList3;
        this.f5284v = i;
        this.f5282a = fVar;
    }

    @NonNull
    public static y y(@NonNull Context context, int i) {
        j5.s.n3(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.yz);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.oj, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.xd, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.iv, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.f2416r5, 0));
        ColorStateList colorStateListY = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.pk);
        ColorStateList colorStateListY2 = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.zv);
        ColorStateList colorStateListY3 = t2.zn.y(context, typedArrayObtainStyledAttributes, R$styleable.aj);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ah, 0);
        y2.f fVarTl = y2.f.n3(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.gy, 0), typedArrayObtainStyledAttributes.getResourceId(R$styleable.s0, 0)).tl();
        typedArrayObtainStyledAttributes.recycle();
        return new y(colorStateListY, colorStateListY2, colorStateListY3, dimensionPixelSize, fVarTl, rect);
    }

    public void gv(@NonNull TextView textView) {
        y2.fb fbVar = new y2.fb();
        y2.fb fbVar2 = new y2.fb();
        fbVar.setShapeAppearanceModel(this.f5282a);
        fbVar2.setShapeAppearanceModel(this.f5282a);
        fbVar.k(this.zn);
        fbVar.xg(this.f5284v, this.f5283gv);
        textView.setTextColor(this.n3);
        RippleDrawable rippleDrawable = new RippleDrawable(this.n3.withAlpha(30), fbVar, fbVar2);
        Rect rect = this.y;
        ut.u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    public int n3() {
        return this.y.bottom;
    }

    public int zn() {
        return this.y.top;
    }
}

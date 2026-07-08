package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$plurals;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o2.c5;
import o2.f;
import qn.ut;
import t2.gv;
import t2.zn;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public class BadgeDrawable extends Drawable implements c5.n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f2488d = R$style.f2304t;

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final int f2489ej = R$attr.zn;
    public float c;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public float f2490co;

    @Nullable
    public WeakReference<View> d0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2491f;
    public float f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @NonNull
    public final c5 f2492fb;

    @Nullable
    public WeakReference<FrameLayout> fh;
    public float n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final SavedState f2493p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2494r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final Rect f2495s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f2496t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final fb f2497v;
    public final float w;

    @NonNull
    public final WeakReference<Context> y;
    public float z;

    public class y implements Runnable {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f2507v;
        public final /* synthetic */ View y;

        public y(View view, FrameLayout frameLayout) {
            this.y = view;
            this.f2507v = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            BadgeDrawable.this.n(this.y, this.f2507v);
        }
    }

    public BadgeDrawable(@NonNull Context context) {
        this.y = new WeakReference<>(context);
        f.zn(context);
        Resources resources = context.getResources();
        this.f2495s = new Rect();
        this.f2497v = new fb();
        this.f2491f = resources.getDimensionPixelSize(R$dimen.rz);
        this.w = resources.getDimensionPixelSize(R$dimen.fh);
        this.f2496t = resources.getDimensionPixelSize(R$dimen.f2214ta);
        c5 c5Var = new c5(this);
        this.f2492fb = c5Var;
        c5Var.v().setTextAlign(Paint.Align.CENTER);
        this.f2493p = new SavedState(context);
        r(R$style.zn);
    }

    public static void f3(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @NonNull
    public static BadgeDrawable gv(@NonNull Context context, AttributeSet attributeSet, int i, int i5) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.t(context, attributeSet, i, i5);
        return badgeDrawable;
    }

    private void r(int i) {
        Context context = this.y.get();
        if (context == null) {
            return;
        }
        z(new gv(context, i));
    }

    public static int tl(Context context, @NonNull TypedArray typedArray, int i) {
        return zn.y(context, typedArray, i).getDefaultColor();
    }

    private void z(@Nullable gv gvVar) {
        Context context;
        if (this.f2492fb.gv() == gvVar || (context = this.y.get()) == null) {
            return;
        }
        this.f2492fb.s(gvVar, context);
        c();
    }

    @NonNull
    public static BadgeDrawable zn(@NonNull Context context) {
        return gv(context, null, f2489ej, f2488d);
    }

    @NonNull
    public final String a() {
        if (i9() <= this.f2494r) {
            return NumberFormat.getInstance().format(i9());
        }
        Context context = this.y.get();
        return context == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : context.getString(R$string.f2287t, Integer.valueOf(this.f2494r), "+");
    }

    public final void c() {
        Context context = this.y.get();
        WeakReference<View> weakReference = this.d0;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f2495s);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.fh;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || com.google.android.material.badge.y.y) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        n3(context, rect2, view);
        com.google.android.material.badge.y.gv(this.f2495s, this.f2490co, this.z, this.n, this.c);
        this.f2497v.oz(this.f3);
        if (rect.equals(this.f2495s)) {
            return;
        }
        this.f2497v.setBounds(this.f2495s);
    }

    public int c5() {
        return this.f2493p.f2499f;
    }

    public void co(int i) {
        int iMax = Math.max(0, i);
        if (this.f2493p.f2503s != iMax) {
            this.f2493p.f2503s = iMax;
            this.f2492fb.c5(true);
            c();
            invalidateSelf();
        }
    }

    public final void d0() {
        this.f2494r = ((int) Math.pow(10.0d, ((double) c5()) - 1.0d)) - 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f2497v.draw(canvas);
        if (f()) {
            v(canvas);
        }
    }

    public boolean f() {
        return this.f2493p.f2503s != -1;
    }

    @Nullable
    public CharSequence fb() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!f()) {
            return this.f2493p.f2504t;
        }
        if (this.f2493p.w <= 0 || (context = this.y.get()) == null) {
            return null;
        }
        return i9() <= this.f2494r ? context.getResources().getQuantityString(this.f2493p.w, i9(), Integer.valueOf(i9())) : context.getString(this.f2493p.f2501p, Integer.valueOf(this.f2494r));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2493p.f2500fb;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2495s.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2495s.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void i4(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R$id.f2246r) {
            WeakReference<FrameLayout> weakReference = this.fh;
            if (weakReference == null || weakReference.get() != viewGroup) {
                f3(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R$id.f2246r);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int iIndexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(iIndexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, iIndexOfChild);
                this.fh = new WeakReference<>(frameLayout);
                frameLayout.post(new y(view, frameLayout));
            }
        }
    }

    public int i9() {
        if (f()) {
            return this.f2493p.f2503s;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public void mt(int i) {
        if (this.f2493p.f2499f != i) {
            this.f2493p.f2499f = i;
            d0();
            this.f2492fb.c5(true);
            c();
            invalidateSelf();
        }
    }

    public void n(@NonNull View view, @Nullable FrameLayout frameLayout) {
        this.d0 = new WeakReference<>(view);
        boolean z = com.google.android.material.badge.y.y;
        if (z && frameLayout == null) {
            i4(view);
        } else {
            this.fh = new WeakReference<>(frameLayout);
        }
        if (!z) {
            f3(view);
        }
        c();
        invalidateSelf();
    }

    public final void n3(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
        int i = this.f2493p.f3 + this.f2493p.c;
        int i5 = this.f2493p.f2498co;
        if (i5 == 8388691 || i5 == 8388693) {
            this.z = rect.bottom - i;
        } else {
            this.z = rect.top + i;
        }
        if (i9() <= 9) {
            float f3 = !f() ? this.f2491f : this.f2496t;
            this.f3 = f3;
            this.c = f3;
            this.n = f3;
        } else {
            float f4 = this.f2496t;
            this.f3 = f4;
            this.c = f4;
            this.n = (this.f2492fb.a(a()) / 2.0f) + this.w;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(f() ? R$dimen.mg : R$dimen.d0);
        int i8 = this.f2493p.f2502r + this.f2493p.n;
        int i10 = this.f2493p.f2498co;
        if (i10 == 8388659 || i10 == 8388691) {
            this.f2490co = ut.ta(view) == 0 ? (rect.left - this.n) + dimensionPixelSize + i8 : ((rect.right + this.n) - dimensionPixelSize) - i8;
        } else {
            this.f2490co = ut.ta(view) == 0 ? ((rect.right + this.n) - dimensionPixelSize) - i8 : (rect.left - this.n) + dimensionPixelSize + i8;
        }
    }

    @Override // android.graphics.drawable.Drawable, o2.c5.n3
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i) {
        this.f2493p.f2502r = i;
        c();
    }

    @Nullable
    public FrameLayout s() {
        WeakReference<FrameLayout> weakReference = this.fh;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2493p.f2500fb = i;
        this.f2492fb.v().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void t(Context context, AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayS = f.s(context, attributeSet, R$styleable.rz, i, i5, new int[0]);
        mt(typedArrayS.getInt(R$styleable.f2337ej, 4));
        if (typedArrayS.hasValue(R$styleable.f2436ud)) {
            co(typedArrayS.getInt(R$styleable.f2436ud, 0));
        }
        wz(tl(context, typedArrayS, R$styleable.mg));
        if (typedArrayS.hasValue(R$styleable.f2330d)) {
            w(tl(context, typedArrayS, R$styleable.f2330d));
        }
        xc(typedArrayS.getInt(R$styleable.f2428ta, 8388661));
        p(typedArrayS.getDimensionPixelOffset(R$styleable.f2464z6, 0));
        x4(typedArrayS.getDimensionPixelOffset(R$styleable.f2311a8, 0));
        typedArrayS.recycle();
    }

    public final void v(Canvas canvas) {
        Rect rect = new Rect();
        String strA = a();
        this.f2492fb.v().getTextBounds(strA, 0, strA.length(), rect);
        canvas.drawText(strA, this.f2490co, this.z + (rect.height() / 2), this.f2492fb.v());
    }

    public void w(int i) {
        this.f2493p.f2505v = i;
        if (this.f2492fb.v().getColor() != i) {
            this.f2492fb.v().setColor(i);
            invalidateSelf();
        }
    }

    public void wz(int i) {
        this.f2493p.y = i;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        if (this.f2497v.f3() != colorStateListValueOf) {
            this.f2497v.k(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void x4(int i) {
        this.f2493p.f3 = i;
        c();
    }

    public void xc(int i) {
        if (this.f2493p.f2498co != i) {
            this.f2493p.f2498co = i;
            WeakReference<View> weakReference = this.d0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.d0.get();
            WeakReference<FrameLayout> weakReference2 = this.fh;
            n(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    @Override // o2.c5.n3
    public void y() {
        invalidateSelf();
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new y();
        public int c;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f2498co;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2499f;
        public int f3;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f2500fb;
        public int n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2501p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2502r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f2503s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Nullable
        public CharSequence f2504t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2505v;
        public int w;
        public int y;
        public boolean z;

        public static class y implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(@NonNull Context context) {
            this.f2500fb = 255;
            this.f2503s = -1;
            this.f2505v = new gv(context, R$style.zn).y.getDefaultColor();
            this.f2504t = context.getString(R$string.f2278c5);
            this.w = R$plurals.y;
            this.f2501p = R$string.f2280f;
            this.z = true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.y);
            parcel.writeInt(this.f2505v);
            parcel.writeInt(this.f2500fb);
            parcel.writeInt(this.f2503s);
            parcel.writeInt(this.f2499f);
            parcel.writeString(this.f2504t.toString());
            parcel.writeInt(this.w);
            parcel.writeInt(this.f2498co);
            parcel.writeInt(this.f2502r);
            parcel.writeInt(this.f3);
            parcel.writeInt(this.n);
            parcel.writeInt(this.c);
            parcel.writeInt(this.z ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel) {
            this.f2500fb = 255;
            this.f2503s = -1;
            this.y = parcel.readInt();
            this.f2505v = parcel.readInt();
            this.f2500fb = parcel.readInt();
            this.f2503s = parcel.readInt();
            this.f2499f = parcel.readInt();
            this.f2504t = parcel.readString();
            this.w = parcel.readInt();
            this.f2498co = parcel.readInt();
            this.f2502r = parcel.readInt();
            this.f3 = parcel.readInt();
            this.n = parcel.readInt();
            this.c = parcel.readInt();
            this.z = parcel.readInt() != 0;
        }
    }
}

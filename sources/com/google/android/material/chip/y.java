package com.google.android.material.chip;

import a8.a;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$styleable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.Reader;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o2.c5;
import o2.f;
import o2.t;
import t1.s;
import t2.gv;
import t2.zn;
import u2.n3;
import y2.fb;

/* JADX INFO: loaded from: classes.dex */
public class y extends fb implements a, Drawable.Callback, c5.n3 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f2628q = {R.attr.state_enabled};

    /* JADX INFO: renamed from: wm, reason: collision with root package name */
    public static final ShapeDrawable f2629wm = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public final Path f2630ad;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    @Nullable
    public Drawable f2631ap;

    /* JADX INFO: renamed from: bk, reason: collision with root package name */
    public float f2632bk;

    /* JADX INFO: renamed from: cr, reason: collision with root package name */
    @Nullable
    public final Paint f2633cr;

    /* JADX INFO: renamed from: cs, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f2634cs;
    public boolean ct;

    @NonNull
    public final c5 cy;
    public float dm;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2635e;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    @Nullable
    public Drawable f2636eb;

    @Nullable
    public ColorStateList en;
    public float f7;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f2637g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public float f2638g3;

    /* JADX INFO: renamed from: gq, reason: collision with root package name */
    public int f2639gq;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    @NonNull
    public WeakReference<InterfaceC0064y> f2640i2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public TextUtils.TruncateAt f2641i3;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    public boolean f2642ix;

    @Nullable
    public ColorStateList j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public int f2643j3;

    @Nullable
    public CharSequence jz;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f2644k;

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    @Nullable
    public s f2645kp;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2646l;

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    @Nullable
    public ColorStateList f2647lc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    @Nullable
    public ColorStateList f2648le;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f2649m;

    /* JADX INFO: renamed from: mp, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f2650mp;

    /* JADX INFO: renamed from: ne, reason: collision with root package name */
    public boolean f2651ne;

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public float f2652nf;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Paint.FontMetrics f2653o0;
    public boolean o4;
    public int oa;

    @Nullable
    public ColorStateList oz;
    public final Paint pq;

    @NonNull
    public final Context pz;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    @Nullable
    public ColorFilter f2654q5;
    public float q9;

    /* JADX INFO: renamed from: qj, reason: collision with root package name */
    public int f2655qj;

    /* JADX INFO: renamed from: qk, reason: collision with root package name */
    public int f2656qk;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    @Nullable
    public CharSequence f2657ra;

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public float f2658rb;

    /* JADX INFO: renamed from: ro, reason: collision with root package name */
    public int[] f2659ro;

    @Nullable
    public Drawable rs;
    public boolean s8;
    public float tg;
    public boolean u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f2660u0;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public float f2661ut;

    /* JADX INFO: renamed from: vn, reason: collision with root package name */
    public boolean f2662vn;
    public int vp;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f2663w2;

    /* JADX INFO: renamed from: w9, reason: collision with root package name */
    public boolean f2664w9;
    public final PointF wf;
    public int x5;
    public final RectF xb;

    @Nullable
    public ColorStateList xg;
    public float y4;

    @Nullable
    public Drawable y5;

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    @Nullable
    public s f2665yc;

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    @Nullable
    public ColorStateList f2666yg;

    /* JADX INFO: renamed from: yk, reason: collision with root package name */
    @Nullable
    public ColorStateList f2667yk;

    /* JADX INFO: renamed from: com.google.android.material.chip.y$y, reason: collision with other inner class name */
    public interface InterfaceC0064y {
        void y();
    }

    public y(@NonNull Context context, AttributeSet attributeSet, int i, int i5) {
        super(context, attributeSet, i, i5);
        this.q9 = -1.0f;
        this.pq = new Paint(1);
        this.f2653o0 = new Paint.FontMetrics();
        this.xb = new RectF();
        this.wf = new PointF();
        this.f2630ad = new Path();
        this.x5 = 255;
        this.f2634cs = PorterDuff.Mode.SRC_IN;
        this.f2640i2 = new WeakReference<>(null);
        k5(context);
        this.pz = context;
        c5 c5Var = new c5(this);
        this.cy = c5Var;
        this.jz = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        c5Var.v().density = context.getResources().getDisplayMetrics().density;
        this.f2633cr = null;
        int[] iArr = f2628q;
        setState(iArr);
        yh(iArr);
        this.f2662vn = true;
        if (n3.y) {
            f2629wm.setTint(-1);
        }
    }

    public static boolean ia(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean jr(@Nullable gv gvVar) {
        ColorStateList colorStateList;
        return (gvVar == null || (colorStateList = gvVar.y) == null || !colorStateList.isStateful()) ? false : true;
    }

    @NonNull
    public static y m(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i5) {
        y yVar = new y(context, attributeSet, i, i5);
        yVar.zq(attributeSet, i, i5);
        return yVar;
    }

    public static boolean mh(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i5 : iArr) {
            if (i5 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean r6(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Nullable
    public ColorStateList ad() {
        return this.oz;
    }

    public final void ap(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (t6()) {
            float f3 = this.tg + this.y4 + this.f2652nf + this.f2632bk + this.f2660u0;
            if (a8.y.a(this) == 0) {
                float f4 = rect.right;
                rectF.right = f4;
                rectF.left = f4 - f3;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f3;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public final void bk(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (y0()) {
            nf(rect, this.xb);
            RectF rectF = this.xb;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.y5.setBounds(0, 0, (int) this.xb.width(), (int) this.xb.height());
            this.y5.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    public float br() {
        return this.f2637g;
    }

    @Nullable
    public gv bv() {
        return this.cy.gv();
    }

    public void bx(float f3) {
        if (this.f2637g != f3) {
            this.f2637g = f3;
            invalidateSelf();
            hk();
        }
    }

    public boolean c8() {
        return r6(this.rs);
    }

    public void cp(boolean z) {
        if (this.f2642ix != z) {
            this.f2642ix = z;
            m5();
            onStateChange(getState());
        }
    }

    public final void cr(@NonNull Canvas canvas, @NonNull Rect rect) {
        Paint paint = this.f2633cr;
        if (paint != null) {
            paint.setColor(ud.y.i9(-16777216, 127));
            canvas.drawRect(rect, this.f2633cr);
            if (y0() || ng()) {
                nf(rect, this.xb);
                canvas.drawRect(this.xb, this.f2633cr);
            }
            if (this.jz != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f2633cr);
            }
            if (t6()) {
                s8(rect, this.xb);
                canvas.drawRect(this.xb, this.f2633cr);
            }
            this.f2633cr.setColor(ud.y.i9(-65536, 127));
            e(rect, this.xb);
            canvas.drawRect(this.xb, this.f2633cr);
            this.f2633cr.setColor(ud.y.i9(-16711936, 127));
            ap(rect, this.xb);
            canvas.drawRect(this.xb, this.f2633cr);
        }
    }

    public float cs() {
        return this.f2632bk;
    }

    public void cw(int i) {
        iu(s.zn(this.pz, i));
    }

    public void cx(@Nullable ColorStateList colorStateList) {
        if (this.oz != colorStateList) {
            this.oz = colorStateList;
            onStateChange(getState());
        }
    }

    public float cy() {
        return this.f2651ne ? d() : this.q9;
    }

    public void dp(int i) {
        hr(this.pz.getResources().getBoolean(i));
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.x5;
        int iY = i < 255 ? a2.y.y(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        tg(canvas, bounds);
        u0(canvas, bounds);
        if (this.f2651ne) {
            super.draw(canvas);
        }
        y4(canvas, bounds);
        pq(canvas, bounds);
        bk(canvas, bounds);
        g(canvas, bounds);
        if (this.f2662vn) {
            o0(canvas, bounds);
        }
        pz(canvas, bounds);
        cr(canvas, bounds);
        if (this.x5 < 255) {
            canvas.restoreToCount(iY);
        }
    }

    public final void e(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (t6()) {
            float f3 = this.tg + this.y4 + this.f2652nf + this.f2632bk + this.f2660u0;
            if (a8.y.a(this) == 0) {
                rectF.right = rect.right - f3;
            } else {
                rectF.left = rect.left + f3;
            }
        }
    }

    public void e5(int i) {
        l3(this.pz.getResources().getDimension(i));
    }

    public void eu(boolean z) {
        if (this.o4 != z) {
            boolean zT6 = t6();
            this.o4 = z;
            boolean zT62 = t6();
            if (zT6 != zT62) {
                if (zT62) {
                    lc(this.rs);
                } else {
                    t3(this.rs);
                }
                invalidateSelf();
                hk();
            }
        }
    }

    public void ez(int i) {
        mc(this.pz.getResources().getDimension(i));
    }

    public float fc() {
        return this.f2660u0;
    }

    public void fp(@Nullable Drawable drawable) {
        Drawable drawableX5 = x5();
        if (drawableX5 != drawable) {
            float fYg = yg();
            this.rs = drawable != null ? a8.y.mt(drawable).mutate() : null;
            if (n3.y) {
                op();
            }
            float fYg2 = yg();
            t3(drawableX5);
            if (t6()) {
                lc(this.rs);
            }
            invalidateSelf();
            if (fYg != fYg2) {
                hk();
            }
        }
    }

    public void fq(float f3) {
        if (this.f2658rb != f3) {
            this.f2658rb = f3;
            invalidateSelf();
            hk();
        }
    }

    public final void g(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (ng()) {
            nf(rect, this.xb);
            RectF rectF = this.xb;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f2631ap.setBounds(0, 0, (int) this.xb.width(), (int) this.xb.height());
            this.f2631ap.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    public final boolean g3() {
        return this.s8 && this.f2631ap != null && this.f2635e;
    }

    public boolean gd() {
        return this.f2662vn;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.x5;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.f2654q5;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f2661ut;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f2658rb + ra() + this.f2637g + this.cy.a(gf().toString()) + this.f2660u0 + yg() + this.tg), this.f2643j3);
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f2651ne) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.q9);
        } else {
            outline.setRoundRect(bounds, this.q9);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public CharSequence gf() {
        return this.jz;
    }

    public void gi(float f3) {
        if (this.dm != f3) {
            float fRa = ra();
            this.dm = f3;
            float fRa2 = ra();
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public void gn(int i) {
        ic(this.pz.getResources().getBoolean(i));
    }

    @Nullable
    public ColorStateList gq() {
        return this.xg;
    }

    public boolean h() {
        return this.o4;
    }

    public void hb(boolean z) {
        if (this.u != z) {
            boolean zY0 = y0();
            this.u = z;
            boolean zY02 = y0();
            if (zY0 != zY02) {
                if (zY02) {
                    lc(this.y5);
                } else {
                    t3(this.y5);
                }
                invalidateSelf();
                hk();
            }
        }
    }

    public void hf(int i) {
        sh(this.pz.getResources().getDimension(i));
    }

    public void hj(@Nullable CharSequence charSequence) {
        if (this.f2657ra != charSequence) {
            this.f2657ra = hw.y.zn().s(charSequence);
            invalidateSelf();
        }
    }

    public void hk() {
        InterfaceC0064y interfaceC0064y = this.f2640i2.get();
        if (interfaceC0064y != null) {
            interfaceC0064y.y();
        }
    }

    public void hr(boolean z) {
        if (this.s8 != z) {
            boolean zNg = ng();
            this.s8 = z;
            boolean zNg2 = ng();
            if (zNg != zNg2) {
                if (zNg2) {
                    lc(this.f2631ap);
                } else {
                    t3(this.f2631ap);
                }
                invalidateSelf();
                hk();
            }
        }
    }

    @Deprecated
    public void hy(float f3) {
        if (this.q9 != f3) {
            this.q9 = f3;
            setShapeAppearanceModel(rz().i4(f3));
        }
    }

    public void i(@Nullable ColorStateList colorStateList) {
        if (this.f2666yg != colorStateList) {
            this.f2666yg = colorStateList;
            if (g3()) {
                a8.y.xc(this.f2631ap, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void i1(int i) {
        nh(f.n3.zn(this.pz, i));
    }

    public final float i2() {
        Drawable drawable = this.f2664w9 ? this.f2631ap : this.y5;
        float fCeil = this.dm;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(t.n3(this.pz, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public final float i3() {
        Drawable drawable = this.f2664w9 ? this.f2631ap : this.y5;
        float f3 = this.dm;
        return (f3 > 0.0f || drawable == null) ? f3 : drawable.getIntrinsicWidth();
    }

    public void ic(boolean z) {
        if (this.f2635e != z) {
            this.f2635e = z;
            float fRa = ra();
            if (!z && this.f2664w9) {
                this.f2664w9 = false;
            }
            float fRa2 = ra();
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public void ih(@Nullable s sVar) {
        this.f2645kp = sVar;
    }

    public boolean im() {
        return this.f2642ix;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return ia(this.j) || ia(this.oz) || ia(this.f2644k) || (this.f2642ix && ia(this.f2667yk)) || jr(this.cy.gv()) || g3() || r6(this.y5) || r6(this.f2631ap) || ia(this.f2648le);
    }

    public void iu(@Nullable s sVar) {
        this.f2665yc = sVar;
    }

    @Nullable
    public ColorStateList ix() {
        return this.f2647lc;
    }

    @Nullable
    public s j3() {
        return this.f2645kp;
    }

    public void j4(@Nullable ColorStateList colorStateList) {
        if (this.en != colorStateList) {
            this.en = colorStateList;
            m5();
            onStateChange(getState());
        }
    }

    public void ja(int i) {
        bx(this.pz.getResources().getDimension(i));
    }

    public void jb(int i) {
        jt(this.pz.getResources().getDimension(i));
    }

    public void jm(int i) {
        ih(s.zn(this.pz, i));
    }

    public void jt(float f3) {
        if (this.tg != f3) {
            this.tg = f3;
            invalidateSelf();
            hk();
        }
    }

    public final boolean k3(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.j;
        int iT = t(colorStateList != null ? colorStateList.getColorForState(iArr, this.f2656qk) : 0);
        boolean state = true;
        if (this.f2656qk != iT) {
            this.f2656qk = iT;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.oz;
        int iT2 = t(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f2655qj) : 0);
        if (this.f2655qj != iT2) {
            this.f2655qj = iT2;
            zOnStateChange = true;
        }
        int iFb = g2.y.fb(iT, iT2);
        if ((this.f2646l != iFb) | (f3() == null)) {
            this.f2646l = iFb;
            k(ColorStateList.valueOf(iFb));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f2644k;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f2639gq) : 0;
        if (this.f2639gq != colorForState) {
            this.f2639gq = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f2667yk == null || !n3.v(iArr)) ? 0 : this.f2667yk.getColorForState(iArr, this.vp);
        if (this.vp != colorForState2) {
            this.vp = colorForState2;
            if (this.f2642ix) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.cy.gv() == null || this.cy.gv().y == null) ? 0 : this.cy.gv().y.getColorForState(iArr, this.oa);
        if (this.oa != colorForState3) {
            this.oa = colorForState3;
            zOnStateChange = true;
        }
        boolean z5 = mh(getState(), R.attr.state_checked) && this.f2635e;
        if (this.f2664w9 == z5 || this.f2631ap == null) {
            z = false;
        } else {
            float fRa = ra();
            this.f2664w9 = z5;
            if (fRa != ra()) {
                zOnStateChange = true;
                z = true;
            } else {
                zOnStateChange = true;
                z = false;
            }
        }
        ColorStateList colorStateList4 = this.f2648le;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f2663w2) : 0;
        if (this.f2663w2 != colorForState4) {
            this.f2663w2 = colorForState4;
            this.f2650mp = k2.y.y(this, this.f2648le, this.f2634cs);
        } else {
            state = zOnStateChange;
        }
        if (r6(this.y5)) {
            state |= this.y5.setState(iArr);
        }
        if (r6(this.f2631ap)) {
            state |= this.f2631ap.setState(iArr);
        }
        if (r6(this.rs)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.rs.setState(iArr3);
        }
        if (n3.y && r6(this.f2636eb)) {
            state |= this.f2636eb.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            hk();
        }
        return state;
    }

    public final float kp() {
        this.cy.v().getFontMetrics(this.f2653o0);
        Paint.FontMetrics fontMetrics = this.f2653o0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public final void ks(@Nullable ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            onStateChange(getState());
        }
    }

    public float l() {
        return this.dm;
    }

    public void l0(@Nullable ColorStateList colorStateList) {
        this.ct = true;
        if (this.xg != colorStateList) {
            this.xg = colorStateList;
            if (y0()) {
                a8.y.xc(this.y5, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l3(float f3) {
        if (this.f2632bk != f3) {
            this.f2632bk = f3;
            invalidateSelf();
            if (t6()) {
                hk();
            }
        }
    }

    public void l8(@Nullable gv gvVar) {
        this.cy.s(gvVar, this.pz);
    }

    public final void lc(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a8.y.tl(drawable, a8.y.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.rs) {
            if (drawable.isStateful()) {
                drawable.setState(ro());
            }
            a8.y.xc(drawable, this.f2647lc);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.y5;
        if (drawable == drawable2 && this.ct) {
            a8.y.xc(drawable2, this.xg);
        }
    }

    public float le() {
        return this.f2652nf;
    }

    public final void m5() {
        this.f2667yk = this.f2642ix ? n3.gv(this.en) : null;
    }

    public void mc(float f3) {
        if (this.f2638g3 != f3) {
            float fRa = ra();
            this.f2638g3 = f3;
            float fRa2 = ra();
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public float mp() {
        return this.y4;
    }

    public void mq(float f3) {
        if (this.f2649m != f3) {
            float fRa = ra();
            this.f2649m = f3;
            float fRa2 = ra();
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public boolean n7() {
        return this.f2635e;
    }

    @Nullable
    public s nd() {
        return this.f2665yc;
    }

    public float ne() {
        return this.f2649m;
    }

    public final void nf(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (y0() || ng()) {
            float f3 = this.f2658rb + this.f2638g3;
            float fI3 = i3();
            if (a8.y.a(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + fI3;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - fI3;
            }
            float fI2 = i2();
            float fExactCenterY = rect.exactCenterY() - (fI2 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fI2;
        }
    }

    public final boolean ng() {
        return this.s8 && this.f2631ap != null && this.f2664w9;
    }

    public void nh(@Nullable ColorStateList colorStateList) {
        if (this.f2647lc != colorStateList) {
            this.f2647lc = colorStateList;
            if (t6()) {
                a8.y.xc(this.rs, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void nz(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        if (TextUtils.equals(this.jz, charSequence)) {
            return;
        }
        this.jz = charSequence;
        this.cy.c5(true);
        invalidateSelf();
        hk();
    }

    public final void o0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.jz != null) {
            Paint.Align alignRb = rb(rect, this.wf);
            yc(rect, this.xb);
            if (this.cy.gv() != null) {
                this.cy.v().drawableState = getState();
                this.cy.i9(this.pz);
            }
            this.cy.v().setTextAlign(alignRb);
            int iSave = 0;
            boolean z = Math.round(this.cy.a(gf().toString())) > Math.round(this.xb.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.xb);
            }
            CharSequence charSequenceEllipsize = this.jz;
            if (z && this.f2641i3 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.cy.v(), this.xb.width(), this.f2641i3);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.wf;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.cy.v());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public float oa() {
        return this.f2658rb;
    }

    public void ob(float f3) {
        if (this.f2661ut != f3) {
            this.f2661ut = f3;
            invalidateSelf();
            hk();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (y0()) {
            zOnLayoutDirectionChanged |= a8.y.tl(this.y5, i);
        }
        if (ng()) {
            zOnLayoutDirectionChanged |= a8.y.tl(this.f2631ap, i);
        }
        if (t6()) {
            zOnLayoutDirectionChanged |= a8.y.tl(this.rs, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (y0()) {
            zOnLevelChange |= this.y5.setLevel(i);
        }
        if (ng()) {
            zOnLevelChange |= this.f2631ap.setLevel(i);
        }
        if (t6()) {
            zOnLevelChange |= this.rs.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // y2.fb, android.graphics.drawable.Drawable, o2.c5.n3
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.f2651ne) {
            super.onStateChange(iArr);
        }
        return k3(iArr, ro());
    }

    @TargetApi(21)
    public final void op() {
        this.f2636eb = new RippleDrawable(n3.gv(wm()), this.rs, f2629wm);
    }

    public void ou(float f3) {
        if (this.f2652nf != f3) {
            this.f2652nf = f3;
            invalidateSelf();
            if (t6()) {
                hk();
            }
        }
    }

    public void p1(int i) {
        vc(f.n3.gv(this.pz, i));
    }

    public void p2(boolean z) {
        this.f2662vn = z;
    }

    public final void pq(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.pq.setColor(this.vp);
        this.pq.setStyle(Paint.Style.FILL);
        this.xb.set(rect);
        if (!this.f2651ne) {
            canvas.drawRoundRect(this.xb, cy(), cy(), this.pq);
        } else {
            s(new RectF(rect), this.f2630ad);
            super.w(canvas, this.pq, this.f2630ad, r());
        }
    }

    public final void pz(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (t6()) {
            s8(rect, this.xb);
            RectF rectF = this.xb;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.rs.setBounds(0, 0, (int) this.xb.width(), (int) this.xb.height());
            if (n3.y) {
                this.f2636eb.setBounds(this.rs.getBounds());
                this.f2636eb.jumpToCurrentState();
                this.f2636eb.draw(canvas);
            } else {
                this.rs.draw(canvas);
            }
            canvas.translate(-f3, -f4);
        }
    }

    public float q() {
        return this.f2638g3;
    }

    @Nullable
    public CharSequence q5() {
        return this.f2657ra;
    }

    @Nullable
    public Drawable qj() {
        Drawable drawable = this.y5;
        if (drawable != null) {
            return a8.y.p(drawable);
        }
        return null;
    }

    public float qk() {
        return this.tg;
    }

    public float ra() {
        if (y0() || ng()) {
            return this.f2638g3 + i3() + this.f2649m;
        }
        return 0.0f;
    }

    @NonNull
    public Paint.Align rb(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.jz != null) {
            float fRa = this.f2658rb + ra() + this.f2637g;
            if (a8.y.a(this) == 0) {
                pointF.x = rect.left + fRa;
            } else {
                pointF.x = rect.right - fRa;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - kp();
        }
        return align;
    }

    public void rk(int i) {
        wv(this.pz.getResources().getDimension(i));
    }

    @NonNull
    public int[] ro() {
        return this.f2659ro;
    }

    public void rt(int i) {
        t5(this.pz.getResources().getDimension(i));
    }

    public void rv(int i) {
        i(f.n3.zn(this.pz, i));
    }

    public final void s8(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (t6()) {
            float f3 = this.tg + this.y4;
            if (a8.y.a(this) == 0) {
                float f4 = rect.right - f3;
                rectF.right = f4;
                rectF.left = f4 - this.f2652nf;
            } else {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + this.f2652nf;
            }
            float fExactCenterY = rect.exactCenterY();
            float f7 = this.f2652nf;
            float f8 = fExactCenterY - (f7 / 2.0f);
            rectF.top = f8;
            rectF.bottom = f8 + f7;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.x5 != i) {
            this.x5 = i;
            invalidateSelf();
        }
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.f2654q5 != colorFilter) {
            this.f2654q5 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.f2648le != colorStateList) {
            this.f2648le = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f2634cs != mode) {
            this.f2634cs = mode;
            this.f2650mp = k2.y.y(this, this.f2648le, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z5) {
        boolean visible = super.setVisible(z, z5);
        if (y0()) {
            visible |= this.y5.setVisible(z, z5);
        }
        if (ng()) {
            visible |= this.f2631ap.setVisible(z, z5);
        }
        if (t6()) {
            visible |= this.rs.setVisible(z, z5);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void sh(float f3) {
        if (this.y4 != f3) {
            this.y4 = f3;
            invalidateSelf();
            if (t6()) {
                hk();
            }
        }
    }

    public void sw(@Nullable Drawable drawable) {
        Drawable drawableQj = qj();
        if (drawableQj != drawable) {
            float fRa = ra();
            this.y5 = drawable != null ? a8.y.mt(drawable).mutate() : null;
            float fRa2 = ra();
            t3(drawableQj);
            if (y0()) {
                lc(this.y5);
            }
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public void sx(int i) {
        fq(this.pz.getResources().getDimension(i));
    }

    public final void t3(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void t5(float f3) {
        if (this.f7 != f3) {
            this.f7 = f3;
            this.pq.setStrokeWidth(f3);
            if (this.f2651ne) {
                super.ct(f3);
            }
            invalidateSelf();
        }
    }

    public final boolean t6() {
        return this.o4 && this.rs != null;
    }

    public void t7(int i) {
        j4(f.n3.zn(this.pz, i));
    }

    public final void tg(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f2651ne) {
            return;
        }
        this.pq.setColor(this.f2656qk);
        this.pq.setStyle(Paint.Style.FILL);
        this.xb.set(rect);
        canvas.drawRoundRect(this.xb, cy(), cy(), this.pq);
    }

    public final void u0(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f2651ne) {
            return;
        }
        this.pq.setColor(this.f2655qj);
        this.pq.setStyle(Paint.Style.FILL);
        this.pq.setColorFilter(uo());
        this.xb.set(rect);
        canvas.drawRoundRect(this.xb, cy(), cy(), this.pq);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Nullable
    public final ColorFilter uo() {
        ColorFilter colorFilter = this.f2654q5;
        return colorFilter != null ? colorFilter : this.f2650mp;
    }

    public void ux(@Nullable ColorStateList colorStateList) {
        if (this.f2644k != colorStateList) {
            this.f2644k = colorStateList;
            if (this.f2651ne) {
                dm(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v1(int i) {
        sw(f.n3.gv(this.pz, i));
    }

    public void vb(int i) {
        ob(this.pz.getResources().getDimension(i));
    }

    public void vc(@Nullable Drawable drawable) {
        if (this.f2631ap != drawable) {
            float fRa = ra();
            this.f2631ap = drawable;
            float fRa2 = ra();
            t3(this.f2631ap);
            lc(this.f2631ap);
            invalidateSelf();
            if (fRa != fRa2) {
                hk();
            }
        }
    }

    public void vd(int i) {
        ux(f.n3.zn(this.pz, i));
    }

    public void vh(int i) {
        cx(f.n3.zn(this.pz, i));
    }

    public void vi(int i) {
        ou(this.pz.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt vn() {
        return this.f2641i3;
    }

    public float vp() {
        return this.f2661ut;
    }

    public float w2() {
        return this.f7;
    }

    public void w7(int i) {
        fp(f.n3.gv(this.pz, i));
    }

    @Nullable
    public ColorStateList w9() {
        return this.f2644k;
    }

    public void wb(int i) {
        this.f2643j3 = i;
    }

    @Nullable
    public ColorStateList wf() {
        return this.f2666yg;
    }

    @Nullable
    public ColorStateList wm() {
        return this.en;
    }

    public void wo(int i) {
        l0(f.n3.zn(this.pz, i));
    }

    public void wv(float f3) {
        if (this.f2660u0 != f3) {
            this.f2660u0 = f3;
            invalidateSelf();
            hk();
        }
    }

    public void x0(int i) {
        mq(this.pz.getResources().getDimension(i));
    }

    @Nullable
    public Drawable x5() {
        Drawable drawable = this.rs;
        if (drawable != null) {
            return a8.y.p(drawable);
        }
        return null;
    }

    @Nullable
    public Drawable xb() {
        return this.f2631ap;
    }

    public void xh(int i) {
        l8(new gv(this.pz, i));
    }

    @Deprecated
    public void xq(int i) {
        hy(this.pz.getResources().getDimension(i));
    }

    public void xu(@Nullable InterfaceC0064y interfaceC0064y) {
        this.f2640i2 = new WeakReference<>(interfaceC0064y);
    }

    @Override // o2.c5.n3
    public void y() {
        hk();
        invalidateSelf();
    }

    public final boolean y0() {
        return this.u && this.y5 != null;
    }

    public final void y4(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.f7 <= 0.0f || this.f2651ne) {
            return;
        }
        this.pq.setColor(this.f2639gq);
        this.pq.setStyle(Paint.Style.STROKE);
        if (!this.f2651ne) {
            this.pq.setColorFilter(uo());
        }
        RectF rectF = this.xb;
        float f3 = rect.left;
        float f4 = this.f7;
        rectF.set(f3 + (f4 / 2.0f), rect.top + (f4 / 2.0f), rect.right - (f4 / 2.0f), rect.bottom - (f4 / 2.0f));
        float f5 = this.q9 - (this.f7 / 2.0f);
        canvas.drawRoundRect(this.xb, f5, f5, this.pq);
    }

    public final void yc(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.jz != null) {
            float fRa = this.f2658rb + ra() + this.f2637g;
            float fYg = this.tg + yg() + this.f2660u0;
            if (a8.y.a(this) == 0) {
                rectF.left = rect.left + fRa;
                rectF.right = rect.right - fYg;
            } else {
                rectF.left = rect.left + fYg;
                rectF.right = rect.right - fRa;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public float yg() {
        if (t6()) {
            return this.f2632bk + this.f2652nf + this.y4;
        }
        return 0.0f;
    }

    public boolean yh(@NonNull int[] iArr) {
        if (Arrays.equals(this.f2659ro, iArr)) {
            return false;
        }
        this.f2659ro = iArr;
        if (t6()) {
            return k3(getState(), iArr);
        }
        return false;
    }

    public void yk(@NonNull RectF rectF) {
        ap(getBounds(), rectF);
    }

    public void z8(@Nullable TextUtils.TruncateAt truncateAt) {
        this.f2641i3 = truncateAt;
    }

    public void zh(int i) {
        hb(this.pz.getResources().getBoolean(i));
    }

    public final void zq(@Nullable AttributeSet attributeSet, int i, int i5) {
        TypedArray typedArrayS = f.s(this.pz, attributeSet, R$styleable.f2459yg, i, i5, new int[0]);
        this.f2651ne = typedArrayS.hasValue(R$styleable.f2369j3);
        ks(zn.y(this.pz, typedArrayS, R$styleable.f2448w9));
        cx(zn.y(this.pz, typedArrayS, R$styleable.pq));
        ob(typedArrayS.getDimension(R$styleable.f2412qj, 0.0f));
        if (typedArrayS.hasValue(R$styleable.f2328cr)) {
            hy(typedArrayS.getDimension(R$styleable.f2328cr, 0.0f));
        }
        ux(zn.y(this.pz, typedArrayS, R$styleable.vp));
        t5(typedArrayS.getDimension(R$styleable.oa, 0.0f));
        j4(zn.y(this.pz, typedArrayS, R$styleable.f2443vn));
        nz(typedArrayS.getText(R$styleable.f2343g));
        gv gvVarA = zn.a(this.pz, typedArrayS, R$styleable.f2458yc);
        gvVarA.f8193wz = typedArrayS.getDimension(R$styleable.f2378kp, gvVarA.f8193wz);
        l8(gvVarA);
        int i8 = typedArrayS.getInt(R$styleable.f2345g3, 0);
        if (i8 == 1) {
            z8(TextUtils.TruncateAt.START);
        } else if (i8 == 2) {
            z8(TextUtils.TruncateAt.MIDDLE);
        } else if (i8 == 3) {
            z8(TextUtils.TruncateAt.END);
        }
        hb(typedArrayS.getBoolean(R$styleable.f2413qk, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            hb(typedArrayS.getBoolean(R$styleable.wf, false));
        }
        sw(zn.gv(this.pz, typedArrayS, R$styleable.xb));
        if (typedArrayS.hasValue(R$styleable.cy)) {
            l0(zn.y(this.pz, typedArrayS, R$styleable.cy));
        }
        gi(typedArrayS.getDimension(R$styleable.f2312ad, -1.0f));
        eu(typedArrayS.getBoolean(R$styleable.f2420ro, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eu(typedArrayS.getBoolean(R$styleable.x5, false));
        }
        fp(zn.gv(this.pz, typedArrayS, R$styleable.f2446w2));
        nh(zn.y(this.pz, typedArrayS, R$styleable.f2329cs));
        ou(typedArrayS.getDimension(R$styleable.f2390mp, 0.0f));
        ic(typedArrayS.getBoolean(R$styleable.f2432u0, false));
        hr(typedArrayS.getBoolean(R$styleable.pz, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            hr(typedArrayS.getBoolean(R$styleable.y4, false));
        }
        vc(zn.gv(this.pz, typedArrayS, R$styleable.f2318bk));
        if (typedArrayS.hasValue(R$styleable.tg)) {
            i(zn.y(this.pz, typedArrayS, R$styleable.tg));
        }
        iu(s.n3(this.pz, typedArrayS, R$styleable.f2396ne));
        ih(s.n3(this.pz, typedArrayS, R$styleable.f2460yk));
        fq(typedArrayS.getDimension(R$styleable.f2349gq, 0.0f));
        mc(typedArrayS.getDimension(R$styleable.f2359i3, 0.0f));
        mq(typedArrayS.getDimension(R$styleable.f2358i2, 0.0f));
        bx(typedArrayS.getDimension(R$styleable.f2449wm, 0.0f));
        wv(typedArrayS.getDimension(R$styleable.f2407q, 0.0f));
        l3(typedArrayS.getDimension(R$styleable.f2383le, 0.0f));
        sh(typedArrayS.getDimension(R$styleable.f2410q5, 0.0f));
        jt(typedArrayS.getDimension(R$styleable.f2400o0, 0.0f));
        wb(typedArrayS.getDimensionPixelSize(R$styleable.f2385m, Reader.READ_DONE));
        typedArrayS.recycle();
    }

    public void zx(int i) {
        gi(this.pz.getResources().getDimension(i));
    }
}

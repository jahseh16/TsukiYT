package z1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import o2.t;
import qn.ut;
import t2.zn;
import u2.n3;
import y2.f;
import y2.fb;
import y2.wz;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final boolean z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9420a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f9421c5;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public int f9422co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ColorStateList f9423f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9424fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f9425gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    @Nullable
    public ColorStateList f9426i9;

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public LayerDrawable f9427mt;

    @NonNull
    public f n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9428p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public ColorStateList f9430t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    @Nullable
    public Drawable f9431tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9432v;
    public final MaterialButton y;
    public int zn;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f9433wz = false;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public boolean f9434xc = false;
    public boolean w = false;

    public y(MaterialButton materialButton, @NonNull f fVar) {
        this.y = materialButton;
        this.n3 = fVar;
    }

    @Nullable
    public fb a() {
        return fb(false);
    }

    @NonNull
    public final InsetDrawable a8(Drawable drawable) {
        return new InsetDrawable(drawable, this.zn, this.f9432v, this.f9425gv, this.f9420a);
    }

    public void c(boolean z5) {
        this.f9433wz = z5;
        ud();
    }

    @NonNull
    public f c5() {
        return this.n3;
    }

    public void co() {
        this.f9434xc = true;
        this.y.setSupportBackgroundTintList(this.f9426i9);
        this.y.setSupportBackgroundTintMode(this.f9421c5);
    }

    public final void d() {
        this.y.setInternalBackground(y());
        fb fbVarA = a();
        if (fbVarA != null) {
            fbVarA.q9(this.f9422co);
        }
    }

    public void d0(@Nullable ColorStateList colorStateList) {
        if (this.f9423f != colorStateList) {
            this.f9423f = colorStateList;
            ud();
        }
    }

    public void ej(int i, int i5) {
        Drawable drawable = this.f9431tl;
        if (drawable != null) {
            drawable.setBounds(this.zn, this.f9432v, i5 - this.f9425gv, i - this.f9420a);
        }
    }

    public int f() {
        return this.f9429s;
    }

    public void f3(@Nullable ColorStateList colorStateList) {
        if (this.f9430t != colorStateList) {
            this.f9430t = colorStateList;
            boolean z5 = z;
            if (z5 && (this.y.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.y.getBackground()).setColor(n3.gv(colorStateList));
            } else {
                if (z5 || !(this.y.getBackground() instanceof u2.y)) {
                    return;
                }
                ((u2.y) this.y.getBackground()).setTintList(n3.gv(colorStateList));
            }
        }
    }

    @Nullable
    public final fb fb(boolean z5) {
        LayerDrawable layerDrawable = this.f9427mt;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return z ? (fb) ((LayerDrawable) ((InsetDrawable) this.f9427mt.getDrawable(0)).getDrawable()).getDrawable(!z5 ? 1 : 0) : (fb) this.f9427mt.getDrawable(!z5 ? 1 : 0);
    }

    public void fh(int i) {
        if (this.f9429s != i) {
            this.f9429s = i;
            ud();
        }
    }

    public int gv() {
        return this.f9432v;
    }

    public void i4(int i) {
        ta(i, this.f9420a);
    }

    @Nullable
    public ColorStateList i9() {
        return this.f9423f;
    }

    public void mg(@Nullable PorterDuff.Mode mode) {
        if (this.f9421c5 != mode) {
            this.f9421c5 = mode;
            if (a() == null || this.f9421c5 == null) {
                return;
            }
            a8.y.w(a(), this.f9421c5);
        }
    }

    public void mt(int i) {
        if (a() != null) {
            a().setTint(i);
        }
    }

    public void n(@NonNull f fVar) {
        this.n3 = fVar;
        z6(fVar);
    }

    public int n3() {
        return this.f9424fb;
    }

    public void p(@NonNull TypedArray typedArray) {
        this.zn = typedArray.getDimensionPixelOffset(R$styleable.iu, 0);
        this.f9425gv = typedArray.getDimensionPixelOffset(R$styleable.cw, 0);
        this.f9432v = typedArray.getDimensionPixelOffset(R$styleable.nz, 0);
        this.f9420a = typedArray.getDimensionPixelOffset(R$styleable.l8, 0);
        if (typedArray.hasValue(R$styleable.bx)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.bx, -1);
            this.f9424fb = dimensionPixelSize;
            n(this.n3.i4(dimensionPixelSize));
            this.w = true;
        }
        this.f9429s = typedArray.getDimensionPixelSize(R$styleable.gm, 0);
        this.f9421c5 = t.v(typedArray.getInt(R$styleable.rk, -1), PorterDuff.Mode.SRC_IN);
        this.f9426i9 = zn.y(this.y.getContext(), typedArray, R$styleable.wv);
        this.f9423f = zn.y(this.y.getContext(), typedArray, R$styleable.op);
        this.f9430t = zn.y(this.y.getContext(), typedArray, R$styleable.m5);
        this.f9428p = typedArray.getBoolean(R$styleable.xh, false);
        this.f9422co = typedArray.getDimensionPixelSize(R$styleable.ja, 0);
        int iA8 = ut.a8(this.y);
        int paddingTop = this.y.getPaddingTop();
        int iUd = ut.ud(this.y);
        int paddingBottom = this.y.getPaddingBottom();
        if (typedArray.hasValue(R$styleable.p2)) {
            co();
        } else {
            d();
        }
        ut.cy(this.y, iA8 + this.zn, paddingTop + this.f9432v, iUd + this.f9425gv, paddingBottom + this.f9420a);
    }

    public void r(int i) {
        if (this.w && this.f9424fb == i) {
            return;
        }
        this.f9424fb = i;
        this.w = true;
        n(this.n3.i4(i));
    }

    public void rz(@Nullable ColorStateList colorStateList) {
        if (this.f9426i9 != colorStateList) {
            this.f9426i9 = colorStateList;
            if (a() != null) {
                a8.y.xc(a(), this.f9426i9);
            }
        }
    }

    @Nullable
    public ColorStateList s() {
        return this.f9430t;
    }

    public ColorStateList t() {
        return this.f9426i9;
    }

    public final void ta(int i, int i5) {
        int iA8 = ut.a8(this.y);
        int paddingTop = this.y.getPaddingTop();
        int iUd = ut.ud(this.y);
        int paddingBottom = this.y.getPaddingBottom();
        int i8 = this.f9432v;
        int i10 = this.f9420a;
        this.f9420a = i5;
        this.f9432v = i;
        if (!this.f9434xc) {
            d();
        }
        ut.cy(this.y, iA8, (paddingTop + i) - i8, iUd, (paddingBottom + i5) - i10);
    }

    public PorterDuff.Mode tl() {
        return this.f9421c5;
    }

    public final void ud() {
        fb fbVarA = a();
        fb fbVarWz = wz();
        if (fbVarA != null) {
            fbVarA.xg(this.f9429s, this.f9423f);
            if (fbVarWz != null) {
                fbVarWz.y5(this.f9429s, this.f9433wz ? g2.y.gv(this.y, R$attr.f2181wz) : 0);
            }
        }
    }

    @Nullable
    public wz v() {
        LayerDrawable layerDrawable = this.f9427mt;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f9427mt.getNumberOfLayers() > 2 ? (wz) this.f9427mt.getDrawable(2) : (wz) this.f9427mt.getDrawable(1);
    }

    public boolean w() {
        return this.f9428p;
    }

    @Nullable
    public final fb wz() {
        return fb(true);
    }

    public void x4(int i) {
        ta(this.f9432v, i);
    }

    public boolean xc() {
        return this.f9434xc;
    }

    public final Drawable y() {
        fb fbVar = new fb(this.n3);
        fbVar.k5(this.y.getContext());
        a8.y.xc(fbVar, this.f9426i9);
        PorterDuff.Mode mode = this.f9421c5;
        if (mode != null) {
            a8.y.w(fbVar, mode);
        }
        fbVar.xg(this.f9429s, this.f9423f);
        fb fbVar2 = new fb(this.n3);
        fbVar2.setTint(0);
        fbVar2.y5(this.f9429s, this.f9433wz ? g2.y.gv(this.y, R$attr.f2181wz) : 0);
        if (z) {
            fb fbVar3 = new fb(this.n3);
            this.f9431tl = fbVar3;
            a8.y.wz(fbVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(n3.gv(this.f9430t), a8(new LayerDrawable(new Drawable[]{fbVar2, fbVar})), this.f9431tl);
            this.f9427mt = rippleDrawable;
            return rippleDrawable;
        }
        u2.y yVar = new u2.y(this.n3);
        this.f9431tl = yVar;
        a8.y.xc(yVar, n3.gv(this.f9430t));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fbVar2, fbVar, this.f9431tl});
        this.f9427mt = layerDrawable;
        return a8(layerDrawable);
    }

    public void z(boolean z5) {
        this.f9428p = z5;
    }

    public final void z6(@NonNull f fVar) {
        if (a() != null) {
            a().setShapeAppearanceModel(fVar);
        }
        if (wz() != null) {
            wz().setShapeAppearanceModel(fVar);
        }
        if (v() != null) {
            v().setShapeAppearanceModel(fVar);
        }
    }

    public int zn() {
        return this.f9420a;
    }
}

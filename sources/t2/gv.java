package t2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$styleable;
import ej.s;

/* JADX INFO: loaded from: classes.dex */
public class gv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8182a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final float f8183c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8184f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final int f8185fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    @Nullable
    public final ColorStateList f8186gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final float f8187i9;

    @Nullable
    public final ColorStateList n3;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Typeface f8188p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8189s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f8190t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final float f8191tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final String f8192v;
    public boolean w = false;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public float f8193wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final int f8194xc;

    @Nullable
    public final ColorStateList y;

    @Nullable
    public final ColorStateList zn;

    public class n3 extends v {
        public final /* synthetic */ v n3;
        public final /* synthetic */ TextPaint y;

        public n3(TextPaint textPaint, v vVar) {
            this.y = textPaint;
            this.n3 = vVar;
        }

        @Override // t2.v
        public void n3(@NonNull Typeface typeface, boolean z) {
            gv.this.t(this.y, typeface);
            this.n3.n3(typeface, z);
        }

        @Override // t2.v
        public void y(int i) {
            this.n3.y(i);
        }
    }

    public class y extends s.v {
        public final /* synthetic */ v y;

        public y(v vVar) {
            this.y = vVar;
        }

        @Override // ej.s.v
        /* JADX INFO: renamed from: c5 */
        public void fb(@NonNull Typeface typeface) {
            gv gvVar = gv.this;
            gvVar.f8188p = Typeface.create(typeface, gvVar.f8182a);
            gv.this.w = true;
            this.y.n3(gv.this.f8188p, false);
        }

        @Override // ej.s.v
        /* JADX INFO: renamed from: s */
        public void a(int i) {
            gv.this.w = true;
            this.y.y(i);
        }
    }

    public gv(@NonNull Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.B);
        this.f8193wz = typedArrayObtainStyledAttributes.getDimension(R$styleable.C, 0.0f);
        this.y = zn.y(context, typedArrayObtainStyledAttributes, R$styleable.F);
        this.n3 = zn.y(context, typedArrayObtainStyledAttributes, R$styleable.G);
        this.zn = zn.y(context, typedArrayObtainStyledAttributes, R$styleable.H);
        this.f8182a = typedArrayObtainStyledAttributes.getInt(R$styleable.E, 0);
        this.f8185fb = typedArrayObtainStyledAttributes.getInt(R$styleable.D, 1);
        int iV = zn.v(typedArrayObtainStyledAttributes, R$styleable.N, R$styleable.M);
        this.f8194xc = typedArrayObtainStyledAttributes.getResourceId(iV, 0);
        this.f8192v = typedArrayObtainStyledAttributes.getString(iV);
        this.f8189s = typedArrayObtainStyledAttributes.getBoolean(R$styleable.O, false);
        this.f8186gv = zn.y(context, typedArrayObtainStyledAttributes, R$styleable.I);
        this.f8183c5 = typedArrayObtainStyledAttributes.getFloat(R$styleable.J, 0.0f);
        this.f8187i9 = typedArrayObtainStyledAttributes.getFloat(R$styleable.K, 0.0f);
        this.f8184f = typedArrayObtainStyledAttributes.getFloat(R$styleable.L, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, R$styleable.yb);
        this.f8190t = typedArrayObtainStyledAttributes2.hasValue(R$styleable.mk);
        this.f8191tl = typedArrayObtainStyledAttributes2.getFloat(R$styleable.mk, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @NonNull
    public Typeface a(@NonNull Context context) {
        if (this.w) {
            return this.f8188p;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceFb = s.fb(context, this.f8194xc);
                this.f8188p = typefaceFb;
                if (typefaceFb != null) {
                    this.f8188p = Typeface.create(typefaceFb, this.f8182a);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.f8192v, e4);
            }
        }
        gv();
        this.w = true;
        return this.f8188p;
    }

    public final boolean c5(Context context) {
        int i = this.f8194xc;
        return (i != 0 ? s.zn(context, i) : null) != null;
    }

    public void f(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull v vVar) {
        if (c5(context)) {
            t(textPaint, a(context));
        } else {
            fb(context, textPaint, vVar);
        }
    }

    public void fb(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull v vVar) {
        t(textPaint, v());
        s(context, new n3(textPaint, vVar));
    }

    public final void gv() {
        String str;
        if (this.f8188p == null && (str = this.f8192v) != null) {
            this.f8188p = Typeface.create(str, this.f8182a);
        }
        if (this.f8188p == null) {
            int i = this.f8185fb;
            if (i == 1) {
                this.f8188p = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f8188p = Typeface.SERIF;
            } else if (i != 3) {
                this.f8188p = Typeface.DEFAULT;
            } else {
                this.f8188p = Typeface.MONOSPACE;
            }
            this.f8188p = Typeface.create(this.f8188p, this.f8182a);
        }
    }

    public void i9(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull v vVar) {
        f(context, textPaint, vVar);
        ColorStateList colorStateList = this.y;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f3 = this.f8184f;
        float f4 = this.f8183c5;
        float f5 = this.f8187i9;
        ColorStateList colorStateList2 = this.f8186gv;
        textPaint.setShadowLayer(f3, f4, f5, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void s(@NonNull Context context, @NonNull v vVar) {
        if (c5(context)) {
            a(context);
        } else {
            gv();
        }
        int i = this.f8194xc;
        if (i == 0) {
            this.w = true;
        }
        if (this.w) {
            vVar.n3(this.f8188p, true);
            return;
        }
        try {
            s.c5(context, i, new y(vVar), null);
        } catch (Resources.NotFoundException unused) {
            this.w = true;
            vVar.y(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f8192v, e4);
            this.w = true;
            vVar.y(-3);
        }
    }

    public void t(@NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f8182a;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8193wz);
        if (this.f8190t) {
            textPaint.setLetterSpacing(this.f8191tl);
        }
    }

    public Typeface v() {
        gv();
        return this.f8188p;
    }
}

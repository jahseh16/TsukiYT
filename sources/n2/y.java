package n2;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import y2.f;
import y2.t;

/* JADX INFO: loaded from: classes.dex */
public class y extends Drawable {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f6908c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6909f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public int f6912i9;

    @NonNull
    public final Paint n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f6913s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6914t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public int f6915tl;

    @Nullable
    public ColorStateList w;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public f f6918xc;
    public final t y = t.f();
    public final Path zn = new Path();

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Rect f6911gv = new Rect();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f6916v = new RectF();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f6907a = new RectF();

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final n3 f6910fb = new n3();

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public boolean f6917wz = true;

    public class n3 extends Drawable.ConstantState {
        public n3() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return y.this;
        }
    }

    public y(f fVar) {
        this.f6918xc = fVar;
        Paint paint = new Paint(1);
        this.n3 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public void a(f fVar) {
        this.f6918xc = fVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f6917wz) {
            this.n3.setShader(y());
            this.f6917wz = false;
        }
        float strokeWidth = this.n3.getStrokeWidth() / 2.0f;
        copyBounds(this.f6911gv);
        this.f6916v.set(this.f6911gv);
        float fMin = Math.min(this.f6918xc.mt().y(n3()), this.f6916v.width() / 2.0f);
        if (this.f6918xc.r(n3())) {
            this.f6916v.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f6916v, fMin, fMin, this.n3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f6910fb;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f6913s > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f6918xc.r(n3())) {
            outline.setRoundRect(getBounds(), this.f6918xc.mt().y(n3()));
            return;
        }
        copyBounds(this.f6911gv);
        this.f6916v.set(this.f6911gv);
        this.y.gv(this.f6918xc, 1.0f, this.f6916v, this.zn);
        if (this.zn.isConvex()) {
            outline.setConvexPath(this.zn);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f6918xc.r(n3())) {
            return true;
        }
        int iRound = Math.round(this.f6913s);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public void gv(float f3) {
        if (this.f6913s != f3) {
            this.f6913s = f3;
            this.n3.setStrokeWidth(f3 * 1.3333f);
            this.f6917wz = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.w;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @NonNull
    public RectF n3() {
        this.f6907a.set(getBounds());
        return this.f6907a;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f6917wz = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.w;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f6915tl)) != this.f6915tl) {
            this.f6917wz = true;
            this.f6915tl = colorForState;
        }
        if (this.f6917wz) {
            invalidateSelf();
        }
        return this.f6917wz;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.n3.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.n3.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void v(int i, int i5, int i8, int i10) {
        this.f6908c5 = i;
        this.f6912i9 = i5;
        this.f6909f = i8;
        this.f6914t = i10;
    }

    @NonNull
    public final Shader y() {
        copyBounds(this.f6911gv);
        float fHeight = this.f6913s / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{ud.y.a(this.f6908c5, this.f6915tl), ud.y.a(this.f6912i9, this.f6915tl), ud.y.a(ud.y.i9(this.f6912i9, 0), this.f6915tl), ud.y.a(ud.y.i9(this.f6914t, 0), this.f6915tl), ud.y.a(this.f6914t, this.f6915tl), ud.y.a(this.f6909f, this.f6915tl)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    public void zn(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f6915tl = colorStateList.getColorForState(getState(), this.f6915tl);
        }
        this.w = colorStateList;
        this.f6917wz = true;
        invalidateSelf();
    }
}

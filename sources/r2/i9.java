package r2;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r2.n3;

/* JADX INFO: loaded from: classes.dex */
public final class i9<S extends n3> extends fb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c5<ObjectAnimator> f7645d;
    public s<S> fh;

    public i9(@NonNull Context context, @NonNull n3 n3Var, @NonNull s<S> sVar, @NonNull c5<ObjectAnimator> c5Var) {
        super(context, n3Var);
        i4(sVar);
        x4(c5Var);
    }

    @NonNull
    public static i9<v> co(@NonNull Context context, @NonNull v vVar) {
        return new i9<>(context, vVar, new zn(vVar), new gv(vVar));
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean c5() {
        return super.c5();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.fh.fb(canvas, fb());
        this.fh.zn(canvas, this.n);
        int i = 0;
        while (true) {
            c5<ObjectAnimator> c5Var = this.f7645d;
            int[] iArr = c5Var.zn;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            s<S> sVar = this.fh;
            Paint paint = this.n;
            float[] fArr = c5Var.n3;
            int i5 = i * 2;
            sVar.n3(canvas, paint, fArr[i5], fArr[i5 + 1], iArr[i]);
            i++;
        }
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.fh.gv();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.fh.v();
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public void i4(@NonNull s<S> sVar) {
        this.fh = sVar;
        sVar.a(this);
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean i9() {
        return super.i9();
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean mt(@NonNull x5.n3 n3Var) {
        return super.mt(n3Var);
    }

    @Override // r2.fb
    public boolean p(boolean z, boolean z5, boolean z7) {
        boolean zP = super.p(z, z5, z7);
        if (!isRunning()) {
            this.f7645d.y();
        }
        float fY = this.f7627fb.y(this.y.getContentResolver());
        if (z && (z7 || (Build.VERSION.SDK_INT <= 21 && fY > 0.0f))) {
            this.f7645d.fb();
        }
        return zP;
    }

    @NonNull
    public s<S> r() {
        return this.fh;
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // r2.fb, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z5) {
        return super.setVisible(z, z5);
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // r2.fb, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ void t(@NonNull x5.n3 n3Var) {
        super.t(n3Var);
    }

    @Override // r2.fb
    public /* bridge */ /* synthetic */ boolean w(boolean z, boolean z5, boolean z7) {
        return super.w(z, z5, z7);
    }

    public void x4(@NonNull c5<ObjectAnimator> c5Var) {
        this.f7645d = c5Var;
        c5Var.v(this);
    }

    @NonNull
    public c5<ObjectAnimator> z() {
        return this.f7645d;
    }
}

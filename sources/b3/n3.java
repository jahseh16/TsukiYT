package b3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class n3 extends y2.fb {

    @NonNull
    public final Paint j;

    @NonNull
    public final RectF oz;

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public int f1324ut;

    public n3() {
        this(null);
    }

    public void ap(float f3, float f4, float f5, float f7) {
        RectF rectF = this.oz;
        if (f3 == rectF.left && f4 == rectF.top && f5 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f4, f5, f7);
        invalidateSelf();
    }

    @Override // y2.fb, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        ra(canvas);
        super.draw(canvas);
        canvas.drawRect(this.oz, this.j);
        nf(canvas);
    }

    public void e() {
        ap(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean kp(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public boolean lc() {
        return !this.oz.isEmpty();
    }

    public final void nf(@NonNull Canvas canvas) {
        if (kp(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.f1324ut);
    }

    public final void ra(@NonNull Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!kp(callback)) {
            s8(canvas);
            return;
        }
        View view = (View) callback;
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
    }

    public final void s8(@NonNull Canvas canvas) {
        this.f1324ut = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
    }

    public final void yc() {
        this.j.setStyle(Paint.Style.FILL_AND_STROKE);
        this.j.setColor(-1);
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public void yg(@NonNull RectF rectF) {
        ap(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public n3(@Nullable y2.f fVar) {
        super(fVar == null ? new y2.f() : fVar);
        this.j = new Paint(1);
        yc();
        this.oz = new RectF();
    }
}

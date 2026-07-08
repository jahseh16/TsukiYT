package r2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends s<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7652a;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public float f7653gv;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f7654v;
    public int zn;

    public zn(@NonNull v vVar) {
        super(vVar);
        this.zn = 1;
    }

    public final int c5() {
        S s3 = this.y;
        return ((v) s3).f7650fb + (((v) s3).f7651s * 2);
    }

    @Override // r2.s
    public int gv() {
        return c5();
    }

    @Override // r2.s
    public void n3(@NonNull Canvas canvas, @NonNull Paint paint, float f3, float f4, int i) {
        if (f3 == f4) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f7653gv);
        int i5 = this.zn;
        float f5 = f3 * 360.0f * i5;
        float f7 = (f4 >= f3 ? f4 - f3 : (f4 + 1.0f) - f3) * 360.0f * i5;
        float f8 = this.f7652a;
        canvas.drawArc(new RectF(-f8, -f8, f8, f8), f5, f7, false, paint);
        if (this.f7654v <= 0.0f || Math.abs(f7) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        float f9 = this.f7654v;
        RectF rectF = new RectF(-f9, -f9, f9, f9);
        s(canvas, paint, this.f7653gv, this.f7654v, f5, true, rectF);
        s(canvas, paint, this.f7653gv, this.f7654v, f5 + f7, false, rectF);
    }

    public final void s(Canvas canvas, Paint paint, float f3, float f4, float f5, boolean z, RectF rectF) {
        float f7 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f5);
        float f8 = f3 / 2.0f;
        float f9 = f7 * f4;
        canvas.drawRect((this.f7652a - f8) + f4, Math.min(0.0f, this.zn * f9), (this.f7652a + f8) - f4, Math.max(0.0f, f9 * this.zn), paint);
        canvas.translate((this.f7652a - f8) + f4, 0.0f);
        canvas.drawArc(rectF, 180.0f, (-f7) * 90.0f * this.zn, true, paint);
        canvas.translate(f3 - (f4 * 2.0f), 0.0f);
        canvas.drawArc(rectF, 0.0f, f7 * 90.0f * this.zn, true, paint);
        canvas.restore();
    }

    @Override // r2.s
    public int v() {
        return c5();
    }

    @Override // r2.s
    public void y(@NonNull Canvas canvas, float f3) {
        S s3 = this.y;
        float f4 = (((v) s3).f7650fb / 2.0f) + ((v) s3).f7651s;
        canvas.translate(f4, f4);
        canvas.rotate(-90.0f);
        float f5 = -f4;
        canvas.clipRect(f5, f5, f4, f4);
        this.zn = ((v) this.y).f7649c5 == 0 ? 1 : -1;
        this.f7653gv = ((v) r5).y * f3;
        this.f7654v = ((v) r5).n3 * f3;
        this.f7652a = (((v) r5).f7650fb - ((v) r5).y) / 2.0f;
        if ((this.n3.i9() && ((v) this.y).f7648v == 2) || (this.n3.c5() && ((v) this.y).f7646a == 1)) {
            this.f7652a += ((1.0f - f3) * ((v) this.y).y) / 2.0f;
        } else if ((this.n3.i9() && ((v) this.y).f7648v == 1) || (this.n3.c5() && ((v) this.y).f7646a == 2)) {
            this.f7652a -= ((1.0f - f3) * ((v) this.y).y) / 2.0f;
        }
    }

    @Override // r2.s
    public void zn(@NonNull Canvas canvas, @NonNull Paint paint) {
        int iY = g2.y.y(((v) this.y).f7647gv, this.n3.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iY);
        paint.setStrokeWidth(this.f7653gv);
        float f3 = this.f7652a;
        canvas.drawArc(new RectF(-f3, -f3, f3, f3), 0.0f, 360.0f, false, paint);
    }
}

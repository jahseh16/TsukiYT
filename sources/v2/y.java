package v2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8787a;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Path f8788fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f8789gv;

    @NonNull
    public final Paint n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Paint f8790s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8791v;

    @NonNull
    public final Paint y;

    @NonNull
    public final Paint zn;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final int[] f8783c5 = new int[3];

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final float[] f8785i9 = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8784f = new int[4];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float[] f8786t = {0.0f, 0.0f, 0.5f, 1.0f};

    public y() {
        this(-16777216);
    }

    public void gv(int i) {
        this.f8789gv = ud.y.i9(i, 68);
        this.f8791v = ud.y.i9(i, 20);
        this.f8787a = ud.y.i9(i, 0);
        this.y.setColor(this.f8789gv);
    }

    public void n3(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f8783c5;
        iArr[0] = this.f8787a;
        iArr[1] = this.f8791v;
        iArr[2] = this.f8789gv;
        Paint paint = this.zn;
        float f3 = rectF.left;
        paint.setShader(new LinearGradient(f3, rectF.top, f3, rectF.bottom, iArr, f8785i9, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.zn);
        canvas.restore();
    }

    public void y(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i, float f3, float f4) {
        boolean z = f4 < 0.0f;
        Path path = this.f8788fb;
        if (z) {
            int[] iArr = f8784f;
            iArr[0] = 0;
            iArr[1] = this.f8787a;
            iArr[2] = this.f8791v;
            iArr[3] = this.f8789gv;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f4);
            path.close();
            float f5 = -i;
            rectF.inset(f5, f5);
            int[] iArr2 = f8784f;
            iArr2[0] = 0;
            iArr2[1] = this.f8789gv;
            iArr2[2] = this.f8791v;
            iArr2[3] = this.f8787a;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i / fWidth);
        float[] fArr = f8786t;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.n3.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f8784f, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f8790s);
        }
        canvas.drawArc(rectF, f3, f4, true, this.n3);
        canvas.restore();
    }

    @NonNull
    public Paint zn() {
        return this.y;
    }

    public y(int i) {
        this.f8788fb = new Path();
        this.f8790s = new Paint();
        this.y = new Paint();
        gv(i);
        this.f8790s.setColor(0);
        Paint paint = new Paint(4);
        this.n3 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.zn = new Paint(paint);
    }
}

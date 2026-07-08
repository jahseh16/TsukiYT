package h;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public final PointF n3;
    public final PointF y;
    public final PointF zn;

    public y() {
        this.y = new PointF();
        this.n3 = new PointF();
        this.zn = new PointF();
    }

    public void a(float f3, float f4) {
        this.zn.set(f3, f4);
    }

    public void gv(float f3, float f4) {
        this.y.set(f3, f4);
    }

    public PointF n3() {
        return this.n3;
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.zn.x), Float.valueOf(this.zn.y), Float.valueOf(this.y.x), Float.valueOf(this.y.y), Float.valueOf(this.n3.x), Float.valueOf(this.n3.y));
    }

    public void v(float f3, float f4) {
        this.n3.set(f3, f4);
    }

    public PointF y() {
        return this.y;
    }

    public PointF zn() {
        return this.zn;
    }

    public y(PointF pointF, PointF pointF2, PointF pointF3) {
        this.y = pointF;
        this.n3 = pointF2;
        this.zn = pointF3;
    }
}

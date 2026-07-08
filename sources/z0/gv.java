package z0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class gv implements SensorEventListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Display f9388f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y[] f9391t;
    public boolean w;
    public final float[] y = new float[16];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f9392v = new float[16];

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final float[] f9389fb = new float[16];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f9390s = new float[3];

    public interface y {
        void y(float[] fArr, float f3);
    }

    public gv(Display display, y... yVarArr) {
        this.f9388f = display;
        this.f9391t = yVarArr;
    }

    public static void v(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final void gv(float[] fArr, int i) {
        if (i != 0) {
            int i5 = 129;
            int i8 = 1;
            if (i == 1) {
                i5 = 2;
                i8 = 129;
            } else if (i == 2) {
                i8 = 130;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i5 = 130;
            }
            float[] fArr2 = this.f9392v;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f9392v, i5, i8, fArr);
        }
    }

    public final void n3(float[] fArr, float f3) {
        for (y yVar : this.f9391t) {
            yVar.y(fArr, f3);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.y, sensorEvent.values);
        gv(this.y, this.f9388f.getRotation());
        float fY = y(this.y);
        v(this.y);
        zn(this.y);
        n3(this.y, fY);
    }

    public final float y(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f9392v);
        SensorManager.getOrientation(this.f9392v, this.f9390s);
        return this.f9390s[2];
    }

    public final void zn(float[] fArr) {
        if (!this.w) {
            zn.y(this.f9389fb, fArr);
            this.w = true;
        }
        float[] fArr2 = this.f9392v;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f9392v, 0, this.f9389fb, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}

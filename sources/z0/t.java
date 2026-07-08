package z0;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import v0.ut;
import v0.w;
import w0.wz;
import z0.gv;
import z0.tl;

/* JADX INFO: loaded from: classes.dex */
public final class t extends GLSurfaceView {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    @Nullable
    public Surface f9396co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f9397f;
    public boolean f3;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public final Sensor f9398fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f9399p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gv f9401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tl f9402t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SensorManager f9403v;
    public final c5 w;
    public final CopyOnWriteArrayList<n3> y;
    public boolean z;

    public interface n3 {
        void a(Surface surface);

        void xc(Surface surface);
    }

    public final class y implements GLSurfaceView.Renderer, tl.y, gv.y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float[] f9405f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f9407p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final float[] f9409s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final float[] f9410t;
        public float w;
        public final c5 y;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final float[] f9411v = new float[16];

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final float[] f9406fb = new float[16];

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public final float[] f9404co = new float[16];
        public final float[] z = new float[16];

        public y(c5 c5Var) {
            float[] fArr = new float[16];
            this.f9409s = fArr;
            float[] fArr2 = new float[16];
            this.f9405f = fArr2;
            float[] fArr3 = new float[16];
            this.f9410t = fArr3;
            this.y = c5Var;
            w.i9(fArr);
            w.i9(fArr2);
            w.i9(fArr3);
            this.f9407p = 3.1415927f;
        }

        public final void gv() {
            Matrix.setRotateM(this.f9405f, 0, -this.w, (float) Math.cos(this.f9407p), (float) Math.sin(this.f9407p), 0.0f);
        }

        @Override // z0.tl.y
        public synchronized void n3(PointF pointF) {
            this.w = pointF.y;
            gv();
            Matrix.setRotateM(this.f9410t, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.z, 0, this.f9409s, 0, this.f9410t, 0);
                Matrix.multiplyMM(this.f9404co, 0, this.f9405f, 0, this.z, 0);
            }
            Matrix.multiplyMM(this.f9406fb, 0, this.f9411v, 0, this.f9404co, 0);
            this.y.gv(this.f9406fb, false);
        }

        @Override // z0.tl.y
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return t.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i5) {
            GLES20.glViewport(0, 0, i, i5);
            float f3 = i / i5;
            Matrix.perspectiveM(this.f9411v, 0, zn(f3), f3, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            t.this.fb(this.y.a());
        }

        @Override // z0.gv.y
        public synchronized void y(float[] fArr, float f3) {
            float[] fArr2 = this.f9409s;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f9407p = -f3;
            gv();
        }

        public final float zn(float f3) {
            if (f3 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f3))) * 2.0d);
            }
            return 90.0f;
        }
    }

    public t(Context context) {
        this(context, null);
    }

    public static void s(@Nullable SurfaceTexture surfaceTexture, @Nullable Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public final /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f9399p;
        Surface surface = this.f9396co;
        Surface surface2 = new Surface(surfaceTexture);
        this.f9399p = surfaceTexture;
        this.f9396co = surface2;
        Iterator<n3> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().xc(surface2);
        }
        s(surfaceTexture2, surface);
    }

    public void c5(n3 n3Var) {
        this.y.remove(n3Var);
    }

    public final void fb(final SurfaceTexture surfaceTexture) {
        this.f9397f.post(new Runnable() { // from class: z0.i9
            @Override // java.lang.Runnable
            public final void run() {
                this.y.a(surfaceTexture);
            }
        });
    }

    public z0.y getCameraMotionListener() {
        return this.w;
    }

    public wz getVideoFrameMetadataListener() {
        return this.w;
    }

    @Nullable
    public Surface getVideoSurface() {
        return this.f9396co;
    }

    public void gv(n3 n3Var) {
        this.y.add(n3Var);
    }

    public final void i9() {
        boolean z = this.z && this.f9400r;
        Sensor sensor = this.f9398fb;
        if (sensor == null || z == this.f3) {
            return;
        }
        if (z) {
            this.f9403v.registerListener(this.f9401s, sensor, 0);
        } else {
            this.f9403v.unregisterListener(this.f9401s);
        }
        this.f3 = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9397f.post(new Runnable() { // from class: z0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.y.v();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f9400r = false;
        i9();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f9400r = true;
        i9();
    }

    public void setDefaultStereoMode(int i) {
        this.w.s(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.z = z;
        i9();
    }

    public final /* synthetic */ void v() {
        Surface surface = this.f9396co;
        if (surface != null) {
            Iterator<n3> it = this.y.iterator();
            while (it.hasNext()) {
                it.next().a(surface);
            }
        }
        s(this.f9399p, surface);
        this.f9399p = null;
        this.f9396co = null;
    }

    public t(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new CopyOnWriteArrayList<>();
        this.f9397f = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) v0.y.v(context.getSystemService("sensor"));
        this.f9403v = sensorManager;
        Sensor defaultSensor = ut.y >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f9398fb = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        c5 c5Var = new c5();
        this.w = c5Var;
        y yVar = new y(c5Var);
        tl tlVar = new tl(context, yVar, 25.0f);
        this.f9402t = tlVar;
        this.f9401s = new gv(((WindowManager) v0.y.v((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), tlVar, yVar);
        this.z = true;
        setEGLContextClientVersion(2);
        setRenderer(yVar);
        setOnTouchListener(tlVar);
    }
}

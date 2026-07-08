package v0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import v0.w;

/* JADX INFO: loaded from: classes.dex */
public final class f implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] w = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public EGLSurface f8742f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    @Nullable
    public EGLDisplay f8743fb;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public EGLContext f8744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public SurfaceTexture f8745t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f8746v;
    public final Handler y;

    public interface y {
    }

    public f(Handler handler) {
        this(handler, null);
    }

    public static EGLDisplay a() throws w.y {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        w.zn(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        w.zn(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public static EGLContext n3(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws w.y {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        w.zn(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public static void v(int[] iArr) throws w.y {
        GLES20.glGenTextures(1, iArr, 0);
        w.n3();
    }

    public static EGLConfig y(EGLDisplay eGLDisplay) throws w.y {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, w, 0, eGLConfigArr, 0, 1, iArr, 0);
        w.zn(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, ut.rz("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    public static EGLSurface zn(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws w.y {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            w.zn(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        w.zn(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c5() {
        this.y.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f8745t;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f8746v, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f8743fb;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f8743fb;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f8742f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f8743fb, this.f8742f);
            }
            EGLContext eGLContext = this.f8744s;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f8743fb, eGLContext);
            }
            if (ut.y >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f8743fb;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f8743fb);
            }
            this.f8743fb = null;
            this.f8744s = null;
            this.f8742f = null;
            this.f8745t = null;
        }
    }

    public SurfaceTexture fb() {
        return (SurfaceTexture) v0.y.v(this.f8745t);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.y.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        gv();
        SurfaceTexture surfaceTexture = this.f8745t;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public void s(int i) throws w.y {
        EGLDisplay eGLDisplayA = a();
        this.f8743fb = eGLDisplayA;
        EGLConfig eGLConfigY = y(eGLDisplayA);
        EGLContext eGLContextN3 = n3(this.f8743fb, eGLConfigY, i);
        this.f8744s = eGLContextN3;
        this.f8742f = zn(this.f8743fb, eGLConfigY, eGLContextN3, i);
        v(this.f8746v);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f8746v[0]);
        this.f8745t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public f(Handler handler, @Nullable y yVar) {
        this.y = handler;
        this.f8746v = new int[1];
    }

    public final void gv() {
    }
}

package v0;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final int[] y = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] n3 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] zn = {12344};

    public static final class y extends Exception {
        public y(String str) {
            super(str);
        }
    }

    public static int a() throws y {
        int iFb = fb();
        y(36197, iFb);
        return iFb;
    }

    public static boolean c5() {
        String strEglQueryString;
        return ut.y >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static int fb() throws y {
        zn(!ut.zn(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        n3();
        return iArr[0];
    }

    public static FloatBuffer gv(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void i9(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void n3() throws y {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(iGlGetError));
            z = true;
        }
        if (z) {
            throw new y(sb.toString());
        }
    }

    public static boolean s(Context context) {
        String strEglQueryString;
        int i = ut.y;
        if (i < 24) {
            return false;
        }
        if (i >= 26 || !("samsung".equals(ut.zn) || "XT1650".equals(ut.f8761gv))) {
            return (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static FloatBuffer v(float[] fArr) {
        return (FloatBuffer) gv(fArr.length).put(fArr).flip();
    }

    public static void y(int i, int i5) throws y {
        GLES20.glBindTexture(i, i5);
        n3();
        GLES20.glTexParameteri(i, 10240, 9729);
        n3();
        GLES20.glTexParameteri(i, 10241, 9729);
        n3();
        GLES20.glTexParameteri(i, 10242, 33071);
        n3();
        GLES20.glTexParameteri(i, 10243, 33071);
        n3();
    }

    public static void zn(boolean z, String str) throws y {
        if (!z) {
            throw new y(str);
        }
    }
}

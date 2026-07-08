package z0;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import v0.w;
import v0.xc;
import z0.v;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9381a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public int f9382c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public int f9383fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public xc f9384gv;

    @Nullable
    public y n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9385s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9386v;
    public int y;

    @Nullable
    public y zn;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final float[] f9377i9 = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f9376f = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float[] f9378t = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final float[] f9379tl = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final float[] f9380wz = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    public static class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final int f9387gv;
        public final FloatBuffer n3;
        public final int y;
        public final FloatBuffer zn;

        public y(v.n3 n3Var) {
            this.y = n3Var.y();
            this.n3 = w.v(n3Var.zn);
            this.zn = w.v(n3Var.f9418gv);
            int i = n3Var.n3;
            if (i == 1) {
                this.f9387gv = 5;
            } else if (i != 2) {
                this.f9387gv = 4;
            } else {
                this.f9387gv = 6;
            }
        }
    }

    public static boolean zn(v vVar) {
        v.y yVar = vVar.y;
        v.y yVar2 = vVar.n3;
        return yVar.n3() == 1 && yVar.y(0).y == 0 && yVar2.n3() == 1 && yVar2.y(0).y == 0;
    }

    public void gv(v vVar) {
        if (zn(vVar)) {
            this.y = vVar.zn;
            y yVar = new y(vVar.y.y(0));
            this.n3 = yVar;
            if (!vVar.f9417gv) {
                yVar = new y(vVar.n3.y(0));
            }
            this.zn = yVar;
        }
    }

    public void n3() {
        try {
            xc xcVar = new xc("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f9384gv = xcVar;
            this.f9386v = xcVar.i9("uMvpMatrix");
            this.f9381a = this.f9384gv.i9("uTexMatrix");
            this.f9383fb = this.f9384gv.v("aPosition");
            this.f9385s = this.f9384gv.v("aTexCoords");
            this.f9382c5 = this.f9384gv.i9("uTexture");
        } catch (w.y e4) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e4);
        }
    }

    public void y(int i, float[] fArr, boolean z) {
        y yVar = z ? this.zn : this.n3;
        if (yVar == null) {
            return;
        }
        int i5 = this.y;
        GLES20.glUniformMatrix3fv(this.f9381a, 1, false, i5 == 1 ? z ? f9378t : f9376f : i5 == 2 ? z ? f9380wz : f9379tl : f9377i9, 0);
        GLES20.glUniformMatrix4fv(this.f9386v, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.f9382c5, 0);
        try {
            w.n3();
        } catch (w.y e4) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e4);
        }
        GLES20.glVertexAttribPointer(this.f9383fb, 3, 5126, false, 12, (Buffer) yVar.n3);
        try {
            w.n3();
        } catch (w.y e5) {
            Log.e("ProjectionRenderer", "Failed to load position data", e5);
        }
        GLES20.glVertexAttribPointer(this.f9385s, 2, 5126, false, 8, (Buffer) yVar.zn);
        try {
            w.n3();
        } catch (w.y e6) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e6);
        }
        GLES20.glDrawArrays(yVar.f9387gv, 0, yVar.y);
        try {
            w.n3();
        } catch (w.y e8) {
            Log.e("ProjectionRenderer", "Failed to render", e8);
        }
    }
}

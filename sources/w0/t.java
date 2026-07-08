package w0;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import v0.w;

/* JADX INFO: loaded from: classes.dex */
public final class t extends GLSurfaceView implements tl {
    public final y y;

    public static final class y implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        public int f8909co;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public v0.xc f8912p;
        public final GLSurfaceView y;
        public di.f z;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final float[] f8908r = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
        public static final float[] f3 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final float[] n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        public static final String[] c = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer d0 = v0.w.v(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final int[] f8915v = new int[3];

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final int[] f8911fb = new int[3];

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int[] f8913s = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f8910f = new int[3];

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final AtomicReference<di.f> f8914t = new AtomicReference<>();
        public final FloatBuffer[] w = new FloatBuffer[3];

        public y(GLSurfaceView gLSurfaceView) {
            this.y = gLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.f8913s;
                this.f8910f[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void n3() {
            try {
                GLES20.glGenTextures(3, this.f8915v, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.f8912p.i9(c[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    v0.w.y(3553, this.f8915v[i]);
                }
                v0.w.n3();
            } catch (w.y e4) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e4);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            di.f andSet = this.f8914t.getAndSet(null);
            if (andSet == null && this.z == null) {
                return;
            }
            if (andSet != null) {
                di.f fVar = this.z;
                if (fVar != null) {
                    fVar.p();
                }
                this.z = andSet;
            }
            di.f fVar2 = (di.f) v0.y.v(this.z);
            float[] fArr = f3;
            int i = fVar2.f3175p;
            if (i == 1) {
                fArr = f8908r;
            } else if (i == 3) {
                fArr = n;
            }
            GLES20.glUniformMatrix3fv(this.f8909co, 1, false, fArr, 0);
            int[] iArr = (int[]) v0.y.v(fVar2.w);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) v0.y.v(fVar2.f3177t);
            for (int i5 = 0; i5 < 3; i5++) {
                int i8 = fVar2.f3174f;
                if (i5 != 0) {
                    i8 = (i8 + 1) / 2;
                }
                int i10 = i8;
                GLES20.glActiveTexture(33984 + i5);
                GLES20.glBindTexture(3553, this.f8915v[i5]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i5], i10, 0, 6409, 5121, byteBufferArr[i5]);
            }
            int i11 = fVar2.f3176s;
            int i12 = (i11 + 1) / 2;
            int[] iArr2 = {i11, i12, i12};
            for (int i13 = 0; i13 < 3; i13++) {
                if (this.f8913s[i13] != iArr2[i13] || this.f8910f[i13] != iArr[i13]) {
                    v0.y.fb(iArr[i13] != 0);
                    float f4 = iArr2[i13] / iArr[i13];
                    this.w[i13] = v0.w.v(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f4, 0.0f, f4, 1.0f});
                    GLES20.glVertexAttribPointer(this.f8911fb[i13], 2, 5126, false, 0, (Buffer) this.w[i13]);
                    this.f8913s[i13] = iArr2[i13];
                    this.f8910f[i13] = iArr[i13];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                v0.w.n3();
            } catch (w.y e4) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e4);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i5) {
            GLES20.glViewport(0, 0, i, i5);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                v0.xc xcVar = new v0.xc("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f8912p = xcVar;
                GLES20.glVertexAttribPointer(xcVar.v("in_pos"), 2, 5126, false, 0, (Buffer) d0);
                this.f8911fb[0] = this.f8912p.v("in_tc_y");
                this.f8911fb[1] = this.f8912p.v("in_tc_u");
                this.f8911fb[2] = this.f8912p.v("in_tc_v");
                this.f8909co = this.f8912p.i9("mColorConversion");
                v0.w.n3();
                n3();
                v0.w.n3();
            } catch (w.y e4) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e4);
            }
        }

        public void y(di.f fVar) {
            di.f andSet = this.f8914t.getAndSet(fVar);
            if (andSet != null) {
                andSet.p();
            }
            this.y.requestRender();
        }
    }

    public t(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(di.f fVar) {
        this.y.y(fVar);
    }

    public t(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        y yVar = new y(this);
        this.y = yVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(yVar);
        setRenderMode(0);
    }

    @Deprecated
    public tl getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}

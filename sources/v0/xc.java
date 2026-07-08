package v0;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import v0.w;

/* JADX INFO: loaded from: classes.dex */
public final class xc {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final Map<String, y> f8772gv;
    public final y[] n3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, n3> f8773v;
    public final int y;
    public final n3[] zn;

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final float[] f8774gv = new float[16];
        public final int n3;
        public final String y;
        public final int zn;

        public n3(String str, int i, int i5) {
            this.y = str;
            this.n3 = i;
            this.zn = i5;
        }

        public static n3 y(int i, int i5) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            GLES20.glGetActiveUniform(i, i5, i8, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, xc.s(bArr));
            return new n3(str, xc.c5(i, str), iArr2[0]);
        }
    }

    public static final class y {
        public final int n3;
        public final String y;
        public final int zn;

        public y(String str, int i, int i5) {
            this.y = str;
            this.n3 = i;
            this.zn = i5;
        }

        public static y y(int i, int i5) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i8 = iArr[0];
            byte[] bArr = new byte[i8];
            GLES20.glGetActiveAttrib(i, i5, i8, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, xc.s(bArr));
            return new y(str, i5, xc.a(i, str));
        }
    }

    public xc(String str, String str2) throws w.y {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.y = iGlCreateProgram;
        w.n3();
        gv(iGlCreateProgram, 35633, str);
        gv(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        w.zn(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f8772gv = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.n3 = new y[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            y yVarY = y.y(this.y, i);
            this.n3[i] = yVarY;
            this.f8772gv.put(yVarY.y, yVarY);
        }
        this.f8773v = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.y, 35718, iArr3, 0);
        this.zn = new n3[iArr3[0]];
        for (int i5 = 0; i5 < iArr3[0]; i5++) {
            n3 n3VarY = n3.y(this.y, i5);
            this.zn[i5] = n3VarY;
            this.f8773v.put(n3VarY.y, n3VarY);
        }
        w.n3();
    }

    public static int a(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    public static int c5(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    public static void gv(int i, int i5, String str) throws w.y {
        int iGlCreateShader = GLES20.glCreateShader(i5);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        w.zn(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        w.n3();
    }

    public static int s(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public final int fb(String str) {
        return a(this.y, str);
    }

    public int i9(String str) {
        return c5(this.y, str);
    }

    public int v(String str) throws w.y {
        int iFb = fb(str);
        GLES20.glEnableVertexAttribArray(iFb);
        w.n3();
        return iFb;
    }
}

package ud;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class zn {

    public static class y {
        public boolean n3;
        public int y;
    }

    public static n3[] a(n3[] n3VarArr) {
        if (n3VarArr == null) {
            return null;
        }
        n3[] n3VarArr2 = new n3[n3VarArr.length];
        for (int i = 0; i < n3VarArr.length; i++) {
            n3VarArr2[i] = new n3(n3VarArr[i]);
        }
        return n3VarArr2;
    }

    public static int c5(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void fb(java.lang.String r8, int r9, ud.zn.y r10) {
        /*
            r0 = 0
            r10.n3 = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L36
        L27:
            r10.n3 = r7
        L29:
            r2 = 0
            r4 = 1
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.n3 = r7
            goto L29
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.zn.fb(java.lang.String, int, ud.zn$y):void");
    }

    public static n3[] gv(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i5 = 0;
        while (i < str.length()) {
            int iC5 = c5(str, i);
            String strTrim = str.substring(i5, iC5).trim();
            if (strTrim.length() > 0) {
                y(arrayList, strTrim.charAt(0), s(strTrim));
            }
            i5 = iC5;
            i = iC5 + 1;
        }
        if (i - i5 == 1 && i5 < str.length()) {
            y(arrayList, str.charAt(i5), new float[0]);
        }
        return (n3[]) arrayList.toArray(new n3[arrayList.size()]);
    }

    public static void i9(n3[] n3VarArr, n3[] n3VarArr2) {
        for (int i = 0; i < n3VarArr2.length; i++) {
            n3VarArr[i].y = n3VarArr2[i].y;
            int i5 = 0;
            while (true) {
                float[] fArr = n3VarArr2[i].n3;
                if (i5 < fArr.length) {
                    n3VarArr[i].n3[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public static boolean n3(@Nullable n3[] n3VarArr, @Nullable n3[] n3VarArr2) {
        if (n3VarArr == null || n3VarArr2 == null || n3VarArr.length != n3VarArr2.length) {
            return false;
        }
        for (int i = 0; i < n3VarArr.length; i++) {
            n3 n3Var = n3VarArr[i];
            char c = n3Var.y;
            n3 n3Var2 = n3VarArr2[i];
            if (c != n3Var2.y || n3Var.n3.length != n3Var2.n3.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] s(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            y yVar = new y();
            int length = str.length();
            int i = 1;
            int i5 = 0;
            while (i < length) {
                fb(str, i, yVar);
                int i8 = yVar.y;
                if (i < i8) {
                    fArr[i5] = Float.parseFloat(str.substring(i, i8));
                    i5++;
                }
                i = yVar.n3 ? i8 : i8 + 1;
            }
            return zn(fArr, 0, i5);
        } catch (NumberFormatException e4) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e4);
        }
    }

    public static Path v(String str) {
        Path path = new Path();
        n3[] n3VarArrGv = gv(str);
        if (n3VarArrGv == null) {
            return null;
        }
        try {
            n3.v(n3VarArrGv, path);
            return path;
        } catch (RuntimeException e4) {
            throw new RuntimeException("Error in parsing " + str, e4);
        }
    }

    public static void y(ArrayList<n3> arrayList, char c, float[] fArr) {
        arrayList.add(new n3(c, fArr));
    }

    public static float[] zn(float[] fArr, int i, int i5) {
        if (i > i5) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i8 = i5 - i;
        int iMin = Math.min(i8, length - i);
        float[] fArr2 = new float[i8];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static class n3 {
        public float[] n3;
        public char y;

        public n3(char c, float[] fArr) {
            this.y = c;
            this.n3 = fArr;
        }

        public static void n3(Path path, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
            double d13 = d6;
            int iCeil = (int) Math.ceil(Math.abs((d12 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d10);
            double dSin = Math.sin(d10);
            double dCos2 = Math.cos(d11);
            double dSin2 = Math.sin(d11);
            double d14 = -d13;
            double d15 = d14 * dCos;
            double d16 = d7 * dSin;
            double d17 = (d15 * dSin2) - (d16 * dCos2);
            double d18 = d14 * dSin;
            double d19 = d7 * dCos;
            double d20 = (dSin2 * d18) + (dCos2 * d19);
            double d21 = d12 / ((double) iCeil);
            double d22 = d11;
            double d23 = d20;
            double d24 = d17;
            int i = 0;
            double d25 = d8;
            double d26 = d9;
            while (i < iCeil) {
                double d27 = d22 + d21;
                double dSin3 = Math.sin(d27);
                double dCos3 = Math.cos(d27);
                double d28 = (d4 + ((d13 * dCos) * dCos3)) - (d16 * dSin3);
                double d29 = d5 + (d13 * dSin * dCos3) + (d19 * dSin3);
                double d30 = (d15 * dSin3) - (d16 * dCos3);
                double d31 = (dSin3 * d18) + (dCos3 * d19);
                double d32 = d27 - d22;
                double dTan = Math.tan(d32 / 2.0d);
                double dSin4 = (Math.sin(d32) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d33 = d25 + (d24 * dSin4);
                double d34 = dCos;
                double d35 = dSin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d33, (float) (d26 + (d23 * dSin4)), (float) (d28 - (dSin4 * d30)), (float) (d29 - (dSin4 * d31)), (float) d28, (float) d29);
                i++;
                d21 = d21;
                dSin = d35;
                d25 = d28;
                d18 = d18;
                dCos = d34;
                d22 = d27;
                d23 = d31;
                d24 = d30;
                iCeil = iCeil;
                d26 = d29;
                d13 = d6;
            }
        }

        public static void v(n3[] n3VarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < n3VarArr.length; i++) {
                n3 n3Var = n3VarArr[i];
                y(path, fArr, c, n3Var.y, n3Var.n3);
                c = n3VarArr[i].y;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void y(Path path, float[] fArr, char c, char c3, float[] fArr2) {
            int i;
            int i5;
            float f3;
            float f4;
            float f5;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            char c4 = c3;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[2];
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                    i = 2;
                    break;
            }
            float f18 = f12;
            float f19 = f13;
            float f20 = f16;
            float f21 = f17;
            int i8 = 0;
            char c7 = c;
            while (i8 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i5 = i8;
                        int i10 = i5 + 2;
                        int i11 = i5 + 3;
                        int i12 = i5 + 4;
                        int i13 = i5 + 5;
                        path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                        f18 = fArr2[i12];
                        float f22 = fArr2[i13];
                        float f23 = fArr2[i10];
                        float f24 = fArr2[i11];
                        f19 = f22;
                        f15 = f24;
                        f14 = f23;
                    } else if (c4 == 'H') {
                        i5 = i8;
                        path.lineTo(fArr2[i5], f19);
                        f18 = fArr2[i5];
                    } else if (c4 == 'Q') {
                        i5 = i8;
                        int i14 = i5 + 1;
                        int i15 = i5 + 2;
                        int i16 = i5 + 3;
                        path.quadTo(fArr2[i5], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f25 = fArr2[i5];
                        float f26 = fArr2[i14];
                        f18 = fArr2[i15];
                        f19 = fArr2[i16];
                        f14 = f25;
                        f15 = f26;
                    } else if (c4 == 'V') {
                        i5 = i8;
                        path.lineTo(f18, fArr2[i5]);
                        f19 = fArr2[i5];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                path.rLineTo(fArr2[i8], 0.0f);
                                f18 += fArr2[i8];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i8]);
                                    f7 = fArr2[i8];
                                } else if (c4 == 'L') {
                                    int i17 = i8 + 1;
                                    path.lineTo(fArr2[i8], fArr2[i17]);
                                    f18 = fArr2[i8];
                                    f19 = fArr2[i17];
                                } else if (c4 == 'M') {
                                    f18 = fArr2[i8];
                                    f19 = fArr2[i8 + 1];
                                    if (i8 > 0) {
                                        path.lineTo(f18, f19);
                                    } else {
                                        path.moveTo(f18, f19);
                                        i5 = i8;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c4 == 'S') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    float f27 = f19;
                                    float f28 = f18;
                                    int i18 = i8 + 1;
                                    int i19 = i8 + 2;
                                    int i20 = i8 + 3;
                                    path.cubicTo(f28, f27, fArr2[i8], fArr2[i18], fArr2[i19], fArr2[i20]);
                                    f3 = fArr2[i8];
                                    f4 = fArr2[i18];
                                    f18 = fArr2[i19];
                                    f19 = fArr2[i20];
                                    f14 = f3;
                                    f15 = f4;
                                } else if (c4 == 'T') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f18 = (f18 * 2.0f) - f14;
                                        f19 = (f19 * 2.0f) - f15;
                                    }
                                    int i21 = i8 + 1;
                                    path.quadTo(f18, f19, fArr2[i8], fArr2[i21]);
                                    i5 = i8;
                                    f15 = f19;
                                    f14 = f18;
                                    f18 = fArr2[i8];
                                    f19 = fArr2[i21];
                                } else if (c4 == 'l') {
                                    int i22 = i8 + 1;
                                    path.rLineTo(fArr2[i8], fArr2[i22]);
                                    f18 += fArr2[i8];
                                    f7 = fArr2[i22];
                                } else if (c4 == 'm') {
                                    float f29 = fArr2[i8];
                                    f18 += f29;
                                    float f30 = fArr2[i8 + 1];
                                    f19 += f30;
                                    if (i8 > 0) {
                                        path.rLineTo(f29, f30);
                                    } else {
                                        path.rMoveTo(f29, f30);
                                        i5 = i8;
                                        f21 = f19;
                                        f20 = f18;
                                    }
                                } else if (c4 == 's') {
                                    if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                        float f31 = f18 - f14;
                                        f8 = f19 - f15;
                                        f9 = f31;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i23 = i8 + 1;
                                    int i24 = i8 + 2;
                                    int i25 = i8 + 3;
                                    path.rCubicTo(f9, f8, fArr2[i8], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f3 = fArr2[i8] + f18;
                                    f4 = fArr2[i23] + f19;
                                    f18 += fArr2[i24];
                                    f5 = fArr2[i25];
                                } else if (c4 == 't') {
                                    if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                        f10 = f18 - f14;
                                        f11 = f19 - f15;
                                    } else {
                                        f11 = 0.0f;
                                        f10 = 0.0f;
                                    }
                                    int i26 = i8 + 1;
                                    path.rQuadTo(f10, f11, fArr2[i8], fArr2[i26]);
                                    float f32 = f10 + f18;
                                    float f33 = f11 + f19;
                                    f18 += fArr2[i8];
                                    f19 += fArr2[i26];
                                    f15 = f33;
                                    f14 = f32;
                                }
                                f19 += f7;
                            } else {
                                int i27 = i8 + 1;
                                int i28 = i8 + 2;
                                int i29 = i8 + 3;
                                path.rQuadTo(fArr2[i8], fArr2[i27], fArr2[i28], fArr2[i29]);
                                f3 = fArr2[i8] + f18;
                                f4 = fArr2[i27] + f19;
                                f18 += fArr2[i28];
                                f5 = fArr2[i29];
                            }
                            i5 = i8;
                        } else {
                            int i30 = i8 + 2;
                            int i31 = i8 + 3;
                            int i32 = i8 + 4;
                            int i33 = i8 + 5;
                            path.rCubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                            f3 = fArr2[i30] + f18;
                            f4 = fArr2[i31] + f19;
                            f18 += fArr2[i32];
                            f5 = fArr2[i33];
                        }
                        f19 += f5;
                        f14 = f3;
                        f15 = f4;
                        i5 = i8;
                    } else {
                        int i34 = i8 + 5;
                        int i35 = i8 + 6;
                        i5 = i8;
                        zn(path, f18, f19, fArr2[i34] + f18, fArr2[i35] + f19, fArr2[i8], fArr2[i8 + 1], fArr2[i8 + 2], fArr2[i8 + 3] != 0.0f, fArr2[i8 + 4] != 0.0f);
                        f18 += fArr2[i34];
                        f19 += fArr2[i35];
                    }
                    i8 = i5 + i;
                    c7 = c3;
                    c4 = c7;
                } else {
                    i5 = i8;
                    int i36 = i5 + 5;
                    int i37 = i5 + 6;
                    zn(path, f18, f19, fArr2[i36], fArr2[i37], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                    f18 = fArr2[i36];
                    f19 = fArr2[i37];
                }
                f15 = f19;
                f14 = f18;
                i8 = i5 + i;
                c7 = c3;
                c4 = c7;
            }
            fArr[0] = f18;
            fArr[1] = f19;
            fArr[2] = f14;
            fArr[3] = f15;
            fArr[4] = f20;
            fArr[5] = f21;
        }

        public static void zn(Path path, float f3, float f4, float f5, float f7, float f8, float f9, float f10, boolean z, boolean z5) {
            double d4;
            double d5;
            double radians = Math.toRadians(f10);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d6 = f3;
            double d7 = d6 * dCos;
            double d8 = f4;
            double d9 = f8;
            double d10 = (d7 + (d8 * dSin)) / d9;
            double d11 = (((double) (-f3)) * dSin) + (d8 * dCos);
            double d12 = f9;
            double d13 = d11 / d12;
            double d14 = f7;
            double d15 = ((((double) f5) * dCos) + (d14 * dSin)) / d9;
            double d16 = ((((double) (-f5)) * dSin) + (d14 * dCos)) / d12;
            double d17 = d10 - d15;
            double d18 = d13 - d16;
            double d19 = (d10 + d15) / 2.0d;
            double d20 = (d13 + d16) / 2.0d;
            double d21 = (d17 * d17) + (d18 * d18);
            if (d21 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d22 = (1.0d / d21) - 0.25d;
            if (d22 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                Log.w("PathParser", "Points are too far apart " + d21);
                float fSqrt = (float) (Math.sqrt(d21) / 1.99999d);
                zn(path, f3, f4, f5, f7, f8 * fSqrt, f9 * fSqrt, f10, z, z5);
                return;
            }
            double dSqrt = Math.sqrt(d22);
            double d23 = d17 * dSqrt;
            double d24 = dSqrt * d18;
            if (z == z5) {
                d4 = d19 - d24;
                d5 = d20 + d23;
            } else {
                d4 = d19 + d24;
                d5 = d20 - d23;
            }
            double dAtan2 = Math.atan2(d13 - d5, d10 - d4);
            double dAtan22 = Math.atan2(d16 - d5, d15 - d4) - dAtan2;
            if (z5 != (dAtan22 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) {
                dAtan22 = dAtan22 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d25 = d4 * d9;
            double d26 = d5 * d12;
            n3(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d9, d12, d6, d8, radians, dAtan2, dAtan22);
        }

        public void gv(n3 n3Var, n3 n3Var2, float f3) {
            this.y = n3Var.y;
            int i = 0;
            while (true) {
                float[] fArr = n3Var.n3;
                if (i >= fArr.length) {
                    return;
                }
                this.n3[i] = (fArr[i] * (1.0f - f3)) + (n3Var2.n3[i] * f3);
                i++;
            }
        }

        public n3(n3 n3Var) {
            this.y = n3Var.y;
            float[] fArr = n3Var.n3;
            this.n3 = zn.zn(fArr, 0, fArr.length);
        }
    }
}

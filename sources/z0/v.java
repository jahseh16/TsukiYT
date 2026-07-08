package z0;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final boolean f9417gv;
    public final y n3;
    public final y y;
    public final int zn;

    public static final class n3 {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final float[] f9418gv;
        public final int n3;
        public final int y;
        public final float[] zn;

        public n3(int i, float[] fArr, float[] fArr2, int i5) {
            this.y = i;
            v0.y.y(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.zn = fArr;
            this.f9418gv = fArr2;
            this.n3 = i5;
        }

        public int y() {
            return this.zn.length / 3;
        }
    }

    public static final class y {
        public final n3[] y;

        public y(n3... n3VarArr) {
            this.y = n3VarArr;
        }

        public int n3() {
            return this.y.length;
        }

        public n3 y(int i) {
            return this.y[i];
        }
    }

    public v(y yVar, int i) {
        this(yVar, yVar, i);
    }

    public static v n3(int i) {
        return y(50.0f, 36, 72, 180.0f, 360.0f, i);
    }

    public static v y(float f3, int i, int i5, float f4, float f5, int i8) {
        float f7;
        float f8;
        int i10;
        int i11;
        int i12 = i;
        v0.y.y(f3 > 0.0f);
        v0.y.y(i12 >= 1);
        v0.y.y(i5 >= 1);
        v0.y.y(f4 > 0.0f && f4 <= 180.0f);
        v0.y.y(f5 > 0.0f && f5 <= 360.0f);
        float radians = (float) Math.toRadians(f4);
        float radians2 = (float) Math.toRadians(f5);
        float f9 = radians / i12;
        float f10 = radians2 / i5;
        int i13 = i5 + 1;
        int i14 = ((i13 * 2) + 2) * i12;
        float[] fArr = new float[i14 * 3];
        float[] fArr2 = new float[i14 * 2];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i12) {
            float f11 = radians / 2.0f;
            float f12 = (i15 * f9) - f11;
            int i18 = i15 + 1;
            float f13 = (i18 * f9) - f11;
            int i19 = 0;
            while (i19 < i13) {
                int i20 = i18;
                float f14 = f12;
                int i21 = i17;
                int i22 = 0;
                while (i22 < 2) {
                    if (i22 == 0) {
                        f7 = f14;
                        f8 = f13;
                    } else {
                        f7 = f13;
                        f8 = f7;
                    }
                    float f15 = i19 * f10;
                    float f16 = f10;
                    float f17 = radians;
                    double d4 = f3;
                    int i23 = i13;
                    double d5 = (f15 + 3.1415927f) - (radians2 / 2.0f);
                    int i24 = i19;
                    double d6 = f7;
                    float f18 = radians2;
                    int i25 = i22;
                    fArr[i16] = -((float) (Math.sin(d5) * d4 * Math.cos(d6)));
                    float f19 = f9;
                    fArr[i16 + 1] = (float) (d4 * Math.sin(d6));
                    int i26 = i16 + 3;
                    fArr[i16 + 2] = (float) (d4 * Math.cos(d5) * Math.cos(d6));
                    fArr2[i21] = f15 / f18;
                    int i27 = i21 + 2;
                    fArr2[i21 + 1] = ((i15 + i25) * f19) / f17;
                    if (i24 == 0 && i25 == 0) {
                        i11 = i25;
                        i10 = i24;
                    } else {
                        i10 = i24;
                        i11 = i25;
                        if (i10 != i5 || i11 != 1) {
                            i21 = i27;
                            i16 = i26;
                        }
                        i19 = i10;
                        f9 = f19;
                        i22 = i11 + 1;
                        f13 = f8;
                        f10 = f16;
                        radians = f17;
                        i13 = i23;
                        radians2 = f18;
                    }
                    System.arraycopy(fArr, i16, fArr, i26, 3);
                    i16 += 6;
                    System.arraycopy(fArr2, i21, fArr2, i27, 2);
                    i21 += 4;
                    i19 = i10;
                    f9 = f19;
                    i22 = i11 + 1;
                    f13 = f8;
                    f10 = f16;
                    radians = f17;
                    i13 = i23;
                    radians2 = f18;
                }
                i18 = i20;
                f12 = f14;
                i17 = i21;
                i19++;
                f13 = f13;
                radians = radians;
                radians2 = radians2;
            }
            i12 = i;
            i15 = i18;
        }
        return new v(new y(new n3(0, fArr, fArr2, 1)), i8);
    }

    public v(y yVar, y yVar2, int i) {
        this.y = yVar;
        this.n3 = yVar2;
        this.zn = i;
        this.f9417gv = yVar == yVar2;
    }
}

package oj1;

import java.util.Arrays;
import kj1.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public int[] n3;
    public Object[] y = new Object[8];
    public int zn;

    public static final class y {
        public static final y y = new y();
    }

    public mg() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.n3 = iArr;
        this.zn = -1;
    }

    public final void a(Object obj) {
        int[] iArr = this.n3;
        int i = this.zn;
        if (iArr[i] != -2) {
            int i5 = i + 1;
            this.zn = i5;
            if (i5 == this.y.length) {
                v();
            }
        }
        Object[] objArr = this.y;
        int i8 = this.zn;
        objArr[i8] = obj;
        this.n3[i8] = -2;
    }

    public final void fb(int i) {
        this.n3[this.zn] = i;
    }

    public final void gv() {
        int[] iArr = this.n3;
        int i = this.zn;
        if (iArr[i] == -2) {
            this.y[i] = y.y;
        }
    }

    public final void n3() {
        int i = this.zn;
        int[] iArr = this.n3;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.zn = i - 1;
        }
        int i5 = this.zn;
        if (i5 != -1) {
            this.zn = i5 - 1;
        }
    }

    public String toString() {
        return y();
    }

    public final void v() {
        int i = this.zn * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.y, i);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        this.y = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.n3, i);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
        this.n3 = iArrCopyOf;
    }

    public final String y() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.zn + 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = this.y[i5];
            if (obj instanceof kj1.a) {
                kj1.a aVar = (kj1.a) obj;
                if (!Intrinsics.areEqual(aVar.getKind(), f.n3.y)) {
                    int i8 = this.n3[i5];
                    if (i8 >= 0) {
                        sb.append(".");
                        sb.append(aVar.v(i8));
                    }
                } else if (this.n3[i5] != -1) {
                    sb.append("[");
                    sb.append(this.n3[i5]);
                    sb.append("]");
                }
            } else if (obj != y.y) {
                sb.append("[");
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append("]");
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void zn(kj1.a sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i = this.zn + 1;
        this.zn = i;
        if (i == this.y.length) {
            v();
        }
        this.y[i] = sd2;
    }
}

package ic;

import android.graphics.Path;
import android.graphics.PointF;
import h.v;
import java.util.List;
import mh.f;
import r6.wz;

/* JADX INFO: loaded from: classes.dex */
public class c5 {
    public static final PointF y = new PointF();

    public static int a(float f3, float f4) {
        return fb((int) f3, (int) f4);
    }

    public static float c5(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    public static void f(v vVar, int i, List<v> list, v vVar2, f fVar) {
        if (vVar.zn(fVar.getName(), i)) {
            list.add(vVar2.y(fVar.getName()).c5(fVar));
        }
    }

    public static int fb(int i, int i5) {
        return i - (i5 * v(i, i5));
    }

    public static boolean gv(float f3, float f4, float f5) {
        return f3 >= f4 && f3 <= f5;
    }

    public static int i9(int i, int i5, float f3) {
        return (int) (i + (f3 * (i5 - i)));
    }

    public static float n3(float f3, float f4, float f5) {
        return Math.max(f4, Math.min(f5, f3));
    }

    public static void s(wz wzVar, Path path) {
        path.reset();
        PointF pointFN3 = wzVar.n3();
        path.moveTo(pointFN3.x, pointFN3.y);
        y.set(pointFN3.x, pointFN3.y);
        for (int i = 0; i < wzVar.y().size(); i++) {
            h.y yVar = wzVar.y().get(i);
            PointF pointFY = yVar.y();
            PointF pointFN32 = yVar.n3();
            PointF pointFZn = yVar.zn();
            PointF pointF = y;
            if (pointFY.equals(pointF) && pointFN32.equals(pointFZn)) {
                path.lineTo(pointFZn.x, pointFZn.y);
            } else {
                path.cubicTo(pointFY.x, pointFY.y, pointFN32.x, pointFN32.y, pointFZn.x, pointFZn.y);
            }
            pointF.set(pointFZn.x, pointFZn.y);
        }
        if (wzVar.gv()) {
            path.close();
        }
    }

    public static int v(int i, int i5) {
        int i8 = i / i5;
        return (((i ^ i5) >= 0) || i % i5 == 0) ? i8 : i8 - 1;
    }

    public static PointF y(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int zn(int i, int i5, int i8) {
        return Math.max(i5, Math.min(i8, i));
    }
}

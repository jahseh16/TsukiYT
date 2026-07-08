package o2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n3 {
    public static final ThreadLocal<Matrix> y = new ThreadLocal<>();
    public static final ThreadLocal<RectF> n3 = new ThreadLocal<>();

    public static void n3(ViewParent viewParent, @NonNull View view, @NonNull Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            n3(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    public static void y(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        zn(viewGroup, view, rect);
    }

    public static void zn(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull Rect rect) {
        ThreadLocal<Matrix> threadLocal = y;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        n3(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = n3;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}

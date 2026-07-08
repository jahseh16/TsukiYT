package w2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import qn.ut;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final Property<View, Float> n3;
    public static final b y;
    public static final Property<View, Rect> zn;

    public class n3 extends Property<View, Rect> {
        public n3(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            ut.tg(view, rect);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return ut.i4(view);
        }
    }

    public class y extends Property<View, Float> {
        public y(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            c.fb(view, f3.floatValue());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c.zn(view));
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            y = new x();
        } else if (i >= 23) {
            y = new a8();
        } else if (i >= 22) {
            y = new ej();
        } else {
            y = new d();
        }
        n3 = new y(Float.class, "translationAlpha");
        zn = new n3(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view, int i, int i5, int i8, int i10) {
        y.v(view, i, i5, i8, i10);
    }

    public static void c5(@NonNull View view, @NonNull Matrix matrix) {
        y.s(view, matrix);
    }

    public static void fb(@NonNull View view, float f3) {
        y.a(view, f3);
    }

    public static vl gv(@NonNull View view) {
        return new yt(view);
    }

    public static void i9(@NonNull View view, @NonNull Matrix matrix) {
        y.c5(view, matrix);
    }

    public static n n3(@NonNull View view) {
        return new f3(view);
    }

    public static void s(@NonNull View view, int i) {
        y.fb(view, i);
    }

    public static void v(@NonNull View view) {
        y.gv(view);
    }

    public static void y(@NonNull View view) {
        y.y(view);
    }

    public static float zn(@NonNull View view) {
        return y.zn(view);
    }
}

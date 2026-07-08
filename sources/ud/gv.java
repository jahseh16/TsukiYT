package ud;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ej.s;
import ej.v;
import vl.fb;
import x4.a;

/* JADX INFO: loaded from: classes.dex */
public class gv {
    public static final a<String, Typeface> n3;
    public static final i9 y;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            y = new c5();
        } else if (i >= 28) {
            y = new s();
        } else if (i >= 26) {
            y = new fb();
        } else if (i < 24 || !a.i9()) {
            y = new v();
        } else {
            y = new a();
        }
        n3 = new a<>(16);
    }

    @Nullable
    public static Typeface a(@NonNull Resources resources, int i, @Nullable String str, int i5, int i8) {
        return n3.get(v(resources, i, str, i5, i8));
    }

    public static Typeface fb(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Nullable
    public static Typeface gv(@NonNull Context context, @NonNull Resources resources, int i, String str, int i5, int i8) {
        Typeface typefaceGv = y.gv(context, resources, i, str, i8);
        if (typefaceGv != null) {
            n3.put(v(resources, i, str, i5, i8), typefaceGv);
        }
        return typefaceGv;
    }

    @Nullable
    public static Typeface n3(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull fb.n3[] n3VarArr, int i) {
        return y.n3(context, cancellationSignal, n3VarArr, i);
    }

    public static String v(Resources resources, int i, String str, int i5, int i8) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i5 + '-' + i + '-' + i8;
    }

    @NonNull
    public static Typeface y(@NonNull Context context, @Nullable Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @Nullable
    public static Typeface zn(@NonNull Context context, @NonNull v.n3 n3Var, @NonNull Resources resources, int i, @Nullable String str, int i5, int i8, @Nullable s.v vVar, @Nullable Handler handler, boolean z) {
        Typeface typefaceY;
        if (n3Var instanceof v.v) {
            v.v vVar2 = (v.v) n3Var;
            Typeface typefaceFb = fb(vVar2.zn());
            if (typefaceFb != null) {
                if (vVar != null) {
                    vVar.gv(typefaceFb, handler);
                }
                return typefaceFb;
            }
            typefaceY = fb.y(context, vVar2.n3(), i8, !z ? vVar != null : vVar2.y() != 0, z ? vVar2.gv() : -1, s.v.v(handler), new y(vVar));
        } else {
            typefaceY = y.y(context, (v.zn) n3Var, resources, i8);
            if (vVar != null) {
                if (typefaceY != null) {
                    vVar.gv(typefaceY, handler);
                } else {
                    vVar.zn(-3, handler);
                }
            }
        }
        if (typefaceY != null) {
            n3.put(v(resources, i, str, i5, i8), typefaceY);
        }
        return typefaceY;
    }
}

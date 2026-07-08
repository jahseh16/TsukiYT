package g2;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import t2.n3;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static boolean a(int i) {
        return i != 0 && ud.y.zn(i) > 0.5d;
    }

    public static int c5(@NonNull View view, int i, int i5, float f3) {
        return s(gv(view, i), gv(view, i5), f3);
    }

    public static int fb(int i, int i5) {
        return ud.y.a(i5, i);
    }

    public static int gv(@NonNull View view, int i) {
        return n3.gv(view, i);
    }

    public static int n3(@NonNull Context context, int i, int i5) {
        TypedValue typedValueY = n3.y(context, i);
        return typedValueY != null ? typedValueY.data : i5;
    }

    public static int s(int i, int i5, float f3) {
        return fb(i, ud.y.i9(i5, Math.round(Color.alpha(i5) * f3)));
    }

    public static int v(@NonNull View view, int i, int i5) {
        return n3(view.getContext(), i, i5);
    }

    public static int y(int i, int i5) {
        return ud.y.i9(i, (Color.alpha(i) * i5) / 255);
    }

    public static int zn(Context context, int i, String str) {
        return n3.zn(context, i, str);
    }
}

package y2;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public static void a(@NonNull View view, @NonNull fb fbVar) {
        if (fbVar.vl()) {
            fbVar.u(o2.t.zn(view));
        }
    }

    public static void gv(@NonNull View view, float f3) {
        Drawable background = view.getBackground();
        if (background instanceof fb) {
            ((fb) background).q9(f3);
        }
    }

    @NonNull
    public static gv n3() {
        return new i9();
    }

    public static void v(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof fb) {
            a(view, (fb) background);
        }
    }

    @NonNull
    public static gv y(int i) {
        return i != 0 ? i != 1 ? n3() : new v() : new i9();
    }

    @NonNull
    public static a zn() {
        return new a();
    }
}

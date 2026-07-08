package w2;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class rz extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f8992v = true;

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public void a(@NonNull View view, float f3) {
        if (f8992v) {
            try {
                view.setTransitionAlpha(f3);
                return;
            } catch (NoSuchMethodError unused) {
                f8992v = false;
            }
        }
        view.setAlpha(f3);
    }

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public float zn(@NonNull View view) {
        if (f8992v) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f8992v = false;
            }
        }
        return view.getAlpha();
    }

    @Override // w2.b
    public void gv(@NonNull View view) {
    }

    @Override // w2.b
    public void y(@NonNull View view) {
    }
}

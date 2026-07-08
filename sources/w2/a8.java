package w2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class a8 extends ej {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static boolean f8961c5 = true;

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public void fb(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.fb(view, i);
        } else if (f8961c5) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f8961c5 = false;
            }
        }
    }
}

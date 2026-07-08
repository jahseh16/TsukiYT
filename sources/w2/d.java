package w2;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class d extends rz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f8964a = true;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static boolean f8965fb = true;

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public void c5(@NonNull View view, @NonNull Matrix matrix) {
        if (f8965fb) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f8965fb = false;
            }
        }
    }

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public void s(@NonNull View view, @NonNull Matrix matrix) {
        if (f8964a) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f8964a = false;
            }
        }
    }
}

package w2;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ej extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f8966s = true;

    @Override // w2.b
    @SuppressLint({"NewApi"})
    public void v(@NonNull View view, int i, int i5, int i8, int i10) {
        if (f8966s) {
            try {
                view.setLeftTopRightBottom(i, i5, i8, i10);
            } catch (NoSuchMethodError unused) {
                f8966s = false;
            }
        }
    }
}

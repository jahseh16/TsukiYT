package w2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i4 {
    public static boolean y = true;

    @SuppressLint({"NewApi"})
    public static void n3(@NonNull ViewGroup viewGroup, boolean z) {
        if (y) {
            try {
                x4.y(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                y = false;
            }
        }
    }

    public static r y(@NonNull ViewGroup viewGroup) {
        return new z(viewGroup);
    }

    public static void zn(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            x4.y(viewGroup, z);
        } else {
            n3(viewGroup, z);
        }
    }
}

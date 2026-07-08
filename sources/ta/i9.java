package ta;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {
    public static Object n3(Context context) {
        return context.getSystemService("locale");
    }

    @NonNull
    public static yt.f y(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return yt.f.zn(a.y(context));
        }
        Object objN3 = n3(context);
        return objN3 != null ? yt.f.c5(y.y(objN3)) : yt.f.a();
    }
}

package ta;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class mt {
    @Nullable
    public static PendingIntent n3(@NonNull Context context, int i, @NonNull Intent intent, int i5, boolean z) {
        return PendingIntent.getActivity(context, i, intent, y(z, i5));
    }

    public static int y(boolean z, int i) {
        int i5;
        if (z) {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i5 = 33554432;
        } else {
            if (Build.VERSION.SDK_INT < 23) {
                return i;
            }
            i5 = 67108864;
        }
        return i | i5;
    }
}

package w9;

import android.os.Trace;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static void n3() {
        Trace.endSection();
    }

    public static void y(@NonNull String str) {
        Trace.beginSection(str);
    }
}

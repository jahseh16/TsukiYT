package a4;

import androidx.annotation.Nullable;
import ap.w;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final AtomicReference y = new AtomicReference(null);

    public static void n3(o oVar) {
        w.y(y, null, oVar);
    }

    @Nullable
    public static o y() {
        return (o) y.get();
    }
}

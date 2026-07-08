package w2;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class yt implements vl {
    public final WindowId y;

    public yt(@NonNull View view) {
        this.y = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof yt) && ((yt) obj).y.equals(this.y);
    }

    public int hashCode() {
        return this.y.hashCode();
    }
}

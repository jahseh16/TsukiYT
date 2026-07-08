package ta;

import android.content.res.Configuration;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final Configuration n3;
    public final boolean y;

    public f(boolean z) {
        this.y = z;
        this.n3 = null;
    }

    public boolean y() {
        return this.y;
    }

    public f(boolean z, @NonNull Configuration configuration) {
        this.y = z;
        this.n3 = configuration;
    }
}

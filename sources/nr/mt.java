package nr;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class mt extends IOException {
    public mt(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}

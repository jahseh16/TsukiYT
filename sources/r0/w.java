package r0;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static void y(@Nullable tl tlVar) {
        if (tlVar != null) {
            try {
                tlVar.close();
            } catch (IOException unused) {
            }
        }
    }
}

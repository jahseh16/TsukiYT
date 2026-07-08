package androidx.room.migration;

import androidx.annotation.NonNull;
import qj.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i, int i5) {
        this.startVersion = i;
        this.endVersion = i5;
    }

    public abstract void migrate(@NonNull s sVar);
}

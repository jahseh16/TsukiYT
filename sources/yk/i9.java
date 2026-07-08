package yk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i9 {
    @NonNull
    public static i9 zn() {
        return new y();
    }

    @Nullable
    public final c5 n3(@NonNull String str) {
        c5 c5VarY = y(str);
        return c5VarY == null ? c5.y(str) : c5VarY;
    }

    @Nullable
    public abstract c5 y(@NonNull String str);
}

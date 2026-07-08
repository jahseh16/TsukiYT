package di;

import androidx.annotation.Nullable;
import di.a;

/* JADX INFO: loaded from: classes.dex */
public interface gv<I, O, E extends a> {
    void flush();

    @Nullable
    I gv() throws a;

    @Nullable
    O n3() throws a;

    void release();

    void zn(I i) throws a;
}

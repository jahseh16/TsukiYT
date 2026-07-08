package h6;

import androidx.annotation.Nullable;
import b1.ta;
import ft.g;
import java.io.IOException;
import java.util.List;
import zo.gn;

/* JADX INFO: loaded from: classes.dex */
public interface fb {

    public interface n3 {
        ta a(int i, int i5);
    }

    public interface y {
        @Nullable
        fb y(int i, g gVar, boolean z, List<g> list, @Nullable ta taVar, gn gnVar);
    }

    void gv(@Nullable n3 n3Var, long j, long j4);

    boolean n3(b1.tl tlVar) throws IOException;

    void release();

    @Nullable
    g[] v();

    @Nullable
    b1.gv zn();
}

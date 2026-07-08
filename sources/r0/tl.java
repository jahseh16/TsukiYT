package r0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface tl extends c5 {

    public interface y {
        tl y();
    }

    void close() throws IOException;

    void co(o oVar);

    Map<String, List<String>> fb();

    @Nullable
    Uri n3();

    long y(p pVar) throws IOException;
}

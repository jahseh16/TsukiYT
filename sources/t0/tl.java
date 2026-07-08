package t0;

import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl {
    @Nullable
    public static Uri n3(wz wzVar) {
        String strN3 = wzVar.n3("exo_redir", null);
        if (strN3 == null) {
            return null;
        }
        return Uri.parse(strN3);
    }

    public static long y(wz wzVar) {
        return wzVar.y("exo_len", -1L);
    }
}

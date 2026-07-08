package d;

import android.content.Context;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ta.fb;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int n3(@NonNull Context context, @NonNull String str) {
        return y(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int y(@NonNull Context context, @NonNull String str, int i, int i5, @Nullable String str2) {
        if (context.checkPermission(str, i, i5) == -1) {
            return -1;
        }
        String strZn = fb.zn(str);
        if (strZn == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i5 || !j5.zn.y(context.getPackageName(), str2)) ? fb.n3(context, strZn, str2) : fb.y(context, i5, strZn, str2)) == 0 ? 0 : -2;
    }
}

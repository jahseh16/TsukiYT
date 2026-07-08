package o2;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v {
    public static boolean y() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}

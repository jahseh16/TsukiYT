package g4;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class wz {
    public static final Logger y = Logger.getLogger(wz.class.getName());
    public static final tl n3 = n3();

    public static boolean gv(String str) {
        return str == null || str.isEmpty();
    }

    public static tl n3() {
        return new n3((y) null);
    }

    public static String y(String str) {
        if (gv(str)) {
            return null;
        }
        return str;
    }

    public static String zn(String str) {
        return str == null ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : str;
    }
}

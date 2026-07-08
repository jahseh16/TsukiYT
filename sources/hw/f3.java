package hw;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f3 {
    public static final Locale y = new Locale(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);

    public static class y {
        public static int y(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int y(@Nullable Locale locale) {
        return y.y(locale);
    }
}

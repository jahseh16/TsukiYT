package yt;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class fb {

    public static class n3 {
        public static void n3(@NonNull Configuration configuration, @NonNull f fVar) {
            configuration.setLocales((LocaleList) fVar.s());
        }

        public static LocaleList y(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static class y {
        public static void y(@NonNull Configuration configuration, @NonNull f fVar) {
            if (fVar.fb()) {
                return;
            }
            configuration.setLocale(fVar.gv(0));
        }
    }

    public static void n3(@NonNull Configuration configuration, @NonNull f fVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            n3.n3(configuration, fVar);
        } else {
            y.y(configuration, fVar);
        }
    }

    @NonNull
    public static f y(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? f.c5(n3.y(configuration)) : f.y(configuration.locale);
    }
}

package yt;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f n3 = y(new Locale[0]);
    public final tl y;

    public static class n3 {
        public static LocaleList n3() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList y(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList zn() {
            return LocaleList.getDefault();
        }
    }

    public static class y {
        public static final Locale[] y = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static boolean n3(Locale locale) {
            for (Locale locale2 : y) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        public static Locale y(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean zn(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || n3(locale) || n3(locale2)) {
                return false;
            }
            String strY = hw.zn.y(locale);
            if (!strY.isEmpty()) {
                return strY.equals(hw.zn.y(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    public f(tl tlVar) {
        this.y = tlVar;
    }

    @NonNull
    public static f a() {
        return n3;
    }

    @NonNull
    public static f c5(@NonNull LocaleList localeList) {
        return new f(new co(localeList));
    }

    public static Locale n3(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static f v() {
        return Build.VERSION.SDK_INT >= 24 ? c5(n3.zn()) : y(Locale.getDefault());
    }

    @NonNull
    public static f y(@NonNull Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? c5(n3.y(localeArr)) : new f(new t(localeArr));
    }

    @NonNull
    public static f zn(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return a();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = y.y(strArrSplit[i]);
        }
        return y(localeArr);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.y.equals(((f) obj).y);
    }

    public boolean fb() {
        return this.y.isEmpty();
    }

    @Nullable
    public Locale gv(int i) {
        return this.y.get(i);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    @Nullable
    public Object s() {
        return this.y.y();
    }

    @NonNull
    public String toString() {
        return this.y.toString();
    }
}

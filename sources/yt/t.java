package yt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class t implements tl {

    @NonNull
    public final String n3;
    public final Locale[] y;
    public static final Locale[] zn = new Locale[0];

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Locale f9362gv = new Locale("en", "XA");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Locale f9363v = new Locale("ar", "XB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Locale f9361a = f.n3("en-Latn");

    public t(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.y = zn;
            this.n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                n3(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.y = (Locale[]) arrayList.toArray(new Locale[0]);
        this.n3 = sb.toString();
    }

    public static void n3(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        Locale[] localeArr = ((t) obj).y;
        if (this.y.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.y;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // yt.tl
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.y;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.y) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // yt.tl
    public boolean isEmpty() {
        return this.y.length == 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.y;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < this.y.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }

    @Override // yt.tl
    @Nullable
    public Object y() {
        return null;
    }
}

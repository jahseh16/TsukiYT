package q0;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.ui.R$string;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import java.util.Locale;
import v0.n;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class a implements w {
    public final Resources y;

    public a(Resources resources) {
        this.y = (Resources) v0.y.v(resources);
    }

    public static int c5(g gVar) {
        int iF = n.f(gVar.f3);
        if (iF != -1) {
            return iF;
        }
        if (n.wz(gVar.f4778co) != null) {
            return 2;
        }
        if (n.zn(gVar.f4778co) != null) {
            return 1;
        }
        if (gVar.f4779d == -1 && gVar.f4780ej == -1) {
            return (gVar.j == -1 && gVar.oz == -1) ? -1 : 1;
        }
        return 2;
    }

    public final String a(g gVar) {
        String str = gVar.f4782fb;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        Locale localeForLanguageTag = ut.y >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale localeQn = ut.qn();
        String displayName = localeForLanguageTag.getDisplayName(localeQn);
        if (TextUtils.isEmpty(displayName)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeQn) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    public final String fb(g gVar) {
        int i = gVar.f4779d;
        int i5 = gVar.f4780ej;
        return (i == -1 || i5 == -1) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : this.y.getString(R$string.f1950p, Integer.valueOf(i), Integer.valueOf(i5));
    }

    public final String gv(g gVar) {
        return TextUtils.isEmpty(gVar.f4791v) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : gVar.f4791v;
    }

    public final String i9(String... strArr) {
        String string = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.y.getString(R$string.f1956wz, string, str);
            }
        }
        return string;
    }

    public final String n3(g gVar) {
        int i = gVar.j;
        return (i == -1 || i < 1) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : i != 1 ? i != 2 ? (i == 6 || i == 7) ? this.y.getString(R$string.c) : i != 8 ? this.y.getString(R$string.n) : this.y.getString(R$string.d0) : this.y.getString(R$string.f3) : this.y.getString(R$string.w);
    }

    public final String s(g gVar) {
        String string = (gVar.f4781f & 2) != 0 ? this.y.getString(R$string.f1949mt) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        if ((gVar.f4781f & 4) != 0) {
            string = i9(string, this.y.getString(R$string.f1951r));
        }
        if ((gVar.f4781f & 8) != 0) {
            string = i9(string, this.y.getString(R$string.z));
        }
        return (gVar.f4781f & 1088) != 0 ? i9(string, this.y.getString(R$string.f1943co)) : string;
    }

    public final String v(g gVar) {
        String strI9 = i9(a(gVar), s(gVar));
        return TextUtils.isEmpty(strI9) ? gv(gVar) : strI9;
    }

    @Override // q0.w
    public String y(g gVar) {
        int iC5 = c5(gVar);
        String strI9 = iC5 == 2 ? i9(s(gVar), fb(gVar), zn(gVar)) : iC5 == 1 ? i9(v(gVar), n3(gVar), zn(gVar)) : v(gVar);
        return strI9.length() == 0 ? this.y.getString(R$string.fh) : strI9;
    }

    public final String zn(g gVar) {
        int i = gVar.f4786p;
        return i == -1 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : this.y.getString(R$string.f1958xc, Float.valueOf(i / 1000000.0f));
    }
}

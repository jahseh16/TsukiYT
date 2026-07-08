package m0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final Pattern zn = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Pattern f6489gv = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final d y = new d();
    public final StringBuilder n3 = new StringBuilder();

    public static String a(d dVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iA = dVar.a();
        int iFb = dVar.fb();
        while (iA < iFb && !z) {
            char c = (char) dVar.v()[iA];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iA++;
                sb.append(c);
            }
        }
        dVar.ut(iA - dVar.a());
        return sb.toString();
    }

    @Nullable
    public static String c5(d dVar, StringBuilder sb) {
        wz(dVar);
        if (dVar.y() < 5 || !"::cue".equals(dVar.ta(5))) {
            return null;
        }
        int iA = dVar.a();
        String strFb = fb(dVar, sb);
        if (strFb == null) {
            return null;
        }
        if ("{".equals(strFb)) {
            dVar.oz(iA);
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        String strT = "(".equals(strFb) ? t(dVar) : null;
        if (")".equals(fb(dVar, sb))) {
            return strT;
        }
        return null;
    }

    public static char f(d dVar, int i) {
        return (char) dVar.v()[i];
    }

    @Nullable
    public static String fb(d dVar, StringBuilder sb) {
        wz(dVar);
        if (dVar.y() == 0) {
            return null;
        }
        String strA = a(dVar, sb);
        if (!FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(strA)) {
            return strA;
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING + ((char) dVar.ej());
    }

    public static void i9(d dVar, gv gvVar, StringBuilder sb) {
        wz(dVar);
        String strA = a(dVar, sb);
        if (!FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(strA) && ":".equals(fb(dVar, sb))) {
            wz(dVar);
            String strS = s(dVar, sb);
            if (strS == null || FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(strS)) {
                return;
            }
            int iA = dVar.a();
            String strFb = fb(dVar, sb);
            if (!";".equals(strFb)) {
                if (!"}".equals(strFb)) {
                    return;
                } else {
                    dVar.oz(iA);
                }
            }
            if ("color".equals(strA)) {
                gvVar.p(v0.fb.n3(strS));
                return;
            }
            if ("background-color".equals(strA)) {
                gvVar.wz(v0.fb.n3(strS));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(strA)) {
                if ("over".equals(strS)) {
                    gvVar.x4(1);
                    return;
                } else {
                    if ("under".equals(strS)) {
                        gvVar.x4(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(strA)) {
                if (!"all".equals(strS) && !strS.startsWith("digits")) {
                    z = false;
                }
                gvVar.w(z);
                return;
            }
            if ("text-decoration".equals(strA)) {
                if ("underline".equals(strS)) {
                    gvVar.d0(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(strA)) {
                gvVar.mt(strS);
                return;
            }
            if ("font-weight".equals(strA)) {
                if ("bold".equals(strS)) {
                    gvVar.xc(true);
                }
            } else if ("font-style".equals(strA)) {
                if ("italic".equals(strS)) {
                    gvVar.r(true);
                }
            } else if ("font-size".equals(strA)) {
                v(strS, gvVar);
            }
        }
    }

    public static boolean n3(d dVar) {
        int iA = dVar.a();
        int iFb = dVar.fb();
        byte[] bArrV = dVar.v();
        if (iA + 2 > iFb) {
            return false;
        }
        int i = iA + 1;
        if (bArrV[iA] != 47) {
            return false;
        }
        int i5 = iA + 2;
        if (bArrV[i] != 42) {
            return false;
        }
        while (true) {
            int i8 = i5 + 1;
            if (i8 >= iFb) {
                dVar.ut(iFb - dVar.a());
                return true;
            }
            if (((char) bArrV[i5]) == '*' && ((char) bArrV[i8]) == '/') {
                i5 += 2;
                iFb = i5;
            } else {
                i5 = i8;
            }
        }
    }

    @Nullable
    public static String s(d dVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iA = dVar.a();
            String strFb = fb(dVar, sb);
            if (strFb == null) {
                return null;
            }
            if ("}".equals(strFb) || ";".equals(strFb)) {
                dVar.oz(iA);
                z = true;
            } else {
                sb2.append(strFb);
            }
        }
        return sb2.toString();
    }

    public static String t(d dVar) {
        int iA = dVar.a();
        int iFb = dVar.fb();
        boolean z = false;
        while (iA < iFb && !z) {
            int i = iA + 1;
            z = ((char) dVar.v()[iA]) == ')';
            iA = i;
        }
        return dVar.ta((iA - 1) - dVar.a()).trim();
    }

    public static void tl(d dVar) {
        while (!TextUtils.isEmpty(dVar.co())) {
        }
    }

    public static void v(String str, gv gvVar) {
        Matcher matcher = f6489gv.matcher(g4.zn.v(str));
        if (!matcher.matches()) {
            r.c5("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) v0.y.v(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                gvVar.z(3);
                break;
            case "em":
                gvVar.z(2);
                break;
            case "px":
                gvVar.z(1);
                break;
            default:
                throw new IllegalStateException();
        }
        gvVar.co(Float.parseFloat((String) v0.y.v(matcher.group(1))));
    }

    public static void wz(d dVar) {
        while (true) {
            for (boolean z = true; dVar.y() > 0 && z; z = false) {
                if (zn(dVar) || n3(dVar)) {
                    break;
                }
            }
            return;
        }
    }

    public static boolean zn(d dVar) {
        char cF = f(dVar, dVar.a());
        if (cF != '\t' && cF != '\n' && cF != '\f' && cF != '\r' && cF != ' ') {
            return false;
        }
        dVar.ut(1);
        return true;
    }

    public List<gv> gv(d dVar) {
        this.n3.setLength(0);
        int iA = dVar.a();
        tl(dVar);
        this.y.o(dVar.v(), dVar.a());
        this.y.oz(iA);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strC5 = c5(this.y, this.n3);
            if (strC5 == null) {
                return arrayList;
            }
            if (!"{".equals(fb(this.y, this.n3))) {
                return arrayList;
            }
            gv gvVar = new gv();
            y(gvVar, strC5);
            String str = null;
            boolean z = false;
            while (!z) {
                int iA2 = this.y.a();
                String strFb = fb(this.y, this.n3);
                boolean z5 = strFb == null || "}".equals(strFb);
                if (!z5) {
                    this.y.oz(iA2);
                    i9(this.y, gvVar, this.n3);
                }
                str = strFb;
                z = z5;
            }
            if ("}".equals(str)) {
                arrayList.add(gvVar);
            }
        }
    }

    public final void y(gv gvVar, String str) {
        if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = zn.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                gvVar.c((String) v0.y.v(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrRo = ut.ro(str, "\\.");
        String str2 = strArrRo[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            gvVar.n(str2.substring(0, iIndexOf2));
            gvVar.f3(str2.substring(iIndexOf2 + 1));
        } else {
            gvVar.n(str2);
        }
        if (strArrRo.length > 1) {
            gvVar.i4((String[]) ut.l(strArrRo, 1, strArrRo.length));
        }
    }
}

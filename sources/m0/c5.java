package m0;

import androidx.annotation.Nullable;
import ft.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v0.d;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class c5 {
    public static final Pattern y = Pattern.compile("^NOTE([ \t].*)?$");

    public static long gv(String str) throws NumberFormatException {
        String[] strArrIx = ut.ix(str, "\\.");
        long j = 0;
        for (String str2 : ut.ro(strArrIx[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j4 = j * 1000;
        if (strArrIx.length == 2) {
            j4 += Long.parseLong(strArrIx[1]);
        }
        return j4 * 1000;
    }

    public static boolean n3(d dVar) {
        String strCo = dVar.co();
        return strCo != null && strCo.startsWith("WEBVTT");
    }

    public static void v(d dVar) throws q {
        int iA = dVar.a();
        if (n3(dVar)) {
            return;
        }
        dVar.oz(iA);
        throw q.y("Expected WEBVTT. Got " + dVar.co(), null);
    }

    @Nullable
    public static Matcher y(d dVar) {
        String strCo;
        while (true) {
            String strCo2 = dVar.co();
            if (strCo2 == null) {
                return null;
            }
            if (y.matcher(strCo2).matches()) {
                do {
                    strCo = dVar.co();
                    if (strCo != null) {
                    }
                } while (!strCo.isEmpty());
            } else {
                Matcher matcher = a.y.matcher(strCo2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static float zn(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}

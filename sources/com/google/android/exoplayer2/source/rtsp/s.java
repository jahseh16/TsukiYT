package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.v;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import ft.q;
import g4.z;
import hx.r;
import hx.x4;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.k;
import k4.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final Pattern y = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");
    public static final Pattern n3 = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");
    public static final Pattern zn = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Pattern f1851gv = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f1853v = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f1849a = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final String f1850fb = new String(new byte[]{10});

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1852s = new String(new byte[]{13, 10});

    public static final class n3 {
        public final long n3;
        public final String y;

        public n3(String str, long j) {
            this.y = str;
            this.n3 = j;
        }
    }

    public static final class y {
        public final String n3;
        public final String y;

        public y(String str, String str2) {
            this.y = str;
            this.n3 = str2;
        }
    }

    public static boolean a(String str) {
        return y.matcher(str).matches() || n3.matcher(str).matches();
    }

    public static int c5(String str) {
        str.hashCode();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static String[] co(String str) {
        String str2 = f1852s;
        if (!str.contains(str2)) {
            str2 = f1850fb;
        }
        return ut.ro(str, str2);
    }

    public static r f(List<String> list) {
        Matcher matcher = y.matcher(list.get(0));
        v0.y.y(matcher.matches());
        int iC5 = c5((String) v0.y.v(matcher.group(1)));
        Uri uri = Uri.parse((String) v0.y.v(matcher.group(2)));
        int iIndexOf = list.indexOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        v0.y.y(iIndexOf > 0);
        return new r(uri, iC5, new v.n3().zn(list.subList(1, iIndexOf)).v(), g4.s.fb(f1852s).gv(list.subList(iIndexOf + 1, list.size())));
    }

    public static long fb(String str) throws q {
        try {
            Matcher matcher = zn.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) v0.y.v(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e4) {
            throw q.gv(str, e4);
        }
    }

    public static byte[] gv(String str) {
        return str.getBytes(fb.w);
    }

    public static k4.r<Integer> i9(@Nullable String str) {
        if (str == null) {
            return k4.r.yt();
        }
        r.y yVar = new r.y();
        for (String str2 : ut.ro(str, ",\\s?")) {
            yVar.y(Integer.valueOf(c5(str2)));
        }
        return yVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k4.r<String> mt(x4 x4Var) {
        v0.y.y(x4Var.n3.gv("CSeq") != null);
        r.y yVar = new r.y();
        yVar.y(ut.rz("%s %s %s", "RTSP/1.0", Integer.valueOf(x4Var.y), zn(x4Var.y)));
        k4.x4<String, String> x4VarN3 = x4Var.n3.n3();
        k it = x4VarN3.ej().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k4.r rVarK = x4VarN3.k(str);
            for (int i = 0; i < rVarK.size(); i++) {
                yVar.y(ut.rz("%s: %s", str, rVarK.get(i)));
            }
        }
        yVar.y(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        yVar.y(x4Var.zn);
        return yVar.f();
    }

    public static byte[] n3(List<String> list) {
        return g4.s.fb(f1852s).gv(list).getBytes(fb.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k4.r<String> p(hx.r rVar) {
        v0.y.y(rVar.zn.gv("CSeq") != null);
        r.y yVar = new r.y();
        yVar.y(ut.rz("%s %s %s", z(rVar.n3), rVar.y, "RTSP/1.0"));
        k4.x4<String, String> x4VarN3 = rVar.zn.n3();
        k it = x4VarN3.ej().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k4.r rVarK = x4VarN3.k(str);
            for (int i = 0; i < rVarK.size(); i++) {
                yVar.y(ut.rz("%s: %s", str, rVarK.get(i)));
            }
        }
        yVar.y(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        yVar.y(rVar.f5398gv);
        return yVar.f();
    }

    public static int s(String str) throws q {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            throw q.gv(str, e4);
        }
    }

    public static x4 t(List<String> list) {
        Matcher matcher = n3.matcher(list.get(0));
        v0.y.y(matcher.matches());
        int i = Integer.parseInt((String) v0.y.v(matcher.group(1)));
        int iIndexOf = list.indexOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        v0.y.y(iIndexOf > 0);
        return new x4(i, new v.n3().zn(list.subList(1, iIndexOf)).v(), g4.s.fb(f1852s).gv(list.subList(iIndexOf + 1, list.size())));
    }

    public static n3 tl(String str) throws q {
        long j;
        Matcher matcher = f1851gv.matcher(str);
        if (!matcher.matches()) {
            throw q.gv(str, null);
        }
        String str2 = (String) v0.y.v(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e4) {
                throw q.gv(str, e4);
            }
        } else {
            j = 60000;
        }
        return new n3(str2, j);
    }

    public static boolean v(List<String> list) {
        return n3.matcher(list.get(0)).matches();
    }

    public static Uri w(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) v0.y.v(uri.getAuthority());
        v0.y.y(str.contains("@"));
        return uri.buildUpon().encodedAuthority(ut.ro(str, "@")[1]).build();
    }

    @Nullable
    public static y wz(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrIx = ut.ix(userInfo, ":");
        return new y(strArrIx[0], strArrIx[1]);
    }

    public static zn xc(String str) throws q {
        Matcher matcher = f1853v.matcher(str);
        if (matcher.find()) {
            return new zn(2, (String) v0.y.v(matcher.group(1)), (String) v0.y.v(matcher.group(3)), z.gv(matcher.group(4)));
        }
        Matcher matcher2 = f1849a.matcher(str);
        if (matcher2.matches()) {
            return new zn(1, (String) v0.y.v(matcher2.group(1)), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }
        throw q.gv("Invalid WWW-Authenticate header " + str, null);
    }

    public static void y(boolean z, @Nullable String str) throws q {
        if (!z) {
            throw q.gv(str, null);
        }
    }

    public static String z(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case Code.UNIMPLEMENTED /* 12 */:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }

    public static String zn(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 301) {
            return "Move Permanently";
        }
        if (i == 302) {
            return "Move Temporarily";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                throw new IllegalArgumentException();
        }
    }
}

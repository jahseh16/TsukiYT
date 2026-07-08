package v0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final ArrayList<y> y = new ArrayList<>();
    public static final Pattern n3 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class n3 {
        public final int n3;
        public final int y;

        public n3(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }

        public int y() {
            int i = this.n3;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static final class y {
        public final String n3;
        public final String y;
        public final int zn;
    }

    public static int a(String str, @Nullable String str2) {
        n3 n3VarC5;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (n3VarC5 = c5(str2)) == null) {
                    return 0;
                }
                return n3VarC5.y();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    public static n3 c5(String str) {
        Matcher matcher = n3.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) v0.y.v(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new n3(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean co(@Nullable String str) {
        return "video".equals(i9(str));
    }

    public static int f(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (xc(str)) {
            return 1;
        }
        if (co(str)) {
            return 2;
        }
        if (mt(str)) {
            return 3;
        }
        if (w(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return t(str);
    }

    @Nullable
    public static String fb(@Nullable String str) {
        n3 n3VarC5;
        String strS = null;
        if (str == null) {
            return null;
        }
        String strV = g4.zn.v(str.trim());
        if (strV.startsWith("avc1") || strV.startsWith("avc3")) {
            return "video/avc";
        }
        if (strV.startsWith("hev1") || strV.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strV.startsWith("dvav") || strV.startsWith("dva1") || strV.startsWith("dvhe") || strV.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strV.startsWith("av01")) {
            return "video/av01";
        }
        if (strV.startsWith("vp9") || strV.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strV.startsWith("vp8") || strV.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strV.startsWith("mp4a")) {
            return strV.startsWith("mha1") ? "audio/mha1" : strV.startsWith("mhm1") ? "audio/mhm1" : (strV.startsWith("ac-3") || strV.startsWith("dac3")) ? "audio/ac3" : (strV.startsWith("ec-3") || strV.startsWith("dec3")) ? "audio/eac3" : strV.startsWith("ec+3") ? "audio/eac3-joc" : (strV.startsWith("ac-4") || strV.startsWith("dac4")) ? "audio/ac4" : strV.startsWith("dtsc") ? "audio/vnd.dts" : strV.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strV.startsWith("dtsh") || strV.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strV.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strV.startsWith("opus") ? "audio/opus" : strV.startsWith("vorbis") ? "audio/vorbis" : strV.startsWith("flac") ? "audio/flac" : strV.startsWith("stpp") ? "application/ttml+xml" : strV.startsWith("wvtt") ? "text/vtt" : strV.contains("cea708") ? "application/cea-708" : (strV.contains("eia608") || strV.contains("cea608")) ? "application/cea-608" : v(strV);
        }
        if (strV.startsWith("mp4a.") && (n3VarC5 = c5(strV)) != null) {
            strS = s(n3VarC5.y);
        }
        return strS == null ? "audio/mp4a-latm" : strS;
    }

    @Nullable
    public static String gv(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrYk = ut.yk(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrYk) {
            if (str2.equals(fb(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Nullable
    public static String i9(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static boolean mt(@Nullable String str) {
        return "text".equals(i9(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean n3(@Nullable String str, String str2) {
        return gv(str, str2) != null;
    }

    public static boolean p(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    @Nullable
    public static String s(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static int t(String str) {
        int size = y.size();
        for (int i = 0; i < size; i++) {
            y yVar = y.get(i);
            if (str.equals(yVar.y)) {
                return yVar.zn;
            }
        }
        return -1;
    }

    public static int tl(String str) {
        return f(fb(str));
    }

    @Nullable
    public static String v(String str) {
        int size = y.size();
        for (int i = 0; i < size; i++) {
            y yVar = y.get(i);
            if (str.startsWith(yVar.n3)) {
                return yVar.y;
            }
        }
        return null;
    }

    public static boolean w(@Nullable String str) {
        return "image".equals(i9(str));
    }

    @Nullable
    public static String wz(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : ut.yk(str)) {
            String strFb = fb(str2);
            if (strFb != null && co(strFb)) {
                return strFb;
            }
        }
        return null;
    }

    public static boolean xc(@Nullable String str) {
        return "audio".equals(i9(str));
    }

    public static boolean y(@Nullable String str, @Nullable String str2) {
        n3 n3VarC5;
        int iY;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (n3VarC5 = c5(str2)) != null && (iY = n3VarC5.y()) != 0 && iY != 16) {
                }
                break;
        }
        return false;
    }

    public static String z(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }

    @Nullable
    public static String zn(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : ut.yk(str)) {
            String strFb = fb(str2);
            if (strFb != null && xc(strFb)) {
                return strFb;
            }
        }
        return null;
    }
}

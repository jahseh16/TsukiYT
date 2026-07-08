package v0;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.im;
import ft.q;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8757a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final Pattern f8758c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public static HashMap<String, String> f8759f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Pattern f8760fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final String f8761gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final Pattern f8762i9;
    public static final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f8763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String[] f8764t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final String[] f8765tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f8766v;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final int[] f8767wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public static final int[] f8768xc;
    public static final int y;
    public static final String zn;

    public static final class y {
        public static Drawable y(Context context, Resources resources, int i) {
            return resources.getDrawable(i, context.getTheme());
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        y = i;
        String str = Build.DEVICE;
        n3 = str;
        String str2 = Build.MANUFACTURER;
        zn = str2;
        String str3 = Build.MODEL;
        f8761gv = str3;
        f8766v = str + ", " + str3 + ", " + str2 + ", " + i;
        f8757a = new byte[0];
        f8760fb = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f8763s = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f8758c5 = Pattern.compile("%([A-Fa-f0-9]{2})");
        f8762i9 = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f8764t = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f8765tl = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f8767wz = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f8768xc = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static <T extends Comparable<? super T>> int a(List<? extends Comparable<? super T>> list, T t3, boolean z, boolean z5) {
        int i;
        int i5;
        int iBinarySearch = Collections.binarySearch(list, t3);
        if (iBinarySearch < 0) {
            i5 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || list.get(i).compareTo(t3) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i5 = z ? iBinarySearch : i;
        }
        return z5 ? Math.max(0, i5) : i5;
    }

    public static byte[] a8(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i5 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i5), 16) << 4) + Character.digit(str.charAt(i5 + 1), 16));
        }
        return bArr;
    }

    public static String ad(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strV = g4.zn.v(str);
        String str2 = ix(strV, "-")[0];
        if (f8759f == null) {
            f8759f = d0();
        }
        String str3 = f8759f.get(str2);
        if (str3 != null) {
            strV = str3 + strV.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? cr(strV) : strV;
    }

    public static byte[] ap(String str) {
        return str.getBytes(g4.v.zn);
    }

    @Nullable
    public static String b(@Nullable String str, int i) {
        String[] strArrYk = yk(str);
        if (strArrYk.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrYk) {
            if (i == n.tl(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static boolean bk(int i) {
        return i == 10 || i == 13;
    }

    public static void bv(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static Handler c(@Nullable Handler.Callback callback) {
        return x4(j5(), callback);
    }

    public static int c5(long[] jArr, long j, boolean z, boolean z5) {
        int i;
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i5 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i5 = z ? iBinarySearch : i;
        }
        return z5 ? Math.max(0, i5) : i5;
    }

    public static boolean co(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (zn(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String cr(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f8765tl;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    public static int ct(int i, int i5) {
        if (i != 2) {
            if (i == 3) {
                return i5;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i5 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i5 * 4;
        }
        return i5 * 2;
    }

    public static <T> T[] cy(T[] tArr, T t3) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t3;
        return (T[]) f(objArrCopyOf);
    }

    public static int d(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static HashMap<String, String> d0() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + f8764t.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f8764t;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static g dm(int i, int i5, int i8) {
        return new g.n3().o4("audio/raw").a8(i5).rs(i8).jz(i).z6();
    }

    @Nullable
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            r.gv("Util", "Failed to read system property " + str, e4);
            return null;
        }
    }

    public static String eb(StringBuilder sb, Formatter formatter, long j) {
        long j4 = j == -9223372036854775807L ? 0L : j;
        String str = j4 < 0 ? "-" : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        long jAbs = (Math.abs(j4) + 500) / 1000;
        long j7 = jAbs % 60;
        long j8 = (jAbs / 60) % 60;
        long j9 = jAbs / 3600;
        sb.setLength(0);
        return j9 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j9), Long.valueOf(j8), Long.valueOf(j7)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j8), Long.valueOf(j7)).toString();
    }

    public static im.n3 ej(im imVar, im.n3 n3Var) {
        boolean zI9 = imVar.i9();
        boolean zYc = imVar.yc();
        boolean zO4 = imVar.o4();
        boolean zMg = imVar.mg();
        boolean zCr = imVar.cr();
        boolean zB = imVar.b();
        boolean zR = imVar.yt().r();
        boolean z = false;
        im.n3.y yVarGv = new im.n3.y().n3(n3Var).gv(4, !zI9).gv(5, zYc && !zI9).gv(6, zO4 && !zI9).gv(7, !zR && (zO4 || !zCr || zYc) && !zI9).gv(8, zMg && !zI9).gv(9, !zR && (zMg || (zCr && zB)) && !zI9).gv(10, !zI9).gv(11, zYc && !zI9);
        if (zYc && !zI9) {
            z = true;
        }
        return yVarGv.gv(12, z).v();
    }

    public static String en(Locale locale) {
        return y >= 21 ? jz(locale) : locale.toString();
    }

    public static Handler f3(@Nullable Handler.Callback callback) {
        return x4((Looper) v0.y.c5(Looper.myLooper()), callback);
    }

    public static String f7(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static int fb(x4 x4Var, long j, boolean z, boolean z5) {
        int i;
        int iZn = x4Var.zn() - 1;
        int i5 = 0;
        while (i5 <= iZn) {
            int i8 = (i5 + iZn) >>> 1;
            if (x4Var.n3(i8) < j) {
                i5 = i8 + 1;
            } else {
                iZn = i8 - 1;
            }
        }
        if (z && (i = iZn + 1) < x4Var.zn() && x4Var.n3(i) == j) {
            return i;
        }
        if (z5 && iZn == -1) {
            return 0;
        }
        return iZn;
    }

    public static Uri fh(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f8762i9.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static boolean g(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static String g3(int i) {
        return Integer.toString(i, 36);
    }

    public static long gf(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static long gq(String str) throws q {
        Matcher matcher = f8760fb.matcher(str);
        if (!matcher.matches()) {
            throw q.y("Invalid date/time format: " + str, null);
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
    }

    public static <T extends Comparable<? super T>> int gv(List<? extends Comparable<? super T>> list, T t3, boolean z, boolean z5) {
        int i;
        int i5;
        int iBinarySearch = Collections.binarySearch(list, t3);
        if (iBinarySearch < 0) {
            i5 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i = iBinarySearch + 1;
                if (i >= size || list.get(i).compareTo(t3) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i5 = z ? iBinarySearch : i;
        }
        return z5 ? Math.min(list.size() - 1, i5) : i5;
    }

    public static Point hw(Context context, Display display) {
        if (display.getDisplayId() == 0 && tg(context)) {
            String strE = y < 28 ? e("sys.display-size") : e("vendor.display-size");
            if (!TextUtils.isEmpty(strE)) {
                try {
                    String[] strArrRo = ro(strE.trim(), "x");
                    if (strArrRo.length == 2) {
                        int i = Integer.parseInt(strArrRo[0]);
                        int i5 = Integer.parseInt(strArrRo[1]);
                        if (i > 0 && i5 > 0) {
                            return new Point(i, i5);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                r.zn("Util", "Invalid display size: " + strE);
            }
            if ("Sony".equals(zn) && f8761gv.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i8 = y;
        if (i8 >= 23) {
            oz(display, point);
        } else if (i8 >= 17) {
            j(display, point);
        } else {
            o(display, point);
        }
        return point;
    }

    public static long i2(long j, long j4, long j7) {
        long j8 = j - j4;
        return ((j ^ j8) & (j4 ^ j)) < 0 ? j7 : j8;
    }

    public static boolean i3(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static Handler i4() {
        return f3(null);
    }

    public static String[] ix(String str, String str2) {
        return str.split(str2, 2);
    }

    public static void j(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String j3(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Character.forDigit((bArr[i] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i] & 15, 16));
        }
        return sb.toString();
    }

    public static Looper j5() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static String jz(Locale locale) {
        return locale.toLanguageTag();
    }

    public static int k(@Nullable String str) {
        String[] strArrRo;
        int length;
        if (str == null || (length = (strArrRo = ro(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrRo[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrRo[length - 2]);
        try {
            int i = Integer.parseInt((String) v0.y.v(str2));
            return z ? -i : i;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String k5(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static int kp(Uri uri, @Nullable String str) {
        if (str == null) {
            return yg(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static <T> T[] l(T[] tArr, int i, int i5) {
        v0.y.y(i >= 0);
        v0.y.y(i5 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i5);
    }

    public static String[] lc() {
        String[] strArrNf = nf();
        for (int i = 0; i < strArrNf.length; i++) {
            strArrNf[i] = ad(strArrNf[i]);
        }
        return strArrNf;
    }

    public static void le(Throwable th) throws Throwable {
        cs(th);
    }

    public static boolean m(Context context) {
        return y >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static String mg(byte[] bArr) {
        return new String(bArr, g4.v.zn);
    }

    public static void mp(long[] jArr, long j, long j4) {
        int i = 0;
        if (j4 >= j && j4 % j == 0) {
            long j7 = j4 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j7;
                i++;
            }
            return;
        }
        if (j4 >= j || j % j4 != 0) {
            double d4 = j / j4;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d4);
                i++;
            }
            return;
        }
        long j8 = j / j4;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j8;
            i++;
        }
    }

    public static long mt(long j, long j4, long j7) {
        return Math.max(j4, Math.min(j, j7));
    }

    public static Handler n() {
        return c(null);
    }

    public static long n3(long j, long j4, long j7) {
        long j8 = j + j4;
        return ((j ^ j8) & (j4 ^ j8)) < 0 ? j7 : j8;
    }

    @Nullable
    public static String nd(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.charAt(i5) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i8 = length - (i * 2);
        StringBuilder sb = new StringBuilder(i8);
        Matcher matcher = f8758c5.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt((String) v0.y.v(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i8) {
            return null;
        }
        return sb.toString();
    }

    public static long ne(int i, int i5) {
        return q(i5) | (q(i) << 32);
    }

    public static String[] nf() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return y >= 24 ? ra(configuration) : new String[]{en(configuration.locale)};
    }

    public static void o(Display display, Point point) {
        display.getSize(point);
    }

    public static <T> void o0(List<T> list, int i, int i5, int i8) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i10 = (i5 - i) - 1; i10 >= 0; i10--) {
            arrayDeque.addFirst(list.remove(i + i10));
        }
        list.addAll(Math.min(i8, list.size()), arrayDeque);
    }

    public static long o4(long j, float f3) {
        return f3 == 1.0f ? j : Math.round(j / ((double) f3));
    }

    public static boolean oa(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static void oz(Display display, Point point) {
        Display.Mode modeY = fp.y.y(display);
        point.x = fp.n3.y(modeY);
        point.y = fp.zn.y(modeY);
    }

    public static int p(int i, int i5, int i8) {
        return Math.max(i5, Math.min(i, i8));
    }

    public static int pq(int[] iArr, int i) {
        for (int i5 = 0; i5 < iArr.length; i5++) {
            if (iArr[i5] == i) {
                return i5;
            }
        }
        return -1;
    }

    public static /* synthetic */ Thread pz(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static long q(int i) {
        return ((long) i) & 4294967295L;
    }

    public static long[] q5(List<Long> list, long j, long j4) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (j4 >= j && j4 % j == 0) {
            long j7 = j4 / j;
            while (i < size) {
                jArr[i] = list.get(i).longValue() / j7;
                i++;
            }
        } else if (j4 >= j || j % j4 != 0) {
            double d4 = j / j4;
            while (i < size) {
                jArr[i] = (long) (list.get(i).longValue() * d4);
                i++;
            }
        } else {
            long j8 = j / j4;
            while (i < size) {
                jArr[i] = list.get(i).longValue() * j8;
                i++;
            }
        }
        return jArr;
    }

    public static int q9(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return 6005;
            case ConnectionResult.SIGN_IN_FAILED /* 17 */:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
            case 21:
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                return 6004;
            default:
                switch (i) {
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static <T> T[] qj(T[] tArr, int i) {
        v0.y.y(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] qk(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Locale qn() {
        return y >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static int r(byte[] bArr, int i, int i5, int i8) {
        while (i < i5) {
            i8 = f8768xc[i8 ^ (bArr[i] & 255)];
            i++;
        }
        return i8;
    }

    public static String[] ra(Configuration configuration) {
        return ro(fp.gv.y(configuration.getLocales()), ",");
    }

    public static boolean rb(d dVar, d dVar2, @Nullable Inflater inflater) {
        if (dVar.y() <= 0) {
            return false;
        }
        if (dVar2.n3() < dVar.y()) {
            dVar2.zn(dVar.y() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(dVar.v(), dVar.a(), dVar.y());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(dVar2.v(), iInflate, dVar2.n3() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == dVar2.n3()) {
                        dVar2.zn(dVar2.n3() * 2);
                    }
                } else {
                    dVar2.j(iInflate);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static String[] ro(String str, String str2) {
        return str.split(str2, -1);
    }

    public static int rs(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String rz(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int s(int[] iArr, int i, boolean z, boolean z5) {
        int i5;
        int i8;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i8 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i5 = iBinarySearch - 1;
                if (i5 < 0 || iArr[i5] != i) {
                    break;
                }
                iBinarySearch = i5;
            }
            i8 = z ? iBinarySearch : i5;
        }
        return z5 ? Math.max(0, i8) : i8;
    }

    public static String s8(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    public static int t(int i, int i5) {
        return ((i + i5) - 1) / i5;
    }

    public static String ta(byte[] bArr, int i, int i5) {
        return new String(bArr, i, i5, g4.v.zn);
    }

    public static boolean tg(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long tl(long j, long j4) {
        return ((j + j4) - 1) / j4;
    }

    public static long u(long j, float f3) {
        return f3 == 1.0f ? j : Math.round(j * ((double) f3));
    }

    public static boolean u0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    public static int ud(ByteBuffer byteBuffer, int i) {
        int i5 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i5 : Integer.reverseBytes(i5);
    }

    public static Drawable ut(Context context, Resources resources, int i) {
        return y >= 21 ? y.y(context, resources, i) : resources.getDrawable(i);
    }

    public static int v(long[] jArr, long j, boolean z, boolean z5) {
        int i;
        int i5;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i5 = ~iBinarySearch;
        } else {
            while (true) {
                i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i5 = z ? iBinarySearch : i;
        }
        return z5 ? Math.min(jArr.length - 1, i5) : i5;
    }

    public static Point vl(Context context) {
        DisplayManager displayManager;
        Display display = (y < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) v0.y.v((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return hw(context, display);
    }

    public static byte[] vn(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static long vp(String str) {
        Matcher matcher = f8763s.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double d5 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d6 = d5 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d7 = d6 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d8 = d7 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d9 = d8 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        if (strGroup6 != null) {
            d4 = Double.parseDouble(strGroup6);
        }
        long j = (long) ((d9 + d4) * 1000.0d);
        return !zIsEmpty ? -j : j;
    }

    public static float w(float f3, float f4, float f5) {
        return Math.max(f4, Math.min(f3, f5));
    }

    public static <T> void w2(List<T> list, int i, int i5) {
        if (i < 0 || i5 > list.size() || i > i5) {
            throw new IllegalArgumentException();
        }
        if (i != i5) {
            list.subList(i, i5).clear();
        }
    }

    public static boolean w9(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static ExecutorService wf(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: v0.oz
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ut.pz(str, runnable);
            }
        });
    }

    public static CharSequence wm(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    public static void wz(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int x(@Nullable String str, int i) {
        int i5 = 0;
        for (String str2 : yk(str)) {
            if (i == n.tl(str2)) {
                i5++;
            }
        }
        return i5;
    }

    public static Handler x4(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static long x5(long j, long j4, long j7) {
        if (j7 >= j4 && j7 % j4 == 0) {
            return j / (j7 / j4);
        }
        if (j7 < j4 && j4 % j7 == 0) {
            return j * (j4 / j7);
        }
        return (long) (j * (j4 / j7));
    }

    public static long xb(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static int xc(long j, long j4) {
        if (j < j4) {
            return -1;
        }
        return j == j4 ? 0 : 1;
    }

    public static int xg(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static boolean y4(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static long y5(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    public static int yc(String str) {
        String strV = g4.zn.v(str);
        strV.hashCode();
        switch (strV) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static int yg(Uri uri) {
        int iYc;
        String scheme = uri.getScheme();
        if (scheme != null && g4.zn.y("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0 && (iYc = yc(lastPathSegment.substring(iLastIndexOf + 1))) != 4) {
            return iYc;
        }
        Matcher matcher = f8762i9.matcher((CharSequence) v0.y.v(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static String[] yk(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : ro(str.trim(), "(\\s*,\\s*)");
    }

    public static String yt(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return g4.zn.a(networkCountryIso);
            }
        }
        return g4.zn.a(Locale.getDefault().getCountry());
    }

    public static int z(byte[] bArr, int i, int i5, int i8) {
        while (i < i5) {
            i8 = f8767wz[((i8 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i8 << 8);
            i++;
        }
        return i8;
    }

    @SuppressLint({"InlinedApi"})
    public static int z6(int i) {
        if (i == 12) {
            return 743676;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static boolean zn(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static <T extends Throwable> void cs(Throwable th) throws Throwable {
        throw th;
    }

    public static <T> T[] f(T[] tArr) {
        return tArr;
    }

    public static <T> T i9(@Nullable T t3) {
        return t3;
    }
}

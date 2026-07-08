package os;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.q;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.c;
import os.fb;
import os.s;
import r0.z6;
import v0.qn;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements z6.y<c5> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final fb f7250v;
    public final s y;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Pattern f7229fb = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f7243s = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f7228f = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f7244t = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern w = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f7239p = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final Pattern f7223co = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern z = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f7240r = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern f3 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern n = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern c = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern d0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern fh = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7224d = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: ej, reason: collision with root package name */
    public static final Pattern f7227ej = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f7247x = zn("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7222b = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    public static final Pattern f7232hw = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final Pattern f7233j5 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern qn = zn("CAN-BLOCK-RELOAD");
    public static final Pattern o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern j = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern oz = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: ut, reason: collision with root package name */
    public static final Pattern f7246ut = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern q9 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f7234k = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern f7 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern en = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern jz = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern y5 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern xg = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern dm = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern ct = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern o4 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern rs = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    public static final Pattern f7226eb = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: lc, reason: collision with root package name */
    public static final Pattern f7236lc = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: nf, reason: collision with root package name */
    public static final Pattern f7238nf = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final Pattern f7241ra = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f7225e = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern s8 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    public static final Pattern f7221ap = zn("AUTOSELECT");

    /* JADX INFO: renamed from: yg, reason: collision with root package name */
    public static final Pattern f7249yg = zn("DEFAULT");

    /* JADX INFO: renamed from: yc, reason: collision with root package name */
    public static final Pattern f7248yc = zn("FORCED");

    /* JADX INFO: renamed from: kp, reason: collision with root package name */
    public static final Pattern f7235kp = zn("INDEPENDENT");

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public static final Pattern f7242rb = zn("GAP");

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final Pattern f7231g3 = zn("PRECISE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f7237m = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f7230g = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f7245u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static class n3 {
        public final Queue<String> n3;
        public final BufferedReader y;

        @Nullable
        public String zn;

        public n3(Queue<String> queue, BufferedReader bufferedReader) {
            this.n3 = queue;
            this.y = bufferedReader;
        }

        public String n3() throws IOException {
            if (!y()) {
                throw new NoSuchElementException();
            }
            String str = this.zn;
            this.zn = null;
            return str;
        }

        public boolean y() throws IOException {
            String strTrim;
            if (this.zn != null) {
                return true;
            }
            if (!this.n3.isEmpty()) {
                this.zn = (String) v0.y.v(this.n3.poll());
                return true;
            }
            do {
                String line = this.y.readLine();
                this.zn = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.zn = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }
    }

    public static final class y extends IOException {
    }

    public i9() {
        this(s.f7251wz, null);
    }

    @Nullable
    public static s.n3 a(ArrayList<s.n3> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            s.n3 n3Var = arrayList.get(i);
            if (str.equals(n3Var.f7263gv)) {
                return n3Var;
            }
        }
        return null;
    }

    public static String c(String str, Pattern pattern, Map<String, String> map) throws q {
        String strX4 = x4(str, pattern, map);
        if (strX4 != null) {
            return strX4;
        }
        throw q.gv("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static int co(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) v0.y.v(matcher.group(1))) : i;
    }

    public static long d0(String str, Pattern pattern) throws q {
        return new BigDecimal(c(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    @Nullable
    public static DrmInitData.SchemeData f(String str, String str2, Map<String, String> map) throws q {
        String strR = r(str, dm, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strC = c(str, ct, map);
            return new DrmInitData.SchemeData(ft.c5.f4651gv, "video/mp4", Base64.decode(strC.substring(strC.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(ft.c5.f4651gv, "hls", ut.ap(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strR)) {
            return null;
        }
        String strC2 = c(str, ct, map);
        byte[] bArrDecode = Base64.decode(strC2.substring(strC2.indexOf(44)), 0);
        UUID uuid = ft.c5.f4652v;
        return new DrmInitData.SchemeData(uuid, "video/mp4", tn.t.y(uuid, bArrDecode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int f3(String str) {
        boolean zP = p(str, f7249yg, false);
        ?? r02 = zP;
        if (p(str, f7248yc, false)) {
            r02 = (zP ? 1 : 0) | 2;
        }
        return p(str, f7221ap, false) ? r02 | 4 : r02;
    }

    @Nullable
    public static s.n3 fb(ArrayList<s.n3> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            s.n3 n3Var = arrayList.get(i);
            if (str.equals(n3Var.f7264v)) {
                return n3Var;
            }
        }
        return null;
    }

    public static String fh(String str, Map<String, String> map) {
        Matcher matcher = f7245u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static DrmInitData gv(@Nullable String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].n3(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    public static int i4(String str, Map<String, String> map) {
        String strX4 = x4(str, f7225e, map);
        if (TextUtils.isEmpty(strX4)) {
            return 0;
        }
        String[] strArrRo = ut.ro(strX4, ",");
        int i = ut.co(strArrRo, "public.accessibility.describes-video") ? NotificationCompat.FLAG_GROUP_SUMMARY : 0;
        if (ut.co(strArrRo, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (ut.co(strArrRo, "public.accessibility.describes-music-and-sound")) {
            i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        return ut.co(strArrRo, "public.easy-to-read") ? i | 8192 : i;
    }

    public static double i9(String str, Pattern pattern) throws q {
        return Double.parseDouble(c(str, pattern, Collections.emptyMap()));
    }

    public static double mt(String str, Pattern pattern, double d4) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) v0.y.v(matcher.group(1))) : d4;
    }

    public static fb.a n(String str) {
        double dMt = mt(str, f7227ej, -9.223372036854776E18d);
        long j4 = dMt == -9.223372036854776E18d ? -9223372036854775807L : (long) (dMt * 1000000.0d);
        boolean zP = p(str, f7247x, false);
        double dMt2 = mt(str, f7232hw, -9.223372036854776E18d);
        long j7 = dMt2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dMt2 * 1000000.0d);
        double dMt3 = mt(str, f7233j5, -9.223372036854776E18d);
        return new fb.a(j4, zP, j7, dMt3 != -9.223372036854776E18d ? (long) (dMt3 * 1000000.0d) : -9223372036854775807L, p(str, qn, false));
    }

    public static boolean n3(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iRz = rz(bufferedReader, true, i);
        for (int i5 = 0; i5 < 7; i5++) {
            if (iRz != "#EXTM3U".charAt(i5)) {
                return false;
            }
            iRz = bufferedReader.read();
        }
        return ut.bk(rz(bufferedReader, false, iRz));
    }

    public static boolean p(String str, Pattern pattern, boolean z5) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z5;
    }

    public static String r(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) v0.y.v(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : fh(str2, map);
    }

    public static int rz(BufferedReader bufferedReader, boolean z5, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z5 || !ut.bk(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    @Nullable
    public static s.n3 s(ArrayList<s.n3> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            s.n3 n3Var = arrayList.get(i);
            if (str.equals(n3Var.zn)) {
                return n3Var;
            }
        }
        return null;
    }

    public static String t(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int tl(String str, Pattern pattern) throws q {
        return Integer.parseInt(c(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    public static String v(long j4, @Nullable String str, @Nullable String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:95:0x0342. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static os.s w(os.i9.n3 r37, java.lang.String r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: os.i9.w(os.i9$n3, java.lang.String):os.s");
    }

    public static long wz(String str, Pattern pattern) throws q {
        return Long.parseLong(c(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    public static String x4(String str, Pattern pattern, Map<String, String> map) {
        return r(str, pattern, null, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fb xc(s sVar, @Nullable fb fbVar, n3 n3Var, String str) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        long j4;
        int i;
        fb.n3 n3Var2;
        int i5;
        String strX4;
        long j7;
        long j8;
        Object drmInitData;
        long j9;
        long j10;
        s sVar2 = sVar;
        fb fbVar2 = fbVar;
        boolean z5 = sVar2.zn;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        fb.a aVar = new fb.a(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z7 = false;
        String str3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        boolean z8 = z5;
        fb.a aVarN = aVar;
        String strR = str3;
        int i8 = 0;
        String strC = null;
        long jI9 = -9223372036854775807L;
        boolean zP = false;
        long jXb = 0;
        boolean z9 = false;
        int i10 = 0;
        long j11 = 0;
        int iTl = 1;
        long jTl = -9223372036854775807L;
        long jI92 = -9223372036854775807L;
        boolean z10 = false;
        DrmInitData drmInitDataGv = null;
        long j12 = 0;
        Object obj = null;
        long j13 = 0;
        boolean z11 = false;
        long j14 = -1;
        String str4 = null;
        String strT = null;
        int i11 = 0;
        long j15 = 0;
        long jWz = 0;
        boolean z12 = false;
        fb.gv gvVar = null;
        long jD0 = 0;
        long j16 = 0;
        ArrayList arrayList7 = arrayList4;
        fb.n3 n3Var3 = null;
        while (n3Var.y()) {
            String strN3 = n3Var.n3();
            if (strN3.startsWith("#EXT")) {
                arrayList6.add(strN3);
            }
            if (strN3.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strC2 = c(strN3, f7224d, map);
                if ("VOD".equals(strC2)) {
                    i8 = 1;
                } else if ("EVENT".equals(strC2)) {
                    i8 = 2;
                }
            } else if (strN3.equals("#EXT-X-I-FRAMES-ONLY")) {
                z12 = true;
            } else if (strN3.startsWith("#EXT-X-START")) {
                jI9 = (long) (i9(strN3, f7234k) * 1000000.0d);
                zP = p(strN3, f7231g3, z7);
            } else if (strN3.startsWith("#EXT-X-SERVER-CONTROL")) {
                aVarN = n(strN3);
            } else if (strN3.startsWith("#EXT-X-PART-INF")) {
                jI92 = (long) (i9(strN3, d0) * 1000000.0d);
            } else if (strN3.startsWith("#EXT-X-MAP")) {
                String strC3 = c(strN3, ct, map);
                String strX42 = x4(strN3, en, map);
                if (strX42 != null) {
                    String[] strArrRo = ut.ro(strX42, "@");
                    j14 = Long.parseLong(strArrRo[z7 ? 1 : 0]);
                    if (strArrRo.length > 1) {
                        j12 = Long.parseLong(strArrRo[1]);
                    }
                }
                if (j14 == -1) {
                    j12 = 0;
                }
                String str5 = str4;
                if (strC != null && str5 == null) {
                    throw q.gv("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                gvVar = new fb.gv(strC3, j12, j14, strC, str5);
                if (j14 != -1) {
                    j12 += j14;
                }
                str4 = str5;
                j14 = -1;
            } else {
                String str6 = str4;
                if (strN3.startsWith("#EXT-X-TARGETDURATION")) {
                    jTl = 1000000 * ((long) tl(strN3, n));
                } else {
                    if (strN3.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        jWz = wz(strN3, o);
                        str4 = str6;
                        j11 = jWz;
                    } else if (strN3.startsWith("#EXT-X-VERSION")) {
                        iTl = tl(strN3, fh);
                    } else {
                        if (strN3.startsWith("#EXT-X-DEFINE")) {
                            String strX43 = x4(strN3, f7230g, map);
                            if (strX43 != null) {
                                String str7 = sVar2.f7259t.get(strX43);
                                if (str7 != null) {
                                    map.put(strX43, str7);
                                }
                            } else {
                                map.put(c(strN3, f7238nf, map), c(strN3, f7237m, map));
                            }
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            str2 = strT;
                            j4 = jWz;
                            i = i8;
                        } else if (strN3.startsWith("#EXTINF")) {
                            jD0 = d0(strN3, j);
                            strR = r(strN3, oz, str3, map);
                        } else {
                            String str8 = str3;
                            if (strN3.startsWith("#EXT-X-SKIP")) {
                                int iTl2 = tl(strN3, f7222b);
                                v0.y.fb(fbVar2 != null && arrayList3.isEmpty());
                                int i12 = (int) (j11 - ((fb) ut.i9(fbVar)).f7196f);
                                int i13 = iTl2 + i12;
                                if (i12 < 0 || i13 > fbVar2.f7200mt.size()) {
                                    throw new y();
                                }
                                str3 = str8;
                                String str9 = str6;
                                long j17 = j15;
                                while (i12 < i13) {
                                    fb.gv gvVarN3 = fbVar2.f7200mt.get(i12);
                                    ArrayList arrayList8 = arrayList7;
                                    ArrayList arrayList9 = arrayList6;
                                    if (j11 != fbVar2.f7196f) {
                                        gvVarN3 = gvVarN3.n3(j17, (fbVar2.f7199i9 - i10) + gvVarN3.f7217s);
                                    }
                                    arrayList3.add(gvVarN3);
                                    j17 += gvVarN3.f7214fb;
                                    long j18 = gvVarN3.z;
                                    if (j18 != -1) {
                                        i5 = i13;
                                        j12 = gvVarN3.f7212co + j18;
                                    } else {
                                        i5 = i13;
                                    }
                                    int i14 = gvVarN3.f7217s;
                                    fb.gv gvVar2 = gvVarN3.f7219v;
                                    DrmInitData drmInitData2 = gvVarN3.f7218t;
                                    String str10 = gvVarN3.w;
                                    String str11 = gvVarN3.f7215p;
                                    if (str11 == null || !str11.equals(Long.toHexString(jWz))) {
                                        str9 = gvVarN3.f7215p;
                                    }
                                    jWz++;
                                    i12++;
                                    fbVar2 = fbVar;
                                    obj = drmInitData2;
                                    strC = str10;
                                    j13 = j17;
                                    i13 = i5;
                                    i11 = i14;
                                    gvVar = gvVar2;
                                    arrayList7 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                sVar2 = sVar;
                                fbVar2 = fbVar;
                                j15 = j17;
                                str4 = str9;
                            } else {
                                ArrayList arrayList10 = arrayList7;
                                arrayList2 = arrayList6;
                                str3 = str8;
                                if (strN3.startsWith("#EXT-X-KEY")) {
                                    String strC4 = c(strN3, y5, map);
                                    String strR2 = r(strN3, xg, "identity", map);
                                    if ("NONE".equals(strC4)) {
                                        treeMap.clear();
                                        strX4 = null;
                                        strC = null;
                                    } else {
                                        strX4 = x4(strN3, o4, map);
                                        if ("identity".equals(strR2)) {
                                            if ("AES-128".equals(strC4)) {
                                                strC = c(strN3, ct, map);
                                            }
                                            sVar2 = sVar;
                                            fbVar2 = fbVar;
                                            str4 = strX4;
                                        } else {
                                            String str12 = strT;
                                            strT = str12 == null ? t(strC4) : str12;
                                            DrmInitData.SchemeData schemeDataF = f(strN3, strR2, map);
                                            if (schemeDataF != null) {
                                                treeMap.put(strR2, schemeDataF);
                                                strC = null;
                                            }
                                        }
                                        strC = null;
                                        sVar2 = sVar;
                                        fbVar2 = fbVar;
                                        str4 = strX4;
                                    }
                                    obj = strC;
                                    sVar2 = sVar;
                                    fbVar2 = fbVar;
                                    str4 = strX4;
                                } else {
                                    String str13 = strT;
                                    if (strN3.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] strArrRo2 = ut.ro(c(strN3, f7, map), "@");
                                        j14 = Long.parseLong(strArrRo2[0]);
                                        if (strArrRo2.length > 1) {
                                            j12 = Long.parseLong(strArrRo2[1]);
                                        }
                                    } else if (strN3.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i10 = Integer.parseInt(strN3.substring(strN3.indexOf(58) + 1));
                                        sVar2 = sVar;
                                        fbVar2 = fbVar;
                                        strT = str13;
                                        str4 = str6;
                                        arrayList7 = arrayList10;
                                        arrayList6 = arrayList2;
                                        z7 = false;
                                        z9 = true;
                                    } else if (strN3.equals("#EXT-X-DISCONTINUITY")) {
                                        i11++;
                                    } else {
                                        if (strN3.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (jXb == 0) {
                                                jXb = ut.xb(ut.gq(strN3.substring(strN3.indexOf(58) + 1))) - j15;
                                            } else {
                                                i = i8;
                                                str2 = str13;
                                            }
                                        } else if (strN3.equals("#EXT-X-GAP")) {
                                            sVar2 = sVar;
                                            fbVar2 = fbVar;
                                            strT = str13;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z7 = false;
                                            z11 = true;
                                        } else if (strN3.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            sVar2 = sVar;
                                            fbVar2 = fbVar;
                                            strT = str13;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z7 = false;
                                            z8 = true;
                                        } else if (strN3.equals("#EXT-X-ENDLIST")) {
                                            sVar2 = sVar;
                                            fbVar2 = fbVar;
                                            strT = str13;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z7 = false;
                                            z10 = true;
                                        } else if (strN3.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            i = i8;
                                            str2 = str13;
                                            arrayList5.add(new fb.zn(Uri.parse(qn.gv(str, c(strN3, ct, map))), z(strN3, f7246ut, -1L), co(strN3, q9, -1)));
                                        } else {
                                            i = i8;
                                            str2 = str13;
                                            if (!strN3.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j4 = jWz;
                                                if (strN3.startsWith("#EXT-X-PART")) {
                                                    String strV = v(j4, strC, str6);
                                                    String strC5 = c(strN3, ct, map);
                                                    long jI93 = (long) (i9(strN3, c) * 1000000.0d);
                                                    n3Var2 = n3Var3;
                                                    boolean zP2 = p(strN3, f7235kp, false) | (z8 && arrayList10.isEmpty());
                                                    boolean zP3 = p(strN3, f7242rb, false);
                                                    String strX44 = x4(strN3, en, map);
                                                    if (strX44 != null) {
                                                        String[] strArrRo3 = ut.ro(strX44, "@");
                                                        j10 = Long.parseLong(strArrRo3[0]);
                                                        if (strArrRo3.length > 1) {
                                                            j16 = Long.parseLong(strArrRo3[1]);
                                                        }
                                                        j9 = -1;
                                                    } else {
                                                        j9 = -1;
                                                        j10 = -1;
                                                    }
                                                    if (j10 == j9) {
                                                        j16 = 0;
                                                    }
                                                    if (obj == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData3 = new DrmInitData(str2, schemeDataArr);
                                                        if (drmInitDataGv == null) {
                                                            drmInitDataGv = gv(str2, schemeDataArr);
                                                        }
                                                        obj = drmInitData3;
                                                    }
                                                    arrayList = arrayList10;
                                                    arrayList.add(new fb.n3(strC5, gvVar, jI93, i11, j13, obj, strC, strV, j16, j10, zP3, zP2, false));
                                                    j13 += jI93;
                                                    if (j10 != j9) {
                                                        j16 += j10;
                                                    }
                                                } else {
                                                    n3Var2 = n3Var3;
                                                    arrayList = arrayList10;
                                                    if (!strN3.startsWith("#")) {
                                                        String strV2 = v(j4, strC, str6);
                                                        long j19 = j4 + 1;
                                                        String strFh = fh(strN3, map);
                                                        fb.gv gvVar3 = (fb.gv) map2.get(strFh);
                                                        if (j14 == -1) {
                                                            j7 = 0;
                                                        } else {
                                                            if (z12 && gvVar == null && gvVar3 == null) {
                                                                gvVar3 = new fb.gv(strFh, 0L, j12, null, null);
                                                                map2.put(strFh, gvVar3);
                                                            }
                                                            j7 = j12;
                                                        }
                                                        if (obj != null || treeMap.isEmpty()) {
                                                            j8 = j19;
                                                            drmInitData = obj;
                                                        } else {
                                                            j8 = j19;
                                                            DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData = new DrmInitData(str2, schemeDataArr2);
                                                            if (drmInitDataGv == null) {
                                                                drmInitDataGv = gv(str2, schemeDataArr2);
                                                            }
                                                        }
                                                        arrayList3.add(new fb.gv(strFh, gvVar != null ? gvVar : gvVar3, strR, jD0, i11, j15, drmInitData, strC, strV2, j7, j14, z11, arrayList));
                                                        j13 = j15 + jD0;
                                                        arrayList7 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j7 += j14;
                                                        }
                                                        j12 = j7;
                                                        sVar2 = sVar;
                                                        fbVar2 = fbVar;
                                                        str4 = str6;
                                                        obj = drmInitData;
                                                        strR = str3;
                                                        j15 = j13;
                                                        i8 = i;
                                                        n3Var3 = n3Var2;
                                                        arrayList6 = arrayList2;
                                                        z11 = false;
                                                        j14 = -1;
                                                        jD0 = 0;
                                                        strT = str2;
                                                        jWz = j8;
                                                    }
                                                }
                                                sVar2 = sVar;
                                                fbVar2 = fbVar;
                                                str4 = str6;
                                                i8 = i;
                                                n3Var3 = n3Var2;
                                                jWz = j4;
                                                strT = str2;
                                                arrayList7 = arrayList;
                                                arrayList6 = arrayList2;
                                            } else if (n3Var3 == null && "PART".equals(c(strN3, f7226eb, map))) {
                                                String strC6 = c(strN3, ct, map);
                                                long jZ = z(strN3, jz, -1L);
                                                long jZ2 = z(strN3, u, -1L);
                                                long j20 = jWz;
                                                String strV3 = v(j20, strC, str6);
                                                if (obj == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData4 = new DrmInitData(str2, schemeDataArr3);
                                                    if (drmInitDataGv == null) {
                                                        drmInitDataGv = gv(str2, schemeDataArr3);
                                                    }
                                                    obj = drmInitData4;
                                                }
                                                if (jZ == -1 || jZ2 != -1) {
                                                    n3Var3 = new fb.n3(strC6, gvVar, 0L, i11, j13, obj, strC, strV3, jZ != -1 ? jZ : 0L, jZ2, false, false, true);
                                                }
                                                sVar2 = sVar;
                                                fbVar2 = fbVar;
                                                jWz = j20;
                                                str4 = str6;
                                                arrayList7 = arrayList10;
                                                i8 = i;
                                                arrayList6 = arrayList2;
                                                strT = str2;
                                            }
                                        }
                                        arrayList = arrayList10;
                                        j4 = jWz;
                                    }
                                    sVar2 = sVar;
                                    fbVar2 = fbVar;
                                    strT = str13;
                                    str4 = str6;
                                }
                                arrayList7 = arrayList10;
                                arrayList6 = arrayList2;
                            }
                        }
                        n3Var2 = n3Var3;
                        sVar2 = sVar;
                        fbVar2 = fbVar;
                        str4 = str6;
                        i8 = i;
                        n3Var3 = n3Var2;
                        jWz = j4;
                        strT = str2;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList2;
                    }
                    z7 = false;
                }
                str4 = str6;
                z7 = false;
            }
        }
        int i15 = i8;
        fb.n3 n3Var4 = n3Var3;
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList6;
        HashMap map3 = new HashMap();
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            fb.zn znVar = (fb.zn) arrayList5.get(i16);
            long size = znVar.n3;
            if (size == -1) {
                size = (j11 + ((long) arrayList3.size())) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = znVar.zn;
            if (size2 == -1 && jI92 != -9223372036854775807L) {
                size2 = (arrayList11.isEmpty() ? ((fb.gv) c.gv(arrayList3)).n : arrayList11).size() - 1;
            }
            Uri uri = znVar.y;
            map3.put(uri, new fb.zn(uri, size, size2));
        }
        if (n3Var4 != null) {
            arrayList11.add(n3Var4);
        }
        return new fb(i15, str, arrayList12, jI9, zP, jXb, z9, i10, j11, iTl, jTl, jI92, z8, z10, jXb != 0, drmInitDataGv, arrayList3, arrayList11, aVarN, map3);
    }

    public static long z(String str, Pattern pattern, long j4) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) v0.y.v(matcher.group(1))) : j4;
    }

    public static Pattern zn(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    @Override // r0.z6.y
    /* JADX INFO: renamed from: c5, reason: merged with bridge method [inline-methods] */
    public c5 y(Uri uri, InputStream inputStream) throws IOException {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!n3(bufferedReader)) {
                throw q.gv("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    ut.wz(bufferedReader);
                    throw q.gv("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (strTrim.startsWith("#EXT-X-TARGETDURATION") || strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") || strTrim.startsWith("#EXTINF") || strTrim.startsWith("#EXT-X-KEY") || strTrim.startsWith("#EXT-X-BYTERANGE") || strTrim.equals("#EXT-X-DISCONTINUITY") || strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || strTrim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return w(new n3(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return xc(this.y, this.f7250v, new n3(arrayDeque, bufferedReader), uri.toString());
        } finally {
            ut.wz(bufferedReader);
        }
    }

    public i9(s sVar, @Nullable fb fbVar) {
        this.y = sVar;
        this.f7250v = fbVar;
    }
}

package pv;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import ft.g;
import ft.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.r;
import k4.rz;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import pv.wz;
import r0.z6;
import v0.n;
import v0.q9;
import v0.qn;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class a extends DefaultHandler implements z6.y<zn> {
    public final XmlPullParserFactory y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f7379v = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Pattern f7377fb = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f7378s = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f7376f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<fb> f7380a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public final List<fb> f7381c5;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final long f7382fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        @Nullable
        public final String f7383gv;
        public final r<n3> n3;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final List<fb> f7384s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final ArrayList<DrmInitData.SchemeData> f7385v;
        public final g y;
        public final wz zn;

        public y(g gVar, List<n3> list, wz wzVar, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<fb> arrayList2, List<fb> list2, List<fb> list3, long j) {
            this.y = gVar;
            this.n3 = r.rz(list);
            this.zn = wzVar;
            this.f7383gv = str;
            this.f7385v = arrayList;
            this.f7380a = arrayList2;
            this.f7384s = list2;
            this.f7381c5 = list3;
            this.f7382fb = j;
        }
    }

    public a() {
        try {
            this.y = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a8(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            r2 = -1
            if (r4 != 0) goto Ld
            return r2
        Ld:
            java.lang.String r4 = g4.zn.v(r4)
            r4.hashCode()
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L3e;
                case 2937391: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = -1
            goto L48
        L1d:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 3
            goto L48
        L28:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = 2
            goto L48
        L33:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = 1
            goto L48
        L3e:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = 0
        L48:
            switch(r4) {
                case 0: goto L52;
                case 1: goto L51;
                case 2: goto L4f;
                case 3: goto L4c;
                default: goto L4b;
            }
        L4b:
            return r2
        L4c:
            r4 = 8
            return r4
        L4f:
            r4 = 6
            return r4
        L51:
            return r0
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.a8(org.xmlpull.v1.XmlPullParser):int");
    }

    public static int b(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static void co(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.zn()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i).y(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static long ej(XmlPullParser xmlPullParser, String str, long j) throws q {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : ut.gq(attributeValue);
    }

    public static int en(XmlPullParser xmlPullParser) {
        int iOz = oz(xmlPullParser, "value", -1);
        if (iOz < 0) {
            return -1;
        }
        int[] iArr = f7376f;
        if (iOz < iArr.length) {
            return iArr[iOz];
        }
        return -1;
    }

    public static void i4(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (q9.v(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (q9.v(xmlPullParser)) {
                    i++;
                } else if (q9.zn(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static long k5(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : ut.vp(attributeValue);
    }

    public static String kp(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static int mg(List<fb> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(fbVar.y) && (str = fbVar.n3) != null) {
                Matcher matcher = f7377fb.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                v0.r.c5("MpdParser", "Unable to parse CEA-608 channel number from: " + fbVar.n3);
            }
        }
        return -1;
    }

    public static void mt(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (ft.c5.zn.equals(schemeData.f1516v) && (str = schemeData.f1514fb) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i5);
            if (ft.c5.n3.equals(schemeData2.f1516v) && schemeData2.f1514fb == null) {
                arrayList.set(i5, new DrmInitData.SchemeData(ft.c5.zn, str, schemeData2.f1515s, schemeData2.f1513f));
            }
        }
    }

    private long n3(List<wz.gv> list, long j, long j4, int i, long j7) {
        int iTl = i >= 0 ? i + 1 : (int) ut.tl(j7 - j, j4);
        for (int i5 = 0; i5 < iTl; i5++) {
            list.add(tl(j, j4));
            j += j4;
        }
        return j;
    }

    public static float o(XmlPullParser xmlPullParser, float f3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f3;
        }
        Matcher matcher = f7379v.matcher(attributeValue);
        if (!matcher.matches()) {
            return f3;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    public static int oz(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    @Nullable
    public static String p(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        v0.y.fb(str.equals(str2));
        return str;
    }

    public static long q9(List<fb> list) {
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if (g4.zn.y("http://dashif.org/guidelines/last-segment-number", fbVar.y)) {
                return Long.parseLong(fbVar.n3);
            }
        }
        return -1L;
    }

    public static float qn(XmlPullParser xmlPullParser, String str, float f3) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f3 : Float.parseFloat(attributeValue);
    }

    @Nullable
    public static String r(@Nullable String str, @Nullable String str2) {
        if (n.xc(str)) {
            return n.zn(str2);
        }
        if (n.co(str)) {
            return n.wz(str2);
        }
        if (n.mt(str) || n.w(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strFb = n.fb(str2);
        return "text/vtt".equals(strFb) ? "application/x-mp4-vtt" : strFb;
    }

    public static String rb(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                i4(xmlPullParser);
            }
        } while (!q9.gv(xmlPullParser, str));
        return text;
    }

    public static int ta(List<fb> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(fbVar.y) && (str = fbVar.n3) != null) {
                Matcher matcher = f7378s.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                v0.r.c5("MpdParser", "Unable to parse CEA-708 service block number from: " + fbVar.n3);
            }
        }
        return -1;
    }

    public static fb ud(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strKp = kp(xmlPullParser, "schemeIdUri", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        String strKp2 = kp(xmlPullParser, "value", null);
        String strKp3 = kp(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!q9.gv(xmlPullParser, str));
        return new fb(strKp, strKp2, strKp3);
    }

    public static int w(int i, int i5) {
        if (i == -1) {
            return i5;
        }
        if (i5 == -1) {
            return i;
        }
        v0.y.fb(i == i5);
        return i;
    }

    public static int x(XmlPullParser xmlPullParser) {
        int iOz = oz(xmlPullParser, "value", -1);
        if (iOz <= 0 || iOz >= 33) {
            return -1;
        }
        return iOz;
    }

    private boolean x4(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static String yt(List<fb> list) {
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            String str = fbVar.y;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(fbVar.n3)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(fbVar.n3)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static long z(long j, long j4) {
        if (j4 != -9223372036854775807L) {
            j = j4;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    public g a(@Nullable String str, @Nullable String str2, int i, int i5, float f3, int i8, int i10, int i11, @Nullable String str3, List<fb> list, List<fb> list2, @Nullable String str4, List<fb> list3, List<fb> list4) {
        String str5 = str4;
        String strR = r(str2, str5);
        if ("audio/eac3".equals(strR)) {
            strR = yt(list4);
            if ("audio/eac3-joc".equals(strR)) {
                str5 = "ec+3";
            }
        }
        int iYg = yg(list);
        int iEb = eb(list) | ct(list2) | rs(list3) | rs(list4);
        Pair<Integer, Integer> pairG3 = g3(list3);
        g.n3 n3VarK = new g.n3().oz(str).k5(str2).o4(strR).x(str5).u(i11).eb(iYg).dm(iEb).k(str3);
        int iTa = -1;
        g.n3 n3VarE = n3VarK.ra(pairG3 != null ? ((Integer) pairG3.first).intValue() : -1).e(pairG3 != null ? ((Integer) pairG3.second).intValue() : -1);
        if (n.co(strR)) {
            n3VarE.s8(i).o(i5).qn(f3);
        } else if (n.xc(strR)) {
            n3VarE.a8(i8).rs(i10);
        } else if (n.mt(strR)) {
            if ("application/cea-608".equals(strR)) {
                iTa = mg(list2);
            } else if ("application/cea-708".equals(strR)) {
                iTa = ta(list2);
            }
            n3VarE.ej(iTa);
        } else if (n.w(strR)) {
            n3VarE.s8(i).o(i5);
        }
        return n3VarE.z6();
    }

    public int ap(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        i4(xmlPullParser);
    }

    public t c5(String str, long j, long j4) {
        return new t(str, j, j4);
    }

    public int ct(List<fb> list) {
        int iM;
        int i = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            fb fbVar = list.get(i5);
            if (g4.zn.y("urn:mpeg:dash:role:2011", fbVar.y)) {
                iM = o4(fbVar.n3);
            } else if (g4.zn.y("urn:tva:metadata:cs:AudioPurposeCS:2007", fbVar.y)) {
                iM = m(fbVar.n3);
            }
            i |= iM;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.String, com.google.android.exoplayer2.drm.DrmInitData.SchemeData> d(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.d(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d0(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = kp(r4, r0, r1)
            r0.hashCode()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128649360: goto L56;
                case -1352850286: goto L4b;
                case -1138141449: goto L40;
                case -986633423: goto L35;
                case -79006963: goto L2a;
                case 312179081: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = -1
            goto L60
        L14:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 6
            goto L60
        L1f:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 5
            goto L60
        L2a:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 3
            goto L60
        L40:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L49
            goto L12
        L49:
            r0 = 2
            goto L60
        L4b:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L54
            goto L12
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6e;
                case 3: goto L69;
                case 4: goto L7a;
                case 5: goto L64;
                case 6: goto L6e;
                default: goto L63;
            }
        L63:
            goto L7e
        L64:
            int r1 = b(r4)
            goto L7e
        L69:
            int r1 = en(r4)
            goto L7e
        L6e:
            int r1 = a8(r4)
            goto L7e
        L73:
            java.lang.String r0 = "value"
            int r1 = oz(r4, r0, r1)
            goto L7e
        L7a:
            int r1 = x(r4)
        L7e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = v0.q9.gv(r4, r0)
            if (r0 == 0) goto L7e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.d0(org.xmlpull.v1.XmlPullParser):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee A[LOOP:0: B:3:0x006a->B:57:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198 A[EDGE_INSN: B:58:0x0198->B:47:0x0198 BREAK  A[LOOP:0: B:3:0x006a->B:57:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv.a.y dm(org.xmlpull.v1.XmlPullParser r36, java.util.List<pv.n3> r37, @androidx.annotation.Nullable java.lang.String r38, @androidx.annotation.Nullable java.lang.String r39, int r40, int r41, float r42, int r43, int r44, @androidx.annotation.Nullable java.lang.String r45, java.util.List<pv.fb> r46, java.util.List<pv.fb> r47, java.util.List<pv.fb> r48, java.util.List<pv.fb> r49, @androidx.annotation.Nullable pv.wz r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.dm(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, pv.wz, long, long, long, long, long, boolean):pv.a$y");
    }

    public List<wz.gv> e(XmlPullParser xmlPullParser, long j, long j4) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jN3 = 0;
        long jK = -9223372036854775807L;
        boolean z = false;
        int iOz = 0;
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "S")) {
                long jK2 = k(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    jN3 = n3(arrayList, jN3, jK, iOz, jK2);
                }
                if (jK2 == -9223372036854775807L) {
                    jK2 = jN3;
                }
                jK = k(xmlPullParser, "d", -9223372036854775807L);
                iOz = oz(xmlPullParser, "r", 0);
                jN3 = jK2;
                z = true;
            } else {
                i4(xmlPullParser);
            }
        } while (!q9.gv(xmlPullParser, "SegmentTimeline"));
        if (z) {
            n3(arrayList, jN3, jK, iOz, ut.x5(j4, j, 1000L));
        }
        return arrayList;
    }

    public int eb(List<fb> list) {
        int iO4 = 0;
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if (g4.zn.y("urn:mpeg:dash:role:2011", fbVar.y)) {
                iO4 |= o4(fbVar.n3);
            }
        }
        return iO4;
    }

    public wz.n3 f(t tVar, long j, long j4, long j7, long j8, @Nullable List<wz.gv> list, long j9, @Nullable List<t> list2, long j10, long j11) {
        return new wz.n3(tVar, j, j4, j7, j8, list, j9, list2, ut.xb(j10), ut.xb(j11));
    }

    @Override // r0.z6.y
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public zn y(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.y.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return f7(xmlPullParserNewPullParser, uri);
            }
            throw q.gv("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e4) {
            throw q.gv(null, e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc A[LOOP:0: B:24:0x00a0->B:80:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv.zn f7(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.f7(org.xmlpull.v1.XmlPullParser, android.net.Uri):pv.zn");
    }

    public zn fb(long j, long j4, long j7, boolean z, long j8, long j9, long j10, long j11, @Nullable f fVar, @Nullable mt mtVar, @Nullable xc xcVar, @Nullable Uri uri, List<i9> list) {
        return new zn(j, j4, j7, z, j8, j9, j10, j11, fVar, mtVar, xcVar, uri, list);
    }

    public long fh(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    @Nullable
    public p g(XmlPullParser xmlPullParser, String str, @Nullable p pVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? p.n3(attributeValue) : pVar;
    }

    @Nullable
    public Pair<Integer, Integer> g3(List<fb> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if ((g4.zn.y("http://dashif.org/thumbnail_tile", fbVar.y) || g4.zn.y("http://dashif.org/guidelines/thumbnail_tile", fbVar.y)) && (str = fbVar.n3) != null) {
                String[] strArrRo = ut.ro(str, "x");
                if (strArrRo.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrRo[0])), Integer.valueOf(Integer.parseInt(strArrRo[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public EventMessage gv(String str, String str2, long j, long j4, byte[] bArr) {
        return new EventMessage(str, str2, j4, j, bArr);
    }

    public byte[] hw(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, g4.v.zn.name());
        xmlPullParser.nextToken();
        while (!q9.gv(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public tl i9(y yVar, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<fb> arrayList2) {
        g.n3 n3VarN3 = yVar.y.n3();
        if (str != null) {
            n3VarN3.q9(str);
        }
        String str3 = yVar.f7383gv;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = yVar.f7385v;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            mt(arrayList3);
            co(arrayList3);
            n3VarN3.vl(new DrmInitData(str2, arrayList3));
        }
        ArrayList<fb> arrayList4 = yVar.f7380a;
        arrayList4.addAll(arrayList2);
        return tl.w(yVar.f7382fb, n3VarN3.z6(), yVar.n3, yVar.zn, arrayList4, yVar.f7384s, yVar.f7381c5, null);
    }

    public t j(XmlPullParser xmlPullParser) {
        return xg(xmlPullParser, "sourceURL", "range");
    }

    public s j5(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        ArrayList arrayList;
        String strKp = kp(xmlPullParser, "schemeIdUri", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        String strKp2 = kp(xmlPullParser, "value", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        long jK = k(xmlPullParser, "timescale", 1L);
        long jK2 = k(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(NotificationCompat.FLAG_GROUP_SUMMARY);
        while (true) {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j4 = jK2;
                j = jK2;
                arrayList = arrayList2;
                arrayList.add(vl(xmlPullParser, strKp, strKp2, jK, j4, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = jK2;
                arrayList = arrayList2;
                i4(xmlPullParser);
            }
            if (q9.gv(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            jK2 = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return v(strKp, strKp2, jK, jArr, eventMessageArr);
    }

    public Pair<i9, Long> jz(XmlPullParser xmlPullParser, List<n3> list, long j, long j4, long j7, long j8, boolean z) throws XmlPullParserException, IOException {
        long j9;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j10;
        wz wzVarRa;
        a aVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long jK5 = k5(xmlPullParser2, "start", j);
        long j11 = -9223372036854775807L;
        long j12 = j7 != -9223372036854775807L ? j7 + jK5 : -9223372036854775807L;
        long jK52 = k5(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jFh = j4;
        long j13 = -9223372036854775807L;
        wz wzVarLc = null;
        fb fbVarUd = null;
        boolean z5 = false;
        while (true) {
            xmlPullParser.next();
            if (q9.a(xmlPullParser2, "BaseURL")) {
                if (!z5) {
                    jFh = aVar.fh(xmlPullParser2, jFh);
                    z5 = true;
                }
                arrayList6.addAll(aVar.rz(xmlPullParser2, list, z));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j10 = j11;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (q9.a(xmlPullParser2, "AdaptationSet")) {
                    j9 = jFh;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(n(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, wzVarLc, jK52, jFh, j13, j12, j8, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j9 = jFh;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (q9.a(xmlPullParser2, "EventStream")) {
                        arrayList7.add(j5(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else if (q9.a(xmlPullParser2, "SegmentBase")) {
                        arrayList3 = arrayList7;
                        wzVarLc = lc(xmlPullParser2, null);
                        obj = null;
                        jFh = j9;
                        j10 = -9223372036854775807L;
                    } else {
                        arrayList3 = arrayList7;
                        if (q9.a(xmlPullParser2, "SegmentList")) {
                            long jFh2 = fh(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            wzVarRa = nf(xmlPullParser, null, j12, jK52, j9, jFh2, j8);
                            j13 = jFh2;
                            jFh = j9;
                            j10 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (q9.a(xmlPullParser2, "SegmentTemplate")) {
                                long jFh3 = fh(xmlPullParser2, -9223372036854775807L);
                                j10 = -9223372036854775807L;
                                wzVarRa = ra(xmlPullParser, null, r.yt(), j12, jK52, j9, jFh3, j8);
                                j13 = jFh3;
                                jFh = j9;
                            } else {
                                j10 = -9223372036854775807L;
                                if (q9.a(xmlPullParser2, "AssetIdentifier")) {
                                    fbVarUd = ud(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    i4(xmlPullParser);
                                }
                                jFh = j9;
                            }
                        }
                        wzVarLc = wzVarRa;
                    }
                }
                obj = null;
                j10 = -9223372036854775807L;
                jFh = j9;
            }
            if (q9.gv(xmlPullParser2, "Period")) {
                return Pair.create(s(attributeValue, jK5, arrayList2, arrayList3, fbVarUd), Long.valueOf(jK52));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j11 = j10;
            aVar = this;
        }
    }

    public wz.v lc(XmlPullParser xmlPullParser, @Nullable wz.v vVar) throws XmlPullParserException, IOException {
        long j;
        long j4;
        long jK = k(xmlPullParser, "timescale", vVar != null ? vVar.n3 : 1L);
        long jK2 = k(xmlPullParser, "presentationTimeOffset", vVar != null ? vVar.zn : 0L);
        long j7 = vVar != null ? vVar.f7409gv : 0L;
        long j8 = vVar != null ? vVar.f7410v : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j4 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j4) + 1;
        } else {
            j = j8;
            j4 = j7;
        }
        t tVarJ = vVar != null ? vVar.y : null;
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Initialization")) {
                tVarJ = j(xmlPullParser);
            } else {
                i4(xmlPullParser);
            }
        } while (!q9.gv(xmlPullParser, "SegmentBase"));
        return wz(tVarJ, jK, jK2, j4, j);
    }

    public int m(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x030d A[LOOP:0: B:3:0x007c->B:71:0x030d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce A[EDGE_INSN: B:72:0x02ce->B:65:0x02ce BREAK  A[LOOP:0: B:3:0x007c->B:71:0x030d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv.y n(org.xmlpull.v1.XmlPullParser r55, java.util.List<pv.n3> r56, @androidx.annotation.Nullable pv.wz r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv.a.n(org.xmlpull.v1.XmlPullParser, java.util.List, pv.wz, long, long, long, long, long, boolean):pv.y");
    }

    public wz.n3 nf(XmlPullParser xmlPullParser, @Nullable wz.n3 n3Var, long j, long j4, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long jK = k(xmlPullParser, "timescale", n3Var != null ? n3Var.n3 : 1L);
        long jK2 = k(xmlPullParser, "presentationTimeOffset", n3Var != null ? n3Var.zn : 0L);
        long jK3 = k(xmlPullParser, "duration", n3Var != null ? n3Var.f7416v : -9223372036854775807L);
        long jK4 = k(xmlPullParser, "startNumber", n3Var != null ? n3Var.f7414gv : 1L);
        long jZ = z(j7, j8);
        List<wz.gv> listE = null;
        List<t> arrayList = null;
        t tVarJ = null;
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Initialization")) {
                tVarJ = j(xmlPullParser);
            } else if (q9.a(xmlPullParser, "SegmentTimeline")) {
                listE = e(xmlPullParser, jK, j4);
            } else if (q9.a(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(s8(xmlPullParser));
            } else {
                i4(xmlPullParser);
            }
        } while (!q9.gv(xmlPullParser, "SegmentList"));
        if (n3Var != null) {
            if (tVarJ == null) {
                tVarJ = n3Var.y;
            }
            if (listE == null) {
                listE = n3Var.f7411a;
            }
            if (arrayList == null) {
                arrayList = n3Var.f7408i9;
            }
        }
        return f(tVarJ, jK, jK2, jK4, jK3, listE, jZ, arrayList, j9, j);
    }

    public int o4(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public wz.zn ra(XmlPullParser xmlPullParser, @Nullable wz.zn znVar, List<fb> list, long j, long j4, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long jK = k(xmlPullParser, "timescale", znVar != null ? znVar.n3 : 1L);
        long jK2 = k(xmlPullParser, "presentationTimeOffset", znVar != null ? znVar.zn : 0L);
        long jK3 = k(xmlPullParser, "duration", znVar != null ? znVar.f7416v : -9223372036854775807L);
        long jK4 = k(xmlPullParser, "startNumber", znVar != null ? znVar.f7414gv : 1L);
        long jQ9 = q9(list);
        long jZ = z(j7, j8);
        List<wz.gv> listE = null;
        p pVarG = g(xmlPullParser, "media", znVar != null ? znVar.f7417f : null);
        p pVarG2 = g(xmlPullParser, "initialization", znVar != null ? znVar.f7418i9 : null);
        t tVarJ = null;
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Initialization")) {
                tVarJ = j(xmlPullParser);
            } else if (q9.a(xmlPullParser, "SegmentTimeline")) {
                listE = e(xmlPullParser, jK, j4);
            } else {
                i4(xmlPullParser);
            }
        } while (!q9.gv(xmlPullParser, "SegmentTemplate"));
        if (znVar != null) {
            if (tVarJ == null) {
                tVarJ = znVar.y;
            }
            if (listE == null) {
                listE = znVar.f7411a;
            }
        }
        return t(tVarJ, jK, jK2, jK4, jQ9, jK3, listE, jZ, pVarG2, pVarG, j9, j);
    }

    public int rs(List<fb> list) {
        int i = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (g4.zn.y("http://dashif.org/guidelines/trickmode", list.get(i5).y)) {
                i = 16384;
            }
        }
        return i;
    }

    public List<n3> rz(XmlPullParser xmlPullParser, List<n3> list, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i5 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String strRb = rb(xmlPullParser, "BaseURL");
        if (qn.n3(strRb)) {
            if (attributeValue3 == null) {
                attributeValue3 = strRb;
            }
            return rz.i9(new n3(strRb, attributeValue3, i, i5));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            n3 n3Var = list.get(i8);
            String strGv = qn.gv(n3Var.y, strRb);
            String str = attributeValue3 == null ? strGv : attributeValue3;
            if (z) {
                i = n3Var.zn;
                i5 = n3Var.f7392gv;
                str = n3Var.n3;
            }
            arrayList.add(new n3(strGv, str, i, i5));
        }
        return arrayList;
    }

    public i9 s(@Nullable String str, long j, List<pv.y> list, List<s> list2, @Nullable fb fbVar) {
        return new i9(str, j, list, list2, fbVar);
    }

    public t s8(XmlPullParser xmlPullParser) {
        return xg(xmlPullParser, "media", "mediaRange");
    }

    public wz.zn t(t tVar, long j, long j4, long j7, long j8, long j9, List<wz.gv> list, long j10, @Nullable p pVar, @Nullable p pVar2, long j11, long j12) {
        return new wz.zn(tVar, j, j4, j7, j8, j9, list, j10, pVar, pVar2, ut.xb(j11), ut.xb(j12));
    }

    public wz.gv tl(long j, long j4) {
        return new wz.gv(j, j4);
    }

    public String[] u(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public mt u0(XmlPullParser xmlPullParser) {
        return xc(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    public String ut(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return rb(xmlPullParser, "Label");
    }

    public s v(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new s(str, str2, j, jArr, eventMessageArr);
    }

    public Pair<Long, EventMessage> vl(XmlPullParser xmlPullParser, String str, String str2, long j, long j4, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long jK = k(xmlPullParser, "id", 0L);
        long jK2 = k(xmlPullParser, "duration", -9223372036854775807L);
        long jK3 = k(xmlPullParser, "presentationTime", 0L);
        long jX5 = ut.x5(jK2, 1000L, j);
        long jX52 = ut.x5(jK3 - j4, 1000000L, j);
        String strKp = kp(xmlPullParser, "messageData", null);
        byte[] bArrHw = hw(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jX52);
        if (strKp != null) {
            bArrHw = ut.ap(strKp);
        }
        return Pair.create(lValueOf, gv(str, str2, jK, jX5, bArrHw));
    }

    public wz.v wz(t tVar, long j, long j4, long j7, long j8) {
        return new wz.v(tVar, j, j4, j7, j8);
    }

    public mt xc(String str, String str2) {
        return new mt(str, str2);
    }

    public t xg(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j4;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j4 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return c5(attributeValue, j, j4);
        }
        j = 0;
        j4 = -1;
        return c5(attributeValue, j, j4);
    }

    public f y5(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String strKp = kp(xmlPullParser, "moreInformationURL", null);
        String strKp2 = kp(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (q9.a(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (q9.a(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                i4(xmlPullParser);
            }
            String str = strNextText3;
            if (q9.gv(xmlPullParser, "ProgramInformation")) {
                return new f(strNextText, strNextText2, str, strKp, strKp2);
            }
            strNextText3 = str;
        }
    }

    public xc yc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long jK = -9223372036854775807L;
        long jK2 = -9223372036854775807L;
        long jK3 = -9223372036854775807L;
        float fQn = -3.4028235E38f;
        float fQn2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "Latency")) {
                jK = k(xmlPullParser, "target", -9223372036854775807L);
                jK2 = k(xmlPullParser, "min", -9223372036854775807L);
                jK3 = k(xmlPullParser, "max", -9223372036854775807L);
            } else if (q9.a(xmlPullParser, "PlaybackRate")) {
                fQn = qn(xmlPullParser, "min", -3.4028235E38f);
                fQn2 = qn(xmlPullParser, "max", -3.4028235E38f);
            }
            long j = jK;
            long j4 = jK2;
            long j7 = jK3;
            float f3 = fQn;
            float f4 = fQn2;
            if (q9.gv(xmlPullParser, "ServiceDescription")) {
                return new xc(j, j4, j7, f3, f4);
            }
            jK = j;
            jK2 = j4;
            jK3 = j7;
            fQn = f3;
            fQn2 = f4;
        }
    }

    public int yg(List<fb> list) {
        int iAp = 0;
        for (int i = 0; i < list.size(); i++) {
            fb fbVar = list.get(i);
            if (g4.zn.y("urn:mpeg:dash:role:2011", fbVar.y)) {
                iAp |= ap(fbVar.n3);
            }
        }
        return iAp;
    }

    public int z6(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public pv.y zn(int i, int i5, List<tl> list, List<fb> list2, List<fb> list3, List<fb> list4) {
        return new pv.y(i, i5, list, list2, list3, list4);
    }
}

package j0;

import android.text.Layout;
import androidx.annotation.Nullable;
import b0.c5;
import b0.f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v0.q9;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class zn extends b0.s {

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final XmlPullParserFactory f5802xc;
    public static final Pattern w = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f5799p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final Pattern f5798mt = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final Pattern f5796co = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern z = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f5800r = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final Pattern f5801x4 = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final n3 f5797i4 = new n3(30.0f, 1, 1);
    public static final y f3 = new y(32, 15);

    public static final class n3 {
        public final int n3;
        public final float y;
        public final int zn;

        public n3(float f3, int i, int i5) {
            this.y = f3;
            this.n3 = i;
            this.zn = i5;
        }
    }

    public static final class y {
        public final int n3;
        public final int y;

        public y(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }
    }

    /* JADX INFO: renamed from: j0.zn$zn, reason: collision with other inner class name */
    public static final class C0110zn {
        public final int n3;
        public final int y;

        public C0110zn(int i, int i5) {
            this.y = i;
            this.n3 = i5;
        }
    }

    public zn() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f5802xc = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.gv a8(org.xmlpull.v1.XmlPullParser r20, @androidx.annotation.Nullable j0.gv r21, java.util.Map<java.lang.String, j0.v> r22, j0.zn.n3 r23) throws b0.f {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.zn.a8(org.xmlpull.v1.XmlPullParser, j0.gv, java.util.Map, j0.zn$n3):j0.gv");
    }

    public static float b(String str) {
        Matcher matcher = f5796co.matcher(str);
        if (!matcher.matches()) {
            r.c5("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) v0.y.v(matcher.group(1)))));
        } catch (NumberFormatException e4) {
            r.i9("TtmlDecoder", "Failed to parse shear: " + str, e4);
            return Float.MAX_VALUE;
        }
    }

    public static void d(String str, fb fbVar) throws f {
        Matcher matcher;
        String str2;
        String[] strArrRo = ut.ro(str, "\\s+");
        if (strArrRo.length == 1) {
            matcher = f5798mt.matcher(str);
        } else {
            if (strArrRo.length != 2) {
                throw new f("Invalid number of entries for fontSize: " + strArrRo.length + ".");
            }
            matcher = f5798mt.matcher(strArrRo[1]);
            r.c5("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new f("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) v0.y.v(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                fbVar.c(3);
                break;
            case "em":
                fbVar.c(2);
                break;
            case "px":
                fbVar.c(1);
                break;
            default:
                throw new f("Invalid unit for fontSize: '" + str2 + "'.");
        }
        fbVar.n(Float.parseFloat((String) v0.y.v(matcher.group(1))));
    }

    public static Map<String, fb> ej(XmlPullParser xmlPullParser, Map<String, fb> map, y yVar, @Nullable C0110zn c0110zn, Map<String, v> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "style")) {
                String strY = q9.y(xmlPullParser, "style");
                fb fbVarK5 = k5(xmlPullParser, new fb());
                if (strY != null) {
                    for (String str : yt(strY)) {
                        fbVarK5.y(map.get(str));
                    }
                }
                String strFb = fbVarK5.fb();
                if (strFb != null) {
                    map.put(strFb, fbVarK5);
                }
            } else if (q9.a(xmlPullParser, "region")) {
                v vVarX = x(xmlPullParser, yVar, c0110zn);
                if (vVarX != null) {
                    map2.put(vVarX.y, vVarX);
                }
            } else if (q9.a(xmlPullParser, "metadata")) {
                ud(xmlPullParser, map3);
            }
        } while (!q9.gv(xmlPullParser, "head"));
        return map;
    }

    public static fb fh(@Nullable fb fbVar) {
        return fbVar == null ? new fb() : fbVar;
    }

    @Nullable
    public static C0110zn hw(XmlPullParser xmlPullParser) {
        String strY = q9.y(xmlPullParser, "extent");
        if (strY == null) {
            return null;
        }
        Matcher matcher = f5800r.matcher(strY);
        if (!matcher.matches()) {
            r.c5("TtmlDecoder", "Ignoring non-pixel tts extent: " + strY);
            return null;
        }
        try {
            return new C0110zn(Integer.parseInt((String) v0.y.v(matcher.group(1))), Integer.parseInt((String) v0.y.v(matcher.group(2))));
        } catch (NumberFormatException unused) {
            r.c5("TtmlDecoder", "Ignoring malformed tts extent: " + strY);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.fb k5(org.xmlpull.v1.XmlPullParser r13, j0.fb r14) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.zn.k5(org.xmlpull.v1.XmlPullParser, j0.fb):j0.fb");
    }

    @Nullable
    public static Layout.Alignment mg(String str) {
        String strV = g4.zn.v(str);
        strV.hashCode();
        switch (strV) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static boolean rz(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static y ta(XmlPullParser xmlPullParser, y yVar) throws f {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return yVar;
        }
        Matcher matcher = f5801x4.matcher(attributeValue);
        if (!matcher.matches()) {
            r.c5("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return yVar;
        }
        try {
            int i = Integer.parseInt((String) v0.y.v(matcher.group(1)));
            int i5 = Integer.parseInt((String) v0.y.v(matcher.group(2)));
            if (i != 0 && i5 != 0) {
                return new y(i, i5);
            }
            throw new f("Invalid cell resolution " + i + " " + i5);
        } catch (NumberFormatException unused) {
            r.c5("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return yVar;
        }
    }

    public static void ud(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strY;
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, "image") && (strY = q9.y(xmlPullParser, "id")) != null) {
                map.put(strY, xmlPullParser.nextText());
            }
        } while (!q9.gv(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long vl(java.lang.String r13, j0.zn.n3 r14) throws b0.f {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.zn.vl(java.lang.String, j0.zn$n3):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.v x(org.xmlpull.v1.XmlPullParser r18, j0.zn.y r19, @androidx.annotation.Nullable j0.zn.C0110zn r20) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.zn.x(org.xmlpull.v1.XmlPullParser, j0.zn$y, j0.zn$zn):j0.v");
    }

    public static String[] yt(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : ut.ro(strTrim, "\\s+");
    }

    public static n3 z6(XmlPullParser xmlPullParser) throws f {
        float f4;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (ut.ro(attributeValue2, " ").length != 2) {
                throw new f("frameRateMultiplier doesn't have 2 parts");
            }
            f4 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f4 = 1.0f;
        }
        n3 n3Var = f5797i4;
        int i5 = n3Var.n3;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i5 = Integer.parseInt(attributeValue3);
        }
        int i8 = n3Var.zn;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        }
        return new n3(i * f4, i5, i8);
    }

    @Override // b0.s
    public c5 c(byte[] bArr, int i, boolean z5) throws f {
        n3 n3Var;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f5802xc.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, new v(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING));
            C0110zn c0110znHw = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            n3 n3VarZ6 = f5797i4;
            y yVarTa = f3;
            s sVar = null;
            int i5 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                gv gvVar = (gv) arrayDeque.peek();
                if (i5 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            n3VarZ6 = z6(xmlPullParserNewPullParser);
                            yVarTa = ta(xmlPullParserNewPullParser, f3);
                            c0110znHw = hw(xmlPullParserNewPullParser);
                        }
                        C0110zn c0110zn = c0110znHw;
                        n3 n3Var2 = n3VarZ6;
                        y yVar = yVarTa;
                        if (rz(name)) {
                            if ("head".equals(name)) {
                                n3Var = n3Var2;
                                ej(xmlPullParserNewPullParser, map, yVar, c0110zn, map2, map3);
                            } else {
                                n3Var = n3Var2;
                                try {
                                    gv gvVarA8 = a8(xmlPullParserNewPullParser, gvVar, map2, n3Var);
                                    arrayDeque.push(gvVarA8);
                                    if (gvVar != null) {
                                        gvVar.y(gvVarA8);
                                    }
                                } catch (f e4) {
                                    r.i9("TtmlDecoder", "Suppressing parser error", e4);
                                    i5++;
                                }
                            }
                            n3VarZ6 = n3Var;
                        } else {
                            r.a("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i5++;
                            n3VarZ6 = n3Var2;
                        }
                        c0110znHw = c0110zn;
                        yVarTa = yVar;
                    } else if (eventType == 4) {
                        ((gv) v0.y.v(gvVar)).y(gv.gv(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            sVar = new s((gv) v0.y.v((gv) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i5++;
                } else if (eventType == 3) {
                    i5--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (sVar != null) {
                return sVar;
            }
            throw new f("No TTML subtitles found");
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new f("Unable to decode source", e6);
        }
    }
}

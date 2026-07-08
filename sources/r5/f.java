package r5;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r5.fb;
import r5.n3;
import r5.v;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public int f7661gv;
    public fb y = null;
    public fb.a8 n3 = null;
    public boolean zn = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f7663v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f7658a = null;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public StringBuilder f7660fb = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7662s = false;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public StringBuilder f7659c5 = null;

    public static fb.ta.a ad(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return fb.ta.a.v;
            case "end":
                return fb.ta.a.fb;
            case "start":
                return fb.ta.a.y;
            default:
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static fb.w ap(String str) throws i9 {
        if (str.length() == 0) {
            throw new i9("Invalid length value (empty string)");
        }
        int length = str.length();
        fb.xg xgVarValueOf = fb.xg.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            xgVarValueOf = fb.xg.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                xgVarValueOf = fb.xg.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new i9("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new fb.w(o4(str, 0, length), xgVarValueOf);
        } catch (NumberFormatException e4) {
            throw new i9("Invalid length value: " + str, e4);
        }
    }

    public static int co(float f3, float f4, float f5) {
        float f7 = f3 % 360.0f;
        if (f3 < 0.0f) {
            f7 += 360.0f;
        }
        float f8 = f7 / 60.0f;
        float f9 = f4 / 100.0f;
        float f10 = f5 / 100.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        float f11 = f10 >= 0.0f ? f10 > 1.0f ? 1.0f : f10 : 0.0f;
        float f12 = f11 <= 0.5f ? (f9 + 1.0f) * f11 : (f11 + f9) - (f9 * f11);
        float f13 = (f11 * 2.0f) - f12;
        return i9(z(f13, f12, f8 - 2.0f) * 256.0f) | (i9(z(f13, f12, f8 + 2.0f) * 256.0f) << 16) | (i9(z(f13, f12, f8) * 256.0f) << 8);
    }

    public static fb.ta.zn cr(String str) {
        if ("butt".equals(str)) {
            return fb.ta.zn.y;
        }
        if ("round".equals(str)) {
            return fb.ta.zn.v;
        }
        if ("square".equals(str)) {
            return fb.ta.zn.fb;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static float ct(String str) throws i9 {
        int length = str.length();
        if (length != 0) {
            return o4(str, 0, length);
        }
        throw new i9("Invalid float value (empty string)");
    }

    public static fb.ta.fb cy(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return fb.ta.fb.s;
            case "underline":
                return fb.ta.fb.v;
            case "none":
                return fb.ta.fb.y;
            case "blink":
                return fb.ta.fb.f;
            case "overline":
                return fb.ta.fb.fb;
            default:
                return null;
        }
    }

    public static fb.ta.y dm(String str) {
        if ("nonzero".equals(str)) {
            return fb.ta.y.y;
        }
        if ("evenodd".equals(str)) {
            return fb.ta.y.v;
        }
        return null;
    }

    public static String e(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static List<String> eb(String str) {
        c5 c5Var = new c5(str);
        ArrayList arrayList = null;
        do {
            String strP = c5Var.p();
            if (strP == null) {
                strP = c5Var.r(',');
            }
            if (strP == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strP);
            c5Var.c();
        } while (!c5Var.s());
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static v g(String str) throws i9 {
        v.n3 n3Var;
        c5 c5Var = new c5(str);
        c5Var.d0();
        String strMt = c5Var.mt();
        if ("defer".equals(strMt)) {
            c5Var.d0();
            strMt = c5Var.mt();
        }
        v.y yVarY = n3.y(strMt);
        c5Var.d0();
        if (c5Var.s()) {
            n3Var = null;
        } else {
            String strMt2 = c5Var.mt();
            strMt2.hashCode();
            if (strMt2.equals("meet")) {
                n3Var = v.n3.y;
            } else {
                if (!strMt2.equals("slice")) {
                    throw new i9("Invalid preserveAspectRatio definition: " + str);
                }
                n3Var = v.n3.v;
            }
        }
        return new v(yVarY, n3Var);
    }

    public static fb.vl g3(String str) {
        if (!str.startsWith("url(")) {
            return xg(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new fb.r(str.substring(4).trim(), (fb.vl) null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new fb.r(strTrim, strTrim2.length() > 0 ? xg(strTrim2) : null);
    }

    public static int i9(float f3) {
        if (f3 < 0.0f) {
            return 0;
        }
        if (f3 > 255.0f) {
            return 255;
        }
        return Math.round(f3);
    }

    public static fb.zn jz(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        c5 c5Var = new c5(str.substring(5));
        c5Var.d0();
        fb.w wVarYc = yc(c5Var);
        c5Var.c();
        fb.w wVarYc2 = yc(c5Var);
        c5Var.c();
        fb.w wVarYc3 = yc(c5Var);
        c5Var.c();
        fb.w wVarYc4 = yc(c5Var);
        c5Var.d0();
        if (c5Var.a(')') || c5Var.s()) {
            return new fb.zn(wVarYc, wVarYc2, wVarYc3, wVarYc4);
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static Float kp(String str) {
        try {
            float fCt = ct(str);
            if (fCt < 0.0f) {
                fCt = 0.0f;
            } else if (fCt > 1.0f) {
                fCt = 1.0f;
            }
            return Float.valueOf(fCt);
        } catch (i9 unused) {
            return null;
        }
    }

    public static fb.w lc(String str) {
        try {
            fb.w wVarY = gv.y(str);
            return wVarY == null ? ap(str) : wVarY;
        } catch (i9 unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0290, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r12) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r5.fb.i4 m(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.m(java.lang.String):r5.fb$i4");
    }

    public static void mp(fb.ta taVar, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (y.n3[fb.y(str).ordinal()]) {
                case 47:
                    fb.vl vlVarG3 = g3(str2);
                    taVar.f7698v = vlVarG3;
                    if (vlVarG3 != null) {
                        taVar.y |= 1;
                        return;
                    }
                    return;
                case 48:
                    fb.ta.y yVarDm = dm(str2);
                    taVar.f7689fb = yVarDm;
                    if (yVarDm != null) {
                        taVar.y |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fKp = kp(str2);
                    taVar.f7695s = fKp;
                    if (fKp != null) {
                        taVar.y |= 4;
                        return;
                    }
                    return;
                case 50:
                    fb.vl vlVarG32 = g3(str2);
                    taVar.f7688f = vlVarG32;
                    if (vlVarG32 != null) {
                        taVar.y |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fKp2 = kp(str2);
                    taVar.f7696t = fKp2;
                    if (fKp2 != null) {
                        taVar.y |= 16;
                        return;
                    }
                    return;
                case 52:
                    taVar.w = ap(str2);
                    taVar.y |= 32;
                    break;
                case 53:
                    fb.ta.zn znVarCr = cr(str2);
                    taVar.f7693p = znVarCr;
                    if (znVarCr != null) {
                        taVar.y |= 64;
                        return;
                    }
                    return;
                case 54:
                    fb.ta.gv gvVarO0 = o0(str2);
                    taVar.f7685co = gvVarO0;
                    if (gvVarO0 != null) {
                        taVar.y |= 128;
                        return;
                    }
                    return;
                case 55:
                    taVar.z = Float.valueOf(ct(str2));
                    taVar.y |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        taVar.f7694r = null;
                        taVar.y |= 512;
                        return;
                    }
                    fb.w[] wVarArrPq = pq(str2);
                    taVar.f7694r = wVarArrPq;
                    if (wVarArrPq != null) {
                        taVar.y |= 512;
                        return;
                    }
                    return;
                case 57:
                    taVar.f3 = ap(str2);
                    taVar.y |= 1024;
                    break;
                case 58:
                    taVar.n = kp(str2);
                    taVar.y |= 2048;
                    return;
                case 59:
                    taVar.c = u(str2);
                    taVar.y |= 4096;
                    break;
                case 60:
                    rs(taVar, str2);
                    return;
                case 61:
                    List<String> listEb = eb(str2);
                    taVar.d0 = listEb;
                    if (listEb != null) {
                        taVar.y |= 8192;
                        return;
                    }
                    return;
                case 62:
                    fb.w wVarLc = lc(str2);
                    taVar.fh = wVarLc;
                    if (wVarLc != null) {
                        taVar.y |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numRa = ra(str2);
                    taVar.f7686d = numRa;
                    if (numRa != null) {
                        taVar.y |= 32768;
                        return;
                    }
                    return;
                case 64:
                    fb.ta.n3 n3VarNf = nf(str2);
                    taVar.f7687ej = n3VarNf;
                    if (n3VarNf != null) {
                        taVar.y |= 65536;
                        return;
                    }
                    return;
                case 65:
                    fb.ta.fb fbVarCy = cy(str2);
                    taVar.f7699x = fbVarCy;
                    if (fbVarCy != null) {
                        taVar.y |= 131072;
                        return;
                    }
                    return;
                case 66:
                    fb.ta.s sVarQk = qk(str2);
                    taVar.f7684b = sVarQk;
                    if (sVarQk != null) {
                        taVar.y |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    fb.ta.a aVarAd = ad(str2);
                    taVar.f7690hw = aVarAd;
                    if (aVarAd != null) {
                        taVar.y |= 262144;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolRb = rb(str2);
                    taVar.f7691j5 = boolRb;
                    if (boolRb != null) {
                        taVar.y |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String strE = e(str2, str);
                    taVar.o = strE;
                    taVar.j = strE;
                    taVar.oz = strE;
                    taVar.y |= 14680064;
                    return;
                case 70:
                    taVar.o = e(str2, str);
                    taVar.y |= 2097152;
                    return;
                case 71:
                    taVar.j = e(str2, str);
                    taVar.y |= 4194304;
                    return;
                case 72:
                    taVar.oz = e(str2, str);
                    taVar.y |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            taVar.f7697ut = Boolean.valueOf(!str2.equals("none"));
                            taVar.y |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            taVar.q9 = Boolean.valueOf(str2.equals("visible"));
                            taVar.y |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (!str2.equals("currentColor")) {
                        try {
                            taVar.f7692k = u(str2);
                        } catch (i9 e4) {
                            Log.w("SVGParser", e4.getMessage());
                            return;
                        }
                        break;
                    } else {
                        taVar.f7692k = fb.fb.n3();
                    }
                    taVar.y |= 67108864;
                    return;
                case 76:
                    taVar.f7 = kp(str2);
                    taVar.y |= 134217728;
                    return;
                case 77:
                    fb.zn znVarJz = jz(str2);
                    taVar.qn = znVarJz;
                    if (znVarJz != null) {
                        taVar.y |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    taVar.en = e(str2, str);
                    taVar.y |= 268435456;
                    return;
                case 79:
                    taVar.jz = dm(str2);
                    taVar.y |= 536870912;
                    return;
                case 80:
                    taVar.u = e(str2, str);
                    taVar.y |= 1073741824;
                    return;
                case 81:
                    if (!str2.equals("currentColor")) {
                        try {
                            taVar.y5 = u(str2);
                        } catch (i9 e5) {
                            Log.w("SVGParser", e5.getMessage());
                            return;
                        }
                        break;
                    } else {
                        taVar.y5 = fb.fb.n3();
                    }
                    taVar.y |= 2147483648L;
                    return;
                case 82:
                    taVar.xg = kp(str2);
                    taVar.y |= 4294967296L;
                    return;
                case 83:
                    if (!str2.equals("currentColor")) {
                        try {
                            taVar.dm = u(str2);
                        } catch (i9 e6) {
                            Log.w("SVGParser", e6.getMessage());
                            return;
                        }
                        break;
                    } else {
                        taVar.dm = fb.fb.n3();
                    }
                    taVar.y |= 8589934592L;
                    return;
                case 84:
                    taVar.ct = kp(str2);
                    taVar.y |= 17179869184L;
                    return;
                case 85:
                    fb.ta.c5 c5VarVp = vp(str2);
                    taVar.o4 = c5VarVp;
                    if (c5VarVp != null) {
                        taVar.y |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    fb.ta.v vVarY4 = y4(str2);
                    taVar.rs = vVarY4;
                    if (vVarY4 != null) {
                        taVar.y |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (i9 unused) {
        }
    }

    public static fb.ta.n3 nf(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return fb.ta.n3.fb;
            case "italic":
                return fb.ta.n3.v;
            case "normal":
                return fb.ta.n3.y;
            default:
                return null;
        }
    }

    public static fb.ta.gv o0(String str) {
        if ("miter".equals(str)) {
            return fb.ta.gv.y;
        }
        if ("round".equals(str)) {
            return fb.ta.gv.v;
        }
        if ("bevel".equals(str)) {
            return fb.ta.gv.fb;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static float o4(String str, int i, int i5) throws i9 {
        float fN3 = new gv().n3(str, i, i5);
        if (!Float.isNaN(fN3)) {
            return fN3;
        }
        throw new i9("Invalid float value: " + str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static fb.n3 oa(String str) throws i9 {
        c5 c5Var = new c5(str);
        c5Var.d0();
        float fWz = c5Var.wz();
        c5Var.c();
        float fWz2 = c5Var.wz();
        c5Var.c();
        float fWz3 = c5Var.wz();
        c5Var.c();
        float fWz4 = c5Var.wz();
        if (Float.isNaN(fWz) || Float.isNaN(fWz2) || Float.isNaN(fWz3) || Float.isNaN(fWz4)) {
            throw new i9("Invalid viewBox definition - should have four numbers");
        }
        if (fWz3 < 0.0f) {
            throw new i9("Invalid viewBox. width cannot be negative");
        }
        if (fWz4 >= 0.0f) {
            return new fb.n3(fWz, fWz2, fWz3, fWz4);
        }
        throw new i9("Invalid viewBox. height cannot be negative");
    }

    public static fb.w[] pq(String str) {
        fb.w wVarW;
        c5 c5Var = new c5(str);
        c5Var.d0();
        if (c5Var.s() || (wVarW = c5Var.w()) == null || wVarW.c5()) {
            return null;
        }
        float fN3 = wVarW.n3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVarW);
        while (!c5Var.s()) {
            c5Var.c();
            fb.w wVarW2 = c5Var.w();
            if (wVarW2 == null || wVarW2.c5()) {
                return null;
            }
            arrayList.add(wVarW2);
            fN3 += wVarW2.n3();
        }
        if (fN3 == 0.0f) {
            return null;
        }
        return (fb.w[]) arrayList.toArray(new fb.w[arrayList.size()]);
    }

    public static Set<String> pz(String str) {
        c5 c5Var = new c5(str);
        HashSet hashSet = new HashSet();
        while (!c5Var.s()) {
            hashSet.add(c5Var.mt());
            c5Var.d0();
        }
        return hashSet;
    }

    public static fb.ta.s qk(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return fb.ta.s.y;
        }
        if (str.equals("rtl")) {
            return fb.ta.s.v;
        }
        return null;
    }

    public static Integer ra(String str) {
        return v.y(str);
    }

    public static Boolean rb(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static void rs(fb.ta taVar, String str) {
        String strCo;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            c5 c5Var = new c5(str);
            Integer numY = null;
            fb.ta.n3 n3VarNf = null;
            String str2 = null;
            while (true) {
                strCo = c5Var.co('/');
                c5Var.d0();
                if (strCo != null) {
                    if (numY != null && n3VarNf != null) {
                        break;
                    }
                    if (!strCo.equals("normal") && (numY != null || (numY = v.y(strCo)) == null)) {
                        if (n3VarNf != null || (n3VarNf = nf(strCo)) == null) {
                            if (str2 != null || !strCo.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strCo;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            fb.w wVarLc = lc(strCo);
            if (c5Var.a('/')) {
                c5Var.d0();
                String strMt = c5Var.mt();
                if (strMt != null) {
                    try {
                        ap(strMt);
                    } catch (i9 unused) {
                        return;
                    }
                }
                c5Var.d0();
            }
            taVar.d0 = eb(c5Var.n());
            taVar.fh = wVarLc;
            taVar.f7686d = Integer.valueOf(numY == null ? 400 : numY.intValue());
            if (n3VarNf == null) {
                n3VarNf = fb.ta.n3.y;
            }
            taVar.f7687ej = n3VarNf;
            taVar.y |= 122880;
        }
    }

    public static Set<String> tg(String str) {
        c5 c5Var = new c5(str);
        HashSet hashSet = new HashSet();
        while (!c5Var.s()) {
            String strMt = c5Var.mt();
            if (strMt.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strMt.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            c5Var.d0();
        }
        return hashSet;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static fb.a u(String str) throws i9 {
        if (str.charAt(0) == '#') {
            zn znVarN3 = zn.n3(str, 1, str.length());
            if (znVarN3 == null) {
                throw new i9("Bad hex colour value: " + str);
            }
            int iY = znVarN3.y();
            if (iY == 4) {
                int iGv = znVarN3.gv();
                int i = iGv & 3840;
                int i5 = iGv & 240;
                int i8 = iGv & 15;
                return new fb.a(i8 | (i << 8) | (-16777216) | (i << 12) | (i5 << 8) | (i5 << 4) | (i8 << 4));
            }
            if (iY == 5) {
                int iGv2 = znVarN3.gv();
                int i10 = 61440 & iGv2;
                int i11 = iGv2 & 3840;
                int i12 = iGv2 & 240;
                int i13 = iGv2 & 15;
                return new fb.a((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
            }
            if (iY == 7) {
                return new fb.a(znVarN3.gv() | (-16777216));
            }
            if (iY == 9) {
                return new fb.a((znVarN3.gv() >>> 8) | (znVarN3.gv() << 24));
            }
            throw new i9("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return y5(lowerCase);
            }
            c5 c5Var = new c5(str.substring(zStartsWith2 ? 5 : 4));
            c5Var.d0();
            float fWz = c5Var.wz();
            float fGv = c5Var.gv(fWz);
            if (!Float.isNaN(fGv)) {
                c5Var.a('%');
            }
            float fGv2 = c5Var.gv(fGv);
            if (!Float.isNaN(fGv2)) {
                c5Var.a('%');
            }
            if (!zStartsWith2) {
                c5Var.d0();
                if (!Float.isNaN(fGv2) && c5Var.a(')')) {
                    return new fb.a(co(fWz, fGv, fGv2) | (-16777216));
                }
                throw new i9("Bad hsl() colour value: " + str);
            }
            float fGv3 = c5Var.gv(fGv2);
            c5Var.d0();
            if (!Float.isNaN(fGv3) && c5Var.a(')')) {
                return new fb.a((i9(fGv3 * 256.0f) << 24) | co(fWz, fGv, fGv2));
            }
            throw new i9("Bad hsla() colour value: " + str);
        }
        c5 c5Var2 = new c5(str.substring(zStartsWith ? 5 : 4));
        c5Var2.d0();
        float fWz2 = c5Var2.wz();
        if (!Float.isNaN(fWz2) && c5Var2.a('%')) {
            fWz2 = (fWz2 * 256.0f) / 100.0f;
        }
        float fGv4 = c5Var2.gv(fWz2);
        if (!Float.isNaN(fGv4) && c5Var2.a('%')) {
            fGv4 = (fGv4 * 256.0f) / 100.0f;
        }
        float fGv5 = c5Var2.gv(fGv4);
        if (!Float.isNaN(fGv5) && c5Var2.a('%')) {
            fGv5 = (fGv5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            c5Var2.d0();
            if (!Float.isNaN(fGv5) && c5Var2.a(')')) {
                return new fb.a((i9(fWz2) << 16) | (-16777216) | (i9(fGv4) << 8) | i9(fGv5));
            }
            throw new i9("Bad rgb() colour value: " + str);
        }
        float fGv6 = c5Var2.gv(fGv5);
        c5Var2.d0();
        if (!Float.isNaN(fGv6) && c5Var2.a(')')) {
            return new fb.a((i9(fGv6 * 256.0f) << 24) | (i9(fWz2) << 16) | (i9(fGv4) << 8) | i9(fGv5));
        }
        throw new i9("Bad rgba() colour value: " + str);
    }

    public static void u0(fb.hw hwVar, String str) throws i9 {
        hwVar.f7682xc = g(str);
    }

    public static fb.ta.c5 vp(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return fb.ta.c5.y;
        }
        if (str.equals("non-scaling-stroke")) {
            return fb.ta.c5.v;
        }
        return null;
    }

    public static Set<String> wf(String str) {
        c5 c5Var = new c5(str);
        HashSet hashSet = new HashSet();
        while (!c5Var.s()) {
            String strMt = c5Var.mt();
            int iIndexOf = strMt.indexOf(45);
            if (iIndexOf != -1) {
                strMt = strMt.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strMt, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).getLanguage());
            c5Var.d0();
        }
        return hashSet;
    }

    public static void xb(fb.b bVar, String str) {
        c5 c5Var = new c5(str.replaceAll("/\\*.*?\\*/", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING));
        while (true) {
            String strCo = c5Var.co(':');
            c5Var.d0();
            if (!c5Var.a(':')) {
                return;
            }
            c5Var.d0();
            String strR = c5Var.r(';');
            if (strR == null) {
                return;
            }
            c5Var.d0();
            if (c5Var.s() || c5Var.a(';')) {
                if (bVar.f7668a == null) {
                    bVar.f7668a = new fb.ta();
                }
                mp(bVar.f7668a, strCo, strR);
                c5Var.d0();
            }
        }
    }

    public static fb.vl xg(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return fb.a.fb;
        }
        if (str.equals("currentColor")) {
            return fb.fb.n3();
        }
        try {
            return u(str);
        } catch (i9 unused) {
            return null;
        }
    }

    public static fb.ta.v y4(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return fb.ta.v.v;
            case "auto":
                return fb.ta.v.y;
            case "optimizeSpeed":
                return fb.ta.v.fb;
            default:
                return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static fb.a y5(String str) throws i9 {
        Integer numY = zn.y(str);
        if (numY != null) {
            return new fb.a(numY.intValue());
        }
        throw new i9("Invalid colour keyword: " + str);
    }

    public static fb.w yc(c5 c5Var) {
        return c5Var.fb("auto") ? new fb.w(0.0f) : c5Var.w();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public static List<fb.w> yg(String str) throws i9 {
        if (str.length() == 0) {
            throw new i9("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        c5 c5Var = new c5(str);
        c5Var.d0();
        while (!c5Var.s()) {
            float fWz = c5Var.wz();
            if (Float.isNaN(fWz)) {
                throw new i9("Invalid length list value: " + c5Var.n3());
            }
            fb.xg xgVarX4 = c5Var.x4();
            if (xgVarX4 == null) {
                xgVarX4 = fb.xg.px;
            }
            arrayList.add(new fb.w(fWz, xgVarX4));
            c5Var.c();
        }
        return arrayList;
    }

    public static float z(float f3, float f4, float f5) {
        float f7;
        if (f5 < 0.0f) {
            f5 += 6.0f;
        }
        if (f5 >= 6.0f) {
            f5 -= 6.0f;
        }
        if (f5 < 1.0f) {
            f7 = (f4 - f3) * f5;
        } else {
            if (f5 < 3.0f) {
                return f4;
            }
            if (f5 >= 4.0f) {
                return f3;
            }
            f7 = (f4 - f3) * (4.0f - f5);
        }
        return f7 + f3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void a8(fb.mt mtVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    mtVar.mt = ap(strTrim);
                    break;
                case 27:
                    mtVar.co = ap(strTrim);
                    break;
                case 28:
                    fb.w wVarAp = ap(strTrim);
                    mtVar.z = wVarAp;
                    if (wVarAp.c5()) {
                        throw new i9("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    fb.w wVarAp2 = ap(strTrim);
                    mtVar.r = wVarAp2;
                    if (wVarAp2.c5()) {
                        throw new i9("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new i9("Invalid value for attribute markerUnits");
                        }
                        mtVar.p = true;
                    } else {
                        mtVar.p = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        mtVar.x4 = Float.valueOf(Float.NaN);
                    } else {
                        mtVar.x4 = Float.valueOf(ct(strTrim));
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void b(fb.x4 x4Var, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 8) {
                x4Var.xc = m(strTrim);
            } else if (i5 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(ct(strTrim));
                x4Var.w = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new i9("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final Map<String, String> bk(c5 c5Var) {
        HashMap map = new HashMap();
        c5Var.d0();
        String strCo = c5Var.co('=');
        while (strCo != null) {
            c5Var.a('=');
            map.put(strCo, c5Var.p());
            c5Var.d0();
            strCo = c5Var.co('=');
        }
        return map;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void br(Attributes attributes) throws i9 {
        t("<view>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.qn ctVar = new fb.ct();
        ctVar.y = this.y;
        ctVar.n3 = this.n3;
        mg(ctVar, attributes);
        rz(ctVar, attributes);
        f7(ctVar, attributes);
        this.n3.f(ctVar);
        this.n3 = ctVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void bv(Attributes attributes) throws i9 {
        t("<tspan>", new Object[0]);
        fb.a8 a8Var = this.n3;
        if (a8Var == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        if (!(a8Var instanceof fb.f7)) {
            throw new i9("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        fb.jz utVar = new fb.ut();
        utVar.y = this.y;
        utVar.n3 = this.n3;
        mg(utVar, attributes);
        o(utVar, attributes);
        rz(utVar, attributes);
        ut(utVar, attributes);
        this.n3.f(utVar);
        this.n3 = utVar;
        fb.u uVar = utVar.n3;
        if (uVar instanceof fb.u) {
            utVar.xc(uVar);
        } else {
            utVar.xc(((fb.k) uVar).v());
        }
    }

    public fb c(InputStream inputStream, boolean z) throws i9 {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            gq(inputStream, z);
            return this.y;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void c5(Attributes attributes) throws i9 {
        t("<circle>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz gvVar = new fb.gv();
        gvVar.y = this.y;
        gvVar.n3 = this.n3;
        mg(gvVar, attributes);
        o(gvVar, attributes);
        q9(gvVar, attributes);
        rz(gvVar, attributes);
        d0(gvVar, attributes);
        this.n3.f(gvVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void cs(Attributes attributes) throws i9 {
        t("<rect>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz fhVar = new fb.fh();
        fhVar.y = this.y;
        fhVar.n3 = this.n3;
        mg(fhVar, attributes);
        o(fhVar, attributes);
        q9(fhVar, attributes);
        rz(fhVar, attributes);
        hw(fhVar, attributes);
        this.n3.f(fhVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(r5.fb.i9 r5, org.xml.sax.Attributes r6) throws r5.i9 {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L90
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = r5.f.y.n3
            java.lang.String r3 = r6.getLocalName(r0)
            r5.f$fb r3 = r5.f.fb.y(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L72
            switch(r2) {
                case 32: goto L50;
                case 33: goto L49;
                case 34: goto L26;
                default: goto L25;
            }
        L25:
            goto L8c
        L26:
            r5.fb$f r2 = r5.fb.f.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L2d
            r5.f = r2     // Catch: java.lang.IllegalArgumentException -> L2d
            goto L8c
        L2d:
            r5.i9 r5 = new r5.i9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = "\" is not a valid value."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L49:
            android.graphics.Matrix r1 = r4.qj(r1)
            r5.i9 = r1
            goto L8c
        L50:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.c5 = r1
            goto L8c
        L5d:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6a
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r5.c5 = r1
            goto L8c
        L6a:
            r5.i9 r5 = new r5.i9
            java.lang.String r6 = "Invalid value for attribute gradientUnits"
            r5.<init>(r6)
            throw r5
        L72:
            java.lang.String r2 = ""
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8a
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r6.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8c
        L8a:
            r5.t = r1
        L8c:
            int r0 = r0 + 1
            goto L1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.d(r5.fb$i9, org.xml.sax.Attributes):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void d0(fb.gv gvVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case Code.UNIMPLEMENTED /* 12 */:
                    gvVar.xc = ap(strTrim);
                    break;
                case 13:
                    gvVar.w = ap(strTrim);
                    break;
                case 14:
                    fb.w wVarAp = ap(strTrim);
                    gvVar.p = wVarAp;
                    if (wVarAp.c5()) {
                        throw new i9("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void ej(fb.p pVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    pVar.xc = ap(strTrim);
                    break;
                case 16:
                    pVar.w = ap(strTrim);
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    pVar.p = ap(strTrim);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    pVar.mt = ap(strTrim);
                    break;
            }
        }
    }

    public final void en(String str) {
        this.y.y(new n3(n3.a.p, n3$r.Document).gv(str));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void f(Attributes attributes) throws i9 {
        t("<clipPath>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz vVar = new fb.v();
        vVar.y = this.y;
        vVar.n3 = this.n3;
        mg(vVar, attributes);
        o(vVar, attributes);
        q9(vVar, attributes);
        rz(vVar, attributes);
        fh(vVar, attributes);
        this.n3.f(vVar);
        this.n3 = vVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void f3(Attributes attributes) throws i9 {
        t("<marker>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.qn mtVar = new fb.mt();
        mtVar.y = this.y;
        mtVar.n3 = this.n3;
        mg(mtVar, attributes);
        o(mtVar, attributes);
        rz(mtVar, attributes);
        f7(mtVar, attributes);
        a8(mtVar, attributes);
        this.n3.f(mtVar);
        this.n3 = mtVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void f7(fb.qn qnVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 7) {
                u0(qnVar, strTrim);
            } else if (i5 == 87) {
                qnVar.w = oa(strTrim);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void fc(Attributes attributes) throws i9 {
        t("<use>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz dmVar = new fb.dm();
        dmVar.y = this.y;
        dmVar.n3 = this.n3;
        mg(dmVar, attributes);
        o(dmVar, attributes);
        q9(dmVar, attributes);
        rz(dmVar, attributes);
        k(dmVar, attributes);
        this.n3.f(dmVar);
        this.n3 = dmVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void fh(fb.v vVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (y.n3[fb.y(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    vVar.w = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new i9("Invalid value for attribute clipPathUnits");
                    }
                    vVar.w = Boolean.TRUE;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void gf(Attributes attributes) throws i9 {
        t("<tref>", new Object[0]);
        fb.a8 a8Var = this.n3;
        if (a8Var == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        if (!(a8Var instanceof fb.f7)) {
            throw new i9("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        fb.oz ozVar = new fb.oz();
        ozVar.y = this.y;
        ozVar.n3 = this.n3;
        mg(ozVar, attributes);
        o(ozVar, attributes);
        rz(ozVar, attributes);
        j(ozVar, attributes);
        this.n3.f(ozVar);
        fb.u uVar = ozVar.n3;
        if (uVar instanceof fb.u) {
            ozVar.xc(uVar);
        } else {
            ozVar.xc(((fb.k) uVar).v());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void gq(InputStream inputStream, boolean z) throws i9 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                i9 i9Var = new i9(this, xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        ix();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        c5 c5Var = new c5(xmlPullParserNewPullParser.getText());
                        mt(c5Var.mt(), bk(c5Var));
                    } else if (eventType == 10) {
                        if (z && this.y.c5() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                l(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        yk(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, i9Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        w(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        wm(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        ne(xmlPullParserNewPullParser.getText());
                    }
                }
                xc();
            } catch (IOException e4) {
                throw new i9("Stream error", e4);
            }
        } catch (XmlPullParserException e5) {
            throw new i9("XML parser problem", e5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void hw(fb.fh fhVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                fhVar.xc = ap(strTrim);
            } else if (i5 == 2) {
                fhVar.w = ap(strTrim);
            } else if (i5 == 3) {
                fb.w wVarAp = ap(strTrim);
                fhVar.p = wVarAp;
                if (wVarAp.c5()) {
                    throw new i9("Invalid <rect> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                fb.w wVarAp2 = ap(strTrim);
                fhVar.mt = wVarAp2;
                if (wVarAp2.c5()) {
                    throw new i9("Invalid <rect> element. height cannot be negative");
                }
            } else if (i5 == 10) {
                fb.w wVarAp3 = ap(strTrim);
                fhVar.co = wVarAp3;
                if (wVarAp3.c5()) {
                    throw new i9("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i5 != 11) {
                continue;
            } else {
                fb.w wVarAp4 = ap(strTrim);
                fhVar.z = wVarAp4;
                if (wVarAp4.c5()) {
                    throw new i9("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void i2(Attributes attributes) throws i9 {
        t("<stop>", new Object[0]);
        fb.a8 a8Var = this.n3;
        if (a8Var == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        if (!(a8Var instanceof fb.i9)) {
            throw new i9("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        fb.mg mgVar = new fb.mg();
        mgVar.y = this.y;
        mgVar.n3 = this.n3;
        mg(mgVar, attributes);
        o(mgVar, attributes);
        qn(mgVar, attributes);
        this.n3.f(mgVar);
        this.n3 = mgVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void i3(Attributes attributes) throws i9 {
        t("<style>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i5 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && n3.n3(str, n3.a.p)) {
            this.f7662s = true;
        } else {
            this.zn = true;
            this.f7661gv = 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void i4(Attributes attributes) throws i9 {
        t("<linearGradient>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.i9 k5Var = new fb.k5();
        k5Var.y = this.y;
        k5Var.n3 = this.n3;
        mg(k5Var, attributes);
        o(k5Var, attributes);
        d(k5Var, attributes);
        ud(k5Var, attributes);
        this.n3.f(k5Var);
        this.n3 = k5Var;
    }

    public final void ix() {
        this.y = new fb();
    }

    public final void j(fb.oz ozVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (y.n3[fb.y(attributes.getLocalName(i)).ordinal()] == 6 && (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                ozVar.xc = strTrim;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void j3(Attributes attributes) throws i9 {
        t("<symbol>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.qn jVar = new fb.j();
        jVar.y = this.y;
        jVar.n3 = this.n3;
        mg(jVar, attributes);
        o(jVar, attributes);
        rz(jVar, attributes);
        f7(jVar, attributes);
        this.n3.f(jVar);
        this.n3 = jVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void j5(fb.d dVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                dVar.f7674p = ap(strTrim);
            } else if (i5 == 2) {
                dVar.f7673mt = ap(strTrim);
            } else if (i5 == 3) {
                fb.w wVarAp = ap(strTrim);
                dVar.f7672co = wVarAp;
                if (wVarAp.c5()) {
                    throw new i9("Invalid <svg> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                fb.w wVarAp2 = ap(strTrim);
                dVar.z = wVarAp2;
                if (wVarAp2.c5()) {
                    throw new i9("Invalid <svg> element. height cannot be negative");
                }
            } else if (i5 == 5) {
                dVar.f7675r = strTrim;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void k(fb.dm dmVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                dmVar.p = ap(strTrim);
            } else if (i5 == 2) {
                dmVar.mt = ap(strTrim);
            } else if (i5 == 3) {
                fb.w wVarAp = ap(strTrim);
                dmVar.co = wVarAp;
                if (wVarAp.c5()) {
                    throw new i9("Invalid <use> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                fb.w wVarAp2 = ap(strTrim);
                dmVar.z = wVarAp2;
                if (wVarAp2.c5()) {
                    throw new i9("Invalid <use> element. height cannot be negative");
                }
            } else if (i5 == 6 && (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                dmVar.w = strTrim;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k5(r5.fb.n r6, org.xml.sax.Attributes r7) throws r5.i9 {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.k5(r5.fb$n, org.xml.sax.Attributes):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void l(InputStream inputStream) throws i9 {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            a aVar = new a(this, (y) null);
            xMLReader.setContentHandler(aVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", aVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e4) {
            throw new i9("Stream error", e4);
        } catch (ParserConfigurationException e5) {
            throw new i9("XML parser problem", e5);
        } catch (SAXException e6) {
            throw new i9("SVG parse error", e6);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void le(Attributes attributes) throws i9 {
        t("<radialGradient>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.i9 j5Var = new fb.j5();
        j5Var.y = this.y;
        j5Var.n3 = this.n3;
        mg(j5Var, attributes);
        o(j5Var, attributes);
        d(j5Var, attributes);
        vl(j5Var, attributes);
        this.n3.f(j5Var);
        this.n3 = j5Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void mg(fb.b bVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                bVar.zn = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    bVar.f7670gv = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        bVar.f7670gv = Boolean.TRUE;
                        return;
                    }
                    throw new i9("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void mt(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            fb.fb();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void n(Attributes attributes) throws i9 {
        t("<mask>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.co coVar = new fb.co();
        coVar.y = this.y;
        coVar.n3 = this.n3;
        mg(coVar, attributes);
        o(coVar, attributes);
        rz(coVar, attributes);
        x(coVar, attributes);
        this.n3.f(coVar);
        this.n3 = coVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void nd(Attributes attributes) throws i9 {
        t("<textPath>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.en enVar = new fb.en();
        enVar.y = this.y;
        enVar.n3 = this.n3;
        mg(enVar, attributes);
        o(enVar, attributes);
        rz(enVar, attributes);
        oz(enVar, attributes);
        this.n3.f(enVar);
        this.n3 = enVar;
        fb.u uVar = enVar.n3;
        if (uVar instanceof fb.u) {
            enVar.xc(uVar);
        } else {
            enVar.xc(((fb.k) uVar).v());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void ne(String str) throws i9 {
        if (this.zn) {
            return;
        }
        if (this.f7663v) {
            if (this.f7660fb == null) {
                this.f7660fb = new StringBuilder(str.length());
            }
            this.f7660fb.append(str);
        } else if (this.f7662s) {
            if (this.f7659c5 == null) {
                this.f7659c5 = new StringBuilder(str.length());
            }
            this.f7659c5.append(str);
        } else if (this.n3 instanceof fb.f7) {
            s(str);
        }
    }

    public final void o(fb.b bVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
                if (i5 == 45) {
                    xb(bVar, strTrim);
                } else if (i5 != 46) {
                    if (bVar.f7671v == null) {
                        bVar.f7671v = new fb.ta();
                    }
                    mp(bVar.f7671v, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    bVar.f7669fb = n3.a(strTrim);
                }
            }
        }
    }

    public final void oz(fb.en enVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 != 6) {
                if (i5 == 39) {
                    enVar.w = ap(strTrim);
                }
            } else if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                enVar.xc = strTrim;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void p(Attributes attributes) throws i9 {
        t("<g>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz tlVar = new fb.tl();
        tlVar.y = this.y;
        tlVar.n3 = this.n3;
        mg(tlVar, attributes);
        o(tlVar, attributes);
        q9(tlVar, attributes);
        rz(tlVar, attributes);
        this.n3.f(tlVar);
        this.n3 = tlVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void q(Attributes attributes) throws i9 {
        t("<text>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz q9Var = new fb.q9();
        q9Var.y = this.y;
        q9Var.n3 = this.n3;
        mg(q9Var, attributes);
        o(q9Var, attributes);
        q9(q9Var, attributes);
        rz(q9Var, attributes);
        ut(q9Var, attributes);
        this.n3.f(q9Var);
        this.n3 = q9Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void q5(Attributes attributes) throws i9 {
        t("<polyline>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz cVar = new fb.c();
        cVar.y = this.y;
        cVar.n3 = this.n3;
        mg(cVar, attributes);
        o(cVar, attributes);
        q9(cVar, attributes);
        rz(cVar, attributes);
        yt(cVar, attributes, "polyline");
        this.n3.f(cVar);
    }

    public final void q9(fb.wz wzVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (fb.y(attributes.getLocalName(i)) == fb.le) {
                wzVar.i9(qj(attributes.getValue(i)));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final Matrix qj(String str) throws i9 {
        Matrix matrix = new Matrix();
        c5 c5Var = new c5(str);
        c5Var.d0();
        while (!c5Var.s()) {
            String strXc = c5Var.xc();
            if (strXc == null) {
                throw new i9("Bad transform function encountered in transform list: " + str);
            }
            switch (strXc) {
                case "matrix":
                    c5Var.d0();
                    float fWz = c5Var.wz();
                    c5Var.c();
                    float fWz2 = c5Var.wz();
                    c5Var.c();
                    float fWz3 = c5Var.wz();
                    c5Var.c();
                    float fWz4 = c5Var.wz();
                    c5Var.c();
                    float fWz5 = c5Var.wz();
                    c5Var.c();
                    float fWz6 = c5Var.wz();
                    c5Var.d0();
                    if (Float.isNaN(fWz6) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fWz, fWz3, fWz5, fWz2, fWz4, fWz6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    c5Var.d0();
                    float fWz7 = c5Var.wz();
                    float fF3 = c5Var.f3();
                    float fF32 = c5Var.f3();
                    c5Var.d0();
                    if (Float.isNaN(fWz7) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fF3)) {
                        matrix.preRotate(fWz7);
                    } else {
                        if (Float.isNaN(fF32)) {
                            throw new i9("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fWz7, fF3, fF32);
                    }
                    break;
                    break;
                case "scale":
                    c5Var.d0();
                    float fWz8 = c5Var.wz();
                    float fF33 = c5Var.f3();
                    c5Var.d0();
                    if (Float.isNaN(fWz8) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fF33)) {
                        matrix.preScale(fWz8, fF33);
                    } else {
                        matrix.preScale(fWz8, fWz8);
                    }
                    break;
                    break;
                case "skewX":
                    c5Var.d0();
                    float fWz9 = c5Var.wz();
                    c5Var.d0();
                    if (Float.isNaN(fWz9) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fWz9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    c5Var.d0();
                    float fWz10 = c5Var.wz();
                    c5Var.d0();
                    if (Float.isNaN(fWz10) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fWz10)));
                    break;
                    break;
                case "translate":
                    c5Var.d0();
                    float fWz11 = c5Var.wz();
                    float fF34 = c5Var.f3();
                    c5Var.d0();
                    if (Float.isNaN(fWz11) || !c5Var.a(')')) {
                        throw new i9("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fF34)) {
                        matrix.preTranslate(fWz11, fF34);
                    } else {
                        matrix.preTranslate(fWz11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new i9("Invalid transform list fn: " + strXc + ")");
            }
            if (c5Var.s()) {
                return matrix;
            }
            c5Var.c();
        }
        return matrix;
    }

    public final void qn(fb.mg mgVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (y.n3[fb.y(attributes.getLocalName(i)).ordinal()] == 37) {
                mgVar.s = s8(strTrim);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void r(Attributes attributes) throws i9 {
        t("<image>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz xcVar = new fb.xc();
        xcVar.y = this.y;
        xcVar.n3 = this.n3;
        mg(xcVar, attributes);
        o(xcVar, attributes);
        q9(xcVar, attributes);
        rz(xcVar, attributes);
        z6(xcVar, attributes);
        this.n3.f(xcVar);
        this.n3 = xcVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void ro(Attributes attributes) throws i9 {
        t("<solidColor>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.rz rzVar = new fb.rz();
        rzVar.y = this.y;
        rzVar.n3 = this.n3;
        mg(rzVar, attributes);
        o(rzVar, attributes);
        this.n3.f(rzVar);
        this.n3 = rzVar;
    }

    public final void rz(fb.z6 z6Var, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    z6Var.a(tg(strTrim));
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    z6Var.c5(strTrim);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    z6Var.fb(wf(strTrim));
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    z6Var.s(pz(strTrim));
                    break;
                case 25:
                    List<String> listEb = eb(strTrim);
                    z6Var.gv(listEb != null ? new HashSet(listEb) : new HashSet(0));
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void s(String str) throws i9 {
        fb.ej ejVar = (fb.ej) this.n3;
        int size = ejVar.f7676c5.size();
        fb.yt ytVar = size == 0 ? null : ejVar.f7676c5.get(size - 1);
        if (!(ytVar instanceof fb.y5)) {
            this.n3.f(new fb.y5(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        fb.y5 y5Var = (fb.y5) ytVar;
        sb.append(y5Var.zn);
        sb.append(str);
        y5Var.zn = sb.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final Float s8(String str) throws i9 {
        if (str.length() == 0) {
            throw new i9("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float fO4 = o4(str, 0, length);
            float f3 = 100.0f;
            if (z) {
                fO4 /= 100.0f;
            }
            if (fO4 < 0.0f) {
                f3 = 0.0f;
            } else if (fO4 <= 100.0f) {
                f3 = fO4;
            }
            return Float.valueOf(f3);
        } catch (NumberFormatException e4) {
            throw new i9("Invalid offset value in <stop>: " + str, e4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void ta(fb.c5 c5Var, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    fb.w wVarAp = ap(strTrim);
                    c5Var.p = wVarAp;
                    if (wVarAp.c5()) {
                        throw new i9("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    fb.w wVarAp2 = ap(strTrim);
                    c5Var.mt = wVarAp2;
                    if (wVarAp2.c5()) {
                        throw new i9("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    c5Var.xc = ap(strTrim);
                    break;
                case 13:
                    c5Var.w = ap(strTrim);
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void tl(Attributes attributes) throws i9 {
        t("<defs>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz sVar = new fb.s();
        sVar.y = this.y;
        sVar.n3 = this.n3;
        mg(sVar, attributes);
        o(sVar, attributes);
        q9(sVar, attributes);
        this.n3.f(sVar);
        this.n3 = sVar;
    }

    public final void ud(fb.k5 k5Var, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (y.n3[fb.y(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    k5Var.tl = ap(strTrim);
                    break;
                case 16:
                    k5Var.wz = ap(strTrim);
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    k5Var.xc = ap(strTrim);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    k5Var.w = ap(strTrim);
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void uo(Attributes attributes) throws i9 {
        t("<switch>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz oVar = new fb.o();
        oVar.y = this.y;
        oVar.n3 = this.n3;
        mg(oVar, attributes);
        o(oVar, attributes);
        q9(oVar, attributes);
        rz(oVar, attributes);
        this.n3.f(oVar);
        this.n3 = oVar;
    }

    public final void ut(fb.jz jzVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                jzVar.xc = yg(strTrim);
            } else if (i5 == 2) {
                jzVar.w = yg(strTrim);
            } else if (i5 == 19) {
                jzVar.p = yg(strTrim);
            } else if (i5 == 20) {
                jzVar.mt = yg(strTrim);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(r5.fb.j5 r5, org.xml.sax.Attributes r6) throws r5.i9 {
        /*
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.getLength()
            if (r0 >= r1) goto L5e
            java.lang.String r1 = r6.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = r5.f.y.n3
            java.lang.String r3 = r6.getLocalName(r0)
            r5.f$fb r3 = r5.f.fb.y(r3)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 35
            if (r2 == r3) goto L55
            r3 = 36
            if (r2 == r3) goto L4e
            switch(r2) {
                case 12: goto L47;
                case 13: goto L40;
                case 14: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5b
        L2b:
            r5.fb$w r1 = ap(r1)
            r5.xc = r1
            boolean r1 = r1.c5()
            if (r1 != 0) goto L38
            goto L5b
        L38:
            r5.i9 r5 = new r5.i9
            java.lang.String r6 = "Invalid <radialGradient> element. r cannot be negative"
            r5.<init>(r6)
            throw r5
        L40:
            r5.fb$w r1 = ap(r1)
            r5.wz = r1
            goto L5b
        L47:
            r5.fb$w r1 = ap(r1)
            r5.tl = r1
            goto L5b
        L4e:
            r5.fb$w r1 = ap(r1)
            r5.p = r1
            goto L5b
        L55:
            r5.fb$w r1 = ap(r1)
            r5.w = r1
        L5b:
            int r0 = r0 + 1
            goto L1
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.f.vl(r5.fb$j5, org.xml.sax.Attributes):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void vn(Attributes attributes) throws i9 {
        t("<svg>", new Object[0]);
        fb.d dVar = new fb.d();
        dVar.y = this.y;
        dVar.n3 = this.n3;
        mg(dVar, attributes);
        o(dVar, attributes);
        rz(dVar, attributes);
        f7(dVar, attributes);
        j5(dVar, attributes);
        fb.a8 a8Var = this.n3;
        if (a8Var == null) {
            this.y.w(dVar);
        } else {
            a8Var.f(dVar);
        }
        this.n3 = dVar;
    }

    public final void w(String str, String str2, String str3) throws i9 {
        if (this.zn) {
            int i = this.f7661gv - 1;
            this.f7661gv = i;
            if (i == 0) {
                this.zn = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i5 = y.y[s.y(str2).ordinal()];
            if (i5 != 1 && i5 != 2 && i5 != 4 && i5 != 5 && i5 != 13 && i5 != 14) {
                switch (i5) {
                    case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f7663v = false;
                        StringBuilder sb = this.f7660fb;
                        if (sb != null) {
                            s sVar = this.f7658a;
                            if (sVar == s.ut) {
                                this.y.p(sb.toString());
                            } else if (sVar == s.t) {
                                this.y.xc(sb.toString());
                            }
                            this.f7660fb.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f7659c5;
                        if (sb2 != null) {
                            this.f7662s = false;
                            en(sb2.toString());
                            this.f7659c5.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.n3 = ((fb.yt) this.n3).n3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void w2(Attributes attributes) throws i9 {
        t("<pattern>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.qn nVar = new fb.n();
        nVar.y = this.y;
        nVar.n3 = this.n3;
        mg(nVar, attributes);
        o(nVar, attributes);
        rz(nVar, attributes);
        f7(nVar, attributes);
        k5(nVar, attributes);
        this.n3.f(nVar);
        this.n3 = nVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void w9(Attributes attributes) throws i9 {
        t("<path>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz x4Var = new fb.x4();
        x4Var.y = this.y;
        x4Var.n3 = this.n3;
        mg(x4Var, attributes);
        o(x4Var, attributes);
        q9(x4Var, attributes);
        rz(x4Var, attributes);
        b(x4Var, attributes);
        this.n3.f(x4Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void wm(char[] cArr, int i, int i5) throws i9 {
        if (this.zn) {
            return;
        }
        if (this.f7663v) {
            if (this.f7660fb == null) {
                this.f7660fb = new StringBuilder(i5);
            }
            this.f7660fb.append(cArr, i, i5);
        } else if (this.f7662s) {
            if (this.f7659c5 == null) {
                this.f7659c5 = new StringBuilder(i5);
            }
            this.f7659c5.append(cArr, i, i5);
        } else if (this.n3 instanceof fb.f7) {
            s(new String(cArr, i, i5));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void wz(Attributes attributes) throws i9 {
        t("<ellipse>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz c5Var = new fb.c5();
        c5Var.y = this.y;
        c5Var.n3 = this.n3;
        mg(c5Var, attributes);
        o(c5Var, attributes);
        q9(c5Var, attributes);
        rz(c5Var, attributes);
        ta(c5Var, attributes);
        this.n3.f(c5Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void x(fb.co coVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                coVar.p = ap(strTrim);
            } else if (i5 == 2) {
                coVar.mt = ap(strTrim);
            } else if (i5 == 3) {
                fb.w wVarAp = ap(strTrim);
                coVar.co = wVarAp;
                if (wVarAp.c5()) {
                    throw new i9("Invalid <mask> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                fb.w wVarAp2 = ap(strTrim);
                coVar.z = wVarAp2;
                if (wVarAp2.c5()) {
                    throw new i9("Invalid <mask> element. height cannot be negative");
                }
            } else if (i5 != 43) {
                if (i5 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    coVar.w = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new i9("Invalid value for attribute maskContentUnits");
                    }
                    coVar.w = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                coVar.xc = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new i9("Invalid value for attribute maskUnits");
                }
                coVar.xc = Boolean.TRUE;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void x4(Attributes attributes) throws i9 {
        t("<line>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz pVar = new fb.p();
        pVar.y = this.y;
        pVar.n3 = this.n3;
        mg(pVar, attributes);
        o(pVar, attributes);
        q9(pVar, attributes);
        rz(pVar, attributes);
        ej(pVar, attributes);
        this.n3.f(pVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void x5(Attributes attributes) throws i9 {
        t("<polygon>", new Object[0]);
        if (this.n3 == null) {
            throw new i9("Invalid document. Root element must be <svg>");
        }
        fb.wz d0Var = new fb.d0();
        d0Var.y = this.y;
        d0Var.n3 = this.n3;
        mg(d0Var, attributes);
        o(d0Var, attributes);
        q9(d0Var, attributes);
        rz(d0Var, attributes);
        yt(d0Var, attributes, "polygon");
        this.n3.f(d0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void yk(String str, String str2, String str3, Attributes attributes) throws i9 {
        if (this.zn) {
            this.f7661gv++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            s sVarY = s.y(str2);
            switch (y.y[sVarY.ordinal()]) {
                case 1:
                    vn(attributes);
                    break;
                case 2:
                case 3:
                    p(attributes);
                    break;
                case 4:
                    tl(attributes);
                    break;
                case 5:
                    fc(attributes);
                    break;
                case 6:
                    w9(attributes);
                    break;
                case 7:
                    cs(attributes);
                    break;
                case 8:
                    c5(attributes);
                    break;
                case 9:
                    wz(attributes);
                    break;
                case 10:
                    x4(attributes);
                    break;
                case 11:
                    q5(attributes);
                    break;
                case Code.UNIMPLEMENTED /* 12 */:
                    x5(attributes);
                    break;
                case 13:
                    q(attributes);
                    break;
                case 14:
                    bv(attributes);
                    break;
                case 15:
                    gf(attributes);
                    break;
                case 16:
                    uo(attributes);
                    break;
                case ConnectionResult.SIGN_IN_FAILED /* 17 */:
                    j3(attributes);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    f3(attributes);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i4(attributes);
                    break;
                case ConnectionResult.RESTRICTED_PROFILE /* 20 */:
                    le(attributes);
                    break;
                case 21:
                    i2(attributes);
                    break;
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND /* 22 */:
                case ConnectionResult.API_DISABLED /* 23 */:
                    this.f7663v = true;
                    this.f7658a = sVarY;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    f(attributes);
                    break;
                case 25:
                    nd(attributes);
                    break;
                case 26:
                    w2(attributes);
                    break;
                case 27:
                    r(attributes);
                    break;
                case 28:
                    br(attributes);
                    break;
                case 29:
                    n(attributes);
                    break;
                case 30:
                    i3(attributes);
                    break;
                case 31:
                    ro(attributes);
                    break;
                default:
                    this.zn = true;
                    this.f7661gv = 1;
                    break;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void yt(fb.c cVar, Attributes attributes, String str) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (fb.y(attributes.getLocalName(i)) == fb.yc) {
                c5 c5Var = new c5(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                c5Var.d0();
                while (!c5Var.s()) {
                    float fWz = c5Var.wz();
                    if (Float.isNaN(fWz)) {
                        throw new i9("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    c5Var.c();
                    float fWz2 = c5Var.wz();
                    if (Float.isNaN(fWz2)) {
                        throw new i9("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    c5Var.c();
                    arrayList.add(Float.valueOf(fWz));
                    arrayList.add(Float.valueOf(fWz2));
                }
                cVar.xc = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    cVar.xc[i5] = ((Float) it.next()).floatValue();
                    i5++;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: r5.i9 */
    public final void z6(fb.xc xcVar, Attributes attributes) throws i9 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i5 = y.n3[fb.y(attributes.getLocalName(i)).ordinal()];
            if (i5 == 1) {
                xcVar.p = ap(strTrim);
            } else if (i5 == 2) {
                xcVar.mt = ap(strTrim);
            } else if (i5 == 3) {
                fb.w wVarAp = ap(strTrim);
                xcVar.co = wVarAp;
                if (wVarAp.c5()) {
                    throw new i9("Invalid <use> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                fb.w wVarAp2 = ap(strTrim);
                xcVar.z = wVarAp2;
                if (wVarAp2.c5()) {
                    throw new i9("Invalid <use> element. height cannot be negative");
                }
            } else if (i5 != 6) {
                if (i5 == 7) {
                    u0(xcVar, strTrim);
                }
            } else if (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING.equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                xcVar.w = strTrim;
            }
        }
    }

    public final void xc() {
    }

    public final void t(String str, Object... objArr) {
    }
}

package e7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import e7.y;
import ft.g;
import ft.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import r0.z6;
import tn.t;
import tn.w;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public class n3 implements z6.y<e7.y> {
    public final XmlPullParserFactory y;

    public static class a extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<g> f3256a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public long f3257c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f3258f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f3259fb;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public String f3260i9;

        /* JADX INFO: renamed from: mt, reason: collision with root package name */
        public long f3261mt;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ArrayList<Long> f3262p;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f3263s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f3264t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        public int f3265tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final String f3266v;
        public String w;

        /* JADX INFO: renamed from: wz, reason: collision with root package name */
        public int f3267wz;

        /* JADX INFO: renamed from: xc, reason: collision with root package name */
        public int f3268xc;

        public a(y yVar, String str) {
            super(yVar, str, "StreamIndex");
            this.f3266v = str;
            this.f3256a = new LinkedList();
        }

        public final int co(XmlPullParser xmlPullParser) throws q {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new C0083n3("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw q.gv("Invalid key value[" + attributeValue + "]", null);
        }

        @Override // e7.n3.y
        public boolean gv(String str) {
            return "c".equals(str);
        }

        public final void mt(XmlPullParser xmlPullParser) throws q {
            int size = this.f3262p.size();
            long jI9 = i9(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (jI9 == -9223372036854775807L) {
                if (size == 0) {
                    jI9 = 0;
                } else {
                    if (this.f3261mt == -1) {
                        throw q.gv("Unable to infer start time", null);
                    }
                    jI9 = this.f3262p.get(size - 1).longValue() + this.f3261mt;
                }
            }
            this.f3262p.add(Long.valueOf(jI9));
            this.f3261mt = i9(xmlPullParser, "d", -9223372036854775807L);
            long jI92 = i9(xmlPullParser, "r", 1L);
            if (jI92 > 1 && this.f3261mt == -9223372036854775807L) {
                throw q.gv("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i;
                if (j >= jI92) {
                    return;
                }
                this.f3262p.add(Long.valueOf((this.f3261mt * j) + jI9));
                i++;
            }
        }

        @Override // e7.n3.y
        public Object n3() {
            g[] gVarArr = new g[this.f3256a.size()];
            this.f3256a.toArray(gVarArr);
            return new y.n3(this.f3266v, this.f3258f, this.f3259fb, this.f3263s, this.f3257c5, this.f3260i9, this.f3264t, this.f3265tl, this.f3267wz, this.f3268xc, this.w, gVarArr, this.f3262p, this.f3261mt);
        }

        public final void p(XmlPullParser xmlPullParser) throws q {
            int iCo = co(xmlPullParser);
            this.f3259fb = iCo;
            w("Type", Integer.valueOf(iCo));
            if (this.f3259fb == 3) {
                this.f3263s = tl(xmlPullParser, "Subtype");
            } else {
                this.f3263s = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            w("Subtype", this.f3263s);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Name");
            this.f3260i9 = attributeValue;
            w("Name", attributeValue);
            this.f3258f = tl(xmlPullParser, "Url");
            this.f3264t = c5(xmlPullParser, "MaxWidth", -1);
            this.f3265tl = c5(xmlPullParser, "MaxHeight", -1);
            this.f3267wz = c5(xmlPullParser, "DisplayWidth", -1);
            this.f3268xc = c5(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.w = attributeValue2;
            w("Language", attributeValue2);
            long jC5 = c5(xmlPullParser, "TimeScale", -1);
            this.f3257c5 = jC5;
            if (jC5 == -1) {
                this.f3257c5 = ((Long) zn("TimeScale")).longValue();
            }
            this.f3262p = new ArrayList<>();
        }

        @Override // e7.n3.y
        public void wz(XmlPullParser xmlPullParser) throws q {
            if ("c".equals(xmlPullParser.getName())) {
                mt(xmlPullParser);
            } else {
                p(xmlPullParser);
            }
        }

        @Override // e7.n3.y
        public void y(Object obj) {
            if (obj instanceof g) {
                this.f3256a.add((g) obj);
            }
        }
    }

    public static class gv extends y {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public g f3269v;

        public gv(y yVar, String str) {
            super(yVar, str, "QualityLevel");
        }

        @Nullable
        public static String mt(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        public static List<byte[]> p(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrA8 = ut.a8(str);
                byte[][] bArrI9 = v0.a.i9(bArrA8);
                if (bArrI9 == null) {
                    arrayList.add(bArrA8);
                } else {
                    Collections.addAll(arrayList, bArrI9);
                }
            }
            return arrayList;
        }

        @Override // e7.n3.y
        public Object n3() {
            return this.f3269v;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
        @Override // e7.n3.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void wz(org.xmlpull.v1.XmlPullParser r9) throws ft.q {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e7.n3.gv.wz(org.xmlpull.v1.XmlPullParser):void");
        }
    }

    /* JADX INFO: renamed from: e7.n3$n3, reason: collision with other inner class name */
    public static class C0083n3 extends q {
        public C0083n3(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    public static class v extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3270a;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public long f3271c5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3272f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f3273fb;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public long f3274i9;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f3275s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f3276t;

        /* JADX INFO: renamed from: tl, reason: collision with root package name */
        @Nullable
        public y.C0084y f3277tl;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final List<y.n3> f3278v;

        public v(y yVar, String str) {
            super(yVar, str, "SmoothStreamingMedia");
            this.f3272f = -1;
            this.f3277tl = null;
            this.f3278v = new LinkedList();
        }

        @Override // e7.n3.y
        public Object n3() {
            int size = this.f3278v.size();
            y.n3[] n3VarArr = new y.n3[size];
            this.f3278v.toArray(n3VarArr);
            if (this.f3277tl != null) {
                y.C0084y c0084y = this.f3277tl;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(c0084y.y, "video/mp4", c0084y.n3));
                for (int i = 0; i < size; i++) {
                    y.n3 n3Var = n3VarArr[i];
                    int i5 = n3Var.y;
                    if (i5 == 2 || i5 == 1) {
                        g[] gVarArr = n3Var.f3293i9;
                        for (int i8 = 0; i8 < gVarArr.length; i8++) {
                            gVarArr[i8] = gVarArr[i8].n3().vl(drmInitData).z6();
                        }
                    }
                }
            }
            return new e7.y(this.f3270a, this.f3273fb, this.f3275s, this.f3271c5, this.f3274i9, this.f3272f, this.f3276t, this.f3277tl, n3VarArr);
        }

        @Override // e7.n3.y
        public void wz(XmlPullParser xmlPullParser) throws q {
            this.f3270a = f(xmlPullParser, "MajorVersion");
            this.f3273fb = f(xmlPullParser, "MinorVersion");
            this.f3275s = i9(xmlPullParser, "TimeScale", 10000000L);
            this.f3271c5 = t(xmlPullParser, "Duration");
            this.f3274i9 = i9(xmlPullParser, "DVRWindowLength", 0L);
            this.f3272f = c5(xmlPullParser, "LookaheadCount", -1);
            this.f3276t = fb(xmlPullParser, "IsLive", false);
            w("TimeScale", Long.valueOf(this.f3275s));
        }

        @Override // e7.n3.y
        public void y(Object obj) {
            if (obj instanceof y.n3) {
                this.f3278v.add((y.n3) obj);
            } else if (obj instanceof y.C0084y) {
                v0.y.fb(this.f3277tl == null);
                this.f3277tl = (y.C0084y) obj;
            }
        }
    }

    public static class zn extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public UUID f3280a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public byte[] f3281fb;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f3282v;

        public zn(y yVar, String str) {
            super(yVar, str, "Protection");
        }

        public static String co(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        public static byte[] mt(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            z(bArrDecode, 0, 3);
            z(bArrDecode, 1, 2);
            z(bArrDecode, 4, 5);
            z(bArrDecode, 6, 7);
            return bArrDecode;
        }

        public static w[] p(byte[] bArr) {
            return new w[]{new w(true, null, 8, mt(bArr), 0, 0, null)};
        }

        public static void z(byte[] bArr, int i, int i5) {
            byte b4 = bArr[i];
            bArr[i] = bArr[i5];
            bArr[i5] = b4;
        }

        @Override // e7.n3.y
        public boolean gv(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // e7.n3.y
        public Object n3() {
            UUID uuid = this.f3280a;
            return new y.C0084y(uuid, t.y(uuid, this.f3281fb), p(this.f3281fb));
        }

        @Override // e7.n3.y
        public void s(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3282v = false;
            }
        }

        @Override // e7.n3.y
        public void wz(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f3282v = true;
                this.f3280a = UUID.fromString(co(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // e7.n3.y
        public void xc(XmlPullParser xmlPullParser) {
            if (this.f3282v) {
                this.f3281fb = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public n3() {
        try {
            this.y = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    @Override // r0.z6.y
    /* JADX INFO: renamed from: n3, reason: merged with bridge method [inline-methods] */
    public e7.y y(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.y.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (e7.y) new v(null, uri.toString()).a(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e4) {
            throw q.gv(null, e4);
        }
    }

    public static abstract class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final List<Pair<String, Object>> f3279gv = new LinkedList();
        public final String n3;
        public final String y;

        @Nullable
        public final y zn;

        public y(@Nullable y yVar, String str, String str2) {
            this.zn = yVar;
            this.y = str;
            this.n3 = str2;
        }

        public final Object a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.n3.equals(name)) {
                        wz(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (gv(name)) {
                            wz(xmlPullParser);
                        } else {
                            y yVarV = v(this, name, this.y);
                            if (yVarV == null) {
                                i = 1;
                            } else {
                                y(yVarV.a(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        xc(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    s(xmlPullParser);
                    if (!gv(name2)) {
                        return n3();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final int c5(XmlPullParser xmlPullParser, String str, int i) throws q {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e4) {
                throw q.gv(null, e4);
            }
        }

        public final int f(XmlPullParser xmlPullParser, String str) throws q {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0083n3(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e4) {
                throw q.gv(null, e4);
            }
        }

        public final boolean fb(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        public boolean gv(String str) {
            return false;
        }

        public final long i9(XmlPullParser xmlPullParser, String str, long j) throws q {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e4) {
                throw q.gv(null, e4);
            }
        }

        public abstract Object n3();

        public final long t(XmlPullParser xmlPullParser, String str) throws q {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0083n3(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e4) {
                throw q.gv(null, e4);
            }
        }

        public final String tl(XmlPullParser xmlPullParser, String str) throws C0083n3 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new C0083n3(str);
        }

        public final y v(y yVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new gv(yVar, str2);
            }
            if ("Protection".equals(str)) {
                return new zn(yVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new a(yVar, str2);
            }
            return null;
        }

        public final void w(String str, @Nullable Object obj) {
            this.f3279gv.add(Pair.create(str, obj));
        }

        public abstract void wz(XmlPullParser xmlPullParser) throws q;

        @Nullable
        public final Object zn(String str) {
            for (int i = 0; i < this.f3279gv.size(); i++) {
                Pair<String, Object> pair = this.f3279gv.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            y yVar = this.zn;
            if (yVar == null) {
                return null;
            }
            return yVar.zn(str);
        }

        public void s(XmlPullParser xmlPullParser) {
        }

        public void xc(XmlPullParser xmlPullParser) {
        }

        public void y(Object obj) {
        }
    }
}

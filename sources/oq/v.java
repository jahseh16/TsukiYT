package oq;

import androidx.annotation.Nullable;
import ft.q;
import java.io.IOException;
import java.io.StringReader;
import k4.r;
import oq.n3;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import v0.q9;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final String[] y = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] n3 = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] zn = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static r<n3.y> a(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        r.y yVarN = r.n();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (q9.a(xmlPullParser, str3)) {
                String strY = q9.y(xmlPullParser, str2 + ":Mime");
                String strY2 = q9.y(xmlPullParser, str2 + ":Semantic");
                String strY3 = q9.y(xmlPullParser, str2 + ":Length");
                String strY4 = q9.y(xmlPullParser, str2 + ":Padding");
                if (strY == null || strY2 == null) {
                    return r.yt();
                }
                yVarN.y(new n3.y(strY, strY2, strY3 != null ? Long.parseLong(strY3) : 0L, strY4 != null ? Long.parseLong(strY4) : 0L));
            }
        } while (!q9.gv(xmlPullParser, str4));
        return yVarN.f();
    }

    public static boolean gv(XmlPullParser xmlPullParser) {
        for (String str : y) {
            String strY = q9.y(xmlPullParser, str);
            if (strY != null) {
                return Integer.parseInt(strY) == 1;
            }
        }
        return false;
    }

    @Nullable
    public static n3 n3(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!q9.a(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw q.y("Couldn't find xmp metadata", null);
        }
        r<n3.y> rVarYt = r.yt();
        long jV = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (q9.a(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!gv(xmlPullParserNewPullParser)) {
                    return null;
                }
                jV = v(xmlPullParserNewPullParser);
                rVarYt = zn(xmlPullParserNewPullParser);
            } else if (q9.a(xmlPullParserNewPullParser, "Container:Directory")) {
                rVarYt = a(xmlPullParserNewPullParser, "Container", "Item");
            } else if (q9.a(xmlPullParserNewPullParser, "GContainer:Directory")) {
                rVarYt = a(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!q9.gv(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (rVarYt.isEmpty()) {
            return null;
        }
        return new n3(jV, rVarYt);
    }

    public static long v(XmlPullParser xmlPullParser) {
        for (String str : n3) {
            String strY = q9.y(xmlPullParser, str);
            if (strY != null) {
                long j = Long.parseLong(strY);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    @Nullable
    public static n3 y(String str) throws IOException {
        try {
            return n3(str);
        } catch (q | NumberFormatException | XmlPullParserException unused) {
            v0.r.c5("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static r<n3.y> zn(XmlPullParser xmlPullParser) {
        for (String str : zn) {
            String strY = q9.y(xmlPullParser, str);
            if (strY != null) {
                return r.oz(new n3.y("image/jpeg", "Primary", 0L, 0L), new n3.y("video/mp4", "MotionPhoto", Long.parseLong(strY), 0L));
            }
        }
        return r.yt();
    }
}

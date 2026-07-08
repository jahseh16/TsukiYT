package v0;

import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q9 {
    public static boolean a(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return v(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean fb(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return v(xmlPullParser) && s(xmlPullParser.getName()).equals(str);
    }

    public static boolean gv(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return zn(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    @Nullable
    public static String n3(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (s(xmlPullParser.getAttributeName(i)).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String s(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static boolean v(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    @Nullable
    public static String y(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean zn(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }
}

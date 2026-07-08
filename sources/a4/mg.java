package a4;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class mg {
    @Nullable
    public static final String n3(String str, XmlPullParser xmlPullParser, x xVar) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    @Nullable
    public static final k5 y(XmlPullParser xmlPullParser, x xVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String strN3 = n3("name", xmlPullParser, xVar);
                                    if (strN3 != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String strN32 = n3("key", xmlPullParser, xVar);
                                                                String strN33 = n3("split", xmlPullParser, xVar);
                                                                zn(xmlPullParser, xVar);
                                                                if (strN32 != null && strN33 != null) {
                                                                    xVar.y(strN3, strN32, strN33);
                                                                }
                                                            } else {
                                                                zn(xmlPullParser, xVar);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zn(xmlPullParser, xVar);
                                                }
                                            }
                                        }
                                    } else {
                                        zn(xmlPullParser, xVar);
                                    }
                                } else {
                                    zn(xmlPullParser, xVar);
                                }
                            }
                        }
                    } else {
                        zn(xmlPullParser, xVar);
                    }
                }
            } catch (IOException e4) {
                e = e4;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            } catch (IllegalStateException e5) {
                e = e5;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            } catch (XmlPullParserException e6) {
                e = e6;
                Log.e("SplitInstall", "Error while parsing splits.xml", e);
                return null;
            }
        }
        return xVar.n3();
    }

    public static final void zn(XmlPullParser xmlPullParser, x xVar) throws XmlPullParserException, IOException {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}

package v3;

import android.content.res.AssetManager;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z3.n3;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    @Nullable
    public XmlPullParser n3;
    public final n3 y;

    public z(n3 n3Var) {
        this.y = n3Var;
    }

    public final void n3(AssetManager assetManager, File file) throws IOException {
        this.n3 = assetManager.openXmlResourceParser(n3.zn(assetManager, file), "AndroidManifest.xml");
    }

    public final long y() throws XmlPullParserException, IOException {
        if (this.n3 == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        while (true) {
            int next = this.n3.next();
            if (next != 2) {
                if (next == 1) {
                    break;
                }
            } else if (this.n3.getName().equals("manifest")) {
                String attributeValue = this.n3.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.n3.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i) & 4294967295L);
                    } catch (NumberFormatException e4) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e4.getMessage()));
                    }
                } catch (NumberFormatException e5) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e5.getMessage()));
                }
            }
        }
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }
}

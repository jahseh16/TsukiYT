package ej;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R$styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class v {

    public interface n3 {
    }

    public static gv a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.w);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(R$styleable.n) ? R$styleable.n : R$styleable.f706mt, 400);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(R$styleable.f703i4) ? R$styleable.f703i4 : R$styleable.f696co, 0);
        int i5 = typedArrayObtainAttributes.hasValue(R$styleable.c) ? R$styleable.c : R$styleable.z;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(R$styleable.f3) ? R$styleable.f3 : R$styleable.f708r);
        int i8 = typedArrayObtainAttributes.getInt(i5, 0);
        int i10 = typedArrayObtainAttributes.hasValue(R$styleable.f717x4) ? R$styleable.f717x4 : R$styleable.f707p;
        int resourceId = typedArrayObtainAttributes.getResourceId(i10, 0);
        String string2 = typedArrayObtainAttributes.getString(i10);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            fb(xmlPullParser);
        }
        return new gv(string2, i, z, string, i8, resourceId);
    }

    public static void fb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    @Nullable
    public static n3 gv(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return v(xmlPullParser, resources);
        }
        fb(xmlPullParser);
        return null;
    }

    @Nullable
    public static n3 n3(@NonNull XmlPullParser xmlPullParser, @NonNull Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return gv(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<byte[]> s(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    @Nullable
    public static n3 v(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R$styleable.f709s);
        String string = typedArrayObtainAttributes.getString(R$styleable.f695c5);
        String string2 = typedArrayObtainAttributes.getString(R$styleable.f712tl);
        String string3 = typedArrayObtainAttributes.getString(R$styleable.f715wz);
        int resourceId = typedArrayObtainAttributes.getResourceId(R$styleable.f704i9, 0);
        int integer = typedArrayObtainAttributes.getInteger(R$styleable.f699f, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(R$styleable.f710t, 500);
        String string4 = typedArrayObtainAttributes.getString(R$styleable.f718xc);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                fb(xmlPullParser);
            }
            return new v(new vl.v(string, string2, string3, zn(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(a(xmlPullParser, resources));
                } else {
                    fb(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zn((gv[]) arrayList.toArray(new gv[0]));
    }

    public static int y(TypedArray typedArray, int i) {
        return y.y(typedArray, i);
    }

    @NonNull
    public static List<List<byte[]>> zn(@NonNull Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (y(typedArrayObtainTypedArray, 0) == 1) {
                for (int i5 = 0; i5 < typedArrayObtainTypedArray.length(); i5++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        arrayList.add(s(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(s(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }
}

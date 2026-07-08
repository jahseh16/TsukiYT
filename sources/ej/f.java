package ej;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static float a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i, float f3) {
        return !i9(xmlPullParser, str) ? f3 : typedArray.getFloat(i, f3);
    }

    @Nullable
    public static String c5(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i) {
        if (i9(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    @NonNull
    public static TypedArray f(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static int fb(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i, int i5) {
        return !i9(xmlPullParser, str) ? i5 : typedArray.getInt(i, i5);
    }

    @NonNull
    public static ColorStateList gv(@NonNull TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static boolean i9(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int n3(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i, int i5) {
        return !i9(xmlPullParser, str) ? i5 : typedArray.getColor(i, i5);
    }

    public static int s(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i, int i5) {
        return !i9(xmlPullParser, str) ? i5 : typedArray.getResourceId(i, i5);
    }

    @Nullable
    public static TypedValue t(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i) {
        if (i9(xmlPullParser, str)) {
            return typedArray.peekValue(i);
        }
        return null;
    }

    public static gv v(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, int i, int i5) {
        if (i9(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return gv.n3(typedValue.data);
            }
            gv gvVarFb = gv.fb(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (gvVarFb != null) {
                return gvVarFb;
            }
        }
        return gv.n3(i5);
    }

    public static boolean y(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, int i, boolean z) {
        return !i9(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    @Nullable
    public static ColorStateList zn(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, int i) {
        if (!i9(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i5 = typedValue.type;
        if (i5 != 2) {
            return (i5 < 28 || i5 > 31) ? zn.gv(typedArray.getResources(), typedArray.getResourceId(i, 0), theme) : gv(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
    }
}

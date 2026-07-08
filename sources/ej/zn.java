package ej;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R$attr;
import androidx.core.R$styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class zn {
    public static final ThreadLocal<TypedValue> y = new ThreadLocal<>();

    public static boolean a(@NonNull Resources resources, int i) {
        TypedValue typedValueZn = zn();
        resources.getValue(i, typedValueZn, true);
        int i5 = typedValueZn.type;
        return i5 >= 28 && i5 <= 31;
    }

    public static int fb(int i, float f3, float f4) {
        boolean z = f4 >= 0.0f && f4 <= 100.0f;
        if (f3 == 1.0f && !z) {
            return i;
        }
        int iN3 = b.y.n3((int) ((Color.alpha(i) * f3) + 0.5f), 0, 255);
        if (z) {
            y yVarZn = y.zn(i);
            i = y.tl(yVarZn.i9(), yVarZn.c5(), f4);
        }
        return (i & 16777215) | (iN3 << 24);
    }

    @Nullable
    public static ColorStateList gv(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) {
        try {
            return y(resources, resources.getXml(i), theme);
        } catch (Exception e4) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e4);
            return null;
        }
    }

    @NonNull
    public static ColorStateList n3(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return v(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList v(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrY = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayS = s(resources2, theme, attributeSet, R$styleable.n3);
                int resourceId = typedArrayS.getResourceId(R$styleable.zn, -1);
                if (resourceId == -1 || a(resources2, resourceId)) {
                    color = typedArrayS.getColor(R$styleable.zn, -65281);
                } else {
                    try {
                        color = y(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayS.getColor(R$styleable.zn, -65281);
                    }
                }
                float f3 = 1.0f;
                if (typedArrayS.hasValue(R$styleable.f701gv)) {
                    f3 = typedArrayS.getFloat(R$styleable.f701gv, 1.0f);
                } else if (typedArrayS.hasValue(R$styleable.f692a)) {
                    f3 = typedArrayS.getFloat(R$styleable.f692a, 1.0f);
                }
                float f4 = (Build.VERSION.SDK_INT < 31 || !typedArrayS.hasValue(R$styleable.f714v)) ? typedArrayS.getFloat(R$styleable.f700fb, -1.0f) : typedArrayS.getFloat(R$styleable.f714v, -1.0f);
                typedArrayS.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i8 = 0;
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R$attr.y && attributeNameResource != R$attr.n3) {
                        int i11 = i8 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i10, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i8] = attributeNameResource;
                        i8 = i11;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i8);
                iArrY = fb.y(iArrY, i5, fb(color, f3, f4));
                iArr = (int[][]) fb.n3(iArr, i5, iArrTrimStateSet);
                i5++;
            }
            i = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i5];
        int[][] iArr4 = new int[i5][];
        System.arraycopy(iArrY, 0, iArr3, 0, i5);
        System.arraycopy(iArr, 0, iArr4, 0, i5);
        return new ColorStateList(iArr4, iArr3);
    }

    @NonNull
    public static ColorStateList y(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return n3(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    @NonNull
    public static TypedValue zn() {
        ThreadLocal<TypedValue> threadLocal = y;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}

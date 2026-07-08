package ej;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.R$styleable;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Shader.TileMode gv(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static Shader n3(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayF = f.f(resources, theme, attributeSet, R$styleable.d0);
        float fA = f.a(typedArrayF, xmlPullParser, "startX", R$styleable.f693a8, 0.0f);
        float fA2 = f.a(typedArrayF, xmlPullParser, "startY", R$styleable.f716x, 0.0f);
        float fA3 = f.a(typedArrayF, xmlPullParser, "endX", R$styleable.f694b, 0.0f);
        float fA4 = f.a(typedArrayF, xmlPullParser, "endY", R$styleable.f705k5, 0.0f);
        float fA5 = f.a(typedArrayF, xmlPullParser, "centerX", R$styleable.f711ta, 0.0f);
        float fA6 = f.a(typedArrayF, xmlPullParser, "centerY", R$styleable.f697d, 0.0f);
        int iFb = f.fb(typedArrayF, xmlPullParser, "type", R$styleable.mg, 0);
        int iN3 = f.n3(typedArrayF, xmlPullParser, "startColor", R$styleable.fh, 0);
        boolean zI9 = f.i9(xmlPullParser, "centerColor");
        int iN32 = f.n3(typedArrayF, xmlPullParser, "centerColor", R$styleable.f713ud, 0);
        int iN33 = f.n3(typedArrayF, xmlPullParser, "endColor", R$styleable.rz, 0);
        int iFb2 = f.fb(typedArrayF, xmlPullParser, "tileMode", R$styleable.f698ej, 0);
        float fA7 = f.a(typedArrayF, xmlPullParser, "gradientRadius", R$styleable.f720z6, 0.0f);
        typedArrayF.recycle();
        y yVarY = y(zn(resources, xmlPullParser, attributeSet, theme), iN3, iN33, zI9, iN32);
        if (iFb != 1) {
            return iFb != 2 ? new LinearGradient(fA, fA2, fA3, fA4, yVarY.y, yVarY.n3, gv(iFb2)) : new SweepGradient(fA5, fA6, yVarY.y, yVarY.n3);
        }
        if (fA7 > 0.0f) {
            return new RadialGradient(fA5, fA6, fA7, yVarY.y, yVarY.n3, gv(iFb2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static y y(@Nullable y yVar, int i, int i5, boolean z, int i8) {
        return yVar != null ? yVar : z ? new y(i, i8, i5) : new y(i, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new ej.a.y(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ej.a.y zn(@androidx.annotation.NonNull android.content.res.Resources r8, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r9, @androidx.annotation.NonNull android.util.AttributeSet r10, @androidx.annotation.Nullable android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = androidx.core.R$styleable.f719yt
            android.content.res.TypedArray r3 = ej.f.f(r8, r11, r10, r3)
            int r5 = androidx.core.R$styleable.vl
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.R$styleable.f702hw
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = androidx.core.R$styleable.vl
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.R$styleable.f702hw
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            ej.a$y r8 = new ej.a$y
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.a.zn(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):ej.a$y");
    }

    public static final class y {
        public final float[] n3;
        public final int[] y;

        public y(@NonNull List<Integer> list, @NonNull List<Float> list2) {
            int size = list.size();
            this.y = new int[size];
            this.n3 = new float[size];
            for (int i = 0; i < size; i++) {
                this.y[i] = list.get(i).intValue();
                this.n3[i] = list2.get(i).floatValue();
            }
        }

        public y(int i, int i5) {
            this.y = new int[]{i, i5};
            this.n3 = new float[]{0.0f, 1.0f};
        }

        public y(int i, int i5, int i8) {
            this.y = new int[]{i, i5, i8};
            this.n3 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}

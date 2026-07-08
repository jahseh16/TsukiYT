package ej;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class gv {
    public final ColorStateList n3;
    public final Shader y;
    public int zn;

    public gv(Shader shader, ColorStateList colorStateList, int i) {
        this.y = shader;
        this.n3 = colorStateList;
        this.zn = i;
    }

    @Nullable
    public static gv fb(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) {
        try {
            return y(resources, i, theme);
        } catch (Exception e4) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
            return null;
        }
    }

    public static gv gv(@NonNull Shader shader) {
        return new gv(shader, null, 0);
    }

    public static gv n3(int i) {
        return new gv(null, null, i);
    }

    @NonNull
    public static gv y(@NonNull Resources resources, int i, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return gv(a.n3(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return zn(zn.n3(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static gv zn(@NonNull ColorStateList colorStateList) {
        return new gv(null, colorStateList, colorStateList.getDefaultColor());
    }

    @Nullable
    public Shader a() {
        return this.y;
    }

    public boolean c5() {
        ColorStateList colorStateList;
        return this.y == null && (colorStateList = this.n3) != null && colorStateList.isStateful();
    }

    public void f(int i) {
        this.zn = i;
    }

    public boolean i9(int[] iArr) {
        if (c5()) {
            ColorStateList colorStateList = this.n3;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.zn) {
                this.zn = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean s() {
        return this.y != null;
    }

    public boolean t() {
        return s() || this.zn != 0;
    }

    public int v() {
        return this.zn;
    }
}

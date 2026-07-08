package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.navigation.a;
import androidx.navigation.n3;
import androidx.navigation.t;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public final w n3;
    public final Context y;
    public static final y zn = new y(null);

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f928gv = new ThreadLocal<>();

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wz<?> y(TypedValue value, wz<?> wzVar, wz<?> expectedNavType, String str, String foundType) throws XmlPullParserException {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
            Intrinsics.checkNotNullParameter(foundType, "foundType");
            if (wzVar == null || wzVar == expectedNavType) {
                return wzVar == null ? expectedNavType : wzVar;
            }
            throw new XmlPullParserException("Type is " + str + " but found " + foundType + ": " + value.data);
        }

        public y() {
        }
    }

    public f(Context context, w navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.y = context;
        this.n3 = navigatorProvider;
    }

    public final void a(Resources resources, s sVar, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.f923tl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.f925wz);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        sVar.n3(string, gv(typedArrayObtainAttributes, resources, i));
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void fb(Resources resources, s sVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.f918mt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.f920r);
        String string2 = typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.f912co);
        String string3 = typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.z);
        if ((string == null || string.length() == 0) && ((string2 == null || string2.length() == 0) && (string3 == null || string3.length() == 0))) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        a.y yVar = new a.y();
        if (string != null) {
            String packageName = this.y.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            yVar.gv(StringsKt.replace$default(string, "${applicationId}", packageName, false, 4, (Object) null));
        }
        if (string2 != null && string2.length() != 0) {
            String packageName2 = this.y.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "context.packageName");
            yVar.n3(StringsKt.replace$default(string2, "${applicationId}", packageName2, false, 4, (Object) null));
        }
        if (string3 != null) {
            String packageName3 = this.y.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName3, "context.packageName");
            yVar.zn(StringsKt.replace$default(string3, "${applicationId}", packageName3, false, 4, (Object) null));
        }
        sVar.zn(yVar.y());
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final n3 gv(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        n3.y yVar = new n3.y();
        int i5 = 0;
        yVar.zn(typedArray.getBoolean(androidx.navigation.common.R$styleable.f919p, false));
        ThreadLocal<TypedValue> threadLocal = f928gv;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(androidx.navigation.common.R$styleable.w);
        Object objA = null;
        wz<Object> wzVarY = string != null ? wz.zn.y(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(androidx.navigation.common.R$styleable.f927xc, typedValue)) {
            wz<Object> wzVar = wz.f1011v;
            if (wzVarY == wzVar) {
                int i8 = typedValue.resourceId;
                if (i8 != 0) {
                    i5 = i8;
                } else if (typedValue.type != 16 || typedValue.data != 0) {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + wzVarY.n3() + ". Must be a reference to a resource.");
                }
                objA = Integer.valueOf(i5);
            } else {
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    if (wzVarY != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + wzVarY.n3() + ". You must use a \"" + wzVar.n3() + "\" type to reference other resources.");
                    }
                    objA = Integer.valueOf(i10);
                    wzVarY = wzVar;
                } else if (wzVarY == wz.f1010tl) {
                    objA = typedArray.getString(androidx.navigation.common.R$styleable.f927xc);
                } else {
                    int i11 = typedValue.type;
                    if (i11 == 3) {
                        String string2 = typedValue.string.toString();
                        if (wzVarY == null) {
                            wzVarY = wz.zn.n3(string2);
                        }
                        objA = wzVarY.a(string2);
                    } else if (i11 == 4) {
                        wzVarY = zn.y(typedValue, wzVarY, wz.f1003c5, string, "float");
                        objA = Float.valueOf(typedValue.getFloat());
                    } else if (i11 == 5) {
                        wzVarY = zn.y(typedValue, wzVarY, wz.f1006gv, string, "dimension");
                        objA = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i11 == 18) {
                        wzVarY = zn.y(typedValue, wzVarY, wz.f1004f, string, "boolean");
                        objA = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i11 < 16 || i11 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        wz<Object> wzVar2 = wz.f1003c5;
                        if (wzVarY == wzVar2) {
                            wzVarY = zn.y(typedValue, wzVarY, wzVar2, string, "float");
                            objA = Float.valueOf(typedValue.data);
                        } else {
                            wzVarY = zn.y(typedValue, wzVarY, wz.f1006gv, string, "integer");
                            objA = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objA != null) {
            yVar.n3(objA);
        }
        if (wzVarY != null) {
            yVar.gv(wzVarY);
        }
        return yVar.y();
    }

    @SuppressLint({"ResourceType"})
    public final c5 n3(int i) {
        int next;
        Resources res = this.y.getResources();
        XmlResourceParser xml = res.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i) + " line " + xml.getLineNumber(), e4);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        s sVarY = y(res, xml, attrs, i);
        if (sVarY instanceof c5) {
            return (c5) sVarY;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    public final void v(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.navigation.common.R$styleable.f923tl);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att… R.styleable.NavArgument)");
        String string = typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.f925wz);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        Intrinsics.checkNotNullExpressionValue(string, "array.getString(R.stylea…uments must have a name\")");
        n3 n3VarGv = gv(typedArrayObtainAttributes, resources, i);
        if (n3VarGv.n3()) {
            n3VarGv.gv(string, bundle);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final s y(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        w wVar = this.n3;
        String name = xmlResourceParser.getName();
        Intrinsics.checkNotNullExpressionValue(name, "parser.name");
        s sVarY = wVar.gv(name).y();
        sVarY.mt(this.y, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name2 = xmlResourceParser.getName();
                if (Intrinsics.areEqual("argument", name2)) {
                    a(resources, sVarY, attributeSet, i);
                } else if (Intrinsics.areEqual("deepLink", name2)) {
                    fb(resources, sVarY, attributeSet);
                } else if (Intrinsics.areEqual("action", name2)) {
                    zn(resources, sVarY, attributeSet, xmlResourceParser, i);
                } else if (Intrinsics.areEqual("include", name2) && (sVarY instanceof c5)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, R$styleable.f885c5);
                    Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                    ((c5) sVarY).n(n3(typedArrayObtainAttributes.getResourceId(R$styleable.f888i9, 0)));
                    Unit unit = Unit.INSTANCE;
                    typedArrayObtainAttributes.recycle();
                } else if (sVarY instanceof c5) {
                    ((c5) sVarY).n(y(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return sVarY;
    }

    public final void zn(Resources resources, s sVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        int depth;
        Context context = this.y;
        int[] NavAction = androidx.navigation.common.R$styleable.y;
        Intrinsics.checkNotNullExpressionValue(NavAction, "NavAction");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, NavAction, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.n3, 0);
        u0.gv gvVar = new u0.gv(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.zn, 0), null, null, 6, null);
        t.y yVar = new t.y();
        yVar.gv(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R$styleable.f910a, false));
        yVar.i9(typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R$styleable.f922t, false));
        yVar.fb(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.f911c5, -1), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R$styleable.f917i9, false), typedArrayObtainStyledAttributes.getBoolean(androidx.navigation.common.R$styleable.f913f, false));
        yVar.n3(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.f915gv, -1));
        yVar.zn(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.f924v, -1));
        yVar.v(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.f914fb, -1));
        yVar.a(typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.common.R$styleable.f921s, -1));
        gvVar.v(yVar.y());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && Intrinsics.areEqual("argument", xmlResourceParser.getName())) {
                v(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            gvVar.gv(bundle);
        }
        sVar.co(resourceId, gvVar);
        typedArrayObtainStyledAttributes.recycle();
    }
}

package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.a;
import androidx.navigation.fb;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public String f970co;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f971f;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public String f972fb;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f973p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f974s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x4.c5<u0.gv> f975t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c5 f976v;
    public Map<String, androidx.navigation.n3> w;
    public final String y;
    public static final y z = new y(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map<String, Class<?>> f969r = new LinkedHashMap();

    public static final class gv extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ Bundle $matchingArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gv(Bundle bundle) {
            super(1);
            this.$matchingArgs = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.$matchingArgs.containsKey(key));
        }
    }

    public static final class n3 implements Comparable<n3> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f977f;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public final boolean f978fb;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f979s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f980t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Bundle f981v;
        public final s y;

        public n3(s destination, Bundle bundle, boolean z, int i, boolean z5, int i5) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.y = destination;
            this.f981v = bundle;
            this.f978fb = z;
            this.f979s = i;
            this.f977f = z5;
            this.f980t = i5;
        }

        public final boolean gv(Bundle bundle) {
            Bundle bundle2;
            Object objY;
            if (bundle == null || (bundle2 = this.f981v) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                androidx.navigation.n3 n3Var = (androidx.navigation.n3) this.y.w.get(key);
                Object objY2 = null;
                wz<Object> wzVarY = n3Var != null ? n3Var.y() : null;
                if (wzVarY != null) {
                    Bundle bundle3 = this.f981v;
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objY = wzVarY.y(bundle3, key);
                } else {
                    objY = null;
                }
                if (wzVarY != null) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    objY2 = wzVarY.y(bundle, key);
                }
                if (!Intrinsics.areEqual(objY, objY2)) {
                    return false;
                }
            }
            return true;
        }

        public final s n3() {
            return this.y;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(n3 other) {
            Intrinsics.checkNotNullParameter(other, "other");
            boolean z = this.f978fb;
            if (z && !other.f978fb) {
                return 1;
            }
            if (!z && other.f978fb) {
                return -1;
            }
            int i = this.f979s - other.f979s;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = this.f981v;
            if (bundle != null && other.f981v == null) {
                return 1;
            }
            if (bundle == null && other.f981v != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f981v;
                Intrinsics.checkNotNull(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z5 = this.f977f;
            if (z5 && !other.f977f) {
                return 1;
            }
            if (z5 || !other.f977f) {
                return this.f980t - other.f980t;
            }
            return -1;
        }

        public final Bundle zn() {
            return this.f981v;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: androidx.navigation.s$y$y, reason: collision with other inner class name */
        public static final class C0024y extends Lambda implements Function1<s, s> {
            public static final C0024y y = new C0024y();

            public C0024y() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public final s invoke(s it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.t();
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String n3(Context context, int i) {
            String strValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            Intrinsics.checkNotNullExpressionValue(strValueOf, "try {\n                co….toString()\n            }");
            return strValueOf;
        }

        public final String y(String str) {
            if (str == null) {
                return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            }
            return "android-app://androidx.navigation/" + str;
        }

        public final Sequence<s> zn(s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            return SequencesKt.generateSequence(sVar, C0024y.y);
        }

        public y() {
        }
    }

    public static final class zn extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ a $navDeepLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zn(a aVar) {
            super(1);
            this.$navDeepLink = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return Boolean.valueOf(!this.$navDeepLink.i9().contains(key));
        }
    }

    public s(String navigatorName) {
        Intrinsics.checkNotNullParameter(navigatorName, "navigatorName");
        this.y = navigatorName;
        this.f971f = new ArrayList();
        this.f975t = new x4.c5<>();
        this.w = new LinkedHashMap();
    }

    public static /* synthetic */ int[] fb(s sVar, s sVar2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i & 1) != 0) {
            sVar2 = null;
        }
        return sVar.a(sVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] a(androidx.navigation.s r6) {
        /*
            r5 = this;
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r5
        L6:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.navigation.c5 r2 = r1.f976v
            if (r6 == 0) goto L10
            androidx.navigation.c5 r3 = r6.f976v
            goto L11
        L10:
            r3 = 0
        L11:
            if (r3 == 0) goto L24
            androidx.navigation.c5 r3 = r6.f976v
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r4 = r1.f973p
            androidx.navigation.s r3 = r3.c(r4)
            if (r3 != r1) goto L24
            r0.addFirst(r1)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            int r3 = r2.d()
            int r4 = r1.f973p
            if (r3 == r4) goto L31
        L2e:
            r0.addFirst(r1)
        L31:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r6)
            if (r1 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            androidx.navigation.s r1 = (androidx.navigation.s) r1
            int r1 = r1.f973p
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L4f
        L65:
            int[] r6 = kotlin.collections.CollectionsKt.toIntArray(r0)
            return r6
        L6a:
            r1 = r2
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.s.a(androidx.navigation.s):int[]");
    }

    public String c5() {
        String str = this.f972fb;
        return str == null ? String.valueOf(this.f973p) : str;
    }

    public final void co(int i, u0.gv action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (i4()) {
            if (i == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.f975t.tl(i, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public boolean equals(Object obj) {
        boolean z5;
        boolean z7;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        boolean zAreEqual = Intrinsics.areEqual(this.f971f, sVar.f971f);
        if (this.f975t.w() != sVar.f975t.w()) {
            z5 = false;
            break;
        }
        Iterator it = SequencesKt.asSequence(x4.i9.y(this.f975t)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!Intrinsics.areEqual(this.f975t.fb(iIntValue), sVar.f975t.fb(iIntValue))) {
                z5 = false;
                break;
            }
        }
        z5 = true;
        if (this.w.size() != sVar.w.size()) {
            z7 = false;
            break;
        }
        for (Map.Entry entry : MapsKt.asSequence(this.w)) {
            if (!sVar.w.containsKey(entry.getKey()) || !Intrinsics.areEqual(sVar.w.get(entry.getKey()), entry.getValue())) {
                z7 = false;
                break;
            }
        }
        z7 = true;
        return this.f973p == sVar.f973p && Intrinsics.areEqual(this.f970co, sVar.f970co) && zAreEqual && z5 && z7;
    }

    public final String f() {
        return this.y;
    }

    public final void gv(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        zn(new a.y().gv(uriPattern).y());
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.f973p * 31;
        String str = this.f970co;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (a aVar : this.f971f) {
            int i5 = iHashCode * 31;
            String strN = aVar.n();
            int iHashCode2 = (i5 + (strN != null ? strN.hashCode() : 0)) * 31;
            String strC5 = aVar.c5();
            int iHashCode3 = (iHashCode2 + (strC5 != null ? strC5.hashCode() : 0)) * 31;
            String strZ = aVar.z();
            iHashCode = iHashCode3 + (strZ != null ? strZ.hashCode() : 0);
        }
        Iterator itN3 = x4.i9.n3(this.f975t);
        while (itN3.hasNext()) {
            u0.gv gvVar = (u0.gv) itN3.next();
            int iN3 = ((iHashCode * 31) + gvVar.n3()) * 31;
            t tVarZn = gvVar.zn();
            iHashCode = iN3 + (tVarZn != null ? tVarZn.hashCode() : 0);
            Bundle bundleY = gvVar.y();
            if (bundleY != null && (setKeySet = bundleY.keySet()) != null) {
                Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i8 = iHashCode * 31;
                    Bundle bundleY2 = gvVar.y();
                    Intrinsics.checkNotNull(bundleY2);
                    Object obj = bundleY2.get(str2);
                    iHashCode = i8 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.w.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            androidx.navigation.n3 n3Var = this.w.get(str3);
            iHashCode = iHashCode4 + (n3Var != null ? n3Var.hashCode() : 0);
        }
        return iHashCode;
    }

    public boolean i4() {
        return true;
    }

    public final int i9() {
        return this.f973p;
    }

    public void mt(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R$styleable.f3);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        x4(typedArrayObtainAttributes.getString(androidx.navigation.common.R$styleable.d0));
        if (typedArrayObtainAttributes.hasValue(androidx.navigation.common.R$styleable.c)) {
            z(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R$styleable.c, 0));
            this.f972fb = z.n3(context, this.f973p);
        }
        this.f974s = typedArrayObtainAttributes.getText(androidx.navigation.common.R$styleable.n);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    public final void n3(String argumentName, androidx.navigation.n3 argument) {
        Intrinsics.checkNotNullParameter(argumentName, "argumentName");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.w.put(argumentName, argument);
    }

    public final n3 p(String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        fb.y.C0021y c0021y = fb.y.f929gv;
        Uri uri = Uri.parse(z.y(route));
        Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
        fb fbVarY = c0021y.y(uri).y();
        return this instanceof c5 ? ((c5) this).ud(fbVarY) : w(fbVarY);
    }

    public final void r(c5 c5Var) {
        this.f976v = c5Var;
    }

    public final u0.gv s(int i) {
        u0.gv gvVarFb = this.f975t.f() ? null : this.f975t.fb(i);
        if (gvVarFb != null) {
            return gvVarFb;
        }
        c5 c5Var = this.f976v;
        if (c5Var != null) {
            return c5Var.s(i);
        }
        return null;
    }

    public final c5 t() {
        return this.f976v;
    }

    public final String tl() {
        return this.f970co;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f972fb;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f973p));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f970co;
        if (str2 != null && !StringsKt.isBlank(str2)) {
            sb.append(" route=");
            sb.append(this.f970co);
        }
        if (this.f974s != null) {
            sb.append(" label=");
            sb.append(this.f974s);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final Bundle v(Bundle bundle) {
        Map<String, androidx.navigation.n3> map;
        if (bundle == null && ((map = this.w) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, androidx.navigation.n3> entry : this.w.entrySet()) {
            entry.getValue().gv(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, androidx.navigation.n3> entry2 : this.w.entrySet()) {
                String key = entry2.getKey();
                androidx.navigation.n3 value = entry2.getValue();
                if (!value.v(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.y().n3() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    public n3 w(fb navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f971f.isEmpty()) {
            return null;
        }
        n3 n3Var = null;
        for (a aVar : this.f971f) {
            Uri uriZn = navDeepLinkRequest.zn();
            Bundle bundleXc = uriZn != null ? aVar.xc(uriZn, this.w) : null;
            int iS = aVar.s(uriZn);
            String strY = navDeepLinkRequest.y();
            boolean z5 = strY != null && Intrinsics.areEqual(strY, aVar.c5());
            String strN3 = navDeepLinkRequest.n3();
            int iR = strN3 != null ? aVar.r(strN3) : -1;
            if (bundleXc == null) {
                if (z5 || iR > -1) {
                    if (wz(aVar, uriZn, this.w)) {
                    }
                }
            }
            n3 n3Var2 = new n3(this, bundleXc, aVar.c(), iS, z5, iR);
            if (n3Var == null || n3Var2.compareTo(n3Var) > 0) {
                n3Var = n3Var2;
            }
        }
        return n3Var;
    }

    public final boolean wz(a aVar, Uri uri, Map<String, androidx.navigation.n3> map) {
        return u0.s.y(map, new gv(aVar.w(uri, map))).isEmpty();
    }

    public final void x4(String str) {
        Object next;
        if (str == null) {
            z(0);
        } else {
            if (StringsKt.isBlank(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strY = z.y(str);
            z(strY.hashCode());
            gv(strY);
        }
        List<a> list = this.f971f;
        List<a> list2 = list;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((a) next).n(), z.y(this.f970co))) {
                    break;
                }
            }
        }
        TypeIntrinsics.asMutableCollection(list2).remove(next);
        this.f970co = str;
    }

    public final boolean xc(String route, Bundle bundle) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (Intrinsics.areEqual(this.f970co, route)) {
            return true;
        }
        n3 n3VarP = p(route);
        if (Intrinsics.areEqual(this, n3VarP != null ? n3VarP.n3() : null)) {
            return n3VarP.gv(bundle);
        }
        return false;
    }

    public final void z(int i) {
        this.f973p = i;
        this.f972fb = null;
    }

    public final void zn(a navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<String> listY = u0.s.y(this.w, new zn(navDeepLink));
        if (listY.isEmpty()) {
            this.f971f.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.n() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listY).toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(xc<? extends s> navigator) {
        this(w.n3.y(navigator.getClass()));
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}

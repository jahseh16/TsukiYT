package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public boolean f895c5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f896f;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final Lazy f899i9;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f900s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f901t;

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public final Lazy f902tl;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f903v;
    public boolean w;

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public String f904wz;

    /* JADX INFO: renamed from: xc, reason: collision with root package name */
    public final Lazy f905xc;
    public final String y;
    public final String zn;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final n3 f893p = new n3(null);

    /* JADX INFO: renamed from: mt, reason: collision with root package name */
    public static final Pattern f892mt = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static final Pattern f891co = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final List<String> f898gv = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f894a = LazyKt.lazy(new t());

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final Lazy f897fb = LazyKt.lazy(new i9());

    /* JADX INFO: renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    public static final class C0018a extends Lambda implements Function0<Pair<? extends List<String>, ? extends String>> {
        public C0018a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Pair<List<String>, String> invoke() {
            return a.this.mg();
        }
    }

    public static final class c5 extends Lambda implements Function1<String, Boolean> {
        final /* synthetic */ Bundle $bundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c5(Bundle bundle) {
            super(1);
            this.$bundle = bundle;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            Intrinsics.checkNotNullParameter(argName, "argName");
            return Boolean.valueOf(!this.$bundle.containsKey(argName));
        }
    }

    public static final class f extends Lambda implements Function0<Pattern> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = a.this.f904wz;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    public static final class fb extends Lambda implements Function0<Pattern> {
        public fb() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strWz = a.this.wz();
            if (strWz != null) {
                return Pattern.compile(strWz, 2);
            }
            return null;
        }
    }

    public static final class gv {
        public final List<String> n3 = new ArrayList();
        public String y;

        public final void gv(String str) {
            this.y = str;
        }

        public final List<String> n3() {
            return this.n3;
        }

        public final void y(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.n3.add(name);
        }

        public final String zn() {
            return this.y;
        }
    }

    public static final class i9 extends Lambda implements Function0<Boolean> {
        public i9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((a.this.n() == null || Uri.parse(a.this.n()).getQuery() == null) ? false : true);
        }
    }

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public n3() {
        }
    }

    public static final class s extends Lambda implements Function0<String> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Pair pairT = a.this.t();
            if (pairT != null) {
                return (String) pairT.getSecond();
            }
            return null;
        }
    }

    public static final class t extends Lambda implements Function0<Pattern> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = a.this.f903v;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    public static final class tl extends Lambda implements Function0<Map<String, gv>> {
        public tl() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final Map<String, gv> invoke() {
            return a.this.ej();
        }
    }

    public static final class v extends Lambda implements Function0<List<String>> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke() {
            List<String> list;
            Pair pairT = a.this.t();
            return (pairT == null || (list = (List) pairT.getFirst()) == null) ? new ArrayList() : list;
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public static final C0019y f906gv = new C0019y(null);
        public String n3;
        public String y;
        public String zn;

        /* JADX INFO: renamed from: androidx.navigation.a$y$y, reason: collision with other inner class name */
        public static final class C0019y {
            public /* synthetic */ C0019y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C0019y() {
            }
        }

        public final y gv(String uriPattern) {
            Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
            this.y = uriPattern;
            return this;
        }

        public final y n3(String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.n3 = action;
            return this;
        }

        public final a y() {
            return new a(this.y, this.n3, this.zn);
        }

        public final y zn(String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.zn = mimeType;
            return this;
        }
    }

    public static final class zn implements Comparable<zn> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public String f907v;
        public String y;

        public zn(String mimeType) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            List<String> listSplit = new Regex("/").split(mimeType, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listEmptyList = CollectionsKt.emptyList();
            }
            this.y = (String) listEmptyList.get(0);
            this.f907v = (String) listEmptyList.get(1);
        }

        public final String n3() {
            return this.f907v;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(zn other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int i = Intrinsics.areEqual(this.y, other.y) ? 2 : 0;
            return Intrinsics.areEqual(this.f907v, other.f907v) ? i + 1 : i;
        }

        public final String zn() {
            return this.y;
        }
    }

    public a(String str, String str2, String str3) {
        this.y = str;
        this.n3 = str2;
        this.zn = str3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f900s = LazyKt.lazy(lazyThreadSafetyMode, new tl());
        this.f899i9 = LazyKt.lazy(lazyThreadSafetyMode, new C0018a());
        this.f896f = LazyKt.lazy(lazyThreadSafetyMode, new v());
        this.f901t = LazyKt.lazy(lazyThreadSafetyMode, new s());
        this.f902tl = LazyKt.lazy(new fb());
        this.f905xc = LazyKt.lazy(new f());
        z6();
        d();
    }

    public final boolean c() {
        return this.w;
    }

    public final String c5() {
        return this.n3;
    }

    public final void co(String str, Bundle bundle, Map<String, androidx.navigation.n3> map) {
        Pattern patternTl = tl();
        Matcher matcher = patternTl != null ? patternTl.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> listF = f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listF, 10));
            int i = 0;
            for (Object obj : listF) {
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i5));
                androidx.navigation.n3 n3Var = map.get(str2);
                try {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    if (fh(bundle, str2, value, n3Var)) {
                        return;
                    }
                    arrayList.add(Unit.INSTANCE);
                    i = i5;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    public final void d() {
        if (this.zn == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.zn).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.zn + " does not match to required \"type/subtype\" format").toString());
        }
        zn znVar = new zn(this.zn);
        this.f904wz = StringsKt.replace$default("^(" + znVar.zn() + "|[*]+)/(" + znVar.n3() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, (Object) null);
    }

    public final boolean d0() {
        return ((Boolean) this.f897fb.getValue()).booleanValue();
    }

    public final Map<String, gv> ej() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!d0()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.y);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.y + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            Intrinsics.checkNotNullExpressionValue(queryParams, "queryParams");
            String queryParam = (String) CollectionsKt.firstOrNull((List) queryParams);
            if (queryParam == null) {
                this.f895c5 = true;
                queryParam = paramName;
            }
            Matcher matcher = f891co.matcher(queryParam);
            gv gvVar = new gv();
            int iEnd = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
                gvVar.y(strGroup);
                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
                sb.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb.append(Pattern.quote(strSubstring2));
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "argRegex.toString()");
            gvVar.gv(StringsKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(paramName, "paramName");
            linkedHashMap.put(paramName, gvVar);
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.y, aVar.y) && Intrinsics.areEqual(this.n3, aVar.n3) && Intrinsics.areEqual(this.zn, aVar.zn);
    }

    public final List<String> f() {
        return (List) this.f896f.getValue();
    }

    public final Map<String, gv> f3() {
        return (Map) this.f900s.getValue();
    }

    public final void fb(String str, List<String> list, StringBuilder sb) {
        Matcher matcher = f891co.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNull(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public final boolean fh(Bundle bundle, String str, String str2, androidx.navigation.n3 n3Var) {
        if (n3Var != null) {
            n3Var.y().gv(bundle, str, str2);
            return false;
        }
        bundle.putString(str, str2);
        return false;
    }

    public int hashCode() {
        String str = this.y;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.n3;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zn;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Pattern i4() {
        return (Pattern) this.f894a.getValue();
    }

    public final List<String> i9() {
        List<String> list = this.f898gv;
        Collection<gv> collectionValues = f3().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((gv) it.next()).n3());
        }
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) list, (Iterable) arrayList), (Iterable) f());
    }

    public final Pair<List<String>, String> mg() {
        String str = this.y;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.y).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        fb(fragment, arrayList, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
        return TuplesKt.to(arrayList, string);
    }

    public final boolean mt(Uri uri, Bundle bundle, Map<String, androidx.navigation.n3> map) {
        String query;
        for (Map.Entry<String, gv> entry : f3().entrySet()) {
            String key = entry.getKey();
            gv value = entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(key);
            if (this.f895c5 && (query = uri.getQuery()) != null && !Intrinsics.areEqual(query, uri.toString())) {
                queryParameters = CollectionsKt.listOf(query);
            }
            if (!ta(queryParameters, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    public final String n() {
        return this.y;
    }

    public final boolean p(Matcher matcher, Bundle bundle, Map<String, androidx.navigation.n3> map) {
        List<String> list = this.f898gv;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i5));
            androidx.navigation.n3 n3Var = map.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                if (fh(bundle, str, value, n3Var)) {
                    return false;
                }
                arrayList.add(Unit.INSTANCE);
                i = i5;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final int r(String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        if (this.zn != null) {
            Pattern patternX4 = x4();
            Intrinsics.checkNotNull(patternX4);
            if (patternX4.matcher(mimeType).matches()) {
                return new zn(this.zn).compareTo(new zn(mimeType));
            }
        }
        return -1;
    }

    public final boolean rz(Bundle bundle, String str, String str2, androidx.navigation.n3 n3Var) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (n3Var == null) {
            return false;
        }
        wz<Object> wzVarY = n3Var.y();
        wzVarY.v(bundle, str, str2, wzVarY.y(bundle, str));
        return false;
    }

    public final int s(Uri uri) {
        if (uri == null || this.y == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.y).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(requestedPathSegments, "requestedPathSegments");
        Intrinsics.checkNotNullExpressionValue(uriPathSegments, "uriPathSegments");
        return CollectionsKt.intersect(requestedPathSegments, uriPathSegments).size();
    }

    public final Pair<List<String>, String> t() {
        return (Pair) this.f899i9.getValue();
    }

    public final boolean ta(List<String> list, gv gvVar, Bundle bundle, Map<String, androidx.navigation.n3> map) {
        if (list == null) {
            return true;
        }
        for (String str : list) {
            String strZn = gvVar.zn();
            Matcher matcher = strZn != null ? Pattern.compile(strZn, 32).matcher(str) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            Bundle bundle2 = new Bundle();
            try {
                List<String> listN3 = gvVar.n3();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN3, 10));
                int i = 0;
                for (Object obj : listN3) {
                    int i5 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str2 = (String) obj;
                    String strGroup = matcher.group(i5);
                    if (strGroup == null) {
                        strGroup = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                    }
                    androidx.navigation.n3 n3Var = map.get(str2);
                    if (rz(bundle, str2, strGroup, n3Var)) {
                        if (!Intrinsics.areEqual(strGroup, '{' + str2 + '}') && fh(bundle2, str2, strGroup, n3Var)) {
                            return false;
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                    i = i5;
                }
                bundle.putAll(bundle2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return true;
    }

    public final Pattern tl() {
        return (Pattern) this.f902tl.getValue();
    }

    public final Bundle w(Uri uri, Map<String, androidx.navigation.n3> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternI4 = i4();
        Matcher matcher = patternI4 != null ? patternI4.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        p(matcher, bundle, arguments);
        if (d0()) {
            mt(uri, bundle, arguments);
        }
        return bundle;
    }

    public final String wz() {
        return (String) this.f901t.getValue();
    }

    public final Pattern x4() {
        return (Pattern) this.f905xc.getValue();
    }

    public final Bundle xc(Uri deepLink, Map<String, androidx.navigation.n3> arguments) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Pattern patternI4 = i4();
        Matcher matcher = patternI4 != null ? patternI4.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!p(matcher, bundle, arguments)) {
            return null;
        }
        if (d0() && !mt(deepLink, bundle, arguments)) {
            return null;
        }
        co(deepLink.getFragment(), bundle, arguments);
        if (u0.s.y(arguments, new c5(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final String z() {
        return this.zn;
    }

    public final void z6() {
        if (this.y == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("^");
        if (!f892mt.matcher(this.y).find()) {
            sb.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.y);
        matcher.find();
        boolean z = false;
        String strSubstring = this.y.substring(0, matcher.start());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        fb(strSubstring, this.f898gv, sb);
        if (!StringsKt.contains$default((CharSequence) sb, (CharSequence) ".*", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) sb, (CharSequence) "([^/]+?)", false, 2, (Object) null)) {
            z = true;
        }
        this.w = z;
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
        this.f903v = StringsKt.replace$default(string, ".*", "\\E.*\\Q", false, 4, (Object) null);
    }
}

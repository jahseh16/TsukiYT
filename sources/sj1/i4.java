package sj1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class i4 {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String[] f7950gv;
    public final String n3;
    public final String y;
    public final String zn;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f7949v = new y(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7947a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public static final Pattern f7948fb = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i4 n3(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return y(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final i4 y(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = i4.f7947a.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String strGroup = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strGroup.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = strGroup2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = i4.f7948fb.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(iEnd);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    sb.append(strSubstring);
                    sb.append("\" for: \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (StringsKt.startsWith$default(strGroup4, "'", false, 2, (Object) null) && StringsKt.endsWith$default(strGroup4, "'", false, 2, (Object) null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new i4(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public y() {
        }
    }

    public /* synthetic */ i4(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static final i4 fb(String str) {
        return f7949v.n3(str);
    }

    public static /* synthetic */ Charset gv(i4 i4Var, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return i4Var.zn(charset);
    }

    public static final i4 v(String str) {
        return f7949v.y(str);
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, this.f7950gv.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (true) {
            int i5 = i + 2;
            if (StringsKt.equals(this.f7950gv[i], name, true)) {
                return this.f7950gv[i + 1];
            }
            if (i == progressionLastElement) {
                return null;
            }
            i = i5;
        }
    }

    public final String c5() {
        return this.n3;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i4) && Intrinsics.areEqual(((i4) obj).y, this.y);
    }

    public int hashCode() {
        return this.y.hashCode();
    }

    public final String s() {
        return this.zn;
    }

    public String toString() {
        return this.y;
    }

    public final Charset zn(Charset charset) {
        String strA = a("charset");
        if (strA == null) {
            return charset;
        }
        try {
            return Charset.forName(strA);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public i4(String str, String str2, String str3, String[] strArr) {
        this.y = str;
        this.n3 = str2;
        this.zn = str3;
        this.f7950gv = strArr;
    }
}

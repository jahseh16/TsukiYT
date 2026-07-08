package sj1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes.dex */
public final class tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8038a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final boolean f8039c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final boolean f8040fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f8041gv;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f8042s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f8043v;
    public final String y;
    public final long zn;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public static final y f8034i9 = new y(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f8033f = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f8035t = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: tl, reason: collision with root package name */
    public static final Pattern f8036tl = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: wz, reason: collision with root package name */
    public static final Pattern f8037wz = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public static final class y {
        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            if (StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strV = tj1.y.v(StringsKt.removePrefix(str, "."));
            if (strV != null) {
                return strV;
            }
            throw new IllegalArgumentException();
        }

        public final long fb(String str, int i, int i5) {
            int iY = y(str, i, i5, false);
            Matcher matcher = tl.f8037wz.matcher(str);
            int i8 = -1;
            int i10 = -1;
            int i11 = -1;
            int iIndexOf$default = -1;
            int i12 = -1;
            int i13 = -1;
            while (iY < i5) {
                int iY2 = y(str, iY + 1, i5, true);
                matcher.region(iY, iY2);
                if (i10 == -1 && matcher.usePattern(tl.f8037wz).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                    i12 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                    i13 = Integer.parseInt(strGroup3);
                } else if (i11 == -1 && matcher.usePattern(tl.f8036tl).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup4);
                } else if (iIndexOf$default == -1 && matcher.usePattern(tl.f8035t).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = tl.f8035t.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strPattern, lowerCase, 0, false, 6, (Object) null) / 4;
                } else if (i8 == -1 && matcher.usePattern(tl.f8033f).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i8 = Integer.parseInt(strGroup6);
                }
                iY = y(str, iY2 + 1, i5, false);
            }
            if (70 <= i8 && i8 < 100) {
                i8 += 1900;
            }
            if (i8 >= 0 && i8 < 70) {
                i8 += 2000;
            }
            if (i8 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iIndexOf$default == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i11 || i11 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i10 < 0 || i10 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i12 < 0 || i12 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(tj1.gv.f8210a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i8);
            gregorianCalendar.set(2, iIndexOf$default - 1);
            gregorianCalendar.set(5, i11);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, i12);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00d7 A[PHI: r1
          0x00d7: PHI (r1v22 long) = (r1v7 long), (r1v10 long) binds: [B:42:0x00d5, B:53:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final sj1.tl gv(long r26, sj1.r r28, java.lang.String r29) {
            /*
                Method dump skipped, instruction units count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sj1.tl.y.gv(long, sj1.r, java.lang.String):sj1.tl");
        }

        public final boolean n3(String str, String str2) {
            if (Intrinsics.areEqual(str, str2)) {
                return true;
            }
            return StringsKt.endsWith$default(str, str2, false, 2, (Object) null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !tj1.gv.c5(str);
        }

        public final long s(String str) {
            try {
                long j = Long.parseLong(str);
                if (j <= 0) {
                    return Long.MIN_VALUE;
                }
                return j;
            } catch (NumberFormatException e4) {
                if (new Regex("-?\\d+").matches(str)) {
                    return StringsKt.startsWith$default(str, "-", false, 2, (Object) null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e4;
            }
        }

        public final List<tl> v(r url, z headers) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            List<String> listC5 = headers.c5("Set-Cookie");
            int size = listC5.size();
            ArrayList arrayList = null;
            int i = 0;
            while (i < size) {
                int i5 = i + 1;
                tl tlVarZn = zn(url, listC5.get(i));
                if (tlVarZn != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(tlVarZn);
                }
                i = i5;
            }
            if (arrayList == null) {
                return CollectionsKt.emptyList();
            }
            List<tl> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return listUnmodifiableList;
        }

        public final int y(String str, int i, int i5, boolean z) {
            while (i < i5) {
                int i8 = i + 1;
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i = i8;
            }
            return i5;
        }

        public final tl zn(r url, String setCookie) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(setCookie, "setCookie");
            return gv(System.currentTimeMillis(), url, setCookie);
        }

        public y() {
        }
    }

    public /* synthetic */ tl(String str, String str2, long j, String str3, String str4, boolean z, boolean z5, boolean z7, boolean z8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, z, z5, z7, z8);
    }

    public final long a() {
        return this.zn;
    }

    public final String c5() {
        return this.y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof tl) {
            tl tlVar = (tl) obj;
            if (Intrinsics.areEqual(tlVar.y, this.y) && Intrinsics.areEqual(tlVar.n3, this.n3) && tlVar.zn == this.zn && Intrinsics.areEqual(tlVar.f8041gv, this.f8041gv) && Intrinsics.areEqual(tlVar.f8043v, this.f8043v) && tlVar.f8038a == this.f8038a && tlVar.f8040fb == this.f8040fb && tlVar.f8042s == this.f8042s && tlVar.f8039c5 == this.f8039c5) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f8042s;
    }

    public final boolean fb() {
        return this.f8039c5;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((527 + this.y.hashCode()) * 31) + this.n3.hashCode()) * 31) + o0.r.y(this.zn)) * 31) + this.f8041gv.hashCode()) * 31) + this.f8043v.hashCode()) * 31) + o0.n3.y(this.f8038a)) * 31) + o0.n3.y(this.f8040fb)) * 31) + o0.n3.y(this.f8042s)) * 31) + o0.n3.y(this.f8039c5);
    }

    public final String i9() {
        return this.f8043v;
    }

    public final boolean s() {
        return this.f8040fb;
    }

    public final boolean t() {
        return this.f8038a;
    }

    public final String tl(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(c5());
        sb.append('=');
        sb.append(wz());
        if (f()) {
            if (a() == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(yj1.zn.n3(new Date(a())));
            }
        }
        if (!fb()) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(v());
        }
        sb.append("; path=");
        sb.append(i9());
        if (t()) {
            sb.append("; secure");
        }
        if (s()) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return string;
    }

    public String toString() {
        return tl(false);
    }

    public final String v() {
        return this.f8041gv;
    }

    public final String wz() {
        return this.n3;
    }

    public tl(String str, String str2, long j, String str3, String str4, boolean z, boolean z5, boolean z7, boolean z8) {
        this.y = str;
        this.n3 = str2;
        this.zn = j;
        this.f8041gv = str3;
        this.f8043v = str4;
        this.f8038a = z;
        this.f8040fb = z5;
        this.f8042s = z7;
        this.f8039c5 = z8;
    }
}

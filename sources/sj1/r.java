package sj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n3 f7991f = new n3(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final char[] f7992t = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f7993a;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public final String f7994c5;

    /* JADX INFO: renamed from: fb, reason: collision with root package name */
    public final List<String> f7995fb;

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public final String f7996gv;

    /* JADX INFO: renamed from: i9, reason: collision with root package name */
    public final boolean f7997i9;
    public final String n3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7998s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7999v;
    public final String y;
    public final String zn;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String n3(n3 n3Var, String str, int i, int i5, String str2, boolean z, boolean z5, boolean z7, boolean z8, Charset charset, int i8, Object obj) {
            return n3Var.y(str, (i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? str.length() : i5, str2, (i8 & 8) != 0 ? false : z, (i8 & 16) != 0 ? false : z5, (i8 & 32) != 0 ? false : z7, (i8 & 64) != 0 ? false : z8, (i8 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String s(n3 n3Var, String str, int i, int i5, boolean z, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = 0;
            }
            if ((i8 & 2) != 0) {
                i5 = str.length();
            }
            if ((i8 & 4) != 0) {
                z = false;
            }
            return n3Var.fb(str, i, i5, z);
        }

        public final r a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return gv(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final void c5(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        public final void f(List<String> list, StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                int i = first + step;
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first = i;
                }
            }
        }

        public final String fb(String str, int i, int i5, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i8 = i;
            while (i8 < i5) {
                int i10 = i8 + 1;
                char cCharAt = str.charAt(i8);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    hk1.v vVar = new hk1.v();
                    vVar.oa(str, i, i8);
                    tl(vVar, str, i8, i5, z);
                    return vVar.yc();
                }
                i8 = i10;
            }
            String strSubstring = str.substring(i, i5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final r gv(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new y().z(null, str).gv();
        }

        public final List<String> i9(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', i, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int i5 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i5) {
                    String strSubstring = str.substring(i, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, i5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = i5 + 1;
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0093 A[LOOP:1: B:50:0x008d->B:52:0x0093, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void t(hk1.v r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lbc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb5
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.vp(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L4a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L4a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L4e
                if (r23 == 0) goto L4a
                goto L4e
            L4a:
                r8 = r14
                r12 = r19
                goto L6f
            L4e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = kotlin.text.StringsKt.contains$default(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L69
                if (r7 != r9) goto L67
                if (r20 == 0) goto L69
                if (r21 == 0) goto L67
                r8 = r14
                boolean r10 = r14.v(r1, r5, r2)
                if (r10 != 0) goto L6b
                goto L6f
            L67:
                r8 = r14
                goto L6b
            L69:
                r8 = r14
                goto L6f
            L6b:
                r15.w9(r7)
                goto Lb5
            L6f:
                if (r6 != 0) goto L76
                hk1.v r6 = new hk1.v
                r6.<init>()
            L76:
                if (r3 == 0) goto L8a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r10)
                if (r10 == 0) goto L81
                goto L8a
            L81:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.l(r1, r5, r10, r3)
                goto L8d
            L8a:
                r6.w9(r7)
            L8d:
                boolean r10 = r6.dm()
                if (r10 != 0) goto Lb5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.tg(r9)
                char[] r13 = sj1.r.y()
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.tg(r11)
                char[] r11 = sj1.r.y()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.tg(r10)
                goto L8d
            Lb5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lbc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sj1.r.n3.t(hk1.v, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        public final void tl(hk1.v vVar, String str, int i, int i5, boolean z) {
            int i8;
            while (i < i5) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i8 = i + 2) < i5) {
                    int iUd = tj1.gv.ud(str.charAt(i + 1));
                    int iUd2 = tj1.gv.ud(str.charAt(i8));
                    if (iUd == -1 || iUd2 == -1) {
                        vVar.w9(iCodePointAt);
                        i += Character.charCount(iCodePointAt);
                    } else {
                        vVar.tg((iUd << 4) + iUd2);
                        i = Character.charCount(iCodePointAt) + i8;
                    }
                } else if (iCodePointAt == 43 && z) {
                    vVar.tg(32);
                    i++;
                } else {
                    vVar.w9(iCodePointAt);
                    i += Character.charCount(iCodePointAt);
                }
            }
        }

        public final boolean v(String str, int i, int i5) {
            int i8 = i + 2;
            return i8 < i5 && str.charAt(i) == '%' && tj1.gv.ud(str.charAt(i + 1)) != -1 && tj1.gv.ud(str.charAt(i8)) != -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String y(java.lang.String r14, int r15, int r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, boolean r21, java.nio.charset.Charset r22) {
            /*
                r13 = this;
                r2 = r14
                r4 = r16
                r5 = r17
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.lang.String r0 = "encodeSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3 = r15
            L10:
                if (r3 >= r4) goto L71
                int r0 = r14.codePointAt(r3)
                r1 = 32
                if (r0 < r1) goto L25
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == r1) goto L25
                r1 = 128(0x80, float:1.794E-43)
                if (r0 < r1) goto L27
                if (r21 == 0) goto L25
                goto L27
            L25:
                r11 = r13
                goto L4f
            L27:
                char r1 = (char) r0
                r6 = 2
                r7 = 0
                r8 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r5, r1, r8, r6, r7)
                if (r1 != 0) goto L25
                r1 = 37
                if (r0 != r1) goto L41
                if (r18 == 0) goto L25
                if (r19 == 0) goto L41
                r11 = r13
                boolean r1 = r13.v(r14, r3, r4)
                if (r1 == 0) goto L4f
                goto L42
            L41:
                r11 = r13
            L42:
                r1 = 43
                if (r0 != r1) goto L49
                if (r20 == 0) goto L49
                goto L4f
            L49:
                int r0 = java.lang.Character.charCount(r0)
                int r3 = r3 + r0
                goto L10
            L4f:
                hk1.v r12 = new hk1.v
                r12.<init>()
                r0 = r15
                r12.oa(r14, r15, r3)
                r0 = r13
                r1 = r12
                r2 = r14
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r9 = r21
                r10 = r22
                r0.t(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = r12.yc()
                return r0
            L71:
                r11 = r13
                r0 = r15
                java.lang.String r0 = r14.substring(r15, r16)
                java.lang.String r1 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sj1.r.n3.y(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):java.lang.String");
        }

        public final int zn(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public n3() {
        }
    }

    public static final class y {

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public static final C0164y f8000c5 = new C0164y(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f8001a;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public List<String> f8002fb;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public String f8003gv;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f8004s;
        public String y;
        public String n3 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        public String zn = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f8005v = -1;

        /* JADX INFO: renamed from: sj1.r$y$y, reason: collision with other inner class name */
        public static final class C0164y {
            public /* synthetic */ C0164y(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a(String str, int i, int i5) {
                while (i < i5) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '[') {
                        do {
                            i++;
                            if (i < i5) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (cCharAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i5;
            }

            public final int fb(String str, int i, int i5) {
                if (i5 - i < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                int i8 = i + 1;
                while (i8 < i5) {
                    int i10 = i8 + 1;
                    char cCharAt2 = str.charAt(i8);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && !(('0' <= cCharAt2 && cCharAt2 < ':') || cCharAt2 == '+' || cCharAt2 == '-' || cCharAt2 == '.'))) {
                        if (cCharAt2 == ':') {
                            return i8;
                        }
                        return -1;
                    }
                    i8 = i10;
                }
                return -1;
            }

            public final int s(String str, int i, int i5) {
                int i8 = 0;
                while (i < i5) {
                    int i10 = i + 1;
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i8++;
                    i = i10;
                }
                return i8;
            }

            public final int v(String str, int i, int i5) {
                try {
                    int i8 = Integer.parseInt(n3.n3(r.f7991f, str, i, i5, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, false, false, false, false, null, 248, null));
                    if (1 > i8 || i8 >= 65536) {
                        return -1;
                    }
                    return i8;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public C0164y() {
            }
        }

        public y() {
            ArrayList arrayList = new ArrayList();
            this.f8001a = arrayList;
            arrayList.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
        }

        public final y a(String encodedPath) {
            Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!StringsKt.startsWith$default(encodedPath, "/", false, 2, (Object) null)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected encodedPath: ", encodedPath).toString());
            }
            d0(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final y a8(String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            d(n3.n3(r.f7991f, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final y c(int i) {
            f().remove(i);
            if (f().isEmpty()) {
                f().add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            }
            return this;
        }

        public final String c5() {
            return this.f8004s;
        }

        public final boolean co(String str) {
            return Intrinsics.areEqual(str, "..") || StringsKt.equals(str, "%2e.", true) || StringsKt.equals(str, ".%2e", true) || StringsKt.equals(str, "%2e%2e", true);
        }

        public final void d(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.n3 = str;
        }

        public final void d0(String str, int i, int i5) {
            if (i == i5) {
                return;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f8001a.clear();
                this.f8001a.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
                i++;
            } else {
                List<String> list = this.f8001a;
                list.set(list.size() - 1, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            }
            while (true) {
                int i8 = i;
                while (i8 < i5) {
                    i = tj1.gv.p(str, "/\\", i8, i5);
                    boolean z = i < i5;
                    f3(str, i8, i, z, true);
                    if (z) {
                        i8 = i + 1;
                    }
                }
                return;
            }
        }

        public final void ej(int i) {
            this.f8005v = i;
        }

        public final List<String> f() {
            return this.f8001a;
        }

        public final void f3(String str, int i, int i5, boolean z, boolean z5) {
            String strN3 = n3.n3(r.f7991f, str, i, i5, " \"<>^`{}|/\\?#", z5, false, false, false, null, 240, null);
            if (mt(strN3)) {
                return;
            }
            if (co(strN3)) {
                x4();
                return;
            }
            if (this.f8001a.get(r2.size() - 1).length() == 0) {
                this.f8001a.set(r2.size() - 1, strN3);
            } else {
                this.f8001a.add(strN3);
            }
            if (z) {
                this.f8001a.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            }
        }

        public final y fb(String str) {
            List<String> listI9 = null;
            if (str != null) {
                n3 n3Var = r.f7991f;
                String strN3 = n3.n3(n3Var, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (strN3 != null) {
                    listI9 = n3Var.i9(strN3);
                }
            }
            ta(listI9);
            return this;
        }

        public final y fh(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                ud("http");
            } else {
                if (!StringsKt.equals(scheme, "https", true)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
                }
                ud("https");
            }
            return this;
        }

        public final r gv() {
            ArrayList arrayList;
            String str = this.y;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            n3 n3Var = r.f7991f;
            String strS = n3.s(n3Var, this.n3, 0, 0, false, 7, null);
            String strS2 = n3.s(n3Var, this.zn, 0, 0, false, 7, null);
            String str2 = this.f8003gv;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iV = v();
            List<String> list = this.f8001a;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(n3.s(r.f7991f, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f8002fb;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 == null ? null : n3.s(r.f7991f, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f8004s;
            return new r(str, strS, strS2, str2, iV, arrayList2, arrayList, str4 == null ? null : n3.s(r.f7991f, str4, 0, 0, false, 7, null), toString());
        }

        public final y i4(int i) {
            if (1 > i || i >= 65536) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i)).toString());
            }
            ej(i);
            return this;
        }

        public final String i9() {
            return this.zn;
        }

        public final void mg(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.zn = str;
        }

        public final boolean mt(String str) {
            return Intrinsics.areEqual(str, ".") || StringsKt.equals(str, "%2e", true);
        }

        public final y n() {
            String strWz = wz();
            z6(strWz == null ? null : new Regex("[\"<>^`{|}]").replace(strWz, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING));
            int size = f().size();
            int i = 0;
            for (int i5 = 0; i5 < size; i5++) {
                f().set(i5, n3.n3(r.f7991f, f().get(i5), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> listT = t();
            if (listT != null) {
                int size2 = listT.size();
                while (i < size2) {
                    int i8 = i + 1;
                    String str = listT.get(i);
                    listT.set(i, str == null ? null : n3.n3(r.f7991f, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i = i8;
                }
            }
            String strC5 = c5();
            rz(strC5 != null ? n3.n3(r.f7991f, strC5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final y n3(String encodedName, String str) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (t() == null) {
                ta(new ArrayList());
            }
            List<String> listT = t();
            Intrinsics.checkNotNull(listT);
            n3 n3Var = r.f7991f;
            listT.add(n3.n3(n3Var, encodedName, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            List<String> listT2 = t();
            Intrinsics.checkNotNull(listT2);
            listT2.add(str == null ? null : n3.n3(n3Var, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            return this;
        }

        public final y p(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String strV = tj1.y.v(n3.s(r.f7991f, host, 0, 0, false, 7, null));
            if (strV == null) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
            }
            z6(strV);
            return this;
        }

        public final y r(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            mg(n3.n3(r.f7991f, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final void rz(String str) {
            this.f8004s = str;
        }

        public final y s(String str) {
            rz(str == null ? null : n3.n3(r.f7991f, str, 0, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, false, false, false, true, null, 187, null));
            return this;
        }

        public final List<String> t() {
            return this.f8002fb;
        }

        public final void ta(List<String> list) {
            this.f8002fb = list;
        }

        public final String tl() {
            return this.n3;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sj1.r.y.toString():java.lang.String");
        }

        public final void ud(String str) {
            this.y = str;
        }

        public final int v() {
            int i = this.f8005v;
            if (i != -1) {
                return i;
            }
            n3 n3Var = r.f7991f;
            String str = this.y;
            Intrinsics.checkNotNull(str);
            return n3Var.zn(str);
        }

        public final String w() {
            return this.y;
        }

        public final String wz() {
            return this.f8003gv;
        }

        public final void x4() {
            if (this.f8001a.remove(r0.size() - 1).length() != 0 || this.f8001a.isEmpty()) {
                this.f8001a.add(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            } else {
                this.f8001a.set(r0.size() - 1, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
            }
        }

        public final int xc() {
            return this.f8005v;
        }

        public final y y(String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            f3(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final y z(r rVar, String str) {
            int iP;
            int i;
            int i5;
            int i8;
            boolean z;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            int iD0 = tj1.gv.d0(input, 0, 0, 3, null);
            int iRz = tj1.gv.rz(input, iD0, 0, 2, null);
            C0164y c0164y = f8000c5;
            int iFb = c0164y.fb(input, iD0, iRz);
            byte b4 = -1;
            if (iFb != -1) {
                if (StringsKt.startsWith(input, "https:", iD0, true)) {
                    this.y = "https";
                    iD0 += 6;
                } else {
                    if (!StringsKt.startsWith(input, "http:", iD0, true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input.substring(0, iFb);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(strSubstring);
                        sb.append('\'');
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.y = "http";
                    iD0 += 5;
                }
            } else {
                if (rVar == null) {
                    if (str.length() > 6) {
                        input = Intrinsics.stringPlus(StringsKt.take(input, 6), "...");
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
                }
                this.y = rVar.x4();
            }
            int iS = c0164y.s(input, iD0, iRz);
            byte b6 = 63;
            byte b7 = 35;
            if (iS >= 2 || rVar == null || !Intrinsics.areEqual(rVar.x4(), this.y)) {
                int i10 = iD0 + iS;
                boolean z5 = false;
                boolean z7 = false;
                while (true) {
                    iP = tj1.gv.p(input, "@/\\?#", i10, iRz);
                    byte bCharAt = iP != iRz ? input.charAt(iP) : (byte) -1;
                    if (bCharAt == b4 || bCharAt == b7 || bCharAt == 47 || bCharAt == 92 || bCharAt == b6) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z5) {
                            i5 = iP;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.zn);
                            sb2.append("%40");
                            i8 = iRz;
                            sb2.append(n3.n3(r.f7991f, str, i10, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.zn = sb2.toString();
                        } else {
                            int iW = tj1.gv.w(input, ':', i10, iP);
                            n3 n3Var = r.f7991f;
                            String strN3 = n3.n3(n3Var, str, i10, iW, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z7) {
                                strN3 = this.n3 + "%40" + strN3;
                            }
                            this.n3 = strN3;
                            if (iW != iP) {
                                i5 = iP;
                                this.zn = n3.n3(n3Var, str, iW + 1, iP, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z = true;
                            } else {
                                i5 = iP;
                                z = z5;
                            }
                            z5 = z;
                            i8 = iRz;
                            z7 = true;
                        }
                        i10 = i5 + 1;
                        iRz = i8;
                        b7 = 35;
                        b6 = 63;
                        b4 = -1;
                    }
                }
                i = iRz;
                C0164y c0164y2 = f8000c5;
                int iA = c0164y2.a(input, i10, iP);
                int i11 = iA + 1;
                if (i11 < iP) {
                    this.f8003gv = tj1.y.v(n3.s(r.f7991f, str, i10, iA, false, 4, null));
                    int iV = c0164y2.v(input, i11, iP);
                    this.f8005v = iV;
                    if (iV == -1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid URL port: \"");
                        String strSubstring2 = input.substring(i11, iP);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    n3 n3Var2 = r.f7991f;
                    this.f8003gv = tj1.y.v(n3.s(n3Var2, str, i10, iA, false, 4, null));
                    String str2 = this.y;
                    Intrinsics.checkNotNull(str2);
                    this.f8005v = n3Var2.zn(str2);
                }
                if (this.f8003gv == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid URL host: \"");
                    String strSubstring3 = input.substring(i10, iA);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iD0 = iP;
            } else {
                this.n3 = rVar.s();
                this.zn = rVar.gv();
                this.f8003gv = rVar.f();
                this.f8005v = rVar.mt();
                this.f8001a.clear();
                this.f8001a.addAll(rVar.a());
                if (iD0 == iRz || input.charAt(iD0) == '#') {
                    fb(rVar.fb());
                }
                i = iRz;
            }
            int i12 = i;
            int iP2 = tj1.gv.p(input, "?#", iD0, i12);
            d0(input, iD0, iP2);
            if (iP2 < i12 && input.charAt(iP2) == '?') {
                int iW2 = tj1.gv.w(input, '#', iP2, i12);
                n3 n3Var3 = r.f7991f;
                this.f8002fb = n3Var3.i9(n3.n3(n3Var3, str, iP2 + 1, iW2, " \"'<>#", true, false, true, false, null, 208, null));
                iP2 = iW2;
            }
            if (iP2 < i12 && input.charAt(iP2) == '#') {
                this.f8004s = n3.n3(r.f7991f, str, iP2 + 1, i12, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final void z6(String str) {
            this.f8003gv = str;
        }

        public final y zn(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (t() == null) {
                ta(new ArrayList());
            }
            List<String> listT = t();
            Intrinsics.checkNotNull(listT);
            n3 n3Var = r.f7991f;
            listT.add(n3.n3(n3Var, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            List<String> listT2 = t();
            Intrinsics.checkNotNull(listT2);
            listT2.add(str == null ? null : n3.n3(n3Var, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }
    }

    public r(String scheme, String username, String password, String host, int i, List<String> pathSegments, List<String> list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.y = scheme;
        this.n3 = username;
        this.zn = password;
        this.f7996gv = host;
        this.f7999v = i;
        this.f7993a = pathSegments;
        this.f7995fb = list;
        this.f7998s = str;
        this.f7994c5 = url;
        this.f7997i9 = Intrinsics.areEqual(scheme, "https");
    }

    public static final r i9(String str) {
        return f7991f.gv(str);
    }

    public static final int n3(String str) {
        return f7991f.zn(str);
    }

    public static final r xc(String str) {
        return f7991f.a(str);
    }

    public final List<String> a() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7994c5, '/', this.y.length() + 3, false, 4, (Object) null);
        String str = this.f7994c5;
        int iP = tj1.gv.p(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iP) {
            int i = iIndexOf$default + 1;
            int iW = tj1.gv.w(this.f7994c5, '/', i, iP);
            String strSubstring = this.f7994c5.substring(i, iW);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iW;
        }
        return arrayList;
    }

    public final String c5() {
        return this.f7998s;
    }

    public final String co() {
        if (this.f7995fb == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f7991f.f(this.f7995fb, sb);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Intrinsics.areEqual(((r) obj).f7994c5, this.f7994c5);
    }

    public final String f() {
        return this.f7996gv;
    }

    public final URL f3() {
        try {
            return new URL(this.f7994c5);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final String fb() {
        if (this.f7995fb == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7994c5, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f7994c5;
        String strSubstring = this.f7994c5.substring(iIndexOf$default, tj1.gv.w(str, '#', iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String gv() {
        if (this.zn.length() == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        String strSubstring = this.f7994c5.substring(StringsKt.indexOf$default((CharSequence) this.f7994c5, ':', this.y.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.f7994c5, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int hashCode() {
        return this.f7994c5.hashCode();
    }

    public final URI i4() {
        String string = tl().n().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e4) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final int mt() {
        return this.f7999v;
    }

    public final int p() {
        return this.f7993a.size();
    }

    public final r r(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        y yVarWz = wz(link);
        if (yVarWz == null) {
            return null;
        }
        return yVarWz.gv();
    }

    public final String s() {
        if (this.n3.length() == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        int length = this.y.length() + 3;
        String str = this.f7994c5;
        String strSubstring = this.f7994c5.substring(length, tj1.gv.p(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean t() {
        return this.f7997i9;
    }

    public final y tl() {
        y yVar = new y();
        yVar.ud(this.y);
        yVar.d(s());
        yVar.mg(gv());
        yVar.z6(this.f7996gv);
        yVar.ej(this.f7999v != f7991f.zn(this.y) ? this.f7999v : -1);
        yVar.f().clear();
        yVar.f().addAll(a());
        yVar.fb(fb());
        yVar.rz(zn());
        return yVar;
    }

    public String toString() {
        return this.f7994c5;
    }

    public final String v() {
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) this.f7994c5, '/', this.y.length() + 3, false, 4, (Object) null);
        String str = this.f7994c5;
        String strSubstring = this.f7994c5.substring(iIndexOf$default, tj1.gv.p(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> w() {
        return this.f7993a;
    }

    public final y wz(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new y().z(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String x4() {
        return this.y;
    }

    public final String z() {
        y yVarWz = wz("/...");
        Intrinsics.checkNotNull(yVarWz);
        return yVarWz.a8(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).r(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING).gv().toString();
    }

    public final String zn() {
        if (this.f7998s == null) {
            return null;
        }
        String strSubstring = this.f7994c5.substring(StringsKt.indexOf$default((CharSequence) this.f7994c5, '#', 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}

package m0;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import b0.n3;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.a;
import v0.d;
import v0.r;
import v0.ut;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: gv, reason: collision with root package name */
    public static final Map<String, Integer> f6461gv;
    public static final Map<String, Integer> zn;
    public static final Pattern y = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern n3 = Pattern.compile("(\\S+?):(\\S+)");

    public static final class gv implements Comparable<gv> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final m0.gv f6462v;
        public final int y;

        public gv(int i, m0.gv gvVar) {
            this.y = i;
            this.f6462v = gvVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(gv gvVar) {
            return Integer.compare(this.y, gvVar.y);
        }
    }

    public static class n3 {
        public static final Comparator<n3> zn = new Comparator() { // from class: m0.fb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return a.n3.v((a.n3) obj, (a.n3) obj2);
            }
        };
        public final int n3;
        public final zn y;

        public static /* synthetic */ int v(n3 n3Var, n3 n3Var2) {
            return Integer.compare(n3Var.y.n3, n3Var2.y.n3);
        }

        public n3(zn znVar, int i) {
            this.y = znVar;
            this.n3 = i;
        }
    }

    public static final class v {
        public CharSequence zn;
        public long y = 0;
        public long n3 = 0;

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public int f6467gv = 2;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f6470v = -3.4028235E38f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6463a = 1;

        /* JADX INFO: renamed from: fb, reason: collision with root package name */
        public int f6466fb = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f6469s = -3.4028235E38f;

        /* JADX INFO: renamed from: c5, reason: collision with root package name */
        public int f6464c5 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: i9, reason: collision with root package name */
        public float f6468i9 = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6465f = Integer.MIN_VALUE;

        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public static float gv(int i, float f3) {
            if (i == 0) {
                return 1.0f - f3;
            }
            if (i == 1) {
                return f3 <= 0.5f ? f3 * 2.0f : (1.0f - f3) * 2.0f;
            }
            if (i == 2) {
                return f3;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public static float n3(float f3, int i) {
            if (f3 == -3.4028235E38f || i != 0 || (f3 >= 0.0f && f3 <= 1.0f)) {
                return f3 != -3.4028235E38f ? f3 : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static float v(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        @Nullable
        public static Layout.Alignment zn(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            r.c5("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public n3.C0034n3 fb() {
            float fV = this.f6469s;
            if (fV == -3.4028235E38f) {
                fV = v(this.f6467gv);
            }
            int iA = this.f6464c5;
            if (iA == Integer.MIN_VALUE) {
                iA = a(this.f6467gv);
            }
            n3.C0034n3 c0034n3Mt = new n3.C0034n3().w(zn(this.f6467gv)).s(n3(this.f6470v, this.f6463a), this.f6463a).c5(this.f6466fb).f(fV).t(iA).wz(Math.min(this.f6468i9, gv(iA, fV))).mt(this.f6465f);
            CharSequence charSequence = this.zn;
            if (charSequence != null) {
                c0034n3Mt.xc(charSequence);
            }
            return c0034n3Mt;
        }

        public m0.v y() {
            return new m0.v(fb().y(), this.y, this.n3);
        }
    }

    public static final class zn {

        /* JADX INFO: renamed from: gv, reason: collision with root package name */
        public final Set<String> f6471gv;
        public final int n3;
        public final String y;
        public final String zn;

        public zn(String str, int i, String str2, Set<String> set) {
            this.n3 = i;
            this.y = str;
            this.zn = str2;
            this.f6471gv = set;
        }

        public static zn n3() {
            return new zn(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, 0, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, Collections.emptySet());
        }

        public static zn y(String str, int i) {
            String str2;
            String strTrim = str.trim();
            v0.y.y(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrRo = ut.ro(strTrim, "\\.");
            String str3 = strArrRo[0];
            HashSet hashSet = new HashSet();
            for (int i5 = 1; i5 < strArrRo.length; i5++) {
                hashSet.add(strArrRo[i5]);
            }
            return new zn(str3, i, str2, hashSet);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zn = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f6461gv = Collections.unmodifiableMap(map2);
    }

    public static int a(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    public static int c5(List<m0.gv> list, @Nullable String str, zn znVar) {
        List<gv> listS = s(list, str, znVar);
        for (int i = 0; i < listS.size(); i++) {
            m0.gv gvVar = listS.get(i).f6462v;
            if (gvVar.fb() != -1) {
                return gvVar.fb();
            }
        }
        return -1;
    }

    public static void co(String str, v vVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            vVar.f6466fb = mt(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            vVar.f6470v = c5.zn(str);
            vVar.f6463a = 0;
        } else {
            vVar.f6470v = Integer.parseInt(str);
            vVar.f6463a = 1;
        }
    }

    public static boolean f(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static int fb(int i, int i5, int i8) {
        if (i != -1) {
            return i;
        }
        if (i5 != -1) {
            return i5;
        }
        if (i8 != -1) {
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public static void gv(@Nullable String str, zn znVar, List<n3> list, SpannableStringBuilder spannableStringBuilder, List<m0.gv> list2) {
        int i;
        int length;
        i = znVar.n3;
        length = spannableStringBuilder.length();
        String str2 = znVar.y;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                y(spannableStringBuilder, znVar.f6471gv, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                zn(spannableStringBuilder, str, znVar, list, list2);
                break;
            default:
                return;
        }
        List<gv> listS = s(list2, str, znVar);
        for (int i5 = 0; i5 < listS.size(); i5++) {
            v(spannableStringBuilder, listS.get(i5).f6462v, i, length);
        }
    }

    public static int i4(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        r.c5("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }

    public static String i9(String str) {
        String strTrim = str.trim();
        v0.y.y(!strTrim.isEmpty());
        return ut.ix(strTrim, "[ \\.]")[0];
    }

    public static int mt(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                r.c5("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void n3(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                r.c5("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static SpannedString p(@Nullable String str, String str2, List<m0.gv> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    n3(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iA = i + 1;
                if (iA < str2.length()) {
                    boolean z = str2.charAt(iA) == '/';
                    iA = a(str2, iA);
                    int i5 = iA - 2;
                    boolean z5 = str2.charAt(i5) == '/';
                    int i8 = i + (z ? 2 : 1);
                    if (!z5) {
                        i5 = iA - 1;
                    }
                    String strSubstring = str2.substring(i8, i5);
                    if (!strSubstring.trim().isEmpty()) {
                        String strI9 = i9(strSubstring);
                        if (f(strI9)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    zn znVar = (zn) arrayDeque.pop();
                                    gv(str, znVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new n3(znVar, spannableStringBuilder.length()));
                                    }
                                    if (znVar.y.equals(strI9)) {
                                        break;
                                    }
                                }
                            } else if (!z5) {
                                arrayDeque.push(zn.y(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iA;
            }
        }
        while (!arrayDeque.isEmpty()) {
            gv(str, (zn) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        gv(str, zn.n3(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static void r(String str, v vVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            vVar.f6464c5 = z(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        vVar.f6469s = c5.zn(str);
    }

    public static List<gv> s(List<m0.gv> list, @Nullable String str, zn znVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            m0.gv gvVar = list.get(i);
            int iS = gvVar.s(str, znVar.y, znVar.f6471gv, znVar.zn);
            if (iS > 0) {
                arrayList.add(new gv(iS, gvVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static b0.n3 t(CharSequence charSequence) {
        v vVar = new v();
        vVar.zn = charSequence;
        return vVar.fb().y();
    }

    @Nullable
    public static m0.v tl(@Nullable String str, Matcher matcher, d dVar, List<m0.gv> list) {
        v vVar = new v();
        try {
            vVar.y = c5.gv((String) v0.y.v(matcher.group(1)));
            vVar.n3 = c5.gv((String) v0.y.v(matcher.group(2)));
            w((String) v0.y.v(matcher.group(3)), vVar);
            StringBuilder sb = new StringBuilder();
            String strCo = dVar.co();
            while (!TextUtils.isEmpty(strCo)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strCo.trim());
                strCo = dVar.co();
            }
            vVar.zn = p(str, sb.toString(), list);
            return vVar.y();
        } catch (NumberFormatException unused) {
            r.c5("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void v(SpannableStringBuilder spannableStringBuilder, m0.gv gvVar, int i, int i5) {
        if (gvVar == null) {
            return;
        }
        if (gvVar.c5() != -1) {
            g0.gv.y(spannableStringBuilder, new StyleSpan(gvVar.c5()), i, i5, 33);
        }
        if (gvVar.t()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i5, 33);
        }
        if (gvVar.tl()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i5, 33);
        }
        if (gvVar.f()) {
            g0.gv.y(spannableStringBuilder, new ForegroundColorSpan(gvVar.zn()), i, i5, 33);
        }
        if (gvVar.i9()) {
            g0.gv.y(spannableStringBuilder, new BackgroundColorSpan(gvVar.y()), i, i5, 33);
        }
        if (gvVar.gv() != null) {
            g0.gv.y(spannableStringBuilder, new TypefaceSpan(gvVar.gv()), i, i5, 33);
        }
        int iA = gvVar.a();
        if (iA == 1) {
            g0.gv.y(spannableStringBuilder, new AbsoluteSizeSpan((int) gvVar.v(), true), i, i5, 33);
        } else if (iA == 2) {
            g0.gv.y(spannableStringBuilder, new RelativeSizeSpan(gvVar.v()), i, i5, 33);
        } else if (iA == 3) {
            g0.gv.y(spannableStringBuilder, new RelativeSizeSpan(gvVar.v() / 100.0f), i, i5, 33);
        }
        if (gvVar.n3()) {
            spannableStringBuilder.setSpan(new g0.y(), i, i5, 33);
        }
    }

    public static void w(String str, v vVar) {
        Matcher matcher = n3.matcher(str);
        while (matcher.find()) {
            String str2 = (String) v0.y.v(matcher.group(1));
            String str3 = (String) v0.y.v(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    co(str3, vVar);
                } else if ("align".equals(str2)) {
                    vVar.f6467gv = x4(str3);
                } else if ("position".equals(str2)) {
                    r(str3, vVar);
                } else if ("size".equals(str2)) {
                    vVar.f6468i9 = c5.zn(str3);
                } else if ("vertical".equals(str2)) {
                    vVar.f6465f = i4(str3);
                } else {
                    r.c5("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                r.c5("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    @Nullable
    public static m0.v wz(d dVar, List<m0.gv> list) {
        String strCo = dVar.co();
        if (strCo == null) {
            return null;
        }
        Pattern pattern = y;
        Matcher matcher = pattern.matcher(strCo);
        if (matcher.matches()) {
            return tl(null, matcher, dVar, list);
        }
        String strCo2 = dVar.co();
        if (strCo2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strCo2);
        if (matcher2.matches()) {
            return tl(strCo.trim(), matcher2, dVar, list);
        }
        return null;
    }

    public static int x4(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                r.c5("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static n3.C0034n3 xc(String str) {
        v vVar = new v();
        w(str, vVar);
        return vVar.fb();
    }

    public static void y(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i5) {
        for (String str : set) {
            Map<String, Integer> map = zn;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i5, 33);
            } else {
                Map<String, Integer> map2 = f6461gv;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i5, 33);
                }
            }
        }
    }

    public static int z(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                r.c5("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void zn(SpannableStringBuilder spannableStringBuilder, @Nullable String str, zn znVar, List<n3> list, List<m0.gv> list2) {
        int iC5 = c5(list2, str, znVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, n3.zn);
        int i = znVar.n3;
        int length = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if ("rt".equals(((n3) arrayList.get(i5)).y.y)) {
                n3 n3Var = (n3) arrayList.get(i5);
                int iFb = fb(c5(list2, str, n3Var.y), iC5, 1);
                int i8 = n3Var.y.n3 - length;
                int i10 = n3Var.n3 - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i10);
                spannableStringBuilder.delete(i8, i10);
                spannableStringBuilder.setSpan(new g0.zn(charSequenceSubSequence.toString(), iFb), i, i8, 33);
                length += charSequenceSubSequence.length();
                i = i8;
            }
        }
    }
}

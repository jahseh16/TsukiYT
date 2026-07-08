package sj1;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n3 f8056v = new n3(null);
    public final String[] y;

    public static final class n3 {
        public /* synthetic */ n3(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String[] strArr, String str) {
            int length = strArr.length - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(length, 0, -2);
            if (progressionLastElement > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (StringsKt.equals(str, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == progressionLastElement) {
                    return null;
                }
                length = i;
            }
        }

        public final z fb(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = StringsKt.trim(key).toString();
                String string2 = StringsKt.trim(value).toString();
                gv(string);
                v(string2, string);
                strArr[i] = string;
                strArr[i + 1] = string2;
                i += 2;
            }
            return new z(strArr, null);
        }

        public final void gv(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i5 = i + 1;
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(tj1.gv.z("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
                i = i5;
            }
        }

        public final z s(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i = 0;
            int i5 = 0;
            while (i5 < length) {
                int i8 = i5 + 1;
                String str = strArr[i5];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i5] = StringsKt.trim(str).toString();
                i5 = i8;
            }
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
            if (progressionLastElement >= 0) {
                while (true) {
                    int i10 = i + 2;
                    String str2 = strArr[i];
                    String str3 = strArr[i + 1];
                    gv(str2);
                    v(str3, str2);
                    if (i == progressionLastElement) {
                        break;
                    }
                    i = i10;
                }
            }
            return new z(strArr, null);
        }

        public final void v(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i5 = i + 1;
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus(tj1.gv.z("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2), tj1.gv.ej(str2) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING : Intrinsics.stringPlus(": ", str)).toString());
                }
                i = i5;
            }
        }

        public n3() {
        }
    }

    public static final class y {
        public final List<String> y = new ArrayList(20);

        public final z a() {
            Object[] array = this.y.toArray(new String[0]);
            if (array != null) {
                return new z((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final y c5(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i = 0;
            while (i < s().size()) {
                if (StringsKt.equals(name, s().get(i), true)) {
                    s().remove(i);
                    s().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final String fb(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int size = this.y.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (StringsKt.equals(name, this.y.get(size), true)) {
                    return this.y.get(size + 1);
                }
                if (size == progressionLastElement) {
                    return null;
                }
                size = i;
            }
        }

        public final y gv(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            s().add(name);
            s().add(StringsKt.trim(value).toString());
            return this;
        }

        public final y i9(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            n3 n3Var = z.f8056v;
            n3Var.gv(name);
            n3Var.v(value, name);
            c5(name);
            gv(name, value);
            return this;
        }

        public final y n3(z headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                gv(headers.zn(i), headers.s(i));
            }
            return this;
        }

        public final List<String> s() {
            return this.y;
        }

        public final y v(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            z.f8056v.gv(name);
            gv(name, value);
            return this;
        }

        public final y y(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            n3 n3Var = z.f8056v;
            n3Var.gv(name);
            n3Var.v(value, name);
            gv(name, value);
            return this;
        }

        public final y zn(String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) line, ':', 1, false, 4, (Object) null);
            if (iIndexOf$default != -1) {
                String strSubstring = line.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = line.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                gv(strSubstring, strSubstring2);
            } else if (line.charAt(0) == ':') {
                String strSubstring3 = line.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                gv(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, strSubstring3);
            } else {
                gv(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, line);
            }
            return this;
        }
    }

    public /* synthetic */ z(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    public static final z a(String... strArr) {
        return f8056v.s(strArr);
    }

    public final List<String> c5(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            if (StringsKt.equals(name, zn(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(s(i));
            }
            i = i5;
        }
        if (arrayList == null) {
            return CollectionsKt.emptyList();
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && Arrays.equals(this.y, ((z) obj).y);
    }

    public final Map<String, List<String>> fb() {
        TreeMap treeMap = new TreeMap(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            String strZn = zn(i);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = strZn.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(s(i));
            i = i5;
        }
        return treeMap;
    }

    public final Set<String> gv() {
        TreeSet treeSet = new TreeSet(StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(zn(i));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public int hashCode() {
        return Arrays.hashCode(this.y);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = TuplesKt.to(zn(i), s(i));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    public final Date n3(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strY = y(name);
        if (strY == null) {
            return null;
        }
        return yj1.zn.y(strY);
    }

    public final String s(int i) {
        return this.y[(i * 2) + 1];
    }

    public final int size() {
        return this.y.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i5 = i + 1;
            String strZn = zn(i);
            String strS = s(i);
            sb.append(strZn);
            sb.append(": ");
            if (tj1.gv.ej(strZn)) {
                strS = "██";
            }
            sb.append(strS);
            sb.append("\n");
            i = i5;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final y v() {
        y yVar = new y();
        CollectionsKt.addAll(yVar.s(), this.y);
        return yVar;
    }

    public final String y(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f8056v.a(this.y, name);
    }

    public final String zn(int i) {
        return this.y[i * 2];
    }

    public z(String[] strArr) {
        this.y = strArr;
    }
}

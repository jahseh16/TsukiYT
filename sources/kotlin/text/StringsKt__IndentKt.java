package kotlin.text;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class StringsKt__IndentKt extends StringsKt__AppendableKt {
    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(final String str) {
        return str.length() == 0 ? new Function1() { // from class: kotlin.text.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__IndentKt.getIndentFunction$lambda$8$StringsKt__IndentKt((String) obj);
            }
        } : new Function1() { // from class: kotlin.text.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__IndentKt.getIndentFunction$lambda$9$StringsKt__IndentKt(str, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$8$StringsKt__IndentKt(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getIndentFunction$lambda$9$StringsKt__IndentKt(String str, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        return str + line;
    }

    private static final int indentWidth$StringsKt__IndentKt(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!CharsKt__CharJVMKt.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    public static final String replaceIndent(String str, String newIndent) {
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        List<String> listLines = StringsKt.lines(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLines) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.minOrNull(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listLines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLines) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj2;
            if ((i == 0 || i == lastIndex) && StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                String strDrop = StringsKt.drop(str2, iIntValue);
                if (strDrop != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strDrop)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i5;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static final String replaceIndentByMargin(String str, String newIndent, String marginPrefix) {
        int i;
        String strInvoke;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(newIndent, "newIndent");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        if (StringsKt.isBlank(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listLines = StringsKt.lines(str);
        int length = str.length() + (newIndent.length() * listLines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(newIndent);
        int lastIndex = CollectionsKt.getLastIndex(listLines);
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : listLines) {
            int i8 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i5 == 0 || i5 == lastIndex) && StringsKt.isBlank(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!CharsKt__CharJVMKt.isWhitespace(str2.charAt(i10))) {
                        i = i10;
                        break;
                    }
                    i10++;
                }
                if (i != -1) {
                    int i11 = i;
                    if (StringsKt.startsWith$default(str2, marginPrefix, i, false, 4, null)) {
                        int length3 = i11 + marginPrefix.length();
                        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = indentFunction$StringsKt__IndentKt.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i5 = i8;
        }
        return ((StringBuilder) CollectionsKt.joinTo$default(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
    }

    public static String trimIndent(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return replaceIndent(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING);
    }

    public static final String trimMargin(String str, String marginPrefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
        return replaceIndentByMargin(str, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING, marginPrefix);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return trimMargin(str, str2);
    }
}

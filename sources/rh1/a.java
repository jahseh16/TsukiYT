package rh1;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String gv(Pair<?, ?> pair, String separator) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return pair.getFirst() + separator + pair.getSecond();
    }

    public static final String n3(List<String> list, String listSeparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(listSeparator, "listSeparator");
        if (list.size() == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
            stringBuffer.append(listSeparator);
        }
        String strSubstring = stringBuffer.substring(0, stringBuffer.length() - listSeparator.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List<Pair<String, String>> y(String str, String pairSeparator, String listSeparator) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(pairSeparator, "pairSeparator");
        Intrinsics.checkNotNullParameter(listSeparator, "listSeparator");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{listSeparator}, false, 0, 6, (Object) null);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!TextUtils.isEmpty((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (String str2 : arrayList) {
            int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str2, pairSeparator, 0, false, 6, (Object) null);
            String strSubstring = str2.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = str2.substring(iLastIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            arrayList2.add(new Pair(strSubstring, strSubstring2));
        }
        return CollectionsKt.toMutableList((Collection) arrayList2);
    }

    public static final String zn(List<? extends Pair<?, ?>> list, String pairSeparator, String listSeparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pairSeparator, "pairSeparator");
        Intrinsics.checkNotNullParameter(listSeparator, "listSeparator");
        if (list.size() == 0) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_STRING;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(gv((Pair) it.next(), pairSeparator));
            stringBuffer.append(listSeparator);
        }
        String strSubstring = stringBuffer.substring(0, stringBuffer.length() - listSeparator.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}

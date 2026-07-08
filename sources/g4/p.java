package g4;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static String gv(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> w<T> n3(w<? super T> wVar, w<? super T> wVar2) {
        return new n3(zn((w) xc.t(wVar), (w) xc.t(wVar2)), (y) null);
    }

    public static <T> List<w<? super T>> zn(w<? super T> wVar, w<? super T> wVar2) {
        return Arrays.asList(wVar, wVar2);
    }
}

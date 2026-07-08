package kotlin.text;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class StringsKt__AppendableKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void appendElement(Appendable appendable, T t3, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            appendable.append(function1.invoke(t3));
            return;
        }
        if (t3 == 0 ? true : t3 instanceof CharSequence) {
            appendable.append((CharSequence) t3);
        } else if (t3 instanceof Character) {
            appendable.append(((Character) t3).charValue());
        } else {
            appendable.append(t3.toString());
        }
    }
}
